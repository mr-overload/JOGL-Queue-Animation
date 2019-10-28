package org.yourorghere;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.GLUT;
import com.sun.opengl.util.j2d.TextRenderer;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Assignmnt.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class queue_animation implements GLEventListener {

 public static void main(String[] args) {
  Frame frame = new Frame("Simple JOGL Application");
  GLCanvas canvas = new GLCanvas();

  canvas.addGLEventListener(new Assignmnt());
  frame.add(canvas);
  frame.setSize(640, 480);
  final Animator animator = new Animator(canvas);
  frame.addWindowListener(new WindowAdapter() {

   @Override
   public void windowClosing(WindowEvent e) {
    // Run this on another thread than the AWT event queue to
    // make sure the call to Animator.stop() completes before
    // exiting DONT FORGET TO LIKE AND SUBSCRIBE
    new Thread(new Runnable() {

     public void run() {
      animator.stop();
      System.exit(0);
     }
    }).start();
   }
  });
  // Center frame
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
  animator.start();
 }

 public void init(GLAutoDrawable drawable) {
  // Use debug pipeline
  // drawable.setGL(new DebugGL(drawable.getGL()));

  GL gl = drawable.getGL();
  System.err.println("INIT GL IS: " + gl.getClass().getName());

  // Enable VSync
  gl.setSwapInterval(1);

  gl.glClearColor(0.0 f, 0.0 f, 0.0 f, 0.0 f);
  gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
 }

 public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
  GL gl = drawable.getGL();
  GLU glu = new GLU();


  if (height <= 0) { // avoid a divide by zero error!

   height = 1;
  }
  final float h = (float) width / (float) height;


  gl.glViewport(0, 0, width, height);
  gl.glMatrixMode(GL.GL_PROJECTION);
  gl.glLoadIdentity();
  glu.gluPerspective(40.0 f, h, 1.0, 20.0);
  gl.glMatrixMode(GL.GL_MODELVIEW);
  gl.glLoadIdentity();
 }

 private float x = 0 f, mr = 0 f, ml = -1.5 f, y = -1.0 f;
 private boolean togg = true;
 private int count = 1, savecount = 0;
 private String num[] = {
  1,
  2,
  3,
  4
 };
 private boolean flag = true;
 private ArrayList < Float > a1 = new ArrayList < Float > ();

 private float m = 0 f, n = 0 f, o = 0 f, p = 0 f, q = 0 f;
 private float a = -1.0 f, b = -1.0 f, c = -1.0 f, d = -1.0 f, e = -1.0 f;
 private TextRenderer textr;
 private float x1 = 1.0 f, y1 = 1.0 f;
 private float x2 = -1.0 f, y2 = 1.0 f, hh = 0.0 f;
 private String s11 = "Insert";


 public void display(GLAutoDrawable drawable) {
  GL gl = drawable.getGL();

  GLUT glut = new GLUT();

  // Clear the drawing area
  gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
  // Reset the current matrix to the "identity"


  // Draw A Quad


  gl.glClear(GL.GL_RASTERIZER_DISCARD_NV);
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, "");
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(0.0 f, 0.0 f);

  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, "");
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(0.0 f, 2.0 f);


  gl.glLoadIdentity();
  gl.glTranslatef(-1.5 f, -1.0 f + hh, -6.0 f);

  gl.glBegin(GL.GL_POLYGON);
  gl.glColor3f(0 f, 0.5 f, 1.0 f);



  gl.glVertex2f(4.1 f, -0.8 f);
  gl.glVertex2f(3.8 f, -0.8 f);
  gl.glVertex2f(4.1 f, -1 f);



  gl.glEnd();


  gl.glLoadIdentity();

  gl.glTranslatef(m, a, -6.0 f);
  gl.glBegin(GL.GL_QUADS);
  gl.glColor3f(0 f, 0.5 f, 1.0 f); // Set the current drawing color to light blue
  gl.glVertex3f(-1.0 f, -0.4 f, 0.0 f); // Top Left
  gl.glVertex3f(1.0 f, -0.4 f, 0.0 f); // Top Right
  gl.glVertex3f(1.0 f, -1.0 f, 0.0 f); // Bottom Right
  gl.glVertex3f(-1.0 f, -1.0 f, 0.0 f); // Bottom Left
  gl.glEnd();
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, s11);
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(-0.0 f, -0.7 f);



  gl.glLoadIdentity();

  gl.glTranslatef(n, b, -6.0 f);
  gl.glBegin(GL.GL_QUADS);
  gl.glColor3f(0 f, 0.5 f, 1.0 f); // Set the current drawing color to light blue
  gl.glVertex3f(-1.0 f, -0.4 f, 0.0 f); // Top Left
  gl.glVertex3f(1.0 f, -0.4 f, 0.0 f); // Top Right
  gl.glVertex3f(1.0 f, -1.0 f, 0.0 f); // Bottom Right
  gl.glVertex3f(-1.0 f, -1.0 f, 0.0 f); // Bottom Left
  gl.glEnd();
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, num[0]);
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(-0.0 f, -0.7 f);

  gl.glLoadIdentity();

  gl.glTranslatef(o, c, -6.0 f);
  gl.glBegin(GL.GL_QUADS);
  gl.glColor3f(0 f, 0.5 f, 1.0 f); // Set the current drawing color to light blue
  gl.glVertex3f(-1.0 f, -0.4 f, 0.0 f); // Top Left
  gl.glVertex3f(1.0 f, -0.4 f, 0.0 f); // Top Right
  gl.glVertex3f(1.0 f, -1.0 f, 0.0 f); // Bottom Right
  gl.glVertex3f(-1.0 f, -1.0 f, 0.0 f); // Bottom Left
  gl.glEnd();
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, num[1]);
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(-0.0 f, -0.7 f);

  gl.glLoadIdentity();

  gl.glTranslatef(p, d, -6.0 f);
  gl.glBegin(GL.GL_QUADS);
  gl.glColor3f(0 f, 0.5 f, 1.0 f); // Set the current drawing color to light blue
  gl.glVertex3f(-1.0 f, -0.4 f, 0.0 f); // Top Left
  gl.glVertex3f(1.0 f, -0.4 f, 0.0 f); // Top Right
  gl.glVertex3f(1.0 f, -1.0 f, 0.0 f); // Bottom Right
  gl.glVertex3f(-1.0 f, -1.0 f, 0.0 f); // Bottom Left
  gl.glEnd();
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, num[2]);
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(-0.0 f, -0.7 f);


  gl.glLoadIdentity();

  gl.glTranslatef(p, d, -6.0 f);
  gl.glBegin(GL.GL_QUADS);
  gl.glColor3f(0 f, 0.5 f, 1.0 f); // Set the current drawing color to light blue
  gl.glVertex3f(-1.0 f, -0.4 f, 0.0 f); // Top Left
  gl.glVertex3f(1.0 f, -0.4 f, 0.0 f); // Top Right
  gl.glVertex3f(1.0 f, -1.0 f, 0.0 f); // Bottom Right
  gl.glVertex3f(-1.0 f, -1.0 f, 0.0 f); // Bottom Left
  gl.glEnd();
  glut.glutBitmapString(GLUT.BITMAP_TIMES_ROMAN_10, num[3]);
  gl.glColor3f(1 f, 1 f, 1 f);
  gl.glRasterPos2f(-0.0 f, -0.7 f);









  // Done Drawing The Quad

  // Flush all drawing operations to the graphics card
  gl.glFlush();




  switch (count) {
   case 1:
    m += 0.05;
    if (m > 1.1 f) {
     count++;


    }
    break;
   case 2:
    n += 0.05;
    hh += 0.032 f;
    a += 0.032 f;
    if (n > 1.1 f) {
     count++;

    }
    break;
   case 3:
    o += 0.05;
    a += 0.032 f;
    hh += 0.032 f;
    b += 0.032 f;
    if (o > 1.1 f) {
     count++;
     a1.add(x);
     x = -1.5 f;
    };
    break;
   case 4:
    p += 0.05;
    a += 0.032 f;
    hh += 0.032 f;
    b += 0.032 f;
    c += 0.032 f;
    if (p > 1.1 f) {
     count++;
     s11 = "Pop";
    }
    break;
   case 5:

    m -= 0.05;
    if (m < -1.1) {
     m += 0.05;
     hh -= 0.032 f;


     if (hh < 1.5 f) {
      count++;
     }
     s1 = a;
    }
    break;
   case 6:

    n -= 0.05;
    if (n < -1.1) {
     n += 0.05;
     hh -= 0.032 f;


     if (hh < 0.7 f) {
      count++;
     }
     s1 = a;
    }
    break;
   case 7:

    o -= 0.05;
    if (o < -1.1) {
     o += 0.05;
     hh -= 0.032 f;


     if (hh < 0.3 f) {
      count++;
     }
     s1 = a;
    }
    break;

   case 8:

    p -= 0.05;

    System.out.println(hh);
    if (p < -1.1) {
     p += 0.05;
     hh -= 0.032 f;


     count++;
     s11 = "Poped";
     s1 = a;
    }
    break;
  }



 }
 private float s1 = 0.0 f;

 public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
}

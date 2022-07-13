/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vortexpackage;
import java.awt.AWTException;
import javax.swing.Timer;
import java.awt.event.*;
import java.awt.Robot;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author adrian
 */
public class VortexInterface extends javax.swing.JFrame {
    
    static String text;
    static String output;
    static int reps;
    static int speed;
    static int delay;
    static boolean enter = false;
    int mousepx;
    int mousepy;
    static int len;
    static String displayText;
    
    Timer t = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if(delay > 0) {
                outputBox.setText("<html>Typing text in " + delay + " seconds.<br/>Text: \"" + displayText + "\"<br/>Repeating " + String.valueOf(reps) + " times, at set speed: " + String.valueOf(speed) + "<br/>With enters set to: " + enter + "</html>");
                delay--;
            }
            else {
                outputBox.setText("<html>Process Completed<br/>Text: \"" + displayText + "\"<br/>Repeated " + String.valueOf(reps) + " times, at set speed: " + String.valueOf(speed) + "<br/>With enters set to: " + enter + "</html>");
                if (delay == 0) {
                    try {
                        type(text);
                    } catch (AWTException ex) {
                        Logger.getLogger(VortexInterface.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                t.stop();
            }
        }
    });
    /**
     * Creates new form VortexInterface
     * @throws java.awt.AWTException
     */
    public VortexInterface() {
        initComponents();
        
        textInput.setBackground(new java.awt.Color(0, 0, 0, 1));
        repsInput.setBackground(new java.awt.Color(0, 0, 0, 1));
        delayInput.setBackground(new java.awt.Color(0, 0, 0, 1));
    }
    
    public static void type(String t) throws AWTException {
        Robot r = new Robot();
        len = t.length();
        for (int i = 0; i < reps; i++) {
            for (int k = 0; k < len; k++) {
                typec(t.charAt(k));
                r.delay(1000 - (speed * 10));
            }
            if (enter) {
                r.keyPress(KeyEvent.VK_ENTER);
            }
        }
    }
    
    public static void typec(char c) throws AWTException {
        switch (c) {
        case 'a': doType(KeyEvent.VK_A); break;
        case 'b': doType(KeyEvent.VK_B); break;
        case 'c': doType(KeyEvent.VK_C); break;
        case 'd': doType(KeyEvent.VK_D); break;
        case 'e': doType(KeyEvent.VK_E); break;
        case 'f': doType(KeyEvent.VK_F); break;
        case 'g': doType(KeyEvent.VK_G); break;
        case 'h': doType(KeyEvent.VK_H); break;
        case 'i': doType(KeyEvent.VK_I); break;
        case 'j': doType(KeyEvent.VK_J); break;
        case 'k': doType(KeyEvent.VK_K); break;
        case 'l': doType(KeyEvent.VK_L); break;
        case 'm': doType(KeyEvent.VK_M); break;
        case 'n': doType(KeyEvent.VK_N); break;
        case 'o': doType(KeyEvent.VK_O); break;
        case 'p': doType(KeyEvent.VK_P); break;
        case 'q': doType(KeyEvent.VK_Q); break;
        case 'r': doType(KeyEvent.VK_R); break;
        case 's': doType(KeyEvent.VK_S); break;
        case 't': doType(KeyEvent.VK_T); break;
        case 'u': doType(KeyEvent.VK_U); break;
        case 'v': doType(KeyEvent.VK_V); break;
        case 'w': doType(KeyEvent.VK_W); break;
        case 'x': doType(KeyEvent.VK_X); break;
        case 'y': doType(KeyEvent.VK_Y); break;
        case 'z': doType(KeyEvent.VK_Z); break;
        case 'A': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A); break;
        case 'B': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B); break;
        case 'C': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C); break;
        case 'D': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D); break;
        case 'E': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E); break;
        case 'F': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F); break;
        case 'G': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G); break;
        case 'H': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H); break;
        case 'I': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I); break;
        case 'J': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J); break;
        case 'K': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K); break;
        case 'L': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L); break;
        case 'M': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M); break;
        case 'N': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N); break;
        case 'O': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O); break;
        case 'P': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P); break;
        case 'Q': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q); break;
        case 'R': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R); break;
        case 'S': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S); break;
        case 'T': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T); break;
        case 'U': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U); break;
        case 'V': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V); break;
        case 'W': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W); break;
        case 'X': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X); break;
        case 'Y': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y); break;
        case 'Z': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z); break;
        case '`': doType(KeyEvent.VK_BACK_QUOTE); break;
        case '0': doType(KeyEvent.VK_0); break;
        case '1': doType(KeyEvent.VK_1); break;
        case '2': doType(KeyEvent.VK_2); break;
        case '3': doType(KeyEvent.VK_3); break;
        case '4': doType(KeyEvent.VK_4); break;
        case '5': doType(KeyEvent.VK_5); break;
        case '6': doType(KeyEvent.VK_6); break;
        case '7': doType(KeyEvent.VK_7); break;
        case '8': doType(KeyEvent.VK_8); break;
        case '9': doType(KeyEvent.VK_9); break;
        case '-': doType(KeyEvent.VK_MINUS); break;
        case '=': doType(KeyEvent.VK_EQUALS); break;
        case '~': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE); break;
        case '!': doType(KeyEvent.VK_EXCLAMATION_MARK); break;
        case '@': doType(KeyEvent.VK_AT); break;
        case '#': doType(KeyEvent.VK_NUMBER_SIGN); break;
        case '$': doType(KeyEvent.VK_DOLLAR); break;
        case '%': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5); break;
        case '^': doType(KeyEvent.VK_CIRCUMFLEX); break;
        case '&': doType(KeyEvent.VK_AMPERSAND); break;
        case '*': doType(KeyEvent.VK_ASTERISK); break;
        case '(': doType(KeyEvent.VK_LEFT_PARENTHESIS); break;
        case ')': doType(KeyEvent.VK_RIGHT_PARENTHESIS); break;
        case '_': doType(KeyEvent.VK_UNDERSCORE); break;
        case '+': doType(KeyEvent.VK_PLUS); break;
        case '\t': doType(KeyEvent.VK_TAB); break;
        case '\n': doType(KeyEvent.VK_ENTER); break;
        case '[': doType(KeyEvent.VK_OPEN_BRACKET); break;
        case ']': doType(KeyEvent.VK_CLOSE_BRACKET); break;
        case '\\': doType(KeyEvent.VK_BACK_SLASH); break;
        case '{': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET); break;
        case '}': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET); break;
        case '|': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH); break;
        case ';': doType(KeyEvent.VK_SEMICOLON); break;
        case ':': doType(KeyEvent.VK_COLON); break;
        case '\'': doType(KeyEvent.VK_QUOTE); break;
        case '"': doType(KeyEvent.VK_QUOTEDBL); break;
        case ',': doType(KeyEvent.VK_COMMA); break;
        case '<': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA); break;
        case '.': doType(KeyEvent.VK_PERIOD); break;
        case '>': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD); break;
        case '/': doType(KeyEvent.VK_SLASH); break;
        case '?': doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH); break;
        case ' ': doType(KeyEvent.VK_SPACE); break;
        default:
            throw new IllegalArgumentException("\'" + c + "\' cannot be typed");
        }
    }
    
    public static void doType(int... keyCodes) throws AWTException {
        doType(keyCodes, 0, keyCodes.length);
    }

    public static void doType(int[] keyCodes, int offset, int length) throws AWTException {
        Robot r = new Robot();
        if (length == 0) {
            return;
        }
        
        r.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1);
        r.keyRelease(keyCodes[offset]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        repsInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        speedSlider = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        delayInput = new javax.swing.JTextField();
        runButton = new com.k33ptoo.components.KButton();
        jLabel10 = new javax.swing.JLabel();
        outputBox = new javax.swing.JLabel();
        closeButton = new com.k33ptoo.components.KButton();
        jLabel11 = new javax.swing.JLabel();
        enterCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 91, 156));
        kGradientPanel1.setkGradientFocus(-150);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 193, 109));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(800, 500));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("PingFang TC", 1, 35)); // NOI18N
        jLabel1.setText("Vortex");

        jLabel2.setFont(new java.awt.Font("PingFang TC", 0, 12)); // NOI18N
        jLabel2.setText("Keyboard Macro");

        jLabel3.setFont(new java.awt.Font("PingFang TC", 1, 12)); // NOI18N
        jLabel3.setText("Developed By Adrian Simon");

        jLabel4.setFont(new java.awt.Font("PingFang TC", 0, 16)); // NOI18N
        jLabel4.setText("Text:");

        textInput.setFont(new java.awt.Font("PingFang TC", 0, 15)); // NOI18N
        textInput.setText("Enter Macro Text Here");
        textInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        textInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInputActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("PingFang TC", 0, 16)); // NOI18N
        jLabel5.setText("Repetitions:");

        repsInput.setFont(new java.awt.Font("PingFang TC", 0, 15)); // NOI18N
        repsInput.setText("Enter Number of Times Macro Types Text");
        repsInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        repsInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repsInputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("PingFang TC", 0, 16)); // NOI18N
        jLabel6.setText("Typing Speed:");

        jLabel7.setFont(new java.awt.Font("PingFang TC", 0, 12)); // NOI18N
        jLabel7.setText("0 (Slow)");

        jLabel8.setFont(new java.awt.Font("PingFang TC", 0, 12)); // NOI18N
        jLabel8.setText("100 (Fast)");

        jLabel9.setFont(new java.awt.Font("PingFang TC", 0, 16)); // NOI18N
        jLabel9.setText("Delay:");

        delayInput.setFont(new java.awt.Font("PingFang TC", 0, 15)); // NOI18N
        delayInput.setText("Enter Delay (in seconds) Before Macro Runs");
        delayInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        delayInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delayInputActionPerformed(evt);
            }
        });

        runButton.setBackground(new java.awt.Color(0, 0, 0));
        runButton.setText("Run");
        runButton.setToolTipText("");
        runButton.setFont(new java.awt.Font("PingFang TC", 1, 24)); // NOI18N
        runButton.setkBorderRadius(50);
        runButton.setkEndColor(new java.awt.Color(0, 153, 153));
        runButton.setkFillButton(false);
        runButton.setkHoverEndColor(new java.awt.Color(0, 153, 51));
        runButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        runButton.setkHoverStartColor(new java.awt.Color(51, 255, 102));
        runButton.setkPressedColor(new java.awt.Color(0, 0, 255));
        runButton.setkStartColor(new java.awt.Color(0, 255, 204));
        runButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                runButtonMousePressed(evt);
            }
        });
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("PingFang TC", 1, 16)); // NOI18N
        jLabel10.setText("Output:");

        outputBox.setFont(new java.awt.Font("PingFang TC", 1, 16)); // NOI18N
        outputBox.setText("-");
        outputBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        closeButton.setBackground(new java.awt.Color(0, 0, 0));
        closeButton.setForeground(new java.awt.Color(0, 0, 0));
        closeButton.setText("X");
        closeButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        closeButton.setkBorderRadius(30);
        closeButton.setkEndColor(new java.awt.Color(0, 0, 0));
        closeButton.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        closeButton.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        closeButton.setkHoverStartColor(new java.awt.Color(255, 102, 102));
        closeButton.setkPressedColor(new java.awt.Color(0, 204, 204));
        closeButton.setkStartColor(new java.awt.Color(51, 51, 51));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeButtonMousePressed(evt);
            }
        });
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("PingFang TC", 0, 16)); // NOI18N
        jLabel11.setText("Press Enter:");

        enterCheck.setPreferredSize(new java.awt.Dimension(30, 30));
        enterCheck.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                enterCheckStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(306, 306, 306)
                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(outputBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repsInput)
                            .addComponent(textInput)
                            .addComponent(speedSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delayInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enterCheck, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(532, 532, 532)
                                .addComponent(jLabel8)))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(repsInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(speedSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(delayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13)
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        mousepx = evt.getX();
        mousepy = evt.getY();
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        int cordX = evt.getXOnScreen();
        int cordY = evt.getYOnScreen();

        this.setLocation(cordX - mousepx, cordY - mousepy);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void enterCheckStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_enterCheckStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_enterCheckStateChanged

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void closeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMousePressed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runButtonActionPerformed

    private void runButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_runButtonMousePressed
        // TODO add your handling code here:
        try {
            text = textInput.getText();
            reps = Integer.parseInt(repsInput.getText());
            speed = speedSlider.getValue();
            delay = Integer.parseInt(delayInput.getText());
            enter = enterCheck.isSelected();
            if (text.length() > 40) {
                displayText = text.substring(0, 39) + "...";
            }
            else {
                displayText = text;
            }
            outputBox.setText("<html>Typing text in " + delay + " seconds.<br/>Text: \"" + displayText + "\"<br/>Repeating " + String.valueOf(reps) + " times, at set speed: " + String.valueOf(speed) + "<br/>With enters set to: " + enter + "</html>");
            t.start();
        }
        catch(NumberFormatException e) {
            outputBox.setText("Error - Incorrect Value Entered");
        }
    }//GEN-LAST:event_runButtonMousePressed

    private void delayInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delayInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delayInputActionPerformed

    private void repsInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repsInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repsInputActionPerformed

    private void textInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInputActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VortexInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VortexInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VortexInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VortexInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VortexInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton closeButton;
    private javax.swing.JTextField delayInput;
    private javax.swing.JCheckBox enterCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel outputBox;
    private javax.swing.JTextField repsInput;
    private com.k33ptoo.components.KButton runButton;
    private javax.swing.JSlider speedSlider;
    private javax.swing.JTextField textInput;
    // End of variables declaration//GEN-END:variables
}

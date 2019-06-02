package VectorDesign;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import java.awt.Dimension;

import VectorDesign.VectorTools.Tools;


/**
 * GUI class containing all GUI elements, excluding canvas.
 * @author James Hassett, Darren Gebler
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonPlot = new javax.swing.JButton();
        buttonLine = new javax.swing.JButton();
        buttonRectangle = new javax.swing.JButton();
        buttonEllipse = new javax.swing.JButton();
        buttonPolygon = new javax.swing.JButton();
        buttonLineCol = new javax.swing.JButton();
        buttonFillClear = new javax.swing.JButton();
        buttonFillCol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        canvasContainer = new javax.swing.JPanel();
        vectorCanvas = new CanvasDrawing(this);
        topMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        menuNew = new javax.swing.JMenuItem();
        menuOpen = new javax.swing.JMenuItem();
        // menuSave = new javax.swing.JMenuItem();
        menuSaveAs = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        menuUndo = new javax.swing.JMenuItem();
        menuRedo = new javax.swing.JMenuItem();
        menuHistory = new javax.swing.JMenuItem();

        getContentPane().setPreferredSize(new Dimension(680,530));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Painter");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 450));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        buttonPlot.setText("Plot");
        buttonPlot.setToolTipText("Click to plot a single point on the canvas");
        buttonPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlotActionPerformed(evt);
            }
        });

        buttonLine.setText("Line");
        buttonLine.setToolTipText("Click and drag to draw a straight line on the canvas");
        buttonLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLineActionPerformed(evt);
            }
        });

        buttonRectangle.setText("Rectangle");
        buttonRectangle.setToolTipText("Click and drag to draw a rectangle on the canvas");
        buttonRectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRectangleActionPerformed(evt);
            }
        });

        buttonEllipse.setText("Ellipse");
        buttonEllipse.setToolTipText("Click and drag to draw an ellipse on the canvas");
        buttonEllipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEllipseActionPerformed(evt);
            }
        });

        buttonPolygon.setText("Polygon");
        buttonPolygon.setToolTipText("Click the begin drawing a polygon on the canvas, click near the start to finish");
        buttonPolygon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPolygonActionPerformed(evt);
            }
        });

        buttonLineCol.setBackground(new java.awt.Color(0, 0, 0));
        buttonLineCol.setText("Line");
        buttonLineCol.setToolTipText("Set the line colour");
        buttonLineCol.setFocusable(false);
        buttonLineCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLineColActionPerformed(evt);
            }
        });

        buttonFillClear.setText("Clear Fill");
        buttonFillClear.setToolTipText("Clear the fill colour");
        buttonFillClear.setFocusable(false);
        buttonFillClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFillClearActionPerformed(evt);
            }
        });

        buttonFillCol.setText("Fill");
        buttonFillCol.setToolTipText("Set the fill colour");
        buttonFillCol.setFocusable(false);
        buttonFillCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFillColActionPerformed(evt);
            }
        });

        jLabel1.setText("Colour");

        jLabel2.setText("Drawing");

        canvasContainer.setBackground(new java.awt.Color(204, 204, 204));
        canvasContainer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout vectorCanvasLayout = new javax.swing.GroupLayout(vectorCanvas);
        vectorCanvas.setLayout(vectorCanvasLayout);
        vectorCanvasLayout.setHorizontalGroup(
                vectorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        vectorCanvasLayout.setVerticalGroup(
                vectorCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout canvasContainerLayout = new javax.swing.GroupLayout(canvasContainer);
        canvasContainer.setLayout(canvasContainerLayout);
        canvasContainerLayout.setHorizontalGroup(
                canvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(canvasContainerLayout.createSequentialGroup()
                                .addComponent(vectorCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 388, Short.MAX_VALUE))
        );
        canvasContainerLayout.setVerticalGroup(
                canvasContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(canvasContainerLayout.createSequentialGroup()
                                .addComponent(vectorCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        menuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNew.setText("New...");
        menuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNewActionPerformed(evt);
            }
        });
        fileMenu.add(menuNew);

        menuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuOpen.setText("Open...");
        menuOpen.setInheritsPopupMenu(true);
        menuOpen.setPreferredSize(new java.awt.Dimension(190, 26));
        menuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenActionPerformed(evt);
            }
        });
        fileMenu.add(menuOpen);

        /*
        OLD SAVE OPTION

        menuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSave.setText("Save");
        menuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveActionPerformed(evt);
            }
        });
        fileMenu.add(menuSave);
        */

        menuSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuSaveAs.setText("Save As...");
        menuSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSaveAsActionPerformed(evt);
            }
        });
        fileMenu.add(menuSaveAs);

        topMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        menuUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        menuUndo.setText("Undo");
        menuUndo.setPreferredSize(new java.awt.Dimension(150, 26));
        menuUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUndoActionPerformed(evt);
            }
        });
        editMenu.add(menuUndo);

        menuRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        menuRedo.setText("Redo");
        menuRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRedoActionPerformed(evt);
            }
        });
        editMenu.add(menuRedo);

        menuHistory.setText("History...");
        menuHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoryActionPerformed(evt);
            }
        });
        editMenu.add(menuHistory);

        topMenuBar.add(editMenu);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonPlot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonEllipse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPolygon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonFillClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(buttonLineCol, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(buttonFillCol, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(2, 2, 2)
                                                .addComponent(jSeparator2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(canvasContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonLine, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonRectangle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonEllipse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonPolygon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(buttonFillCol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonLineCol, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(buttonFillClear))
                                        .addComponent(canvasContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    /* Drawing tool button listeners */

    /**
     * Set tool to PLOT when button pressed
     * @param evt click event
     */
    private void buttonPlotActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.setTool(Tools.PLOT);
    }

    /**
     * Set tool to LINE when button pressed
     * @param evt click event
     */
    private void buttonLineActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.setTool(Tools.LINE);
    }

    /**
     * Set tool to RECTANGLE when button pressed
     * @param evt click event
     */
    private void buttonRectangleActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.setTool(Tools.RECTANGLE);
    }

    /**
     * Set tool to ELLIPSE when button pressed
     * @param evt click event
     */
    private void buttonEllipseActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.setTool(Tools.ELLIPSE);
    }

    /**
     * Set tool to POLYGON when button pressed
     * @param evt click event
     */
    private void buttonPolygonActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.setTool(Tools.POLYGON);
    }

    /* Color tool button listeners */

    /**
     * Listen for button press, show a color picker dialog and save line color selection
     * @param evt click event
     */
    private void buttonLineColActionPerformed(java.awt.event.ActionEvent evt) {
        Color colorSelection = JColorChooser.showDialog(null, "Select line colour", lineColor);
        if (colorSelection != null) {
            lineColor = colorSelection;
            vectorCanvas.setLineColor(lineColor);
        }

        buttonLineCol.setBackground(lineColor);
    }

    /**
     * Listen for button press, show a color picker dialog and save fill color selection
     * @param evt click event
     */
    private void buttonFillColActionPerformed(java.awt.event.ActionEvent evt) {
        Color colorSelection = JColorChooser.showDialog(null, "Select fill colour", fillColor);
        if (colorSelection != null) {
            fillColor = colorSelection;
            vectorCanvas.setFillColor(fillColor);
        }

        buttonFillCol.setBackground(fillColor);
    }

    /**
     * Listen for button press and clear fill color
     * @param evt click event
     */
    private void buttonFillClearActionPerformed(java.awt.event.ActionEvent evt) {
        fillColor = null;
        buttonFillCol.setBackground(fillColor);
        vectorCanvas.setFillColor(fillColor);
    }

    /* Menu option button listeners */

    /**
     * Listen for button press and clear canvas upon confirmation
     * @param evt click event
     */
    private void menuNewActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmResult = JOptionPane.showConfirmDialog(getContentPane(), "Are you sure you wish to clear the canvas?", "Clear the canvas...", JOptionPane.YES_NO_OPTION);

        if (confirmResult == 0) {
            vectorCanvas.canvasClear();
        }
    }

    /**
     * Listen for button press and open file when prompted
     * @param evt click event
     */
    private void menuOpenActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Vector (*.vec)", "vec"));

        if (fileChooser.showOpenDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
            vectorCanvas.openFile(fileChooser.getSelectedFile().getPath());
        }
    }

    /**
     * Listen for button press and save current canvas to file
     * Allows user to choose file format
     * @param evt click event
     */
    private void menuSaveAsActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();

        // Allow user to specify file type
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Vector (*.vec)", "vec"));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Plain text (*.txt)", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false);

        if (fileChooser.showSaveDialog(getContentPane()) == JFileChooser.APPROVE_OPTION) {
            // Get selected file type
            FileNameExtensionFilter fileType = (FileNameExtensionFilter) fileChooser.getFileFilter();
            String extension;

            // If file does not have a valid extension add one
            if (!fileChooser.getSelectedFile().getName().contains(".vec")
                    && !fileChooser.getSelectedFile().getName().contains(".txt")) {
                if (fileType.getExtensions()[0] == "vec") {
                    extension = ".vec";
                } else {
                    extension = ".txt";
                }
            } else {
                extension = "";
            }

            // Save file
            vectorCanvas.saveFile(fileChooser.getSelectedFile().getPath() + extension);
        }
    }

    /**
     * Listen for button press and undo last drawing action on event
     * @param evt click event
     */
    private void menuUndoActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.undo();
    }

    /**
     * Listen for button press and redo last undo action on event
     * @param evt click event
     */
    private void menuRedoActionPerformed(java.awt.event.ActionEvent evt) {
        vectorCanvas.redo();
    }

    /**
     * Listen for button press and opens history popup on event
     * @param evt click event
     */
    private void menuHistoryActionPerformed(java.awt.event.ActionEvent evt) {
        // Make a backup of the canvas
        vectorCanvas.backupCanvas();

        // Create the dialog
        JDialog historyDialog = new UndoGUI(vectorCanvas);

        // Position the dialog inside the parent frame
        historyDialog.setLocationRelativeTo(getContentPane());

        // Show the dialog
        historyDialog.setVisible(true);
    }

    /**
     * Listen for canvas resizing and make sure drawing canvas maintains aspect ratio 1:1
     * @param evt resize event
     */
    private void formComponentResized(java.awt.event.ComponentEvent evt) {
        vectorCanvas.canvasResize(canvasContainer.getSize());
    }


    // Variables declaration
    private javax.swing.JButton buttonEllipse;
    private javax.swing.JButton buttonFillClear;
    private javax.swing.JButton buttonFillCol;
    private javax.swing.JButton buttonLine;
    private javax.swing.JButton buttonLineCol;
    private javax.swing.JButton buttonPlot;
    private javax.swing.JButton buttonPolygon;
    private javax.swing.JButton buttonRectangle;
    private javax.swing.JPanel canvasContainer;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem menuNew;
    private javax.swing.JMenuItem menuOpen;
    private javax.swing.JMenuItem menuRedo;
    private javax.swing.JMenuItem menuHistory;
    // private javax.swing.JMenuItem menuSave;
    private javax.swing.JMenuItem menuSaveAs;
    private javax.swing.JMenuItem menuUndo;
    private javax.swing.JMenuBar topMenuBar;

    public CanvasDrawing vectorCanvas;
    private Color lineColor = new Color(0, 0, 0);
    private Color fillColor = null;
}

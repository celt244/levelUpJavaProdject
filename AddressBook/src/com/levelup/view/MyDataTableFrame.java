package com.levelup.view;

import javax.swing.*;
import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by MoyaKurochka on 12.01.2017.
 */
public class MyDataTableFrame {

    public MyDataTableFrame() {
        init();
    }

    private void init() {

        Container container = getContentPane();
        TabbedPane tabbedPane = new TabbedPane();
        container.add(tabbedPane, BorderLayout.CENTER);
        container.add(new ToolPanel(tabbedPane), BorderLayout.PAGE_END);
        setVisible(true);
        setBounds(0, 0, 800, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

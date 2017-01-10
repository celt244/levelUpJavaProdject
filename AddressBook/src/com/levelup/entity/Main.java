package com.levelup.entity;

import com.levelup.view.CitizenTableModelContainer;
import com.levelup.view.impl.CitizenTablePanel;
import com.levelup.view.impl.CreateCitizenDialog;

import javax.swing.*;

/**
 * Created by java on 10.01.2017.
 */
public class Main {

    public static void main(String[] args) {
//        CreateCitizenDialog dialog = new CreateCitizenDialog();
//        dialog.setVisible(true);
//
//       if( dialog.isOkPressed())System.out.println(dialog.getEntity());

       JFrame frame= new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CitizenTablePanel panel = new CitizenTablePanel();

        frame.add(panel);
        frame.setVisible(true);

    }
}

package hu.sourceSCOde;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListener implements ActionListener {

    private final Calculator calculator;

    public EventListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String currentText = calculator.getTextField().getText();
        boolean isContainsOperator = currentText.contains(" + ") || currentText.contains(" - ") || currentText.contains(" * ") || currentText.contains(" / ");

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == calculator.getNumberButtons()[i]) {
                System.out.println(currentText);
                if (!calculator.getTextField().getText().contains(" ")) {
                    calculator.getTextField().setText(calculator.getTextField().getText().concat(String.valueOf(i)));
                } else {
                    if (currentText.charAt(currentText.length() - 1) == '.') {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(String.valueOf(i)));
                    } else if (!Utils.isOperator(Character.toString(currentText.charAt(currentText.length() - 1)))) {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(String.valueOf(i)));
                    } else {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(" " + i));
                    }
                }
            }
        }
        if (e.getSource() == calculator.getDecButton()) {
            if ((currentText.length() >= 1)) {
                if (Utils.lastCharIsDigit(currentText)) {
                    if (!isContainsOperator) {
                        if (!currentText.contains(".")) {
                            calculator.getTextField().setText(calculator.getTextField().getText().concat("."));
                        }
                    } else {
                        //TODO
                        String[] tempArray = currentText.split(Utils.getOperator(calculator.getOperator()));
                        if (!tempArray[1].contains(".")) {
                            calculator.getTextField().setText(calculator.getTextField().getText().concat("."));
                        }
                    }
                }
            } else {
                if (calculator.getTextField().getText().length() < 1) {
                    calculator.getTextField().setText(calculator.getTextField().getText().concat("0."));
                }
            }
        }

        if (e.getSource() == calculator.getAddButton()) {
            if ((currentText.length() >= 1)) {
                if (isContainsOperator) {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(Utils.calculateFromString(currentText) + " +");
                        calculator.setOperator('+');
                    }
                } else {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(" +"));
                        calculator.setOperator('+');
                    }
                }
            } else {
                calculator.getTextField().setText(calculator.getTextField().getText().concat("0 +"));
                calculator.setOperator('+');
            }
        }
        if (e.getSource() == calculator.getSubButton()) {
            if ((currentText.length() >= 1)) {
                if (isContainsOperator) {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(Utils.calculateFromString(currentText) + " -");
                        calculator.setOperator('-');
                    }
                } else {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(" -"));
                        calculator.setOperator('-');
                    }
                }
            } else {
                calculator.getTextField().setText(calculator.getTextField().getText().concat("0 -"));
                calculator.setOperator('-');
            }
        }
        if (e.getSource() == calculator.getMulButton()) {
            if ((currentText.length() >= 1)) {
                if (isContainsOperator) {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(Utils.calculateFromString(currentText) + " *");
                        calculator.setOperator('*');
                    }
                } else {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(" *"));
                        calculator.setOperator('*');
                    }
                }
            } else {
                calculator.getTextField().setText(calculator.getTextField().getText().concat("0 *"));
                calculator.setOperator('*');
            }
        }
        if (e.getSource() == calculator.getDivButton()) {
            if ((currentText.length() >= 1)) {
                if (isContainsOperator) {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(Utils.calculateFromString(currentText) + " /");
                        calculator.setOperator('/');
                    }
                } else {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(calculator.getTextField().getText().concat(" /"));
                        calculator.setOperator('/');
                    }
                }
            } else {
                calculator.getTextField().setText(calculator.getTextField().getText().concat("0 /"));
                calculator.setOperator('/');
            }
        }
        if (e.getSource() == calculator.getEquButton()) {
            if ((currentText.length() >= 1)) {
                if (isContainsOperator) {
                    if (Utils.lastCharIsDigit(currentText)) {
                        calculator.getTextField().setText(Double.toString(Utils.calculateFromString(currentText)));
                    }
                }
            }
        }
        //TODO
        if (e.getSource() == calculator.getClrButton()) {
            calculator.setTextField("");
        }
        if (e.getSource() == calculator.getDelButton()) {
            String string = calculator.getTextField().getText();
            calculator.setTextField("");
            for (int i = 0; i < string.length() - 1; i++) {
                calculator.setTextField(calculator.getTextField().getText() + string.charAt(i));
            }
        }
        if (e.getSource() == calculator.getNegButton()) {
            if ((currentText.length() >= 1)) {
                if (Utils.lastCharIsDigit(currentText)) {
                    if (!isContainsOperator) {
                        if (!currentText.contains("-")) {
                            calculator.getTextField().setText("-" + calculator.getTextField().getText());
                        }
                    } else {
                        //TODO
                        String[] tempArray = currentText.split(Utils.getOperator(calculator.getOperator()) + " ");
                        if (!tempArray[1].contains("-")) {
                            calculator.getTextField().setText(tempArray[0] + calculator.getOperator() + " -" + tempArray[1]);
                        }
                    }
                }

            }

        }

    }


}

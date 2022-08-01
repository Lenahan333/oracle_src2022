package Items;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BasketMethod {

	public BasketMethod() {
	}

	public JButton getplusbutton(int num, JLabel j) {

		JButton plusCount = new JButton();
		ImageIcon i = new ImageIcon("업버튼.png");
		plusCount = new JButton(i);

		
		plusCount.setBorderPainted(false);
		if (num == 1) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count1 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
					} else {
						MyItem.count1 += 1;
						j.setText(Integer.toString(MyItem.count1));
					}
				}
			});

		} else if (num == 2) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count2 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
					} else {
						MyItem.count2 += 1;
						j.setText(String.valueOf(MyItem.count2));
					}
				}
			});
		} else if (num == 3) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count3 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
					} else {
						MyItem.count3 += 1;
						j.setText(String.valueOf(MyItem.count3));
					}
				}
			});
		} else if (num == 4) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count4 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
					} else {
						MyItem.count4 += 1;
						j.setText(String.valueOf(MyItem.count4));
					}
				}
			});
		}else if (num == 5) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count5 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
					} else {
						MyItem.count5 += 1;
						j.setText(String.valueOf(MyItem.count5));
					}
				}
			});
		}
		return plusCount;

	}// getplusbutton

	public JButton getminusbutton(int num, JLabel j) {
		JButton MinusCount = new JButton();
		ImageIcon i = new ImageIcon("다운버튼.png");
		MinusCount = new JButton(i);
		
		
		MinusCount.setBorderPainted(false);
		if (num == 1) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count1 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
					} else {
						MyItem.count1 -= 1;
						j.setText(String.valueOf(MyItem.count1));
					}
				}
			});
		} else if (num == 2) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count2 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
					} else {
						MyItem.count2 -= 1;
						j.setText(String.valueOf(MyItem.count2));
					}
				}
			});

		} else if (num == 3) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count3 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
					} else {
						MyItem.count3 -= 1;
						j.setText(String.valueOf(MyItem.count3));
					}
				}
			});
		} else if (num == 4) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count4 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
					} else {
						MyItem.count4 -= 1;
						j.setText(String.valueOf(MyItem.count4));
					}
				}
			});
			
		}else if (num == 5) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyItem.count5 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
					} else {
						MyItem.count5 -= 1;
						j.setText(String.valueOf(MyItem.count5));
					}
				}
			});
		}
		return MinusCount;
	}

	public JLabel getCountLabel() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		JLabel j = new JLabel("1",JLabel.CENTER);
		j.setFont(f);
		return j;
	}

	public JButton getbuyButton(int num, JLabel j, ArrayList<Item> it) {
		ImageIcon bas = new ImageIcon("담기버튼.png");
		JButton btnBuy = new JButton(bas);

		btnBuy.setToolTipText("장바구니에 담습니다");
		if (num == 1) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyItem.buylist.isEmpty()) {
						it.get(num - 1).setCount(MyItem.count1);
						MyItem.add(it.get(num - 1));
						MyItem.count1 = 1;
						j.setText(String.valueOf(MyItem.count1));
					} else if (!MyItem.buylist.isEmpty()) {
						for (int i = 0; i < MyItem.buylist.size(); i++) {
							if (MyItem.buylist.get(i).getName().equals(it.get(num - 1).getName())) {
								MyItem.buylist.get(i).setCount(MyItem.count1);
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
								MyItem.count1 = 1;
								j.setText(String.valueOf(MyItem.count1));
								break;
							}
						} if (!MyItem.buylist.contains(it.get(num - 1))) {
								it.get(num - 1).setCount(MyItem.count1);
								MyItem.add(it.get(num - 1));
								MyItem.count1 = 1;
								j.setText(String.valueOf(MyItem.count1));
							}
						 
					}
				}
				
			});
		} else if (num == 2) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyItem.buylist.isEmpty()) {
						it.get(num - 1).setCount(MyItem.count2);
						MyItem.add(it.get(num - 1));
						MyItem.count2 = 1;
						j.setText(String.valueOf(MyItem.count2));
					} else if (!MyItem.buylist.isEmpty()) {
						for (int i = 0; i < MyItem.buylist.size(); i++) {
							if (MyItem.buylist.get(i).getName().equals(it.get(num - 1).getName())) {
								MyItem.buylist.get(i).setCount(MyItem.count2);
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
								MyItem.count2 = 1;
								j.setText(String.valueOf(MyItem.count2));
							}
						} if (!MyItem.buylist.contains(it.get(num - 1))) {
								it.get(num - 1).setCount(MyItem.count2);
								MyItem.add(it.get(num - 1));
								MyItem.count2 = 1;
								j.setText(String.valueOf(MyItem.count2));
							}
						 
					}
				}
				
			});
		} else if (num == 3) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyItem.buylist.isEmpty()) {
						it.get(num - 1).setCount(MyItem.count3);
						MyItem.add(it.get(num - 1));
						MyItem.count3 = 1;
						j.setText(String.valueOf(MyItem.count3));
					} else if (!MyItem.buylist.isEmpty()) {
						for (int i = 0; i < MyItem.buylist.size(); i++) {
							if (MyItem.buylist.get(i).getName().equals(it.get(num - 1).getName())) {
								MyItem.buylist.get(i).setCount(MyItem.count3);
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
								MyItem.count3 = 1;
								j.setText(String.valueOf(MyItem.count3));
							}
						} if (!MyItem.buylist.contains(it.get(num - 1))) {
								it.get(num - 1).setCount(MyItem.count3);
								MyItem.add(it.get(num - 1));
								MyItem.count3 = 1;
								j.setText(String.valueOf(MyItem.count3));
							}
						 
					}
				}
				
			});
		} else if (num == 4) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyItem.buylist.isEmpty()) {
						it.get(num - 1).setCount(MyItem.count4);
						MyItem.add(it.get(num - 1));
						MyItem.count4 = 1;
						j.setText(String.valueOf(MyItem.count4));
					} else if (!MyItem.buylist.isEmpty()) {
						for (int i = 0; i < MyItem.buylist.size(); i++) {
							if (MyItem.buylist.get(i).getName().equals(it.get(num - 1).getName())) {
								MyItem.buylist.get(i).setCount(MyItem.count4);
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
								MyItem.count4 = 1;
								j.setText(String.valueOf(MyItem.count4));
							}
						} if (!MyItem.buylist.contains(it.get(num - 1))) {
								it.get(num - 1).setCount(MyItem.count4);
								MyItem.add(it.get(num - 1));
								MyItem.count4 = 1;
								j.setText(String.valueOf(MyItem.count4));
							}
						 
					}
				}
				
			});
		}
		else if (num == 5) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyItem.buylist.isEmpty()) {
						it.get(num - 1).setCount(MyItem.count5);
						MyItem.add(it.get(num - 1));
						MyItem.count5 = 1;
						j.setText(String.valueOf(MyItem.count5));
					} else if (!MyItem.buylist.isEmpty()) {
						for (int i = 0; i < MyItem.buylist.size(); i++) {
							if (MyItem.buylist.get(i).getName().equals(it.get(num - 1).getName())) {
								MyItem.buylist.get(i).setCount(MyItem.count5);
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
								MyItem.count5 = 1;
								j.setText(String.valueOf(MyItem.count5));
							}
						} if (!MyItem.buylist.contains(it.get(num - 1))) {
								it.get(num - 1).setCount(MyItem.count5);
								MyItem.add(it.get(num - 1));
								MyItem.count5 = 1;
								j.setText(String.valueOf(MyItem.count5));
							}
						 
					}
				}
				
			});
		}
		return btnBuy;
	}

}
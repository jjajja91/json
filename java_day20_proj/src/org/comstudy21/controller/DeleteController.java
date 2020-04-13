package org.comstudy21.controller;

public class DeleteController implements Controller {

	@Override
	public void service() {

		int selectRow = listView.table.getSelectedRow();
		int index = Integer.parseInt("" + dm.getValueAt(selectRow, 0));
		dao.delete(index);

	}

}

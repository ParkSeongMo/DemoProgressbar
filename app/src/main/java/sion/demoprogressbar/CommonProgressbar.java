package sion.demoprogressbar;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.WindowManager;


public class CommonProgressbar extends Dialog {

	/**
	 * Custom Popup 생성자..
	 * @param context	context
	 */
	public CommonProgressbar(Context context) {
		super(context);

		getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		getWindow().clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
	}

	/**
	 * On Create Popup
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_progressbar);
	}
}

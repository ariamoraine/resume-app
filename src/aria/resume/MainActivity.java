package aria.resume;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	public void hackOnClick(View view) {
		TextView hackText = (TextView) findViewById(R.id.hackerschool_projects);
		if (hackText.getVisibility() == View.GONE) {
			hackText.setVisibility(View.VISIBLE);
		} else
			hackText.setVisibility(View.GONE);
	}

	public void tasteOnClick(View view) {
		TextView tasteText = (TextView) findViewById(R.id.taste_details);
		if (tasteText.getVisibility() == View.GONE) {
			tasteText.setVisibility(View.VISIBLE);
		} else
			tasteText.setVisibility(View.GONE);
	}
	public void unirondackOnClick(View view) {
		TextView uniText = (TextView) findViewById(R.id.unirondack_details);
		if (uniText.getVisibility() == View.GONE) {
			uniText.setVisibility(View.VISIBLE);
		} else
			uniText.setVisibility(View.GONE);
	}
	public void songOnClick (View view) {
		TextView songText = (TextView) findViewById(R.id.song_of_the_morning_details);
		if (songText.getVisibility() == View.GONE) {
			songText.setVisibility(View.VISIBLE);
		} else
			songText.setVisibility(View.GONE);
	}

}

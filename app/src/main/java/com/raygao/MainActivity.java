package com.raygao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseUser;
import com.raygao.activity.LoginSignupActivity;

public class MainActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);



			// If current user is NOT anonymous user
			// Get current user data from Parse.com
			ParseUser currentUser = ParseUser.getCurrentUser();
			if (currentUser != null) {
				// Send logged in users to Welcome.class
				Intent intent = new Intent(MainActivity.this, Main.class);
				startActivity(intent);
				finish();
			} else {
				// Send user to LoginSignupActivity.class
				Intent intent = new Intent(MainActivity.this,
						LoginSignupActivity.class);
				startActivity(intent);
				finish();
			}


	}
}

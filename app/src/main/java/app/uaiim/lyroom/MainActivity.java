package app.uaiim.lyroom;

import android.widget.Toast;
import java.util.List;
import org.json.JSONArray;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import android.content.Context;
import org.json.JSONObject;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	Context context;
	RecyclerView recyclerView;
	ArrayList<DataModel> dataArrayList;
	DataAdapter dataAdapter;
	GridLayoutManager gridLayoutManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
		bottomNavigationView
				.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
					@Override
					public boolean onNavigationItemSelected(MenuItem item) {

						switch (item.getItemId()) {
						case R.id.movie:
							//startActivity(new Intent(getApplicationContext(), MainActivity.class));
							//overridePendingTransition(0, 0);
							return true;
						case R.id.series:
							return true;
						case R.id.tag:
							//startActivity(new Intent(getApplicationContext(), MainActivity.class));
							//overridePendingTransition(0, 0);
							return true;
						}
						return false;

					}
				});
		
		
		/*
		recyclerView = findViewById(R.id.data);
		dataArrayList = new ArrayList<>();
		dataArrayList.add(new DataModel("1", "Satu", "Kesatu", "01","https://2.bp.blogspot.com/-FSE7-b0Ktq4/Xn8Wi2qibnI/AAAAAAAAJjg/borL1fs2Vcw6U9TI7s1pNni6adeN-hmxACLcBGAsYHQ/s1600/github-npm.png"));
		
		dataAdapter = new DataAdapter(this, dataArrayList);
		gridLayoutManager = new GridLayoutManager(this, 3);
		
		recyclerView.setLayoutManager(gridLayoutManager);
		recyclerView.setAdapter(dataAdapter);
		*/
	}
}
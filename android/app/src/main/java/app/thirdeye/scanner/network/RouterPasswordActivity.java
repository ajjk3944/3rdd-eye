package app.thirdeye.scanner.network;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.thirdeye.scanner.R;

/**
 * Router Password Activity - Shows default router credentials database
 * Similar to "Who uses my wifi" app router password feature
 */
public class RouterPasswordActivity extends AppCompatActivity {
    private EditText searchEdit;
    private RecyclerView recyclerView;
    private RouterPasswordAdapter adapter;
    private List<RouterPasswordDatabase.RouterCredential> allCredentials;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Make status bar match dark theme
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(android.graphics.Color.parseColor("#0a0f0a"));
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            // Remove light status bar flag so icons are white on dark background
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        
        setContentView(R.layout.activity_router_password);
        
        initializeViews();
        loadCredentials();
        setupSearch();
    }
    
    private void initializeViews() {
        searchEdit = findViewById(R.id.et_search);
        recyclerView = findViewById(R.id.recycler_view_routers);
        
        // Back button
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());
        
        // Setup RecyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RouterPasswordAdapter(new ArrayList<>());
        recyclerView.setAdapter(adapter);
    }
    
    private void loadCredentials() {
        allCredentials = RouterPasswordDatabase.getAllCredentials();
        adapter.setCredentials(allCredentials);
    }
    
    private void setupSearch() {
        searchEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterCredentials(s.toString());
            }
            
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
    
    private void filterCredentials(String query) {
        if (query.trim().isEmpty()) {
            adapter.setCredentials(allCredentials);
        } else {
            List<RouterPasswordDatabase.RouterCredential> filtered = 
                RouterPasswordDatabase.searchCredentials(query);
            adapter.setCredentials(filtered);
        }
    }
    
    /**
     * Adapter for router credentials
     */
    private static class RouterPasswordAdapter extends RecyclerView.Adapter<RouterPasswordAdapter.ViewHolder> {
        private List<RouterPasswordDatabase.RouterCredential> credentials;
        
        public RouterPasswordAdapter(List<RouterPasswordDatabase.RouterCredential> credentials) {
            this.credentials = credentials;
        }
        
        public void setCredentials(List<RouterPasswordDatabase.RouterCredential> credentials) {
            this.credentials = credentials;
            notifyDataSetChanged();
        }
        
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_router_password, parent, false);
            return new ViewHolder(view);
        }
        
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            RouterPasswordDatabase.RouterCredential credential = credentials.get(position);
            holder.bind(credential);
        }
        
        @Override
        public int getItemCount() {
            return credentials.size();
        }
        
        static class ViewHolder extends RecyclerView.ViewHolder {
            private final TextView brandText;
            private final TextView modelText;
            private final TextView usernameText;
            private final TextView passwordText;
            
            public ViewHolder(View itemView) {
                super(itemView);
                brandText = itemView.findViewById(R.id.tv_brand);
                modelText = itemView.findViewById(R.id.tv_model);
                usernameText = itemView.findViewById(R.id.tv_username);
                passwordText = itemView.findViewById(R.id.tv_password);
            }
            
            public void bind(RouterPasswordDatabase.RouterCredential credential) {
                brandText.setText(credential.brand);
                modelText.setText(credential.model);
                usernameText.setText(credential.defaultUsername);
                passwordText.setText(credential.defaultPassword);
            }
        }
    }
}

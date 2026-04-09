package ru.andr7e.siminfo;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.l;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;
import ru.andr7e.simcellinfo.R;
import ru.andr7e.siminfo.d;

/* loaded from: classes.dex */
public class ShowInfoListActivity extends androidx.appcompat.app.c implements d.c {
    private static int A = 0;
    private static int B = -1;

    /* renamed from: u, reason: collision with root package name */
    private String f3223u = null;

    /* renamed from: v, reason: collision with root package name */
    private SharedPreferences f3224v;

    /* renamed from: w, reason: collision with root package name */
    private c f3225w;

    /* renamed from: x, reason: collision with root package name */
    private ViewPager f3226x;

    /* renamed from: y, reason: collision with root package name */
    private SearchView f3227y;

    /* renamed from: z, reason: collision with root package name */
    private MenuItem f3228z;

    class a implements MenuItem.OnActionExpandListener {
        a() {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            ShowInfoListActivity.this.J();
            return true;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return true;
        }
    }

    class b implements SearchView.m {
        b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            ShowInfoListActivity.this.G(ShowInfoListActivity.this.J(), str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            ShowInfoListActivity.this.G(ShowInfoListActivity.this.J(), str);
            return false;
        }
    }

    public class c extends l {
        public c(h hVar) {
            super(hVar);
        }

        @Override // androidx.viewpager.widget.a
        public int c() {
            return 1;
        }

        @Override // androidx.viewpager.widget.a
        public int d(Object obj) {
            return -2;
        }

        @Override // androidx.fragment.app.l
        public Fragment m(int i2) {
            return p(ShowInfoListActivity.this.J());
        }

        public Fragment p(int i2) {
            if (i2 != 0) {
                return null;
            }
            return new d();
        }
    }

    private void M() throws Resources.NotFoundException {
        this.f3225w = new c(p());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        this.f3226x = viewPager;
        viewPager.setAdapter(this.f3225w);
    }

    private void O() {
        androidx.appcompat.app.a aVarX = x();
        if (aVarX != null) {
            aVarX.s(true);
        }
    }

    void G(int i2, String str) {
    }

    void H(int i2) {
        if (i2 == 0) {
            O();
        }
    }

    void I(int i2) {
        MenuItem menuItem = this.f3228z;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    int J() {
        return A;
    }

    void K() {
        String language = Locale.getDefault().getLanguage();
        String strX = MainActivity.X(this.f3224v.getString("language_list", "0"));
        if (strX != null) {
            m0.a.a(this, strX);
        } else {
            m0.a.a(this, language);
        }
    }

    void L(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.action_search_show_list);
        this.f3228z = menuItemFindItem;
        menuItemFindItem.setOnActionExpandListener(new a());
        SearchView searchView = (SearchView) this.f3228z.getActionView();
        this.f3227y = searchView;
        searchView.setOnQueryTextListener(new b());
    }

    public CharSequence N(int i2) {
        if (i2 != 0) {
            return null;
        }
        setTitle(R.string.action_cell_list);
        return null;
    }

    @Override // ru.andr7e.siminfo.d.c
    public void k(ru.andr7e.siminfo.b bVar) {
        try {
            StringBuilder sb = new StringBuilder();
            f.j(bVar, sb, " ");
            sb.append("\n");
            f.i(bVar, sb, false);
            k0.a.a(this, "Info", sb.toString(), "OK");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.c, androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        int iA;
        int i2;
        super.onCreate(bundle);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.f3224v = defaultSharedPreferences;
        if (defaultSharedPreferences != null && (iA = n0.h.a(defaultSharedPreferences, this)) > 0) {
            if (iA == 1) {
                i2 = R.style.AppTheme_Dark;
            } else if (iA == 2) {
                i2 = R.style.AppTheme_Black;
            }
            setTheme(i2);
        }
        K();
        setContentView(R.layout.activity_show_info_list);
        M();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            A = extras.getInt("type");
            B = extras.getInt("index");
            N(A);
        }
        H(A);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_show_info_list, menu);
        L(menu);
        I(J());
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

package com.zipoapps.premiumhelper.ui.settings;

import B4.f;
import I2.i;
import J8.C0690e;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1748a;
import androidx.fragment.app.x;
import androidx.fragment.app.y;
import androidx.lifecycle.AbstractC1781n;
import c.C2012j;
import c.C2027y;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.zipoapps.premiumhelper.ui.settings.a;
import com.zipoapps.premiumhelper.ui.settings.b;
import h.AbstractC4397a;
import i8.q;
import kotlin.jvm.internal.l;
import l2.C5275h;

/* compiled from: PHSettingsActivity.kt */
/* loaded from: classes3.dex */
public class PHSettingsActivity<T extends a> extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37122d = 0;

    /* renamed from: c, reason: collision with root package name */
    public C5275h f37123c;

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.settingsTheme, typedValue, true);
        Resources.Theme themeNewTheme = getResources().newTheme();
        themeNewTheme.applyStyle(typedValue.resourceId, true);
        TypedValue typedValue2 = new TypedValue();
        themeNewTheme.resolveAttribute(R.attr.activityTheme, typedValue2, true);
        int i = typedValue2.resourceId;
        if (i == 0) {
            i = R.style.PhSettingsActivityTheme;
        }
        setTheme(i);
        C2012j.a(this, new C2027y(0, 0, new i(this, 1)), 2);
        this.f37123c = C5275h.a(getLayoutInflater().inflate(R.layout.activity_settings, (ViewGroup) null, false));
        super.onCreate(bundle);
        C5275h c5275h = this.f37123c;
        if (c5275h == null) {
            l.l("binding");
            throw null;
        }
        setContentView((LinearLayout) c5275h.f43713b);
        C5275h c5275h2 = this.f37123c;
        if (c5275h2 == null) {
            l.l("binding");
            throw null;
        }
        setSupportActionBar((Toolbar) c5275h2.f43715d);
        AbstractC4397a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.m(true);
        }
        TypedValue typedValue3 = new TypedValue();
        getTheme().resolveAttribute(R.attr.toolbarTitle, typedValue3, true);
        CharSequence string = typedValue3.string;
        getTheme().resolveAttribute(R.attr.title, typedValue3, true);
        CharSequence charSequence = typedValue3.string;
        if (string == null) {
            if (charSequence == null) {
                string = getString(R.string.ph_settings);
                l.e(string, "getString(...)");
            } else {
                string = charSequence;
            }
        }
        AbstractC4397a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.o(string);
        }
        C5275h c5275h3 = this.f37123c;
        if (c5275h3 == null) {
            l.l("binding");
            throw null;
        }
        C0690e.a(this, (Toolbar) c5275h3.f43715d, 2);
        x supportFragmentManager = getSupportFragmentManager();
        l.e(supportFragmentManager, "getSupportFragmentManager(...)");
        f fVar = new f(new B8.a(this));
        AbstractC1781n lifecycle = getLifecycle();
        if (lifecycle.getCurrentState() != AbstractC1781n.b.DESTROYED) {
            y yVar = new y(supportFragmentManager, fVar, lifecycle);
            x.m mVarPut = supportFragmentManager.f15986l.put("REQUEST_ACCOUNT_DELETE", new x.m(lifecycle, fVar, yVar));
            if (mVarPut != null) {
                mVarPut.f16011a.removeObserver(mVarPut.f16013c);
            }
            if (x.G(2)) {
                Log.v("FragmentManager", "Setting FragmentResultListener with key REQUEST_ACCOUNT_DELETE lifecycleOwner " + lifecycle + " and listener " + fVar);
            }
            lifecycle.addObserver(yVar);
        }
        b bVarA = b.C0432b.a(getIntent().getExtras());
        if (bVarA == null) {
            throw new IllegalStateException("Support email and VIP email should be passed via Config");
        }
        a aVar = new a();
        aVar.setArguments(bVarA.a());
        x supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        C1748a c1748a = new C1748a(supportFragmentManager2);
        c1748a.d(aVar, q.fragment_container);
        c1748a.g(false);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        l.f(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

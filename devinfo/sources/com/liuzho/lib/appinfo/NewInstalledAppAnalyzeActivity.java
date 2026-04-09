package com.liuzho.lib.appinfo;

import a4.d;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import d.m;
import e4.m0;
import e4.v0;
import i.g;
import ig.l;
import java.util.WeakHashMap;
import je.u;
import pd.b;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class NewInstalledAppAnalyzeActivity extends g {
    public static final /* synthetic */ int F = 0;
    public String A;
    public LinearLayout B;
    public ViewGroup C;
    public CardView D;
    public n.a E;

    @Override // i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = m.f21627a;
        m.a(this);
        setContentView(R.layout.appi_activity_new_installed_app_analyze);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        z(toolbar);
        this.A = getIntent().getStringExtra("args_pkg_name");
        a.a.f3c.getClass();
        if (toolbar != null) {
            i.e(toolbar);
        }
        if (TextUtils.isEmpty(this.A)) {
            finish();
            return;
        }
        if (!nh.a.l(this, this.A)) {
            Toast.makeText(this, R.string.appi_activity_not_found, 0).show();
            finish();
            return;
        }
        if (r() != null) {
            r().Q(true);
        }
        this.D = (CardView) findViewById(R.id.ad_container);
        this.C = (ViewGroup) findViewById(R.id.info_container);
        this.B = (LinearLayout) findViewById(R.id.permission_content);
        new Thread(new l(18, this)).start();
        a.a.f3c.getClass();
        if (f.g()) {
            this.D.setVisibility(8);
        } else {
            d dVar = a.a.f3c;
            CardView cardView = this.D;
            dVar.getClass();
            b.p(cardView, true);
            a.a.f3c.getClass();
            u.k(this, new ej.f(3, this), ag.a.c(R.layout.ad_native_common));
        }
        a.a.f3c.getClass();
        cg.a.f2848b.f(null, "new_app_ana_show");
        View viewFindViewById = findViewById(R.id.container);
        com.applovin.impl.sdk.ad.f fVar = new com.applovin.impl.sdk.ad.f(23, this, toolbar);
        WeakHashMap weakHashMap = v0.f22405a;
        m0.j(viewFindViewById, fVar);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        n.a aVar = this.E;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

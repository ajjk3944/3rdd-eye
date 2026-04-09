package com.liuzh.deviceinfo.analyzer;

import ah.d;
import ah.k;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b5.u0;
import com.applovin.impl.sdk.ad.f;
import com.liuzh.deviceinfo.R;
import d.m;
import e4.m0;
import e4.v0;
import eg.l;
import hg.a;
import i.e;
import java.util.WeakHashMap;
import r5.c;
import t6.i0;
import wi.h;
import x.n0;
import zg.b;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class StorageAnalyzeActivity extends a {
    public static final /* synthetic */ int C = 0;
    public l B;

    public final void D(Bundle bundle, String str) {
        if (bundle == null) {
            this.B = new l();
            this.B.Z(c.g("analyze_path", str));
            u0 u0VarS = s();
            u0VarS.getClass();
            b5.a aVar = new b5.a(u0VarS);
            aVar.h(R.id.content_container, this.B, l.class.getSimpleName(), 2);
            aVar.e();
        } else {
            this.B = (l) s().D(l.class.getSimpleName());
        }
        cg.a.f2848b.f(null, "analyze_show");
    }

    @Override // d.j, android.app.Activity
    public final void onBackPressed() {
        l lVar = this.B;
        if (lVar == null || !lVar.i0()) {
            super.onBackPressed();
        }
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("analyze_path");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        m.a(this);
        setContentView(R.layout.activity_storage_analyze);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        i.e(toolbar);
        z(toolbar);
        A();
        if (zg.c.d(this)) {
            D(bundle, stringExtra);
            View viewFindViewById = findViewById(R.id.root_container);
            f fVar = new f(4, this, toolbar);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(viewFindViewById, fVar);
            return;
        }
        b bVarG = zg.c.g(this, this, new d(this, bundle, stringExtra, 6));
        if (!h.f36761f) {
            com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
            if (com.liuzh.deviceinfo.utilities.f.f21257c.getBoolean("already_request_storage_permission", false)) {
                n0 n0Var = wi.i.f36764a;
                for (int i4 = 0; i4 < 2; i4++) {
                    if (!r3.b.V(this, zg.c.f38279a[i4])) {
                    }
                }
                t7.m mVar = new t7.m(this);
                mVar.y(R.string.missing_permission);
                mVar.v(R.string.storage_analyze_permission_summary);
                mVar.x(R.string.grant, new eg.d(1, this));
                mVar.w(android.R.string.cancel, null);
                e eVarA = mVar.A();
                eVarA.setCanceledOnTouchOutside(false);
                eVarA.setOnDismissListener(new k(1, this));
                return;
            }
        }
        bVarG.e();
        zg.c.e();
    }

    @Override // hg.a, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        l lVar = this.B;
        if (lVar == null || lVar.f23472l0 == null || i0.l(lVar.n())) {
            onBackPressed();
            return true;
        }
        lVar.f23472l0.T(lVar.U(), new jf.c(14, lVar));
        lVar.f23472l0 = null;
        return true;
    }
}

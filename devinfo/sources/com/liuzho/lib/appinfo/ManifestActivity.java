package com.liuzho.lib.appinfo;

import a4.d;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.liuzh.deviceinfo.R;
import d.m;
import dj.b;
import e4.m0;
import e4.v0;
import i.g;
import i0.f;
import java.util.WeakHashMap;
import lf.e;
import qg.c;
import z2.k;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ManifestActivity extends g {
    public static final /* synthetic */ int E = 0;
    public String A;
    public String B;
    public f C;
    public c D;

    @Override // i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i4 = m.f21627a;
        m.a(this);
        try {
            c cVarB = c.b(getLayoutInflater());
            this.D = cVarB;
            setContentView(cVarB.f32328a);
            z(this.D.f32330c);
            d dVar = a.a.f3c;
            Toolbar toolbar = this.D.f32330c;
            dVar.getClass();
            i.e(toolbar);
            String stringExtra = getIntent().getStringExtra("pkg");
            this.B = getIntent().getStringExtra("fileName");
            if (TextUtils.isEmpty(stringExtra)) {
                finish();
                return;
            }
            this.C = new f(this, this);
            r().Q(true);
            b.j(this.D.f32329b, (k) a.a.f3c.f189b);
            new Thread(new ti.f(this, stringExtra, 0)).start();
            FrameLayout frameLayout = this.D.f32328a;
            e eVar = new e(15, this);
            WeakHashMap weakHashMap = v0.f22405a;
            m0.j(frameLayout, eVar);
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (!TextUtils.isEmpty(this.B)) {
            menu.add(0, 1, 0, R.string.appi_save).setShowAsActionFlags(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.D;
        if (cVar != null) {
            cVar.f32331d.destroy();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (TextUtils.isEmpty(this.A)) {
            return true;
        }
        f fVar = this.C;
        String str = this.A;
        String str2 = this.B;
        km.i iVar = new km.i(22, this);
        fVar.getClass();
        fVar.f25417c = new ah.d(fVar, str, iVar, 20);
        try {
            ((f.d) fVar.f25418d).a(str2);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText((Context) fVar.f25416b, R.string.appi_failed, 0).show();
            return true;
        }
    }
}

package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.phuongpn.whousemywifi.networkscanner.R;
import defpackage.ag1;
import defpackage.bu1;
import defpackage.oi0;
import defpackage.s62;
import defpackage.sv1;
import defpackage.uv2;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bu1 bu1Var = sv1.f.b;
        s62 s62Var = new s62();
        bu1Var.getClass();
        uv2 uv2Var = (uv2) new ag1(bu1Var, this, s62Var).d(this, false);
        if (uv2Var == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            uv2Var.z2(stringExtra, new oi0(this), new oi0(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

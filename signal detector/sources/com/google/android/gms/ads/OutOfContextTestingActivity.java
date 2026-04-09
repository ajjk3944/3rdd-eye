package com.google.android.gms.ads;

import S2.b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.apm.insight.R;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import q2.C2812d;
import q2.C2834o;
import q2.InterfaceC2846u0;
import q2.r;

/* loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2834o c2834o = r.f23260g.f23262b;
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        c2834o.getClass();
        InterfaceC2846u0 interfaceC2846u0 = (InterfaceC2846u0) new C2812d(c2834o, this, binderC0569Jc).d(this, false);
        if (interfaceC2846u0 == null) {
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
            interfaceC2846u0.i3(stringExtra, new b(this), new b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}

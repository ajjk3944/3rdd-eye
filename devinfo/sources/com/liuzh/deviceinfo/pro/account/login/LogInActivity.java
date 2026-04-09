package com.liuzh.deviceinfo.pro.account.login;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.f1;
import b5.o0;
import com.liuzh.deviceinfo.DeviceInfoApp;
import eh.c;
import eh.d;
import hg.a;
import nk.k;
import nk.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class LogInActivity extends a {
    public static final o0 D = new o0(1);
    public final ValueAnimator B;
    public final bh.a C;

    public LogInActivity() {
        Resources resources = DeviceInfoApp.f21145f.getResources();
        k.d(resources, "getResources(...)");
        float fC = a4.a.c(resources, 7.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-fC, fC);
        valueAnimatorOfFloat.setRepeatMode(2);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.addUpdateListener(new eh.a(0, this));
        valueAnimatorOfFloat.setDuration(600L);
        this.B = valueAnimatorOfFloat;
        new f1(v.a(d.class), new c(this, 1), new c(this, 0), new c(this, 2));
        this.C = new bh.a(this, 2);
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z3 = mg.d.f29372a;
        finish();
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        bh.c.g(this.C);
        this.B.cancel();
    }
}

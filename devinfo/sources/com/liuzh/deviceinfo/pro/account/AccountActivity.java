package com.liuzh.deviceinfo.pro.account;

import android.os.Bundle;
import androidx.lifecycle.f1;
import bh.b;
import bh.c;
import bh.x;
import com.liuzh.deviceinfo.pro.account.mode.User;
import ec.y;
import hg.a;
import nk.k;
import nk.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AccountActivity extends a {
    public static final /* synthetic */ int C = 0;
    public final bh.a B = new bh.a(this, 0);

    public AccountActivity() {
        new f1(v.a(x.class), new b(this, 1), new b(this, 0), new b(this, 2));
    }

    public final void D(User user) {
        k.k("binding");
        throw null;
    }

    @Override // hg.a, i.g, d.j, r3.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        User userB = c.b();
        if (userB != null) {
            userB.toString();
            throw new UnsupportedOperationException();
        }
        y.h(this, 6);
        finish();
    }

    @Override // i.g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.g(this.B);
    }
}

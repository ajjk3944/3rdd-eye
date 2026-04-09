package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jx implements k00, at0, r61 {
    public final iw f;
    public final q61 g;
    public d60 h = null;
    public gw3 i = null;

    public jx(iw iwVar, q61 q61Var) {
        this.f = iwVar;
        this.g = q61Var;
    }

    @Override // defpackage.at0
    public final vq2 a() {
        f();
        return (vq2) this.i.h;
    }

    public final void b(t50 t50Var) {
        this.h.d(t50Var);
    }

    @Override // defpackage.k00
    public final mf0 c() {
        Application application;
        iw iwVar = this.f;
        Context applicationContext = iwVar.G().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        mf0 mf0Var = new mf0(0);
        LinkedHashMap linkedHashMap = mf0Var.a;
        if (application != null) {
            linkedHashMap.put(o61.l, application);
        }
        linkedHashMap.put(g82.g, this);
        linkedHashMap.put(g82.h, this);
        Bundle bundle = iwVar.k;
        if (bundle != null) {
            linkedHashMap.put(g82.i, bundle);
        }
        return mf0Var;
    }

    @Override // defpackage.r61
    public final q61 d() {
        f();
        return this.g;
    }

    @Override // defpackage.b60
    public final d60 e() {
        f();
        return this.h;
    }

    public final void f() {
        if (this.h == null) {
            this.h = new d60(this);
            gw3 gw3Var = new gw3(new zs0(this, new ga0(2, this)));
            this.i = gw3Var;
            gw3Var.x();
            g82.g(this);
        }
    }
}

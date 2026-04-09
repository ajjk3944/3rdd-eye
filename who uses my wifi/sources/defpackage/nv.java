package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class nv implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ nv(String str, Context context, g4 g4Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = g4Var;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return qv.a((String) this.b, (Context) this.c, (g4) this.d, this.e);
            case 1:
                try {
                    return qv.a((String) this.b, (Context) this.c, (g4) this.d, this.e);
                } catch (Throwable unused) {
                    return new pv(-3);
                }
            default:
                cr1 cr1Var = (cr1) this.b;
                ad2 ad2Var = (ad2) this.c;
                Bundle bundle = (Bundle) this.d;
                return cr1Var.G3(cr1Var.h, ad2Var.f, ad2Var.g, ad2Var.h, ad2Var.i, this.e, ad2Var.k, bundle, ad2Var);
        }
    }

    public /* synthetic */ nv(cr1 cr1Var, ad2 ad2Var, int i, Bundle bundle) {
        this.a = 2;
        this.b = cr1Var;
        this.c = ad2Var;
        this.e = i;
        this.d = bundle;
    }
}

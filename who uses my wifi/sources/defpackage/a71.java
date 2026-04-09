package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class a71 implements d71 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ sq0 i;

    public a71(boolean z, boolean z2, boolean z3, sq0 sq0Var) {
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = sq0Var;
    }

    @Override // defpackage.d71
    public final o91 i(View view, o91 o91Var, e71 e71Var) {
        if (this.f) {
            e71Var.d = o91Var.a() + e71Var.d;
        }
        boolean z = view.getLayoutDirection() == 1;
        if (this.g) {
            if (z) {
                e71Var.c = o91Var.b() + e71Var.c;
            } else {
                e71Var.a = o91Var.b() + e71Var.a;
            }
        }
        if (this.h) {
            if (z) {
                e71Var.a = o91Var.c() + e71Var.a;
            } else {
                e71Var.c = o91Var.c() + e71Var.c;
            }
        }
        view.setPaddingRelative(e71Var.a, e71Var.b, e71Var.c, e71Var.d);
        this.i.i(view, o91Var, e71Var);
        return o91Var;
    }
}

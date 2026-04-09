package androidx.media3.exoplayer.trackselection;

import a5.d0;
import androidx.media3.common.g1;
import d5.w0;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1877a;

    /* renamed from: b, reason: collision with root package name */
    public final w0[] f1878b;

    /* renamed from: c, reason: collision with root package name */
    public final v[] f1879c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f1880d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1881e;

    public c0(w0[] w0VarArr, v[] vVarArr, g1 g1Var, x xVar) {
        this.f1878b = w0VarArr;
        this.f1879c = (v[]) vVarArr.clone();
        this.f1880d = g1Var;
        this.f1881e = xVar;
        this.f1877a = w0VarArr.length;
    }

    public final boolean a(c0 c0Var, int i10) {
        return c0Var != null && d0.a(this.f1878b[i10], c0Var.f1878b[i10]) && d0.a(this.f1879c[i10], c0Var.f1879c[i10]);
    }

    public final boolean b(int i10) {
        return this.f1878b[i10] != null;
    }
}

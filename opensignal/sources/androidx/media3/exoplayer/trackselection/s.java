package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.b1;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f1920a;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f1921d;

    /* renamed from: g, reason: collision with root package name */
    public final int f1922g;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.media3.common.r f1923r;

    public s(int i10, b1 b1Var, int i11) {
        this.f1920a = i10;
        this.f1921d = b1Var;
        this.f1922g = i11;
        this.f1923r = b1Var.f1575r[i11];
    }

    public abstract int a();

    public abstract boolean b(s sVar);
}

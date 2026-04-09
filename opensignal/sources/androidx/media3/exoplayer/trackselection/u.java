package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.b1;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f1926a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1927b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1928c;

    public u(int i10, b1 b1Var, int[] iArr) {
        if (iArr.length == 0) {
            a5.a.n("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f1926a = b1Var;
        this.f1927b = iArr;
        this.f1928c = i10;
    }
}

package androidx.compose.foundation.layout;

import c0.n;
import z0.m;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final FillElement f1083a = new FillElement(n.Horizontal);

    static {
        new FillElement(n.Both);
    }

    public static final m a(m mVar, float f10) {
        return mVar.c(new SizeElement(0.0f, f10, 0.0f, f10, 5));
    }

    public static final m b(float f10) {
        return new SizeElement(f10, f10, f10, f10);
    }

    public static final m c(float f10) {
        return new SizeElement(f10, 0.0f, f10, 0.0f, 10);
    }
}

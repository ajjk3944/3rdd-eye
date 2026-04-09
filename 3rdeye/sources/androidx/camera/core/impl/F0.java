package androidx.camera.core.impl;

import androidx.camera.core.impl.D;

/* compiled from: RestrictedCameraInfo.java */
/* loaded from: classes.dex */
public final class F0 extends C1686e0 {

    /* renamed from: b, reason: collision with root package name */
    public final I f14875b;

    /* renamed from: c, reason: collision with root package name */
    public final I0 f14876c;

    /* renamed from: d, reason: collision with root package name */
    public final B f14877d;

    public F0(I i, B b10) {
        super(i);
        this.f14875b = i;
        this.f14877d = b10;
        D.a aVar = (D.a) b10;
        this.f14876c = aVar.J();
        C1683d c1683d = B.f14870h;
        Boolean bool = Boolean.FALSE;
        ((Boolean) ((C1717u0) aVar.getConfig()).o(c1683d, bool)).getClass();
        ((Boolean) ((C1717u0) aVar.getConfig()).o(B.i, bool)).getClass();
    }

    @Override // androidx.camera.core.impl.C1686e0, androidx.camera.core.impl.I
    public final I e() {
        return this.f14875b;
    }
}

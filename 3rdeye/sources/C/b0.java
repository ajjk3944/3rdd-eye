package C;

import android.util.Size;

/* compiled from: SettableImageProxy.java */
/* loaded from: classes.dex */
public final class b0 extends androidx.camera.core.b {

    /* renamed from: e, reason: collision with root package name */
    public final Object f685e;

    /* renamed from: f, reason: collision with root package name */
    public final L f686f;

    /* renamed from: g, reason: collision with root package name */
    public final int f687g;

    /* renamed from: h, reason: collision with root package name */
    public final int f688h;

    public b0(androidx.camera.core.c cVar, Size size, L l5) {
        super(cVar);
        this.f685e = new Object();
        if (size == null) {
            this.f687g = this.f14841c.getWidth();
            this.f688h = this.f14841c.getHeight();
        } else {
            this.f687g = size.getWidth();
            this.f688h = size.getHeight();
        }
        this.f686f = l5;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.c
    public final int getHeight() {
        return this.f688h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.c
    public final int getWidth() {
        return this.f687g;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.c
    public final L i0() {
        return this.f686f;
    }
}

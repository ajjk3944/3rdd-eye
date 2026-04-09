package v;

import androidx.camera.core.impl.AbstractC1707p;
import androidx.camera.core.impl.C1712s;
import o0.b;

/* compiled from: Camera2CapturePipeline.java */
/* renamed from: v.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5641B extends AbstractC1707p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.a f46610a;

    public C5641B(b.a aVar) {
        this.f46610a = aVar;
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void a(int i) {
        this.f46610a.d(new C.K("Capture request is cancelled because camera is closed", null));
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void b(int i, androidx.camera.core.impl.A a10) {
        this.f46610a.b(null);
    }

    @Override // androidx.camera.core.impl.AbstractC1707p
    public final void c(int i, C1712s c1712s) {
        this.f46610a.d(new C.K("Capture request failed with reason " + c1712s.f15115a, null));
    }
}

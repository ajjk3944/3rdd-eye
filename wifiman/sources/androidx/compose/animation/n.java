package androidx.compose.animation;

import Y0.r;
import mh.InterfaceC6839p;
import q.InterfaceC7403v;
import r.H;

/* loaded from: classes.dex */
final class n implements InterfaceC7403v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27671a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6839p f27672b;

    public n(boolean z10, InterfaceC6839p interfaceC6839p) {
        this.f27671a = z10;
        this.f27672b = interfaceC6839p;
    }

    @Override // q.InterfaceC7403v
    public boolean a() {
        return this.f27671a;
    }

    @Override // q.InterfaceC7403v
    public H b(long j10, long j11) {
        return (H) this.f27672b.invoke(r.b(j10), r.b(j11));
    }
}

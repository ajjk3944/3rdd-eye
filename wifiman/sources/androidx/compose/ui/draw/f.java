package androidx.compose.ui.draw;

import m0.InterfaceC6671H0;
import o.C7007F;
import o.N;
import p0.C7182c;

/* loaded from: classes.dex */
final class f implements InterfaceC6671H0 {

    /* renamed from: a, reason: collision with root package name */
    private C7007F f28769a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6671H0 f28770b;

    @Override // m0.InterfaceC6671H0
    public void a(C7182c c7182c) {
        InterfaceC6671H0 interfaceC6671H0 = this.f28770b;
        if (interfaceC6671H0 != null) {
            interfaceC6671H0.a(c7182c);
        }
    }

    @Override // m0.InterfaceC6671H0
    public C7182c b() {
        InterfaceC6671H0 interfaceC6671H0 = this.f28770b;
        if (!(interfaceC6671H0 != null)) {
            B0.a.b("GraphicsContext not provided");
        }
        C7182c c7182cB = interfaceC6671H0.b();
        C7007F c7007f = this.f28769a;
        if (c7007f == null) {
            this.f28769a = N.b(c7182cB);
        } else {
            c7007f.g(c7182cB);
        }
        return c7182cB;
    }

    public final InterfaceC6671H0 c() {
        return this.f28770b;
    }

    public final void d() {
        C7007F c7007f = this.f28769a;
        if (c7007f != null) {
            Object[] objArr = c7007f.f54910a;
            int i10 = c7007f.f54911b;
            for (int i11 = 0; i11 < i10; i11++) {
                a((C7182c) objArr[i11]);
            }
            c7007f.h();
        }
    }

    public final void e(InterfaceC6671H0 interfaceC6671H0) {
        d();
        this.f28770b = interfaceC6671H0;
    }
}

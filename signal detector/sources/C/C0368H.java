package c;

import androidx.lifecycle.C0300w;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;

/* renamed from: c.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368H implements InterfaceC0296s, InterfaceC0378c {

    /* renamed from: a, reason: collision with root package name */
    public final C0300w f5796a;

    /* renamed from: b, reason: collision with root package name */
    public final C0372L f5797b;

    /* renamed from: c, reason: collision with root package name */
    public C0369I f5798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0371K f5799d;

    public C0368H(C0371K c0371k, C0300w c0300w, C0372L c0372l) {
        q5.i.e(c0372l, "onBackPressedCallback");
        this.f5799d = c0371k;
        this.f5796a = c0300w;
        this.f5797b = c0372l;
        c0300w.a(this);
    }

    @Override // c.InterfaceC0378c
    public final void cancel() {
        this.f5796a.f(this);
        this.f5797b.f5810b.remove(this);
        C0369I c0369i = this.f5798c;
        if (c0369i != null) {
            c0369i.cancel();
        }
        this.f5798c = null;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        if (enumC0291m == EnumC0291m.ON_START) {
            this.f5798c = this.f5799d.a(this.f5797b);
            return;
        }
        if (enumC0291m != EnumC0291m.ON_STOP) {
            if (enumC0291m == EnumC0291m.ON_DESTROY) {
                cancel();
            }
        } else {
            C0369I c0369i = this.f5798c;
            if (c0369i != null) {
                c0369i.cancel();
            }
        }
    }
}

package p0;

import androidx.lifecycle.P;
import androidx.lifecycle.X;
import u.C2941j;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2769a extends X {

    /* renamed from: c, reason: collision with root package name */
    public static final P f22733c = new P(3);

    /* renamed from: b, reason: collision with root package name */
    public final C2941j f22734b = new C2941j();

    @Override // androidx.lifecycle.X
    public final void d() {
        C2941j c2941j = this.f22734b;
        if (c2941j.g() > 0) {
            c2941j.h(0).getClass();
            throw new ClassCastException();
        }
        int i = c2941j.f23709d;
        Object[] objArr = c2941j.f23708c;
        for (int i3 = 0; i3 < i; i3++) {
            objArr[i3] = null;
        }
        c2941j.f23709d = 0;
        c2941j.f23706a = false;
    }
}

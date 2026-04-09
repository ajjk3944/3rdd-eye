package androidx.lifecycle;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299v {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0292n f5254a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0296s f5255b;

    public final void a(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        EnumC0292n enumC0292nA = enumC0291m.a();
        EnumC0292n enumC0292n = this.f5254a;
        q5.i.e(enumC0292n, "state1");
        if (enumC0292nA.compareTo(enumC0292n) < 0) {
            enumC0292n = enumC0292nA;
        }
        this.f5254a = enumC0292n;
        this.f5255b.d(interfaceC0298u, enumC0291m);
        this.f5254a = enumC0292nA;
    }
}

package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Tn extends V4 {

    /* renamed from: b, reason: collision with root package name */
    public final W6 f40212b;

    public Tn(S4 s42, W6 w62) {
        super(s42);
        this.f40212b = w62;
    }

    @Override // io.appmetrica.analytics.impl.V4
    public final boolean a(C4683i6 c4683i6, P4 p42) {
        J4 j4 = p42.f39954b.f40090d.f39721a;
        this.f40212b.a(j4.i);
        InterfaceC4560dc interfaceC4560dcL = Ga.f39501F.l();
        if (Boolean.TRUE.equals(j4.f39670b)) {
            interfaceC4560dcL.a(true);
        } else {
            if (Boolean.FALSE.equals(j4.f39670b)) {
                interfaceC4560dcL.a(false);
            }
        }
        interfaceC4560dcL.a(j4.f39671c);
        Boolean bool = j4.f39681n;
        Ga.f39501F.b().b(bool != null ? bool.booleanValue() : true);
        return false;
    }
}

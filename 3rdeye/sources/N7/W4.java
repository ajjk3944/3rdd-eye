package N7;

import A7.b;
import D7.a;
import N7.X4;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFixedSize.kt */
/* loaded from: classes.dex */
public final class W4 implements InterfaceC5868a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.C0000b f7611d;

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<H9> f7612a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f7613b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f7614c;

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f7611d = new b.C0000b(value);
    }

    public /* synthetic */ W4(b.C0000b c0000b) {
        this(f7611d, c0000b);
    }

    public final boolean a(W4 w42, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return w42 != null && this.f7612a.a(resolver) == w42.f7612a.a(otherResolver) && this.f7613b.a(resolver).longValue() == w42.f7613b.a(otherResolver).longValue();
    }

    public final int b() {
        Integer num = this.f7614c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f7613b.hashCode() + this.f7612a.hashCode() + kotlin.jvm.internal.x.a(W4.class).hashCode();
        this.f7614c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        X4.b bVar = (X4.b) D7.a.f1071b.f6897t3.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return X4.b.e(c0011a, this);
    }

    public W4(A7.b<H9> unit, A7.b<Long> bVar) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f7612a = unit;
        this.f7613b = bVar;
    }
}

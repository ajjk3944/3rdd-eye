package N7;

import A7.b;
import D7.a;
import N7.C1341rb;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextRangeMaskSolid.kt */
/* renamed from: N7.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1328qb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f9000a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f9001b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f9002c;

    static {
        new b.C0000b(Boolean.TRUE);
    }

    public C1328qb(A7.b<Integer> bVar, A7.b<Boolean> isEnabled) {
        kotlin.jvm.internal.l.f(isEnabled, "isEnabled");
        this.f9000a = bVar;
        this.f9001b = isEnabled;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1341rb.a aVar = (C1341rb.a) D7.a.f1071b.f6784i8.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return C1341rb.a.e(c0011a, this);
    }
}

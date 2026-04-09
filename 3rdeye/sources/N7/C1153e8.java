package N7;

import A7.b;
import D7.a;
import N7.C1168f8;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPivotFixed.kt */
/* renamed from: N7.e8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1153e8 implements InterfaceC5868a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.C0000b f8162d;

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<H9> f8163a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f8164b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8165c;

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        f8162d = new b.C0000b(value);
    }

    public C1153e8() {
        this(f8162d, null);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1168f8.b bVar = (C1168f8.b) D7.a.f1071b.f6518K5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1168f8.b.e(c0011a, this);
    }

    public C1153e8(A7.b<H9> unit, A7.b<Long> bVar) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f8163a = unit;
        this.f8164b = bVar;
    }
}

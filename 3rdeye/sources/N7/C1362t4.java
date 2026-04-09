package N7;

import A7.b;
import D7.a;
import N7.C1376u4;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivEdgeInsets.kt */
/* renamed from: N7.t4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362t4 implements InterfaceC5868a {
    public static final b.C0000b i = b.a.a(0L);

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f9212j = b.a.a(0L);

    /* renamed from: k, reason: collision with root package name */
    public static final b.C0000b f9213k = b.a.a(0L);

    /* renamed from: l, reason: collision with root package name */
    public static final b.C0000b f9214l = b.a.a(0L);

    /* renamed from: m, reason: collision with root package name */
    public static final b.C0000b f9215m = b.a.a(H9.DP);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f9216a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f9217b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f9218c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f9219d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Long> f9220e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<Long> f9221f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<H9> f9222g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f9223h;

    public C1362t4() {
        this(null, null, null, null, 127);
    }

    public final boolean a(C1362t4 c1362t4, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1362t4 == null || this.f9216a.a(resolver).longValue() != c1362t4.f9216a.a(otherResolver).longValue()) {
            return false;
        }
        A7.b<Long> bVar = this.f9217b;
        Long lA = bVar != null ? bVar.a(resolver) : null;
        A7.b<Long> bVar2 = c1362t4.f9217b;
        if (!kotlin.jvm.internal.l.b(lA, bVar2 != null ? bVar2.a(otherResolver) : null) || this.f9218c.a(resolver).longValue() != c1362t4.f9218c.a(otherResolver).longValue() || this.f9219d.a(resolver).longValue() != c1362t4.f9219d.a(otherResolver).longValue()) {
            return false;
        }
        A7.b<Long> bVar3 = this.f9220e;
        Long lA2 = bVar3 != null ? bVar3.a(resolver) : null;
        A7.b<Long> bVar4 = c1362t4.f9220e;
        return kotlin.jvm.internal.l.b(lA2, bVar4 != null ? bVar4.a(otherResolver) : null) && this.f9221f.a(resolver).longValue() == c1362t4.f9221f.a(otherResolver).longValue() && this.f9222g.a(resolver) == c1362t4.f9222g.a(otherResolver);
    }

    public final int b() {
        Integer num = this.f9223h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f9216a.hashCode() + kotlin.jvm.internal.x.a(C1362t4.class).hashCode();
        A7.b<Long> bVar = this.f9217b;
        int iHashCode2 = this.f9219d.hashCode() + this.f9218c.hashCode() + iHashCode + (bVar != null ? bVar.hashCode() : 0);
        A7.b<Long> bVar2 = this.f9220e;
        int iHashCode3 = this.f9222g.hashCode() + this.f9221f.hashCode() + iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        this.f9223h = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1376u4.b bVar = (C1376u4.b) D7.a.f1071b.f6630V2.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1376u4.b.d(c0011a, this);
    }

    public C1362t4(A7.b<Long> bottom, A7.b<Long> bVar, A7.b<Long> left, A7.b<Long> right, A7.b<Long> bVar2, A7.b<Long> top, A7.b<H9> unit) {
        kotlin.jvm.internal.l.f(bottom, "bottom");
        kotlin.jvm.internal.l.f(left, "left");
        kotlin.jvm.internal.l.f(right, "right");
        kotlin.jvm.internal.l.f(top, "top");
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f9216a = bottom;
        this.f9217b = bVar;
        this.f9218c = left;
        this.f9219d = right;
        this.f9220e = bVar2;
        this.f9221f = top;
        this.f9222g = unit;
    }

    public /* synthetic */ C1362t4(b.C0000b c0000b, b.C0000b c0000b2, b.C0000b c0000b3, b.C0000b c0000b4, int i10) {
        this((i10 & 1) != 0 ? i : c0000b, null, (i10 & 4) != 0 ? f9212j : c0000b2, (i10 & 8) != 0 ? f9213k : c0000b3, null, (i10 & 32) != 0 ? f9214l : c0000b4, f9215m);
    }
}

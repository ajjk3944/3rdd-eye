package N7;

import A7.b;
import D7.a;
import N7.C1100b0;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAbsoluteEdgeInsets.kt */
/* renamed from: N7.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1085a0 implements InterfaceC5868a {

    /* renamed from: f, reason: collision with root package name */
    public static final b.C0000b f7877f = b.a.a(0L);

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f7878g = b.a.a(0L);

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f7879h = b.a.a(0L);
    public static final b.C0000b i = b.a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f7880a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f7881b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f7882c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f7883d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f7884e;

    public C1085a0(A7.b<Long> bottom, A7.b<Long> left, A7.b<Long> right, A7.b<Long> top) {
        kotlin.jvm.internal.l.f(bottom, "bottom");
        kotlin.jvm.internal.l.f(left, "left");
        kotlin.jvm.internal.l.f(right, "right");
        kotlin.jvm.internal.l.f(top, "top");
        this.f7880a = bottom;
        this.f7881b = left;
        this.f7882c = right;
        this.f7883d = top;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1100b0.a aVar = (C1100b0.a) D7.a.f1071b.f6449E.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return C1100b0.a.d(c0011a, this);
    }

    public C1085a0() {
        this(f7877f, f7878g, f7879h, i);
    }
}

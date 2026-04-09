package N7;

import A7.b;
import D7.a;
import N7.C1103b3;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivChangeBoundsTransition.kt */
/* renamed from: N7.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1088a3 implements InterfaceC5868a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.C0000b f7886e = b.a.a(200L);

    /* renamed from: f, reason: collision with root package name */
    public static final b.C0000b f7887f = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f7888g = b.a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f7889a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f7890b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f7891c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f7892d;

    public C1088a3(A7.b<Long> duration, A7.b<EnumC1360t2> interpolator, A7.b<Long> startDelay) {
        kotlin.jvm.internal.l.f(duration, "duration");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f7889a = duration;
        this.f7890b = interpolator;
        this.f7891c = startDelay;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1103b3.b bVar = (C1103b3.b) D7.a.f1071b.f6525L1.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1103b3.b.e(c0011a, this);
    }

    public C1088a3() {
        this(f7886e, f7887f, f7888g);
    }
}

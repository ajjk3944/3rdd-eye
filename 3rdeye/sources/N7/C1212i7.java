package N7;

import A7.b;
import N7.C1226j7;
import N7.H3;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivNumberAnimator.kt */
/* renamed from: N7.i7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1212i7 implements InterfaceC5868a, InterfaceC1416x2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1175g0> f8406a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1346s2> f8407b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f8408c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f8409d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Double> f8410e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8411f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f8412g;

    /* renamed from: h, reason: collision with root package name */
    public final H3 f8413h;
    public final A7.b<Long> i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<Double> f8414j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8415k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f8416l;

    static {
        b.a.a(EnumC1346s2.NORMAL);
        b.a.a(EnumC1360t2.LINEAR);
        new H3.a(new P4(b.a.a(1L)));
        b.a.a(0L);
    }

    public C1212i7(List<C1175g0> list, A7.b<EnumC1346s2> direction, A7.b<Long> bVar, List<C1175g0> list2, A7.b<Double> bVar2, String str, A7.b<EnumC1360t2> interpolator, H3 h32, A7.b<Long> startDelay, A7.b<Double> bVar3, String str2) {
        kotlin.jvm.internal.l.f(direction, "direction");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f8406a = list;
        this.f8407b = direction;
        this.f8408c = bVar;
        this.f8409d = list2;
        this.f8410e = bVar2;
        this.f8411f = str;
        this.f8412g = interpolator;
        this.f8413h = h32;
        this.i = startDelay;
        this.f8414j = bVar3;
        this.f8415k = str2;
    }

    @Override // N7.InterfaceC1416x2
    public final List<C1175g0> a() {
        return this.f8409d;
    }

    @Override // N7.InterfaceC1416x2
    public final H3 b() {
        return this.f8413h;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<EnumC1346s2> c() {
        return this.f8407b;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<EnumC1360t2> d() {
        return this.f8412g;
    }

    @Override // N7.InterfaceC1416x2
    public final List<C1175g0> e() {
        return this.f8406a;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<Long> f() {
        return this.i;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<Long> getDuration() {
        return this.f8408c;
    }

    @Override // N7.InterfaceC1416x2
    public final String getId() {
        return this.f8411f;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1226j7.c) D7.a.f1071b.f6699b5.getValue()).b(D7.a.f1070a, this);
    }
}

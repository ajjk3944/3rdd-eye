package N7;

import A7.b;
import N7.C1403w3;
import N7.H3;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivColorAnimator.kt */
/* renamed from: N7.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389v3 implements InterfaceC5868a, InterfaceC1416x2 {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1175g0> f9553a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<EnumC1346s2> f9554b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f9555c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f9556d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Integer> f9557e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9558f;

    /* renamed from: g, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f9559g;

    /* renamed from: h, reason: collision with root package name */
    public final H3 f9560h;
    public final A7.b<Long> i;

    /* renamed from: j, reason: collision with root package name */
    public final A7.b<Integer> f9561j;

    /* renamed from: k, reason: collision with root package name */
    public final String f9562k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f9563l;

    static {
        b.a.a(EnumC1346s2.NORMAL);
        b.a.a(EnumC1360t2.LINEAR);
        new H3.a(new P4(b.a.a(1L)));
        b.a.a(0L);
    }

    public C1389v3(List<C1175g0> list, A7.b<EnumC1346s2> direction, A7.b<Long> bVar, List<C1175g0> list2, A7.b<Integer> bVar2, String str, A7.b<EnumC1360t2> interpolator, H3 h32, A7.b<Long> startDelay, A7.b<Integer> bVar3, String str2) {
        kotlin.jvm.internal.l.f(direction, "direction");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f9553a = list;
        this.f9554b = direction;
        this.f9555c = bVar;
        this.f9556d = list2;
        this.f9557e = bVar2;
        this.f9558f = str;
        this.f9559g = interpolator;
        this.f9560h = h32;
        this.i = startDelay;
        this.f9561j = bVar3;
        this.f9562k = str2;
    }

    @Override // N7.InterfaceC1416x2
    public final List<C1175g0> a() {
        return this.f9556d;
    }

    @Override // N7.InterfaceC1416x2
    public final H3 b() {
        return this.f9560h;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<EnumC1346s2> c() {
        return this.f9554b;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<EnumC1360t2> d() {
        return this.f9559g;
    }

    @Override // N7.InterfaceC1416x2
    public final List<C1175g0> e() {
        return this.f9553a;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<Long> f() {
        return this.i;
    }

    @Override // N7.InterfaceC1416x2
    public final A7.b<Long> getDuration() {
        return this.f9555c;
    }

    @Override // N7.InterfaceC1416x2
    public final String getId() {
        return this.f9558f;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1403w3.c) D7.a.f1071b.f6755g2.getValue()).b(D7.a.f1070a, this);
    }
}

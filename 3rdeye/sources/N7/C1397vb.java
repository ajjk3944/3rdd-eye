package N7;

import A7.b;
import N7.C1411wb;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTimer.kt */
/* renamed from: N7.vb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397vb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f9639a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1175g0> f9640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9641c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f9642d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Long> f9643e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9644f;

    static {
        new b.C0000b(0L);
    }

    public C1397vb(A7.b<Long> duration, List<C1175g0> list, String str, List<C1175g0> list2, A7.b<Long> bVar, String str2) {
        kotlin.jvm.internal.l.f(duration, "duration");
        this.f9639a = duration;
        this.f9640b = list;
        this.f9641c = str;
        this.f9642d = list2;
        this.f9643e = bVar;
        this.f9644f = str2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1411wb.a) D7.a.f1071b.f6447D8.getValue()).b(D7.a.f1070a, this);
    }
}

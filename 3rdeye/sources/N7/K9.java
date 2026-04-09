package N7;

import A7.b;
import N7.I9;
import N7.J9;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSlideTransitionTemplate.kt */
/* loaded from: classes.dex */
public final class K9 implements InterfaceC5868a, z7.b<I9> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<C1164f4> f5622a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f5623b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<I9.a>> f5624c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1360t2>> f5625d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f5626e;

    static {
        b.a.a(200L);
        b.a.a(I9.a.BOTTOM);
        b.a.a(EnumC1360t2.EASE_IN_OUT);
        b.a.a(0L);
    }

    public K9(AbstractC5371a<C1164f4> abstractC5371a, AbstractC5371a<A7.b<Long>> abstractC5371a2, AbstractC5371a<A7.b<I9.a>> abstractC5371a3, AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a4, AbstractC5371a<A7.b<Long>> abstractC5371a5) {
        this.f5622a = abstractC5371a;
        this.f5623b = abstractC5371a2;
        this.f5624c = abstractC5371a3;
        this.f5625d = abstractC5371a4;
        this.f5626e = abstractC5371a5;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((J9.d) D7.a.f1071b.f6645W6.getValue()).b(D7.a.f1070a, this);
    }
}

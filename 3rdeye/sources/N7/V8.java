package N7;

import A7.b;
import D7.a;
import N7.AbstractC1408w8;
import N7.C1394v8;
import N7.C8;
import N7.H8;
import N7.I8;
import N7.S8;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientTemplate.kt */
/* loaded from: classes.dex */
public final class V8 implements InterfaceC5868a, z7.b<C1394v8> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A8> f7577a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A8> f7578b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<List<a>> f7579c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.c<Integer>> f7580d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<M8> f7581e;

    /* compiled from: DivRadialGradientTemplate.kt */
    public static final class a implements InterfaceC5868a, z7.b<C1394v8.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Integer>> f7582a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Double>> f7583b;

        public a(AbstractC5371a<A7.b<Integer>> abstractC5371a, AbstractC5371a<A7.b<Double>> abstractC5371a2) {
            this.f7582a = abstractC5371a;
            this.f7583b = abstractC5371a2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C8.b bVar = (C8.b) D7.a.f1071b.f6857p6.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            bVar.getClass();
            return C8.b.d(c0011a, this);
        }
    }

    static {
        new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));
        new AbstractC1408w8.b(new N8(b.a.a(Double.valueOf(0.5d))));
        new I8.b(new S8(b.a.a(S8.a.FARTHEST_CORNER)));
    }

    public V8(AbstractC5371a<A8> abstractC5371a, AbstractC5371a<A8> abstractC5371a2, AbstractC5371a<List<a>> abstractC5371a3, AbstractC5371a<A7.c<Integer>> abstractC5371a4, AbstractC5371a<M8> abstractC5371a5) {
        this.f7577a = abstractC5371a;
        this.f7578b = abstractC5371a2;
        this.f7579c = abstractC5371a3;
        this.f7580d = abstractC5371a4;
        this.f7581e = abstractC5371a5;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((H8.b) D7.a.f1071b.f6825m6.getValue()).b(D7.a.f1070a, this);
    }
}

package N7;

import A7.b;
import D7.a;
import N7.R6;
import N7.S6;
import N7.T6;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivLinearGradientTemplate.kt */
/* loaded from: classes.dex */
public final class U6 implements InterfaceC5868a, z7.b<R6> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f6390a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<List<a>> f6391b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.c<Integer>> f6392c;

    /* compiled from: DivLinearGradientTemplate.kt */
    public static final class a implements InterfaceC5868a, z7.b<R6.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Integer>> f6393a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Double>> f6394b;

        public a(AbstractC5371a<A7.b<Integer>> abstractC5371a, AbstractC5371a<A7.b<Double>> abstractC5371a2) {
            this.f6393a = abstractC5371a;
            this.f6394b = abstractC5371a2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            S6.b bVar = (S6.b) D7.a.f1071b.f6579Q4.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            bVar.getClass();
            return S6.b.d(c0011a, this);
        }
    }

    static {
        new b.C0000b(0L);
    }

    public U6(AbstractC5371a<A7.b<Long>> abstractC5371a, AbstractC5371a<List<a>> abstractC5371a2, AbstractC5371a<A7.c<Integer>> abstractC5371a3) {
        this.f6390a = abstractC5371a;
        this.f6391b = abstractC5371a2;
        this.f6392c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T6.b) D7.a.f1071b.f6547N4.getValue()).b(D7.a.f1070a, this);
    }
}

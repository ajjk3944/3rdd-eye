package N7;

import A7.b;
import D7.a;
import N7.C1412wc;
import N7.C1426xc;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivWrapContentSizeTemplate.kt */
/* loaded from: classes.dex */
public final class Bc implements InterfaceC5868a, z7.b<C1412wc> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f5001a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<a> f5002b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<a> f5003c;

    /* compiled from: DivWrapContentSizeTemplate.kt */
    public static final class a implements InterfaceC5868a, z7.b<C1412wc.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<A7.b<H9>> f5004a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Long>> f5005b;

        static {
            H9 value = H9.DP;
            kotlin.jvm.internal.l.f(value, "value");
            new b.C0000b(value);
        }

        public a(AbstractC5371a<A7.b<H9>> abstractC5371a, AbstractC5371a<A7.b<Long>> abstractC5371a2) {
            this.f5004a = abstractC5371a;
            this.f5005b = abstractC5371a2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1426xc.c cVar = (C1426xc.c) D7.a.f1071b.f6913u9.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            cVar.getClass();
            return C1426xc.c.d(c0011a, this);
        }
    }

    public Bc(AbstractC5371a<A7.b<Boolean>> abstractC5371a, AbstractC5371a<a> abstractC5371a2, AbstractC5371a<a> abstractC5371a3) {
        this.f5001a = abstractC5371a;
        this.f5002b = abstractC5371a2;
        this.f5003c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1454zc) D7.a.f1071b.r9.getValue()).b(D7.a.f1070a, this);
    }
}

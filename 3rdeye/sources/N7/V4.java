package N7;

import A7.b;
import D7.a;
import N7.S4;
import N7.T4;
import N7.U4;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFixedLengthInputMaskTemplate.kt */
/* loaded from: classes.dex */
public final class V4 implements InterfaceC5868a, z7.b<S4> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<String>> f7565b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<List<a>> f7566c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<String> f7567d;

    /* compiled from: DivFixedLengthInputMaskTemplate.kt */
    public static final class a implements InterfaceC5868a, z7.b<S4.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<A7.b<String>> f7568a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<String>> f7569b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC5371a<A7.b<String>> f7570c;

        static {
            new b.d("_");
        }

        public a(AbstractC5371a<A7.b<String>> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2, AbstractC5371a<A7.b<String>> abstractC5371a3) {
            this.f7568a = abstractC5371a;
            this.f7569b = abstractC5371a2;
            this.f7570c = abstractC5371a3;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            U4.b bVar = (U4.b) D7.a.f1071b.f6876r3.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            bVar.getClass();
            return U4.b.d(c0011a, this);
        }
    }

    static {
        new b.C0000b(Boolean.FALSE);
    }

    public V4(AbstractC5371a<A7.b<Boolean>> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2, AbstractC5371a<List<a>> abstractC5371a3, AbstractC5371a<String> abstractC5371a4) {
        this.f7564a = abstractC5371a;
        this.f7565b = abstractC5371a2;
        this.f7566c = abstractC5371a3;
        this.f7567d = abstractC5371a4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T4.b) D7.a.f1071b.f6843o3.getValue()).b(D7.a.f1070a, this);
    }
}

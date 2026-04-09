package N7;

import A7.b;
import N7.P7;
import N7.T7;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPatchTemplate.kt */
/* loaded from: classes.dex */
public final class U7 implements InterfaceC5868a, z7.b<P7> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<List<a>> f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<P7.b>> f6396b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f6397c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<List<C1132d2>> f6398d;

    /* compiled from: DivPatchTemplate.kt */
    public static final class a implements InterfaceC5868a, z7.b<P7.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<String> f6399a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<List<Ja>> f6400b;

        public a(AbstractC5371a<String> abstractC5371a, AbstractC5371a<List<Ja>> abstractC5371a2) {
            this.f6399a = abstractC5371a;
            this.f6400b = abstractC5371a2;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((R7) D7.a.f1071b.f6433C5.getValue()).b(D7.a.f1070a, this);
        }
    }

    static {
        P7.b value = P7.b.PARTIAL;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public U7(AbstractC5371a<List<a>> abstractC5371a, AbstractC5371a<A7.b<P7.b>> abstractC5371a2, AbstractC5371a<List<C1132d2>> abstractC5371a3, AbstractC5371a<List<C1132d2>> abstractC5371a4) {
        this.f6395a = abstractC5371a;
        this.f6396b = abstractC5371a2;
        this.f6397c = abstractC5371a3;
        this.f6398d = abstractC5371a4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T7.c) D7.a.f1071b.f6411A5.getValue()).b(D7.a.f1070a, this);
    }
}

package N7;

import A7.b;
import N7.C1333r3;
import N7.C1347s3;
import N7.C1361t3;
import java.util.List;
import n7.AbstractC5371a;
import org.json.JSONArray;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCollectionItemBuilderTemplate.kt */
/* renamed from: N7.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375u3 implements InterfaceC5868a, z7.b<C1333r3> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<JSONArray>> f9376a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<String> f9377b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<List<a>> f9378c;

    /* compiled from: DivCollectionItemBuilderTemplate.kt */
    /* renamed from: N7.u3$a */
    public static final class a implements InterfaceC5868a, z7.b<C1333r3.a> {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC5371a<Ja> f9379a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5371a<A7.b<String>> f9380b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC5371a<A7.b<Boolean>> f9381c;

        static {
            new b.C0000b(Boolean.TRUE);
        }

        public a(AbstractC5371a<Ja> abstractC5371a, AbstractC5371a<A7.b<String>> abstractC5371a2, AbstractC5371a<A7.b<Boolean>> abstractC5371a3) {
            this.f9379a = abstractC5371a;
            this.f9380b = abstractC5371a2;
            this.f9381c = abstractC5371a3;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((C1361t3.b) D7.a.f1071b.f6732e2.getValue()).b(D7.a.f1070a, this);
        }
    }

    public C1375u3(AbstractC5371a<A7.b<JSONArray>> abstractC5371a, AbstractC5371a<String> abstractC5371a2, AbstractC5371a<List<a>> abstractC5371a3) {
        this.f9376a = abstractC5371a;
        this.f9377b = abstractC5371a2;
        this.f9378c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1347s3.b) D7.a.f1071b.f6696b2.getValue()).b(D7.a.f1070a, this);
    }
}

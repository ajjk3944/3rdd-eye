package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivShapeTemplate.kt */
/* loaded from: classes.dex */
public abstract class A9 implements InterfaceC5868a, z7.b<AbstractC1339r9> {

    /* compiled from: DivShapeTemplate.kt */
    public static final class a extends A9 {

        /* renamed from: a, reason: collision with root package name */
        public final C1278n3 f4789a;

        public a(C1278n3 c1278n3) {
            this.f4789a = c1278n3;
        }
    }

    /* compiled from: DivShapeTemplate.kt */
    public static final class b extends A9 {

        /* renamed from: a, reason: collision with root package name */
        public final Y8 f4790a;

        public b(Y8 y82) {
            this.f4790a = y82;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1437y9) D7.a.f1071b.f6580Q6.getValue()).b(D7.a.f1070a, this);
    }
}

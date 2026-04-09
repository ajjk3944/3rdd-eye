package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAnimatorTemplate.kt */
/* loaded from: classes.dex */
public abstract class B2 implements InterfaceC5868a, z7.b<AbstractC1402w2> {

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class a extends B2 {

        /* renamed from: a, reason: collision with root package name */
        public final C1417x3 f4833a;

        public a(C1417x3 c1417x3) {
            this.f4833a = c1417x3;
        }
    }

    /* compiled from: DivAnimatorTemplate.kt */
    public static final class b extends B2 {

        /* renamed from: a, reason: collision with root package name */
        public final C1240k7 f4834a;

        public b(C1240k7 c1240k7) {
            this.f4834a = c1240k7;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1444z2) D7.a.f1071b.f6874r1.getValue()).b(D7.a.f1070a, this);
    }
}

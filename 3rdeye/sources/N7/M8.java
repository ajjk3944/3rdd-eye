package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientRadiusTemplate.kt */
/* loaded from: classes.dex */
public abstract class M8 implements InterfaceC5868a, z7.b<I8> {

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class a extends M8 {

        /* renamed from: a, reason: collision with root package name */
        public final Y4 f5861a;

        public a(Y4 y42) {
            this.f5861a = y42;
        }
    }

    /* compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class b extends M8 {

        /* renamed from: a, reason: collision with root package name */
        public final U8 f5862a;

        public b(U8 u8) {
            this.f5862a = u8;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((K8) D7.a.f1071b.f6724d6.getValue()).b(D7.a.f1070a, this);
    }
}

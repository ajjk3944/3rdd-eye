package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextGradient.kt */
/* loaded from: classes.dex */
public abstract class Pa implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f6017a;

    /* compiled from: DivTextGradient.kt */
    public static final class a extends Pa {

        /* renamed from: b, reason: collision with root package name */
        public final R6 f6018b;

        public a(R6 r62) {
            this.f6018b = r62;
        }
    }

    /* compiled from: DivTextGradient.kt */
    public static final class b extends Pa {

        /* renamed from: b, reason: collision with root package name */
        public final C1394v8 f6019b;

        public b(C1394v8 c1394v8) {
            this.f6019b = c1394v8;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Qa) D7.a.f1071b.f6624U7.getValue()).b(D7.a.f1070a, this);
    }
}

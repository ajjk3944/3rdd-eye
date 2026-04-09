package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientRadius.kt */
/* loaded from: classes.dex */
public abstract class I8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5475a;

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class a extends I8 {

        /* renamed from: b, reason: collision with root package name */
        public final W4 f5476b;

        public a(W4 w42) {
            this.f5476b = w42;
        }
    }

    /* compiled from: DivRadialGradientRadius.kt */
    public static final class b extends I8 {

        /* renamed from: b, reason: collision with root package name */
        public final S8 f5477b;

        public b(S8 s82) {
            this.f5477b = s82;
        }
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((J8) D7.a.f1071b.f6712c6.getValue()).b(D7.a.f1070a, this);
    }
}

package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivBackgroundTemplate.kt */
/* loaded from: classes.dex */
public abstract class R2 implements InterfaceC5868a, z7.b<N2> {

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class a extends R2 {

        /* renamed from: a, reason: collision with root package name */
        public final C5 f6108a;

        public a(C5 c52) {
            this.f6108a = c52;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class b extends R2 {

        /* renamed from: a, reason: collision with root package name */
        public final U6 f6109a;

        public b(U6 u62) {
            this.f6109a = u62;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class c extends R2 {

        /* renamed from: a, reason: collision with root package name */
        public final C1197h7 f6110a;

        public c(C1197h7 c1197h7) {
            this.f6110a = c1197h7;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class d extends R2 {

        /* renamed from: a, reason: collision with root package name */
        public final V8 f6111a;

        public d(V8 v82) {
            this.f6111a = v82;
        }
    }

    /* compiled from: DivBackgroundTemplate.kt */
    public static final class e extends R2 {

        /* renamed from: a, reason: collision with root package name */
        public final W9 f6112a;

        public e(W9 w92) {
            this.f6112a = w92;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).f6109a;
        }
        if (this instanceof d) {
            return ((d) this).f6111a;
        }
        if (this instanceof a) {
            return ((a) this).f6108a;
        }
        if (this instanceof e) {
            return ((e) this).f6112a;
        }
        if (this instanceof c) {
            return ((c) this).f6110a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((P2) D7.a.f1071b.f6440D1.getValue()).b(D7.a.f1070a, this);
    }
}

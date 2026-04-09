package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAppearanceTransitionTemplate.kt */
/* loaded from: classes.dex */
public abstract class J2 implements InterfaceC5868a, z7.b<F2> {

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class a extends J2 {

        /* renamed from: a, reason: collision with root package name */
        public final E4 f5564a;

        public a(E4 e4) {
            this.f5564a = e4;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class b extends J2 {

        /* renamed from: a, reason: collision with root package name */
        public final C1124c9 f5565a;

        public b(C1124c9 c1124c9) {
            this.f5565a = c1124c9;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class c extends J2 {

        /* renamed from: a, reason: collision with root package name */
        public final E2 f5566a;

        public c(E2 e22) {
            this.f5566a = e22;
        }
    }

    /* compiled from: DivAppearanceTransitionTemplate.kt */
    public static final class d extends J2 {

        /* renamed from: a, reason: collision with root package name */
        public final K9 f5567a;

        public d(K9 k92) {
            this.f5567a = k92;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f5566a;
        }
        if (this instanceof a) {
            return ((a) this).f5564a;
        }
        if (this instanceof b) {
            return ((b) this).f5565a;
        }
        if (this instanceof d) {
            return ((d) this).f5567a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((H2) D7.a.f1071b.f6938x1.getValue()).b(D7.a.f1070a, this);
    }
}

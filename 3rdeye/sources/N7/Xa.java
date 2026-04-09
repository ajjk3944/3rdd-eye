package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTextRangeBackground.kt */
/* loaded from: classes.dex */
public abstract class Xa implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f7751a;

    /* compiled from: DivTextRangeBackground.kt */
    public static final class a extends Xa {

        /* renamed from: b, reason: collision with root package name */
        public final C1292o3 f7752b;

        public a(C1292o3 c1292o3) {
            this.f7752b = c1292o3;
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    public static final class b extends Xa {

        /* renamed from: b, reason: collision with root package name */
        public final S9 f7753b;

        public b(S9 s92) {
            this.f7753b = s92;
        }
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).f7753b;
        }
        if (this instanceof a) {
            return ((a) this).f7752b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Ya) D7.a.f1071b.f6656X7.getValue()).b(D7.a.f1070a, this);
    }
}

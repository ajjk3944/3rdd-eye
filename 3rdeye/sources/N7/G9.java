package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSizeTemplate.kt */
/* loaded from: classes.dex */
public abstract class G9 implements InterfaceC5868a, z7.b<C9> {

    /* compiled from: DivSizeTemplate.kt */
    public static final class a extends G9 {

        /* renamed from: a, reason: collision with root package name */
        public final Y4 f5376a;

        public a(Y4 y42) {
            this.f5376a = y42;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class b extends G9 {

        /* renamed from: a, reason: collision with root package name */
        public final X6 f5377a;

        public b(X6 x62) {
            this.f5377a = x62;
        }
    }

    /* compiled from: DivSizeTemplate.kt */
    public static final class c extends G9 {

        /* renamed from: a, reason: collision with root package name */
        public final Bc f5378a;

        public c(Bc bc) {
            this.f5378a = bc;
        }
    }

    public final Object a() {
        if (this instanceof a) {
            return ((a) this).f5376a;
        }
        if (this instanceof b) {
            return ((b) this).f5377a;
        }
        if (this instanceof c) {
            return ((c) this).f5378a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((E9) D7.a.f1071b.f6613T6.getValue()).b(D7.a.f1070a, this);
    }
}

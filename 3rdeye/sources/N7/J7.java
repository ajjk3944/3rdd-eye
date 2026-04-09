package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPagerLayoutMode.kt */
/* loaded from: classes.dex */
public abstract class J7 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5572a;

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class a extends J7 {

        /* renamed from: b, reason: collision with root package name */
        public final Y6 f5573b;

        public a(Y6 y62) {
            this.f5573b = y62;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class b extends J7 {

        /* renamed from: b, reason: collision with root package name */
        public final C1254l7 f5574b;

        public b(C1254l7 c1254l7) {
            this.f5574b = c1254l7;
        }
    }

    /* compiled from: DivPagerLayoutMode.kt */
    public static final class c extends J7 {

        /* renamed from: b, reason: collision with root package name */
        public final C1324q7 f5575b;

        public c(C1324q7 c1324q7) {
            this.f5575b = c1324q7;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f5575b;
        }
        if (this instanceof a) {
            return ((a) this).f5573b;
        }
        if (this instanceof b) {
            return ((b) this).f5574b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((K7) D7.a.f1071b.f6899t5.getValue()).b(D7.a.f1070a, this);
    }
}

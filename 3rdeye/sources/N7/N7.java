package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPagerLayoutModeTemplate.kt */
/* loaded from: classes.dex */
public abstract class N7 implements InterfaceC5868a, z7.b<J7> {

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class a extends N7 {

        /* renamed from: a, reason: collision with root package name */
        public final C1122c7 f5935a;

        public a(C1122c7 c1122c7) {
            this.f5935a = c1122c7;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class b extends N7 {

        /* renamed from: a, reason: collision with root package name */
        public final C1310p7 f5936a;

        public b(C1310p7 c1310p7) {
            this.f5936a = c1310p7;
        }
    }

    /* compiled from: DivPagerLayoutModeTemplate.kt */
    public static final class c extends N7 {

        /* renamed from: a, reason: collision with root package name */
        public final C1379u7 f5937a;

        public c(C1379u7 c1379u7) {
            this.f5937a = c1379u7;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f5937a;
        }
        if (this instanceof a) {
            return ((a) this).f5935a;
        }
        if (this instanceof b) {
            return ((b) this).f5936a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((L7) D7.a.f1071b.f6910u5.getValue()).b(D7.a.f1070a, this);
    }
}

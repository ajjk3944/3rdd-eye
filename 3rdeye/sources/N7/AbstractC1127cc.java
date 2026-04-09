package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTypedValueTemplate.kt */
/* renamed from: N7.cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1127cc implements InterfaceC5868a, z7.b<Yb> {

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$a */
    public static final class a extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final C1144e f8026a;

        public a(C1144e c1144e) {
            this.f8026a = c1144e;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$b */
    public static final class b extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final C1288o f8027a;

        public b(C1288o c1288o) {
            this.f8027a = c1288o;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$c */
    public static final class c extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final C1427y f8028a;

        public c(C1427y c1427y) {
            this.f8028a = c1427y;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$d */
    public static final class d extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final T f8029a;

        public d(T t10) {
            this.f8029a = t10;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$e */
    public static final class e extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final Oc f8030a;

        public e(Oc oc) {
            this.f8030a = oc;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$f */
    public static final class f extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final Zc f8031a;

        public f(Zc zc) {
            this.f8031a = zc;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$g */
    public static final class g extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final sd f8032a;

        public g(sd sdVar) {
            this.f8032a = sdVar;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    /* renamed from: N7.cc$h */
    public static final class h extends AbstractC1127cc {

        /* renamed from: a, reason: collision with root package name */
        public final Cd f8033a;

        public h(Cd cd) {
            this.f8033a = cd;
        }
    }

    public final Object a() {
        if (this instanceof g) {
            return ((g) this).f8032a;
        }
        if (this instanceof e) {
            return ((e) this).f8030a;
        }
        if (this instanceof f) {
            return ((f) this).f8031a;
        }
        if (this instanceof c) {
            return ((c) this).f8028a;
        }
        if (this instanceof b) {
            return ((b) this).f8027a;
        }
        if (this instanceof h) {
            return ((h) this).f8033a;
        }
        if (this instanceof d) {
            return ((d) this).f8029a;
        }
        if (this instanceof a) {
            return ((a) this).f8026a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1097ac) D7.a.f1071b.f6679Z8.getValue()).b(D7.a.f1070a, this);
    }
}

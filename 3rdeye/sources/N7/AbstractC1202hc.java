package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivVariableTemplate.kt */
/* renamed from: N7.hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1202hc implements InterfaceC5868a, z7.b<AbstractC1142dc> {

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$a */
    public static final class a extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final C1218j f8367a;

        public a(C1218j c1218j) {
            this.f8367a = c1218j;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$b */
    public static final class b extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final C1357t f8368a;

        public b(C1357t c1357t) {
            this.f8368a = c1357t;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$c */
    public static final class c extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final D f8369a;

        public c(D d10) {
            this.f8369a = d10;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$d */
    public static final class d extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final Y f8370a;

        public d(Y y10) {
            this.f8370a = y10;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$e */
    public static final class e extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final Tc f8371a;

        public e(Tc tc) {
            this.f8371a = tc;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$f */
    public static final class f extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final C1158ed f8372a;

        public f(C1158ed c1158ed) {
            this.f8372a = c1158ed;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$g */
    public static final class g extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final xd f8373a;

        public g(xd xdVar) {
            this.f8373a = xdVar;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    /* renamed from: N7.hc$h */
    public static final class h extends AbstractC1202hc {

        /* renamed from: a, reason: collision with root package name */
        public final Hd f8374a;

        public h(Hd hd) {
            this.f8374a = hd;
        }
    }

    public final Object a() {
        if (this instanceof g) {
            return ((g) this).f8373a;
        }
        if (this instanceof f) {
            return ((f) this).f8372a;
        }
        if (this instanceof e) {
            return ((e) this).f8371a;
        }
        if (this instanceof b) {
            return ((b) this).f8368a;
        }
        if (this instanceof c) {
            return ((c) this).f8369a;
        }
        if (this instanceof h) {
            return ((h) this).f8374a;
        }
        if (this instanceof d) {
            return ((d) this).f8370a;
        }
        if (this instanceof a) {
            return ((a) this).f8367a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1172fc) D7.a.f1071b.f6715c9.getValue()).b(D7.a.f1070a, this);
    }
}

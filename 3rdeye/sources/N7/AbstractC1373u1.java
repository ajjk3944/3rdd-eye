package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionScrollDestination.kt */
/* renamed from: N7.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1373u1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f9358a;

    /* compiled from: DivActionScrollDestination.kt */
    /* renamed from: N7.u1$a */
    public static final class a extends AbstractC1373u1 {

        /* renamed from: b, reason: collision with root package name */
        public final Cc f9359b;

        public a(Cc cc) {
            this.f9359b = cc;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    /* renamed from: N7.u1$b */
    public static final class b extends AbstractC1373u1 {

        /* renamed from: b, reason: collision with root package name */
        public final Hc f9360b;

        public b(Hc hc) {
            this.f9360b = hc;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    /* renamed from: N7.u1$c */
    public static final class c extends AbstractC1373u1 {

        /* renamed from: b, reason: collision with root package name */
        public final C1173fd f9361b;

        public c(C1173fd c1173fd) {
            this.f9361b = c1173fd;
        }
    }

    /* compiled from: DivActionScrollDestination.kt */
    /* renamed from: N7.u1$d */
    public static final class d extends AbstractC1373u1 {

        /* renamed from: b, reason: collision with root package name */
        public final jd f9362b;

        public d(jd jdVar) {
            this.f9362b = jdVar;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f9361b;
        }
        if (this instanceof b) {
            return ((b) this).f9360b;
        }
        if (this instanceof d) {
            return ((d) this).f9362b;
        }
        if (this instanceof a) {
            return ((a) this).f9359b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1387v1) D7.a.f1071b.f6937x0.getValue()).b(D7.a.f1070a, this);
    }
}

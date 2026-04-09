package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionScrollDestinationTemplate.kt */
/* renamed from: N7.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1429y1 implements InterfaceC5868a, z7.b<AbstractC1373u1> {

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    /* renamed from: N7.y1$a */
    public static final class a extends AbstractC1429y1 {

        /* renamed from: a, reason: collision with root package name */
        public final Gc f9808a;

        public a(Gc gc) {
            this.f9808a = gc;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    /* renamed from: N7.y1$b */
    public static final class b extends AbstractC1429y1 {

        /* renamed from: a, reason: collision with root package name */
        public final Jc f9809a;

        public b(Jc jc) {
            this.f9809a = jc;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    /* renamed from: N7.y1$c */
    public static final class c extends AbstractC1429y1 {

        /* renamed from: a, reason: collision with root package name */
        public final C1203hd f9810a;

        public c(C1203hd c1203hd) {
            this.f9810a = c1203hd;
        }
    }

    /* compiled from: DivActionScrollDestinationTemplate.kt */
    /* renamed from: N7.y1$d */
    public static final class d extends AbstractC1429y1 {

        /* renamed from: a, reason: collision with root package name */
        public final nd f9811a;

        public d(nd ndVar) {
            this.f9811a = ndVar;
        }
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).f9810a;
        }
        if (this instanceof b) {
            return ((b) this).f9809a;
        }
        if (this instanceof d) {
            return ((d) this).f9811a;
        }
        if (this instanceof a) {
            return ((a) this).f9808a;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1401w1) D7.a.f1071b.f6948y0.getValue()).b(D7.a.f1070a, this);
    }
}

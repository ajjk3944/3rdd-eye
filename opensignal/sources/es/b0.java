package es;

import io.sentry.y5;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import lf.t1;
import lr.z1;
import y1.u1;

/* loaded from: classes.dex */
public final class b0 extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8266d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8267g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8268r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8269x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f8266d = i10;
        this.f8267g = obj;
        this.f8268r = obj2;
        this.f8269x = obj3;
    }

    @Override // ar.a
    public final Object c() {
        int i10 = this.f8266d;
        lq.b0 b0Var = lq.b0.f15562a;
        Object obj = this.f8267g;
        Object obj2 = this.f8269x;
        Object obj3 = this.f8268r;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj;
                gt.o oVar = ((ds.a) c0Var.f8271b.f3974d).f7446a;
                z zVar = new z(c0Var, (xr.u) obj3, (cs.h) obj2);
                gt.l lVar = (gt.l) oVar;
                lVar.getClass();
                return new gt.h(lVar, zVar);
            case 1:
                return ((rs.c) ((rs.y) obj)).b((ByteArrayInputStream) obj3, ((dt.k) ((ft.q) obj2).f9105b.f810b).f7506p);
            case 2:
                Integer num = (Integer) obj3;
                io.sentry.android.replay.j jVar = ((io.sentry.android.replay.capture.c) obj2).f11868h;
                if (jVar != null) {
                    jVar.i("segment.id", String.valueOf(num));
                }
                return b0Var;
            case 3:
                y5 y5Var = (y5) obj3;
                io.sentry.android.replay.j jVar2 = ((io.sentry.android.replay.capture.c) obj2).f11868h;
                if (jVar2 != null) {
                    jVar2.i("replay.type", String.valueOf(y5Var));
                }
                return b0Var;
            case 4:
                lr.w wVar = (lr.w) obj3;
                lr.z zVar2 = (lr.z) obj2;
                rr.i iVarP = ((ht.x) obj).Z().p();
                if (!(iVarP instanceof rr.f)) {
                    throw new lq.k("Supertype not a class: " + iVarP, 1);
                }
                Class clsJ = z1.j((rr.f) iVarP);
                if (clsJ == null) {
                    throw new lq.k("Unsupported superclass of " + wVar + ": " + iVarP, 1);
                }
                Class cls = zVar2.f15719d;
                if (br.l.a(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    br.l.d(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                br.l.d(interfaces, "jClass.interfaces");
                int iR0 = mq.l.r0(clsJ, interfaces);
                if (iR0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iR0];
                    br.l.d(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new lq.k("No superclass of " + wVar + " in Java reflection for " + iVarP, 1);
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                t1 t1Var = ((ou.j) obj).f19923b;
                br.l.b(t1Var);
                return t1Var.g(((ou.a) obj2).f19858h.f19970d, ((ou.r) obj3).a());
            default:
                y1.a aVar = (y1.a) obj;
                aVar.removeOnAttachStateChangeListener((g1.e) obj3);
                u1 u1Var = (u1) obj2;
                int i11 = z3.a.f26622a;
                br.l.e(u1Var, "listener");
                z3.a.b(aVar).f26624a.remove(u1Var);
                return b0Var;
        }
    }
}

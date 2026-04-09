package N7;

import N7.J7;
import org.json.JSONObject;

/* compiled from: DivPagerLayoutModeJsonParser.kt */
/* loaded from: classes.dex */
public final class K7 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f5620a;

    public K7(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f5620a = component;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // D7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(D7.f r5, org.json.JSONObject r6) throws z7.d {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            java.lang.String r1 = "data"
            java.lang.String r0 = B4.i.i(r5, r0, r6, r1, r6)
            int r1 = r0.hashCode()
            r2 = -921832806(0xffffffffc90df29a, float:-581417.6)
            N7.Uc r3 = r4.f5620a
            if (r1 == r2) goto L59
            r2 = 97445748(0x5cee774, float:1.945717E-35)
            if (r1 == r2) goto L3d
            r2 = 343327108(0x1476c184, float:1.245799E-26)
            if (r1 == r2) goto L1e
            goto L61
        L1e:
            java.lang.String r1 = "wrap_content"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            goto L61
        L27:
            N7.J7$b r5 = new N7.J7$b
            b9.p r6 = r3.f6734e5
            java.lang.Object r6 = r6.getValue()
            N7.m7 r6 = (N7.C1268m7) r6
            r6.getClass()
            N7.l7 r6 = new N7.l7
            r6.<init>()
            r5.<init>(r6)
            goto L99
        L3d:
            java.lang.String r1 = "fixed"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L46
            goto L61
        L46:
            N7.J7$a r0 = new N7.J7$a
            b9.p r1 = r3.f6632V4
            java.lang.Object r1 = r1.getValue()
            N7.Z6 r1 = (N7.Z6) r1
            N7.Y6 r5 = r1.a(r5, r6)
            r0.<init>(r5)
        L57:
            r5 = r0
            goto L99
        L59:
            java.lang.String r1 = "percentage"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L87
        L61:
            B7.f r1 = r5.c()
            Z6.b r1 = r1.f(r0, r6)
            boolean r2 = r1 instanceof N7.N7
            if (r2 == 0) goto L70
            N7.N7 r1 = (N7.N7) r1
            goto L71
        L70:
            r1 = 0
        L71:
            if (r1 == 0) goto L80
            b9.p r0 = r3.f6920v5
            java.lang.Object r0 = r0.getValue()
            N7.M7 r0 = (N7.M7) r0
            N7.J7 r5 = r0.a(r5, r1, r6)
            goto L99
        L80:
            java.lang.String r5 = "type"
            z7.d r5 = z7.e.l(r6, r5, r0)
            throw r5
        L87:
            N7.J7$c r0 = new N7.J7$c
            b9.p r1 = r3.f6770h5
            java.lang.Object r1 = r1.getValue()
            N7.r7 r1 = (N7.C1337r7) r1
            N7.q7 r5 = r1.a(r5, r6)
            r0.<init>(r5)
            goto L57
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.K7.a(D7.f, org.json.JSONObject):java.lang.Object");
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, J7 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof J7.c;
        Uc uc = this.f5620a;
        if (z10) {
            return ((C1337r7) uc.f6770h5.getValue()).b(context, ((J7.c) value).f5575b);
        }
        if (value instanceof J7.a) {
            return ((Z6) uc.f6632V4.getValue()).b(context, ((J7.a) value).f5573b);
        }
        if (!(value instanceof J7.b)) {
            throw new b9.j();
        }
        ((C1268m7) uc.f6734e5.getValue()).getClass();
        return C1268m7.d(context, ((J7.b) value).f5574b);
    }
}

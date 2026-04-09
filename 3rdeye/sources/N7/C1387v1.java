package N7;

import N7.AbstractC1373u1;
import N7.C1188gd;
import N7.Ic;
import org.json.JSONObject;

/* compiled from: DivActionScrollDestinationJsonParser.kt */
/* renamed from: N7.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387v1 implements D7.h, D7.b {

    /* renamed from: a, reason: collision with root package name */
    public final Uc f9544a;

    public C1387v1(Uc component) {
        kotlin.jvm.internal.l.f(component, "component");
        this.f9544a = component;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
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
            N7.Uc r2 = r4.f9544a
            switch(r1) {
                case -1019779949: goto L70;
                case 100571: goto L51;
                case 100346066: goto L32;
                case 109757538: goto L12;
                default: goto L11;
            }
        L11:
            goto L78
        L12:
            java.lang.String r1 = "start"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1b
            goto L78
        L1b:
            N7.u1$d r5 = new N7.u1$d
            b9.p r6 = r2.f6626U9
            java.lang.Object r6 = r6.getValue()
            N7.kd r6 = (N7.kd) r6
            r6.getClass()
            N7.jd r6 = new N7.jd
            r6.<init>()
            r5.<init>(r6)
            goto Lb3
        L32:
            java.lang.String r1 = "index"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3b
            goto L78
        L3b:
            N7.u1$b r0 = new N7.u1$b
            b9.p r1 = r2.f6437C9
            java.lang.Object r1 = r1.getValue()
            N7.Ic$a r1 = (N7.Ic.a) r1
            r1.getClass()
            N7.Hc r5 = N7.Ic.a.d(r5, r6)
            r0.<init>(r5)
        L4f:
            r5 = r0
            goto Lb3
        L51:
            java.lang.String r1 = "end"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5a
            goto L78
        L5a:
            N7.u1$a r5 = new N7.u1$a
            b9.p r6 = r2.f6968z9
            java.lang.Object r6 = r6.getValue()
            N7.Dc r6 = (N7.Dc) r6
            r6.getClass()
            N7.Cc r6 = new N7.Cc
            r6.<init>()
            r5.<init>(r6)
            goto Lb3
        L70:
            java.lang.String r1 = "offset"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L9e
        L78:
            B7.f r1 = r5.c()
            Z6.b r1 = r1.f(r0, r6)
            boolean r3 = r1 instanceof N7.AbstractC1429y1
            if (r3 == 0) goto L87
            N7.y1 r1 = (N7.AbstractC1429y1) r1
            goto L88
        L87:
            r1 = 0
        L88:
            if (r1 == 0) goto L97
            b9.p r0 = r2.f6959z0
            java.lang.Object r0 = r0.getValue()
            N7.x1 r0 = (N7.C1415x1) r0
            N7.u1 r5 = r0.a(r5, r1, r6)
            goto Lb3
        L97:
            java.lang.String r5 = "type"
            z7.d r5 = z7.e.l(r6, r5, r0)
            throw r5
        L9e:
            N7.u1$c r0 = new N7.u1$c
            b9.p r1 = r2.f6594R9
            java.lang.Object r1 = r1.getValue()
            N7.gd$a r1 = (N7.C1188gd.a) r1
            r1.getClass()
            N7.fd r5 = N7.C1188gd.a.d(r5, r6)
            r0.<init>(r5)
            goto L4f
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N7.C1387v1.a(D7.f, org.json.JSONObject):java.lang.Object");
    }

    @Override // D7.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(D7.f context, AbstractC1373u1 value) throws z7.d {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(value, "value");
        boolean z10 = value instanceof AbstractC1373u1.c;
        Uc uc = this.f9544a;
        if (z10) {
            ((C1188gd.a) uc.f6594R9.getValue()).getClass();
            return C1188gd.a.e(context, ((AbstractC1373u1.c) value).f9361b);
        }
        if (value instanceof AbstractC1373u1.b) {
            ((Ic.a) uc.f6437C9.getValue()).getClass();
            return Ic.a.e(context, ((AbstractC1373u1.b) value).f9360b);
        }
        if (value instanceof AbstractC1373u1.d) {
            ((kd) uc.f6626U9.getValue()).getClass();
            return kd.d(context, ((AbstractC1373u1.d) value).f9362b);
        }
        if (!(value instanceof AbstractC1373u1.a)) {
            throw new b9.j();
        }
        ((Dc) uc.f6968z9.getValue()).getClass();
        return Dc.d(context, ((AbstractC1373u1.a) value).f9359b);
    }
}

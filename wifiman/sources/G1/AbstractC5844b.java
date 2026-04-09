package g1;

import androidx.constraintlayout.core.parser.CLParsingException;
import f1.C5492a;
import f1.C5493b;
import f1.C5494c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5844b {

    /* renamed from: g1.b$a */
    static class a implements InterfaceC1767b {

        /* renamed from: a, reason: collision with root package name */
        float f47451a;

        /* renamed from: b, reason: collision with root package name */
        float f47452b;

        /* renamed from: c, reason: collision with root package name */
        float f47453c;

        /* renamed from: e, reason: collision with root package name */
        String f47455e;

        /* renamed from: f, reason: collision with root package name */
        String f47456f;

        /* renamed from: h, reason: collision with root package name */
        float f47458h;

        /* renamed from: i, reason: collision with root package name */
        float f47459i;

        /* renamed from: d, reason: collision with root package name */
        boolean f47454d = false;

        /* renamed from: g, reason: collision with root package name */
        float f47457g = 0.0f;

        a(float f10, float f11, float f12, String str, String str2) {
            this.f47451a = f10;
            this.f47452b = f11;
            this.f47453c = f12;
            this.f47455e = str == null ? "" : str;
            this.f47456f = str2 == null ? "" : str2;
            this.f47459i = f11;
            this.f47458h = f10;
        }

        public ArrayList a() {
            ArrayList arrayList = new ArrayList();
            int i10 = (int) this.f47458h;
            int i11 = (int) this.f47459i;
            int i12 = i10;
            while (i10 <= i11) {
                arrayList.add(this.f47455e + i12 + this.f47456f);
                i12 += (int) this.f47453c;
                i10++;
            }
            return arrayList;
        }

        @Override // g1.AbstractC5844b.InterfaceC1767b
        public float value() {
            float f10 = this.f47457g;
            if (f10 >= this.f47459i) {
                this.f47454d = true;
            }
            if (!this.f47454d) {
                this.f47457g = f10 + this.f47453c;
            }
            return this.f47457g;
        }
    }

    /* renamed from: g1.b$b, reason: collision with other inner class name */
    interface InterfaceC1767b {
        float value();
    }

    /* renamed from: g1.b$c */
    static class c implements InterfaceC1767b {

        /* renamed from: a, reason: collision with root package name */
        float f47460a;

        /* renamed from: b, reason: collision with root package name */
        float f47461b;

        /* renamed from: c, reason: collision with root package name */
        float f47462c;

        /* renamed from: d, reason: collision with root package name */
        boolean f47463d = false;

        c(float f10, float f11) {
            this.f47460a = f10;
            this.f47461b = f11;
            this.f47462c = f10;
        }

        @Override // g1.AbstractC5844b.InterfaceC1767b
        public float value() {
            if (!this.f47463d) {
                this.f47462c += this.f47461b;
            }
            return this.f47462c;
        }
    }

    /* renamed from: g1.b$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        HashMap f47464a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        HashMap f47465b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        HashMap f47466c = new HashMap();

        float a(Object obj) {
            if (!(obj instanceof C5494c)) {
                if (obj instanceof C5493b) {
                    return ((C5493b) obj).f();
                }
                return 0.0f;
            }
            String strE = ((C5494c) obj).e();
            if (this.f47465b.containsKey(strE)) {
                return ((InterfaceC1767b) this.f47465b.get(strE)).value();
            }
            if (this.f47464a.containsKey(strE)) {
                return ((Integer) this.f47464a.get(strE)).floatValue();
            }
            return 0.0f;
        }

        ArrayList b(String str) {
            if (this.f47466c.containsKey(str)) {
                return (ArrayList) this.f47466c.get(str);
            }
            return null;
        }

        void c(String str, float f10, float f11) {
            if (this.f47465b.containsKey(str)) {
                this.f47465b.get(str);
            }
            this.f47465b.put(str, new c(f10, f11));
        }

        void d(String str, float f10, float f11, float f12, String str2, String str3) {
            if (this.f47465b.containsKey(str)) {
                this.f47465b.get(str);
            }
            a aVar = new a(f10, f11, f12, str2, str3);
            this.f47465b.put(str, aVar);
            this.f47466c.put(str, aVar.a());
        }

        void e(String str, int i10) {
            this.f47464a.put(str, Integer.valueOf(i10));
        }

        void f(String str, ArrayList arrayList) {
            this.f47466c.put(str, arrayList);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(g1.AbstractC5849g r8, g1.AbstractC5844b.d r9, g1.C5843a r10, androidx.constraintlayout.core.parser.d r11, java.lang.String r12) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.a(g1.g, g1.b$d, g1.a, androidx.constraintlayout.core.parser.d, java.lang.String):void");
    }

    private static int b(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    static String c(androidx.constraintlayout.core.parser.d dVar) {
        Iterator it = dVar.Z().iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals("type")) {
                return dVar.V("type");
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void d(g1.AbstractC5849g r9, java.lang.String r10, androidx.constraintlayout.core.parser.d r11) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.d(g1.g, java.lang.String, androidx.constraintlayout.core.parser.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void e(int r6, g1.AbstractC5849g r7, g1.AbstractC5844b.d r8, f1.C5492a r9) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            r0 = 1
            if (r6 != 0) goto L8
            h1.i r6 = r7.o()
            goto Lc
        L8:
            h1.j r6 = r7.A()
        Lc:
            androidx.constraintlayout.core.parser.b r1 = r9.A(r0)
            boolean r2 = r1 instanceof f1.C5492a
            if (r2 == 0) goto Lae
            f1.a r1 = (f1.C5492a) r1
            int r2 = r1.size()
            if (r2 >= r0) goto L1e
            goto Lae
        L1e:
            r2 = 0
            r3 = r2
        L20:
            int r4 = r1.size()
            if (r3 >= r4) goto L33
            java.lang.String r4 = r1.U(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.s0(r4)
            int r3 = r3 + r0
            goto L20
        L33:
            int r1 = r9.size()
            r3 = 2
            if (r1 <= r3) goto Lae
            androidx.constraintlayout.core.parser.b r9 = r9.A(r3)
            boolean r1 = r9 instanceof androidx.constraintlayout.core.parser.d
            if (r1 != 0) goto L43
            return
        L43:
            androidx.constraintlayout.core.parser.d r9 = (androidx.constraintlayout.core.parser.d) r9
            java.util.ArrayList r1 = r9.Z()
            java.util.Iterator r1 = r1.iterator()
        L4d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.hashCode()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L68
            h(r7, r8, r9, r6, r3)
            goto L4d
        L68:
            androidx.constraintlayout.core.parser.b r3 = r9.D(r3)
            boolean r4 = r3 instanceof f1.C5492a
            if (r4 == 0) goto L85
            r4 = r3
            f1.a r4 = (f1.C5492a) r4
            int r5 = r4.size()
            if (r5 <= r0) goto L85
            java.lang.String r3 = r4.U(r2)
            float r4 = r4.H(r0)
            r6.x0(r4)
            goto L89
        L85:
            java.lang.String r3 = r3.e()
        L89:
            r3.hashCode()
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto La8
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            g1.g$a r3 = g1.AbstractC5849g.a.SPREAD
            r6.D0(r3)
            goto L4d
        La2:
            g1.g$a r3 = g1.AbstractC5849g.a.SPREAD_INSIDE
            r6.D0(r3)
            goto L4d
        La8:
            g1.g$a r3 = g1.AbstractC5849g.a.PACKED
            r6.D0(r3)
            goto L4d
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.e(int, g1.g, g1.b$d, f1.a):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(java.lang.String r21, g1.AbstractC5849g r22, java.lang.String r23, g1.AbstractC5844b.d r24, androidx.constraintlayout.core.parser.d r25) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.f(java.lang.String, g1.g, java.lang.String, g1.b$d, androidx.constraintlayout.core.parser.d):void");
    }

    static long g(String str) {
        if (!str.startsWith(MqttTopic.MULTI_LEVEL_WILDCARD)) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF" + strSubstring;
        }
        return Long.parseLong(strSubstring, 16);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static void h(g1.AbstractC5849g r20, g1.AbstractC5844b.d r21, androidx.constraintlayout.core.parser.d r22, g1.C5843a r23, java.lang.String r24) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.h(g1.g, g1.b$d, androidx.constraintlayout.core.parser.d, g1.a, java.lang.String):void");
    }

    static void i(androidx.constraintlayout.core.parser.d dVar, C5843a c5843a, String str) throws CLParsingException {
        ArrayList arrayListZ;
        androidx.constraintlayout.core.parser.d dVarQ = dVar.Q(str);
        if (dVarQ == null || (arrayListZ = dVarQ.Z()) == null) {
            return;
        }
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            androidx.constraintlayout.core.parser.b bVarD = dVarQ.D(str2);
            if (bVarD instanceof C5493b) {
                c5843a.f(str2, bVarD.f());
            } else if (bVarD instanceof C5494c) {
                long jG = g(bVarD.e());
                if (jG != -1) {
                    c5843a.e(str2, (int) jG);
                }
            }
        }
    }

    static C5846d j(androidx.constraintlayout.core.parser.d dVar, String str, AbstractC5849g abstractC5849g, InterfaceC5845c interfaceC5845c) throws CLParsingException {
        androidx.constraintlayout.core.parser.b bVarD = dVar.D(str);
        C5846d c5846dB = C5846d.b(0);
        if (bVarD instanceof C5494c) {
            return k(bVarD.e());
        }
        if (bVarD instanceof C5493b) {
            return C5846d.b(abstractC5849g.e(Float.valueOf(interfaceC5845c.b(dVar.I(str)))));
        }
        if (!(bVarD instanceof androidx.constraintlayout.core.parser.d)) {
            return c5846dB;
        }
        androidx.constraintlayout.core.parser.d dVar2 = (androidx.constraintlayout.core.parser.d) bVarD;
        String strX = dVar2.X("value");
        if (strX != null) {
            c5846dB = k(strX);
        }
        androidx.constraintlayout.core.parser.b bVarS = dVar2.S("min");
        if (bVarS != null) {
            if (bVarS instanceof C5493b) {
                c5846dB.n(abstractC5849g.e(Float.valueOf(interfaceC5845c.b(((C5493b) bVarS).f()))));
            } else if (bVarS instanceof C5494c) {
                c5846dB.o(C5846d.f47468j);
            }
        }
        androidx.constraintlayout.core.parser.b bVarS2 = dVar2.S("max");
        if (bVarS2 == null) {
            return c5846dB;
        }
        if (bVarS2 instanceof C5493b) {
            c5846dB.l(abstractC5849g.e(Float.valueOf(interfaceC5845c.b(((C5493b) bVarS2).f()))));
            return c5846dB;
        }
        if (!(bVarS2 instanceof C5494c)) {
            return c5846dB;
        }
        c5846dB.m(C5846d.f47468j);
        return c5846dB;
    }

    static C5846d k(String str) {
        C5846d c5846dB;
        c5846dB = C5846d.b(0);
        str.hashCode();
        switch (str) {
            case "preferWrap":
                return C5846d.g(C5846d.f47468j);
            case "parent":
                return C5846d.d();
            case "spread":
                return C5846d.g(C5846d.f47469k);
            case "wrap":
                return C5846d.h();
            default:
                return str.endsWith("%") ? C5846d.e(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).r(0) : str.contains(":") ? C5846d.f(str).s(C5846d.f47469k) : c5846dB;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(java.lang.String r17, g1.AbstractC5849g r18, java.lang.String r19, g1.AbstractC5844b.d r20, androidx.constraintlayout.core.parser.d r21) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.l(java.lang.String, g1.g, java.lang.String, g1.b$d, androidx.constraintlayout.core.parser.d):void");
    }

    static void m(AbstractC5849g abstractC5849g, d dVar, androidx.constraintlayout.core.parser.d dVar2) throws CLParsingException {
        ArrayList arrayListZ = dVar2.Z();
        if (arrayListZ == null) {
            return;
        }
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            androidx.constraintlayout.core.parser.b bVarD = dVar2.D(str);
            ArrayList arrayListB = dVar.b(str);
            if (arrayListB != null && (bVarD instanceof androidx.constraintlayout.core.parser.d)) {
                Iterator it2 = arrayListB.iterator();
                while (it2.hasNext()) {
                    u(abstractC5849g, dVar, (String) it2.next(), (androidx.constraintlayout.core.parser.d) bVarD);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void n(java.lang.String r10, g1.AbstractC5849g r11, java.lang.String r12, g1.AbstractC5844b.d r13, androidx.constraintlayout.core.parser.d r14) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.n(java.lang.String, g1.g, java.lang.String, g1.b$d, androidx.constraintlayout.core.parser.d):void");
    }

    static void o(int i10, AbstractC5849g abstractC5849g, C5492a c5492a) throws CLParsingException {
        androidx.constraintlayout.core.parser.d dVar;
        String strX;
        androidx.constraintlayout.core.parser.b bVarA = c5492a.A(1);
        if ((bVarA instanceof androidx.constraintlayout.core.parser.d) && (strX = (dVar = (androidx.constraintlayout.core.parser.d) bVarA).X("id")) != null) {
            p(i10, abstractC5849g, strX, dVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0088. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x0107. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void p(int r18, g1.AbstractC5849g r19, java.lang.String r20, androidx.constraintlayout.core.parser.d r21) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.p(int, g1.g, java.lang.String, androidx.constraintlayout.core.parser.d):void");
    }

    static void q(AbstractC5849g abstractC5849g, d dVar, C5492a c5492a) throws CLParsingException {
        for (int i10 = 0; i10 < c5492a.size(); i10++) {
            androidx.constraintlayout.core.parser.b bVarA = c5492a.A(i10);
            if (bVarA instanceof C5492a) {
                C5492a c5492a2 = (C5492a) bVarA;
                if (c5492a2.size() > 1) {
                    String strU = c5492a2.U(0);
                    strU.hashCode();
                    switch (strU) {
                        case "vGuideline":
                            o(1, abstractC5849g, c5492a2);
                            break;
                        case "hChain":
                            e(0, abstractC5849g, dVar, c5492a2);
                            break;
                        case "vChain":
                            e(1, abstractC5849g, dVar, c5492a2);
                            break;
                        case "hGuideline":
                            o(0, abstractC5849g, c5492a2);
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void r(androidx.constraintlayout.core.parser.b r13, g1.C5843a r14) throws androidx.constraintlayout.core.parser.CLParsingException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.r(androidx.constraintlayout.core.parser.b, g1.a):void");
    }

    private static void s(AbstractC5849g abstractC5849g, d dVar, androidx.constraintlayout.core.parser.d dVar2) throws CLParsingException {
        ArrayList arrayListZ = dVar2.Z();
        if (arrayListZ == null) {
            return;
        }
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            androidx.constraintlayout.core.parser.b bVarD = dVar2.D(str);
            if (bVarD instanceof C5493b) {
                dVar.e(str, bVarD.i());
            } else if (bVarD instanceof androidx.constraintlayout.core.parser.d) {
                androidx.constraintlayout.core.parser.d dVar3 = (androidx.constraintlayout.core.parser.d) bVarD;
                if (dVar3.Y("from") && dVar3.Y("to")) {
                    dVar.d(str, dVar.a(dVar3.D("from")), dVar.a(dVar3.D("to")), 1.0f, dVar3.X("prefix"), dVar3.X("postfix"));
                } else if (dVar3.Y("from") && dVar3.Y("step")) {
                    dVar.c(str, dVar.a(dVar3.D("from")), dVar.a(dVar3.D("step")));
                } else if (dVar3.Y("ids")) {
                    C5492a c5492aF = dVar3.F("ids");
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < c5492aF.size(); i10++) {
                        arrayList.add(c5492aF.U(i10));
                    }
                    dVar.f(str, arrayList);
                } else if (dVar3.Y("tag")) {
                    dVar.f(str, abstractC5849g.k(dVar3.V("tag")));
                }
            }
        }
    }

    static void t(AbstractC5849g abstractC5849g, d dVar, C5843a c5843a, androidx.constraintlayout.core.parser.d dVar2) throws CLParsingException {
        if (c5843a.E() == null) {
            c5843a.f0(C5846d.h());
        }
        if (c5843a.C() == null) {
            c5843a.Y(C5846d.h());
        }
        ArrayList arrayListZ = dVar2.Z();
        if (arrayListZ == null) {
            return;
        }
        Iterator it = arrayListZ.iterator();
        while (it.hasNext()) {
            a(abstractC5849g, dVar, c5843a, dVar2, (String) it.next());
        }
    }

    static void u(AbstractC5849g abstractC5849g, d dVar, String str, androidx.constraintlayout.core.parser.d dVar2) throws CLParsingException {
        t(abstractC5849g, dVar, abstractC5849g.d(str), dVar2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void v(androidx.constraintlayout.core.parser.d r9, g1.AbstractC5849g r10, g1.AbstractC5844b.d r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC5844b.v(androidx.constraintlayout.core.parser.d, g1.g, g1.b$d):void");
    }

    private static float w(AbstractC5849g abstractC5849g, float f10) {
        return abstractC5849g.h().b(f10);
    }
}

package ec;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.v5;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h1 extends b4 implements f {

    /* renamed from: e, reason: collision with root package name */
    public final x.e f22764e;

    /* renamed from: f, reason: collision with root package name */
    public final x.e f22765f;
    public final x.e g;

    /* renamed from: h, reason: collision with root package name */
    public final x.e f22766h;

    /* renamed from: i, reason: collision with root package name */
    public final x.e f22767i;
    public final x.e j;

    /* renamed from: k, reason: collision with root package name */
    public final e1 f22768k;

    /* renamed from: l, reason: collision with root package name */
    public final jf.c f22769l;

    /* renamed from: m, reason: collision with root package name */
    public final x.e f22770m;

    /* renamed from: n, reason: collision with root package name */
    public final x.e f22771n;

    /* renamed from: o, reason: collision with root package name */
    public final x.e f22772o;

    public h1(g4 g4Var) {
        super(g4Var);
        this.f22764e = new x.e(0);
        this.f22765f = new x.e(0);
        this.g = new x.e(0);
        this.f22766h = new x.e(0);
        this.f22767i = new x.e(0);
        this.f22770m = new x.e(0);
        this.f22771n = new x.e(0);
        this.f22772o = new x.e(0);
        this.j = new x.e(0);
        this.f22768k = new e1(this);
        this.f22769l = new jf.c(11, this);
    }

    public static final x.e L(com.google.android.gms.internal.measurement.f2 f2Var) {
        x.e eVar = new x.e(0);
        for (com.google.android.gms.internal.measurement.j2 j2Var : f2Var.t()) {
            eVar.put(j2Var.p(), j2Var.q());
        }
        return eVar;
    }

    public static final z1 M(int i4) {
        int i10 = i4 - 1;
        if (i10 == 1) {
            return z1.AD_STORAGE;
        }
        if (i10 == 2) {
            return z1.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return z1.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return z1.AD_PERSONALIZATION;
    }

    public final x1 F(String str, z1 z1Var) {
        B();
        H(str);
        com.google.android.gms.internal.measurement.a2 a2VarW = W(str);
        if (a2VarW != null) {
            Iterator it = a2VarW.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.x1 x1Var = (com.google.android.gms.internal.measurement.x1) it.next();
                if (M(x1Var.p()) == z1Var) {
                    int iQ = x1Var.q() - 1;
                    if (iQ == 1) {
                        return x1.GRANTED;
                    }
                    if (iQ == 2) {
                        return x1.DENIED;
                    }
                }
            }
        }
        return x1.UNINITIALIZED;
    }

    public final boolean G(String str) {
        B();
        H(str);
        com.google.android.gms.internal.measurement.a2 a2VarW = W(str);
        if (a2VarW == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.x1 x1Var : a2VarW.p()) {
            if (x1Var.p() == 3 && x1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void H(String str) {
        C();
        B();
        pb.y.e(str);
        x.e eVar = this.f22767i;
        if (eVar.get(str) == null) {
            m mVar = this.f23175c.f22733c;
            g4.U(mVar);
            yb.e eVarH0 = mVar.H0(str);
            x.e eVar2 = this.f22772o;
            x.e eVar3 = this.f22771n;
            x.e eVar4 = this.f22770m;
            x.e eVar5 = this.f22764e;
            if (eVarH0 != null) {
                com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) K(str, (byte[]) eVarH0.f37509b).i();
                I(str, e2Var);
                eVar5.put(str, L((com.google.android.gms.internal.measurement.f2) e2Var.f()));
                eVar.put(str, (com.google.android.gms.internal.measurement.f2) e2Var.f());
                J(str, (com.google.android.gms.internal.measurement.f2) e2Var.f());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.f2) e2Var.f19740b).A());
                eVar3.put(str, (String) eVarH0.f37510c);
                eVar2.put(str, (String) eVarH0.f37511d);
                return;
            }
            eVar5.put(str, null);
            this.g.put(str, null);
            this.f22765f.put(str, null);
            this.f22766h.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.j.put(str, null);
        }
    }

    public final void I(String str, com.google.android.gms.internal.measurement.e2 e2Var) {
        o1 o1Var = (o1) this.f218b;
        HashSet hashSet = new HashSet();
        x.e eVar = new x.e(0);
        x.e eVar2 = new x.e(0);
        x.e eVar3 = new x.e(0);
        Iterator it = DesugarCollections.unmodifiableList(((com.google.android.gms.internal.measurement.f2) e2Var.f19740b).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.b2) it.next()).p());
        }
        for (int i4 = 0; i4 < ((com.google.android.gms.internal.measurement.f2) e2Var.f19740b).u(); i4++) {
            com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) ((com.google.android.gms.internal.measurement.f2) e2Var.f19740b).v(i4).i();
            if (c2Var.i().isEmpty()) {
                s0 s0Var = o1Var.f22954f;
                o1.m(s0Var);
                s0Var.j.d("EventConfig contained null event name");
            } else {
                String strI = c2Var.i();
                String strG = b2.g(c2Var.i(), b2.f22578a, b2.f22580c);
                if (!TextUtils.isEmpty(strG)) {
                    c2Var.b();
                    ((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).w(strG);
                    e2Var.b();
                    ((com.google.android.gms.internal.measurement.f2) e2Var.f19740b).H(i4, (com.google.android.gms.internal.measurement.d2) c2Var.f());
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).q() && ((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).r()) {
                    eVar.put(strI, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).s() && ((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).t()) {
                    eVar2.put(c2Var.i(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).u()) {
                    if (((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).v() < 2 || ((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).v() > 65535) {
                        s0 s0Var2 = o1Var.f22954f;
                        o1.m(s0Var2);
                        s0Var2.j.f(c2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(c2Var.i(), Integer.valueOf(((com.google.android.gms.internal.measurement.d2) c2Var.f19740b).v()));
                    }
                }
            }
        }
        this.f22765f.put(str, hashSet);
        this.g.put(str, eVar);
        this.f22766h.put(str, eVar2);
        this.j.put(str, eVar3);
    }

    public final void J(String str, com.google.android.gms.internal.measurement.f2 f2Var) {
        o1 o1Var = (o1) this.f218b;
        int iY = f2Var.y();
        e1 e1Var = this.f22768k;
        if (iY == 0) {
            e1Var.l(str);
            return;
        }
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23060o.e(Integer.valueOf(f2Var.y()), "EES programs found");
        com.google.android.gms.internal.measurement.v3 v3Var = (com.google.android.gms.internal.measurement.v3) f2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.d0 d0Var = new com.google.android.gms.internal.measurement.d0();
            a0.x0 x0Var = d0Var.f19654a;
            ((HashMap) ((v5) x0Var.f147d).f19970a).put("internal.remoteConfig", new f1(this, str, 2));
            ((HashMap) ((v5) x0Var.f147d).f19970a).put("internal.appMetadata", new f1(this, str, 0));
            ((HashMap) ((v5) x0Var.f147d).f19970a).put("internal.logger", new g1(0, this));
            d0Var.b(v3Var);
            e1Var.k(str, d0Var);
            o1.m(s0Var);
            or orVar = s0Var.f23060o;
            orVar.f(str, Integer.valueOf(v3Var.q().q()), "EES program loaded for appId, activities");
            for (com.google.android.gms.internal.measurement.u3 u3Var : v3Var.q().p()) {
                o1.m(s0Var);
                orVar.e(u3Var.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.p0 unused) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.f2 K(String str, byte[] bArr) {
        o1 o1Var = (o1) this.f218b;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.f2.G();
        }
        try {
            com.google.android.gms.internal.measurement.f2 f2Var = (com.google.android.gms.internal.measurement.f2) ((com.google.android.gms.internal.measurement.e2) w0.o0(com.google.android.gms.internal.measurement.f2.F(), bArr)).f();
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23060o.f(f2Var.p() ? Long.valueOf(f2Var.q()) : null, f2Var.r() ? f2Var.s() : null, "Parsed config. version, gmp_app_id");
            return f2Var;
        } catch (p5 e2) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.j.f(s0.J(str), e2, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.f2.G();
        } catch (RuntimeException e10) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.j.f(s0.J(str), e10, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.f2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.f2 N(String str) {
        C();
        B();
        pb.y.e(str);
        H(str);
        return (com.google.android.gms.internal.measurement.f2) this.f22767i.get(str);
    }

    public final String O(String str) {
        B();
        H(str);
        return (String) this.f22770m.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03fb, code lost:
    
        r3 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0404, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0405, code lost:
    
        r5.put(r0, r3);
        r28 = r0;
        r5.put("property_name", r6.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0417, code lost:
    
        if (r6.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0419, code lost:
    
        r3 = java.lang.Boolean.valueOf(r6.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0422, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0423, code lost:
    
        r5.put("session_scoped", r3);
        r5.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0435, code lost:
    
        if (r9.q0().insertWithOnConflict("property_filters", null, r5, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0437, code lost:
    
        r0 = r14.f22954f;
        ec.o1.m(r0);
        r0.g.e(ec.s0.J(r30), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044a, code lost:
    
        r5 = r23;
        r3 = r26;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0452, code lost:
    
        r1 = r14.f22954f;
        ec.o1.m(r1);
        r1.g.f(ec.s0.J(r30), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0462, code lost:
    
        r9.C();
        r9.B();
        pb.y.e(r30);
        r0 = r9.q0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r30, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
    
        r0 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r0.hasNext() == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.v1) r0.next()).p() != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027e, code lost:
    
        r0 = r14.f22954f;
        ec.o1.m(r0);
        r0.j.f(ec.s0.J(r30), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0293, code lost:
    
        r0 = r5.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029b, code lost:
    
        r8 = r0.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029f, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b1, code lost:
    
        if (r8 == false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b3, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.o1) r23.next();
        r9.C();
        r9.B();
        pb.y.e(r30);
        pb.y.h(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cd, code lost:
    
        if (r8.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02cf, code lost:
    
        r0 = r14.f22954f;
        ec.o1.m(r0);
        r0 = r0.j;
        r3 = ec.s0.J(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e4, code lost:
    
        if (r8.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e6, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f5, code lost:
    
        r0.g("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0300, code lost:
    
        r26 = r5;
        r5 = r8.a();
        r27 = r6;
        r6 = new android.content.ContentValues();
        r6.put("app_id", r30);
        r6.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x031b, code lost:
    
        if (r8.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031d, code lost:
    
        r1 = java.lang.Integer.valueOf(r8.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0326, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0327, code lost:
    
        r6.put("filter_id", r1);
        r6.put("event_name", r8.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0337, code lost:
    
        if (r8.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0343, code lost:
    
        r6.put("session_scoped", r0);
        r6.put("data", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0355, code lost:
    
        if (r9.q0().insertWithOnConflict("event_filters", null, r6, 5) != (-1)) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0357, code lost:
    
        r0 = r14.f22954f;
        ec.o1.m(r0);
        r0.g.e(ec.s0.J(r30), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0367, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0373, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0374, code lost:
    
        r1 = r14.f22954f;
        ec.o1.m(r1);
        r1.g.f(ec.s0.J(r30), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0386, code lost:
    
        r27 = r6;
        r5 = r5.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0396, code lost:
    
        if (r5.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0398, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.v1) r5.next();
        r9.C();
        r9.B();
        pb.y.e(r30);
        pb.y.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b2, code lost:
    
        if (r6.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03b4, code lost:
    
        r0 = r14.f22954f;
        ec.o1.m(r0);
        r0 = r0.j;
        r3 = ec.s0.J(r30);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03c9, code lost:
    
        if (r6.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03cb, code lost:
    
        r5 = java.lang.Integer.valueOf(r6.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d5, code lost:
    
        r0.g("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03de, code lost:
    
        r8 = r6.a();
        r23 = r5;
        r5 = new android.content.ContentValues();
        r5.put(r3, r30);
        r26 = r3;
        r5.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f9, code lost:
    
        if (r6.p() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f2 A[Catch: SQLiteException -> 0x0603, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0603, blocks: (B:153:0x05db, B:155:0x05f2), top: B:169:0x05db }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.lang.String r30, java.lang.String r31, java.lang.String r32, byte[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.h1.P(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean Q(String str, String str2) {
        Boolean bool;
        B();
        H(str);
        if ("1".equals(e(str, "measurement.upload.blacklist_internal")) && l4.a0(str2)) {
            return true;
        }
        if ("1".equals(e(str, "measurement.upload.blacklist_public")) && l4.A0(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean R(String str, String str2) {
        Boolean bool;
        B();
        H(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f22766h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int S(String str, String str2) {
        Integer num;
        B();
        H(str);
        Map map = (Map) this.j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean T(String str) {
        B();
        H(str);
        x.e eVar = this.f22765f;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean U(String str) {
        B();
        H(str);
        x.e eVar = this.f22765f;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean V(String str, z1 z1Var) {
        B();
        H(str);
        com.google.android.gms.internal.measurement.a2 a2VarW = W(str);
        if (a2VarW == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.x1 x1Var : a2VarW.p()) {
            if (z1Var == M(x1Var.p())) {
                return x1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.a2 W(String str) {
        B();
        H(str);
        com.google.android.gms.internal.measurement.f2 f2VarN = N(str);
        if (f2VarN == null || !f2VarN.B()) {
            return null;
        }
        return f2VarN.C();
    }

    @Override // ec.f
    public final String e(String str, String str2) {
        B();
        H(str);
        Map map = (Map) this.f22764e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // ec.b4
    public final void E() {
    }
}

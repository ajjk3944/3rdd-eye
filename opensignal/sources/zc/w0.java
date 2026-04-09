package zc;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.w5;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w0 extends k3 implements e {
    public final u.e B;
    public final u.e D;
    public final u.e E;
    public final u.e F;
    public final j8.d G;
    public final y9.u H;
    public final u.e I;
    public final u.e J;
    public final u.e K;

    /* renamed from: x, reason: collision with root package name */
    public final u.e f27250x;

    /* renamed from: y, reason: collision with root package name */
    public final u.e f27251y;

    public w0(p3 p3Var) {
        super(p3Var);
        this.f27250x = new u.e(0);
        this.f27251y = new u.e(0);
        this.B = new u.e(0);
        this.D = new u.e(0);
        this.E = new u.e(0);
        this.I = new u.e(0);
        this.J = new u.e(0);
        this.K = new u.e(0);
        this.F = new u.e(0);
        this.G = new j8.d(this);
        this.H = new y9.u(6, this);
    }

    public static final u.e C1(com.google.android.gms.internal.measurement.d2 d2Var) {
        u.e eVar = new u.e(0);
        for (com.google.android.gms.internal.measurement.h2 h2Var : d2Var.t()) {
            eVar.put(h2Var.p(), h2Var.q());
        }
        return eVar;
    }

    public static final n1 D1(int i10) {
        int i11 = i10 - 1;
        if (i11 == 1) {
            return n1.AD_STORAGE;
        }
        if (i11 == 2) {
            return n1.ANALYTICS_STORAGE;
        }
        if (i11 == 3) {
            return n1.AD_USER_DATA;
        }
        if (i11 != 4) {
            return null;
        }
        return n1.AD_PERSONALIZATION;
    }

    public final void A1(String str, com.google.android.gms.internal.measurement.d2 d2Var) {
        c1 c1Var = (c1) this.f1504d;
        int iY = d2Var.y();
        j8.d dVar = this.G;
        if (iY == 0) {
            dVar.m(str);
            return;
        }
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.K.c(Integer.valueOf(d2Var.y()), "EES programs found");
        com.google.android.gms.internal.measurement.u3 u3Var = (com.google.android.gms.internal.measurement.u3) d2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.e0 e0Var = new com.google.android.gms.internal.measurement.e0();
            kg.r rVar = e0Var.f4959a;
            ((HashMap) ((w5) rVar.f14398r).f5247a).put("internal.remoteConfig", new u0(this, str, 2));
            ((HashMap) ((w5) rVar.f14398r).f5247a).put("internal.appMetadata", new u0(this, str, 0));
            ((HashMap) ((w5) rVar.f14398r).f5247a).put("internal.logger", new v0(this));
            e0Var.b(u3Var);
            dVar.l(str, e0Var);
            c1.g(j0Var);
            su.b bVar = j0Var.K;
            bVar.d(str, Integer.valueOf(u3Var.q().q()), "EES program loaded for appId, activities");
            for (com.google.android.gms.internal.measurement.t3 t3Var : u3Var.q().p()) {
                c1.g(j0Var);
                bVar.c(t3Var.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.q0 unused) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(str, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.d2 B1(String str, byte[] bArr) {
        c1 c1Var = (c1) this.f1504d;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.d2.G();
        }
        try {
            com.google.android.gms.internal.measurement.d2 d2Var = (com.google.android.gms.internal.measurement.d2) ((com.google.android.gms.internal.measurement.c2) m0.f2(com.google.android.gms.internal.measurement.d2.F(), bArr)).e();
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.K.d(d2Var.p() ? Long.valueOf(d2Var.q()) : null, d2Var.r() ? d2Var.s() : null, "Parsed config. version, gmp_app_id");
            return d2Var;
        } catch (q5 e4) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.F.d(j0.A1(str), e4, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.d2.G();
        } catch (RuntimeException e10) {
            j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.F.d(j0.A1(str), e10, "Unable to merge remote config. appId");
            return com.google.android.gms.internal.measurement.d2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.d2 E1(String str) {
        t1();
        s1();
        cc.s.e(str);
        y1(str);
        return (com.google.android.gms.internal.measurement.d2) this.E.get(str);
    }

    public final String F1(String str) {
        s1();
        y1(str);
        return (String) this.I.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03fb, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0404, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0405, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0417, code lost:
    
        if (r5.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0419, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0422, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0423, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0435, code lost:
    
        if (r9.h2().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0437, code lost:
    
        r0 = r14.f26889y;
        zc.c1.g(r0);
        r0.B.c(zc.j0.A1(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044a, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0450, code lost:
    
        r1 = r14.f26889y;
        zc.c1.g(r1);
        r1.B.d(zc.j0.A1(r29), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0460, code lost:
    
        r9.t1();
        r9.s1();
        cc.s.e(r29);
        r0 = r9.h2();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
    
        r6 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r6.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.t1) r6.next()).p() != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027e, code lost:
    
        r0 = r14.f26889y;
        zc.c1.g(r0);
        r0.F.d(zc.j0.A1(r29), java.lang.Integer.valueOf(r5), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0294, code lost:
    
        r6 = r0.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a0, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b0, code lost:
    
        if (r6.hasNext() == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b2, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.m1) r6.next();
        r9.t1();
        r9.s1();
        cc.s.e(r29);
        cc.s.h(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cc, code lost:
    
        if (r7.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ce, code lost:
    
        r0 = r14.f26889y;
        zc.c1.g(r0);
        r0 = r0.F;
        r4 = zc.j0.A1(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e3, code lost:
    
        if (r7.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e5, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f5, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f7, code lost:
    
        r0.e("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0304, code lost:
    
        r25 = r3;
        r3 = r7.a();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put("app_id", r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x031f, code lost:
    
        if (r7.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0321, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x032a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x032b, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x033b, code lost:
    
        if (r7.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0346, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0347, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0359, code lost:
    
        if (r9.h2().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x035b, code lost:
    
        r0 = r14.f26889y;
        zc.c1.g(r0);
        r0.B.c(zc.j0.A1(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x036b, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0375, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0376, code lost:
    
        r1 = r14.f26889y;
        zc.c1.g(r1);
        r1.B.d(zc.j0.A1(r29), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0388, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0398, code lost:
    
        if (r3.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x039a, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.t1) r3.next();
        r9.t1();
        r9.s1();
        cc.s.e(r29);
        cc.s.h(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b4, code lost:
    
        if (r5.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03b6, code lost:
    
        r0 = r14.f26889y;
        zc.c1.g(r0);
        r0 = r0.F;
        r3 = zc.j0.A1(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03cb, code lost:
    
        if (r5.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03cd, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d7, code lost:
    
        r0.e("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03e0, code lost:
    
        r6 = r5.a();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f9, code lost:
    
        if (r5.p() == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05ef A[Catch: SQLiteException -> 0x0600, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x0600, blocks: (B:154:0x05d8, B:156:0x05ef), top: B:172:0x05d8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G1(java.lang.String r29, java.lang.String r30, java.lang.String r31, byte[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.w0.G1(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean H1(String str, String str2) {
        Boolean bool;
        s1();
        y1(str);
        if ("1".equals(h0(str, "measurement.upload.blacklist_internal")) && s3.Q1(str2)) {
            return true;
        }
        if ("1".equals(h0(str, "measurement.upload.blacklist_public")) && s3.q2(str2)) {
            return true;
        }
        Map map = (Map) this.B.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean I1(String str, String str2) {
        Boolean bool;
        s1();
        y1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.D.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int J1(String str, String str2) {
        Integer num;
        s1();
        y1(str);
        Map map = (Map) this.F.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean K1(String str) {
        s1();
        y1(str);
        u.e eVar = this.f27251y;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean L1(String str) {
        s1();
        y1(str);
        u.e eVar = this.f27251y;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean M1(String str, n1 n1Var) {
        s1();
        y1(str);
        com.google.android.gms.internal.measurement.y1 y1VarN1 = N1(str);
        if (y1VarN1 == null) {
            return false;
        }
        Iterator it = y1VarN1.p().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.v1 v1Var = (com.google.android.gms.internal.measurement.v1) it.next();
            if (n1Var == D1(v1Var.p())) {
                if (v1Var.q() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.y1 N1(String str) {
        s1();
        y1(str);
        com.google.android.gms.internal.measurement.d2 d2VarE1 = E1(str);
        if (d2VarE1 == null || !d2VarE1.B()) {
            return null;
        }
        return d2VarE1.C();
    }

    @Override // zc.e
    public final String h0(String str, String str2) {
        s1();
        y1(str);
        Map map = (Map) this.f27250x.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final l1 w1(String str, n1 n1Var) {
        s1();
        y1(str);
        com.google.android.gms.internal.measurement.y1 y1VarN1 = N1(str);
        if (y1VarN1 == null) {
            return l1.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.v1 v1Var : y1VarN1.u()) {
            if (D1(v1Var.p()) == n1Var) {
                int iQ = v1Var.q() - 1;
                return iQ != 1 ? iQ != 2 ? l1.UNINITIALIZED : l1.DENIED : l1.GRANTED;
            }
        }
        return l1.UNINITIALIZED;
    }

    public final boolean x1(String str) {
        s1();
        y1(str);
        com.google.android.gms.internal.measurement.y1 y1VarN1 = N1(str);
        if (y1VarN1 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.v1 v1Var : y1VarN1.p()) {
            if (v1Var.p() == 3 && v1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void y1(String str) {
        t1();
        s1();
        cc.s.e(str);
        u.e eVar = this.E;
        if (eVar.get(str) == null) {
            l lVar = this.f26981g.f27099g;
            p3.Q(lVar);
            qm.c cVarY2 = lVar.y2(str);
            u.e eVar2 = this.K;
            u.e eVar3 = this.J;
            u.e eVar4 = this.I;
            u.e eVar5 = this.f27250x;
            if (cVarY2 != null) {
                com.google.android.gms.internal.measurement.c2 c2Var = (com.google.android.gms.internal.measurement.c2) B1(str, (byte[]) cVarY2.f20918d).i();
                z1(str, c2Var);
                eVar5.put(str, C1((com.google.android.gms.internal.measurement.d2) c2Var.e()));
                eVar.put(str, (com.google.android.gms.internal.measurement.d2) c2Var.e());
                A1(str, (com.google.android.gms.internal.measurement.d2) c2Var.e());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.d2) c2Var.f5042d).A());
                eVar3.put(str, (String) cVarY2.f20919g);
                eVar2.put(str, (String) cVarY2.f20920r);
                return;
            }
            eVar5.put(str, null);
            this.B.put(str, null);
            this.f27251y.put(str, null);
            this.D.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.F.put(str, null);
        }
    }

    public final void z1(String str, com.google.android.gms.internal.measurement.c2 c2Var) {
        c1 c1Var = (c1) this.f1504d;
        HashSet hashSet = new HashSet();
        u.e eVar = new u.e(0);
        u.e eVar2 = new u.e(0);
        u.e eVar3 = new u.e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.d2) c2Var.f5042d).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.z1) it.next()).p());
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.d2) c2Var.f5042d).u(); i10++) {
            com.google.android.gms.internal.measurement.a2 a2Var = (com.google.android.gms.internal.measurement.a2) ((com.google.android.gms.internal.measurement.d2) c2Var.f5042d).v(i10).i();
            if (a2Var.h().isEmpty()) {
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.F.b("EventConfig contained null event name");
            } else {
                String strH = a2Var.h();
                String strG = p1.g(a2Var.h(), p1.f27075a, p1.f27077c);
                if (!TextUtils.isEmpty(strG)) {
                    a2Var.b();
                    ((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).w(strG);
                    c2Var.b();
                    ((com.google.android.gms.internal.measurement.d2) c2Var.f5042d).H(i10, (com.google.android.gms.internal.measurement.b2) a2Var.e());
                }
                if (((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).q() && ((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).r()) {
                    eVar.put(strH, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).s() && ((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).t()) {
                    eVar2.put(a2Var.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).u()) {
                    if (((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).v() < 2 || ((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).v() > 65535) {
                        j0 j0Var2 = c1Var.f26889y;
                        c1.g(j0Var2);
                        j0Var2.F.d(a2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).v()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        eVar3.put(a2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.b2) a2Var.f5042d).v()));
                    }
                }
            }
        }
        this.f27251y.put(str, hashSet);
        this.B.put(str, eVar);
        this.D.put(str, eVar2);
        this.F.put(str, eVar3);
    }

    @Override // zc.k3
    public final void v1() {
    }
}

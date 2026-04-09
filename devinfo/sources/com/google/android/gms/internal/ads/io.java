package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class io implements oo {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ io f12397b = new io(20);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ io f12398c = new io(21);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ io f12399d = new io(22);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ io f12400e = new io(23);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ io f12401f = new io(24);
    public static final /* synthetic */ io g = new io(27);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12402a;

    public /* synthetic */ io(int i4) {
        this.f12402a = i4;
    }

    private final void a(Object obj, Map map) {
        qz qzVar = (qz) obj;
        try {
            String str = (String) map.get("enabled");
            io ioVar = no.f14362a;
            if (!mq0.X("true", str) && !mq0.X("false", str)) {
                return;
            }
            ix0 ix0VarD = ix0.d(qzVar.getContext());
            boolean z3 = Boolean.parseBoolean(str);
            ix0VarD.getClass();
            synchronized (ix0.class) {
                ((ce1) ix0VarD.f12502b).k(Boolean.valueOf(z3), "paidv2_user_option");
            }
        } catch (IOException e2) {
            ua.j.C.f35265h.f("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e2);
        }
    }

    private final void b(Object obj, Map map) {
        qz qzVar = (qz) obj;
        if (map.containsKey("start")) {
            i00 i00VarX = qzVar.X();
            synchronized (i00VarX.f12084d) {
            }
            i00VarX.D++;
            i00VarX.H();
            return;
        }
        if (map.containsKey("stop")) {
            r3.D--;
            qzVar.X().H();
        } else if (map.containsKey("cancel")) {
            i00 i00VarX2 = qzVar.X();
            li liVar = i00VarX2.f12082b;
            if (liVar != null) {
                liVar.b(10005);
            }
            i00VarX2.C = true;
            i00VarX2.f12092n = 10004;
            i00VarX2.f12093o = "Page loaded delay cancel.";
            i00VarX2.H();
            i00VarX2.f12081a.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(java.lang.Object r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.io.c(java.lang.Object, java.util.Map):void");
    }

    public static final Integer d(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb2 = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb2.append("Precache invalid numeric parameter '");
            sb2.append(str);
            sb2.append("': ");
            sb2.append(str2);
            za.i.h(sb2.toString());
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:333|75|76|(12:322|78|79|(10:85|(1:87)|88|(1:90)|91|(1:93)|94|(1:96)|97|(2:99|(1:101)))|102|324|103|(1:108)(1:109)|316|110|343|116)(1:83)|82|(0)|102|324|103|(0)(0)|316|110|343|116|73) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x032e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x032f, code lost:
    
        ua.j.C.f35265h.f(r3.toString(), r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0347, code lost:
    
        za.i.f("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02dd  */
    @Override // com.google.android.gms.internal.ads.oo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.Object r20, java.util.Map r21) throws org.json.JSONException, java.net.URISyntaxException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.io.k(java.lang.Object, java.util.Map):void");
    }
}

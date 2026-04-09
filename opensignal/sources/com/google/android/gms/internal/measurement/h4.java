package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.libs.identity.zzee;
import com.google.android.gms.libs.identity.zzei;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class h4 implements bc.i, jt.c {

    /* renamed from: r, reason: collision with root package name */
    public static h4 f5054r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f5055a;

    /* renamed from: d, reason: collision with root package name */
    public Object f5056d;

    /* renamed from: g, reason: collision with root package name */
    public Object f5057g;

    public h4(int i10) {
        switch (i10) {
            case 4:
                this.f5056d = new Object();
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                mq.w wVar = mq.w.f16945a;
                this.f5056d = wVar;
                this.f5057g = wVar;
                break;
            default:
                this.f5055a = false;
                this.f5056d = null;
                this.f5057g = null;
                break;
        }
    }

    public static int b(ArrayList arrayList, int i10, h9.o1 o1Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i10);
        h9.m1 m1Var = o1Var.f10462b;
        if (obj != m1Var) {
            return -1;
        }
        Iterator it = m1Var.f().iterator();
        while (it.hasNext()) {
            if (((h9.q1) it.next()) == o1Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static ArrayList d(h9.e eVar) {
        ArrayList arrayList = new ArrayList();
        while (!eVar.v()) {
            String str = (String) eVar.f2460r;
            String strSubstring = null;
            if (!eVar.v()) {
                int i10 = eVar.f2457a;
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    eVar.f2457a = i10;
                } else {
                    int iH = eVar.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = eVar.h();
                    }
                    strSubstring = str.substring(i10, eVar.f2457a);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(h9.g.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!eVar.J()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean g(h9.q qVar, int i10, ArrayList arrayList, int i11, h9.o1 o1Var) {
        h9.r rVar = (h9.r) qVar.f10457a.get(i10);
        if (!j(rVar, o1Var)) {
            return false;
        }
        h9.f fVar = rVar.f10465a;
        if (fVar == h9.f.DESCENDANT) {
            if (i10 != 0) {
                while (i11 >= 0) {
                    if (!i(qVar, i10 - 1, arrayList, i11)) {
                        i11--;
                    }
                }
                return false;
            }
            return true;
        }
        if (fVar == h9.f.CHILD) {
            return i(qVar, i10 - 1, arrayList, i11);
        }
        int iB = b(arrayList, i11, o1Var);
        if (iB <= 0) {
            return false;
        }
        return g(qVar, i10 - 1, arrayList, i11, (h9.o1) o1Var.f10462b.f().get(iB - 1));
    }

    public static boolean h(h9.q qVar, h9.o1 o1Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = o1Var.f10462b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((h9.q1) obj).f10462b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = qVar.f10457a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return j((h9.r) qVar.f10457a.get(0), o1Var);
        }
        ArrayList arrayList3 = qVar.f10457a;
        return g(qVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, o1Var);
    }

    public static boolean i(h9.q qVar, int i10, ArrayList arrayList, int i11) {
        h9.r rVar = (h9.r) qVar.f10457a.get(i10);
        h9.o1 o1Var = (h9.o1) arrayList.get(i11);
        if (!j(rVar, o1Var)) {
            return false;
        }
        h9.f fVar = rVar.f10465a;
        if (fVar == h9.f.DESCENDANT) {
            if (i10 != 0) {
                while (i11 > 0) {
                    i11--;
                    if (i(qVar, i10 - 1, arrayList, i11)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (fVar == h9.f.CHILD) {
            return i(qVar, i10 - 1, arrayList, i11 - 1);
        }
        int iB = b(arrayList, i11, o1Var);
        if (iB <= 0) {
            return false;
        }
        return g(qVar, i10 - 1, arrayList, i11, (h9.o1) o1Var.f10462b.f().get(iB - 1));
    }

    public static boolean j(h9.r rVar, h9.o1 o1Var) {
        ArrayList arrayList;
        String str = rVar.f10466b;
        if (str != null && !str.equals(o1Var.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = rVar.f10467c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                h9.c cVar = (h9.c) it.next();
                String str2 = cVar.f10310a;
                String str3 = cVar.f10312c;
                if (str2.equals("id")) {
                    if (!str3.equals(o1Var.f10433c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = o1Var.f10437g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = rVar.f10468d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((h9.h) it2.next()).a(o1Var)) {
                return false;
            }
        }
        return true;
    }

    public static h4 m(Context context) {
        h4 h4Var;
        h4 h4Var2;
        synchronized (h4.class) {
            try {
                if (f5054r == null) {
                    if (h3.c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        h4Var2 = new h4();
                        h4Var2.f5055a = false;
                        h4Var2.f5056d = context;
                        h4Var2.f5057g = new g4(null);
                    } else {
                        h4Var2 = new h4(0);
                    }
                    f5054r = h4Var2;
                }
                h4 h4Var3 = f5054r;
                if (h4Var3 != null && ((g4) h4Var3.f5057g) != null && !h4Var3.f5055a) {
                    try {
                        context.getContentResolver().registerContentObserver(x3.f5255a, true, (g4) f5054r.f5057g);
                        h4 h4Var4 = f5054r;
                        h4Var4.getClass();
                        h4Var4.f5055a = true;
                    } catch (SecurityException e4) {
                        io.sentry.android.core.e0.c("GservicesLoader", "Unable to register Gservices content observer", e4);
                    }
                }
                h4Var = f5054r;
                h4Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h4Var;
    }

    @Override // jt.c
    public boolean a(ht.m0 m0Var, ht.m0 m0Var2) {
        boolean z10 = this.f5055a;
        rr.b bVar = (rr.b) this.f5056d;
        rr.b bVar2 = (rr.b) this.f5057g;
        br.l.e(bVar, "$a");
        br.l.e(bVar2, "$b");
        br.l.e(m0Var, "c1");
        br.l.e(m0Var2, "c2");
        if (m0Var.equals(m0Var2)) {
            return true;
        }
        rr.i iVarP = m0Var.p();
        rr.i iVarP2 = m0Var2.p();
        if (!(iVarP instanceof rr.r0) || !(iVarP2 instanceof rr.r0)) {
            return false;
        }
        b1.d dVar = new b1.d(bVar, 2, bVar2);
        return ts.b.f22960a.d((rr.r0) iVarP, (rr.r0) iVarP2, z10, dVar);
    }

    @Override // bc.i
    public void accept(Object obj, Object obj2) {
        bc.g gVar;
        boolean z10;
        pc.h hVar = (pc.h) obj;
        dd.h hVar2 = (dd.h) obj2;
        synchronized (this) {
            gVar = (bc.g) ((zb.g) this.f5056d).f26826b;
            z10 = this.f5055a;
            ((zb.g) this.f5056d).f26826b = null;
        }
        if (gVar == null) {
            hVar2.a(Boolean.FALSE);
            return;
        }
        synchronized (hVar.B) {
            try {
                pc.g gVar2 = (pc.g) hVar.B.remove(gVar);
                if (gVar2 == null) {
                    hVar2.a(Boolean.FALSE);
                    return;
                }
                gVar2.f20447e.n().f26826b = null;
                if (!z10) {
                    hVar2.a(Boolean.TRUE);
                } else if (hVar.v(tc.e.f22701b)) {
                    pc.r rVar = (pc.r) hVar.m();
                    int iIdentityHashCode = System.identityHashCode(gVar2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb2.append("ILocationCallback@");
                    sb2.append(iIdentityHashCode);
                    zzee zzeeVar = new zzee(2, null, gVar2, null, sb2.toString());
                    pc.e eVar = new pc.e(Boolean.TRUE, hVar2);
                    Parcel parcelR = rVar.R();
                    pc.b.b(parcelR, zzeeVar);
                    parcelR.writeStrongBinder(eVar);
                    rVar.S(parcelR, 89);
                } else {
                    pc.r rVar2 = (pc.r) hVar.m();
                    zzei zzeiVar = new zzei(2, null, null, gVar2, null, new pc.f(hVar2), null);
                    Parcel parcelR2 = rVar2.R();
                    pc.b.b(parcelR2, zzeiVar);
                    rVar2.S(parcelR2, 59);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(h9.p pVar, h9.e eVar) throws h9.a {
        int iIntValue;
        char cCharAt;
        int iY;
        String strA0 = eVar.a0();
        eVar.K();
        if (strA0 == null) {
            throw new h9.a("Invalid '@' rule");
        }
        int i10 = 0;
        if (!this.f5055a && strA0.equals("media")) {
            ArrayList arrayListD = d(eVar);
            if (!eVar.s('{')) {
                throw new h9.a("Invalid @media rule: missing rule set");
            }
            eVar.K();
            h9.g gVar = (h9.g) this.f5056d;
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                h9.g gVar2 = (h9.g) it.next();
                if (gVar2 == h9.g.all || gVar2 == gVar) {
                    this.f5055a = true;
                    pVar.b(f(eVar));
                    this.f5055a = false;
                    break;
                }
            }
            f(eVar);
            if (!eVar.v() && !eVar.s('}')) {
                throw new h9.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f5055a || !strA0.equals("import")) {
            io.sentry.android.core.e0.p("CSSParser", "Ignoring @" + strA0 + " rule");
            while (!eVar.v() && ((iIntValue = eVar.A().intValue()) != 59 || i10 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i10 > 0 && i10 - 1 == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        } else {
            String strZ = null;
            if (!eVar.v()) {
                int i11 = eVar.f2457a;
                if (eVar.t("url(")) {
                    eVar.K();
                    String strZ2 = eVar.Z();
                    if (strZ2 == null) {
                        String str = (String) eVar.f2460r;
                        StringBuilder sb2 = new StringBuilder();
                        while (!eVar.v() && (cCharAt = str.charAt(eVar.f2457a)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !b5.m.y(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            eVar.f2457a++;
                            if (cCharAt == '\\') {
                                if (!eVar.v()) {
                                    int i12 = eVar.f2457a;
                                    eVar.f2457a = i12 + 1;
                                    cCharAt = str.charAt(i12);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iY2 = h9.e.Y(cCharAt);
                                        if (iY2 != -1) {
                                            for (int i13 = 1; i13 <= 5 && !eVar.v() && (iY = h9.e.Y(str.charAt(eVar.f2457a))) != -1; i13++) {
                                                eVar.f2457a++;
                                                iY2 = (iY2 * 16) + iY;
                                            }
                                            sb2.append((char) iY2);
                                        }
                                    }
                                }
                            }
                            sb2.append(cCharAt);
                        }
                        strZ2 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (strZ2 == null) {
                        eVar.f2457a = i11;
                    } else {
                        eVar.K();
                        if (eVar.v() || eVar.t(")")) {
                            strZ = strZ2;
                        } else {
                            eVar.f2457a = i11;
                        }
                    }
                }
            }
            if (strZ == null) {
                strZ = eVar.Z();
            }
            if (strZ == null) {
                throw new h9.a("Invalid @import rule: expected string or url()");
            }
            eVar.K();
            d(eVar);
            if (!eVar.v() && !eVar.s(';')) {
                throw new h9.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        eVar.K();
    }

    public boolean e(h9.p pVar, h9.e eVar) throws h9.a {
        ArrayList arrayListB0 = eVar.b0();
        if (arrayListB0 == null || arrayListB0.isEmpty()) {
            return false;
        }
        if (!eVar.s('{')) {
            throw new h9.a("Malformed rule block: expected '{'");
        }
        eVar.K();
        h9.i1 i1Var = new h9.i1();
        do {
            String strA0 = eVar.a0();
            eVar.K();
            if (!eVar.s(':')) {
                throw new h9.a("Expected ':'");
            }
            eVar.K();
            String str = (String) eVar.f2460r;
            String strSubstring = null;
            if (!eVar.v()) {
                int i10 = eVar.f2457a;
                int iCharAt = str.charAt(i10);
                int i11 = i10;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!b5.m.y(iCharAt)) {
                        i11 = eVar.f2457a + 1;
                    }
                    iCharAt = eVar.h();
                }
                if (eVar.f2457a > i10) {
                    strSubstring = str.substring(i10, i11);
                } else {
                    eVar.f2457a = i10;
                }
            }
            if (strSubstring == null) {
                throw new h9.a("Expected property value");
            }
            eVar.K();
            if (eVar.s('!')) {
                eVar.K();
                if (!eVar.t("important")) {
                    throw new h9.a("Malformed rule set: found unexpected '!'");
                }
                eVar.K();
            }
            eVar.s(';');
            h9.c3.D(i1Var, strA0, strSubstring);
            eVar.K();
            if (eVar.v()) {
                break;
            }
        } while (!eVar.s('}'));
        eVar.K();
        Iterator it = arrayListB0.iterator();
        while (it.hasNext()) {
            h9.q qVar = (h9.q) it.next();
            h9.s sVar = (h9.s) this.f5057g;
            h9.o oVar = new h9.o();
            oVar.f10426a = qVar;
            oVar.f10427b = i1Var;
            oVar.f10428c = sVar;
            pVar.a(oVar);
        }
        return true;
    }

    public h9.p f(h9.e eVar) {
        h9.p pVar = new h9.p(0);
        while (!eVar.v()) {
            try {
                if (!eVar.t("<!--") && !eVar.t("-->")) {
                    if (!eVar.s('@')) {
                        if (!e(pVar, eVar)) {
                            break;
                        }
                    } else {
                        c(pVar, eVar);
                    }
                }
            } catch (h9.a e4) {
                io.sentry.android.core.e0.d("CSSParser", "CSS parser terminated early due to error: " + e4.getMessage());
                return pVar;
            }
        }
        return pVar;
    }

    public void k() {
        com.google.android.exoplayer2.a aVar = (com.google.android.exoplayer2.a) this.f5057g;
        Context context = (Context) this.f5056d;
        if (this.f5055a) {
            context.unregisterReceiver(aVar);
            this.f5055a = false;
        }
    }

    public void l(boolean z10) {
        com.google.android.exoplayer2.a aVar = (com.google.android.exoplayer2.a) this.f5057g;
        Context context = (Context) this.f5056d;
        if (z10 && !this.f5055a) {
            context.registerReceiver(aVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f5055a = true;
        } else {
            if (z10 || !this.f5055a) {
                return;
            }
            context.unregisterReceiver(aVar);
            this.f5055a = false;
        }
    }

    public synchronized zb.g n() {
        return (zb.g) this.f5056d;
    }

    public void o(dd.n nVar) {
        synchronized (this.f5056d) {
            try {
                if (((ArrayDeque) this.f5057g) == null) {
                    this.f5057g = new ArrayDeque();
                }
                ((ArrayDeque) this.f5057g).add(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String p(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f5056d
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            if (r0 == 0) goto L8f
            boolean r2 = com.google.android.gms.internal.measurement.b4.f4918b
            r3 = 1
            if (r2 == 0) goto Ld
            goto L5b
        Ld:
            java.lang.Class<com.google.android.gms.internal.measurement.b4> r2 = com.google.android.gms.internal.measurement.b4.class
            monitor-enter(r2)
            boolean r4 = com.google.android.gms.internal.measurement.b4.f4918b     // Catch: java.lang.Throwable -> L16
            if (r4 == 0) goto L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L16:
            r9 = move-exception
            goto L8d
        L19:
            r4 = r3
        L1a:
            r5 = 2
            r6 = 0
            if (r4 > r5) goto L51
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.b4.f4917a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L2c
            java.lang.Class<android.os.UserManager> r5 = android.os.UserManager.class
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L16
            android.os.UserManager r5 = (android.os.UserManager) r5     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.b4.f4917a = r5     // Catch: java.lang.Throwable -> L16
        L2c:
            android.os.UserManager r5 = com.google.android.gms.internal.measurement.b4.f4917a     // Catch: java.lang.Throwable -> L16
            if (r5 != 0) goto L32
            r6 = r3
            goto L55
        L32:
            boolean r7 = r5.isUserUnlocked()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r7 != 0) goto L42
            android.os.UserHandle r7 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            boolean r0 = r5.isUserRunning(r7)     // Catch: java.lang.Throwable -> L16 java.lang.NullPointerException -> L44
            if (r0 != 0) goto L51
        L42:
            r6 = r3
            goto L51
        L44:
            r5 = move-exception
            java.lang.String r6 = "DirectBootUtils"
            java.lang.String r7 = "Failed to check if user is unlocked."
            io.sentry.android.core.e0.q(r6, r7, r5)     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.measurement.b4.f4917a = r1     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            goto L1a
        L51:
            if (r6 == 0) goto L55
            com.google.android.gms.internal.measurement.b4.f4917a = r1     // Catch: java.lang.Throwable -> L16
        L55:
            if (r6 == 0) goto L59
            com.google.android.gms.internal.measurement.b4.f4918b = r3     // Catch: java.lang.Throwable -> L16
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            r3 = r6
        L5b:
            if (r3 != 0) goto L5e
            goto L8f
        L5e:
            com.google.android.gms.internal.measurement.t r0 = new com.google.android.gms.internal.measurement.t     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            r0.<init>(r8, r9)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.SecurityException -> L68 java.lang.NullPointerException -> L76 java.lang.IllegalStateException -> L7a
            goto L73
        L68:
            long r2 = android.os.Binder.clearCallingIdentity()     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L7c
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L73:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            return r0
        L76:
            r0 = move-exception
            goto L81
        L78:
            r0 = move-exception
            goto L81
        L7a:
            r0 = move-exception
            goto L81
        L7c:
            r0 = move-exception
            android.os.Binder.restoreCallingIdentity(r2)     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
            throw r0     // Catch: java.lang.NullPointerException -> L76 java.lang.SecurityException -> L78 java.lang.IllegalStateException -> L7a
        L81:
            java.lang.String r2 = "Unable to read GServices for: "
            java.lang.String r9 = r2.concat(r9)
            java.lang.String r2 = "GservicesLoader"
            io.sentry.android.core.e0.c(r2, r9, r0)
            return r1
        L8d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h4.p(java.lang.String):java.lang.String");
    }

    public void q(dd.r rVar) {
        dd.n nVar;
        synchronized (this.f5056d) {
            if (((ArrayDeque) this.f5057g) != null && !this.f5055a) {
                this.f5055a = true;
                while (true) {
                    synchronized (this.f5056d) {
                        try {
                            nVar = (dd.n) ((ArrayDeque) this.f5057g).poll();
                            if (nVar == null) {
                                this.f5055a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.a(rVar);
                }
            }
        }
    }
}

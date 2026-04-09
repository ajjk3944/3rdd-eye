package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.applovin.shadow.okio.Segment;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz implements d81, com.google.android.gms.internal.consent_sdk.i7, n1.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18584a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18585b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18586c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18587d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18588e;

    /* renamed from: f, reason: collision with root package name */
    public Object f18589f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public Object f18590h;

    public /* synthetic */ xz(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f18584a = obj;
        this.f18585b = obj2;
        this.f18586c = obj3;
        this.f18587d = obj4;
        this.f18588e = obj5;
        this.f18589f = obj6;
        this.g = obj7;
        this.f18590h = obj8;
    }

    @Override // com.google.android.gms.internal.ads.d81
    /* renamed from: b */
    public vd.b mo166b() throws zz {
        hl hlVar = ua.j.C.f35262d;
        Context context = (Context) this.f18584a;
        h0 h0Var = new h0(0, 0, 0);
        km.n nVar = (km.n) this.f18587d;
        li liVar = new li();
        qh0 qh0Var = (qh0) this.f18588e;
        jq0 jq0Var = (jq0) this.f18589f;
        qd0 qd0Var = (qd0) this.g;
        qz qzVarF = hl.f(context, h0Var, "", false, false, (oe) this.f18585b, null, (za.a) this.f18586c, null, nVar, liVar, null, null, qh0Var, jq0Var, qd0Var);
        gi giVar = new gi(qzVarF);
        qzVarF.X().g = new wz(giVar, 0);
        qzVarF.loadUrl((String) this.f18590h);
        return giVar;
    }

    public boolean c(boolean z3) {
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        if (h() != null) {
            n1.s sVarH = h();
            j(null);
            if (sVarH != null) {
                n1.q qVar = n1.q.f29544a;
                n1.q qVar2 = n1.q.f29546c;
                sVarH.q0(qVar, qVar2);
                if (!sVarH.f25554a.f25565n) {
                    f2.a.b("visitAncestors called on an unattached node");
                }
                i1.m mVar = sVarH.f25554a.f25558e;
                i2.e0 e0VarS = i2.k.s(sVarH);
                while (e0VarS != null) {
                    if ((((i1.m) e0VarS.G.g).f25557d & Segment.SHARE_MINIMUM) != 0) {
                        while (mVar != null) {
                            if ((mVar.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                w0.e eVar = null;
                                i1.m mVarE = mVar;
                                while (mVarE != null) {
                                    if (mVarE instanceof n1.s) {
                                        ((n1.s) mVarE).q0(n1.q.f29545b, qVar2);
                                    } else if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                        int i4 = 0;
                                        for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                            if ((mVar2.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    mVarE = mVar2;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new w0.e(new i1.m[16]);
                                                    }
                                                    if (mVarE != null) {
                                                        eVar.b(mVarE);
                                                        mVarE = null;
                                                    }
                                                    eVar.b(mVar2);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    mVarE = i2.k.e(eVar);
                                }
                            }
                            mVar = mVar.f25558e;
                        }
                    }
                    e0VarS = e0VarS.v();
                    mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (i2.w1) a0Var.f19259f;
                }
            }
        }
        return true;
    }

    public boolean d(int i4, boolean z3, boolean z10) {
        int iOrdinal;
        boolean z11 = true;
        if (z3 || (iOrdinal = com.bumptech.glide.f.s((n1.s) this.f18586c, i4).ordinal()) == 0) {
            c(z3);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new ac.m();
            }
            z11 = false;
        }
        if (z11 && z10) {
            e();
        }
        return z11;
    }

    public void e() {
        j2.r rVar = (j2.r) this.f18584a;
        if (rVar.isFocused() || rVar.hasFocus()) {
            rVar.clearFocus();
        } else if (rVar.hasFocus()) {
            View viewFindFocus = rVar.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            rVar.clearFocus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0036, B:19:0x003c, B:20:0x0041, B:22:0x0049, B:24:0x004e, B:26:0x0054, B:30:0x005a, B:128:0x0176, B:130:0x017c, B:131:0x017f, B:133:0x018a, B:136:0x0198, B:140:0x01a2, B:143:0x01a8, B:144:0x01ad, B:164:0x01e7, B:145:0x01b1, B:147:0x01b7, B:149:0x01bb, B:151:0x01c3, B:153:0x01c9, B:157:0x01d1, B:159:0x01da, B:160:0x01de, B:161:0x01e1, B:165:0x01ec, B:166:0x01ef, B:168:0x01f5, B:170:0x01f9, B:173:0x0202, B:175:0x020a, B:179:0x021a, B:181:0x021f, B:183:0x0223, B:203:0x025c, B:184:0x0226, B:186:0x022c, B:188:0x0230, B:190:0x0238, B:192:0x023e, B:196:0x0246, B:198:0x024f, B:199:0x0253, B:200:0x0256, B:204:0x0261, B:208:0x0271, B:210:0x0276, B:212:0x027a, B:235:0x02bc, B:216:0x0286, B:218:0x028c, B:220:0x0290, B:222:0x0298, B:224:0x029e, B:228:0x02a6, B:230:0x02af, B:231:0x02b3, B:232:0x02b6, B:237:0x02c3, B:239:0x02ca, B:34:0x0062, B:36:0x0068, B:37:0x006b, B:39:0x0073, B:42:0x0081, B:46:0x008b, B:77:0x00e0, B:79:0x00e4, B:49:0x0090, B:51:0x0096, B:53:0x009a, B:55:0x00a2, B:57:0x00a8, B:61:0x00b0, B:63:0x00b9, B:64:0x00bd, B:65:0x00c0, B:68:0x00c6, B:69:0x00cb, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:80:0x00ea, B:82:0x00f0, B:83:0x00f3, B:85:0x00fd, B:88:0x010b, B:92:0x0115, B:123:0x016a, B:125:0x016e, B:95:0x011a, B:97:0x0120, B:99:0x0124, B:101:0x012c, B:103:0x0132, B:107:0x013a, B:109:0x0143, B:110:0x0147, B:111:0x014a, B:114:0x0150, B:115:0x0155, B:116:0x0158, B:118:0x015e, B:120:0x0162), top: B:248:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r0v11, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r0v24, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r15v5, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r15v9, types: [i1.m] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v37, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [w0.e] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(android.view.KeyEvent r14, mk.a r15) {
        /*
            Method dump skipped, instructions count: 741
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xz.f(android.view.KeyEvent, mk.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0124, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r7v3, types: [mk.c, nk.l] */
    /* JADX WARN: Type inference failed for: r7v9, types: [mk.c, nk.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean g(int r20, o1.c r21, mk.c r22) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xz.g(int, o1.c, mk.c):java.lang.Boolean");
    }

    public n1.s h() {
        n1.s sVar = (n1.s) this.f18590h;
        if (sVar == null || !sVar.f25565n) {
            return null;
        }
        return sVar;
    }

    public boolean i(int i4) {
        if (!d(i4, false, false)) {
            return false;
        }
        Boolean boolG = g(i4, null, new j2.p(i4, 2));
        boolean zBooleanValue = boolG != null ? boolG.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public void j(n1.s sVar) {
        n1.s sVar2 = (n1.s) this.f18590h;
        this.f18590h = sVar;
        x.a0 a0Var = (x.a0) this.g;
        Object[] objArr = a0Var.f36846a;
        int i4 = a0Var.f36847b;
        for (int i10 = 0; i10 < i4; i10++) {
            ((n1.f) objArr[i10]).a(sVar2, sVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        r31 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (((r10 & ((~r10) << 6)) & (-9187201950435737472L)) == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
    
        r3 = r4.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
    
        if (r4.f36964e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        if (((r4.f36960a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
    
        r41 = 1;
        r37 = r12;
        r25 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        r3 = r4.f36962c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r3 <= r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ed, code lost:
    
        if (java.lang.Long.compare((r4.f36963d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        r3 = r4.f36960a;
        r5 = r4.f36962c;
        r6 = r4.f36961b;
        r14 = (r5 + 7) >> 3;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fb, code lost:
    
        if (r15 >= r14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fd, code lost:
    
        r9 = r3[r15] & (-9187201950435737472L);
        r3[r15] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r15 = r15 + 1;
        r11 = r11;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0118, code lost:
    
        r37 = r12;
        r25 = 128;
        r13 = r11;
        r9 = zj.m.Z(r3);
        r10 = r9 - 1;
        r14 = 72057594037927935L;
        r3[r10] = (r3[r10] & 72057594037927935L) | (-72057594037927936L);
        r3[r9] = r3[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:
    
        if (r9 == r5) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0139, code lost:
    
        r10 = r9 >> 3;
        r23 = (r9 & 7) << 3;
        r11 = (r3[r10] >> r23) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        if (r11 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r11 == 254) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0151, code lost:
    
        r11 = r6[r9];
        r11 = ((int) (r11 ^ (r11 >>> r31))) * r32;
        r12 = (r11 ^ (r11 << 16)) >>> 7;
        r24 = r4.b(r12);
        r12 = r12 & r5;
        r30 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0171, code lost:
    
        if ((((r24 - r12) & r5) / 8) != (((r9 - r12) & r5) / 8)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0173, code lost:
    
        r39 = r14;
        r3[r10] = ((r11 & 127) << r23) | (r3[r10] & (~(255 << r23)));
        r3[r3.length - r7] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r13 = r30;
        r14 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0195, code lost:
    
        r39 = r14;
        r12 = r24 >> 3;
        r13 = r3[r12];
        r15 = (r24 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
    
        if (((r13 >> r15) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a7, code lost:
    
        r41 = r7;
        r42 = r8;
        r27 = r5;
        r44 = r6;
        r3[r12] = ((~(255 << r15)) & r13) | ((r11 & 127) << r15);
        r3[r10] = (r3[r10] & (~(255 << r23))) | (128 << r23);
        r44[r24] = r44[r9];
        r44[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01cc, code lost:
    
        r27 = r5;
        r44 = r6;
        r41 = r7;
        r42 = r8;
        r3[r12] = ((r11 & 127) << r15) | ((~(255 << r15)) & r13);
        r5 = r44[r24];
        r44[r24] = r44[r9];
        r44[r9] = r5;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e9, code lost:
    
        r3[r3.length - 1] = (r3[0] & r39) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r44;
        r5 = r27;
        r13 = r30;
        r14 = r39;
        r7 = r41;
        r8 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0204, code lost:
    
        r41 = r7;
        r42 = r8;
        r4.f36964e = x.l0.a(r4.f36962c) - r4.f36963d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0217, code lost:
    
        r41 = 1;
        r42 = r8;
        r37 = r12;
        r25 = 128;
        r3 = x.l0.b(r4.f36962c);
        r5 = r4.f36960a;
        r6 = r4.f36961b;
        r7 = r4.f36962c;
        r4.c(r3);
        r3 = r4.f36960a;
        r8 = r4.f36961b;
        r9 = r4.f36962c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0236, code lost:
    
        if (r10 >= r7) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0245, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0247, code lost:
    
        r11 = r6[r10];
        r13 = ((int) ((r11 >>> r31) ^ r11)) * r32;
        r13 = r13 ^ (r13 << 16);
        r14 = r4.b(r13 >>> 7);
        r15 = r5;
        r16 = r6;
        r5 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r5 = (r3[r13] & (~(255 << r17))) | (r5 << r17);
        r3[r13] = r5;
        r3[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r14] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0281, code lost:
    
        r15 = r5;
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0284, code lost:
    
        r10 = r10 + 1;
        r5 = r15;
        r6 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x028a, code lost:
    
        r3 = r4.b(r42);
        r41 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028e, code lost:
    
        r30 = r3;
        r4.f36963d++;
        r3 = r4.f36964e;
        r5 = r4.f36960a;
        r6 = r30 >> 3;
        r7 = r5[r6];
        r9 = (r30 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a8, code lost:
    
        if (((r7 >> r9) & 255) != r25) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02aa, code lost:
    
        r22 = r41 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02ac, code lost:
    
        r4.f36964e = r3 - r22;
        r3 = r4.f36962c;
        r7 = (r7 & (~(255 << r9))) | (r37 << r9);
        r5[r6] = r7;
        r5[(((r30 - 7) & r3) + (r3 & 7)) >> 3] = r7;
        r41 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x035a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x035c, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(android.view.KeyEvent r44) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xz.k(android.view.KeyEvent):boolean");
    }

    @Override // com.google.android.gms.internal.consent_sdk.j7
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.consent_sdk.l7 a() {
        Application application = (Application) ((com.google.android.gms.internal.consent_sdk.e6) this.f18584a).f19335b;
        Handler handler = com.google.android.gms.internal.consent_sdk.j0.f19383a;
        com.google.android.gms.internal.consent_sdk.l0.c(handler);
        com.google.android.gms.internal.consent_sdk.i0 i0Var = com.google.android.gms.internal.consent_sdk.j0.f19384b;
        com.google.android.gms.internal.consent_sdk.l0.c(i0Var);
        return new com.google.android.gms.internal.consent_sdk.l7(application, handler, i0Var, (com.google.android.gms.internal.consent_sdk.h) ((com.google.android.gms.internal.consent_sdk.h7) this.f18586c).a(), (com.google.android.gms.internal.consent_sdk.q) ((com.google.android.gms.internal.consent_sdk.h7) this.f18587d).a(), ((com.google.android.gms.internal.consent_sdk.l4) this.f18588e).b(), ((a0.x0) this.f18589f).M(), (com.google.android.gms.internal.consent_sdk.v0) ((com.google.android.gms.internal.consent_sdk.h7) this.g).a(), (com.google.android.gms.internal.consent_sdk.e0) ((com.google.android.gms.internal.consent_sdk.h7) this.f18590h).a());
    }

    public xz(j2.r rVar, j2.r rVar2) {
        this.f18584a = rVar;
        this.f18585b = rVar2;
        this.f18586c = new n1.s(2, null, 14);
        this.f18587d = new n1.e(this, rVar2);
        this.f18588e = new n1.i(this);
        this.g = new x.a0(1);
    }

    public xz(Context context, t6.b bVar, a0.x0 x0Var, a7.a aVar, WorkDatabase workDatabase, b7.r rVar, ArrayList arrayList) {
        nk.k.e(context, "context");
        nk.k.e(aVar, "foregroundProcessor");
        this.f18585b = bVar;
        this.f18586c = x0Var;
        this.f18587d = aVar;
        this.f18588e = workDatabase;
        this.f18589f = rVar;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        nk.k.d(applicationContext, "getApplicationContext(...)");
        this.f18584a = applicationContext;
        this.f18590h = new i0.f(23);
    }
}

package a8;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.StatFs;
import android.telephony.ServiceState;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import cv.s;
import e1.p;
import h7.g0;
import h7.h0;
import h7.n1;
import h7.p0;
import h7.q0;
import h7.r1;
import io.sentry.b5;
import io.sentry.x5;
import java.io.File;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import mi.n;
import mi.o;
import ni.c0;
import ni.c1;
import ni.j1;
import ni.z;
import org.json.JSONException;
import org.json.JSONObject;
import q8.m;
import wt.d0;
import wt.w;
import x1.f0;
import x1.v1;
import x1.z0;
import z0.l;

/* loaded from: classes.dex */
public final class f implements e1.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f195a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f196b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f197c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f198d;

    /* renamed from: e, reason: collision with root package name */
    public Object f199e;

    /* renamed from: f, reason: collision with root package name */
    public Object f200f;

    /* renamed from: g, reason: collision with root package name */
    public Object f201g;

    /* renamed from: h, reason: collision with root package name */
    public Object f202h;

    public f(x5 x5Var, io.sentry.android.replay.video.a aVar) {
        br.l.e(x5Var, "options");
        this.f195a = x5Var;
        this.f196b = aVar;
        lq.j jVar = lq.j.NONE;
        lq.h hVarE = kc.f.E(jVar, io.sentry.android.replay.video.c.f12015d);
        this.f197c = hVarE;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) hVarE.getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f12008f);
        br.l.b(mediaCodecCreateByCodecName);
        this.f198d = mediaCodecCreateByCodecName;
        this.f199e = kc.f.E(jVar, new ht.g(7, this));
        this.f200f = new MediaCodec.BufferInfo();
        String absolutePath = aVar.f12003a.getAbsolutePath();
        br.l.d(absolutePath, "getAbsolutePath(...)");
        this.f201g = new io.sentry.android.replay.video.b(absolutePath, aVar.f12006d);
    }

    public static void A(ar.k kVar) {
        du.f fVar = d0.f24610a;
        w.s(w.b(du.e.f7570g), null, null, new cq.h(kVar, null), 3);
    }

    public static final SpeedTestResult a(f fVar, String str, String str2) {
        int i10;
        Object objD;
        c0 c0Var;
        c0 c0Var2;
        j1 j1Var;
        xj.l lVar = (xj.l) fVar.f196b;
        lVar.getClass();
        br.l.e(str, "type");
        br.l.e(str2, "resultJson");
        o.Companion.getClass();
        o oVarA = n.a(str);
        JSONObject jSONObject = new JSONObject(str2);
        Double d6 = null;
        if (oVarA == null) {
            i10 = -1;
        } else {
            try {
                i10 = xj.k.f25394a[oVarA.ordinal()];
            } catch (Exception e4) {
                ch.n.d("SdkResultMapper", "Error mapping result with type: " + str + ". JSON: " + str2, e4);
            }
        }
        switch (i10) {
            case -1:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objD = null;
                break;
            case 0:
            default:
                throw new bf.n();
            case 1:
                objD = lVar.f25397c.d(jSONObject);
                break;
            case 2:
                objD = lVar.f25398d.e(jSONObject);
                break;
            case 3:
                lVar.f25399e.getClass();
                objD = ai.f.e(jSONObject);
                break;
            case 4:
                lVar.f25400f.getClass();
                objD = ai.f.f(jSONObject);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                objD = lVar.f25401g.f(jSONObject);
                break;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                lVar.f25402h.getClass();
                objD = ai.f.k(jSONObject);
                break;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                lVar.f25403i.getClass();
                objD = ai.f.r(jSONObject);
                break;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                lVar.j.getClass();
                objD = ai.f.s(jSONObject);
                break;
            case 9:
                lVar.f25406n.getClass();
                objD = ai.f.n(jSONObject);
                break;
            case 10:
                lVar.k.getClass();
                objD = ai.f.t(jSONObject);
                break;
            case 11:
                lVar.f25404l.getClass();
                objD = ai.f.u(jSONObject);
                break;
            case 12:
                lVar.f25405m.getClass();
                objD = ai.f.q(jSONObject);
                break;
            case 13:
                lVar.f25407o.getClass();
                objD = ai.f.l(jSONObject);
                break;
            case 14:
                lVar.f25396b.getClass();
                objD = ai.f.p(jSONObject);
                break;
            case 15:
                lVar.f25395a.getClass();
                objD = ai.f.o(jSONObject);
                break;
            case 16:
                objD = lVar.f25408p.d(jSONObject);
                break;
            case 17:
                lVar.f25409q.getClass();
                objD = ai.f.h(jSONObject);
                break;
            case 18:
                lVar.f25410r.getClass();
                objD = ai.f.i(jSONObject);
                break;
            case 19:
                lVar.f25411s.getClass();
                objD = ai.f.j(jSONObject);
                break;
            case 20:
                objD = lVar.f25412t.f(jSONObject);
                break;
            case 21:
                lVar.f25413u.getClass();
                objD = ai.f.d(jSONObject);
                break;
            case 22:
                lVar.f25414v.getClass();
                objD = ai.f.v(jSONObject);
                break;
            case 23:
                objD = lVar.f25415w.e(jSONObject);
                break;
            case 24:
                lVar.f25416x.getClass();
                objD = ai.f.m(jSONObject);
                break;
        }
        SpeedTestResult speedTestResult = ((fm.i) fVar.f199e).f9012a;
        fm.j jVar = (fm.j) fVar.f198d;
        tm.c cVar = (tm.c) fVar.f200f;
        jVar.getClass();
        br.l.e(speedTestResult, "speedTestResult");
        br.l.e(cVar, "networkInformation");
        if (objD instanceof ni.f) {
            ni.g gVarI = ((ni.f) objD).i();
            if (gVarI != null) {
                speedTestResult.B = gVarI.f17845z;
                speedTestResult.f6096d = gVarI.f17827f;
            }
            String str3 = cVar.f22891d;
            br.l.e(str3, "<set-?>");
            speedTestResult.J = str3;
            String str4 = (gVarI == null || (j1Var = gVarI.C) == null) ? null : j1Var.f17966c;
            if (str4 != null) {
                speedTestResult.E = str4;
            }
            Double d10 = (gVarI == null || (c0Var2 = gVarI.f17839t) == null) ? null : c0Var2.f17697b;
            if (d10 != null) {
                speedTestResult.F = d10.doubleValue();
            }
            if (gVarI != null && (c0Var = gVarI.f17839t) != null) {
                d6 = c0Var.f17698c;
            }
            if (d6 != null) {
                speedTestResult.G = d6.doubleValue();
            }
        } else if (objD instanceof ni.n) {
            ni.n nVar = (ni.n) objD;
            speedTestResult.M = true;
            speedTestResult.f6097g = nVar.f18047i;
            speedTestResult.O = nVar.f18056t;
        } else {
            if (objD instanceof c1) {
                c1 c1Var = (c1) objD;
                long j = c1Var.f17714i;
                speedTestResult.N = true;
                if (jVar.f9014a && j == 0) {
                    j = c1Var.f17713h;
                }
                speedTestResult.f6098r = j;
                speedTestResult.P = c1Var.f17726w;
            } else if (objD instanceof z) {
                speedTestResult.L = true;
                speedTestResult.f6099x = ((z) objD).f18322h != null ? r6.intValue() : 0L;
            }
        }
        return speedTestResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(a8.f r6, rq.c r7) throws java.lang.Throwable {
        /*
            java.lang.Object r0 = r6.f199e
            fm.i r0 = (fm.i) r0
            boolean r1 = r7 instanceof fm.h
            if (r1 == 0) goto L17
            r1 = r7
            fm.h r1 = (fm.h) r1
            int r2 = r1.f9011y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f9011y = r2
            goto L1c
        L17:
            fm.h r1 = new fm.h
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r6 = r1.f9009r
            qq.a r7 = qq.a.COROUTINE_SUSPENDED
            int r2 = r1.f9011y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            lf.t1.G(r6)
            goto L4d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            lf.t1.G(r6)
            r1.f9011y = r4
            r0.getClass()
            du.f r6 = wt.d0.f24610a
            du.e r6 = du.e.f7570g
            d4.d1 r2 = new d4.d1
            r5 = 2
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = wt.w.B(r6, r2, r1)
            if (r6 != r7) goto L4d
            return r7
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5a
            r0.f9013b = r3
            r0.a()
        L5a:
            lq.b0 r6 = lq.b0.f15562a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.b(a8.f, rq.c):java.lang.Object");
    }

    public static final void c(f fVar, SpeedTestResult speedTestResult, gm.b bVar, long j) {
        fm.i iVar = (fm.i) fVar.f199e;
        iVar.getClass();
        iVar.f9012a = speedTestResult;
        iVar.f9013b = bVar;
        em.a aVar = (em.a) fVar.f202h;
        if (aVar != null) {
            aVar.b(new gm.a(bVar, false), speedTestResult, j);
        }
    }

    public void B(p pVar) {
        f0 f0VarR;
        SemanticsConfiguration semanticsConfigurationE;
        f0 f0VarR2;
        SemanticsConfiguration semanticsConfigurationE2;
        p pVar2 = (p) this.f202h;
        this.f202h = pVar;
        u.z zVar = (u.z) this.f201g;
        Object[] objArr = zVar.f23134a;
        int i10 = zVar.f23135b;
        for (int i11 = 0; i11 < i10; i11++) {
            a1.c cVar = (a1.c) objArr[i11];
            cVar.getClass();
            if (pVar2 != null && (f0VarR2 = x1.k.r(pVar2)) != null && (semanticsConfigurationE2 = f0VarR2.E()) != null && semanticsConfigurationE2.f1191a.b(e2.g.f7691f)) {
                ((AutofillManager) cVar.f11a.f2478d).notifyViewExited(cVar.f13c, f0VarR2.f24799c);
            }
            if (pVar != null && (f0VarR = x1.k.r(pVar)) != null && (semanticsConfigurationE = f0VarR.E()) != null && semanticsConfigurationE.f1191a.b(e2.g.f7691f)) {
                int i12 = f0VarR.f24799c;
                cVar.f14d.f8417a.v(i12, new a1.b(cVar, i12));
            }
        }
    }

    public void C(ServiceState serviceState, String str) {
        com.opensignal.sdk.common.measurements.base.f fVar = (com.opensignal.sdk.common.measurements.base.f) this.f197c;
        Integer numB = ((com.opensignal.sdk.common.measurements.base.e) this.f195a).b(serviceState, str);
        if (numB == null || numB.intValue() < 0) {
            numB = fVar.B(serviceState);
        }
        this.f199e = numB;
        Integer numA = null;
        this.f201g = serviceState == null ? null : com.opensignal.sdk.common.measurements.base.e.a(serviceState.toString(), com.opensignal.sdk.common.measurements.base.e.f5855c);
        if (((ch.f) this.f196b).g()) {
            numA = ((com.opensignal.sdk.common.measurements.base.c) this.f198d).E(serviceState);
        } else if (serviceState != null) {
            numA = com.opensignal.sdk.common.measurements.base.e.a(serviceState.toString(), com.opensignal.sdk.common.measurements.base.e.f5856d);
        }
        this.f202h = numA;
        this.f200f = fVar.B(serviceState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ad, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r4.f23127e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c4, code lost:
    
        if (((r4.f23123a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cc, code lost:
    
        r3 = r4.f23125c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d0, code lost:
    
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
    
        if (java.lang.Long.compare((r4.f23126d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        r3 = r4.f23123a;
        r8 = r4.f23125c;
        r9 = r4.f23124b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f7, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = mq.l.o0(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
    
        if (r5 == r8) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x013a, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0147, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0149, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014e, code lost:
    
        if (r13 == 254) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0151, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0170, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0172, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0190, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0193, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a4, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a6, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ca, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e5, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f3, code lost:
    
        r33 = r7;
        r4.f23127e = u.g0.a(r4.f23125c) - r4.f23126d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0204, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0206, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020b, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x020e, code lost:
    
        r3 = u.g0.b(r4.f23125c);
        r5 = r4.f23123a;
        r6 = r4.f23124b;
        r7 = r4.f23125c;
        r4.c(r3);
        r3 = r4.f23123a;
        r8 = r4.f23124b;
        r9 = r4.f23125c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0225, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0234, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0236, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0274, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027a, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0283, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0287, code lost:
    
        r32 = r3;
        r4.f23126d++;
        r3 = r4.f23127e;
        r5 = r4.f23123a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02a1, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a3, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a5, code lost:
    
        r4.f23127e = r3 - r21;
        r3 = r4.f23125c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0353, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0355, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.D(android.view.KeyEvent):boolean");
    }

    public l d() {
        Context context = (Context) this.f195a;
        l8.c cVar = (l8.c) this.f196b;
        lq.h hVarF = (lq.h) this.f197c;
        if (hVarF == null) {
            final int i10 = 0;
            hVarF = kc.f.F(new ar.a(this) { // from class: a8.d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f f194d;

                {
                    this.f194d = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ar.a
                public final Object c() {
                    h0 h0Var;
                    int largeMemoryClass;
                    d8.h hVar;
                    switch (i10) {
                        case 0:
                            Context context2 = (Context) this.f194d.f195a;
                            Bitmap.Config[] configArr = q8.i.f20736a;
                            double d6 = 0.2d;
                            try {
                                Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                                br.l.b(systemService);
                                if (((ActivityManager) systemService).isLowRamDevice()) {
                                    d6 = 0.15d;
                                }
                            } catch (Exception unused) {
                            }
                            int i11 = 0;
                            ag.b bVar = new ag.b(7, (byte) 0);
                            if (d6 > 0.0d) {
                                Bitmap.Config[] configArr2 = q8.i.f20736a;
                                try {
                                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                    br.l.b(systemService2);
                                    ActivityManager activityManager = (ActivityManager) systemService2;
                                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                                } catch (Exception unused2) {
                                    largeMemoryClass = 256;
                                }
                                double d10 = d6 * largeMemoryClass;
                                double d11 = 1024;
                                i11 = (int) (d10 * d11 * d11);
                            }
                            if (i11 > 0) {
                                i4.b bVar2 = new i4.b();
                                bVar2.f11196a = bVar;
                                bVar2.f11197d = new j8.d(i11, bVar2);
                                h0Var = bVar2;
                            } else {
                                h0Var = new h0(bVar);
                            }
                            return new j8.b(h0Var, bVar);
                        default:
                            f fVar = this.f194d;
                            m mVar = m.f20749a;
                            Context context3 = (Context) fVar.f195a;
                            synchronized (mVar) {
                                try {
                                    hVar = m.f20750d;
                                    if (hVar == null) {
                                        s sVar = cv.l.f6722a;
                                        du.f fVar2 = d0.f24610a;
                                        du.e eVar = du.e.f7570g;
                                        Bitmap.Config[] configArr3 = q8.i.f20736a;
                                        File cacheDir = context3.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileO0 = wq.a.o0(cacheDir);
                                        String str = cv.w.f6742d;
                                        cv.w wVarR = cg.e.r(fileO0);
                                        long jI = 10485760;
                                        try {
                                            File file = wVarR.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            jI = vc.e.i((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        d8.h hVar2 = new d8.h(jI, sVar, wVarR, eVar);
                                        m.f20750d = hVar2;
                                        hVar = hVar2;
                                    }
                                } finally {
                                }
                            }
                            return hVar;
                    }
                }
            });
        }
        lq.h hVarF2 = (lq.h) this.f198d;
        if (hVarF2 == null) {
            final int i11 = 1;
            hVarF2 = kc.f.F(new ar.a(this) { // from class: a8.d

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ f f194d;

                {
                    this.f194d = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // ar.a
                public final Object c() {
                    h0 h0Var;
                    int largeMemoryClass;
                    d8.h hVar;
                    switch (i11) {
                        case 0:
                            Context context2 = (Context) this.f194d.f195a;
                            Bitmap.Config[] configArr = q8.i.f20736a;
                            double d6 = 0.2d;
                            try {
                                Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                                br.l.b(systemService);
                                if (((ActivityManager) systemService).isLowRamDevice()) {
                                    d6 = 0.15d;
                                }
                            } catch (Exception unused) {
                            }
                            int i112 = 0;
                            ag.b bVar = new ag.b(7, (byte) 0);
                            if (d6 > 0.0d) {
                                Bitmap.Config[] configArr2 = q8.i.f20736a;
                                try {
                                    Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                    br.l.b(systemService2);
                                    ActivityManager activityManager = (ActivityManager) systemService2;
                                    largeMemoryClass = (context2.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                                } catch (Exception unused2) {
                                    largeMemoryClass = 256;
                                }
                                double d10 = d6 * largeMemoryClass;
                                double d11 = 1024;
                                i112 = (int) (d10 * d11 * d11);
                            }
                            if (i112 > 0) {
                                i4.b bVar2 = new i4.b();
                                bVar2.f11196a = bVar;
                                bVar2.f11197d = new j8.d(i112, bVar2);
                                h0Var = bVar2;
                            } else {
                                h0Var = new h0(bVar);
                            }
                            return new j8.b(h0Var, bVar);
                        default:
                            f fVar = this.f194d;
                            m mVar = m.f20749a;
                            Context context3 = (Context) fVar.f195a;
                            synchronized (mVar) {
                                try {
                                    hVar = m.f20750d;
                                    if (hVar == null) {
                                        s sVar = cv.l.f6722a;
                                        du.f fVar2 = d0.f24610a;
                                        du.e eVar = du.e.f7570g;
                                        Bitmap.Config[] configArr3 = q8.i.f20736a;
                                        File cacheDir = context3.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileO0 = wq.a.o0(cacheDir);
                                        String str = cv.w.f6742d;
                                        cv.w wVarR = cg.e.r(fileO0);
                                        long jI = 10485760;
                                        try {
                                            File file = wVarR.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            jI = vc.e.i((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        d8.h hVar2 = new d8.h(jI, sVar, wVarR, eVar);
                                        m.f20750d = hVar2;
                                        hVar = hVar2;
                                    }
                                } finally {
                                }
                            }
                            return hVar;
                    }
                }
            });
        }
        lq.h hVarF3 = (lq.h) this.f199e;
        if (hVarF3 == null) {
            hVarF3 = kc.f.F(new e());
        }
        c cVar2 = (c) this.f200f;
        if (cVar2 == null) {
            cVar2 = c.f192a;
        }
        a aVar = (a) this.f201g;
        if (aVar == null) {
            mq.w wVar = mq.w.f16945a;
            aVar = new a(wVar, wVar, wVar, wVar, wVar);
        }
        return new l(context, cVar, hVarF, hVarF2, hVarF3, cVar2, aVar, (q8.l) this.f202h);
    }

    public void e() {
        p0 p0Var;
        Iterator it = ((ArrayList) this.f199e).iterator();
        while (true) {
            if (!it.hasNext()) {
                p0Var = p0.ALLOW;
                break;
            }
            g0 g0Var = (g0) it.next();
            p0 p0Var2 = g0Var.f10071c.f10191c;
            p0Var = p0.PREVENT;
            if (p0Var2 == p0Var || (p0Var2 == p0.PREVENT_WHEN_EMPTY && g0Var.f10073e == 0)) {
                break;
            }
        }
        h7.f fVar = (h7.f) this.f195a;
        if (p0Var != fVar.f10191c) {
            fVar.f10191c = p0Var;
            fVar.f10189a.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f() {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.f():boolean");
    }

    public boolean g(boolean z10) {
        al.c cVar;
        p pVar = (p) this.f202h;
        if (pVar != null) {
            B(null);
            pVar.c0(e1.n.Active, e1.n.Inactive);
            if (!pVar.f26495b.f26506o) {
                u1.a.b("visitAncestors called on an unattached node");
            }
            z0.l lVar = pVar.f26495b.f26499f;
            f0 f0VarR = x1.k.r(pVar);
            while (f0VarR != null) {
                if ((((z0.l) f0VarR.D.f825g).f26498e & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.f26497d & 1024) != 0) {
                            p0.e eVar = null;
                            z0.l lVarE = lVar;
                            while (lVarE != null) {
                                if (lVarE instanceof p) {
                                    ((p) lVarE).c0(e1.n.ActiveParent, e1.n.Inactive);
                                } else if ((lVarE.f26497d & 1024) != 0 && (lVarE instanceof x1.j)) {
                                    int i10 = 0;
                                    for (z0.l lVar2 = ((x1.j) lVarE).f24863q; lVar2 != null; lVar2 = lVar2.f26500g) {
                                        if ((lVar2.f26497d & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lVarE = lVar2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new p0.e(new z0.l[16]);
                                                }
                                                if (lVarE != null) {
                                                    eVar.b(lVarE);
                                                    lVarE = null;
                                                }
                                                eVar.b(lVar2);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lVarE = x1.k.e(eVar);
                            }
                        }
                        lVar = lVar.f26499f;
                    }
                }
                f0VarR = f0VarR.C();
                lVar = (f0VarR == null || (cVar = f0VarR.D) == null) ? null : (v1) cVar.f824f;
            }
        }
        return true;
    }

    public boolean h(int i10, boolean z10, boolean z11) {
        boolean z12 = true;
        if (z10) {
            g(z10);
        } else {
            int i11 = e1.h.f7647a[e1.d.s((p) this.f197c).ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                z12 = false;
            } else {
                if (i11 != 4) {
                    throw new bf.n();
                }
                g(z10);
            }
        }
        if (z12 && z11) {
            i();
        }
        return z12;
    }

    public void i() {
        AndroidComposeView androidComposeView = (AndroidComposeView) this.f195a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    public List j() {
        Set setH = i3.g.H("com.runningsdk.action.IS_DATA_COLLECTOR");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            List<ResolveInfo> listQueryBroadcastReceivers = ((Context) this.f195a).getPackageManager().queryBroadcastReceivers(new Intent((String) it.next(), (Uri) null), 0);
            br.l.d(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
            for (ResolveInfo resolveInfo : listQueryBroadcastReceivers) {
                if (resolveInfo != null) {
                    String str = resolveInfo.activityInfo.packageName;
                    br.l.b(str);
                    linkedHashSet.add(str);
                }
            }
        }
        return mq.o.Q0(linkedHashSet);
    }

    public int k(g0 g0Var) {
        g0 g0Var2;
        Iterator it = ((ArrayList) this.f199e).iterator();
        int i10 = 0;
        while (it.hasNext() && (g0Var2 = (g0) it.next()) != g0Var) {
            i10 += g0Var2.f10073e;
        }
        return i10;
    }

    public String l(String str) {
        try {
            return ((o2.g) this.f198d).X(str);
        } catch (Exception e4) {
            ch.n.d("ProcessChecker", "Error decrypting string.", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:3:0x0009, B:5:0x0012, B:10:0x0020, B:14:0x002a, B:17:0x0036, B:19:0x003c, B:20:0x0041, B:22:0x0049, B:24:0x004e, B:26:0x0054, B:30:0x005a, B:128:0x0176, B:130:0x017c, B:131:0x017f, B:133:0x018a, B:136:0x0198, B:140:0x01a2, B:143:0x01a8, B:144:0x01ad, B:164:0x01e7, B:145:0x01b1, B:147:0x01b7, B:149:0x01bb, B:151:0x01c3, B:153:0x01c9, B:157:0x01d1, B:159:0x01da, B:160:0x01de, B:161:0x01e1, B:165:0x01ec, B:166:0x01ef, B:168:0x01f5, B:170:0x01f9, B:173:0x0202, B:175:0x020a, B:182:0x0221, B:184:0x0226, B:186:0x022a, B:209:0x026c, B:190:0x0236, B:192:0x023c, B:194:0x0240, B:196:0x0248, B:198:0x024e, B:202:0x0256, B:204:0x025f, B:205:0x0263, B:206:0x0266, B:210:0x0271, B:214:0x0281, B:216:0x0286, B:218:0x028a, B:241:0x02cc, B:222:0x0296, B:224:0x029c, B:226:0x02a0, B:228:0x02a8, B:230:0x02ae, B:234:0x02b6, B:236:0x02bf, B:237:0x02c3, B:238:0x02c6, B:243:0x02d3, B:245:0x02da, B:34:0x0062, B:36:0x0068, B:37:0x006b, B:39:0x0073, B:42:0x0081, B:46:0x008b, B:77:0x00e0, B:79:0x00e4, B:49:0x0090, B:51:0x0096, B:53:0x009a, B:55:0x00a2, B:57:0x00a8, B:61:0x00b0, B:63:0x00b9, B:64:0x00bd, B:65:0x00c0, B:68:0x00c6, B:69:0x00cb, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:80:0x00ea, B:82:0x00f0, B:83:0x00f3, B:85:0x00fd, B:88:0x010b, B:92:0x0115, B:123:0x016a, B:125:0x016e, B:95:0x011a, B:97:0x0120, B:99:0x0124, B:101:0x012c, B:103:0x0132, B:107:0x013a, B:109:0x0143, B:110:0x0147, B:111:0x014a, B:114:0x0150, B:115:0x0155, B:116:0x0158, B:118:0x015e, B:120:0x0162), top: B:254:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v10, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v11, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v17, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r0v25, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v4, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r15v5, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r15v9, types: [z0.l] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v37, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [p0.e] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(android.view.KeyEvent r14, ar.a r15) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.m(android.view.KeyEvent, ar.a):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x018d, code lost:
    
        throw new java.lang.RuntimeException(h0.b.m("encoderOutputBuffer ", r6, " was null"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n(boolean r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.n(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(android.graphics.Bitmap r5) {
        /*
            r4 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            br.l.d(r0, r1)
            java.lang.String r1 = "xiaomi"
            r2 = 1
            boolean r1 = tt.l.q0(r0, r1, r2)
            r3 = 0
            if (r1 != 0) goto L41
            java.lang.String r1 = "motorola"
            boolean r0 = tt.l.q0(r0, r1, r2)
            if (r0 != 0) goto L41
            io.sentry.android.replay.util.d r0 = io.sentry.android.replay.util.d.SOC_MANUFACTURER
            java.lang.String r1 = io.sentry.android.replay.util.f.a(r0)
            java.lang.String r2 = "spreadtrum"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L41
            java.lang.String r0 = io.sentry.android.replay.util.f.a(r0)
            java.lang.String r1 = "unisoc"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L34
            goto L41
        L34:
            java.lang.Object r0 = r4.f202h
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L3f
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L4b
        L3f:
            r0 = r3
            goto L4b
        L41:
            java.lang.Object r0 = r4.f202h
            android.view.Surface r0 = (android.view.Surface) r0
            if (r0 == 0) goto L3f
            android.graphics.Canvas r0 = r0.lockCanvas(r3)
        L4b:
            if (r0 == 0) goto L51
            r1 = 0
            r0.drawBitmap(r5, r1, r1, r3)
        L51:
            java.lang.Object r5 = r4.f202h
            android.view.Surface r5 = (android.view.Surface) r5
            if (r5 == 0) goto L5a
            r5.unlockCanvasAndPost(r0)
        L5a:
            r5 = 0
            r4.n(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.o(android.graphics.Bitmap):void");
    }

    public h7.g p(int i10) {
        h7.g gVar = (h7.g) this.f200f;
        if (gVar.f10067b) {
            gVar = new h7.g();
        } else {
            gVar.f10067b = true;
        }
        Iterator it = ((ArrayList) this.f199e).iterator();
        int i11 = i10;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var = (g0) it.next();
            int i12 = g0Var.f10073e;
            if (i12 > i11) {
                gVar.f10068c = g0Var;
                gVar.f10066a = i11;
                break;
            }
            i11 -= i12;
        }
        if (((g0) gVar.f10068c) != null) {
            return gVar;
        }
        throw new IllegalArgumentException(h0.b.h(i10, "Cannot find wrapper for "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0123, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Boolean q(int r20, f1.c r21, ar.k r22) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.f.q(int, f1.c, ar.k):java.lang.Boolean");
    }

    public String r() {
        if (((String) this.f200f) == null) {
            this.f200f = l("pf0jhNQg6y2b2FSGxKknMwOxhO5W0THJngWA2wV6Jbvd7BBCzAR4zEpOXtjL9zMh9DZtpF0qPDDke9p0MFcCHA]==");
        }
        String str = (String) this.f200f;
        return str == null ? "" : str;
    }

    public String s() {
        if (((String) this.f201g) == null) {
            this.f201g = l("pzgdvJ8xZ4TC/XlDA21S5iyQ3baaJli81FjeYYwZVWYjciXcm7gxcVjRcexw6/H8lCHJyPnmqSmly5emOmI3vg==");
        }
        String str = (String) this.f201g;
        return str == null ? "" : str;
    }

    public String t() {
        if (((String) this.f199e) == null) {
            this.f199e = l("GBq68DV9BcS+xs28Zn6R2mJTbY9UBU2Rg9O+ilI4e8K69mxk/QUQyFzfz6vJiFlL");
        }
        String str = (String) this.f199e;
        return str == null ? "" : str;
    }

    public JSONObject u() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nrState", (Integer) this.f199e);
            jSONObject.put("experimentalNrState", (Integer) this.f200f);
            jSONObject.put("nrBearer", (Integer) this.f201g);
            jSONObject.put("nrFrequencyRange", (Integer) this.f202h);
            return jSONObject;
        } catch (JSONException e4) {
            ch.n.b("NrStateExtractor", e4);
            return jSONObject;
        }
    }

    public String v() {
        if (((String) this.f202h) == null) {
            this.f202h = l("MN5KUmS4mUG67wnwz82A94I3q6pWY3Ay8aiObEdgmHiEvJNeHJTEzLXT9mQOKkiY");
        }
        String str = (String) this.f202h;
        return str == null ? "" : str;
    }

    public g0 w(n1 n1Var) {
        g0 g0Var = (g0) ((IdentityHashMap) this.f198d).get(n1Var);
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + n1Var + ", seems like it is not bound by this adapter: " + this);
    }

    public int x(q0 q0Var) {
        ArrayList arrayList = (ArrayList) this.f199e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g0) arrayList.get(i10)).f10071c == q0Var) {
                return i10;
            }
        }
        return -1;
    }

    public void y() {
        MediaCodec mediaCodec = (MediaCodec) this.f198d;
        try {
            n(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = (Surface) this.f202h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = ((io.sentry.android.replay.video.b) this.f201g).f12010b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th2) {
            ((x5) this.f195a).getLogger().g(b5.DEBUG, "Failed to properly release video encoder", th2);
        }
    }

    public boolean z() {
        tv.b bVar = (tv.b) this.f197c;
        String strC = bVar.c();
        return (strC == null || strC.length() == 0 || br.l.a(bVar.c(), "16") || System.currentTimeMillis() <= ((AtomicLong) bVar.f23027a).get() + ((long) 86400000)) ? false : true;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f195a = obj;
        this.f196b = obj2;
        this.f197c = obj3;
        this.f198d = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f195a = obj;
        this.f196b = obj2;
        this.f197c = obj3;
        this.f198d = obj4;
        this.f199e = obj5;
        this.f200f = obj6;
        this.f201g = obj7;
        this.f202h = obj8;
    }

    public f(kj.a aVar, xj.l lVar, fm.k kVar, fm.j jVar, fm.i iVar) {
        br.l.e(lVar, "sdkResultMapper");
        br.l.e(kVar, "newSdkSpeedTestStepMapper");
        br.l.e(jVar, "newSdkSpeedTestResultMapper");
        br.l.e(iVar, "newSdkSpeedTestRepository");
        this.f195a = aVar;
        this.f196b = lVar;
        this.f197c = kVar;
        this.f198d = jVar;
        this.f199e = iVar;
        this.f200f = new tm.c();
        this.f201g = new b9.c(21, this);
    }

    public f(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f195a = androidComposeView;
        this.f196b = androidComposeView2;
        this.f197c = new p(2, null, 6);
        this.f198d = new e1.e(this, androidComposeView2);
        this.f199e = new z0() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // x1.z0
            public final l d() {
                return (p) this.f1127a.f197c;
            }

            @Override // x1.z0
            public final /* bridge */ /* synthetic */ void e(l lVar) {
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return ((p) this.f1127a.f197c).hashCode();
            }
        };
        this.f201g = new u.z(1);
    }

    public f(h7.f fVar, h7.e eVar) {
        this.f197c = new ArrayList();
        this.f198d = new IdentityHashMap();
        this.f199e = new ArrayList();
        this.f200f = new h7.g();
        this.f195a = fVar;
        eVar.getClass();
        ag.b bVar = new ag.b((char) 0, 2);
        bVar.f346g = new SparseArray();
        bVar.f345d = 0;
        this.f196b = bVar;
        h7.d dVar = eVar.f10037a;
        this.f201g = dVar;
        if (dVar == h7.d.NO_STABLE_IDS) {
            this.f202h = new a2.g(26);
            return;
        }
        if (dVar == h7.d.ISOLATED_STABLE_IDS) {
            ca.n nVar = new ca.n();
            nVar.f3485a = 0L;
            this.f202h = nVar;
        } else {
            if (dVar == h7.d.SHARED_STABLE_IDS) {
                this.f202h = new r1(0, (byte) 0);
                return;
            }
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    public f(Context context) {
        this.f195a = context.getApplicationContext();
        this.f196b = q8.f.f20732a;
        this.f197c = null;
        this.f198d = null;
        this.f199e = null;
        this.f200f = null;
        this.f201g = null;
        this.f202h = new q8.l();
    }

    public f(l lVar) {
        this.f195a = lVar.f211a.getApplicationContext();
        this.f196b = lVar.f212b;
        this.f197c = lVar.f213c;
        this.f198d = lVar.f214d;
        this.f199e = lVar.f215e;
        this.f200f = lVar.f216f;
        this.f201g = lVar.f217g;
        this.f202h = lVar.f218h;
    }
}

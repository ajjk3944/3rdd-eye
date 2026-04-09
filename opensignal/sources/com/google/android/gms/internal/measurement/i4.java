package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ne.i f5073a;

    /* renamed from: b, reason: collision with root package name */
    public static qc.o f5074b;

    public static final float A(long j, float f10, t2.c cVar) {
        float fC;
        long jB = t2.k.b(j);
        if (t2.l.a(jB, 4294967296L)) {
            if (cVar.y() <= 1.05d) {
                return cVar.L(j);
            }
            fC = t2.k.c(j) / t2.k.c(cVar.r(f10));
        } else {
            if (!t2.l.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = t2.k.c(j);
        }
        return fC * f10;
    }

    public static final Object B(Set set, Enum r22, Enum r32, Enum r42, boolean z10) {
        if (!z10) {
            if (r42 != null) {
                set = mq.o.U0(mq.f0.O(set, r42));
            }
            return mq.o.J0(set);
        }
        Enum r12 = set.contains(r22) ? r22 : set.contains(r32) ? r32 : null;
        if (br.l.a(r12, r22) && br.l.a(r42, r32)) {
            return null;
        }
        return r42 == null ? r12 : r42;
    }

    public static final void C(View view, l7.e eVar) {
        br.l.e(view, "<this>");
        view.setTag(l7.a.view_tree_saved_state_registry_owner, eVar);
    }

    public static final void D(Spannable spannable, long j, int i10, int i11) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(g1.f0.q(j)), i10, i11, 33);
        }
    }

    public static final void E(Spannable spannable, long j, t2.c cVar, int i10, int i11) {
        long jB = t2.k.b(j);
        if (t2.l.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(dr.a.F(cVar.L(j)), false), i10, i11, 33);
        } else if (t2.l.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(t2.k.c(j)), i10, i11, 33);
        }
    }

    public static final void F(Spannable spannable, n2.b bVar, int i10, int i11) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(mq.p.a0(bVar, 10));
            Iterator it = bVar.f17379a.iterator();
            while (it.hasNext()) {
                arrayList.add(((n2.a) it.next()).f17377a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }

    public static final void G(o0.h0 h0Var, int i10, Object obj) {
        h0Var.f18710e[(h0Var.f18711f - h0Var.f18706a[h0Var.f18707b - 1].f18527c) + i10] = obj;
    }

    public static final void H(o0.h0 h0Var, int i10, Object obj, int i11, Object obj2) {
        int i12 = h0Var.f18711f - h0Var.f18706a[h0Var.f18707b - 1].f18527c;
        Object[] objArr = h0Var.f18710e;
        objArr[i10 + i12] = obj;
        objArr[i12 + i11] = obj2;
    }

    public static final as.p I(n.a aVar) {
        br.l.e(aVar, "<this>");
        as.p pVar = (as.p) as.q.f2244d.get(aVar);
        return pVar == null ? rr.p.f(aVar) : pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ks.d, y0.h] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList J(n0.r1 r1Var, int i10, Integer num) {
        ?? hVar = new y0.h(r1Var);
        int iQ = r1Var.q(i10);
        n0.a aVarA = r1Var.a(i10);
        while (i10 >= 0) {
            hVar.f(r1Var.f17297a.g(i10), num);
            if (iQ >= 0) {
                n0.a aVar = aVarA;
                aVarA = r1Var.a(iQ);
                i10 = iQ;
                iQ = r1Var.q(iQ);
                num = aVar;
            } else {
                i10 = iQ;
                num = aVarA;
            }
        }
        return hVar.f14495a;
    }

    public static CopyOnWriteArrayList K(CopyOnWriteArrayList copyOnWriteArrayList) {
        ArrayList arrayList = new ArrayList();
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw w.g.d(it);
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }

    public static void L(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iU = U(parcel, i10);
        parcel.writeBundle(bundle);
        W(parcel, iU);
    }

    public static void M(Parcel parcel, int i10, Float f10) {
        if (f10 == null) {
            return;
        }
        S(parcel, i10, 4);
        parcel.writeFloat(f10.floatValue());
    }

    public static void N(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iU = U(parcel, i10);
        parcel.writeStrongBinder(iBinder);
        W(parcel, iU);
    }

    public static void O(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iU = U(parcel, i10);
        parcelable.writeToParcel(parcel, i11);
        W(parcel, iU);
    }

    public static void P(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iU = U(parcel, i10);
        parcel.writeString(str);
        W(parcel, iU);
    }

    public static void Q(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iU = U(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iU);
    }

    public static void R(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iU = U(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        W(parcel, iU);
    }

    public static void S(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static int T(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static int U(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static long V(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static void W(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static final float a(long j, long j7) {
        return Math.min(Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final boolean b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (br.l.g(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final void c(HashSet hashSet, mv.b bVar) throws ba.l {
        br.l.e(hashSet, "<this>");
        mv.d dVar = bVar.f17065g;
        boolean zAdd = hashSet.add(bVar);
        if (!zAdd && !dVar.f17068b) {
            throw new ba.l("Definition '" + bVar + "' try to override existing definition. Please use override option to fix it");
        }
        if (zAdd || !dVar.f17068b) {
            return;
        }
        hashSet.remove(bVar);
        hashSet.add(bVar);
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static final Object f(dd.r rVar, tg.t tVar) throws Exception {
        if (!rVar.i()) {
            wt.g gVar = new wt.g(1, xu.l.D(tVar));
            gVar.v();
            rVar.b(fu.a.f9120a, new b9.e(24, gVar));
            Object objU = gVar.u();
            qq.a aVar = qq.a.COROUTINE_SUSPENDED;
            return objU;
        }
        Exception excG = rVar.g();
        if (excG != null) {
            throw excG;
        }
        if (!rVar.f7321d) {
            return rVar.h();
        }
        throw new CancellationException("Task " + rVar + " was cancelled normally.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ks.d, y0.h] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List i(n0.v1 v1Var, Integer num, int i10, Integer num2) {
        int iC;
        u.z zVar;
        if (v1Var.f17353w || v1Var.p() == 0) {
            return mq.w.f16945a;
        }
        ?? hVar = new y0.h(v1Var);
        if (num2 != null) {
            iC = num2.intValue();
        } else {
            iC = v1Var.f17352v;
            if (iC < 0) {
                iC = v1Var.C(v1Var.f17334b, i10);
            }
        }
        if (num == 0) {
            int iL = v1Var.f17341i - v1Var.L(v1Var.f17334b, v1Var.r(i10));
            u.t tVar = v1Var.f17349s;
            num = Integer.valueOf(iL + ((tVar == null || (zVar = (u.z) tVar.b(i10)) == null) ? 0 : zVar.f23135b));
        }
        while (i10 >= 0) {
            hVar.f(v1Var.M(i10), num);
            num = v1Var.b(i10);
            if (iC >= 0) {
                int i11 = iC;
                iC = v1Var.C(v1Var.f17334b, iC);
                i10 = i11;
            } else {
                i10 = iC;
            }
        }
        return hVar.f14495a;
    }

    public static final void j(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0043, B:13:0x0046, B:15:0x004c, B:17:0x0050, B:18:0x0060, B:20:0x0062, B:21:0x0065), top: B:35:0x000a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:3:0x000a, B:10:0x002a, B:12:0x0043, B:13:0x0046, B:15:0x004c, B:17:0x0050, B:18:0x0060, B:20:0x0062, B:21:0x0065), top: B:35:0x000a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static et.c k(qs.c r7, gt.l r8, rr.a0 r9, java.io.InputStream r10) throws java.io.IOException {
        /*
            java.lang.String r0 = "fqName"
            br.l.e(r7, r0)
            java.lang.String r0 = "module"
            br.l.e(r9, r0)
            ms.a r0 = ms.a.f16987f     // Catch: java.lang.Throwable -> L66
            ms.a r6 = lf.t1.C(r10)     // Catch: java.lang.Throwable -> L66
            ms.a r0 = ms.a.f16987f     // Catch: java.lang.Throwable -> L66
            int r1 = r6.f18521c     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "ourVersion"
            br.l.e(r0, r2)     // Catch: java.lang.Throwable -> L66
            int r2 = r0.f18521c     // Catch: java.lang.Throwable -> L66
            int r3 = r0.f18520b     // Catch: java.lang.Throwable -> L66
            int r4 = r6.f18520b     // Catch: java.lang.Throwable -> L66
            if (r4 != 0) goto L26
            if (r3 != 0) goto L69
            if (r1 != r2) goto L69
            goto L2a
        L26:
            if (r4 != r3) goto L69
            if (r1 > r2) goto L69
        L2a:
            rs.g r1 = new rs.g     // Catch: java.lang.Throwable -> L66
            r1.<init>()     // Catch: java.lang.Throwable -> L66
            ms.b.a(r1)     // Catch: java.lang.Throwable -> L66
            ls.a r2 = ls.e0.G     // Catch: java.lang.Throwable -> L66
            r2.getClass()     // Catch: java.lang.Throwable -> L66
            f5.u r3 = new f5.u     // Catch: java.lang.Throwable -> L66
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r2.a(r3, r1)     // Catch: java.lang.Throwable -> L66
            rs.b r1 = (rs.b) r1     // Catch: java.lang.Throwable -> L66
            r2 = 0
            r3.c(r2)     // Catch: rs.t -> L61 java.lang.Throwable -> L66
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L50
            ls.e0 r1 = (ls.e0) r1     // Catch: java.lang.Throwable -> L66
        L4e:
            r5 = r1
            goto L6b
        L50:
            bf.n r7 = new bf.n     // Catch: java.lang.Throwable -> L66
            r7.<init>()     // Catch: java.lang.Throwable -> L66
            rs.t r8 = new rs.t     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L66
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L66
            r8.f21776a = r1     // Catch: java.lang.Throwable -> L66
            throw r8     // Catch: java.lang.Throwable -> L66
        L61:
            r0 = move-exception
            r7 = r0
            r7.f21776a = r1     // Catch: java.lang.Throwable -> L66
            throw r7     // Catch: java.lang.Throwable -> L66
        L66:
            r0 = move-exception
            r7 = r0
            goto L9a
        L69:
            r1 = 0
            goto L4e
        L6b:
            r10.close()
            if (r5 == 0) goto L79
            et.c r1 = new et.c
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L79:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Kotlin built-in definition format version is not supported: expected "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r9 = ", actual "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ". Please update Kotlin"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L9a:
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r0 = move-exception
            r8 = r0
            ic.a.g(r10, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.i4.k(qs.c, gt.l, rr.a0, java.io.InputStream):et.c");
    }

    public static final wr.b l(p.l2 l2Var, qs.b bVar, ps.f fVar) {
        br.l.e(l2Var, "<this>");
        br.l.e(bVar, "classId");
        br.l.e(fVar, "jvmMetadataVersion");
        i.g0 g0VarC = l2Var.C(bVar, fVar);
        if (g0VarC != null) {
            return (wr.b) g0VarC.f11051a;
        }
        return null;
    }

    public static final Integer m(n0.r1 r1Var, n0.s sVar, int i10, int i11) {
        Integer numM;
        int[] iArr = r1Var.f17298b;
        while (i10 < i11) {
            int i12 = iArr[(i10 * 5) + 3] + i10;
            if (r1Var.j(i10) && r1Var.i(i10) == 206 && br.l.a(r1Var.p(iArr, i10), n0.q.f17286e)) {
                r1Var.h(i10, 0);
            }
            if (r1Var.d(i10) && (numM = m(r1Var, sVar, i10 + 1, i12)) != null) {
                return Integer.valueOf(numM.intValue());
            }
            i10 = i12;
        }
        return null;
    }

    public static wc.b n(Bitmap bitmap) {
        cc.s.i(bitmap, "image must not be null");
        try {
            qc.o oVar = f5074b;
            cc.s.i(oVar, "IBitmapDescriptorFactory is not initialized");
            qc.m mVar = (qc.m) oVar;
            Parcel parcelR = mVar.R();
            qc.l.c(parcelR, bitmap);
            Parcel parcelE = mVar.e(parcelR, 6);
            jc.b bVarU = jc.d.U(parcelE.readStrongBinder());
            parcelE.recycle();
            return new wc.b(bVarU);
        } catch (RemoteException e4) {
            throw new bf.n(e4);
        }
    }

    public static ni.i o(String str) {
        if (str == null || str.length() == 0 || tt.l.D0(str)) {
            ch.n.g("DataUsageCoreResult", "Null or blank JSON");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ni.i(xu.d.C("dt_delta_tx_bytes_wifi", jSONObject), xu.d.C("dt_delta_rx_bytes_wifi", jSONObject), xu.d.C("dt_delta_tx_bytes_cell", jSONObject), xu.d.C("dt_delta_rx_bytes_cell", jSONObject), xu.d.C("dt_delta_interval", jSONObject), xu.d.C("dt_delta_tx_drops_wifi", jSONObject), xu.d.C("dt_delta_tx_packets_wifi", jSONObject), xu.d.C("dt_delta_tx_drops_cell", jSONObject), xu.d.C("dt_delta_tx_packets_cell", jSONObject), xu.d.C("dt_delta_rx_drops_wifi", jSONObject), xu.d.C("dt_delta_rx_packets_wifi", jSONObject), xu.d.C("dt_delta_rx_drops_cell", jSONObject), xu.d.C("dt_delta_rx_packets_cell", jSONObject), xu.d.C("dt_tot_tx_drops_wifi", jSONObject), xu.d.C("dt_tot_tx_packets_wifi", jSONObject), xu.d.C("dt_tot_tx_drops_cell", jSONObject), xu.d.C("dt_tot_tx_packets_cell", jSONObject), xu.d.C("dt_tot_rx_drops_wifi", jSONObject), xu.d.C("dt_tot_rx_packets_wifi", jSONObject), xu.d.C("dt_tot_rx_drops_cell", jSONObject), xu.d.C("dt_tot_rx_packets_cell", jSONObject), xu.d.C("dt_tot_rx_bytes_cell", jSONObject), xu.d.C("dt_tot_rx_bytes_wifi", jSONObject), xu.d.C("dt_tot_tx_bytes_cell", jSONObject), xu.d.C("dt_tot_tx_bytes_wifi", jSONObject));
        } catch (JSONException unused) {
            ch.n.c("DataUsageCoreResult", "Trying to parse invalid JSON: ".concat(str));
            return null;
        }
    }

    public static bh.a p(JSONObject jSONObject) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        br.l.e(jSONObject, "jsonObject");
        try {
            int iOptInt = jSONObject.optInt("priority", 100);
            Integer numY = xu.d.y("result_code", jSONObject);
            if (numY != null) {
                int iIntValue = numY.intValue();
                Integer numY2 = xu.d.y("category", jSONObject);
                int iIntValue2 = numY2 != null ? numY2.intValue() : -1;
                Integer numY3 = xu.d.y("explanation", jSONObject);
                int iIntValue3 = numY3 != null ? numY3.intValue() : -1;
                Integer numY4 = xu.d.y("icon", jSONObject);
                int iIntValue4 = numY4 != null ? numY4.intValue() : -1;
                Iterable iterableZ = xu.d.z(jSONObject);
                if (iterableZ == null) {
                    iterableZ = mq.w.f16945a;
                }
                bh.c.Companion.getClass();
                Iterator<E> it = bh.c.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((bh.c) next).getId() == iIntValue2) {
                        break;
                    }
                }
                bh.c cVar = (bh.c) next;
                if (cVar != null) {
                    bh.e.Companion.getClass();
                    Iterator<E> it2 = bh.e.getEntries().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((bh.e) next2).getId() == iIntValue3) {
                            break;
                        }
                    }
                    bh.e eVar = (bh.e) next2;
                    if (eVar != null) {
                        bh.g.Companion.getClass();
                        Iterator<E> it3 = bh.g.getEntries().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            if (((bh.g) next3).getId() == iIntValue4) {
                                break;
                            }
                        }
                        bh.g gVar = (bh.g) next3;
                        if (gVar == null) {
                            gVar = bh.g.TESTING;
                        }
                        bh.g gVar2 = gVar;
                        ArrayList arrayList = new ArrayList();
                        Iterator it4 = iterableZ.iterator();
                        while (it4.hasNext()) {
                            int iIntValue5 = ((Number) it4.next()).intValue();
                            bh.m.Companion.getClass();
                            Iterator<E> it5 = bh.m.getEntries().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it5.next();
                                if (((bh.m) next4).getId() == iIntValue5) {
                                    break;
                                }
                            }
                            bh.m mVar = (bh.m) next4;
                            if (mVar != null) {
                                arrayList.add(mVar);
                            }
                        }
                        return new bh.a(iOptInt, iIntValue, cVar, eVar, gVar2, arrayList);
                    }
                }
            }
            return null;
        } catch (JSONException e4) {
            ch.n.c("AssistantAnalysisResult", ir.f0.W(e4));
            return null;
        }
    }

    public static final l7.e q(View view) {
        while (view != null) {
            Object tag = view.getTag(l7.a.view_tree_saved_state_registry_owner);
            l7.e eVar = tag instanceof l7.e ? (l7.e) tag : null;
            if (eVar != null) {
                return eVar;
            }
            Object objB = se.b.B(view);
            view = objB instanceof View ? (View) objB : null;
        }
        return null;
    }

    public static final int r(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8);
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final int s(Cursor cursor, String str) {
        String strU0;
        br.l.e(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    br.l.d(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String strG = h0.b.g('`', ".", str);
                    int length = columnNames.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < length) {
                        String str2 = columnNames[i11];
                        int i12 = i10 + 1;
                        if (str2.length() >= str.length() + 2 && (tt.s.f0(str2, strConcat, false) || (str2.charAt(0) == '`' && tt.s.f0(str2, strG, false)))) {
                            columnIndex = i10;
                            break;
                        }
                        i11++;
                        i10 = i12;
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            br.l.d(columnNames2, "c.columnNames");
            strU0 = mq.l.u0(columnNames2, null, null, null, 63);
        } catch (Exception unused) {
            strU0 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + strU0);
    }

    public static final boolean t(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static st.k u(ar.n nVar) {
        st.k kVar = new st.k();
        kVar.f22300r = xu.l.m(nVar, kVar, kVar);
        return kVar;
    }

    public static y8.a v(d9.c cVar, r8.h hVar) {
        return new y8.a(0, c9.r.a(cVar, hVar, 1.0f, c9.f.f3400d, false));
    }

    public static y8.b w(d9.b bVar, r8.h hVar, boolean z10) {
        return new y8.b(14, c9.r.a(bVar, hVar, z10 ? e9.j.c() : 1.0f, c9.f.f3401g, false));
    }

    public static y8.a x(d9.c cVar, r8.h hVar, int i10) {
        c9.l lVar = new c9.l();
        lVar.f3420a = i10;
        ArrayList arrayListA = c9.r.a(cVar, hVar, 1.0f, lVar, false);
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            f9.a aVar = (f9.a) arrayListA.get(i11);
            z8.c cVar2 = (z8.c) aVar.f8705b;
            z8.c cVar3 = (z8.c) aVar.f8706c;
            if (cVar2 != null && cVar3 != null) {
                float[] fArr = cVar2.f26714a;
                int length = fArr.length;
                float[] fArr2 = cVar3.f26714a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f10 = Float.NaN;
                    int i12 = 0;
                    for (int i13 = 0; i13 < length2; i13++) {
                        float f11 = fArr3[i13];
                        if (f11 != f10) {
                            fArr3[i12] = f11;
                            i12++;
                            f10 = fArr3[i13];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i12);
                    aVar = new f9.a(cVar2.b(fArrCopyOfRange), cVar3.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i11, aVar);
        }
        return new y8.a(1, arrayListA);
    }

    public static y8.a y(d9.b bVar, r8.h hVar) {
        return new y8.a(2, c9.r.a(bVar, hVar, 1.0f, c9.f.f3402r, false));
    }

    public static y8.a z(d9.c cVar, r8.h hVar) {
        return new y8.a(3, c9.r.a(cVar, hVar, e9.j.c(), c9.f.f3404y, true));
    }

    public ac.c g(Context context, Looper looper, h9.r2 r2Var, Object obj, ac.g gVar, ac.h hVar) {
        return h(context, looper, r2Var, obj, (bc.n) gVar, (bc.n) hVar);
    }

    public ac.c h(Context context, Looper looper, h9.r2 r2Var, Object obj, bc.n nVar, bc.n nVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}

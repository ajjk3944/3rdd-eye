package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import c2.h0;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.Utf8;
import com.google.android.gms.internal.ads.vm1;
import com.google.android.gms.internal.consent_sdk.a0;
import com.google.android.gms.internal.measurement.b6;
import com.google.android.gms.internal.measurement.g5;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.i6;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.play_billing.m1;
import com.liuzh.deviceinfo.R;
import e4.d1;
import i0.q;
import i2.e0;
import i2.w1;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n1.s;
import nk.u;
import p2.t;
import t6.v;
import u0.a1;
import zj.w;
import zk.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class e implements d1 {
    public static ArrayList A(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateTypedArrayList;
    }

    public static final float B(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            f10 += fArr[i4] * fArr2[i4];
        }
        return f10;
    }

    public static void C(Parcel parcel, int i4) {
        if (parcel.dataPosition() != i4) {
            throw new qb.b(d.h.q(i4, "Overread allowed size end=", new StringBuilder(String.valueOf(i4).length() + 26)), parcel);
        }
    }

    public static final ViewParent D(View view) {
        nk.k.e(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final int E(int i4, int i10, int i11) {
        if (i11 > 0) {
            if (i4 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i4 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i10) {
                int i15 = -i11;
                int i16 = i4 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    public static boolean F(int i4) {
        return (i4 & 32768) != 0;
    }

    public static boolean G(int i4) {
        if (i4 == 15 || i4 == 255) {
            return true;
        }
        if (i4 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i4 != 32783) {
            return i4 == 33023 || i4 == 0;
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 < 28 || i10 > 29;
    }

    public static final void H(Context context) {
        Map mapI;
        nk.k.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        nk.k.d(databasePath, "getDatabasePath(...)");
        if (databasePath.exists()) {
            v.e().a(u6.n.f35165a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            nk.k.d(databasePath2, "getDatabasePath(...)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            nk.k.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
            String[] strArr = u6.n.f35166b;
            int iH = w.H(strArr.length);
            if (iH < 16) {
                iH = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            yj.i iVar = new yj.i(databasePath2, noBackupFilesDir);
            if (linkedHashMap.isEmpty()) {
                mapI = w.I(iVar);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                mapI = linkedHashMap2;
            }
            for (Map.Entry entry : mapI.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        v.e().h(u6.n.f35165a, "Over-writing contents of " + file2);
                    }
                    v.e().a(u6.n.f35165a, file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed");
                }
            }
        }
    }

    public static final void K(float[] fArr, float[] fArr2, int i4, float[] fArr3) {
        if (i4 == 0) {
            f2.a.a("At least one point must be provided");
        }
        int i10 = 2 >= i4 ? i4 - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i4];
        }
        for (int i13 = 0; i13 < i4; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11][];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i4];
        }
        float[][] fArr6 = new float[i11][];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        int i17 = 0;
        while (i17 < i11) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            nk.k.e(fArr8, "<this>");
            nk.k.e(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i4);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr9 = fArr5[i18];
                float fB = B(fArr7, fArr9);
                for (int i19 = 0; i19 < i4; i19++) {
                    fArr7[i19] = fArr7[i19] - (fArr9[i19] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(B(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f10 = 1.0f / fSqrt;
            for (int i20 = 0; i20 < i4; i20++) {
                fArr7[i20] = fArr7[i20] * f10;
            }
            float[] fArr10 = fArr6[i17];
            int i21 = 0;
            while (i21 < i11) {
                fArr10[i21] = i21 < i17 ? 0.0f : B(fArr7, fArr4[i21]);
                i21++;
            }
            i17++;
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float fB2 = B(fArr5[i22], fArr2);
            float[] fArr11 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    fB2 -= fArr11[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = fB2 / fArr11[i22];
        }
    }

    public static boolean L(Parcel parcel, int i4) {
        V(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder M(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iP);
        return strongBinder;
    }

    public static int N(Parcel parcel, int i4) {
        V(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long O(Parcel parcel, int i4) {
        V(parcel, i4, 8);
        return parcel.readLong();
    }

    public static int P(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    /* JADX WARN: Type inference failed for: r13v51, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object Q(s sVar, int i4, mk.c cVar) {
        int i10;
        int i11;
        Object objInvoke;
        i1.m mVarE;
        j0.p pVarT0;
        int iMax;
        int size;
        int i12;
        a0 a0Var;
        if (!sVar.f25554a.f25565n) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        i1.m mVar = sVar.f25554a.f25558e;
        e0 e0VarS = i2.k.s(sVar);
        loop0: while (true) {
            i10 = 0;
            i11 = 1;
            objInvoke = null;
            if (e0VarS == null) {
                mVarE = null;
                break;
            }
            if ((((i1.m) e0VarS.G.g).f25557d & Segment.SHARE_MINIMUM) != 0) {
                while (mVar != null) {
                    if ((mVar.f25556c & Segment.SHARE_MINIMUM) != 0) {
                        mVarE = mVar;
                        w0.e eVar = null;
                        while (mVarE != null) {
                            if (mVarE instanceof s) {
                                break loop0;
                            }
                            if ((mVarE.f25556c & Segment.SHARE_MINIMUM) != 0 && (mVarE instanceof i2.j)) {
                                int i13 = 0;
                                for (i1.m mVar2 = ((i2.j) mVarE).f25691p; mVar2 != null; mVar2 = mVar2.f25559f) {
                                    if ((mVar2.f25556c & Segment.SHARE_MINIMUM) != 0) {
                                        i13++;
                                        if (i13 == 1) {
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
                                if (i13 == 1) {
                                }
                            }
                            mVarE = i2.k.e(eVar);
                        }
                    }
                    mVar = mVar.f25558e;
                }
            }
            e0VarS = e0VarS.v();
            mVar = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
        }
        s sVar2 = (s) mVarE;
        if ((sVar2 != null && nk.k.a(sVar2.t0(), sVar.t0())) || (pVarT0 = sVar.t0()) == null) {
            return null;
        }
        int i14 = 5;
        if (i4 != 5) {
            i14 = 6;
            if (i4 != 6) {
                i14 = 3;
                if (i4 != 3) {
                    i14 = 4;
                    if (i4 != 4) {
                        if (i4 == 1) {
                            i14 = 2;
                        } else {
                            if (i4 != 2) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i14 = 1;
                        }
                    }
                }
            }
        }
        if (pVarT0.f26939o.f25414a.g().f25475n <= 0 || pVarT0.f26939o.f25414a.g().f25472k.isEmpty() || !pVarT0.f25565n) {
            return cVar.invoke(j0.p.f26938r);
        }
        if (pVarT0.q0(i14)) {
            i0.e eVar2 = pVarT0.f26939o;
            iMax = Math.min(eVar2.f25414a.g().f25475n - 1, ((q) zj.n.h0(eVar2.f25414a.g().f25472k)).f25479a);
        } else {
            iMax = Math.max(0, ((a1) pVarT0.f26939o.f25414a.f25512e.f2684b).g());
        }
        u uVar = new u();
        jf.c cVar2 = pVarT0.f26940p;
        cVar2.getClass();
        j0.k kVar = new j0.k(iMax, iMax);
        ((w0.e) cVar2.f27642b).b(kVar);
        uVar.f29986a = kVar;
        i0.u uVar2 = pVarT0.f26939o.f25414a;
        if (uVar2.g().f25472k.isEmpty()) {
            i11 = 0;
        } else {
            i0.p pVarG = uVar2.g();
            int iE = (int) (pVarG.f25476o == d0.a1.f21662a ? pVarG.e() & 4294967295L : pVarG.e() >> 32);
            i0.p pVarG2 = uVar2.g();
            ?? r72 = pVarG2.f25472k;
            if (r72.isEmpty()) {
                size = 0;
            } else {
                int size2 = r72.size();
                int i15 = 0;
                for (int i16 = 0; i16 < size2; i16++) {
                    i15 += ((q) r72.get(i16)).f25490n;
                }
                size = (i15 / r72.size()) + pVarG2.f25478q;
            }
            if (size != 0 && (i12 = iE / size) >= 1) {
                i11 = i12;
            }
        }
        int i17 = i11 * 2;
        int i18 = pVarT0.f26939o.f25414a.g().f25475n;
        if (i17 > i18) {
            i17 = i18;
        }
        while (objInvoke == null && pVarT0.p0((j0.k) uVar.f29986a, i14) && i10 < i17) {
            j0.k kVar2 = (j0.k) uVar.f29986a;
            int i19 = kVar2.f26920a;
            int i20 = kVar2.f26921b;
            if (pVarT0.q0(i14)) {
                i20++;
            } else {
                i19--;
            }
            jf.c cVar3 = pVarT0.f26940p;
            cVar3.getClass();
            j0.k kVar3 = new j0.k(i19, i20);
            ((w0.e) cVar3.f27642b).b(kVar3);
            ((w0.e) pVarT0.f26940p.f27642b).k((j0.k) uVar.f29986a);
            uVar.f29986a = kVar3;
            i10++;
            i2.k.s(pVarT0).l();
            objInvoke = cVar.invoke(new j0.o(pVarT0, uVar, i14));
        }
        ((w0.e) pVarT0.f26940p.f27642b).k((j0.k) uVar.f29986a);
        i2.k.s(pVarT0).l();
        return objInvoke;
    }

    public static final void R(f4.f fVar, p2.p pVar) {
        Object objG = pVar.k().f31095a.g(t.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        p2.p pVarL = pVar.l();
        if (pVarL == null) {
            return;
        }
        Object objG2 = pVarL.k().f31095a.g(t.f31118e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = pVarL.k().f31095a.g(t.f31119f);
            p2.c cVar = (p2.c) (objG3 != null ? objG3 : null);
            if (cVar == null || (cVar.f31040a >= 0 && cVar.f31041b >= 0)) {
                if (pVar.k().f31095a.c(t.F)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = p2.p.j(4, pVarL);
                    int size = listJ.size();
                    int i4 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        p2.p pVar2 = (p2.p) listJ.get(i10);
                        if (pVar2.k().f31095a.c(t.F)) {
                            arrayList.add(pVar2);
                            if (pVar2.f31103c.w() < pVar.f31103c.w()) {
                                i4++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zN = n(arrayList);
                    int i11 = zN ? 0 : i4;
                    int i12 = zN ? i4 : 0;
                    Object objG4 = pVar.k().f31095a.g(t.F);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    fVar.m(f4.e.a(i11, 1, i12, 1, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    public static void S(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + P(parcel, i4));
    }

    public static int T(Parcel parcel) {
        int i4 = parcel.readInt();
        int iP = P(parcel, i4);
        char c9 = (char) i4;
        int iDataPosition = parcel.dataPosition();
        if (c9 != 20293) {
            throw new qb.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i4))), parcel);
        }
        int i10 = iP + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new qb.b(je.u.q(iDataPosition, i10, "Size read is invalid start=", " end=", new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length())), parcel);
    }

    public static int U(byte[] bArr, int i4, vm1 vm1Var) {
        int i10 = i4 + 1;
        byte b10 = bArr[i4];
        if (b10 < 0) {
            return W(b10, bArr, i10, vm1Var);
        }
        vm1Var.f17656a = b10;
        return i10;
    }

    public static void V(Parcel parcel, int i4, int i10) {
        int iP = P(parcel, i4);
        if (iP == i10) {
            return;
        }
        String hexString = Integer.toHexString(iP);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iP).length() + 4 + 1);
        r5.c.q(i10, iP, "Expected size ", " got ", sb2);
        throw new qb.b(r5.c.m(sb2, " (0x", hexString, ")"), parcel);
    }

    public static int W(int i4, byte[] bArr, int i10, vm1 vm1Var) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i4 & 127;
        if (b10 >= 0) {
            vm1Var.f17656a = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            vm1Var.f17656a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            vm1Var.f17656a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            vm1Var.f17656a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                vm1Var.f17656a = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static void X(Parcel parcel, int i4, int i10) {
        if (i4 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i4);
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i4).length() + 4 + 1);
        r5.c.q(i10, i4, "Expected size ", " got ", sb2);
        throw new qb.b(r5.c.m(sb2, " (0x", hexString, ")"), parcel);
    }

    public static int Y(byte[] bArr, int i4, vm1 vm1Var) {
        long j = bArr[i4];
        int i10 = i4 + 1;
        if (j >= 0) {
            vm1Var.f17657b = j;
            return i10;
        }
        int i11 = i4 + 2;
        byte b10 = bArr[i10];
        long j8 = (j & 127) | ((b10 & 127) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j8 |= (r10 & 127) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        vm1Var.f17657b = j8;
        return i11;
    }

    public static int Z(int i4, byte[] bArr) {
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static long a0(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    public static int b0(byte[] bArr, int i4, vm1 vm1Var) throws p5 {
        int iU = U(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a;
        if (i10 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 == 0) {
            vm1Var.f17658c = "";
            return iU;
        }
        int i11 = t6.f19938a;
        int length = bArr.length;
        if ((((length - iU) - i10) | iU | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iU), Integer.valueOf(i10)));
        }
        int i12 = iU + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (iU < i12) {
            byte b10 = bArr[iU];
            if (b10 < 0) {
                break;
            }
            iU++;
            cArr[i13] = (char) b10;
            i13++;
        }
        while (iU < i12) {
            int i14 = iU + 1;
            byte b11 = bArr[iU];
            if (b11 >= 0) {
                cArr[i13] = (char) b11;
                i13++;
                iU = i14;
                while (iU < i12) {
                    byte b12 = bArr[iU];
                    if (b12 >= 0) {
                        iU++;
                        cArr[i13] = (char) b12;
                        i13++;
                    }
                }
            } else if (b11 < -32) {
                if (i14 >= i12) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                int i15 = i13 + 1;
                iU += 2;
                byte b13 = bArr[i14];
                if (b11 < -62 || m1.J(b13)) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                cArr[i13] = (char) ((b13 & Utf8.REPLACEMENT_BYTE) | ((b11 & 31) << 6));
                i13 = i15;
            } else {
                if (b11 < -16) {
                    if (i14 >= i12 - 1) {
                        throw new p5("Protocol message had invalid UTF-8.");
                    }
                    int i16 = i13 + 1;
                    int i17 = iU + 2;
                    byte b14 = bArr[i14];
                    iU += 3;
                    byte b15 = bArr[i17];
                    if (!m1.J(b14)) {
                        if (b11 == -32) {
                            if (b14 >= -96) {
                                b11 = -32;
                            }
                        }
                        if (b11 == -19) {
                            if (b14 < -96) {
                                b11 = -19;
                            }
                        }
                        if (!m1.J(b15)) {
                            cArr[i13] = (char) (((b14 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & 15) << 12) | (b15 & Utf8.REPLACEMENT_BYTE));
                            i13 = i16;
                        }
                    }
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                if (i14 >= i12 - 2) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                byte b16 = bArr[i14];
                int i18 = iU + 3;
                byte b17 = bArr[iU + 2];
                iU += 4;
                byte b18 = bArr[i18];
                if (m1.J(b16) || (((b16 + 112) + (b11 << 28)) >> 30) != 0 || m1.J(b17) || m1.J(b18)) {
                    throw new p5("Protocol message had invalid UTF-8.");
                }
                int i19 = ((b16 & Utf8.REPLACEMENT_BYTE) << 12) | ((b11 & 7) << 18) | ((b17 & Utf8.REPLACEMENT_BYTE) << 6) | (b18 & Utf8.REPLACEMENT_BYTE);
                cArr[i13] = (char) ((i19 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i13 + 1] = (char) ((i19 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                i13 += 2;
            }
        }
        vm1Var.f17658c = new String(cArr, 0, i13);
        return i12;
    }

    public static int c0(byte[] bArr, int i4, vm1 vm1Var) throws p5 {
        int iU = U(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a;
        if (i10 < 0) {
            throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iU) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            vm1Var.f17658c = x4.f20031c;
            return iU;
        }
        vm1Var.f17658c = x4.f(iU, i10, bArr);
        return iU + i10;
    }

    public static int d0(Object obj, i6 i6Var, byte[] bArr, int i4, int i10, vm1 vm1Var) throws p5 {
        int iW = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            iW = W(i11, bArr, iW, vm1Var);
            i11 = vm1Var.f17656a;
        }
        int i12 = iW;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i13;
        if (i13 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        i6Var.h(obj, bArr, i12, i14, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return i14;
    }

    public static int e0(Object obj, i6 i6Var, byte[] bArr, int i4, int i10, int i11, vm1 vm1Var) throws p5 {
        b6 b6Var = (b6) i6Var;
        int i12 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i12;
        if (i12 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = b6Var.t(obj, bArr, i4, i10, i11, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return iT;
    }

    public static zk.h f(int i4, int i10, zk.a aVar) {
        int i11 = i10 & 2;
        zk.a aVar2 = zk.a.f38322a;
        if (i11 != 0) {
            aVar = aVar2;
        }
        if (i4 == -2) {
            if (aVar != aVar2) {
                return new r(1, aVar);
            }
            zk.l.f38365b9.getClass();
            return new zk.h(zk.k.f38364b);
        }
        if (i4 != -1) {
            return i4 != 0 ? i4 != Integer.MAX_VALUE ? aVar == aVar2 ? new zk.h(i4) : new r(i4, aVar) : new zk.h(Integer.MAX_VALUE) : aVar == aVar2 ? new zk.h(0) : new r(1, aVar);
        }
        if (aVar == aVar2) {
            return new r(1, zk.a.f38323b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static int f0(int i4, byte[] bArr, int i10, int i11, m5 m5Var, vm1 vm1Var) {
        h5 h5Var = (h5) m5Var;
        int iU = U(bArr, i10, vm1Var);
        h5Var.f(vm1Var.f17656a);
        while (iU < i11) {
            int iU2 = U(bArr, iU, vm1Var);
            if (i4 != vm1Var.f17656a) {
                break;
            }
            iU = U(bArr, iU2, vm1Var);
            h5Var.f(vm1Var.f17656a);
        }
        return iU;
    }

    public static int g0(byte[] bArr, int i4, m5 m5Var, vm1 vm1Var) throws p5 {
        h5 h5Var = (h5) m5Var;
        int iU = U(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a + iU;
        while (iU < i10) {
            iU = U(bArr, iU, vm1Var);
            h5Var.f(vm1Var.f17656a);
        }
        if (iU == i10) {
            return iU;
        }
        throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static final o1.c h(long j, long j8) {
        return new o1.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public static int h0(i6 i6Var, int i4, byte[] bArr, int i10, int i11, m5 m5Var, vm1 vm1Var) throws p5 {
        g5 g5VarB = i6Var.b();
        i6 i6Var2 = i6Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        vm1 vm1Var2 = vm1Var;
        int iD0 = d0(g5VarB, i6Var2, bArr2, i10, i12, vm1Var2);
        i6Var2.g(g5VarB);
        vm1Var2.f17658c = g5VarB;
        m5Var.add(g5VarB);
        while (iD0 < i12) {
            vm1 vm1Var3 = vm1Var2;
            int i13 = i12;
            int iU = U(bArr2, iD0, vm1Var3);
            if (i4 != vm1Var3.f17656a) {
                break;
            }
            byte[] bArr3 = bArr2;
            i6 i6Var3 = i6Var2;
            g5 g5VarB2 = i6Var3.b();
            iD0 = d0(g5VarB2, i6Var3, bArr3, iU, i13, vm1Var3);
            i6Var2 = i6Var3;
            bArr2 = bArr3;
            i12 = i13;
            vm1Var2 = vm1Var3;
            i6Var2.g(g5VarB2);
            vm1Var2.f17658c = g5VarB2;
            m5Var.add(g5VarB2);
        }
        return iD0;
    }

    public static final o1.c i(long j, long j8) {
        int i4 = (int) (j >> 32);
        int i10 = (int) (j & 4294967295L);
        return new o1.c(Float.intBitsToFloat(i4), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i10));
    }

    public static int i0(int i4, byte[] bArr, int i10, int i11, m6 m6Var, vm1 vm1Var) throws p5 {
        if ((i4 >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            int iY = Y(bArr, i10, vm1Var);
            m6Var.d(i4, Long.valueOf(vm1Var.f17657b));
            return iY;
        }
        if (i12 == 1) {
            m6Var.d(i4, Long.valueOf(a0(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iU = U(bArr, i10, vm1Var);
            int i13 = vm1Var.f17656a;
            if (i13 < 0) {
                throw new p5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iU) {
                throw new p5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                m6Var.d(i4, x4.f20031c);
            } else {
                m6Var.d(i4, x4.f(iU, i13, bArr));
            }
            return iU + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new p5("Protocol message contained an invalid tag (zero).");
            }
            m6Var.d(i4, Integer.valueOf(Z(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i4 & (-8)) | 4;
        m6 m6VarA = m6.a();
        int i15 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i15;
        if (i15 >= 100) {
            throw new p5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iU2 = U(bArr, i10, vm1Var);
            int i17 = vm1Var.f17656a;
            if (i17 == i14) {
                i16 = i17;
                i10 = iU2;
                break;
            }
            i10 = i0(i17, bArr, iU2, i11, m6VarA, vm1Var);
            i16 = i17;
        }
        vm1Var.f17659d--;
        if (i10 > i11 || i16 != i14) {
            throw new p5("Failed to parse the message.");
        }
        m6Var.d(i4, m6VarA);
        return i10;
    }

    public static int j0(int i4, byte[] bArr, int i10, int i11, vm1 vm1Var) throws p5 {
        if ((i4 >>> 3) == 0) {
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            return Y(bArr, i10, vm1Var);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return U(bArr, i10, vm1Var) + vm1Var.f17656a;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw new p5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = (i4 & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = U(bArr, i10, vm1Var);
            i14 = vm1Var.f17656a;
            if (i14 == i13) {
                break;
            }
            i10 = j0(i14, bArr, i10, i11, vm1Var);
        }
        if (i10 > i11 || i14 != i13) {
            throw new p5("Failed to parse the message.");
        }
        return i10;
    }

    public static final void k(o7.d dVar, c2.p pVar, long j) {
        d2.b bVar = (d2.b) dVar.f30421b;
        bVar.getClass();
        d2.d dVar2 = (d2.d) bVar.f21940c;
        d2.d dVar3 = (d2.d) bVar.f21939b;
        boolean zA = h0.a(pVar);
        long j8 = pVar.f2659b;
        if (zA) {
            d2.a[] aVarArr = dVar3.f21947d;
            zj.m.U(0, aVarArr.length, null, aVarArr);
            dVar3.f21948e = 0;
            d2.a[] aVarArr2 = dVar2.f21947d;
            zj.m.U(0, aVarArr2.length, null, aVarArr2);
            dVar2.f21948e = 0;
            bVar.f21938a = 0L;
        }
        if (!h0.c(pVar)) {
            List list = pVar.f2666k;
            if (list == null) {
                list = zj.s.f38317a;
            }
            int i4 = 0;
            for (int size = list.size(); i4 < size; size = size) {
                c2.b bVar2 = (c2.b) list.get(i4);
                bVar.b(bVar2.f2585a, o1.b.h(bVar2.f2587c, j));
                i4++;
            }
            bVar.b(j8, o1.b.h(pVar.f2667l, j));
        }
        if (h0.c(pVar) && j8 - bVar.f21938a > 40) {
            d2.a[] aVarArr3 = dVar3.f21947d;
            zj.m.U(0, aVarArr3.length, null, aVarArr3);
            dVar3.f21948e = 0;
            d2.a[] aVarArr4 = dVar2.f21947d;
            zj.m.U(0, aVarArr4.length, null, aVarArr4);
            dVar2.f21948e = 0;
            bVar.f21938a = 0L;
        }
        bVar.f21938a = j8;
    }

    public static void l(StringBuilder sb2, Object obj, mk.c cVar) {
        if (cVar != null) {
            sb2.append((CharSequence) cVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }

    public static String m(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public static final boolean n(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = zj.s.f38317a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iR = cm.g.r(arrayList);
                int i4 = 0;
                while (i4 < iR) {
                    i4++;
                    Object obj2 = arrayList.get(i4);
                    p2.p pVar = (p2.p) obj2;
                    p2.p pVar2 = (p2.p) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() >> 32)) - Float.intBitsToFloat((int) (pVar.g().b() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (pVar2.g().b() & 4294967295L)) - Float.intBitsToFloat((int) (pVar.g().b() & 4294967295L)));
                    arrayList2.add(new o1.b((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((o1.b) zj.n.c0(list)).f30364a;
            } else {
                if (list.isEmpty()) {
                    f3.a.b("Empty collection can't be reduced.");
                }
                Object objC0 = zj.n.c0(list);
                int iR2 = cm.g.r(list);
                if (1 <= iR2) {
                    int i10 = 1;
                    while (true) {
                        objC0 = new o1.b(o1.b.h(((o1.b) objC0).f30364a, ((o1.b) list.get(i10)).f30364a));
                        if (i10 == iR2) {
                            break;
                        }
                        i10++;
                    }
                }
                j = ((o1.b) objC0).f30364a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final long o(long j, wk.c cVar, wk.c cVar2) {
        nk.k.e(cVar, "sourceUnit");
        nk.k.e(cVar2, "targetUnit");
        return cVar2.f36823a.convert(j, cVar.f36823a);
    }

    public static final long p(long j, wk.c cVar, wk.c cVar2) {
        nk.k.e(cVar, "sourceUnit");
        nk.k.e(cVar2, "targetUnit");
        return cVar2.f36823a.convert(j, cVar.f36823a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] q(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            jArr[i4] = iArr[i4];
        }
        return jArr;
    }

    public static Handler r(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a4.f.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static Bundle s(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iP);
        return bundle;
    }

    public static byte[] t(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iP);
        return bArrCreateByteArray;
    }

    public static ArrayList u(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = parcel.readInt();
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iP);
        return arrayList;
    }

    public static Parcelable v(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iP);
        return parcelable;
    }

    public static String w(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iP);
        return string;
    }

    public static String[] x(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iP);
        return strArrCreateStringArray;
    }

    public static ArrayList y(Parcel parcel, int i4) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iP);
        return arrayListCreateStringArrayList;
    }

    public static Object[] z(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iP = P(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iP == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iP);
        return objArrCreateTypedArray;
    }

    public abstract View I(int i4);

    public abstract boolean J();

    @Override // e4.d1
    public void a() {
    }

    @Override // e4.d1
    public void c() {
    }
}

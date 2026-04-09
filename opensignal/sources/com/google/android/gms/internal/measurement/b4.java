package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.UserManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.media3.common.Metadata;
import com.google.android.gms.internal.measurement.b4;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lq.b0;
import n0.w;

/* loaded from: classes.dex */
public abstract class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f4917a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f4918b = false;

    public static View A(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static bf.c B(String str, p5.b bVar) {
        bf.b bVarB = bf.c.b(ng.a.class);
        bVarB.f2700e = 1;
        bVarB.a(bf.l.b(Context.class));
        bVarB.f2701f = new kg.q(str, bVar, 2);
        return bVarB.b();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    public static final String C(rr.u uVar) {
        qs.g gVar;
        rr.d dVarD = or.h.z(uVar) ? D(uVar) : null;
        if (dVarD != null) {
            rr.d dVarK = xs.d.k(dVarD);
            if (dVarK instanceof rr.m0) {
                or.h.z(dVarK);
                rr.d dVarB = xs.d.b(xs.d.k(dVarK), as.f.f2213x);
                if (dVarB != null && (gVar = (qs.g) as.h.f2219a.get(xs.d.g(dVarB))) != null) {
                    return gVar.b();
                }
            } else if (dVarK instanceof ur.k0) {
                int i10 = as.e.f2210l;
                LinkedHashMap linkedHashMap = as.j0.f2232i;
                String strG = i3.g.g((ur.k0) dVarK);
                qs.g gVar2 = strG == null ? null : (qs.g) linkedHashMap.get(strG);
                if (gVar2 != null) {
                    return gVar2.b();
                }
            }
        }
        return null;
    }

    public static final rr.d D(rr.d dVar) {
        br.l.e(dVar, "<this>");
        if (!as.j0.j.contains(dVar.getName()) && !as.h.f2222d.contains(xs.d.k(dVar).getName())) {
            return null;
        }
        if (dVar instanceof rr.m0 ? true : dVar instanceof rr.l0) {
            return xs.d.b(dVar, as.f.B);
        }
        if (dVar instanceof ur.k0) {
            return xs.d.b(dVar, as.f.D);
        }
        return null;
    }

    public static final rr.d E(rr.d dVar) {
        br.l.e(dVar, "<this>");
        rr.d dVarD = D(dVar);
        if (dVarD != null) {
            return dVarD;
        }
        int i10 = as.g.f2216l;
        qs.g name = dVar.getName();
        br.l.d(name, "name");
        if (as.g.b(name)) {
            return xs.d.b(dVar, as.f.E);
        }
        return null;
    }

    public static final Bundle F(String str, Bundle bundle) {
        br.l.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(h0.b.o("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static final int G(WindowManager windowManager) {
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().width();
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static File H(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static String I(String str, String str2) {
        br.l.e(str, "tableName");
        br.l.e(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0148, code lost:
    
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014f, code lost:
    
        return !or.h.z(r13);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean J(rr.f r13, rr.d r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.J(rr.f, rr.d):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean K(ou.a0 r2, ou.c0 r3) {
        /*
            java.lang.String r0 = "request"
            br.l.e(r2, r0)
            int r0 = r3.f19887r
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L55
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L55
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L55
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L55
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L55
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L55
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L33
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L55
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L55
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L55
            switch(r0) {
                case 300: goto L55;
                case 301: goto L55;
                case 302: goto L33;
                default: goto L32;
            }
        L32:
            goto L67
        L33:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = ou.c0.f(r0, r3)
            if (r0 != 0) goto L55
            ou.h r0 = r3.b()
            int r0 = r0.f19912c
            r1 = -1
            if (r0 != r1) goto L55
            ou.h r0 = r3.b()
            boolean r0 = r0.f19915f
            if (r0 != 0) goto L55
            ou.h r0 = r3.b()
            boolean r0 = r0.f19914e
            if (r0 != 0) goto L55
            goto L67
        L55:
            ou.h r3 = r3.b()
            boolean r3 = r3.f19911b
            if (r3 != 0) goto L67
            ou.h r2 = r2.a()
            boolean r2 = r2.f19911b
            if (r2 != 0) goto L67
            r2 = 1
            return r2
        L67:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.K(ou.a0, ou.c0):boolean");
    }

    public static boolean L(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object M(ht.x r20, js.v r21, ar.o r22) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.M(ht.x, js.v, ar.o):java.lang.Object");
    }

    public static MappedByteBuffer N(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
            FileInputStream fileInputStreamK = xu.d.k(new FileInputStream(fileDescriptor), fileDescriptor);
            try {
                FileChannel channel = fileInputStreamK.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStreamK.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static ConcurrentHashMap O(Map map) {
        if (map == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static final void P(n0.v1 v1Var, n0.c cVar, int i10) {
        while (true) {
            int i11 = v1Var.f17352v;
            if (i10 > i11 && i10 < v1Var.f17351u) {
                return;
            }
            if (i11 == 0 && i10 == 0) {
                return;
            }
            v1Var.K();
            if (v1Var.x(v1Var.f17352v)) {
                cVar.k();
            }
            v1Var.j();
        }
    }

    public static boolean Q(Parcel parcel, int i10) {
        i0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte R(Parcel parcel, int i10) {
        i0(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static float S(Parcel parcel, int i10) {
        i0(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float T(Parcel parcel, int i10) {
        int iX = X(parcel, i10);
        if (iX == 0) {
            return null;
        }
        j0(parcel, iX, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static IBinder U(Parcel parcel, int i10) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iX);
        return strongBinder;
    }

    public static int V(Parcel parcel, int i10) {
        i0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long W(Parcel parcel, int i10) {
        i0(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int X(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static final boolean Y(u.a0 a0Var, Object obj, Object obj2) {
        Object objG = a0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof u.b0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            a0Var.j(obj);
            return true;
        }
        u.b0 b0Var = (u.b0) objG;
        boolean zK = b0Var.k(obj2);
        if (zK && b0Var.g()) {
            a0Var.j(obj);
        }
        return zK;
    }

    public static final void Z(u.a0 a0Var, Object obj) {
        boolean zG;
        long[] jArr = a0Var.f23037a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = a0Var.f23038b[i13];
                        Object obj3 = a0Var.f23039c[i13];
                        if (obj3 instanceof u.b0) {
                            u.b0 b0Var = (u.b0) obj3;
                            b0Var.k(obj);
                            zG = b0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            a0Var.k(i13);
                        }
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void a(final l1.a aVar, z0.m mVar, z0.e eVar, v1.f fVar, float f10, n0.p pVar, final int i10) {
        final z0.m mVar2;
        final v1.f fVar2;
        final float f11;
        pVar.T(1142754848);
        int i11 = (pVar.g(aVar) ? 4 : 2) | i10 | 1797504;
        if (pVar.K(i11 & 1, (599187 & i11) != 599186)) {
            eVar = z0.b.f26484x;
            pVar.S(1899393602);
            pVar.o(false);
            z0.j jVar = z0.j.f26494a;
            z0.m mVarA = androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.a(jVar, null, 520191), aVar, 1.0f, null, 2);
            Object objI = pVar.I();
            if (objI == n0.j.f17190a) {
                objI = y.o.f25610a;
                pVar.b0(objI);
            }
            v1.r rVar = (v1.r) objI;
            int iHashCode = Long.hashCode(pVar.S);
            z0.m mVarF = y3.F(pVar, mVarA);
            n0.f1 f1VarK = pVar.k();
            x1.g.f24833a.getClass();
            x1.y yVar = x1.f.f24793b;
            pVar.U();
            if (pVar.R) {
                pVar.j(yVar);
            } else {
                pVar.e0();
            }
            n0.w.k(x1.f.f24796e, rVar, pVar);
            n0.w.k(x1.f.f24795d, f1VarK, pVar);
            n0.w.k(x1.f.f24794c, mVarF, pVar);
            x1.e eVar2 = x1.f.f24797f;
            if (pVar.R || !br.l.a(pVar.I(), Integer.valueOf(iHashCode))) {
                w.g.m(iHashCode, pVar, iHashCode, eVar2);
            }
            pVar.o(true);
            fVar2 = v1.g.f23786a;
            mVar2 = jVar;
            f11 = 1.0f;
        } else {
            pVar.N();
            mVar2 = mVar;
            fVar2 = fVar;
            f11 = f10;
        }
        final z0.e eVar3 = eVar;
        n0.k1 k1VarQ = pVar.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new ar.n(mVar2, eVar3, fVar2, f11, i10) { // from class: y.n

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ z0.m f25606d;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ z0.e f25607g;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ v1.f f25608r;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f25609x;

                @Override // ar.n
                public final Object w(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = w.m(49);
                    b4.a(this.f25605a, this.f25606d, this.f25607g, this.f25608r, this.f25609x, (n0.p) obj, iM);
                    return b0.f15562a;
                }
            };
        }
    }

    public static final String a0(qs.g gVar) {
        br.l.e(gVar, "<this>");
        String strB = gVar.b();
        br.l.d(strB, "asString()");
        if (!ss.q.f22275a.contains(strB)) {
            for (int i10 = 0; i10 < strB.length(); i10++) {
                char cCharAt = strB.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            String strB2 = gVar.b();
            br.l.d(strB2, "asString()");
            return strB2;
        }
        StringBuilder sb2 = new StringBuilder();
        String strB3 = gVar.b();
        br.l.d(strB3, "asString()");
        sb2.append("`".concat(strB3));
        sb2.append('`');
        return sb2.toString();
    }

    public static final long b(int i10) {
        long j = (i10 << 32) | (0 & 4294967295L);
        int i11 = q1.a.f20670p;
        return j;
    }

    public static final String b0(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qs.g gVar = (qs.g) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(a0(gVar));
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void c(u.a0 a0Var, Object obj, Object obj2) {
        int iF = a0Var.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : a0Var.f23039c[iF];
        if (obj3 != null) {
            if (obj3 instanceof u.b0) {
                ((u.b0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                u.b0 b0Var = new u.b0();
                b0Var.a(obj3);
                b0Var.a(obj2);
                obj2 = b0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            a0Var.f23039c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        a0Var.f23038b[i10] = obj;
        a0Var.f23039c[i10] = obj2;
    }

    public static final String c0(String str, String str2, String str3, String str4, String str5) {
        br.l.e(str, "lowerRendered");
        br.l.e(str2, "lowerPrefix");
        br.l.e(str3, "upperRendered");
        br.l.e(str4, "upperPrefix");
        br.l.e(str5, "foldedPrefix");
        if (!tt.s.n0(str, str2, false) || !tt.s.n0(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        br.l.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        String strSubstring2 = str3.substring(str4.length());
        br.l.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!g0(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean d(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = mq.w.f16945a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iZ = e5.z(arrayList);
                int i10 = 0;
                while (i10 < iZ) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    e2.k kVar = (e2.k) obj2;
                    e2.k kVar2 = (e2.k) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (kVar2.g().a() >> 32)) - Float.intBitsToFloat((int) (kVar.g().a() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (kVar2.g().a() & 4294967295L)) - Float.intBitsToFloat((int) (kVar.g().a() & 4294967295L)));
                    arrayList2.add(new f1.b((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((f1.b) mq.o.r0(list)).f8402a;
            } else {
                if (list.isEmpty()) {
                    v2.a.b("Empty collection can't be reduced.");
                }
                Object objR0 = mq.o.r0(list);
                int iZ2 = e5.z(list);
                if (1 <= iZ2) {
                    int i11 = 1;
                    while (true) {
                        objR0 = new f1.b(f1.b.e(((f1.b) objR0).f8402a, ((f1.b) list.get(i11)).f8402a));
                        if (i11 == iZ2) {
                            break;
                        }
                        i11++;
                    }
                }
                j = ((f1.b) objR0).f8402a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void d0(e2.k kVar, v3.c cVar) {
        Object objG = kVar.k().f1191a.g(e2.p.f7739g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        e2.k kVarL = kVar.l();
        if (kVarL == null) {
            return;
        }
        Object objG2 = kVarL.k().f1191a.g(e2.p.f7737e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = kVarL.k().f1191a.g(e2.p.f7738f);
            if ((objG3 != null ? objG3 : null) != null) {
                throw new ClassCastException();
            }
            if (kVar.k().f1191a.c(e2.p.D)) {
                ArrayList arrayList = new ArrayList();
                List listJ = e2.k.j(4, kVarL);
                int size = listJ.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    e2.k kVar2 = (e2.k) listJ.get(i11);
                    if (kVar2.k().f1191a.c(e2.p.D)) {
                        arrayList.add(kVar2);
                        if (kVar2.f7716c.D() < kVar.f7716c.D()) {
                            i10++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zD = d(arrayList);
                int i12 = zD ? 0 : i10;
                int i13 = zD ? i10 : 0;
                Object objG4 = kVar.k().f1191a.g(e2.p.D);
                if (objG4 == null) {
                    objG4 = Boolean.FALSE;
                }
                cVar.k(g.a.a(((Boolean) objG4).booleanValue(), i12, 1, i13, 1));
            }
        }
    }

    public static void e(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(h0.b.l("startIndex: ", i10, i11, " > endIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("startIndex: " + i10 + ", endIndex: " + i11 + ", size: " + i12);
    }

    public static void e0(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + X(parcel, i10));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static fs.a f0(ht.y0 y0Var, boolean z10, es.i0 i0Var, int i10) {
        boolean z11 = (i10 & 1) != 0 ? false : z10;
        boolean z12 = (i10 & 2) == 0;
        if ((i10 & 4) != 0) {
            i0Var = null;
        }
        br.l.e(y0Var, "<this>");
        return new fs.a(y0Var, z12, z11, i0Var != null ? i3.g.H(i0Var) : null, 34);
    }

    public static void g(int i10) {
        if (2 > i10 || i10 >= 37) {
            StringBuilder sbU = h0.b.u("radix ", i10, " was not in valid range ");
            sbU.append(new hr.d(2, 36, 1));
            throw new IllegalArgumentException(sbU.toString());
        }
    }

    public static final boolean g0(String str, String str2) {
        br.l.e(str, "lower");
        br.l.e(str2, "upper");
        if (str.equals(tt.s.l0(str2, "?", ""))) {
            return true;
        }
        if (tt.s.f0(str2, "?", false) && br.l.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return br.l.a(sb2.toString(), str2);
    }

    public static void h(int i10, int i11, int i12) {
        if (i10 >= 0 && i11 <= i12) {
            if (i10 > i11) {
                throw new IllegalArgumentException(h0.b.l("fromIndex: ", i10, i11, " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
    }

    public static int h0(Parcel parcel) {
        int i10 = parcel.readInt();
        int iX = X(parcel, i10);
        char c4 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c4 != 20293) {
            throw new dc.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iX + iDataPosition;
        if (i11 >= iDataPosition && i11 <= parcel.dataSize()) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i11).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i11);
        throw new dc.a(sb2.toString(), parcel);
    }

    public static void i(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void i0(Parcel parcel, int i10, int i11) {
        int iX = X(parcel, i10);
        if (iX == i11) {
            return;
        }
        String hexString = Integer.toHexString(iX);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iX).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iX);
        throw new dc.a(h0.b.s(sb2, " (0x", hexString, ")"), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String j(rr.f r3, js.h r4) {
        /*
            java.lang.String r0 = "klass"
            br.l.e(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            br.l.e(r4, r0)
            rr.l r0 = r3.o()
            java.lang.String r1 = "klass.containingDeclaration"
            br.l.d(r0, r1)
            qs.g r1 = r3.getName()
            if (r1 == 0) goto L20
            qs.g r2 = qs.i.f21038a
            boolean r2 = r1.f21036d
            if (r2 != 0) goto L20
            goto L22
        L20:
            qs.g r1 = qs.i.f21040c
        L22:
            java.lang.String r1 = r1.c()
            boolean r2 = r0 instanceof rr.f0
            if (r2 == 0) goto L56
            rr.f0 r0 = (rr.f0) r0
            ur.c0 r0 = (ur.c0) r0
            qs.c r3 = r0.f23629y
            boolean r4 = r3.d()
            if (r4 == 0) goto L37
            return r1
        L37:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.b()
            r0 = 46
            r2 = 47
            java.lang.String r3 = tt.s.k0(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L56:
            boolean r2 = r0 instanceof rr.f
            if (r2 == 0) goto L5e
            r2 = r0
            rr.f r2 = (rr.f) r2
            goto L5f
        L5e:
            r2 = 0
        L5f:
            if (r2 == 0) goto L7a
            java.lang.String r3 = j(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L7a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected container: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.j(rr.f, js.h):java.lang.String");
    }

    public static void j0(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i10).length() + 4 + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(i10);
        throw new dc.a(h0.b.s(sb2, " (0x", hexString, ")"), parcel);
    }

    public static u.a0 k() {
        long[] jArr = u.g0.f23071a;
        return new u.a0();
    }

    public static final double l(double d6, ut.c cVar, ut.c cVar2) {
        br.l.e(cVar2, "targetUnit");
        long jConvert = cVar2.getTimeUnit$kotlin_stdlib().convert(1L, cVar.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d6 * jConvert : d6 / cVar.getTimeUnit$kotlin_stdlib().convert(1L, cVar2.getTimeUnit$kotlin_stdlib());
    }

    public static final long m(long j, ut.c cVar, ut.c cVar2) {
        br.l.e(cVar, "sourceUnit");
        br.l.e(cVar2, "targetUnit");
        return cVar2.getTimeUnit$kotlin_stdlib().convert(j, cVar.getTimeUnit$kotlin_stdlib());
    }

    public static final long n(long j, ut.c cVar, ut.c cVar2) {
        br.l.e(cVar, "sourceUnit");
        br.l.e(cVar2, "targetUnit");
        return cVar2.getTimeUnit$kotlin_stdlib().convert(j, cVar.getTimeUnit$kotlin_stdlib());
    }

    public static boolean o(File file, Resources resources, int i10) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i10);
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zP = p(file, inputStreamOpenRawResource);
            i(inputStreamOpenRawResource);
            return zP;
        } catch (Throwable th3) {
            th = th3;
            i(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static boolean p(File file, InputStream inputStream) throws IOException {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStreamJ = null;
        try {
            try {
                fileOutputStreamJ = xu.l.j(file, new FileOutputStream(file, false), false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        i(fileOutputStreamJ);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return true;
                    }
                    fileOutputStreamJ.write(bArr, 0, i10);
                }
            } catch (IOException e4) {
                io.sentry.android.core.e0.d("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e4.getMessage());
                i(fileOutputStreamJ);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return false;
            }
        } catch (Throwable th2) {
            i(fileOutputStreamJ);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th2;
        }
    }

    public static bf.c q(String str, String str2) {
        ng.a aVar = new ng.a(str, str2);
        bf.b bVarB = bf.c.b(ng.a.class);
        bVarB.f2700e = 1;
        bVarB.f2701f = new bf.a(0, aVar);
        return bVarB.b();
    }

    public static Bundle r(Parcel parcel, int i10) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iX);
        return bundle;
    }

    public static Parcelable s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iX);
        return parcelable;
    }

    public static String t(Parcel parcel, int i10) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iX);
        return string;
    }

    public static Object[] u(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return objArrCreateTypedArray;
    }

    public static ArrayList v(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateTypedArrayList;
    }

    public static void y(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new dc.a(c7.a.l(i10, "Overread allowed size end=", new StringBuilder(String.valueOf(i10).length() + 26)), parcel);
        }
    }

    public static final boolean z(char c4, char c10, boolean z10) {
        if (c4 == c10) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c10);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public Metadata w(a6.a aVar) {
        ByteBuffer byteBuffer = aVar.f3306r;
        byteBuffer.getClass();
        a5.a.e(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (aVar.g(Integer.MIN_VALUE)) {
            return null;
        }
        return x(aVar, byteBuffer);
    }

    public abstract Metadata x(a6.a aVar, ByteBuffer byteBuffer);
}

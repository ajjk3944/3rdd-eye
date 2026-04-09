package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class i41 implements of1 {
    public static boolean A = false;
    public static final /* synthetic */ int B = 0;
    public static UiModeManager C = null;
    public static h41 f = null;
    public static boolean g = false;
    public static gi4 t = null;
    public static mr2 u = null;
    public static final ju w;
    public static final ju[] x;
    public static boolean y = true;
    public static Field z;
    public static final gs3 h = new gs3("CLOSED", 3);
    public static final byte[] i = {112, 114, 111, 0};
    public static final byte[] j = {112, 114, 109, 0};
    public static final String[] k = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] l = {44100, 48000, 32000};
    public static final int[] m = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] n = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] o = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] p = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] q = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final rv1 r = new rv1(16);
    public static final zq2 s = new zq2(15);
    public static final Object v = new Object();

    static {
        ju juVar = new ju("additional_video_csi");
        w = juVar;
        x = new ju[]{juVar};
    }

    /* JADX WARN: Finally extract failed */
    public static boolean A(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, so[] soVarArr) throws IOException {
        long j2;
        int length;
        byte[] bArr2 = ob1.h;
        byte[] bArr3 = ob1.g;
        byte[] bArr4 = ob1.d;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                bd2.A(byteArrayOutputStream2, soVarArr.length);
                int i3 = 2;
                int i4 = 2;
                for (so soVar : soVarArr) {
                    bd2.z(byteArrayOutputStream2, soVar.c, 4);
                    bd2.z(byteArrayOutputStream2, soVar.d, 4);
                    bd2.z(byteArrayOutputStream2, soVar.g, 4);
                    String strG = g(bArr4, soVar.a, soVar.b);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strG.getBytes(charset).length;
                    bd2.A(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(strG.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
                }
                ab1 ab1Var = new ab1(1, false, byteArray);
                byteArrayOutputStream2.close();
                arrayList.add(ab1Var);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i5 = 0;
                int i6 = 0;
                while (i5 < soVarArr.length) {
                    try {
                        so soVar2 = soVarArr[i5];
                        bd2.A(byteArrayOutputStream3, i5);
                        bd2.A(byteArrayOutputStream3, soVar2.e);
                        i6 = i6 + 4 + (soVar2.e * i3);
                        int[] iArr = soVar2.h;
                        int length3 = iArr.length;
                        int i7 = i2;
                        int i8 = i3;
                        int i9 = i7;
                        while (i9 < length3) {
                            int i10 = iArr[i9];
                            bd2.A(byteArrayOutputStream3, i10 - i7);
                            i9++;
                            i7 = i10;
                        }
                        i5++;
                        i3 = i8;
                        i2 = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i6 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                ab1 ab1Var2 = new ab1(3, true, byteArray2);
                byteArrayOutputStream3.close();
                arrayList.add(ab1Var2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i11 = 0;
                int i12 = 0;
                while (i11 < soVarArr.length) {
                    try {
                        so soVar3 = soVarArr[i11];
                        Iterator it = soVar3.i.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            D(byteArrayOutputStream4, iIntValue, soVar3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                E(byteArrayOutputStream4, soVar3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                bd2.A(byteArrayOutputStream3, i11);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i13 = i12 + 6;
                                int i14 = i11;
                                bd2.z(byteArrayOutputStream3, length4, 4);
                                bd2.A(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i12 = i13 + length4;
                                i11 = i14 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i12 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                }
                ab1 ab1Var3 = new ab1(4, true, byteArray5);
                byteArrayOutputStream3.close();
                arrayList.add(ab1Var3);
                long j3 = 4;
                long size = j3 + j3 + 4 + (arrayList.size() * 16);
                bd2.z(byteArrayOutputStream, arrayList.size(), 4);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ab1 ab1Var4 = (ab1) arrayList.get(i15);
                    int i16 = ab1Var4.a;
                    byte[] bArr5 = ab1Var4.b;
                    if (i16 == 1) {
                        j2 = 0;
                    } else if (i16 == 2) {
                        j2 = 1;
                    } else if (i16 == 3) {
                        j2 = 2;
                    } else if (i16 == 4) {
                        j2 = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                    bd2.z(byteArrayOutputStream, j2, 4);
                    bd2.z(byteArrayOutputStream, size, 4);
                    if (ab1Var4.c) {
                        long length5 = bArr5.length;
                        byte[] bArrI = bd2.i(bArr5);
                        arrayList2.add(bArrI);
                        bd2.z(byteArrayOutputStream, bArrI.length, 4);
                        bd2.z(byteArrayOutputStream, length5, 4);
                        length = bArrI.length;
                    } else {
                        arrayList2.add(bArr5);
                        bd2.z(byteArrayOutputStream, bArr5.length, 4);
                        bd2.z(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = ob1.e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrC = c(soVarArr, bArr6);
                bd2.z(byteArrayOutputStream, soVarArr.length, 1);
                bd2.z(byteArrayOutputStream, bArrC.length, 4);
                byte[] bArrI2 = bd2.i(bArrC);
                bd2.z(byteArrayOutputStream, bArrI2.length, 4);
                byteArrayOutputStream.write(bArrI2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                bd2.z(byteArrayOutputStream, soVarArr.length, 1);
                for (so soVar4 : soVarArr) {
                    int size2 = soVar4.i.size() * 4;
                    String strG2 = g(bArr3, soVar4.a, soVar4.b);
                    Charset charset2 = StandardCharsets.UTF_8;
                    bd2.A(byteArrayOutputStream, strG2.getBytes(charset2).length);
                    bd2.A(byteArrayOutputStream, soVar4.h.length);
                    bd2.z(byteArrayOutputStream, size2, 4);
                    bd2.z(byteArrayOutputStream, soVar4.c, 4);
                    byteArrayOutputStream.write(strG2.getBytes(charset2));
                    Iterator it2 = soVar4.i.keySet().iterator();
                    while (it2.hasNext()) {
                        bd2.A(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        bd2.A(byteArrayOutputStream, 0);
                    }
                    for (int i18 : soVar4.h) {
                        bd2.A(byteArrayOutputStream, i18);
                    }
                }
            } else {
                byte[] bArr7 = ob1.f;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrC2 = c(soVarArr, bArr7);
                    bd2.z(byteArrayOutputStream, soVarArr.length, 1);
                    bd2.z(byteArrayOutputStream, bArrC2.length, 4);
                    byte[] bArrI3 = bd2.i(bArrC2);
                    bd2.z(byteArrayOutputStream, bArrI3.length, 4);
                    byteArrayOutputStream.write(bArrI3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                bd2.A(byteArrayOutputStream, soVarArr.length);
                for (so soVar5 : soVarArr) {
                    String str = soVar5.a;
                    TreeMap treeMap = soVar5.i;
                    String strG3 = g(bArr2, str, soVar5.b);
                    Charset charset3 = StandardCharsets.UTF_8;
                    bd2.A(byteArrayOutputStream, strG3.getBytes(charset3).length);
                    bd2.A(byteArrayOutputStream, treeMap.size());
                    bd2.A(byteArrayOutputStream, soVar5.h.length);
                    bd2.z(byteArrayOutputStream, soVar5.c, 4);
                    byteArrayOutputStream.write(strG3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        bd2.A(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i19 : soVar5.h) {
                        bd2.A(byteArrayOutputStream, i19);
                    }
                }
            }
        }
        return true;
    }

    public static void B(ByteArrayOutputStream byteArrayOutputStream, so soVar) throws IOException {
        E(byteArrayOutputStream, soVar);
        int i2 = soVar.g;
        int[] iArr = soVar.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            bd2.A(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : soVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void C(ByteArrayOutputStream byteArrayOutputStream, so soVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        bd2.A(byteArrayOutputStream, str.getBytes(charset).length);
        bd2.A(byteArrayOutputStream, soVar.e);
        bd2.z(byteArrayOutputStream, soVar.f, 4);
        bd2.z(byteArrayOutputStream, soVar.c, 4);
        bd2.z(byteArrayOutputStream, soVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void D(ByteArrayOutputStream byteArrayOutputStream, int i2, so soVar) throws IOException {
        int i3 = soVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : soVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void E(ByteArrayOutputStream byteArrayOutputStream, so soVar) {
        int i2 = 0;
        for (Map.Entry entry : soVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                bd2.A(byteArrayOutputStream, iIntValue - i2);
                bd2.A(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static byte F(long j2) {
        zt0.V((j2 >> 8) == 0, "out of range: %s", j2);
        return (byte) j2;
    }

    public static int G(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i2 & (-2097152)) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i5 - 1;
        int i8 = l[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? m[i7] : n[i7]) * 12) / i8) + i9) * 4;
        }
        int i10 = i3 == 3 ? i4 == 2 ? o[i7] : p[i7] : q[i7];
        if (i3 == 3) {
            return ((i10 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i10) / i8) + i9;
    }

    public static String H(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    string = "<" + str2 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i3] = string;
            i3++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (iIndexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, iIndexOf);
            sb.append(objArr[i2]);
            i2++;
            i4 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i2 < length2) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb.append(", ");
                sb.append(objArr[i5]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static ll3 I(ll3 ll3Var) {
        return ((ll3Var instanceof nl3) || (ll3Var instanceof ml3)) ? ll3Var : ll3Var instanceof Serializable ? new ml3(ll3Var) : new nl3(ll3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x003a A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:4:0x0003, B:6:0x0007, B:9:0x0013, B:11:0x0017, B:12:0x0019, B:16:0x001f, B:19:0x0029, B:20:0x002d, B:27:0x0036, B:32:0x0047, B:30:0x0039, B:31:0x003a, B:21:0x002e, B:22:0x0030, B:13:0x001a, B:14:0x001c), top: B:36:0x0003, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void J(android.content.Context r3, boolean r4) {
        /*
            java.lang.Object r0 = defpackage.i41.v
            monitor-enter(r0)
            mr2 r1 = defpackage.i41.u     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            mr2 r1 = new mr2     // Catch: java.lang.Throwable -> L11
            r2 = 19
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L11
            defpackage.i41.u = r1     // Catch: java.lang.Throwable -> L11
            goto L13
        L11:
            r3 = move-exception
            goto L49
        L13:
            gi4 r3 = defpackage.i41.t     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L3a
            java.lang.Object r1 = r3.a     // Catch: java.lang.Throwable -> L11
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.c     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L27
            gi4 r3 = defpackage.i41.t     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.c()     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L3a
        L27:
            if (r4 == 0) goto L47
            gi4 r3 = defpackage.i41.t     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r3.a     // Catch: java.lang.Throwable -> L11
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r3.c     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L47
            goto L3a
        L34:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r3     // Catch: java.lang.Throwable -> L11
        L37:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r3     // Catch: java.lang.Throwable -> L11
        L3a:
            mr2 r3 = defpackage.i41.u     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = "the appSetIdClient shouldn't be null"
            defpackage.ou1.k(r3, r4)     // Catch: java.lang.Throwable -> L11
            gi4 r3 = r3.h()     // Catch: java.lang.Throwable -> L11
            defpackage.i41.t = r3     // Catch: java.lang.Throwable -> L11
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.J(android.content.Context, boolean):void");
    }

    public static boolean K(kz2 kz2Var, rf1 rf1Var, int i2, pf1 pf1Var) {
        boolean z2;
        long jP = kz2Var.P();
        long j2 = jP >>> 16;
        if (j2 != i2) {
            return false;
        }
        boolean z3 = (j2 & 1) == 1;
        long j3 = jP >> 12;
        long j4 = jP >> 8;
        long j5 = jP >> 4;
        long j6 = jP >> 1;
        long j7 = jP & 1;
        int i3 = (int) (j5 & 15);
        if (i3 <= 7) {
            z2 = true;
            if (i3 != rf1Var.g - 1) {
                return false;
            }
        } else {
            z2 = true;
            if (i3 > 10 || rf1Var.g != 2) {
                return false;
            }
        }
        int i4 = (int) (j6 & 7);
        if (!(i4 == 0 || i4 == rf1Var.i) || j7 == 1) {
            return false;
        }
        try {
            long jO = kz2Var.o();
            if (!z3) {
                jO *= rf1Var.b;
            }
            long j8 = rf1Var.j;
            if (j8 != 0 && jO > j8) {
                return false;
            }
            pf1Var.a = jO;
            int iO = O((int) (j3 & 15), kz2Var);
            long j9 = rf1Var.j;
            boolean z4 = (j9 == 0 || jO + ((long) iO) >= j9) ? z2 : false;
            if (iO == -1) {
                return false;
            }
            if ((!z4 && iO < rf1Var.a) || iO > rf1Var.b) {
                return false;
            }
            int i5 = rf1Var.e;
            int i6 = (int) (j4 & 15);
            if (i6 != 0) {
                if (i6 <= 11) {
                    if (i6 != rf1Var.f) {
                        return false;
                    }
                } else if (i6 != 12) {
                    if (i6 > 14) {
                        return false;
                    }
                    int iL = kz2Var.L();
                    if (i6 == 14) {
                        iL *= 10;
                    }
                    if (iL != i5) {
                        return false;
                    }
                } else if (kz2Var.K() * 1000 != i5) {
                    return false;
                }
            }
            int iK = kz2Var.K();
            int i7 = kz2Var.b;
            byte[] bArr = kz2Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = kz2Var.b; i10 < i8; i10++) {
                i9 = v23.i[i9 ^ (bArr[i10] & 255)];
            }
            String str = v23.a;
            if (iK != i9) {
                return false;
            }
            if (kz2Var.B() != 0) {
                int I = kz2Var.I();
                if ((I & 128) != 0) {
                    return false;
                }
                int i11 = (I & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 57);
                    sb.append("Ignoring frame where first subframe has a reserved type: ");
                    sb.append(i11);
                    a30.u(sb.toString());
                    return false;
                }
            }
            return z2;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static byte[] L(byte[]... bArr) throws GeneralSecurityException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= bArr.length) {
                byte[] bArr2 = new byte[i3];
                int i4 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i4, length);
                    i4 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i2].length;
            if (i3 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i3 += length2;
            i2++;
        }
    }

    public static void M(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final byte[] N(int i2, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i2] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static int O(int i2, kz2 kz2Var) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return kz2Var.K() + 1;
            case 7:
                return kz2Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static void P(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static final void Q(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void R(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putInt("init_without_write", 0).putInt("crash_without_write", 0).commit();
    }

    public static int S(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        if (sharedPreferences == null) {
            return 0;
        }
        try {
            return sharedPreferences.getInt(str, 0);
        } catch (ClassCastException unused) {
            return 0;
        }
    }

    public static int b(int i2, int i3) {
        return hg.d(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static byte[] c(so[] soVarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (so soVar : soVarArr) {
            length += ((((soVar.g * 2) + 7) & (-8)) / 8) + (soVar.e * 2) + g(bArr, soVar.a, soVar.b).getBytes(StandardCharsets.UTF_8).length + 16 + soVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, ob1.f)) {
            int length2 = soVarArr.length;
            while (i2 < length2) {
                so soVar2 = soVarArr[i2];
                C(byteArrayOutputStream, soVar2, g(bArr, soVar2.a, soVar2.b));
                B(byteArrayOutputStream, soVar2);
                i2++;
            }
        } else {
            for (so soVar3 : soVarArr) {
                C(byteArrayOutputStream, soVar3, g(bArr, soVar3.a, soVar3.b));
            }
            int length3 = soVarArr.length;
            while (i2 < length3) {
                B(byteArrayOutputStream, soVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[PHI: r8
  0x00f5: PHI (r8v15 java.lang.String) = (r8v11 java.lang.String), (r8v14 java.lang.String) binds: [B:37:0x00f3, B:43:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.al0 e(java.net.InetAddress r7, defpackage.h80 r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.e(java.net.InetAddress, h80):al0");
    }

    public static final Object f(yt0 yt0Var, long j2, hy hyVar) {
        while (true) {
            if (yt0Var.c >= j2 && !yt0Var.c()) {
                return yt0Var;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nh.a;
            Object obj = atomicReferenceFieldUpdater.get(yt0Var);
            gs3 gs3Var = h;
            if (obj == gs3Var) {
                return gs3Var;
            }
            yt0 yt0Var2 = (yt0) ((nh) obj);
            if (yt0Var2 == null) {
                yt0Var2 = (yt0) hyVar.f(Long.valueOf(yt0Var.c + 1), yt0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(yt0Var, null, yt0Var2)) {
                    if (atomicReferenceFieldUpdater.get(yt0Var) != null) {
                        break;
                    }
                }
                if (yt0Var.c()) {
                    yt0Var.d();
                }
            }
            yt0Var = yt0Var2;
        }
    }

    public static String g(byte[] bArr, String str, String str2) {
        byte[] bArr2 = ob1.g;
        byte[] bArr3 = ob1.h;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return ex0.k(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int h(Context context, int i2, int i3) {
        Integer numValueOf;
        TypedValue typedValueN = qb1.n(context, i2);
        if (typedValueN != null) {
            int i4 = typedValueN.resourceId;
            numValueOf = Integer.valueOf(i4 != 0 ? kj.a(context, i4) : typedValueN.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i3;
    }

    public static int i(View view, int i2) {
        Context context = view.getContext();
        TypedValue typedValueP = qb1.p(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = typedValueP.resourceId;
        return i3 != 0 ? kj.a(context, i3) : typedValueP.data;
    }

    public static float j(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return er.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        r11 = r3.group(1);
        defpackage.i30.l(r11, "group(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
    
        r4 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String k(java.lang.String r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i41.k(java.lang.String):java.lang.String");
    }

    public static boolean m(int i2) {
        if (i2 == 0) {
            return false;
        }
        ThreadLocal threadLocal = hg.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i2);
        int iGreen = Color.green(i2);
        int iBlue = Color.blue(i2);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = iRed / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = iGreen / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = iBlue / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d4 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d4;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d4 / 100.0d > 0.5d;
    }

    public static int n(float f2, int i2, int i3) {
        return hg.b(hg.d(i3, Math.round(Color.alpha(i3) * f2)), i2);
    }

    public static void o(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static float p(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return er.c(edgeEffect, f2, f3);
        }
        dr.a(edgeEffect, f2, f3);
        return f2;
    }

    public static int[] q(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iS = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iS += (int) bd2.s(byteArrayInputStream, 2);
            iArr[i3] = iS;
        }
        return iArr;
    }

    public static so[] r(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, so[] soVarArr) throws IOException {
        byte[] bArr3 = ob1.i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, ob1.j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iS = (int) bd2.s(fileInputStream, 2);
            byte[] bArrR = bd2.r(fileInputStream, (int) bd2.s(fileInputStream, 4), (int) bd2.s(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrR);
            try {
                so[] soVarArrT = t(byteArrayInputStream, bArr2, iS, soVarArr);
                byteArrayInputStream.close();
                return soVarArrT;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(ob1.d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iS2 = (int) bd2.s(fileInputStream, 1);
        byte[] bArrR2 = bd2.r(fileInputStream, (int) bd2.s(fileInputStream, 4), (int) bd2.s(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrR2);
        try {
            so[] soVarArrS = s(byteArrayInputStream2, iS2, soVarArr);
            byteArrayInputStream2.close();
            return soVarArrS;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static so[] s(ByteArrayInputStream byteArrayInputStream, int i2, so[] soVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new so[0];
        }
        if (i2 != soVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iS = (int) bd2.s(byteArrayInputStream, 2);
            iArr[i3] = (int) bd2.s(byteArrayInputStream, 2);
            strArr[i3] = new String(bd2.q(byteArrayInputStream, iS), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            so soVar = soVarArr[i4];
            if (!soVar.b.equals(strArr[i4])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i5 = iArr[i4];
            soVar.e = i5;
            soVar.h = q(byteArrayInputStream, i5);
        }
        return soVarArr;
    }

    public static so[] t(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, so[] soVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new so[0];
        }
        if (i2 != soVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            bd2.s(byteArrayInputStream, 2);
            String str = new String(bd2.q(byteArrayInputStream, (int) bd2.s(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jS = bd2.s(byteArrayInputStream, 4);
            int iS = (int) bd2.s(byteArrayInputStream, 2);
            so soVar = null;
            if (soVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= soVarArr.length) {
                        break;
                    }
                    if (soVarArr[i4].b.equals(strSubstring)) {
                        soVar = soVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (soVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            soVar.d = jS;
            int[] iArrQ = q(byteArrayInputStream, iS);
            if (Arrays.equals(bArr, ob1.h)) {
                soVar.e = iS;
                soVar.h = iArrQ;
            }
        }
        return soVarArr;
    }

    public static so[] u(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, ob1.e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iS = (int) bd2.s(fileInputStream, 1);
        byte[] bArrR = bd2.r(fileInputStream, (int) bd2.s(fileInputStream, 4), (int) bd2.s(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrR);
        try {
            so[] soVarArrV = v(byteArrayInputStream, str, iS);
            byteArrayInputStream.close();
            return soVarArrV;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static so[] v(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new so[0];
        }
        so[] soVarArr = new so[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iS = (int) bd2.s(byteArrayInputStream, 2);
            int iS2 = (int) bd2.s(byteArrayInputStream, 2);
            soVarArr[i4] = new so(str, new String(bd2.q(byteArrayInputStream, iS), StandardCharsets.UTF_8), bd2.s(byteArrayInputStream, 4), iS2, (int) bd2.s(byteArrayInputStream, 4), (int) bd2.s(byteArrayInputStream, 4), new int[iS2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            so soVar = soVarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = soVar.f;
            int i7 = soVar.g;
            TreeMap treeMap = soVar.i;
            int i8 = iAvailable - i6;
            int iS3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iS3 += (int) bd2.s(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iS3), 1);
                int iS4 = (int) bd2.s(byteArrayInputStream, 2);
                while (iS4 > 0) {
                    bd2.s(byteArrayInputStream, 2);
                    int iS5 = (int) bd2.s(byteArrayInputStream, 1);
                    if (iS5 != 6 && iS5 != 7) {
                        while (iS5 > 0) {
                            bd2.s(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iS6 = (int) bd2.s(byteArrayInputStream, 1); iS6 > 0; iS6--) {
                                bd2.s(byteArrayInputStream, 2);
                            }
                            iS5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iS4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            soVar.h = q(byteArrayInputStream, soVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(bd2.q(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return soVarArr;
    }

    public static final Object w(Object obj) {
        return obj instanceof pg ? bd2.k(((pg) obj).a) : obj;
    }

    public static final void x(String str) {
        System.err.println("SLF4J: " + str);
    }

    public float l(View view) {
        if (y) {
            try {
                return h71.a(view);
            } catch (NoSuchMethodError unused) {
                y = false;
            }
        }
        return view.getAlpha();
    }

    public void y(View view, float f2) {
        if (y) {
            try {
                h71.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                y = false;
            }
        }
        view.setAlpha(f2);
    }

    public void z(View view, int i2) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!A) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                z = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            A = true;
        }
        Field field = z;
        if (field != null) {
            try {
                z.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}

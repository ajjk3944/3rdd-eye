package defpackage;

import android.graphics.Paint;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ou1 implements of1 {
    public static ClassLoader f = null;
    public static Thread g = null;
    public static Method j = null;
    public static boolean k = false;
    public static final /* synthetic */ int u = 0;
    public static int v = 2;
    public static final ra h = new ra();
    public static final Object i = new Object();
    public static final String[] l = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] m = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] n = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final rv1 o = new rv1(18);
    public static final zq2 p = new zq2(17);
    public static final p63 q = new p63(7);
    public static final nu3 r = new nu3(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final wt2 s = new wt2(new jr3(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 2), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 6, false);
    public static final byte[] t = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static void A(int i2, pi piVar, di diVar, pi piVar2) {
        float f2 = piVar2.e0;
        wh whVar = piVar2.J;
        int iE = whVar.e() + whVar.f.d();
        wh whVar2 = piVar2.L;
        int iD = whVar2.f.d() - whVar2.e();
        if (iD >= iE) {
            int iK = piVar2.k();
            if (piVar2.g0 != 8) {
                int i3 = piVar2.s;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (piVar instanceof qi ? piVar.k() : piVar.T.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(piVar2.x, iK);
                int i4 = piVar2.y;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            piVar2.K(i5, iK + i5);
            C(i2 + 1, diVar, piVar2);
        }
    }

    public static ActionMode.Callback B(ActionMode.Callback callback) {
        return callback instanceof k11 ? ((k11) callback).a : callback;
    }

    public static void C(int i2, di diVar, pi piVar) {
        boolean z;
        wh whVar;
        wh whVar2;
        wh whVar3;
        wh whVar4;
        if (piVar.n) {
            return;
        }
        if (!(piVar instanceof qi) && piVar.z() && e(piVar)) {
            qi.V(piVar, diVar, new ra());
        }
        wh whVarI = piVar.i(3);
        wh whVarI2 = piVar.i(5);
        int iD = whVarI.d();
        int iD2 = whVarI2.d();
        HashSet hashSet = whVarI.a;
        if (hashSet != null && whVarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                wh whVar5 = (wh) it.next();
                pi piVar2 = whVar5.d;
                int i3 = i2 + 1;
                boolean zE = e(piVar2);
                wh whVar6 = piVar2.J;
                wh whVar7 = piVar2.L;
                if (piVar2.z() && zE) {
                    qi.V(piVar2, diVar, new ra());
                }
                boolean z2 = (whVar5 == whVar6 && (whVar4 = whVar7.f) != null && whVar4.c) || (whVar5 == whVar7 && (whVar3 = whVar6.f) != null && whVar3.c);
                int i4 = piVar2.p0[1];
                if (i4 != 3 || zE) {
                    if (!piVar2.z()) {
                        if (whVar5 == whVar6 && whVar7.f == null) {
                            int iE = whVar6.e() + iD;
                            piVar2.K(iE, piVar2.k() + iE);
                            C(i3, diVar, piVar2);
                        } else if (whVar5 == whVar7 && whVar6.f == null) {
                            int iE2 = iD - whVar7.e();
                            piVar2.K(iE2 - piVar2.k(), iE2);
                            C(i3, diVar, piVar2);
                        } else if (z2 && !piVar2.y()) {
                            z(i3, diVar, piVar2);
                        }
                    }
                } else if (i4 == 3 && piVar2.y >= 0 && piVar2.x >= 0 && (piVar2.g0 == 8 || (piVar2.s == 0 && piVar2.W == 0.0f))) {
                    if (!piVar2.y() && !piVar2.F && z2 && !piVar2.y()) {
                        A(i3, piVar, diVar, piVar2);
                    }
                }
            }
        }
        boolean z3 = true;
        z3 = true;
        z3 = true;
        if (piVar instanceof b00) {
            return;
        }
        HashSet hashSet2 = whVarI2.a;
        if (hashSet2 != null && whVarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                wh whVar8 = (wh) it2.next();
                pi piVar3 = whVar8.d;
                int i5 = i2 + 1;
                boolean zE2 = e(piVar3);
                wh whVar9 = piVar3.J;
                wh whVar10 = piVar3.L;
                if (piVar3.z() && zE2) {
                    qi.V(piVar3, diVar, new ra());
                }
                boolean z4 = (whVar8 == whVar9 && (whVar2 = whVar10.f) != null && whVar2.c) || (whVar8 == whVar10 && (whVar = whVar9.f) != null && whVar.c);
                int i6 = piVar3.p0[1];
                if (i6 != 3 || zE2) {
                    if (!piVar3.z()) {
                        if (whVar8 == whVar9 && whVar10.f == null) {
                            int iE3 = whVar9.e() + iD2;
                            piVar3.K(iE3, piVar3.k() + iE3);
                            C(i5, diVar, piVar3);
                        } else if (whVar8 == whVar10 && whVar9.f == null) {
                            int iE4 = iD2 - whVar10.e();
                            piVar3.K(iE4 - piVar3.k(), iE4);
                            C(i5, diVar, piVar3);
                        } else if (z4 && !piVar3.y()) {
                            z(i5, diVar, piVar3);
                        }
                    }
                } else if (i6 == 3 && piVar3.y >= 0 && piVar3.x >= 0 && (piVar3.g0 == 8 || (piVar3.s == 0 && piVar3.W == 0.0f))) {
                    if (!piVar3.y() && !piVar3.F && z4 && !piVar3.y()) {
                        A(i5, piVar, diVar, piVar3);
                    }
                }
            }
        }
        wh whVarI3 = piVar.i(6);
        if (whVarI3.a != null && whVarI3.c) {
            int iD3 = whVarI3.d();
            Iterator it3 = whVarI3.a.iterator();
            while (it3.hasNext()) {
                wh whVar11 = (wh) it3.next();
                pi piVar4 = whVar11.d;
                int i7 = i2 + 1;
                boolean zE3 = e(piVar4);
                wh whVar12 = piVar4.M;
                if (piVar4.z() && zE3) {
                    qi.V(piVar4, diVar, new ra());
                }
                if (piVar4.p0[z3 ? 1 : 0] != 3 || zE3) {
                    if (!piVar4.z()) {
                        if (whVar11 == whVar12) {
                            int iE5 = whVar11.e() + iD3;
                            if (piVar4.E) {
                                int i8 = iE5 - piVar4.a0;
                                int i9 = piVar4.V + i8;
                                piVar4.Z = i8;
                                piVar4.J.l(i8);
                                piVar4.L.l(i9);
                                whVar12.l(iE5);
                                z = z3 ? 1 : 0;
                                piVar4.l = z;
                            } else {
                                z = z3 ? 1 : 0;
                            }
                            C(i7, diVar, piVar4);
                        }
                        z3 = z;
                    }
                }
                z = z3 ? 1 : 0;
                z3 = z;
            }
        }
        piVar.n = z3;
    }

    public static ActionMode.Callback D(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof k11) || callback == null) ? callback : new k11(callback, textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0093 A[Catch: all -> 0x008f, PHI: r1
  0x0093: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:47:0x008c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x008a, B:61:0x00a2, B:12:0x001f, B:52:0x0092, B:53:0x0093, B:64:0x00a6, B:65:0x00a7, B:54:0x0094, B:60:0x00a1, B:59:0x009e, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:43:0x0085, B:44:0x0088, B:18:0x003c), top: B:80:0x0003, inners: #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader E() {
        /*
            java.lang.Class<ou1> r0 = defpackage.ou1.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = defpackage.ou1.f     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto La7
            java.lang.Thread r1 = defpackage.ou1.g     // Catch: java.lang.Throwable -> L8f
            r2 = 0
            if (r1 != 0) goto L93
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L8f
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L1d
            r1 = r2
            goto L8a
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8f
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r6 = 0
            r7 = r6
        L2b:
            if (r7 >= r4) goto L43
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r9 == 0) goto L3c
            goto L44
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto L91
        L41:
            r1 = move-exception
            goto L83
        L43:
            r8 = r2
        L44:
            if (r8 != 0) goto L4d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L4d:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L56:
            if (r6 >= r1) goto L6a
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r7 == 0) goto L67
            goto L6b
        L67:
            int r6 = r6 + 1
            goto L56
        L6a:
            r5 = r2
        L6b:
            if (r5 != 0) goto L88
            bd1 r1 = new bd1     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L81
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r5 = r1
            goto L88
        L7c:
            r4 = move-exception
            r5 = r1
            goto L85
        L7f:
            r4 = r1
            goto L85
        L81:
            r1 = move-exception
            goto L7f
        L83:
            r4 = r1
            r5 = r2
        L85:
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
        L88:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        L8a:
            defpackage.ou1.g = r1     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L93
            goto La2
        L8f:
            r1 = move-exception
            goto Lab
        L91:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L8f
        L93:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Thread r3 = defpackage.ou1.g     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L9b java.lang.SecurityException -> L9d
            goto La1
        L9b:
            r2 = move-exception
            goto La5
        L9d:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L9b
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
        La2:
            defpackage.ou1.f = r2     // Catch: java.lang.Throwable -> L8f
            goto La7
        La5:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9b
            throw r2     // Catch: java.lang.Throwable -> L8f
        La7:
            java.lang.ClassLoader r1 = defpackage.ou1.f     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r0)
            return r1
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou1.E():java.lang.ClassLoader");
    }

    public static Object F(int i2) {
        if (i2 < 2 || i2 > 1073741824 || Integer.highestOneBit(i2) != i2) {
            throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 41), "must be power of 2 between 2^1 and 2^30: ", i2));
        }
        return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
    }

    public static Object G(ll3 ll3Var) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return ll3Var.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static ArrayList H(byte[] bArr) {
        long j2 = ((bArr[11] & 255) << 8) | (bArr[10] & 255);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((j2 * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean J(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !J((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!a30.c(Array.get(obj, i2), Array.get(obj2, i2))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static byte[] K(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 + i2;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i2] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static byte[] L(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 + i3;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            bArr2[i4 + 1] = (byte) ((bArr[i3] & 255) >> 4);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b = (byte) (bArr2[i5] + i6);
            bArr2[i5] = b;
            int i7 = (b + 8) >> 4;
            bArr2[i5] = (byte) (b - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr2[63] = (byte) (bArr2[63] + i6);
        wt2 wt2Var = new wt2(6);
        mr2 mr2Var = new mr2(13);
        for (i2 = 1; i2 < 64; i2 += 2) {
            nu3 nu3Var = new nu3();
            b0(nu3Var, i2 / 2, bArr2[i2]);
            mr2.x(mr2Var, wt2Var);
            W(wt2Var, mr2Var, nu3Var);
        }
        jr3 jr3Var = new jr3(2);
        jr3.d(wt2Var, jr3Var);
        Z(wt2Var, jr3Var);
        jr3.d(wt2Var, jr3Var);
        Z(wt2Var, jr3Var);
        jr3.d(wt2Var, jr3Var);
        Z(wt2Var, jr3Var);
        jr3.d(wt2Var, jr3Var);
        Z(wt2Var, jr3Var);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            nu3 nu3Var2 = new nu3();
            b0(nu3Var2, i8 / 2, bArr2[i8]);
            mr2.x(mr2Var, wt2Var);
            W(wt2Var, mr2Var, nu3Var2);
        }
        jr3 jr3Var2 = new jr3(wt2Var);
        long[] jArr = new long[10];
        pu1.I(jArr, (long[]) jr3Var2.g);
        long[] jArr2 = new long[10];
        pu1.I(jArr2, (long[]) jr3Var2.h);
        long[] jArr3 = new long[10];
        pu1.I(jArr3, (long[]) jr3Var2.i);
        long[] jArr4 = new long[10];
        pu1.I(jArr4, jArr3);
        long[] jArr5 = new long[10];
        pu1.y(jArr5, jArr2, jArr);
        pu1.G(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        pu1.G(jArr6, jArr, jArr2);
        pu1.G(jArr6, jArr6, pu3.a);
        pu1.u(jArr6, jArr6, jArr4);
        pu1.C(jArr6, jArr6);
        if (MessageDigest.isEqual(pu1.M(jArr5), pu1.M(jArr6))) {
            return jr3Var2.h();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static int M(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    public static byte[] O(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) m34.e.a.l("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        return bArrDigest;
    }

    public static sn3 P(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i2 = 0;
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (yb.B(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strC = yb.C(xmlPullParser, strConcat2);
                String strC2 = yb.C(xmlPullParser, strConcat3);
                String strC3 = yb.C(xmlPullParser, strConcat4);
                String strC4 = yb.C(xmlPullParser, strConcat5);
                if (strC == null || strC2 == null) {
                    return sn3.j;
                }
                hh1 hh1Var = new hh1(strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L, strC);
                int length = objArrCopyOf.length;
                int i3 = i2 + 1;
                int iD = rm3.d(length, i3);
                if (iD > length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
                }
                objArrCopyOf[i2] = hh1Var;
                i2 = i3;
            }
        } while (!yb.y(xmlPullParser, str.concat(":Directory")));
        return xm3.o(objArrCopyOf, i2);
    }

    public static void Q(int i2, Object obj, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    public static int R(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iX = g82.x(obj);
        int i5 = iX & i2;
        int iM = M(i5, obj3);
        if (iM != 0) {
            int i6 = ~i2;
            int i7 = iX & i6;
            int i8 = -1;
            while (true) {
                i3 = iM - 1;
                int i9 = iArr[i3];
                i4 = i9 & i2;
                if ((i9 & i6) != i7 || !Objects.equals(obj, objArr[i3]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i3]))) {
                    if (i4 == 0) {
                        break;
                    }
                    i8 = i3;
                    iM = i4;
                } else {
                    break;
                }
            }
            if (i8 == -1) {
                Q(i5, obj3, i4);
                return i3;
            }
            iArr[i8] = (iArr[i8] & i6) | (i4 & i2);
            return i3;
        }
        return -1;
    }

    public static void S() throws lq2 {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new lq2(sb.toString());
        }
    }

    public static /* synthetic */ boolean T(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        pu1.E(jArr2);
        byte[] bArrM = pu1.M(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrM[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    public static void U(String str, boolean z) throws lq2 {
        if (!z) {
            throw new lq2(str);
        }
    }

    public static long V(byte b, byte b2) {
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i2 = 2;
            if (i4 != 1 && i4 != 2) {
                i2 = b2 & 63;
            }
        } else {
            i2 = 1;
        }
        int i5 = i3 >> 3;
        return i2 * (i5 >= 16 ? 2500 << r6 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static void W(wt2 wt2Var, mr2 mr2Var, nu3 nu3Var) {
        jr3 jr3Var = (jr3) mr2Var.g;
        jr3 jr3Var2 = (jr3) wt2Var.g;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) jr3Var2.g;
        long[] jArr3 = (long[]) jr3Var.h;
        long[] jArr4 = (long[]) jr3Var.g;
        pu1.u(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) jr3Var2.h;
        pu1.y(jArr5, jArr3, jArr4);
        pu1.G(jArr5, jArr5, nu3Var.b);
        long[] jArr6 = nu3Var.a;
        long[] jArr7 = (long[]) jr3Var2.i;
        pu1.G(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) wt2Var.h;
        pu1.G(jArr8, (long[]) mr2Var.h, nu3Var.c);
        nu3Var.a(jArr2, (long[]) jr3Var.i);
        pu1.u(jArr, jArr2, jArr2);
        pu1.y(jArr2, jArr7, jArr5);
        pu1.u(jArr5, jArr7, jArr5);
        pu1.u(jArr7, jArr, jArr8);
        pu1.y(jArr8, jArr, jArr8);
    }

    public static boolean X(String str) throws lq2 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        U("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        U("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        S();
        String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void Y(wt2 wt2Var, mr2 mr2Var, nu3 nu3Var) {
        jr3 jr3Var = (jr3) mr2Var.g;
        jr3 jr3Var2 = (jr3) wt2Var.g;
        long[] jArr = new long[10];
        long[] jArr2 = (long[]) jr3Var2.g;
        long[] jArr3 = (long[]) jr3Var.h;
        long[] jArr4 = (long[]) jr3Var.g;
        pu1.u(jArr2, jArr3, jArr4);
        long[] jArr5 = (long[]) jr3Var2.h;
        pu1.y(jArr5, jArr3, jArr4);
        pu1.G(jArr5, jArr5, nu3Var.a);
        long[] jArr6 = nu3Var.b;
        long[] jArr7 = (long[]) jr3Var2.i;
        pu1.G(jArr7, jArr2, jArr6);
        long[] jArr8 = (long[]) wt2Var.h;
        pu1.G(jArr8, (long[]) mr2Var.h, nu3Var.c);
        nu3Var.a(jArr2, (long[]) jr3Var.i);
        pu1.u(jArr, jArr2, jArr2);
        pu1.y(jArr2, jArr7, jArr5);
        pu1.u(jArr5, jArr7, jArr5);
        pu1.y(jArr7, jArr, jArr8);
        pu1.u(jArr8, jArr, jArr8);
    }

    public static void Z(wt2 wt2Var, jr3 jr3Var) {
        jr3 jr3Var2 = (jr3) wt2Var.g;
        long[] jArr = (long[]) jr3Var2.g;
        long[] jArr2 = (long[]) jr3Var.g;
        long[] jArr3 = new long[10];
        pu1.I(jArr, jArr2);
        long[] jArr4 = (long[]) jr3Var2.i;
        long[] jArr5 = (long[]) jr3Var.h;
        pu1.I(jArr4, jArr5);
        long[] jArr6 = (long[]) wt2Var.h;
        pu1.I(jArr6, (long[]) jr3Var.i);
        pu1.u(jArr6, jArr6, jArr6);
        long[] jArr7 = (long[]) jr3Var2.h;
        pu1.u(jArr7, jArr2, jArr5);
        pu1.I(jArr3, jArr7);
        pu1.u(jArr7, jArr4, jArr);
        pu1.y(jArr4, jArr4, jArr);
        pu1.y(jArr, jArr3, jArr7);
        pu1.y(jArr6, jArr6, jArr4);
    }

    public static int a0(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return (i6 & (i6 + i6)) >> 7;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void b0(nu3 nu3Var, int i2, byte b) {
        nu3[][] nu3VarArr = pu3.d;
        int i3 = (b & 255) >> 7;
        int i4 = (-i3) & b;
        int i5 = b - (i4 + i4);
        nu3Var.b(nu3VarArr[i2][0], a0(i5, 1));
        nu3Var.b(nu3VarArr[i2][1], a0(i5, 2));
        nu3Var.b(nu3VarArr[i2][2], a0(i5, 3));
        nu3Var.b(nu3VarArr[i2][3], a0(i5, 4));
        nu3Var.b(nu3VarArr[i2][4], a0(i5, 5));
        nu3Var.b(nu3VarArr[i2][5], a0(i5, 6));
        nu3Var.b(nu3VarArr[i2][6], a0(i5, 7));
        nu3Var.b(nu3VarArr[i2][7], a0(i5, 8));
        long[] jArr = nu3Var.c;
        long[] jArr2 = nu3Var.a;
        long[] jArr3 = nu3Var.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr3, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i6 = 0; i6 < jArrCopyOf3.length; i6++) {
            jArrCopyOf3[i6] = -jArrCopyOf3[i6];
        }
        i30.c0(jArr2, jArrCopyOf, i3);
        i30.c0(jArr3, jArrCopyOf2, i3);
        i30.c0(jArr, jArrCopyOf3, i3);
    }

    public static final void c(u8 u8Var, int i2) {
        u8Var.f = new int[i2];
        u8Var.g = new Object[i2];
    }

    public static byte[] c0(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & 255) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr2[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b = bArr2[i2];
                    if (b != 0) {
                        byte b2 = bArr2[i4];
                        int i6 = b << i5;
                        int i7 = b2 + i6;
                        if (i7 <= 15) {
                            bArr2[i4] = (byte) i7;
                            bArr2[i2] = 0;
                        } else {
                            int i8 = b2 - i6;
                            if (i8 >= -15) {
                                bArr2[i4] = (byte) i8;
                                while (true) {
                                    if (i2 >= 256) {
                                        break;
                                    }
                                    if (bArr2[i2] == 0) {
                                        bArr2[i2] = 1;
                                        break;
                                    }
                                    bArr2[i2] = 0;
                                    i2++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static long d0(int i2, byte[] bArr) {
        return ((bArr[i2 + 2] & 255) << 16) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8);
    }

    public static boolean e(pi piVar) {
        int[] iArr = piVar.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        pi piVar2 = piVar.T;
        qi qiVar = piVar2 != null ? (qi) piVar2 : null;
        if (qiVar != null) {
            int i4 = qiVar.p0[0];
        }
        if (qiVar != null) {
            int i5 = qiVar.p0[1];
        }
        boolean z = i2 == 1 || piVar.A() || i2 == 2 || (i2 == 3 && piVar.r == 0 && piVar.W == 0.0f && piVar.t(0)) || (i2 == 3 && piVar.r == 1 && piVar.u(0, piVar.q()));
        boolean z2 = i3 == 1 || piVar.B() || i3 == 2 || (i3 == 3 && piVar.s == 0 && piVar.W == 0.0f && piVar.t(1)) || (i3 == 3 && piVar.s == 1 && piVar.u(1, piVar.k()));
        return (piVar.W > 0.0f && (z || z2)) || (z && z2);
    }

    public static long e0(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | d0(i2, bArr);
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void i(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static ou1 l(int i2) {
        return i2 != 0 ? i2 != 1 ? new wq0() : new ul() : new wq0();
    }

    public static InvocationHandler m() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static rl0 o(s7 s7Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new rl0(i11.c(s7Var));
        }
        TextPaint textPaint = new TextPaint(s7Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = g11.a(s7Var);
        int iD = g11.d(s7Var);
        if (s7Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i2 < 28 || (s7Var.getInputType() & 15) != 3) {
                boolean z = s7Var.getLayoutDirection() == 1;
                switch (s7Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(i11.b(h11.a(s7Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new rl0(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static void p(int i2, di diVar, pi piVar, boolean z) {
        wh whVar;
        wh whVar2;
        boolean z2;
        wh whVar3;
        wh whVar4;
        if (piVar.m) {
            return;
        }
        if (!(piVar instanceof qi) && piVar.z() && e(piVar)) {
            qi.V(piVar, diVar, new ra());
        }
        wh whVarI = piVar.i(2);
        wh whVarI2 = piVar.i(4);
        int iD = whVarI.d();
        int iD2 = whVarI2.d();
        HashSet hashSet = whVarI.a;
        if (hashSet != null && whVarI.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                wh whVar5 = (wh) it.next();
                pi piVar2 = whVar5.d;
                int i3 = i2 + 1;
                boolean zE = e(piVar2);
                wh whVar6 = piVar2.I;
                wh whVar7 = piVar2.K;
                if (piVar2.z() && zE) {
                    z2 = true;
                    qi.V(piVar2, diVar, new ra());
                } else {
                    z2 = true;
                }
                boolean z3 = ((whVar5 == whVar6 && (whVar4 = whVar7.f) != null && whVar4.c) || (whVar5 == whVar7 && (whVar3 = whVar6.f) != null && whVar3.c)) ? z2 : false;
                int i4 = piVar2.p0[0];
                if (i4 != 3 || zE) {
                    if (!piVar2.z()) {
                        if (whVar5 == whVar6 && whVar7.f == null) {
                            int iE = whVar6.e() + iD;
                            piVar2.J(iE, piVar2.q() + iE);
                            p(i3, diVar, piVar2, z);
                        } else if (whVar5 == whVar7 && whVar6.f == null) {
                            int iE2 = iD - whVar7.e();
                            piVar2.J(iE2 - piVar2.q(), iE2);
                            p(i3, diVar, piVar2, z);
                        } else if (z3 && !piVar2.x()) {
                            x(i3, diVar, piVar2, z);
                        }
                    }
                } else if (i4 == 3 && piVar2.v >= 0 && piVar2.u >= 0 && (piVar2.g0 == 8 || (piVar2.r == 0 && piVar2.W == 0.0f))) {
                    if (!piVar2.x() && !piVar2.F && z3 && !piVar2.x()) {
                        y(i3, piVar, diVar, piVar2, z);
                    }
                }
            }
        }
        if (piVar instanceof b00) {
            return;
        }
        HashSet hashSet2 = whVarI2.a;
        if (hashSet2 != null && whVarI2.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                wh whVar8 = (wh) it2.next();
                pi piVar3 = whVar8.d;
                int i5 = i2 + 1;
                boolean zE2 = e(piVar3);
                wh whVar9 = piVar3.I;
                wh whVar10 = piVar3.K;
                if (piVar3.z() && zE2) {
                    qi.V(piVar3, diVar, new ra());
                }
                boolean z4 = (whVar8 == whVar9 && (whVar2 = whVar10.f) != null && whVar2.c) || (whVar8 == whVar10 && (whVar = whVar9.f) != null && whVar.c);
                int i6 = piVar3.p0[0];
                if (i6 != 3 || zE2) {
                    if (!piVar3.z()) {
                        if (whVar8 == whVar9 && whVar10.f == null) {
                            int iE3 = whVar9.e() + iD2;
                            piVar3.J(iE3, piVar3.q() + iE3);
                            p(i5, diVar, piVar3, z);
                        } else if (whVar8 == whVar10 && whVar9.f == null) {
                            int iE4 = iD2 - whVar10.e();
                            piVar3.J(iE4 - piVar3.q(), iE4);
                            p(i5, diVar, piVar3, z);
                        } else if (z4 && !piVar3.x()) {
                            x(i5, diVar, piVar3, z);
                        }
                    }
                } else if (i6 == 3 && piVar3.v >= 0 && piVar3.u >= 0) {
                    if (piVar3.g0 == 8 || (piVar3.r == 0 && piVar3.W == 0.0f)) {
                        if (!piVar3.x() && !piVar3.F && z4 && !piVar3.x()) {
                            y(i5, piVar, diVar, piVar3, z);
                        }
                    }
                }
            }
        }
        piVar.m = true;
    }

    public static final int q(u8 u8Var, Object obj, int i2) {
        int i3 = u8Var.h;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iA = ob1.a(i3, i2, u8Var.f);
            if (iA < 0 || i30.c(obj, u8Var.g[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && u8Var.f[i4] == i2) {
                if (i30.c(obj, u8Var.g[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && u8Var.f[i5] == i2; i5--) {
                if (i30.c(obj, u8Var.g[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void t(TextView textView, int i2) {
        pu1.h(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            i11.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void u(TextView textView, int i2) {
        pu1.h(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void v(TextView textView, int i2) {
        pu1.h(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void w(View view, nc0 nc0Var) {
        jr jrVar = nc0Var.g.c;
        if (jrVar == null || !jrVar.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        lc0 lc0Var = nc0Var.g;
        if (lc0Var.m != elevation) {
            lc0Var.m = elevation;
            nc0Var.z();
        }
    }

    public static void x(int i2, di diVar, pi piVar, boolean z) {
        float f2 = piVar.d0;
        wh whVar = piVar.I;
        int iD = whVar.f.d();
        wh whVar2 = piVar.K;
        int iD2 = whVar2.f.d();
        int iE = whVar.e() + iD;
        int iE2 = iD2 - whVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = piVar.q();
        int i3 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i3 = (iD - iD2) - iQ;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iQ;
        if (iD > iD2) {
            i5 = i4 - iQ;
        }
        piVar.J(i4, i5);
        p(i2 + 1, diVar, piVar, z);
    }

    public static void y(int i2, pi piVar, di diVar, pi piVar2, boolean z) {
        float f2 = piVar2.d0;
        wh whVar = piVar2.I;
        int iE = whVar.e() + whVar.f.d();
        wh whVar2 = piVar2.K;
        int iD = whVar2.f.d() - whVar2.e();
        if (iD >= iE) {
            int iQ = piVar2.q();
            if (piVar2.g0 != 8) {
                int i3 = piVar2.r;
                if (i3 == 2) {
                    iQ = (int) (piVar2.d0 * 0.5f * (piVar instanceof qi ? piVar.q() : piVar.T.q()));
                } else if (i3 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(piVar2.u, iQ);
                int i4 = piVar2.v;
                if (i4 > 0) {
                    iQ = Math.min(i4, iQ);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            piVar2.J(i5, iQ + i5);
            p(i2 + 1, diVar, piVar2, z);
        }
    }

    public static void z(int i2, di diVar, pi piVar) {
        float f2 = piVar.e0;
        wh whVar = piVar.J;
        int iD = whVar.f.d();
        wh whVar2 = piVar.L;
        int iD2 = whVar2.f.d();
        int iE = whVar.e() + iD;
        int iE2 = iD2 - whVar2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = piVar.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        piVar.K(i5, i6);
        C(i2 + 1, diVar, piVar);
    }

    public abstract void I(tp3 tp3Var, Set set);

    public abstract int N(tp3 tp3Var);

    public abstract void n(k90 k90Var, float f2, float f3);

    public abstract void r(Throwable th);

    public abstract void s(mc2 mc2Var);
}

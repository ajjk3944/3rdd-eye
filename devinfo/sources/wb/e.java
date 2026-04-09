package wb;

import ac.m;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.internal.ads.vm1;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.g1;
import com.google.android.gms.internal.play_billing.l2;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.p2;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.w1;
import d0.a1;
import i1.n;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import je.u;
import nk.k;
import nm.e0;
import nm.s;
import nm.y;
import nm.z;
import p1.c0;
import p1.f0;
import p1.j;
import u0.d0;
import u0.l;
import u0.m1;
import u0.p;
import u0.q;
import u6.t;
import va.h2;
import x.m0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static ClassLoader f36592a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Thread f36593b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f36594c = true;

    /* renamed from: d, reason: collision with root package name */
    public static Field f36595d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f36596e;

    public static void C() {
        h2.d().j.getClass();
    }

    public static String G(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i4 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.log(level, strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + String.valueOf(string2).length() + 9);
                    sb3.append("<");
                    sb3.append(string2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i10] = string;
        }
        StringBuilder sb4 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i4 < objArr.length && (iIndexOf = str.indexOf("%s", i11)) != -1) {
            sb4.append((CharSequence) str, i11, iIndexOf);
            sb4.append(objArr[i4]);
            i11 = iIndexOf + 2;
            i4++;
        }
        sb4.append((CharSequence) str, i11, str.length());
        if (i4 < objArr.length) {
            sb4.append(" [");
            sb4.append(objArr[i4]);
            for (int i12 = i4 + 1; i12 < objArr.length; i12++) {
                sb4.append(", ");
                sb4.append(objArr[i12]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static String H(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb2.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb2.append(str2.charAt(i4));
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static hm.n I(hm.h... r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.e.I(hm.h[]):hm.n");
    }

    public static final Drawable M(Drawable drawable, int i4) {
        k.e(drawable, "drawable");
        Drawable drawableMutate = drawable.mutate();
        k.d(drawableMutate, "wrap(...)");
        drawableMutate.mutate().setTint(i4);
        return drawableMutate;
    }

    public static int P(byte[] bArr, int i4, vm1 vm1Var) throws w1 {
        int iV = V(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a;
        if (i10 < 0) {
            throw new w1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iV) {
            throw new w1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            vm1Var.f17658c = g1.f20131c;
            return iV;
        }
        vm1Var.f17658c = g1.g(iV, i10, bArr);
        return iV + i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader Q() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.e.Q():java.lang.ClassLoader");
    }

    public static int R(int i4, byte[] bArr) {
        int i10 = bArr[i4] & 255;
        int i11 = bArr[i4 + 1] & 255;
        int i12 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int S(l2 l2Var, int i4, byte[] bArr, int i10, int i11, t1 t1Var, vm1 vm1Var) throws w1 {
        p1 p1VarC = l2Var.c();
        l2 l2Var2 = l2Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        vm1 vm1Var2 = vm1Var;
        int iA0 = a0(p1VarC, l2Var2, bArr2, i10, i12, vm1Var2);
        l2Var2.b(p1VarC);
        vm1Var2.f17658c = p1VarC;
        t1Var.add(p1VarC);
        while (iA0 < i12) {
            vm1 vm1Var3 = vm1Var2;
            int i13 = i12;
            int iV = V(bArr2, iA0, vm1Var3);
            if (i4 != vm1Var3.f17656a) {
                break;
            }
            byte[] bArr3 = bArr2;
            l2 l2Var3 = l2Var2;
            p1 p1VarC2 = l2Var3.c();
            iA0 = a0(p1VarC2, l2Var3, bArr3, iV, i13, vm1Var3);
            l2Var2 = l2Var3;
            bArr2 = bArr3;
            i12 = i13;
            vm1Var2 = vm1Var3;
            l2Var2.b(p1VarC2);
            vm1Var2.f17658c = p1VarC2;
            t1Var.add(p1VarC2);
        }
        return iA0;
    }

    public static int T(byte[] bArr, int i4, t1 t1Var, vm1 vm1Var) throws w1 {
        q1 q1Var = (q1) t1Var;
        int iV = V(bArr, i4, vm1Var);
        int i10 = vm1Var.f17656a + iV;
        while (iV < i10) {
            iV = V(bArr, iV, vm1Var);
            q1Var.d(vm1Var.f17656a);
        }
        if (iV == i10) {
            return iV;
        }
        throw new w1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int U(int i4, byte[] bArr, int i10, int i11, p2 p2Var, vm1 vm1Var) throws w1 {
        if ((i4 >>> 3) == 0) {
            throw new w1("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i4 & 7;
        if (i12 == 0) {
            int iY = Y(bArr, i10, vm1Var);
            p2Var.c(i4, Long.valueOf(vm1Var.f17657b));
            return iY;
        }
        if (i12 == 1) {
            p2Var.c(i4, Long.valueOf(b0(i10, bArr)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iV = V(bArr, i10, vm1Var);
            int i13 = vm1Var.f17656a;
            if (i13 < 0) {
                throw new w1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iV) {
                throw new w1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                p2Var.c(i4, g1.f20131c);
            } else {
                p2Var.c(i4, g1.g(iV, i13, bArr));
            }
            return iV + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new w1("Protocol message contained an invalid tag (zero).");
            }
            p2Var.c(i4, Integer.valueOf(R(i10, bArr)));
            return i10 + 4;
        }
        int i14 = (i4 & (-8)) | 4;
        p2 p2VarB = p2.b();
        int i15 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i15;
        if (i15 >= 100) {
            throw new w1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i16 = 0;
        while (true) {
            if (i10 >= i11) {
                break;
            }
            int iV2 = V(bArr, i10, vm1Var);
            int i17 = vm1Var.f17656a;
            if (i17 == i14) {
                i16 = i17;
                i10 = iV2;
                break;
            }
            i10 = U(i17, bArr, iV2, i11, p2VarB, vm1Var);
            i16 = i17;
        }
        vm1Var.f17659d--;
        if (i10 > i11 || i16 != i14) {
            throw new w1("Failed to parse the message.");
        }
        p2Var.c(i4, p2VarB);
        return i10;
    }

    public static int V(byte[] bArr, int i4, vm1 vm1Var) {
        int i10 = i4 + 1;
        byte b10 = bArr[i4];
        if (b10 < 0) {
            return W(b10, bArr, i10, vm1Var);
        }
        vm1Var.f17656a = b10;
        return i10;
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

    public static int X(int i4, byte[] bArr, int i10, int i11, t1 t1Var, vm1 vm1Var) {
        q1 q1Var = (q1) t1Var;
        int iV = V(bArr, i10, vm1Var);
        q1Var.d(vm1Var.f17656a);
        while (iV < i11) {
            int iV2 = V(bArr, iV, vm1Var);
            if (i4 != vm1Var.f17656a) {
                break;
            }
            iV = V(bArr, iV2, vm1Var);
            q1Var.d(vm1Var.f17656a);
        }
        return iV;
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

    public static int Z(Object obj, l2 l2Var, byte[] bArr, int i4, int i10, int i11, vm1 vm1Var) throws w1 {
        f2 f2Var = (f2) l2Var;
        int i12 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i12;
        if (i12 >= 100) {
            throw new w1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = f2Var.t(obj, bArr, i4, i10, i11, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return iT;
    }

    public static final void a(i0.c cVar, e0 e0Var, Object obj, n nVar, boolean z3, n nVar2, c1.h hVar, p pVar, int i4) {
        int i10;
        int i11;
        int i12;
        n nVar3;
        n nVar4;
        boolean z10;
        n nVarJ;
        i1.p pVar2;
        boolean z11;
        boolean z12;
        n nVarL;
        n nVar5;
        n nVar6;
        i1.p pVar3;
        boolean z13;
        n nVarL2;
        k.e(cVar, "<this>");
        k.e(e0Var, "state");
        k.e(obj, "key");
        pVar.X(346306449);
        if ((i4 & 6) == 0) {
            i10 = (pVar.f(cVar) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            i10 |= pVar.f(e0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i10 |= pVar.h(obj) ? 256 : 128;
        }
        int i13 = i10 | 27648;
        if ((196608 & i4) == 0) {
            i13 = 93184 | i10;
        }
        if ((1572864 & i4) == 0) {
            i13 |= pVar.h(hVar) ? 1048576 : 524288;
        }
        if ((599187 & i13) == 599186 && pVar.A()) {
            pVar.R();
            nVar5 = nVar;
            z10 = z3;
            nVar6 = nVar2;
        } else {
            pVar.T();
            if ((i4 & 1) == 0 || pVar.y()) {
                i11 = 32;
                long j = 1;
                j0.i iVar = new j0.i(a0.f.k(0.0f, 400.0f, null, 5), a0.f.k(0.0f, 400.0f, new d3.i((j << 32) | (j & 4294967295L)), 1), a0.f.k(0.0f, 400.0f, null, 5));
                i12 = i13 & (-458753);
                nVar3 = i1.k.f25553a;
                nVar4 = iVar;
                z10 = true;
            } else {
                pVar.R();
                i12 = i13 & (-458753);
                nVar3 = nVar;
                z10 = z3;
                nVar4 = nVar2;
                i11 = 32;
            }
            pVar.q();
            pVar.W(-1662944388);
            int i14 = i12 & AppLovinMediationAdapter.ERROR_CHILD_USER;
            boolean z14 = i14 == i11;
            Object objL = pVar.L();
            u0.e eVar = l.f34851a;
            if (z14 || objL == eVar) {
                objL = new s(e0Var, 4);
                pVar.g0(objL);
            }
            pVar.p(false);
            d0 d0VarL = q.l((mk.a) objL);
            d0 d0VarL2 = q.l(new c2.c(15, obj, e0Var));
            if (((Boolean) d0VarL2.getValue()).booleanValue()) {
                pVar.W(-11550209);
                i1.p pVar4 = new i1.p();
                int iOrdinal = ((a1) d0VarL.getValue()).ordinal();
                if (iOrdinal == 0) {
                    pVar3 = pVar4;
                    pVar.W(-1662936154);
                    pVar.W(-1662935720);
                    z11 = i14 == 32;
                    Object objL2 = pVar.L();
                    if (z11 || objL2 == eVar) {
                        objL2 = new z(e0Var, 0);
                        pVar.g0(objL2);
                    }
                    z13 = false;
                    pVar.p(false);
                    nVarL2 = p1.z.l((mk.c) objL2);
                    pVar.p(false);
                } else {
                    if (iOrdinal != 1) {
                        pVar.W(-1663429177);
                        pVar.p(false);
                        throw new m();
                    }
                    pVar.W(-1662931418);
                    pVar.W(-1662930984);
                    z11 = i14 == 32;
                    Object objL3 = pVar.L();
                    if (z11 || objL3 == eVar) {
                        objL3 = new z(e0Var, 1);
                        pVar.g0(objL3);
                    }
                    z13 = false;
                    pVar.p(false);
                    nVarL2 = p1.z.l((mk.c) objL3);
                    pVar.p(false);
                    pVar3 = pVar4;
                }
                nVarJ = d.h.j(pVar3, nVarL2);
                pVar.p(z13);
            } else if (obj.equals(e0Var.f30030s.getValue())) {
                pVar.W(-11093021);
                i1.p pVar5 = new i1.p();
                int iOrdinal2 = ((a1) d0VarL.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    pVar2 = pVar5;
                    pVar.W(-1662921420);
                    pVar.W(-1662920986);
                    z11 = i14 == 32;
                    Object objL4 = pVar.L();
                    if (z11 || objL4 == eVar) {
                        objL4 = new z(e0Var, 2);
                        pVar.g0(objL4);
                    }
                    z12 = false;
                    pVar.p(false);
                    nVarL = p1.z.l((mk.c) objL4);
                    pVar.p(false);
                } else {
                    if (iOrdinal2 != 1) {
                        pVar.W(-1663429177);
                        pVar.p(false);
                        throw new m();
                    }
                    pVar.W(-1662916236);
                    pVar.W(-1662915802);
                    z11 = i14 == 32;
                    Object objL5 = pVar.L();
                    if (z11 || objL5 == eVar) {
                        objL5 = new z(e0Var, 3);
                        pVar.g0(objL5);
                    }
                    z12 = false;
                    pVar.p(false);
                    nVarL = p1.z.l((mk.c) objL5);
                    pVar.p(false);
                    pVar2 = pVar5;
                }
                nVarJ = d.h.j(pVar2, nVarL);
                pVar.p(z12);
            } else {
                pVar.W(-10663144);
                pVar.p(false);
                nVarJ = nVar4;
            }
            t.a(e0Var, obj, nVar3.b(nVarJ), z10, ((Boolean) d0VarL2.getValue()).booleanValue(), hVar, pVar, 466046 & (i12 >> 3));
            nVar5 = nVar3;
            nVar6 = nVar4;
        }
        m1 m1VarR = pVar.r();
        if (m1VarR != null) {
            m1VarR.f34870d = new y(cVar, e0Var, obj, nVar5, z10, nVar6, hVar, i4);
        }
    }

    public static int a0(Object obj, l2 l2Var, byte[] bArr, int i4, int i10, vm1 vm1Var) throws w1 {
        int iW = i4 + 1;
        int i11 = bArr[i4];
        if (i11 < 0) {
            iW = W(i11, bArr, iW, vm1Var);
            i11 = vm1Var.f17656a;
        }
        int i12 = iW;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new w1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = vm1Var.f17659d + 1;
        vm1Var.f17659d = i13;
        if (i13 >= 100) {
            throw new w1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i14 = i12 + i11;
        l2Var.g(obj, bArr, i12, i14, vm1Var);
        vm1Var.f17659d--;
        vm1Var.f17658c = obj;
        return i14;
    }

    public static void b(long j, hm.e eVar, int i4, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j8;
        int i14;
        int i15 = i4;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 >= i11) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i16 = i10; i16 < i11; i16++) {
            if (((hm.h) arrayList4.get(i16)).a() < i15) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        hm.h hVar = (hm.h) arrayList.get(i10);
        hm.h hVar2 = (hm.h) arrayList4.get(i11 - 1);
        if (i15 == hVar.a()) {
            int iIntValue = ((Number) arrayList5.get(i10)).intValue();
            int i17 = i10 + 1;
            hm.h hVar3 = (hm.h) arrayList4.get(i17);
            i12 = i17;
            i13 = iIntValue;
            hVar = hVar3;
        } else {
            i12 = i10;
            i13 = -1;
        }
        if (hVar.d(i15) == hVar2.d(i15)) {
            int iMin = Math.min(hVar.a(), hVar2.a());
            int i18 = 0;
            for (int i19 = i15; i19 < iMin && hVar.d(i19) == hVar2.d(i19); i19++) {
                i18++;
            }
            long j9 = 4;
            long j10 = (eVar.f25174b / j9) + j + 2 + i18 + 1;
            eVar.L(-i18);
            eVar.L(i13);
            int i20 = i15 + i18;
            while (i15 < i20) {
                eVar.L(hVar.d(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i20 != ((hm.h) arrayList4.get(i12)).a()) {
                    throw new IllegalStateException("Check failed.");
                }
                eVar.L(((Number) arrayList5.get(i12)).intValue());
                return;
            } else {
                hm.e eVar2 = new hm.e();
                eVar.L(((int) ((eVar2.f25174b / j9) + j10)) * (-1));
                b(j10, eVar2, i20, arrayList4, i12, i11, arrayList5);
                eVar.A(eVar2);
                return;
            }
        }
        int i21 = 1;
        for (int i22 = i12 + 1; i22 < i11; i22++) {
            if (((hm.h) arrayList4.get(i22 - 1)).d(i15) != ((hm.h) arrayList4.get(i22)).d(i15)) {
                i21++;
            }
        }
        long j11 = 4;
        long j12 = (eVar.f25174b / j11) + j + 2 + (i21 * 2);
        eVar.L(i21);
        eVar.L(i13);
        for (int i23 = i12; i23 < i11; i23++) {
            int iD = ((hm.h) arrayList4.get(i23)).d(i15);
            if (i23 == i12 || iD != ((hm.h) arrayList4.get(i23 - 1)).d(i15)) {
                eVar.L(iD & 255);
            }
        }
        hm.e eVar3 = new hm.e();
        int i24 = i12;
        while (i24 < i11) {
            byte bD = ((hm.h) arrayList4.get(i24)).d(i15);
            int i25 = i24 + 1;
            int i26 = i25;
            while (true) {
                if (i26 >= i11) {
                    i26 = i11;
                    break;
                } else if (bD != ((hm.h) arrayList4.get(i26)).d(i15)) {
                    break;
                } else {
                    i26++;
                }
            }
            if (i25 == i26 && i15 + 1 == ((hm.h) arrayList4.get(i24)).a()) {
                eVar.L(((Number) arrayList5.get(i24)).intValue());
                arrayList3 = arrayList5;
                j8 = j12;
                i14 = i26;
            } else {
                eVar.L(((int) ((eVar3.f25174b / j11) + j12)) * (-1));
                arrayList3 = arrayList5;
                j8 = j12;
                i14 = i26;
                b(j8, eVar3, i15 + 1, arrayList, i24, i14, arrayList3);
                arrayList4 = arrayList;
            }
            j12 = j8;
            i24 = i14;
            arrayList5 = arrayList3;
        }
        eVar.A(eVar3);
    }

    public static long b0(int i4, byte[] bArr) {
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((bArr[i4 + 7] & 255) << 56);
    }

    public static boolean e(v3.d[] dVarArr, v3.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            v3.d dVar = dVarArr[i4];
            char c9 = dVar.f35798a;
            v3.d dVar2 = dVarArr2[i4];
            if (c9 != dVar2.f35798a || dVar.f35799b.length != dVar2.f35799b.length) {
                return false;
            }
        }
        return true;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static float[] g(float[] fArr, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i4, length);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static pa.a j(int i4, String str) {
        return new pa.a(i4, str, "com.google.ads.mediation.pangle", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v3.d[] k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wb.e.k(java.lang.String):v3.d[]");
    }

    public static Path l(String str) {
        Path path = new Path();
        try {
            v3.d.b(k(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static pa.a m(int i4, String str) {
        return new pa.a(i4, str, "com.pangle.ads", null);
    }

    public static v3.d[] n(v3.d[] dVarArr) {
        v3.d[] dVarArr2 = new v3.d[dVarArr.length];
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            dVarArr2[i4] = new v3.d(dVarArr[i4]);
        }
        return dVarArr2;
    }

    public static final void o(r1.d dVar, s1.b bVar) {
        boolean z3;
        boolean z10;
        Canvas canvas;
        boolean z11;
        float f10;
        p1.q qVarX = dVar.M().x();
        s1.b bVar2 = (s1.b) dVar.M().f25417c;
        s1.d dVar2 = bVar.f33231a;
        if (bVar.f33247s) {
            return;
        }
        bVar.a();
        if (!dVar2.n()) {
            try {
                bVar.f33231a.M(bVar.f33232b, bVar.f33233c, bVar, bVar.f33235e);
            } catch (Throwable unused) {
            }
        }
        boolean z12 = dVar2.J() > 0.0f;
        if (z12) {
            qVarX.n();
        }
        Canvas canvasA = p1.d.a(qVarX);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = bVar.f33248t;
            float f11 = (int) (j >> 32);
            float f12 = (int) (j & 4294967295L);
            long j8 = bVar.f33249u;
            float f13 = ((int) (j8 >> 32)) + f11;
            float f14 = ((int) (j8 & 4294967295L)) + f12;
            float fA = dVar2.a();
            p1.m mVarI = dVar2.i();
            int iL = dVar2.L();
            if (fA < 1.0f || iL != 3 || mVarI != null || dVar2.h() == 1) {
                l7.d dVarF = bVar.f33244p;
                if (dVarF == null) {
                    dVarF = p1.z.f();
                    bVar.f33244p = dVarF;
                }
                dVarF.a(fA);
                dVarF.b(iL);
                dVarF.d(mVarI);
                canvasA = canvasA;
                f10 = f11;
                canvasA.saveLayer(f10, f12, f13, f14, (Paint) dVarF.f28604b);
            } else {
                canvasA.save();
                canvasA = canvasA;
                f10 = f11;
            }
            canvasA.translate(f10, f12);
            canvasA.concat(dVar2.H());
        }
        boolean z13 = !zIsHardwareAccelerated && bVar.f33251w;
        if (z13) {
            qVarX.c();
            p1.z zVarD = bVar.d();
            if (zVarD instanceof p1.e0) {
                qVarX.h(((p1.e0) zVarD).f30955f);
            } else if (zVarD instanceof f0) {
                j jVarA = bVar.f33241m;
                if (jVarA != null) {
                    jVarA.f30986a.rewind();
                } else {
                    jVarA = p1.l.a();
                    bVar.f33241m = jVarA;
                }
                u.c(jVarA, ((f0) zVarD).f30962f);
                qVarX.g(jVarA);
            } else {
                if (!(zVarD instanceof p1.d0)) {
                    throw new m();
                }
                qVarX.g(((p1.d0) zVarD).f30953f);
            }
        }
        if (bVar2 != null) {
            c2.s sVar = bVar2.f33246r;
            if (!sVar.f2683a) {
                c0.a("Only add dependencies during a tracking");
            }
            x.f0 f0Var = (x.f0) sVar.f2686d;
            if (f0Var != null) {
                f0Var.a(bVar);
            } else if (((s1.b) sVar.f2684b) != null) {
                x.f0 f0Var2 = m0.f36916a;
                x.f0 f0Var3 = new x.f0();
                s1.b bVar3 = (s1.b) sVar.f2684b;
                k.b(bVar3);
                f0Var3.a(bVar3);
                f0Var3.a(bVar);
                sVar.f2686d = f0Var3;
                sVar.f2684b = null;
            } else {
                sVar.f2684b = bVar;
            }
            x.f0 f0Var4 = (x.f0) sVar.f2687e;
            if (f0Var4 != null) {
                z11 = !f0Var4.l(bVar);
            } else if (((s1.b) sVar.f2685c) != bVar) {
                z11 = true;
            } else {
                sVar.f2685c = null;
                z11 = false;
            }
            if (z11) {
                bVar.f33245q++;
            }
        }
        if (p1.d.a(qVarX).isHardwareAccelerated()) {
            z3 = z12;
            z10 = z13;
            canvas = canvasA;
            dVar2.j(qVarX);
        } else {
            r1.b bVar4 = bVar.f33243o;
            if (bVar4 == null) {
                bVar4 = new r1.b();
                bVar.f33243o = bVar4;
            }
            i0.f fVar = bVar4.f32718b;
            d3.c cVar = bVar.f33232b;
            d3.l lVar = bVar.f33233c;
            long jF = me.t1.F(bVar.f33249u);
            r1.a aVar = ((r1.b) fVar.f25418d).f32717a;
            d3.c cVar2 = aVar.f32713a;
            d3.l lVar2 = aVar.f32714b;
            p1.q qVarX2 = fVar.x();
            z10 = z13;
            canvas = canvasA;
            long jE = fVar.E();
            z3 = z12;
            s1.b bVar5 = (s1.b) fVar.f25417c;
            fVar.P(cVar);
            fVar.Q(lVar);
            fVar.O(qVarX);
            fVar.R(jF);
            fVar.f25417c = bVar;
            qVarX.c();
            try {
                bVar.c(bVar4);
            } finally {
                qVarX.k();
                fVar.P(cVar2);
                fVar.Q(lVar2);
                fVar.O(qVarX2);
                fVar.R(jE);
                fVar.f25417c = bVar5;
            }
        }
        if (z10) {
            qVarX.k();
        }
        if (z3) {
            qVarX.d();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public static final Bitmap p(Drawable drawable, Point point) {
        k.e(drawable, "drawable");
        if (point == null) {
            point = new Point(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(point.x, point.y, Bitmap.Config.ARGB_8888);
        k.d(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        try {
            try {
                drawable.draw(canvas);
                return bitmapCreateBitmap;
            } catch (Throwable unused) {
                return null;
            }
        } catch (Exception unused2) {
            bitmapCreateBitmap.recycle();
            return null;
        }
    }

    public static String q(androidx.datastore.preferences.protobuf.g gVar) {
        StringBuilder sb2 = new StringBuilder(gVar.size());
        for (int i4 = 0; i4 < gVar.size(); i4++) {
            byte bA = gVar.a(i4);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bA);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static InvocationHandler r() throws NoSuchMethodException, SecurityException {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = a4.f.t();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static View s(int i4, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewFindViewById = viewGroup.getChildAt(i10).findViewById(i4);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public abstract int A();

    public float B(View view) {
        if (f36594c) {
            try {
                return a4.l.c(view);
            } catch (NoSuchMethodError unused) {
                f36594c = false;
            }
        }
        return view.getAlpha();
    }

    public abstract boolean D(float f10);

    public abstract boolean E(View view);

    public abstract boolean F(float f10, float f11);

    public void J(View view, float f10) {
        if (f36594c) {
            try {
                a4.l.j(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f36594c = false;
            }
        }
        view.setAlpha(f10);
    }

    public void K(int i4, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (!f36596e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f36595d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f36596e = true;
        }
        Field field = f36595d;
        if (field != null) {
            try {
                f36595d.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract boolean L(View view, float f10);

    public abstract void N(ViewGroup.MarginLayoutParams marginLayoutParams, int i4);

    public abstract void O(ViewGroup.MarginLayoutParams marginLayoutParams, int i4, int i10);

    public abstract int c(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float d(int i4);

    public abstract yi.d h(String str);

    public abstract yi.d i(String str);

    public abstract int t(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int u();

    public abstract int v();

    public abstract int w();

    public abstract int x();

    public abstract int y(View view);

    public abstract int z(CoordinatorLayout coordinatorLayout);
}

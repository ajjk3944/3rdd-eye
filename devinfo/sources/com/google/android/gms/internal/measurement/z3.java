package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.xz;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class z3 {

    /* renamed from: a, reason: collision with root package name */
    public static pe.c f20059a;

    /* renamed from: b, reason: collision with root package name */
    public static long f20060b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f20061c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f20062d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f20063e;

    /* renamed from: f, reason: collision with root package name */
    public static pf.c1 f20064f;

    public static long A(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static long b(boolean z3, int i4, t6.a aVar, long j, long j8, int i10, boolean z10, long j9, long j10, long j11, long j12) {
        nk.k.e(aVar, "backoffPolicy");
        if (j12 != Long.MAX_VALUE && z10) {
            if (i10 != 0) {
                long j13 = j8 + 900000;
                if (j12 < j13) {
                    return j13;
                }
            }
            return j12;
        }
        if (z3) {
            long jScalb = aVar == t6.a.f34309b ? j * i4 : (long) Math.scalb(j, i4 - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j8 + jScalb;
        }
        if (z10) {
            long j14 = i10 == 0 ? j8 + j9 : j8 + j11;
            return (j10 == j11 || i10 != 0) ? j14 : (j11 - j10) + j14;
        }
        if (j8 == -1) {
            return Long.MAX_VALUE;
        }
        return j8 + j9;
    }

    public static ImageView.ScaleType c(int i4) {
        return i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 5 ? i4 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final ArrayList d(h1.a aVar) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, TTAdConstant.MATE_VALID};
        List list = aVar.f24800a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < size) {
            int i10 = i4 + 1;
            h1.b bVar = (h1.b) list.get(i4);
            if (!zj.m.J(bVar.f24801a, iArr)) {
                if (bVar.f24801a == 100) {
                    int i11 = i4 + 2;
                    if (i11 < size && ((h1.b) list.get(i11)).f24801a == 1000) {
                        break;
                    }
                    zj.n.m0(arrayList);
                } else {
                    arrayList.add(bVar);
                }
            }
            i4 = i10;
        }
        return arrayList;
    }

    public static final n1.s e(n1.s sVar) {
        n1.s sVarH = ((xz) ((j2.r) i2.k.t(sVar)).getFocusOwner()).h();
        if (sVarH == null || !sVarH.f25565n) {
            return null;
        }
        return sVarH;
    }

    public static long f(int i4, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i11, 262142);
        int iMin2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    d3.b.j(i14);
                    throw new ac.m();
                }
                i13 = 8190;
            }
        }
        return d3.b.a(Math.min(i13, i4), i10 != Integer.MAX_VALUE ? Math.min(i13, i10) : Integer.MAX_VALUE, iMin, iMin2);
    }

    public static long g(int i4, int i10, int i11, int i12) {
        int i13 = 262142;
        int iMin = Math.min(i4, 262142);
        int iMin2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i14 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    d3.b.j(i14);
                    throw new ac.m();
                }
                i13 = 8190;
            }
        }
        return d3.b.a(iMin, iMin2, Math.min(i13, i11), i12 != Integer.MAX_VALUE ? Math.min(i13, i12) : Integer.MAX_VALUE);
    }

    public static final o1.c h(n1.s sVar) {
        i2.d1 d1Var;
        if (sVar.f25565n && (d1Var = sVar.f25560h) != null) {
            g2.v vVarF = g2.n0.f(d1Var);
            if (!vVarF.l()) {
                vVarF = null;
            }
            if (vVarF != null) {
                return sVar.s0(vVarF);
            }
        }
        return o1.c.f30365e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final n1.s i(n1.s r8) {
        /*
            i1.m r0 = r8.f25554a
            boolean r0 = r0.f25565n
            r1 = 0
            if (r0 != 0) goto L9
            goto Lac
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            f2.a.b(r0)
        L10:
            w0.e r0 = new w0.e
            r2 = 16
            i1.m[] r3 = new i1.m[r2]
            r0.<init>(r3)
            i1.m r8 = r8.f25554a
            i1.m r3 = r8.f25559f
            if (r3 != 0) goto L23
            i2.k.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f36399c
            if (r8 == 0) goto Lac
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.l(r8)
            i1.m r8 = (i1.m) r8
            int r3 = r8.f25557d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            i2.k.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f25556c
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La9
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof n1.s
            r5 = 1
            if (r4 == 0) goto L6e
            n1.s r8 = (n1.s) r8
            i1.m r4 = r8.f25554a
            boolean r4 = r4.f25565n
            if (r4 == 0) goto La4
            n1.q r4 = r8.u0()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6d
            if (r4 == r5) goto L6d
            r5 = 2
            if (r4 == r5) goto L6d
            r8 = 3
            if (r4 != r8) goto L67
            goto La4
        L67:
            ac.m r8 = new ac.m
            r8.<init>()
            throw r8
        L6d:
            return r8
        L6e:
            int r4 = r8.f25556c
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La4
            boolean r4 = r8 instanceof i2.j
            if (r4 == 0) goto La4
            r4 = r8
            i2.j r4 = (i2.j) r4
            i1.m r4 = r4.f25691p
            r6 = 0
        L7e:
            if (r4 == 0) goto La1
            int r7 = r4.f25556c
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9e
            int r6 = r6 + 1
            if (r6 != r5) goto L8c
            r8 = r4
            goto L9e
        L8c:
            if (r3 != 0) goto L95
            w0.e r3 = new w0.e
            i1.m[] r7 = new i1.m[r2]
            r3.<init>(r7)
        L95:
            if (r8 == 0) goto L9b
            r3.b(r8)
            r8 = r1
        L9b:
            r3.b(r4)
        L9e:
            i1.m r4 = r4.f25559f
            goto L7e
        La1:
            if (r6 != r5) goto La4
            goto L45
        La4:
            i1.m r8 = i2.k.e(r3)
            goto L45
        La9:
            i1.m r8 = r8.f25559f
            goto L3c
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.z3.i(n1.s):n1.s");
    }

    public static final long j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static String k(int i4, Context context) {
        if (context == null) {
            return "";
        }
        if (i4 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i4 != 7) {
            switch (i4) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i4);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static final Bundle l(Bundle bundle, String str) {
        nk.k.e(str, "key");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        throw new IllegalArgumentException(d.h.t("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }

    public static void m(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int n(int i4) {
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 8) {
            return 3;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 32) {
            return 5;
        }
        if (i4 == 64) {
            return 6;
        }
        if (i4 == 128) {
            return 7;
        }
        if (i4 == 256) {
            return 8;
        }
        if (i4 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(je.u.r(i4, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final boolean o(n1.s sVar) {
        i2.e0 e0Var;
        i2.d1 d1Var;
        i2.e0 e0Var2;
        i2.d1 d1Var2 = sVar.f25560h;
        return (d1Var2 == null || (e0Var = d1Var2.f25610o) == null || !e0Var.I() || (d1Var = sVar.f25560h) == null || (e0Var2 = d1Var.f25610o) == null || !e0Var2.H()) ? false : true;
    }

    public static boolean p() {
        if (Build.VERSION.SDK_INT >= 29) {
            return i6.a.c();
        }
        try {
            if (f20061c == null) {
                f20060b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f20061c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f20061c.invoke(null, Long.valueOf(f20060b))).booleanValue();
        } catch (Exception e2) {
            m("isTagEnabled", e2);
            return false;
        }
    }

    public static final void q() {
        try {
            if (f20064f == null) {
                wd.f fVarB = wd.f.b();
                fVarB.a();
                pf.c1 c1Var = (pf.c1) ((pf.i) ((pf.r) fVarB.f36617d.a(pf.r.class))).f31847o.get();
                nk.k.e(c1Var, "<set-?>");
                f20064f = c1Var;
            }
            pf.c1 c1Var2 = f20064f;
            if (c1Var2 == null) {
                nk.k.k("sharedSessionRepository");
                throw null;
            }
            if (c1Var2.f31788i) {
                if (c1Var2 != null) {
                    c1Var2.b();
                } else {
                    nk.k.k("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static com.google.android.gms.common.api.internal.a0 r(String str) throws ProtocolException {
        int i4;
        String strSubstring;
        nk.k.e(str, "statusLine");
        boolean zW0 = vk.p.w0(str, "HTTP/1.", false);
        rl.u uVar = rl.u.HTTP_1_0;
        rl.u uVar2 = rl.u.HTTP_1_1;
        if (zW0) {
            i4 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                uVar = uVar2;
            }
        } else if (vk.p.w0(str, "ICY ", false)) {
            i4 = 4;
        } else {
            if (!vk.p.w0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i4 = 12;
            uVar = uVar2;
        }
        int i10 = i4 + 3;
        if (str.length() < i10) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        String strSubstring2 = str.substring(i4, i10);
        nk.k.d(strSubstring2, "substring(...)");
        Integer numX0 = vk.p.x0(strSubstring2);
        if (numX0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numX0.intValue();
        if (str.length() <= i10) {
            strSubstring = "";
        } else {
            if (str.charAt(i10) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i4 + 4);
            nk.k.d(strSubstring, "substring(...)");
        }
        return new com.google.android.gms.common.api.internal.a0(uVar, iIntValue, strSubstring);
    }

    public static void s(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void t(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z3;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z3);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static void u(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static int v(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static String w(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static final boolean x(Throwable th2, mk.a aVar) {
        List listI;
        Object objInvoke;
        nk.k.e(th2, "<this>");
        Integer num = hk.a.f25159a;
        h1.f fVar = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            nk.k.d(suppressed, "getSuppressed(...)");
            listI = zj.m.I(suppressed);
        } else {
            Method method = gk.a.f24755b;
            listI = (method == null || (objInvoke = method.invoke(th2, null)) == null) ? zj.s.f38317a : zj.m.I((Throwable[]) objInvoke);
        }
        int size = listI.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            if (((Throwable) listI.get(i4)) instanceof h1.f) {
                return false;
            }
        }
        try {
            h1.a aVar2 = (h1.a) aVar.invoke();
            if (aVar2 != null && !aVar2.f24800a.isEmpty()) {
                z3 = true;
            }
            if (z3) {
                nk.k.b(aVar2);
                fVar = new h1.f(aVar2);
            }
        } catch (Throwable th3) {
            fVar = th3;
        }
        if (fVar != null) {
            wd.b.a(th2, fVar);
        }
        return z3;
    }

    public static synchronized void y(pe.c cVar) {
        if (f20059a != null) {
            throw new IllegalStateException("init() already called");
        }
        f20059a = cVar;
    }

    public static int z(int i4) {
        return (i4 >>> 1) ^ (-(i4 & 1));
    }
}

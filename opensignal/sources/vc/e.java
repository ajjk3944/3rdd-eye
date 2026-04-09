package vc;

import ac.j;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.p0;
import androidx.media3.common.k0;
import bf.n;
import cc.s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.survicate.surveys.entities.colors.MicroColorControlOpacity;
import com.survicate.surveys.entities.survey.theme.MicroColorScheme;
import es.g0;
import g1.f0;
import h9.t;
import ht.b0;
import ht.d1;
import ht.x;
import io.sentry.android.core.e0;
import io.sentry.q;
import ir.k;
import ir.o;
import ir.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import lf.t1;
import lr.r;
import lr.z1;
import mq.a0;
import n0.f1;
import n0.k1;
import n0.p;
import n0.t0;
import n0.w;
import rr.o0;
import rr.r0;
import rr.u;
import rr.z;
import ur.q0;
import x1.y;
import xu.l;
import z0.m;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static LatLng f23907a;

    public static final boolean A(ir.c cVar) {
        mr.g gVarZ;
        mr.g gVarB;
        if (cVar instanceof k) {
            v vVar = (v) cVar;
            Field fieldU = l.u(vVar);
            if (!(fieldU != null ? fieldU.isAccessible() : true)) {
                return false;
            }
            Method methodV = l.v(vVar.b());
            if (!(methodV != null ? methodV.isAccessible() : true)) {
                return false;
            }
            Method methodV2 = l.v(((k) cVar).d());
            if (!(methodV2 != null ? methodV2.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof v) {
            v vVar2 = (v) cVar;
            Field fieldU2 = l.u(vVar2);
            if (!(fieldU2 != null ? fieldU2.isAccessible() : true)) {
                return false;
            }
            Method methodV3 = l.v(vVar2.b());
            if (!(methodV3 != null ? methodV3.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof o) {
            Field fieldU3 = l.u(((o) cVar).g());
            if (!(fieldU3 != null ? fieldU3.isAccessible() : true)) {
                return false;
            }
            Method methodV4 = l.v((ir.g) cVar);
            if (!(methodV4 != null ? methodV4.isAccessible() : true)) {
                return false;
            }
        } else if (cVar instanceof ir.h) {
            Field fieldU4 = l.u(((ir.h) cVar).g());
            if (!(fieldU4 != null ? fieldU4.isAccessible() : true)) {
                return false;
            }
            Method methodV5 = l.v((ir.g) cVar);
            if (!(methodV5 != null ? methodV5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(cVar instanceof ir.g)) {
                throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
            }
            ir.g gVar = (ir.g) cVar;
            Method methodV6 = l.v(gVar);
            if (!(methodV6 != null ? methodV6.isAccessible() : true)) {
                return false;
            }
            r rVarA = z1.a(cVar);
            Object objB = (rVarA == null || (gVarB = rVarA.B()) == null) ? null : gVarB.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            r rVarA2 = z1.a(gVar);
            Object objB2 = (rVarA2 == null || (gVarZ = rVarA2.z()) == null) ? null : gVarZ.b();
            Constructor constructor = objB2 instanceof Constructor ? (Constructor) objB2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean B(rr.f fVar) {
        LinkedHashSet linkedHashSet = or.d.f19666a;
        if (!ts.d.l(fVar)) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = or.d.f19666a;
        qs.b bVarF = xs.d.f(fVar);
        return mq.o.k0(linkedHashSet2, bVarF != null ? bVarF.f() : null);
    }

    public static final String C(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        br.l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 33) {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128));
            br.l.b(applicationInfo);
        } else {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            br.l.b(applicationInfo);
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }

    public static io.sentry.k D(String str) {
        String str2;
        Object obj = null;
        try {
            URI uri = new URI(str);
            if (uri.isAbsolute()) {
                try {
                    uri.toURL();
                } catch (Exception unused) {
                    return new io.sentry.k(obj, obj, obj, 5);
                }
            }
            String rawPath = "";
            if (uri.getScheme() == null) {
                str2 = "";
            } else {
                str2 = uri.getScheme() + "://";
            }
            String rawAuthority = uri.getRawAuthority() == null ? "" : uri.getRawAuthority();
            if (uri.getRawPath() != null) {
                rawPath = uri.getRawPath();
            }
            return new io.sentry.k(str2 + r(rawAuthority) + rawPath, uri.getRawQuery(), uri.getRawFragment(), 5);
        } catch (Exception unused2) {
            return new io.sentry.k(obj, obj, obj, 5);
        }
    }

    public static void E(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void F(HashMap map, String str, Object obj) {
        br.l.e(map, "<this>");
        if (obj != null) {
            map.put(str, obj);
        }
    }

    public static final void G(String str, String str2, HashMap map) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        map.put(str, str2);
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
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

    public static void I(eb.a aVar) {
        aVar.k = -3.4028235E38f;
        aVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f8040a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f8040a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f8040a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static t6.f J(t6.f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (t6.f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                t6.f fVar2 = new t6.f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((t6.f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                fVar.a((t6.f) map.get(strArr[0]));
                return fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    fVar.a((t6.f) map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return fVar;
    }

    public static float K(int i10, int i11, int i12, float f10) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    public static final void L(ir.c cVar) throws SecurityException {
        mr.g gVarZ;
        mr.g gVarB;
        if (cVar instanceof k) {
            v vVar = (v) cVar;
            Field fieldU = l.u(vVar);
            if (fieldU != null) {
                fieldU.setAccessible(true);
            }
            Method methodV = l.v(vVar.b());
            if (methodV != null) {
                methodV.setAccessible(true);
            }
            Method methodV2 = l.v(((k) cVar).d());
            if (methodV2 == null) {
                return;
            }
            methodV2.setAccessible(true);
            return;
        }
        if (cVar instanceof v) {
            v vVar2 = (v) cVar;
            Field fieldU2 = l.u(vVar2);
            if (fieldU2 != null) {
                fieldU2.setAccessible(true);
            }
            Method methodV3 = l.v(vVar2.b());
            if (methodV3 == null) {
                return;
            }
            methodV3.setAccessible(true);
            return;
        }
        if (cVar instanceof o) {
            Field fieldU3 = l.u(((o) cVar).g());
            if (fieldU3 != null) {
                fieldU3.setAccessible(true);
            }
            Method methodV4 = l.v((ir.g) cVar);
            if (methodV4 == null) {
                return;
            }
            methodV4.setAccessible(true);
            return;
        }
        if (cVar instanceof ir.h) {
            Field fieldU4 = l.u(((ir.h) cVar).g());
            if (fieldU4 != null) {
                fieldU4.setAccessible(true);
            }
            Method methodV5 = l.v((ir.g) cVar);
            if (methodV5 == null) {
                return;
            }
            methodV5.setAccessible(true);
            return;
        }
        if (!(cVar instanceof ir.g)) {
            throw new UnsupportedOperationException("Unknown callable: " + cVar + " (" + cVar.getClass() + ')');
        }
        ir.g gVar = (ir.g) cVar;
        Method methodV6 = l.v(gVar);
        if (methodV6 != null) {
            methodV6.setAccessible(true);
        }
        r rVarA = z1.a(cVar);
        Object objB = (rVarA == null || (gVarB = rVarA.B()) == null) ? null : gVarB.b();
        AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        r rVarA2 = z1.a(gVar);
        Object objB2 = (rVarA2 == null || (gVarZ = rVarA2.z()) == null) ? null : gVarZ.b();
        Constructor constructor = objB2 instanceof Constructor ? (Constructor) objB2 : null;
        if (constructor == null) {
            return;
        }
        constructor.setAccessible(true);
    }

    public static void O(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z10 = onLongClickListener != null;
        boolean z11 = zHasOnClickListeners || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z10);
        checkableImageButton.setImportantForAccessibility(z11 ? 1 : 2);
    }

    public static void P(Status status, Object obj, dd.h hVar) {
        if (status.f4819a <= 0) {
            hVar.a(obj);
        } else {
            hVar.f7294a.n(status.f4821g != null ? new j(status) : new ac.d(status));
        }
    }

    public static t Q(int i10, u5.l lVar, a5.v vVar) throws k0 {
        t tVarC = t.c(lVar, vVar);
        while (true) {
            int i11 = tVarC.f10477a;
            if (i11 == i10) {
                return tVarC;
            }
            c7.a.z("Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
            long j = tVarC.f10478b + 8;
            if (j > 2147483647L) {
                throw k0.c("Chunk is too large (~2GB+) to skip; id: " + i11);
            }
            lVar.m((int) j);
            tVarC = t.c(lVar, vVar);
        }
    }

    public static hr.b R(hr.d dVar, int i10) {
        br.l.e(dVar, "<this>");
        d(i10 > 0, Integer.valueOf(i10));
        int i11 = dVar.f10863a;
        int i12 = dVar.f10864d;
        if (dVar.f10865g <= 0) {
            i10 = -i10;
        }
        return new hr.b(i11, i12, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object S(int r6, java.lang.Object r7, k2.x r8, k2.r r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            k2.r r0 = r8.f14008b
            boolean r0 = br.l.a(r0, r9)
            if (r0 != 0) goto L29
            k2.r r0 = k2.r.f14001r
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            k2.r r3 = r8.f14008b
            int r3 = r3.f14004a
            int r0 = r0.f14004a
            int r0 = br.l.g(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.f14004a
            goto L66
        L62:
            k2.r r9 = r8.f14008b
            int r9 = r9.f14004a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = fh.b.g(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.e.S(int, java.lang.Object, k2.x, k2.r, int):java.lang.Object");
    }

    public static hr.d T(int i10, int i11) {
        if (i11 > Integer.MIN_VALUE) {
            return new hr.d(i10, i11 - 1, 1);
        }
        hr.d dVar = hr.d.f10870r;
        return hr.d.f10870r;
    }

    public static Parcelable U(String str, Bundle bundle) {
        ClassLoader classLoader = e.class.getClassLoader();
        s.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void V(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableU = U("MapOptions", bundle);
        if (parcelableU != null) {
            W(bundle2, "MapOptions", parcelableU);
        }
        Parcelable parcelableU2 = U("StreetViewPanoramaOptions", bundle);
        if (parcelableU2 != null) {
            W(bundle2, "StreetViewPanoramaOptions", parcelableU2);
        }
        Parcelable parcelableU3 = U("camera", bundle);
        if (parcelableU3 != null) {
            W(bundle2, "camera", parcelableU3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void W(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = e.class.getClassLoader();
        s.h(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static final void a(m mVar, String str, wk.a aVar, ar.a aVar2, p pVar, int i10) {
        long j;
        long j7;
        p pVar2 = pVar;
        br.l.e(str, "text");
        pVar2.T(571533122);
        int i11 = i10 | (pVar2.e(mVar) ? 4 : 2) | (pVar2.e(str) ? 32 : 16) | (pVar2.g(aVar2) ? 2048 : 1024);
        if (pVar2.K(i11 & 1, (i11 & 1171) != 1170)) {
            int[] iArr = vk.a.f23927a;
            int i12 = iArr[aVar.ordinal()];
            if (i12 == 1) {
                j = xk.c.f25436a;
            } else {
                if (i12 != 2) {
                    throw new n();
                }
                j = xk.c.f25437b;
            }
            int i13 = iArr[aVar.ordinal()];
            if (i13 == 1) {
                j7 = xk.c.f25438c;
            } else {
                if (i13 != 2) {
                    throw new n();
                }
                j7 = xk.c.f25439d;
            }
            Object objI = pVar2.I();
            t0 t0Var = n0.j.f17190a;
            if (objI == t0Var) {
                objI = new a0.i();
                pVar2.b0(objI);
            }
            float f10 = 8;
            m mVarA = androidx.compose.foundation.b.a(androidx.compose.foundation.layout.b.a(androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.a(mVar, e0.e.a(f10), 518143), j, f0.f9213a), 48), (a0.i) objI, k0.n.a());
            boolean z10 = (i11 & 7168) == 2048;
            Object objI2 = pVar2.I();
            if (z10 || objI2 == t0Var) {
                objI2 = new p0(19, aVar2);
                pVar2.b0(objI2);
            }
            m mVarB = androidx.compose.foundation.a.b(mVarA, (ar.a) objI2);
            v1.r rVarD = c0.f.d(z0.b.f26484x, false);
            int iHashCode = Long.hashCode(pVar2.S);
            f1 f1VarK = pVar2.k();
            m mVarF = y3.F(pVar2, mVarB);
            x1.g.f24833a.getClass();
            y yVar = x1.f.f24793b;
            pVar2.U();
            if (pVar2.R) {
                pVar2.j(yVar);
            } else {
                pVar2.e0();
            }
            w.k(x1.f.f24796e, rVarD, pVar2);
            w.k(x1.f.f24795d, f1VarK, pVar2);
            x1.e eVar = x1.f.f24797f;
            if (pVar2.R || !br.l.a(pVar2.I(), Integer.valueOf(iHashCode))) {
                w.g.m(iHashCode, pVar2, iHashCode, eVar);
            }
            w.k(x1.f.f24794c, mVarF, pVar2);
            k0.t.b(str, androidx.compose.foundation.layout.a.a(mVar, f10), j7, t1.v(16), k2.r.B, xk.a.f25431a, 0L, new r2.k(3), 0L, 0, false, 0, 0, null, pVar, ((i11 >> 3) & 14) | 14180352, 260904);
            pVar2 = pVar;
            pVar2.o(true);
        } else {
            pVar2.N();
        }
        k1 k1VarQ = pVar2.q();
        if (k1VarQ != null) {
            k1VarQ.f17207d = new k0.g(mVar, str, aVar, aVar2, i10, 1);
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
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

    public static boolean c(u5.l lVar) {
        a5.v vVar = new a5.v(8);
        int i10 = t.c(lVar, vVar).f10477a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.p(vVar.f165a, 0, 4);
        vVar.E(0);
        int iG = vVar.g();
        if (iG == 1463899717) {
            return true;
        }
        a5.a.m("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static final void d(boolean z10, Number number) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(q qVar, Throwable th2) throws InterruptedException {
        boolean zIsTerminated;
        if (th2 != null) {
            try {
                w.g.n(qVar);
                return;
            } catch (Throwable th3) {
                ir.f0.c(th2, th3);
                return;
            }
        }
        if (qVar instanceof AutoCloseable) {
            qVar.close();
            return;
        }
        if (!(qVar instanceof ExecutorService)) {
            throw new IllegalArgumentException();
        }
        ExecutorService executorService = (ExecutorService) qVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static double f(double d6, double d10, double d11) {
        if (d10 <= d11) {
            return d6 < d10 ? d10 : d6 > d11 ? d11 : d6;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    public static float g(float f10, float f11, float f12) {
        if (f11 <= f12) {
            return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int h(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static long i(long j, long j7, long j10) {
        if (j7 <= j10) {
            return j < j7 ? j7 : j > j10 ? j10 : j;
        }
        throw new IllegalArgumentException(w.g.h(w.g.k(j10, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j7, '.'));
    }

    public static ImageView.ScaleType j(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final lt.i k(d1 d1Var) {
        int i10 = lt.h.f15930a[d1Var.ordinal()];
        if (i10 == 1) {
            return lt.i.INV;
        }
        if (i10 == 2) {
            return lt.i.IN;
        }
        if (i10 == 3) {
            return lt.i.OUT;
        }
        throw new n();
    }

    public static final ArrayList l(ArrayList arrayList, List list, u uVar) {
        br.l.e(list, "oldValueParameters");
        arrayList.size();
        list.size();
        ArrayList arrayListW0 = mq.o.W0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(mq.p.a0(arrayListW0, 10));
        Iterator it = arrayListW0.iterator();
        while (it.hasNext()) {
            lq.l lVar = (lq.l) it.next();
            x xVar = (x) lVar.f15571a;
            q0 q0Var = (q0) lVar.f15572d;
            int i10 = q0Var.B;
            sr.h annotations = q0Var.getAnnotations();
            qs.g name = q0Var.getName();
            br.l.d(name, "oldParameter.name");
            boolean zW1 = q0Var.w1();
            boolean z10 = q0Var.E;
            boolean z11 = q0Var.F;
            x xVarF = q0Var.G != null ? xs.d.j(uVar).n().f(xVar) : null;
            o0 o0VarH = q0Var.h();
            br.l.d(o0VarH, "oldParameter.source");
            arrayList2.add(new q0(uVar, null, i10, annotations, name, xVar, zW1, z10, z11, xVarF, o0VarH));
        }
        return arrayList2;
    }

    public static pr.j m(pr.d dVar, boolean z10) {
        String lowerCase;
        br.l.e(dVar, "functionClass");
        List list = dVar.G;
        pr.j jVar = new pr.j(dVar, null, rr.c.DECLARATION, z10);
        ur.v vVarR0 = dVar.R0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((r0) obj).N() != d1.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        iu.g gVarV0 = mq.o.V0(arrayList);
        ArrayList arrayList2 = new ArrayList(mq.p.a0(gVarV0, 10));
        Iterator it = gVarV0.iterator();
        while (true) {
            a0 a0Var = (a0) it;
            if (!a0Var.f16922d.hasNext()) {
                b0 b0VarQ = ((r0) mq.o.z0(list)).q();
                z zVar = z.ABSTRACT;
                as.p pVar = rr.p.f21701e;
                mq.w wVar = mq.w.f16945a;
                jVar.A1(null, vVarR0, wVar, wVar, arrayList2, b0VarQ, zVar, pVar);
                pr.j jVar2 = jVar;
                jVar2.T = true;
                return jVar2;
            }
            mq.z zVar2 = (mq.z) a0Var.next();
            int i10 = zVar2.f16948a;
            r0 r0Var = (r0) zVar2.f16949b;
            String strB = r0Var.getName().b();
            br.l.d(strB, "typeParameter.name.asString()");
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                br.l.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            pr.j jVar3 = jVar;
            qs.g gVarE = qs.g.e(lowerCase);
            b0 b0VarQ2 = r0Var.q();
            br.l.d(b0VarQ2, "typeParameter.defaultType");
            arrayList2.add(new q0(jVar3, null, i10, sr.g.f22217a, gVarE, b0VarQ2, false, false, false, null, o0.f21696s));
            jVar = jVar3;
        }
    }

    public static StateListDrawable n(Context context, MicroColorScheme microColorScheme, boolean z10) throws Resources.NotFoundException {
        br.l.e(microColorScheme, "colorScheme");
        int iZ = se.b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.AnswerBackground.getOpacityValue());
        float dimension = context.getResources().getDimension(on.p.survicate_micro_question_border_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iZ);
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(on.p.survicate_micro_border_width_default), context.getColor(on.o.survicate_focus_border));
        gradientDrawable.setCornerRadius(dimension);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(dimension);
        gradientDrawable2.setColor(iZ);
        if (z10) {
            gradientDrawable2.setStroke(context.getResources().getDimensionPixelSize(on.p.survicate_micro_border_width_default), microColorScheme.getAnswer());
        }
        return q(gradientDrawable, gradientDrawable2);
    }

    public static StateListDrawable o(Context context, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(on.p.survicate_micro_border_width_default), context.getColor(on.o.survicate_focus_border));
        gradientDrawable.setCornerRadius(f10);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        return q(gradientDrawable, gradientDrawable2);
    }

    public static StateListDrawable p(Context context, MicroColorScheme microColorScheme, boolean z10) throws Resources.NotFoundException {
        br.l.e(microColorScheme, "colorScheme");
        int iZ = se.b.z(microColorScheme.getAnswer(), MicroColorControlOpacity.AnswerBackground.getOpacityValue());
        float dimension = context.getResources().getDimension(on.p.survicate_micro_input_border_radius);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(on.p.survicate_micro_border_width_default);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iZ);
        gradientDrawable.setStroke(dimensionPixelSize, z10 ? context.getColor(on.o.survicate_micro_error) : microColorScheme.getAnswer());
        gradientDrawable.setCornerRadius(dimension);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(iZ);
        gradientDrawable2.setCornerRadius(dimension);
        if (z10) {
            gradientDrawable2.setStroke(dimensionPixelSize, context.getColor(on.o.survicate_micro_error));
        }
        return q(gradientDrawable, gradientDrawable2);
    }

    public static StateListDrawable q(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        return stateListDrawable;
    }

    public static String r(String str) {
        if (!str.contains("@")) {
            return str;
        }
        if (str.startsWith("@")) {
            return "[Filtered]".concat(str);
        }
        StringBuilder sbT = c7.a.t(str.substring(0, str.indexOf(64)).contains(":") ? "[Filtered]:[Filtered]" : "[Filtered]");
        sbT.append(str.substring(str.indexOf(64)));
        return sbT.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method s(Method[] methodArr, String str, Class... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        boolean z10 = false;
        int i10 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                method = null;
                break;
            }
            method = methodArr[i10];
            if (str.equals(method.getName()) || tt.s.n0(method.getName(), str.concat("-"), z10)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z11 = z10;
                    ?? r12 = z11;
                    for (?? r11 = z11; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i11 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(ir.f0.H(cls).equals(ir.f0.H(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i11;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i10++;
            z10 = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method t(Class cls, String str, Object... objArr) throws SecurityException {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int iCeil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                hr.d dVarT = T(0, iCeil);
                ArrayList arrayList2 = new ArrayList(mq.p.a0(dVarT, 10));
                Iterator it = dVarT.iterator();
                while (((hr.c) it).f10868g) {
                    ((hr.c) it).nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                br.a0 a0Var = new br.a0(3);
                ArrayList arrayList3 = a0Var.f2897a;
                a0Var.c(clsArr);
                a0Var.a(p.class);
                a0Var.c(clsArr2);
                return s(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!br.l.a(method.getName(), str)) {
                        if (!tt.s.n0(method.getName(), str + '-', false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0140 A[EDGE_INSN: B:128:0x0140->B:65:0x0140 BREAK  A[LOOP:0: B:54:0x010c->B:58:0x0119]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.sentry.android.replay.viewhierarchy.f u(android.view.View r11, io.sentry.android.replay.viewhierarchy.f r12, io.sentry.x5 r13) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.e.u(android.view.View, io.sentry.android.replay.viewhierarchy.f, io.sentry.x5):io.sentry.android.replay.viewhierarchy.f");
    }

    public static final g0 v(rr.f fVar) {
        rr.f fVar2;
        rr.i iVarP;
        br.l.e(fVar, "<this>");
        int i10 = xs.d.f25523a;
        Iterator it = fVar.q().Z().q().iterator();
        while (true) {
            if (!it.hasNext()) {
                fVar2 = null;
                break;
            }
            x xVar = (x) it.next();
            if (!or.h.x(xVar)) {
                iVarP = xVar.Z().p();
                int i11 = ts.d.f22961a;
                if (ts.d.n(iVarP, rr.g.CLASS) || ts.d.n(iVarP, rr.g.ENUM_CLASS)) {
                    break;
                }
            }
        }
        br.l.c(iVarP, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        fVar2 = (rr.f) iVarP;
        if (fVar2 == null) {
            return null;
        }
        at.n nVarS = fVar2.S();
        g0 g0Var = nVarS instanceof g0 ? (g0) nVarS : null;
        return g0Var == null ? v(fVar2) : g0Var;
    }

    public static final long w(b9.e eVar) {
        DragEvent dragEvent = (DragEvent) eVar.f2481d;
        float x10 = dragEvent.getX();
        float y10 = dragEvent.getY();
        return (Float.floatToRawIntBits(x10) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L);
    }

    public static final String x(ir.d dVar, sv.a aVar) {
        br.l.e(dVar, "clazz");
        if ((aVar == null ? null : aVar.f22363a) == null) {
            return wv.a.a(dVar);
        }
        return wv.a.a(dVar) + "::" + aVar.f22363a;
    }

    public static void y(String str, String str2, p pVar, Object... objArr) throws Exception {
        try {
            Class<?> cls = Class.forName(str);
            Method methodT = t(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (methodT != null) {
                methodT.setAccessible(true);
                if (Modifier.isStatic(methodT.getModifiers())) {
                    z(methodT, null, pVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    z(methodT, cls.getConstructor(null).newInstance(null), pVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e4) {
            e0.q("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e4;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(java.lang.reflect.Method r10, java.lang.Object r11, n0.p r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.e.z(java.lang.reflect.Method, java.lang.Object, n0.p, java.lang.Object[]):void");
    }

    public abstract void N(boolean z10);

    public void M(boolean z10) {
    }
}

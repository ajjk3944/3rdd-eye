package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pz implements gk, o41, gg1, y9, wl0, jz0, qm0 {
    public static pz g;
    public static final /* synthetic */ pz h = new pz(1);
    public static final pz i = new pz(2);
    public static final pz j = new pz(3);
    public static final pz k = new pz(4);
    public static final pz l = new pz(5);
    public static final pz m = new pz(6);
    public static final pz n = new pz(7);
    public static final pz o = new pz(8);
    public static final pz p = new pz(9);
    public static final pz q = new pz(11);
    public static pz r;
    public final /* synthetic */ int f;

    public /* synthetic */ pz(int i2) {
        this.f = i2;
    }

    public static pz g(Context context, int i2) {
        pu1.g("Cannot create a CalendarItemStyle with a styleResId of 0", i2 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, gn0.v);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ob1.e(context, typedArrayObtainStyledAttributes, 4);
        ob1.e(context, typedArrayObtainStyledAttributes, 9);
        ob1.e(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        su0.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new l(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        pz pzVar = new pz(14);
        pu1.h(rect.left);
        pu1.h(rect.top);
        pu1.h(rect.right);
        pu1.h(rect.bottom);
        return pzVar;
    }

    public static float j(l60 l60Var, k60 k60Var) {
        float yChartMax = k60Var.getYChartMax();
        float yChartMin = k60Var.getYChartMin();
        j60 lineData = k60Var.getLineData();
        if (l60Var.p > 0.0f && l60Var.q < 0.0f) {
            return 0.0f;
        }
        if (lineData.a > 0.0f) {
            yChartMax = 0.0f;
        }
        if (lineData.b < 0.0f) {
            yChartMin = 0.0f;
        }
        return l60Var.q >= 0.0f ? yChartMin : yChartMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(defpackage.yr r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz.l(yr, android.text.Editable, int, int, boolean):boolean");
    }

    public static final ta4 m(PackageInfo packageInfo, ta4... ta4VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        db4 db4Var = new db4(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < ta4VarArr.length; i2++) {
            if (ta4VarArr[i2].equals(db4Var)) {
                return ta4VarArr[i2];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean o(android.content.pm.PackageInfo r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L2c
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1c
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L19
            goto L1c
        L19:
            r2 = r4
        L1a:
            r3 = r0
            goto L2e
        L1c:
            android.content.pm.ApplicationInfo r2 = r4.applicationInfo
            if (r2 != 0) goto L22
        L20:
            r2 = r1
            goto L29
        L22:
            int r2 = r2.flags
            r2 = r2 & 129(0x81, float:1.81E-43)
            if (r2 == 0) goto L20
            r2 = r0
        L29:
            r3 = r2
            r2 = r4
            goto L2e
        L2c:
            r2 = 0
            goto L1a
        L2e:
            if (r4 == 0) goto L4c
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L4c
            if (r3 == 0) goto L3d
            ta4[] r4 = defpackage.sc4.a
            ta4 r4 = m(r2, r4)
            goto L49
        L3d:
            ta4[] r4 = defpackage.sc4.a
            r4 = r4[r1]
            ta4[] r4 = new defpackage.ta4[]{r4}
            ta4 r4 = m(r2, r4)
        L49:
            if (r4 == 0) goto L4c
            return r0
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz.o(android.content.pm.PackageInfo):boolean");
    }

    public static /* bridge */ b74 q(Object obj) {
        p54 p54Var = (p54) obj;
        b74 b74Var = p54Var.zzt;
        if (b74Var != b74.f) {
            return b74Var;
        }
        b74 b74VarA = b74.a();
        p54Var.zzt = b74VarA;
        return b74VarA;
    }

    public static boolean r(int i2, o9 o9Var, Object obj) throws a64 {
        m0 m0Var = (m0) o9Var.d;
        int i3 = o9Var.a;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            o9Var.t(0);
            ((b74) obj).d(i4 << 3, Long.valueOf(m0Var.p()));
            return true;
        }
        if (i5 == 1) {
            o9Var.t(1);
            ((b74) obj).d((i4 << 3) | 1, Long.valueOf(m0Var.r()));
            return true;
        }
        if (i5 == 2) {
            ((b74) obj).d((i4 << 3) | 2, o9Var.B());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new a64("Protocol message end-group tag did not match expected tag.");
            }
            if (i5 != 5) {
                throw new z54();
            }
            o9Var.t(5);
            ((b74) obj).d(5 | (i4 << 3), Integer.valueOf(m0Var.s()));
            return true;
        }
        b74 b74VarA = b74.a();
        int i6 = i4 << 3;
        int i7 = i2 + 1;
        if (i7 >= 100) {
            throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (o9Var.A() != Integer.MAX_VALUE && r(i7, o9Var, b74VarA)) {
        }
        if ((i6 | 4) != o9Var.a) {
            throw new a64("Protocol message end-group tag did not match expected tag.");
        }
        if (b74VarA.e) {
            b74VarA.e = false;
        }
        ((b74) obj).d(i6 | 3, b74VarA);
        return true;
    }

    @Override // defpackage.jz0
    public kz0 a(rl rlVar) {
        return new ox((Context) rlVar.g, (String) rlVar.h, (l92) rlVar.i, rlVar.f);
    }

    @Override // defpackage.y9
    public float b() {
        return 1.0f;
    }

    @Override // defpackage.y9
    public boolean c(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.y9
    public float d() {
        return 0.0f;
    }

    @Override // defpackage.y9
    public w40 e() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.y9
    public boolean f(float f) {
        return false;
    }

    @Override // defpackage.wl0
    public CharSequence h(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.Y) ? editTextPreference.f.getString(R.string.not_set) : editTextPreference.Y;
    }

    @Override // defpackage.y9
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.o41
    public Object k(i40 i40Var, float f) {
        switch (this.f) {
            case 2:
                return Float.valueOf(k40.d(i40Var) * f);
            case 3:
                return Integer.valueOf(Math.round(k40.d(i40Var) * f));
            default:
                int iO = i40Var.o();
                if (iO == 1) {
                    return k40.b(i40Var, f);
                }
                if (iO == 3) {
                    return k40.b(i40Var, f);
                }
                if (iO != 7) {
                    throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(ex0.t(iO)));
                }
                PointF pointF = new PointF(((float) i40Var.l()) * f, ((float) i40Var.l()) * f);
                while (i40Var.i()) {
                    i40Var.s();
                }
                return pointF;
        }
    }

    public long n() {
        return SystemClock.elapsedRealtime();
    }

    public d13 p(Looper looper, Handler.Callback callback) {
        return new d13(new Handler(looper, callback));
    }

    public String toString() {
        switch (this.f) {
            case 7:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qm0
    public void i(int i2, Object obj) {
    }
}

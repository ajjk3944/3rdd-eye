package defpackage;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rl implements nf1, gj4 {
    public boolean f;
    public final Object g;
    public final Object h;
    public Object i;

    public rl(Object obj, ao1 ao1Var) {
        this.f = false;
        this.g = obj;
        this.h = ao1Var;
        this.i = null;
    }

    public l92 a() {
        Intent intent = (Intent) this.g;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f);
        ((pz) this.h).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        String strA = pl.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.i) == null) {
                this.i = ol.a();
            }
            ql.a((ActivityOptions) this.i, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.i;
        return new l92(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // defpackage.gj4
    public sn3 e(int i, d02 d02Var, int[] iArr) {
        lj4 lj4Var = (lj4) this.g;
        dj4 dj4Var = (dj4) this.h;
        zi4 zi4Var = new zi4(lj4Var, dj4Var);
        int i2 = ((int[]) this.i)[i];
        vm3 vm3Var = xm3.g;
        ob1.z("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i3 = 0;
        int i4 = 0;
        while (i3 < d02Var.a) {
            int i5 = i;
            d02 d02Var2 = d02Var;
            yi4 yi4Var = new yi4(i5, d02Var2, i3, dj4Var, iArr[i3], this.f, zi4Var);
            int length = objArrCopyOf.length;
            int i6 = i4 + 1;
            int iD = rm3.d(length, i6);
            if (iD > length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i4] = yi4Var;
            i3++;
            i4 = i6;
            i = i5;
            d02Var = d02Var2;
        }
        return xm3.o(objArrCopyOf, i4);
    }

    @Override // defpackage.nf1
    public void s() {
        ((nf1) this.g).s();
        if (!this.f) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.i;
            if (i >= sparseArray.size()) {
                return;
            }
            ((mk1) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // defpackage.nf1
    public void v(cg1 cg1Var) {
        ((nf1) this.g).v(cg1Var);
    }

    @Override // defpackage.nf1
    public jg1 z(int i, int i2) {
        nf1 nf1Var = (nf1) this.g;
        if (i2 != 3) {
            this.f = true;
            return nf1Var.z(i, i2);
        }
        SparseArray sparseArray = (SparseArray) this.i;
        mk1 mk1Var = (mk1) sparseArray.get(i);
        if (mk1Var != null) {
            return mk1Var;
        }
        mk1 mk1Var2 = new mk1(nf1Var.z(i, 3), (jk1) this.h);
        sparseArray.put(i, mk1Var2);
        return mk1Var2;
    }

    public rl(oo1 oo1Var) {
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = oo1Var;
    }

    public /* synthetic */ rl(lj4 lj4Var, dj4 dj4Var, boolean z, int[] iArr) {
        this.g = lj4Var;
        this.h = dj4Var;
        this.f = z;
        this.i = iArr;
    }

    public rl(nf1 nf1Var, jk1 jk1Var) {
        this.g = nf1Var;
        this.h = jk1Var;
        this.i = new SparseArray();
    }

    public rl(Context context, lj4 lj4Var, Boolean bool) {
        AudioManager audioManagerB = context == null ? null : bd2.B(context);
        if (audioManagerB == null || (bool != null && bool.booleanValue())) {
            this.g = null;
            this.f = false;
            this.h = null;
            this.i = null;
            return;
        }
        Spatializer spatializer = audioManagerB.getSpatializer();
        this.g = spatializer;
        this.f = spatializer.getImmersiveAudioLevel() != 0;
        ej4 ej4Var = new ej4(this, lj4Var);
        this.i = ej4Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        Handler handler = new Handler(looperMyLooper);
        this.h = handler;
        spatializer.addOnSpatializerStateChangedListener(new vb1(handler, 4), ej4Var);
    }

    public rl(Context context, String str, l92 l92Var, boolean z) {
        this.g = context;
        this.h = str;
        this.i = l92Var;
        this.f = z;
    }

    public rl() {
        this.g = new Intent("android.intent.action.VIEW");
        this.h = new pz(16);
        this.f = true;
    }

    public rl(mc2 mc2Var) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.g = intent;
        this.h = new pz(16);
        this.f = true;
        if (mc2Var != null) {
            intent.setPackage(((ComponentName) mc2Var.j).getPackageName());
            nl nlVar = (nl) mc2Var.i;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", nlVar);
            intent.putExtras(bundle);
        }
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bu1 implements ws2, ch3, k73 {
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public /* synthetic */ bu1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
        this.l = obj6;
    }

    public static kh4 D(f74 f74Var, xm3 xm3Var, kh4 kh4Var, sw1 sw1Var) {
        oz1 oz1VarK1 = f74Var.K1();
        int iN1 = f74Var.N1();
        Object objF = oz1VarK1.g() ? null : oz1VarK1.f(iN1);
        if (!f74Var.S1() && !oz1VarK1.g()) {
            sw1 sw1VarD = oz1VarK1.d(iN1, sw1Var, false);
            f74Var.Q1();
            String str = v23.a;
            sw1VarD.getClass();
        }
        for (int i = 0; i < xm3Var.size(); i++) {
            kh4 kh4Var2 = (kh4) xm3Var.get(i);
            if (G(kh4Var2, objF, f74Var.S1(), f74Var.d(), f74Var.T1())) {
                return kh4Var2;
            }
        }
        if (xm3Var.isEmpty() && kh4Var != null && G(kh4Var, objF, f74Var.S1(), f74Var.d(), f74Var.T1())) {
            return kh4Var;
        }
        return null;
    }

    public static void F(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        sv1 sv1Var = sv1.f;
        j63 j63Var = sv1Var.a;
        String str2 = sv1Var.d.f;
        j63Var.getClass();
        j63.a(context, str2, bundle, new l92((Object) j63Var, (Object) context, false));
    }

    public static boolean G(kh4 kh4Var, Object obj, boolean z, int i, int i2) {
        Object obj2 = kh4Var.a;
        int i3 = kh4Var.b;
        if (obj2.equals(obj)) {
            return z ? i3 == i && kh4Var.c == i2 : i3 == -1 && kh4Var.e == -1;
        }
        return false;
    }

    public static boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i) {
        int iC = n11.c(context, R.attr.colorControlHighlight);
        int iB = n11.b(context, R.attr.colorButtonNormal);
        int[] iArr = n11.b;
        int[] iArr2 = n11.d;
        int iB2 = hg.b(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, n11.c, n11.f}, new int[]{iB, iB2, hg.b(iC, i), i});
    }

    public static LayerDrawable e(zp0 zp0Var, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = zp0Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = zp0Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void g(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = l6.b;
        }
        drawableMutate.setColorFilter(l6.c(i, mode));
    }

    public q93 A() {
        u93 u93Var = (u93) this.l;
        Object obj = this.g;
        String str = (String) this.h;
        if (str == null) {
            u93Var.getClass();
            str = ((s93) obj).f;
        }
        q93 q93Var = new q93(obj, str, (n70) this.k);
        u93Var.c.P1(new f23(28, q93Var));
        n70 n70Var = (n70) this.i;
        sz2 sz2Var = new sz2(this, q93Var, 9);
        ld2 ld2Var = md2.g;
        n70Var.c(sz2Var, ld2Var);
        q93Var.c(new jq3(q93Var, new wt2(this, q93Var, 3), 0), ld2Var);
        return q93Var;
    }

    public void B(oz1 oz1Var) {
        so1 so1Var = new so1(4);
        if (((xm3) this.h).isEmpty()) {
            C(so1Var, (kh4) this.k, oz1Var);
            if (!Objects.equals((kh4) this.l, (kh4) this.k)) {
                C(so1Var, (kh4) this.l, oz1Var);
            }
            if (!Objects.equals((kh4) this.j, (kh4) this.k) && !Objects.equals((kh4) this.j, (kh4) this.l)) {
                C(so1Var, (kh4) this.j, oz1Var);
            }
        } else {
            for (int i = 0; i < ((xm3) this.h).size(); i++) {
                C(so1Var, (kh4) ((xm3) this.h).get(i), oz1Var);
            }
            if (!((xm3) this.h).contains((kh4) this.j)) {
                C(so1Var, (kh4) this.j, oz1Var);
            }
        }
        this.i = so1Var.u();
    }

    public void C(so1 so1Var, kh4 kh4Var, oz1 oz1Var) {
        if (kh4Var == null) {
            return;
        }
        if (oz1Var.e(kh4Var.a) != -1) {
            so1Var.p(kh4Var, oz1Var);
            return;
        }
        oz1 oz1Var2 = (oz1) ((xn3) this.i).get(kh4Var);
        if (oz1Var2 != null) {
            so1Var.p(kh4Var, oz1Var2);
        }
    }

    public void E() {
        vw1 vw1Var;
        synchronized (this.i) {
            if (((Context) this.k) != null && ((vw1) this.j) == null) {
                kf3 kf3Var = new kf3(15, this);
                of3 of3Var = new of3(11, this);
                synchronized (this) {
                    vw1Var = new vw1((Context) this.k, hg4.C.t.a(), kf3Var, of3Var, 0);
                }
                this.j = vw1Var;
                vw1Var.n();
            }
        }
    }

    @Override // defpackage.eu2
    /* renamed from: a */
    public Object mo18a() {
        switch (this.f) {
            case 3:
                Application application = (Application) ((eu2) this.g).mo18a();
                return new bw1(application, (aa2) ((ls2) this.i).mo18a(), (mo1) ((eu2) this.j).mo18a(), (z52) ((ax0) this.k).f, (vq2) this.l);
            default:
                return p();
        }
    }

    @Override // defpackage.ch3
    public void d() {
        if (((AtomicBoolean) this.l).get()) {
            ((sm2) this.g).C();
        }
    }

    public ColorStateList f(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return ob1.d(context, R.color.abc_tint_edittext);
        }
        if (i == 2131230826) {
            return ob1.d(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return c(context, n11.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return c(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return c(context, n11.c(context, R.attr.colorAccent));
            }
            if (i == 2131230821 || i == R.drawable.abc_spinner_textfield_background_material) {
                return ob1.d(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.h, i)) {
                return n11.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.k, i)) {
                return ob1.d(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.l, i)) {
                return ob1.d(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return ob1.d(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = n11.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = n11.b;
            iArr2[0] = n11.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = n11.e;
            iArr2[1] = n11.c(context, R.attr.colorControlActivated);
            iArr[2] = n11.f;
            iArr2[2] = n11.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = n11.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = n11.e;
            iArr2[1] = n11.c(context, R.attr.colorControlActivated);
            iArr[2] = n11.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    @Override // defpackage.ch3
    public void h() {
        if (((AtomicBoolean) this.l).get()) {
            ((cn2) this.h).a();
            yp2 yp2Var = (yp2) this.i;
            synchronized (yp2Var) {
                yp2Var.P1(sd2.A);
            }
        }
    }

    @Override // defpackage.k73
    public n70 i(lv2 lv2Var, j73 j73Var) {
        synchronized (this) {
            yh2 yh2VarH = j73Var.h((i73) lv2Var.h);
            b73 b73Var = new b73((String) this.j);
            switch (yh2VarH.a) {
                case 0:
                    yh2VarH.d = b73Var;
                    break;
                default:
                    yh2VarH.d = b73Var;
                    break;
            }
            lm2 lm2Var = (lm2) yh2VarH.c();
            lm2Var.d();
            lm2Var.d();
            pc4 pc4Var = lm2Var.d().d;
            if (pc4Var.x != null || pc4Var.C != null) {
                this.k = lm2Var;
                return ((mr2) this.g).w(lv2Var, j73Var, lm2Var);
            }
            l83 l83VarD = lm2Var.d();
            pc4 pc4Var2 = l83VarD.d;
            String str = l83VarD.g;
            vi4 vi4Var = l83VarD.k;
            Executor executor = (Executor) this.l;
            return pu1.O(gq3.r(((xb4) this.h).A(lm2Var)), new s03(this, lv2Var, new a73(j73Var, lv2Var, pc4Var2, str, executor, vi4Var, null), j73Var, lm2Var, 1), executor);
        }
    }

    public String j() {
        String str = (String) tw1.e.c.a(mz1.Ma);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", (Long) this.g);
            jSONObject.put("eventCategory", (String) this.h);
            jSONObject.putOpt("event", (String) this.i);
            jSONObject.putOpt("errorCode", (Integer) this.j);
            jSONObject.putOpt("rewardType", (String) this.k);
            jSONObject.putOpt("rewardAmount", (Integer) this.l);
        } catch (JSONException unused) {
            gi2.i0("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        int length = String.valueOf(str).length();
        return ex0.m(new StringBuilder(String.valueOf(string).length() + length + 14 + 2), str, "(\"h5adsEvent\",", string, ");");
    }

    public void k(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.k73
    public Object l() {
        lm2 lm2Var;
        synchronized (this) {
            lm2Var = (lm2) this.k;
        }
        return lm2Var;
    }

    @Override // defpackage.ch3
    public synchronized void m(View view) {
        if (((AtomicBoolean) this.l).compareAndSet(false, true)) {
            ((xj2) this.k).D0();
            ((vp2) this.j).U1(view);
        }
    }

    public void n(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.i) {
            try {
                if (((Context) this.k) != null) {
                    return;
                }
                this.k = context.getApplicationContext();
                iz1 iz1Var = mz1.F4;
                tw1 tw1Var = tw1.e;
                if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                    E();
                } else {
                    if (((Boolean) tw1Var.c.a(mz1.E4)).booleanValue()) {
                        hg4.C.g.f(new qw1(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean o(pc4 pc4Var, String str, m54 m54Var, y23 y23Var) {
        t83 t83Var = (t83) this.j;
        s23 s23Var = (s23) t83Var.h;
        th2 th2Var = (th2) this.h;
        hg4 hg4Var = hg4.C;
        lf4 lf4Var = hg4Var.c;
        Context context = (Context) this.i;
        if (lf4.h(context) && pc4Var.x == null) {
            gi2.Z("Failed to load the ad because app ID is missing.");
            final int i = 1;
            th2Var.b().execute(new Runnable(this) { // from class: a33
                public final /* synthetic */ bu1 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            ((x23) ((t83) this.g.j).i).d0(zt0.Q(6, null, null));
                            break;
                        default:
                            ((x23) ((t83) this.g.j).i).d0(zt0.Q(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        if (str == null) {
            gi2.Z("Ad unit ID should not be null for NativeAdLoader.");
            final int i2 = 0;
            th2Var.b().execute(new Runnable(this) { // from class: a33
                public final /* synthetic */ bu1 g;

                {
                    this.g = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            ((x23) ((t83) this.g.j).i).d0(zt0.Q(6, null, null));
                            break;
                        default:
                            ((x23) ((t83) this.g.j).i).d0(zt0.Q(4, null, null));
                            break;
                    }
                }
            });
            return false;
        }
        boolean z = pc4Var.k;
        yc0.v(context, z);
        if (((Boolean) tw1.e.c.a(mz1.I9)).booleanValue() && z) {
            ((zw2) th2Var.z.d()).b(true);
        }
        int i3 = ((z23) m54Var).g;
        hg4Var.k.getClass();
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        Bundle bundleC = bd2.C(new Pair("api-call", lValueOf), new Pair("dynamite-enter", lValueOf));
        k83 k83Var = (k83) this.g;
        k83Var.a = pc4Var;
        k83Var.t = bundleC;
        k83Var.m = i3;
        l83 l83VarA = k83Var.a();
        aa3 aa3VarG = aa3.g(context, qb1.N(l83VarA), 8, pc4Var);
        wi2 wi2Var = l83VarA.o;
        if (wi2Var != null) {
            s23Var.p(wi2Var);
        }
        th2 th2Var2 = th2Var.b;
        mm2 mm2Var = new mm2();
        mm2Var.a = context;
        mm2Var.b = l83VarA;
        mm2 mm2Var2 = new mm2(mm2Var);
        ep2 ep2Var = new ep2();
        ep2Var.b(s23Var, th2Var.b());
        fp2 fp2Var = new fp2(ep2Var);
        byte b = 0;
        vq2 vq2Var = new vq2((yr2) t83Var.g, s23Var.l(), b);
        da3 da3Var = null;
        sh2 sh2Var = new sh2(th2Var2, new ug0(19, da3Var), vq2Var, new tv2(0, b), fp2Var, mm2Var2, new f23(25), null, null);
        if (((Boolean) n02.c.w()).booleanValue()) {
            da3Var = (da3) sh2Var.e.d();
            da3Var.i(8);
            da3Var.c(pc4Var.u);
            da3Var.d(pc4Var.r);
        }
        ((v83) th2Var.L.d()).a(1);
        ld2 ld2Var = md2.a;
        i41.M(ld2Var);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) th2Var.d.d();
        nl2 nl2Var = (nl2) sh2Var.n.d();
        q93 q93VarC = nl2Var.c(nl2Var.b());
        kl2 kl2Var = new kl2(ld2Var, scheduledExecutorService, q93VarC);
        this.l = kl2Var;
        q93VarC.c(new jq3(q93VarC, new vq2((Object) kl2Var, (Object) new g4(this, (f23) y23Var, da3Var, aa3VarG, sh2Var, 12, false), 29, false), 0), ld2Var);
        return true;
    }

    public gi1 p() {
        Application application = (Application) ((eu2) this.g).mo18a();
        aa2 aa2Var = (aa2) ((ls2) this.h).mo18a();
        Handler handler = ok2.a;
        pu1.s(handler);
        dk2 dk2Var = ok2.b;
        pu1.s(dk2Var);
        return new gi1(application, aa2Var, handler, dk2Var, (lx2) ((eu2) this.i).mo18a(), ((xn1) ((eu2) this.j)).mo18a(), (bw1) ((zs1) this.k).mo18a(), (mo1) ((eu2) this.l).mo18a());
    }

    public bu1 q(o93 o93Var) {
        return s(new u42(14, o93Var));
    }

    public void r(int i) throws InvalidAlgorithmParameterException {
        if (i < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
        }
        this.h = Integer.valueOf(i);
    }

    public bu1 s(yp3 yp3Var) {
        u93 u93Var = (u93) this.l;
        pq3 pq3Var = u93Var.a;
        return new bu1(u93Var, this.g, (String) this.h, (n70) this.i, (List) this.j, pu1.O((n70) this.k, yp3Var, pq3Var));
    }

    public uw1 t(ww1 ww1Var) {
        synchronized (this.i) {
            if (((xw1) this.l) == null) {
                return new uw1();
            }
            try {
                if (((vw1) this.j).z()) {
                    xw1 xw1Var = (xw1) this.l;
                    Parcel parcelU = xw1Var.U();
                    iv1.c(parcelU, ww1Var);
                    Parcel parcelY = xw1Var.Y(parcelU, 2);
                    uw1 uw1Var = (uw1) iv1.b(parcelY, uw1.CREATOR);
                    parcelY.recycle();
                    return uw1Var;
                }
                xw1 xw1Var2 = (xw1) this.l;
                Parcel parcelU2 = xw1Var2.U();
                iv1.c(parcelU2, ww1Var);
                Parcel parcelY2 = xw1Var2.Y(parcelU2, 1);
                uw1 uw1Var2 = (uw1) iv1.b(parcelY2, uw1.CREATOR);
                parcelY2.recycle();
                return uw1Var2;
            } catch (RemoteException e) {
                gi2.c0("Unable to call into cache service.", e);
                return new uw1();
            }
        }
    }

    public void u(int i) throws GeneralSecurityException {
        if (i < 12 || i > 16) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
        }
        this.i = Integer.valueOf(i);
    }

    public void v(int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
        }
        this.j = Integer.valueOf(i);
    }

    public n70 w(e93 e93Var, lv2 lv2Var) {
        lm2 lm2Var = e93Var.a;
        this.k = lm2Var;
        if (e93Var.c != null) {
            if (lm2Var.h() != null) {
                e93Var.c.e.p(e93Var.a.h());
            }
            return pu1.r(e93Var.c);
        }
        lm2Var.a().g = e93Var.b;
        return ((mr2) this.g).w(lv2Var, null, e93Var.a);
    }

    public ds3 x() throws GeneralSecurityException {
        if (((Integer) this.g) == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (((Integer) this.h) == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (((Integer) this.i) == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Integer num = (Integer) this.j;
        if (num == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((bs3) this.k) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        int iIntValue = num.intValue();
        bs3 bs3Var = (bs3) this.k;
        if (bs3Var == bs3.h) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (bs3Var == bs3.i) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (bs3Var == bs3.j) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (bs3Var == bs3.k) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else {
            if (bs3Var != bs3.l) {
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num));
            }
        }
        return new ds3(((Integer) this.g).intValue(), ((Integer) this.h).intValue(), ((Integer) this.i).intValue(), ((Integer) this.j).intValue(), (cs3) this.l, (bs3) this.k);
    }

    public /* synthetic */ void y() {
        synchronized (this.i) {
            try {
                vw1 vw1Var = (vw1) this.j;
                if (vw1Var == null) {
                    return;
                }
                if (vw1Var.a() || ((vw1) this.j).f()) {
                    ((vw1) this.j).k();
                }
                this.j = null;
                this.l = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bu1 z(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        u93 u93Var = (u93) this.l;
        ScheduledExecutorService scheduledExecutorService = u93Var.b;
        return new bu1(u93Var, this.g, (String) this.h, (n70) this.i, (List) this.j, pu1.N((n70) this.k, j, timeUnit, scheduledExecutorService));
    }

    public /* synthetic */ bu1(String str) {
        this.f = 6;
        this.h = str;
    }

    public bu1(mr2 mr2Var, xb4 xb4Var, pj4 pj4Var, String str, ld2 ld2Var) {
        this.f = 9;
        this.g = mr2Var;
        this.h = xb4Var;
        this.i = pj4Var;
        this.j = str;
        this.l = ld2Var;
    }

    public bu1(Context context, String str) {
        String strConcat;
        this.f = 13;
        this.g = context.getApplicationContext();
        this.h = str;
        this.i = new TreeMap();
        String packageName = context.getPackageName();
        try {
            String str2 = za1.a(context).b(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            gi2.c0("Unable to get package version name for reporting", e);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.l = strConcat;
    }

    public bu1(sw1 sw1Var) {
        this.f = 12;
        this.g = sw1Var;
        vm3 vm3Var = xm3.g;
        this.h = sn3.j;
        this.i = xn3.l;
    }

    public bu1(th2 th2Var, Context context, t83 t83Var, k83 k83Var) {
        this.f = 8;
        this.h = th2Var;
        this.i = context;
        this.j = t83Var;
        this.g = k83Var;
        this.k = th2Var.c();
        k83Var.r = (s23) t83Var.h;
    }

    public bu1(sm2 sm2Var, cn2 cn2Var, yp2 yp2Var, vp2 vp2Var, xj2 xj2Var) {
        this.f = 7;
        this.l = new AtomicBoolean(false);
        this.g = sm2Var;
        this.h = cn2Var;
        this.i = yp2Var;
        this.j = vp2Var;
        this.k = xj2Var;
    }

    public bu1(u93 u93Var, Object obj, String str, n70 n70Var, List list, n70 n70Var2) {
        this.f = 10;
        Objects.requireNonNull(u93Var);
        this.l = u93Var;
        this.g = obj;
        this.h = str;
        this.i = n70Var;
        this.j = list;
        this.k = n70Var2;
    }

    public bu1(Set set, String str, String str2) {
        this.f = 2;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.g = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.i = str;
        this.j = str2;
        this.k = zv0.b;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.h = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw ex0.e(it);
    }

    public bu1(int i) {
        this.f = i;
        switch (i) {
            case 4:
                this.g = null;
                this.h = new fu1(3, this);
                this.i = new Object();
                break;
            case 11:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                this.k = null;
                this.l = cs3.j;
                break;
            default:
                this.g = new int[]{2131230836, 2131230834, 2131230760};
                this.h = new int[]{2131230784, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.i = new int[]{2131230833, 2131230835, 2131230777, R.drawable.abc_text_cursor_material, 2131230830, 2131230831, 2131230832};
                this.j = new int[]{2131230809, R.drawable.abc_cab_background_internal_bg, 2131230808};
                this.k = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.l = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
        }
    }
}

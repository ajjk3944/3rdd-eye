package p1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.lifecycle.EnumC0292n;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A8;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C1273hh;
import com.google.android.gms.internal.ads.C1649oh;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC2084wl;
import h0.C2351a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import l1.k;
import o1.InterfaceC2753a;
import p2.j;
import q0.C2794g;
import q0.v;
import q2.C2841s;
import q2.InterfaceC2806a;
import q4.C2857a;
import q5.i;
import r1.h;
import r1.r;
import r1.s;
import r1.x;
import r1.z;
import s2.InterfaceC2891a;
import s2.InterfaceC2893c;
import t.AbstractC2899a;
import t.AbstractC2901c;
import t.C2900b;
import t2.AbstractC2907C;
import t2.C2911G;
import u1.o;
import x2.InterfaceC2989b;
import x2.InterfaceC2990c;
import x2.InterfaceC2991d;

/* loaded from: classes.dex */
public class e implements I1.a, s, o, InterfaceC2989b, InterfaceC2990c, InterfaceC2991d, k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22743a;

    public /* synthetic */ e(int i) {
        this.f22743a = i;
    }

    public static C2794g a(Context context, v vVar, Bundle bundle, EnumC0292n enumC0292n, q0.o oVar) {
        String string = UUID.randomUUID().toString();
        i.d(string, "randomUUID().toString()");
        i.e(vVar, "destination");
        i.e(enumC0292n, "hostLifecycleState");
        return new C2794g(context, vVar, bundle, enumC0292n, oVar, string, null);
    }

    public static CookieManager g() {
        j jVar = j.f22785C;
        C2911G c2911g = jVar.f22790c;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                u2.k.f("Failed to obtain CookieManager.", th);
                jVar.f22795h.g("ApiLevelUtil.getCookieManager", th);
            }
        }
        return null;
    }

    public static final void i(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z6, C0784Vn c0784Vn) {
        if (adOverlayInfoParcel.f6872k == 4 && adOverlayInfoParcel.f6865c == null) {
            InterfaceC2806a interfaceC2806a = adOverlayInfoParcel.f6864b;
            if (interfaceC2806a != null) {
                interfaceC2806a.onAdClicked();
            }
            InterfaceC2084wl interfaceC2084wl = adOverlayInfoParcel.f6859I;
            if (interfaceC2084wl != null) {
                interfaceC2084wl.L();
            }
            Activity activityH = adOverlayInfoParcel.f6866d.h();
            s2.e eVar = adOverlayInfoParcel.f6863a;
            Context context2 = (eVar == null || !eVar.f23480j || activityH == null) ? context : activityH;
            e eVar2 = j.f22785C.f22788a;
            m(context2, eVar, adOverlayInfoParcel.i, eVar != null ? eVar.i : null, c0784Vn, adOverlayInfoParcel.f6855E);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f6874m.f23787d);
        intent.putExtra("shouldCallOnOverlayOpened", z6);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.qe)).booleanValue()) {
            C2911G c2911g = j.f22785C.f22790c;
            C2911G.w(context, intent, c0784Vn, adOverlayInfoParcel.f6855E);
        } else {
            C2911G c2911g2 = j.f22785C.f22790c;
            C2911G.u(context, intent);
        }
    }

    public static final boolean j(Context context, Intent intent, InterfaceC2893c interfaceC2893c, InterfaceC2891a interfaceC2891a, boolean z6, C0784Vn c0784Vn, String str, Bundle bundle) {
        int iL;
        if (z6) {
            try {
                iL = j.f22785C.f22790c.L(context, intent.getData(), bundle);
                if (interfaceC2893c != null) {
                    interfaceC2893c.i();
                }
            } catch (ActivityNotFoundException e6) {
                u2.k.h(e6.getMessage());
                iL = 6;
            }
            if (interfaceC2891a != null) {
                interfaceC2891a.h(iL);
            }
            return iL == 5;
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 21);
            sb.append("Launching an intent: ");
            sb.append(uri);
            AbstractC2907C.m(sb.toString());
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.qe)).booleanValue()) {
                C2911G c2911g = j.f22785C.f22790c;
                C2911G.w(context, intent, c0784Vn, str);
            } else {
                C2911G c2911g2 = j.f22785C.f22790c;
                C2911G.u(context, intent);
            }
            if (interfaceC2893c != null) {
                interfaceC2893c.i();
            }
            if (interfaceC2891a != null) {
                interfaceC2891a.g0(true);
            }
            return true;
        } catch (ActivityNotFoundException e7) {
            u2.k.h(e7.getMessage());
            if (interfaceC2891a != null) {
                interfaceC2891a.g0(false);
            }
            return false;
        }
    }

    public static final boolean m(Context context, s2.e eVar, InterfaceC2893c interfaceC2893c, InterfaceC2891a interfaceC2891a, C0784Vn c0784Vn, String str) throws NumberFormatException {
        int i = 0;
        if (eVar == null) {
            u2.k.h("No intent data for launcher overlay.");
            return false;
        }
        H9.a(context);
        Intent intent = eVar.f23479h;
        if (intent != null) {
            return j(context, intent, interfaceC2893c, interfaceC2891a, eVar.f23480j, c0784Vn, str, eVar.f23481k);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f23473b;
        if (TextUtils.isEmpty(str2)) {
            u2.k.h("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f23474c;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f23475d;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f23476e;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                u2.k.h("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = eVar.f23477f;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                u2.k.h("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        E9 e9 = H9.f8795n5;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c2841s.f23270c.a(H9.f8788m5)).booleanValue()) {
                C2911G c2911g = j.f22785C.f22790c;
                C2911G.N(context, intent2);
            }
        }
        return j(context, intent2, interfaceC2893c, interfaceC2891a, eVar.f23480j, c0784Vn, str, eVar.f23481k);
    }

    @Override // r1.s
    public r d(x xVar) {
        return new z(xVar.c(h.class, InputStream.class), 1);
    }

    public C2857a e(Context context) {
        C2857a c2857a;
        C2857a c2857a2 = C2857a.f23279c;
        if (c2857a2 != null) {
            return c2857a2;
        }
        synchronized (this) {
            c2857a = C2857a.f23279c;
            if (c2857a == null) {
                c2857a = new C2857a(context);
                C2857a.f23279c = c2857a;
            }
        }
        return c2857a;
    }

    public void f(C2351a c2351a, float f2) {
        C2900b c2900b = (C2900b) ((Drawable) c2351a.f20441b);
        AbstractC2899a abstractC2899a = (AbstractC2899a) c2351a.f20442c;
        boolean useCompatPadding = abstractC2899a.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC2899a.getPreventCornerOverlap();
        if (f2 != c2900b.f23514e || c2900b.f23515f != useCompatPadding || c2900b.f23516g != preventCornerOverlap) {
            c2900b.f23514e = f2;
            c2900b.f23515f = useCompatPadding;
            c2900b.f23516g = preventCornerOverlap;
            c2900b.b(null);
            c2900b.invalidateSelf();
        }
        if (!abstractC2899a.getUseCompatPadding()) {
            c2351a.R(0, 0, 0, 0);
            return;
        }
        C2900b c2900b2 = (C2900b) ((Drawable) c2351a.f20441b);
        float f5 = c2900b2.f23514e;
        float f6 = c2900b2.f23510a;
        int iCeil = (int) Math.ceil(AbstractC2901c.a(f5, f6, abstractC2899a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC2901c.b(f5, f6, abstractC2899a.getPreventCornerOverlap()));
        c2351a.R(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // I1.a
    public Object h() {
        try {
            return new f(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e6) {
            throw new RuntimeException(e6);
        }
    }

    public C1649oh k(C1273hh c1273hh, A8 a8, boolean z6, BinderC0718Rp binderC0718Rp) {
        return new C1649oh(c1273hh, a8, z6, binderC0718Rp);
    }

    @Override // l1.InterfaceC2636b
    public boolean l(Object obj, File file, l1.h hVar) throws Throwable {
        try {
            H1.b.d(((y1.f) ((y1.b) ((n1.z) obj).get()).f24213a.f2634b).f24230a.f21764d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e6) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e6);
            return false;
        }
    }

    public boolean n(Activity activity, Configuration configuration) {
        return false;
    }

    @Override // l1.k
    public int o(l1.h hVar) {
        return 1;
    }

    public int p(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean r(Context context) {
        return false;
    }

    public Intent s(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public int u(AudioManager audioManager) {
        return 0;
    }

    public int v(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    @Override // u1.o
    public void c() {
    }

    public void q(Context context) {
    }

    public void t(Activity activity) {
    }

    @Override // u1.o
    public void b(Bitmap bitmap, InterfaceC2753a interfaceC2753a) {
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sq0 implements ti0, d71, m2, pm0, h81, zb3, qn1, dp2, oy2, o93, ch3, l34 {
    public static sq0 h;
    public static final tq0 i = new tq0(0, 0, 0, false, false);
    public static final Object j = new Object();
    public static volatile sq0 k;
    public final /* synthetic */ int f;
    public Object g;

    public /* synthetic */ sq0(int i2) {
        this.f = i2;
    }

    public static synchronized sq0 k() {
        try {
            if (h == null) {
                h = new sq0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    public static sq0 n() {
        if (k == null) {
            synchronized (j) {
                try {
                    if (k == null) {
                        k = new sq0();
                    }
                } finally {
                }
            }
        }
        sq0 sq0Var = k;
        ou1.j(sq0Var);
        return sq0Var;
    }

    public static sq0 p(yk3 yk3Var) {
        return new sq0(21, new of3(29, yk3Var));
    }

    @Override // defpackage.ti0
    public o91 B(View view, o91 o91Var) {
        AppBarLayout appBarLayout = (AppBarLayout) this.g;
        o91 o91Var2 = appBarLayout.getFitsSystemWindows() ? o91Var : null;
        if (!Objects.equals(appBarLayout.l, o91Var2)) {
            appBarLayout.l = o91Var2;
            appBarLayout.setWillNotDraw(!(appBarLayout.B != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return o91Var;
    }

    @Override // defpackage.zb3
    public /* synthetic */ void S(long j2, kz2 kz2Var) {
        zt0.B(j2, kz2Var, ((jj1) this.g).I);
    }

    @Override // defpackage.qn1
    public long a() {
        return ((ByteBuffer) this.g).capacity();
    }

    @Override // defpackage.h81
    public String[] b() {
        return ((WebViewProviderFactoryBoundaryInterface) this.g).getSupportedFeatures();
    }

    @Override // defpackage.o93
    public /* synthetic */ Object c(Object obj) {
        jz2.f((SQLiteDatabase) obj, (ug4) this.g);
        return null;
    }

    @Override // defpackage.h81
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) yb.e(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).createWebView(webView));
    }

    @Override // defpackage.ch3
    public synchronized void d() {
        ch3 ch3Var = (ch3) this.g;
        if (ch3Var != null) {
            ch3Var.d();
        }
    }

    @Override // defpackage.oy2
    public n70 e(fa2 fa2Var) {
        iy2 iy2Var = (iy2) this.g;
        synchronized (iy2Var.g) {
            try {
                int i2 = iy2Var.m;
                if (i2 != 1 && i2 != 2) {
                    return pu1.B(new my2(2));
                }
                if (iy2Var.h) {
                    return iy2Var.f;
                }
                iy2Var.m = 2;
                iy2Var.h = true;
                iy2Var.j = fa2Var;
                iy2Var.k.n();
                pd2 pd2Var = iy2Var.f;
                pd2Var.f.c(new gy2(iy2Var, 1), md2.g);
                return pd2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m2
    public void f(Object obj) {
        Map map = (Map) obj;
        xw xwVar = (xw) this.g;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
        }
        uw uwVar = (uw) xwVar.C.pollFirst();
        if (uwVar == null) {
            return;
        }
        xwVar.c.j(uwVar.f);
    }

    @Override // defpackage.qn1
    public void g(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = (ByteBuffer) this.g;
        synchronized (byteBuffer) {
            int i3 = (int) j2;
            byteBuffer.position(i3);
            byteBuffer.limit(i3 + i2);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // defpackage.h81
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) yb.e(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).getProfileStore());
    }

    @Override // defpackage.h81
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) yb.e(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.g).getStatics());
    }

    @Override // defpackage.ch3
    public synchronized void h() {
        ch3 ch3Var = (ch3) this.g;
        if (ch3Var != null) {
            ch3Var.h();
        }
    }

    @Override // defpackage.d71
    public o91 i(View view, o91 o91Var, e71 e71Var) {
        boolean z;
        BottomAppBar bottomAppBar = (BottomAppBar) this.g;
        if (bottomAppBar.o0) {
            bottomAppBar.u0 = o91Var.a();
        }
        boolean z2 = false;
        if (bottomAppBar.p0) {
            z = bottomAppBar.w0 != o91Var.b();
            bottomAppBar.w0 = o91Var.b();
        } else {
            z = false;
        }
        if (bottomAppBar.q0) {
            boolean z3 = bottomAppBar.v0 != o91Var.c();
            bottomAppBar.v0 = o91Var.c();
            z2 = z3;
        }
        if (!z && !z2) {
            return o91Var;
        }
        AnimatorSet animatorSet = bottomAppBar.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.e0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.H();
        bottomAppBar.G();
        return o91Var;
    }

    public ck j(ck ckVar) {
        return ckVar instanceof fp0 ? ckVar : new i3(-((nc0) this.g).j(), ckVar);
    }

    @Override // defpackage.l34
    public Object l(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            Provider provider = Security.getProvider(strArr[i3]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            try {
                return ((o34) this.g).d(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    @Override // defpackage.ch3
    public synchronized void m(View view) {
        ch3 ch3Var = (ch3) this.g;
        if (ch3Var != null) {
            ch3Var.m(view);
        }
    }

    public void o(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
        if ((serviceConnection instanceof ud4) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public void q(int i2, long j2, qb3 qb3Var, String str) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("action", "start_preload");
        lv2VarA.k("sp_ts", Long.toString(j2));
        lv2VarA.k("ad_format", qb3Var.a());
        lv2VarA.k("ad_unit_id", qb3Var.a);
        lv2VarA.k("pid", qb3Var.c);
        lv2VarA.k("max_ads", Integer.toString(i2));
        lv2VarA.k("pv", str);
        lv2VarA.m();
    }

    public void r(EnumMap enumMap, long j2) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("action", "start_preload");
        lv2VarA.k("sp_ts", Long.toString(j2));
        lv2VarA.k("pv", "1");
        for (s2 s2Var : enumMap.keySet()) {
            String strValueOf = String.valueOf(s2Var.name().toLowerCase(Locale.ENGLISH));
            lv2VarA.k(strValueOf.concat("_count"), Integer.toString(((Integer) enumMap.get(s2Var)).intValue()));
        }
        lv2VarA.m();
    }

    public boolean s(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((za1.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof ud4) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    public boolean t(Intent intent) {
        ou1.k(intent, "Intent can not be null");
        return !((Context) this.g).getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public void u(int i2, int i3, long j2, Long l, String str, qb3 qb3Var, String str2) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("plaac_ts", Long.toString(j2));
        lv2VarA.k("max_ads", Integer.toString(i2));
        lv2VarA.k("cache_size", Integer.toString(i3));
        lv2VarA.k("action", "is_ad_available");
        if (qb3Var != null) {
            lv2VarA.k("ad_unit_id", qb3Var.a);
            lv2VarA.k("pid", qb3Var.c);
            lv2VarA.k("ad_format", qb3Var.a());
        }
        if (l != null) {
            lv2VarA.k("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            lv2VarA.k("gqi", str);
        }
        lv2VarA.k("pv", str2);
        lv2VarA.m();
    }

    public List v(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itD = ((kl3) this.g).d(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            jl3 jl3Var = (jl3) itD;
            if (!jl3Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) jl3Var.next());
        }
    }

    public void w(long j2, int i2, int i3, String str, qb3 qb3Var, String str2) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("ppla_ts", Long.toString(j2));
        lv2VarA.k("ad_format", qb3Var.a());
        lv2VarA.k("ad_unit_id", qb3Var.a);
        lv2VarA.k("pid", qb3Var.c);
        lv2VarA.k("max_ads", Integer.toString(i2));
        lv2VarA.k("cache_size", Integer.toString(i3));
        lv2VarA.k("action", "poll_ad");
        if (str != null) {
            lv2VarA.k("gqi", str);
        }
        lv2VarA.k("pv", str2);
        lv2VarA.m();
    }

    public void x(long j2, qb3 qb3Var, nx2 nx2Var, int i2, int i3, String str) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("action", "pftla");
        lv2VarA.k("pftlat_ts", Long.toString(j2));
        lv2VarA.k("pftlaec", Integer.toString(nx2Var.f));
        lv2VarA.k("ad_format", qb3Var.a());
        lv2VarA.k("max_ads", Integer.toString(i2));
        lv2VarA.k("cache_size", Integer.toString(i3));
        lv2VarA.k("ad_unit_id", qb3Var.a);
        lv2VarA.k("pid", qb3Var.c);
        lv2VarA.k("pv", str);
        lv2VarA.m();
    }

    public void y(String str, long j2, String str2, String str3, s2 s2Var, int i2, int i3, int i4) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k("action", str);
        lv2VarA.k("pat", Long.toString(j2));
        lv2VarA.k("ad_format", s2Var.name().toLowerCase(Locale.ENGLISH));
        lv2VarA.k("max_ads", Integer.toString(i2));
        lv2VarA.k("cache_size", Integer.toString(i3));
        lv2VarA.k("pas", Integer.toString(i4));
        lv2VarA.k("pv", "2");
        lv2VarA.k("ad_unit_id", str3);
        lv2VarA.k("pid", str2);
        lv2VarA.m();
    }

    public void z(String str, String str2, long j2, int i2, int i3, String str3, qb3 qb3Var, String str4) {
        lv2 lv2VarA = ((mv2) this.g).a();
        lv2VarA.k(str2, Long.toString(j2));
        if (qb3Var != null) {
            lv2VarA.k("ad_unit_id", qb3Var.a);
            lv2VarA.k("ad_format", qb3Var.a());
            lv2VarA.k("pid", qb3Var.c);
        }
        lv2VarA.k("action", str);
        if (str3 != null) {
            lv2VarA.k("gqi", str3);
        }
        if (i2 >= 0) {
            lv2VarA.k("max_ads", Integer.toString(i2));
        }
        if (i3 >= 0) {
            lv2VarA.k("cache_size", Integer.toString(i3));
        }
        lv2VarA.k("pv", str4);
        lv2VarA.m();
    }

    public /* synthetic */ sq0(int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public /* synthetic */ void mo14c(Object obj) {
        switch (this.f) {
            case 14:
                ((bn2) obj).s((nx2) this.g);
                break;
            default:
                ((l42) obj).T((ta2) this.g);
                break;
        }
    }

    public sq0(th2 th2Var) {
        this.f = 13;
        this.g = new ic2((ga4) th2Var.g, (ga4) th2Var.R, (ga4) new ri2(th2Var.S, 18), (ga4) th2Var.T, (ga4) th2Var.t, 9);
    }

    public sq0() {
        this.f = 1;
        this.g = new ConcurrentHashMap();
    }

    public sq0(Context context) {
        this.f = 11;
        ou1.k(context, "Context can not be null");
        this.g = context;
    }

    public sq0(ByteBuffer byteBuffer) {
        this.f = 10;
        this.g = byteBuffer.slice();
    }

    public sq0(x12 x12Var) {
        this.f = 12;
        this.g = new ArrayList();
        try {
            x12Var.d();
        } catch (RemoteException e) {
            gi2.c0("", e);
        }
        try {
            ArrayList arrayListH = x12Var.h();
            int size = arrayListH.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListH.get(i2);
                i2++;
                b22 b22VarB3 = obj instanceof IBinder ? p12.B3((IBinder) obj) : null;
                if (b22VarB3 != null) {
                    ((ArrayList) this.g).add(new l92(b22VarB3));
                }
            }
        } catch (RemoteException e2) {
            gi2.c0("", e2);
        }
    }
}

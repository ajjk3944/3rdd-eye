package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.bs0;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.dh;
import com.google.android.gms.internal.ads.eh;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.pt;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.yr0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i4 implements p81 {

    /* renamed from: e, reason: collision with root package name */
    public static i4 f19779e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19780a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19781b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19782c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19783d;

    public i4(int i4) {
        this.f19780a = i4;
        switch (i4) {
            case 2:
                this.f19782c = new Object();
                this.f19783d = null;
                this.f19781b = false;
                break;
            case 5:
                this.f19782c = Collections.newSetFromMap(new WeakHashMap());
                this.f19783d = new HashSet();
                break;
            default:
                this.f19781b = false;
                this.f19782c = null;
                this.f19783d = null;
                break;
        }
    }

    public static i4 c(Context context) {
        i4 i4Var;
        synchronized (i4.class) {
            try {
                if (f19779e == null) {
                    f19779e = a.a.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new i4(context) : new i4(0);
                }
                i4 i4Var2 = f19779e;
                if (i4Var2 != null && ((h4) i4Var2.f19783d) != null && !i4Var2.f19781b) {
                    try {
                        context.getContentResolver().registerContentObserver(y3.f20044a, true, (h4) f19779e.f19783d);
                        i4 i4Var3 = f19779e;
                        i4Var3.getClass();
                        i4Var3.f19781b = true;
                    } catch (SecurityException e2) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                    }
                }
                i4Var = f19779e;
                i4Var.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i4Var;
    }

    public static synchronized void i() {
        Context context;
        try {
            i4 i4Var = f19779e;
            if (i4Var != null && (context = (Context) i4Var.f19782c) != null && ((h4) i4Var.f19783d) != null && i4Var.f19781b) {
                context.getContentResolver().unregisterContentObserver((h4) f19779e.f19783d);
            }
            f19779e = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((yb.i) this.f19783d).f37516b;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i4);
            if (c2.h0.d(((c2.r) obj).f2674a, j)) {
                break;
            }
            i4++;
        }
        c2.r rVar = (c2.r) obj;
        if (rVar != null) {
            return rVar.f2680h;
        }
        return false;
    }

    public boolean b(p8.c cVar) {
        boolean z3 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f19782c).remove(cVar);
        if (!((HashSet) this.f19783d).remove(cVar) && !zRemove) {
            z3 = false;
        }
        if (z3) {
            cVar.clear();
        }
        return z3;
    }

    public void d(Context context) {
        synchronized (this.f19782c) {
            try {
                if (!this.f19781b) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        za.i.h("Can not cast Context to Application");
                        return;
                    }
                    if (((dh) this.f19783d) == null) {
                        this.f19783d = new dh();
                    }
                    dh dhVar = (dh) this.f19783d;
                    if (!dhVar.f10480i) {
                        application.registerActivityLifecycleCallbacks(dhVar);
                        if (context instanceof Activity) {
                            dhVar.d((Activity) context);
                        }
                        dhVar.f10474b = application;
                        dhVar.j = ((Long) va.s.f36163e.f36166c.a(sk.f16300r1)).longValue();
                        dhVar.f10480i = true;
                    }
                    this.f19781b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String e(String str) {
        Object objA;
        Context context = (Context) this.f19782c;
        if (context != null && (!c4.a() || c4.b(context))) {
            try {
                try {
                    t tVar = new t(this, str);
                    try {
                        objA = tVar.a();
                    } catch (SecurityException unused) {
                        long jClearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            objA = tVar.a();
                        } finally {
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    }
                    return (String) objA;
                } catch (IllegalStateException e2) {
                    e = e2;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                } catch (NullPointerException e10) {
                    e = e10;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            } catch (SecurityException e11) {
                e = e11;
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                return null;
            }
        }
        return null;
    }

    public void f(eh ehVar) {
        synchronized (this.f19782c) {
            try {
                if (((dh) this.f19783d) == null) {
                    this.f19783d = new dh();
                }
                ((dh) this.f19783d).a(ehVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(eh ehVar) {
        synchronized (this.f19782c) {
            try {
                dh dhVar = (dh) this.f19783d;
                if (dhVar == null) {
                    return;
                }
                dhVar.b(ehVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        switch (this.f19780a) {
            case 3:
                yr0 yr0Var = (yr0) this.f19783d;
                yr0Var.c(true);
                bs0 bs0Var = (bs0) this.f19782c;
                bs0Var.a(yr0Var);
                if (this.f19781b) {
                    bs0Var.h();
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj;
                try {
                    nt ntVar = (nt) ((pt) this.f19782c);
                    Parcel parcelT = ntVar.T();
                    parcelT.writeTypedList(arrayList);
                    ntVar.g1(parcelT, 1);
                    fb.h hVar = (fb.h) this.f19783d;
                    boolean z3 = hVar.f23922n;
                    ct0 ct0Var = hVar.f23921m;
                    if (!z3 && !this.f19781b) {
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        Uri uri = (Uri) obj2;
                        if (fb.h.l4(uri, hVar.f23934z, hVar.A)) {
                            ct0Var.b(fb.h.o4(uri, hVar.f23931w, "1").toString(), null, null, null);
                        } else {
                            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16212l8)).booleanValue()) {
                                ct0Var.b(uri.toString(), null, null, null);
                            }
                        }
                    }
                    break;
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                }
                break;
        }
    }

    public Activity j() {
        synchronized (this.f19782c) {
            try {
                dh dhVar = (dh) this.f19783d;
                if (dhVar == null) {
                    return null;
                }
                return dhVar.f10473a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Application k() {
        synchronized (this.f19782c) {
            try {
                dh dhVar = (dh) this.f19783d;
                if (dhVar == null) {
                    return null;
                }
                return dhVar.f10474b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean l() {
        synchronized (this.f19782c) {
            try {
                dh dhVar = (dh) this.f19783d;
                if (dhVar == null) {
                    return false;
                }
                return dhVar.f10476d.get();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        switch (this.f19780a) {
            case 3:
                yr0 yr0Var = (yr0) this.f19783d;
                if (yr0Var.a()) {
                    bs0 bs0Var = (bs0) this.f19782c;
                    yr0Var.h(th2);
                    yr0Var.c(false);
                    bs0Var.a(yr0Var);
                    if (this.f19781b) {
                        bs0Var.h();
                        break;
                    }
                }
                break;
            default:
                try {
                    pt ptVar = (pt) this.f19782c;
                    String message = th2.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                    sb2.append("Internal error: ");
                    sb2.append(message);
                    String string = sb2.toString();
                    nt ntVar = (nt) ptVar;
                    Parcel parcelT = ntVar.T();
                    parcelT.writeString(string);
                    ntVar.g1(parcelT, 2);
                    break;
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                }
        }
    }

    public String toString() {
        switch (this.f19780a) {
            case 5:
                return super.toString() + "{numRequests=" + ((Set) this.f19782c).size() + ", isPaused=" + this.f19781b + "}";
            default:
                return super.toString();
        }
    }

    public i4(bs0 bs0Var, yr0 yr0Var, boolean z3) {
        this.f19780a = 3;
        this.f19782c = bs0Var;
        this.f19783d = yr0Var;
        this.f19781b = z3;
    }

    public i4(Context context) {
        this.f19780a = 0;
        this.f19781b = false;
        this.f19782c = context;
        this.f19783d = new h4(null);
    }

    public i4(fb.h hVar, pt ptVar, boolean z3) {
        this.f19780a = 4;
        this.f19782c = ptVar;
        this.f19781b = z3;
        this.f19783d = hVar;
    }

    public i4(x.o oVar, yb.i iVar) {
        this.f19780a = 1;
        this.f19782c = oVar;
        this.f19783d = iVar;
    }
}

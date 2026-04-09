package m8;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ce1;
import com.google.android.gms.internal.ads.ci0;
import com.google.android.gms.internal.ads.ck0;
import com.google.android.gms.internal.ads.ct0;
import com.google.android.gms.internal.ads.di0;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.fz;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hp;
import com.google.android.gms.internal.ads.l91;
import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.nt;
import com.google.android.gms.internal.ads.p81;
import com.google.android.gms.internal.ads.pe1;
import com.google.android.gms.internal.ads.pt;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.y81;
import com.google.android.gms.internal.ads.yx;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import va.w1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class s implements y81, p81, pi.i {

    /* renamed from: d, reason: collision with root package name */
    public static volatile s f28981d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f28982a;

    /* renamed from: b, reason: collision with root package name */
    public Object f28983b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28984c;

    public /* synthetic */ s(fz fzVar, String str, boolean z3) {
        this.f28983b = fzVar;
        this.f28984c = str;
        this.f28982a = z3;
    }

    public static s c(Context context) {
        if (f28981d == null) {
            synchronized (s.class) {
                try {
                    if (f28981d == null) {
                        f28981d = new s(context.getApplicationContext(), 0);
                    }
                } finally {
                }
            }
        }
        return f28981d;
    }

    @Override // pi.i
    public void a() throws InterruptedException {
        if (this.f28982a) {
            return;
        }
        ((k1.b) this.f28983b).run();
        this.f28982a = true;
    }

    @Override // com.google.android.gms.internal.ads.y81
    /* renamed from: b */
    public l91 mo168b() {
        fz fzVar = (fz) this.f28983b;
        String str = (String) this.f28984c;
        boolean z3 = this.f28982a;
        ce1 ce1Var = new ce1();
        fz fzVar2 = true != z3 ? null : fzVar;
        yx yxVar = fzVar.f11297d;
        pe1 pe1Var = new pe1(str, yxVar.f18916d, yxVar.f18917e, true, ce1Var);
        if (fzVar2 != null) {
            pe1Var.b(fzVar2);
        }
        return pe1Var;
    }

    public synchronized void d() {
        ((gx) this.f28984c).b(null);
    }

    public synchronized void e(int i4) {
        if (this.f28982a) {
            return;
        }
        this.f28982a = true;
        i(new w1(i4, ck0.c(i4, ((ci0) this.f28983b).f10134a), "undefined", null, null));
    }

    public synchronized void f(int i4, String str) {
        try {
            if (this.f28982a) {
                return;
            }
            this.f28982a = true;
            if (str == null) {
                str = ck0.c(i4, ((ci0) this.f28983b).f10134a);
            }
            i(new w1(i4, str, "undefined", null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g(w1 w1Var) {
        if (this.f28982a) {
            return;
        }
        this.f28982a = true;
        i(w1Var);
    }

    @Override // com.google.android.gms.internal.ads.p81
    /* renamed from: h */
    public void mo163h(Object obj) {
        List<Uri> list = (List) obj;
        try {
            fb.h hVar = (fb.h) this.f28984c;
            hVar.getClass();
            ArrayList arrayList = hVar.f23933y;
            ArrayList arrayList2 = hVar.f23932x;
            ct0 ct0Var = hVar.f23921m;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (fb.h.l4((Uri) it.next(), arrayList2, arrayList)) {
                        hVar.f23928t.getAndIncrement();
                        break;
                    }
                } else {
                    break;
                }
            }
            nt ntVar = (nt) ((pt) this.f28983b);
            Parcel parcelT = ntVar.T();
            parcelT.writeTypedList(list);
            ntVar.g1(parcelT, 1);
            if (!hVar.f23923o && !this.f28982a) {
                return;
            }
            for (Uri uri : list) {
                if (fb.h.l4(uri, arrayList2, arrayList)) {
                    ct0Var.b(fb.h.o4(uri, hVar.f23931w, "1").toString(), null, null, null);
                } else {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16212l8)).booleanValue()) {
                        ct0Var.b(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    public synchronized void i(w1 w1Var) {
        int i4 = 1;
        if (true == ((Boolean) va.s.f36163e.f36166c.a(sk.f16272p6)).booleanValue()) {
            i4 = 3;
        }
        ((gx) this.f28984c).d(new di0(i4, w1Var));
    }

    @Override // com.google.android.gms.internal.ads.p81
    public void n(Throwable th2) {
        try {
            pt ptVar = (pt) this.f28983b;
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
            sb2.append("Internal error: ");
            sb2.append(message);
            String string = sb2.toString();
            nt ntVar = (nt) ptVar;
            Parcel parcelT = ntVar.T();
            parcelT.writeString(string);
            ntVar.g1(parcelT, 2);
        } catch (RemoteException e2) {
            za.i.f("", e2);
        }
    }

    @Override // pi.i
    public void r() {
        ((AppsAnalyzeActivity) this.f28984c).f32744a.a(new jg.n(7, this));
    }

    @Override // pi.i
    public void t(String str) throws InterruptedException {
        if (this.f28982a) {
            return;
        }
        ((k1.b) this.f28983b).run();
        this.f28982a = true;
    }

    public s(int i4) {
        switch (i4) {
            case 5:
                this.f28983b = new ArrayList();
                this.f28984c = ed1.f10765b;
                this.f28982a = false;
                break;
            default:
                this.f28984c = za.b.f38135b;
                break;
        }
    }

    public s(nc ncVar) {
        this.f28983b = ncVar.A();
        this.f28982a = ncVar.B();
        this.f28984c = ncVar.C();
        ncVar.D();
    }

    public s(ck0 ck0Var, ci0 ci0Var, gx gxVar) {
        this.f28983b = ci0Var;
        this.f28984c = gxVar;
        this.f28982a = false;
    }

    public s(fb.h hVar, pt ptVar, boolean z3) {
        this.f28983b = ptVar;
        this.f28982a = z3;
        this.f28984c = hVar;
    }

    public s(Context context, int i4) {
        Object rVar;
        switch (i4) {
            case 2:
                ExecutorService executorService = za.b.f38135b;
                this.f28984c = executorService;
                executorService.execute(new q81(6, this, context));
                break;
            default:
                this.f28984c = new HashSet();
                hp hpVar = new hp(new d8.g(context, 3));
                n nVar = new n(this);
                if (Build.VERSION.SDK_INT >= 24) {
                    rVar = new p(hpVar, nVar);
                } else {
                    rVar = new r(context, hpVar, nVar);
                }
                this.f28983b = rVar;
                break;
        }
    }

    public s(AppsAnalyzeActivity appsAnalyzeActivity, k1.b bVar) {
        this.f28984c = appsAnalyzeActivity;
        this.f28983b = bVar;
        this.f28982a = false;
    }
}

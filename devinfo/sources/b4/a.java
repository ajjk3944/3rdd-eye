package b4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.be1;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.bt1;
import com.google.android.gms.internal.ads.ff;
import com.google.android.gms.internal.ads.g1;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.md;
import com.google.android.gms.internal.ads.mq0;
import com.google.android.gms.internal.ads.no0;
import com.google.android.gms.internal.ads.nt1;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.pr1;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.su1;
import com.google.android.gms.internal.ads.sx;
import com.google.android.gms.internal.ads.t01;
import com.google.android.gms.internal.ads.vx;
import com.google.android.gms.internal.ads.wu1;
import com.google.android.gms.internal.ads.zk;
import com.google.android.gms.internal.ads.zs1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import km.y;
import sh.s0;
import t.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1666a;

    /* renamed from: b, reason: collision with root package name */
    public int f1667b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1668c;

    public /* synthetic */ a(nt1 nt1Var, int i4, boolean z3) {
        this.f1666a = 8;
        this.f1668c = nt1Var;
        this.f1667b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        md mdVarI;
        int i4 = 1;
        switch (this.f1666a) {
            case 0:
                y yVar = (y) this.f1668c;
                int i10 = this.f1667b;
                u3.b bVar = (u3.b) yVar.f28522b;
                if (bVar != null) {
                    bVar.i(i10);
                    break;
                }
                break;
            case 1:
                ((com.google.android.gms.common.api.internal.n) this.f1668c).f(this.f1667b);
                break;
            case 2:
                int i11 = this.f1667b;
                ff ffVar = (ff) this.f1668c;
                if (i11 > 0) {
                    try {
                        Thread.sleep(i11 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = ffVar.f11116a;
                    mdVarI = al0.i(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    mdVarI = null;
                }
                ff ffVar2 = (ff) this.f1668c;
                ffVar2.f11122h = mdVarI;
                int i12 = this.f1667b;
                if (i12 < 4) {
                    if (mdVarI == null || !mdVarI.a0() || mdVarI.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !mdVarI.z0() || !mdVarI.A0().A() || mdVarI.A0().B() == -2) {
                        int i13 = i12 + 1;
                        if (ffVar2.f11125l) {
                            Future<?> futureSubmit = ffVar2.f11117b.submit(new a(ffVar2, i13, 2));
                            if (i13 == 0) {
                                ffVar2.f11123i = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                zk zkVar = (zk) this.f1668c;
                int i14 = this.f1667b;
                qd0 qd0Var = zkVar.f19097d;
                if (qd0Var != null) {
                    rt rtVarA = qd0Var.a();
                    rtVarA.u("action", "cct_nav");
                    rtVarA.u("cct_navs", String.valueOf(i14));
                    rtVarA.v();
                    break;
                }
                break;
            case 4:
                ((vx) this.f1668c).f17753b.onAudioFocusChange(this.f1667b);
                break;
            case 5:
                nx nxVar = (nx) this.f1668c;
                int i15 = this.f1667b;
                sx sxVar = nxVar.f14473q;
                if (sxVar != null) {
                    sxVar.onWindowVisibilityChanged(i15);
                    break;
                }
                break;
            case 6:
                gy gyVar = (gy) this.f1668c;
                int i16 = this.f1667b;
                sx sxVar2 = gyVar.g;
                if (sxVar2 != null) {
                    sxVar2.onWindowVisibilityChanged(i16);
                    break;
                }
                break;
            case 7:
                ((t01) this.f1668c).b(this.f1667b + 1);
                break;
            case 8:
                nt1 nt1Var = (nt1) this.f1668c;
                int i17 = ((pr1) nt1Var.f14410a[this.f1667b].f13637e).f15083b;
                wu1 wu1Var = nt1Var.f14432v;
                wu1Var.l(wu1Var.p(), 1033, new su1(16));
                break;
            case 9:
                g1 g1Var = (g1) this.f1668c;
                int i18 = this.f1667b;
                g1Var.getClass();
                String str = bq0.f9768a;
                bt1 bt1Var = g1Var.f11342b;
                zs1 zs1Var = new zs1(i18);
                be1 be1Var = bt1Var.f9804a.B;
                mq0.c0(Looper.myLooper() == ((no0) be1Var.f9659c).f14385a.getLooper());
                be1Var.f9657a++;
                q81 q81Var = new q81(22, be1Var, zs1Var);
                no0 no0Var = (no0) be1Var.f9658b;
                if (no0Var.f14385a.getLooper().getThread().isAlive()) {
                    no0Var.e(q81Var);
                }
                be1Var.M(Integer.valueOf(i18));
                break;
            case 10:
                ((com.google.android.material.datepicker.l) this.f1668c).f20470g0.n0(this.f1667b);
                break;
            case 11:
                ((gd.e) this.f1668c).f24652h.x(this.f1667b, 4);
                break;
            case 12:
                s sVar = ((t.m) this.f1668c).f33848a0;
                if (sVar.f33855c == null) {
                    sVar.f33855c = new s0(i4);
                }
                sVar.f33855c.o(this.f1667b);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f1668c;
                int size = arrayList.size();
                if (this.f1667b != 1) {
                    for (int i19 = 0; i19 < size; i19++) {
                        ((w4.g) arrayList.get(i19)).a();
                    }
                    break;
                } else {
                    for (int i20 = 0; i20 < size; i20++) {
                        ((w4.g) arrayList.get(i20)).b();
                    }
                    break;
                }
        }
    }

    public /* synthetic */ a(Object obj, int i4, int i10) {
        this.f1666a = i10;
        this.f1668c = obj;
        this.f1667b = i4;
    }

    public a(t.m mVar, int i4, CharSequence charSequence) {
        this.f1666a = 12;
        this.f1668c = mVar;
        this.f1667b = i4;
    }

    public a(List list, int i4, Throwable th2) {
        this.f1666a = 13;
        pk.a.e(list, "initCallbacks cannot be null");
        this.f1668c = new ArrayList(list);
        this.f1667b = i4;
    }

    public a(gd.e eVar) {
        this.f1666a = 11;
        this.f1668c = eVar;
        this.f1667b = -1;
    }
}

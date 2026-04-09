package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class cd implements Runnable {
    public final /* synthetic */ int f;
    public final int g;
    public final Object h;

    public /* synthetic */ cd(Object obj, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        qr1 qr1VarW;
        int i = 1;
        switch (this.f) {
            case 0:
                f23 f23Var = (f23) this.h;
                int i2 = this.g;
                g82 g82Var = (g82) f23Var.g;
                if (g82Var != null) {
                    g82Var.o(i2);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                if (this.g != 1) {
                    for (int i3 = 0; i3 < size; i3++) {
                        ((pr) arrayList.get(i3)).a();
                    }
                    break;
                } else {
                    for (int i4 = 0; i4 < size; i4++) {
                        ((pr) arrayList.get(i4)).b();
                    }
                    break;
                }
            case 2:
                RecyclerView recyclerView = ((cc0) this.h).g0;
                int i5 = this.g;
                if (!recyclerView.B) {
                    ho0 ho0Var = recyclerView.r;
                    if (ho0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        break;
                    } else {
                        ho0Var.y0(recyclerView, i5);
                        break;
                    }
                }
                break;
            case 3:
                ((SystemForegroundService) this.h).j.cancel(this.g);
                break;
            case 4:
                ((xb1) this.h).f(this.g);
                break;
            case 5:
                int i6 = this.g;
                jt1 jt1Var = (jt1) this.h;
                if (i6 > 0) {
                    try {
                        Thread.sleep(i6 * 1000);
                    } catch (InterruptedException unused) {
                    }
                }
                try {
                    Context context = jt1Var.a;
                    qr1VarW = g82.w(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                } catch (Throwable unused2) {
                    qr1VarW = null;
                }
                jt1 jt1Var2 = (jt1) this.h;
                jt1Var2.h = qr1VarW;
                int i7 = this.g;
                if (i7 < 4) {
                    if (qr1VarW == null || !qr1VarW.a0() || qr1VarW.v0().equals("0000000000000000000000000000000000000000000000000000000000000000") || !qr1VarW.z0() || !qr1VarW.A0().A() || qr1VarW.A0().B() == -2) {
                        int i8 = i7 + 1;
                        if (jt1Var2.l) {
                            Future<?> futureSubmit = jt1Var2.b.submit(new cd(jt1Var2, i8, 5));
                            if (i8 == 0) {
                                jt1Var2.i = futureSubmit;
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                xz1 xz1Var = (xz1) this.h;
                int i9 = this.g;
                mv2 mv2Var = xz1Var.d;
                if (mv2Var != null) {
                    lv2 lv2VarA = mv2Var.a();
                    lv2VarA.k("action", "cct_nav");
                    lv2VarA.k("cct_navs", String.valueOf(i9));
                    lv2VarA.m();
                    break;
                }
                break;
            case 7:
                yd2 yd2Var = (yd2) this.h;
                int i10 = this.g;
                ee2 ee2Var = yd2Var.v;
                if (ee2Var != null) {
                    ee2Var.onWindowVisibilityChanged(i10);
                    break;
                }
                break;
            case 8:
                se2 se2Var = (se2) this.h;
                int i11 = this.g;
                ee2 ee2Var2 = se2Var.l;
                if (ee2Var2 != null) {
                    ee2Var2.onWindowVisibilityChanged(i11);
                    break;
                }
                break;
            case 9:
                jb4 jb4Var = (jb4) this.h;
                int i12 = ((kg4) jb4Var.f[this.g].e).g;
                md4 md4Var = jb4Var.A;
                md4Var.s(md4Var.y(), 1033, new id4(i));
                break;
            default:
                wt2 wt2Var = (wt2) this.h;
                int i13 = this.g;
                wt2Var.getClass();
                String str = v23.a;
                oa4 oa4Var = (oa4) wt2Var.h;
                na4 na4Var = new na4(i13);
                fw3 fw3Var = oa4Var.f.H;
                zt0.b0(Looper.myLooper() == ((d13) fw3Var.h).a.getLooper());
                fw3Var.f++;
                n62 n62Var = new n62(fw3Var, na4Var, 17);
                d13 d13Var = (d13) fw3Var.g;
                if (d13Var.a.getLooper().getThread().isAlive()) {
                    d13Var.d(n62Var);
                }
                fw3Var.z(Integer.valueOf(i13));
                break;
        }
    }

    public /* synthetic */ cd(jb4 jb4Var, int i, boolean z) {
        this.f = 9;
        this.h = jb4Var;
        this.g = i;
    }

    public cd(List list, int i, Throwable th) {
        this.f = 1;
        pu1.i(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i;
    }
}

package f7;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23721b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23722c;

    public /* synthetic */ e(int i4, Object obj, Object obj2) {
        this.f23720a = i4;
        this.f23721b = obj;
        this.f23722c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z3 = false;
        switch (this.f23720a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f23721b;
                String str = (String) this.f23722c;
                if (!lottieAnimationView.f2983m) {
                    return o.b(lottieAnimationView.getContext(), str, null);
                }
                Context context = lottieAnimationView.getContext();
                HashMap map = o.f23777a;
                return o.b(context, str, "asset_" + str);
            case 1:
                lf.b bVar = (lf.b) this.f23721b;
                lf.c cVar = (lf.c) this.f23722c;
                lf.m mVar = bVar.f28743b;
                synchronized (mVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = mVar.f28802a.openFileOutput(mVar.f28803b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(cVar.f28746a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            default:
                t6.g0 g0Var = t6.g0.f34349a;
                u6.z zVar = (u6.z) this.f23721b;
                u6.c0 c0Var = (u6.c0) this.f23722c;
                b7.r rVar = c0Var.f35132a;
                String str2 = c0Var.f35134c;
                b7.y yVar = c0Var.j;
                int i4 = 1;
                if (zVar instanceof u6.x) {
                    t6.t tVar = ((u6.x) zVar).f35196a;
                    t6.g0 g0VarC = yVar.c(str2);
                    b7.p pVarV = c0Var.f35139i.v();
                    pVarV.getClass();
                    com.bumptech.glide.f.r(pVarV.f2012a, false, true, new b7.c(str2, 5));
                    if (g0VarC != null) {
                        if (g0VarC == t6.g0.f34350b) {
                            String str3 = c0Var.f35142m;
                            if (tVar instanceof t6.s) {
                                String str4 = u6.d0.f35146a;
                                t6.v.e().f(str4, "Worker result SUCCESS for " + str3);
                                if (rVar.c()) {
                                    c0Var.c();
                                } else {
                                    yVar.h(t6.g0.f34351c, str2);
                                    t6.h hVar = ((t6.s) tVar).f34393a;
                                    nk.k.d(hVar, "getOutputData(...)");
                                    com.bumptech.glide.f.r(yVar.f2066a, false, true, new b7.b(6, hVar, str2));
                                    c0Var.g.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    b7.e eVar = c0Var.f35140k;
                                    for (String str5 : eVar.a(str2)) {
                                        if (yVar.c(str5) == t6.g0.f34353e && ((Boolean) com.bumptech.glide.f.r(eVar.f1978a, true, false, new b7.c(str5, i4))).booleanValue()) {
                                            t6.v.e().f(u6.d0.f35146a, "Setting status to enqueued for ".concat(str5));
                                            yVar.h(g0Var, str5);
                                            yVar.g(jCurrentTimeMillis, str5);
                                        }
                                    }
                                }
                            } else if (tVar instanceof t6.r) {
                                String str6 = u6.d0.f35146a;
                                t6.v.e().f(str6, "Worker result RETRY for " + str3);
                                c0Var.b(-256);
                                z3 = true;
                            } else {
                                String str7 = u6.d0.f35146a;
                                t6.v.e().f(str7, "Worker result FAILURE for " + str3);
                                if (rVar.c()) {
                                    c0Var.c();
                                } else {
                                    c0Var.d(tVar);
                                }
                            }
                        } else if (!g0VarC.a()) {
                            c0Var.b(-512);
                            z3 = true;
                        }
                    }
                } else if (zVar instanceof u6.w) {
                    c0Var.d(((u6.w) zVar).f35195a);
                } else {
                    if (!(zVar instanceof u6.y)) {
                        throw new ac.m();
                    }
                    int i10 = ((u6.y) zVar).f35197a;
                    if (nk.k.a(rVar.f2052y, Boolean.TRUE)) {
                        String str8 = u6.d0.f35146a;
                        t6.v.e().a(str8, "Worker " + rVar.f2032c + " was interrupted. Backing off.");
                        c0Var.b(i10);
                    } else {
                        t6.g0 g0VarC2 = yVar.c(str2);
                        if (g0VarC2 == null || g0VarC2.a()) {
                            String str9 = u6.d0.f35146a;
                            t6.v.e().a(str9, "Status for " + str2 + " is " + g0VarC2 + " ; not doing any work");
                        } else {
                            String str10 = u6.d0.f35146a;
                            t6.v.e().a(str10, "Status for " + str2 + " is " + g0VarC2 + "; not doing any work and rescheduling for later execution");
                            yVar.h(g0Var, str2);
                            yVar.i(i10, str2);
                            yVar.e(-1L, str2);
                        }
                    }
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}

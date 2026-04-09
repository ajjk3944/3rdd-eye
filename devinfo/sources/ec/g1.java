package ec;

import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22720a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22721b;

    public /* synthetic */ g1(int i4, Object obj) {
        this.f22720a = i4;
        this.f22721b = obj;
    }

    private final Object a() {
        synchronized (((v7.c) this.f22721b)) {
            try {
                v7.c cVar = (v7.c) this.f22721b;
                if (cVar.f35963i == null) {
                    return null;
                }
                cVar.N();
                if (((v7.c) this.f22721b).w()) {
                    ((v7.c) this.f22721b).G();
                    ((v7.c) this.f22721b).f35964k = 0;
                }
                return null;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundleG;
        com.google.android.gms.internal.play_billing.c cVar;
        int i4;
        switch (this.f22720a) {
            case 0:
                return new com.google.android.gms.internal.measurement.k4(((h1) this.f22721b).f22769l);
            case 1:
                u1 u1Var = (u1) this.f22721b;
                u1Var.f23089a.B();
                w0 w0Var = u1Var.f23089a.f22737h;
                g4.U(w0Var);
                w0Var.B();
                throw new IllegalStateException("Unexpected call on client side");
            case 2:
                return ((fb.a) this.f22721b).getViewSignals();
            case 3:
                t7.l lVar = (t7.l) this.f22721b;
                t7.a aVar = lVar.f34471d;
                synchronized (aVar.f34409a) {
                    try {
                        if (aVar.f34410b != 3) {
                            boolean z3 = true;
                            boolean z10 = aVar.f34410b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundleG = null;
                            } else {
                                bundleG = r5.c.g("accountName", null);
                                com.google.android.gms.internal.play_billing.u.b(aVar.A.longValue(), bundleG, aVar.f34411c, aVar.f34412d);
                            }
                            synchronized (aVar.f34409a) {
                                cVar = aVar.f34416i;
                            }
                            if (cVar == null) {
                                t7.a aVar2 = lVar.f34471d;
                                aVar2.n(0);
                                t7.c cVar2 = t7.r.j;
                                aVar2.m(FacebookMediationAdapter.ERROR_NULL_CONTEXT, cVar2);
                                lVar.c(cVar2);
                            } else {
                                t7.a aVar3 = lVar.f34471d;
                                String packageName = aVar3.g.getPackageName();
                                int iK2 = 3;
                                int i10 = 25;
                                while (true) {
                                    if (i10 >= 3) {
                                        if (bundleG == null) {
                                            try {
                                                com.google.android.gms.internal.play_billing.a aVar4 = (com.google.android.gms.internal.play_billing.a) cVar;
                                                Parcel parcelA2 = aVar4.a2();
                                                parcelA2.writeInt(i10);
                                                parcelA2.writeString(packageName);
                                                parcelA2.writeString("subs");
                                                Parcel parcelF2 = aVar4.f2(parcelA2, 1);
                                                int i11 = parcelF2.readInt();
                                                parcelF2.recycle();
                                                iK2 = i11;
                                            } catch (Exception e2) {
                                                com.google.android.gms.internal.play_billing.u.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
                                                boolean z11 = e2 instanceof DeadObjectException;
                                                int i12 = z11 ? 91 : e2 instanceof RemoteException ? 90 : e2 instanceof SecurityException ? 92 : 42;
                                                String strA = i3.e.a(i12, 42) ? t7.p.a(e2) : null;
                                                lVar.f34471d.n(0);
                                                lVar.b(z11 ? t7.r.j : t7.r.f34483h, i12, strA, z10);
                                                lVar.c(z11 ? t7.r.j : t7.r.f34483h);
                                            }
                                        } else {
                                            iK2 = ((com.google.android.gms.internal.play_billing.a) cVar).k2(i10, packageName, "subs", bundleG);
                                        }
                                        if (iK2 == 0) {
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "highestLevelSupportedForSubs: " + i10);
                                        } else {
                                            i10--;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                aVar3.f34417k = i10 >= 3;
                                if (i10 < 3) {
                                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i4 = 9;
                                } else {
                                    i4 = 1;
                                }
                                int iK22 = iK2;
                                int i13 = 25;
                                while (true) {
                                    if (i13 >= 3) {
                                        if (bundleG == null) {
                                            com.google.android.gms.internal.play_billing.a aVar5 = (com.google.android.gms.internal.play_billing.a) cVar;
                                            Parcel parcelA22 = aVar5.a2();
                                            parcelA22.writeInt(i13);
                                            parcelA22.writeString(packageName);
                                            parcelA22.writeString("inapp");
                                            Parcel parcelF22 = aVar5.f2(parcelA22, 1);
                                            iK22 = parcelF22.readInt();
                                            parcelF22.recycle();
                                        } else {
                                            iK22 = ((com.google.android.gms.internal.play_billing.a) cVar).k2(i13, packageName, "inapp", bundleG);
                                        }
                                        if (iK22 == 0) {
                                            aVar3.f34418l = i13;
                                            com.google.android.gms.internal.play_billing.u.g("BillingClient", "mHighestLevelSupportedForInApp: " + i13);
                                        } else {
                                            i13--;
                                        }
                                    }
                                }
                                int i14 = aVar3.f34418l;
                                aVar3.f34418l = i14;
                                aVar3.f34429w = i14 >= 26;
                                aVar3.f34428v = i14 >= 24;
                                aVar3.f34427u = i14 >= 21;
                                aVar3.f34426t = i14 >= 20;
                                aVar3.f34425s = i14 >= 19;
                                aVar3.f34424r = i14 >= 17;
                                aVar3.f34423q = i14 >= 16;
                                aVar3.f34422p = i14 >= 15;
                                aVar3.f34421o = i14 >= 14;
                                aVar3.f34420n = i14 >= 9;
                                if (i14 < 6) {
                                    z3 = false;
                                }
                                aVar3.f34419m = z3;
                                if (i14 < 3) {
                                    com.google.android.gms.internal.play_billing.u.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i4 = 36;
                                }
                                t7.a.s(aVar3, iK22);
                                if (iK22 != 0) {
                                    t7.c cVar3 = t7.r.f34478b;
                                    lVar.b(cVar3, i4, null, z10);
                                    lVar.c(cVar3);
                                } else {
                                    try {
                                        Long lA = lVar.a(z10);
                                        if (z10) {
                                            com.google.android.gms.internal.play_billing.z2 z2VarS = com.google.android.gms.internal.play_billing.a3.s();
                                            z2VarS.d();
                                            com.google.android.gms.internal.play_billing.a3.r((com.google.android.gms.internal.play_billing.a3) z2VarS.f20201b, 6);
                                            com.google.android.gms.internal.play_billing.u3 u3VarR = com.google.android.gms.internal.play_billing.v3.r();
                                            u3VarR.e(false);
                                            u3VarR.f();
                                            if (lA != null) {
                                                long jLongValue = lA.longValue();
                                                u3VarR.d();
                                                com.google.android.gms.internal.play_billing.v3.p((com.google.android.gms.internal.play_billing.v3) u3VarR.f20201b, jLongValue);
                                            }
                                            t7.a aVar6 = lVar.f34471d;
                                            z2VarS.d();
                                            com.google.android.gms.internal.play_billing.a3.q((com.google.android.gms.internal.play_billing.a3) z2VarS.f20201b, (com.google.android.gms.internal.play_billing.v3) u3VarR.a());
                                            aVar6.l((com.google.android.gms.internal.play_billing.a3) z2VarS.a());
                                        } else {
                                            com.google.android.gms.internal.play_billing.r3 r3VarP = com.google.android.gms.internal.play_billing.s3.p();
                                            com.google.android.gms.internal.play_billing.b3 b3VarS = com.google.android.gms.internal.play_billing.c3.s();
                                            b3VarS.d();
                                            com.google.android.gms.internal.play_billing.c3.r((com.google.android.gms.internal.play_billing.c3) b3VarS.f20201b, 0);
                                            r3VarP.d();
                                            com.google.android.gms.internal.play_billing.s3.n((com.google.android.gms.internal.play_billing.s3) r3VarP.f20201b, (com.google.android.gms.internal.play_billing.c3) b3VarS.a());
                                            if (lA != null) {
                                                long jLongValue2 = lA.longValue();
                                                r3VarP.d();
                                                com.google.android.gms.internal.play_billing.s3.o((com.google.android.gms.internal.play_billing.s3) r3VarP.f20201b, jLongValue2);
                                            }
                                            lVar.f34471d.f34415h.H((com.google.android.gms.internal.play_billing.s3) r3VarP.a());
                                        }
                                    } catch (Throwable th2) {
                                        com.google.android.gms.internal.play_billing.u.i("BillingClient", "Unable to log.", th2);
                                    }
                                    lVar.c(t7.r.f34484i);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 4:
                return a();
            default:
                ya.b0 b0Var = ya.f0.f37440l;
                ya.f0 f0Var = ua.j.C.f35261c;
                return ya.f0.p((Uri) this.f22721b);
        }
    }

    public g1(u1 u1Var, u uVar, String str) {
        this.f22720a = 1;
        this.f22721b = u1Var;
    }
}

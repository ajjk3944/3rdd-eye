package ec;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.or;
import com.google.android.gms.internal.consent_sdk.k7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u1 extends com.google.android.gms.internal.measurement.x implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g4 f23089a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f23090b;

    /* renamed from: c, reason: collision with root package name */
    public String f23091c;

    public u1(g4 g4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        pb.y.h(g4Var);
        this.f23089a = g4Var;
        this.f23091c = null;
    }

    @Override // ec.g0
    public final void B2(i4 i4Var, n4 n4Var) {
        pb.y.h(i4Var);
        T(n4Var);
        r0(new b4.o(this, i4Var, n4Var, 7));
    }

    @Override // ec.g0
    public final void H3(n4 n4Var) {
        pb.y.e(n4Var.f22915a);
        pb.y.h(n4Var.f22931s);
        S(new q1(this, n4Var, 5));
    }

    @Override // ec.g0
    public final void J3(n4 n4Var) {
        T(n4Var);
        r0(new q1(this, n4Var, 2));
    }

    @Override // ec.g0
    public final void M0(long j, String str, String str2, String str3) {
        r0(new r1(this, str2, str3, str, j, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        boolean z3;
        List list;
        g4 g4Var = this.f23089a;
        ArrayList arrayList = null;
        i0 h0Var = null;
        k0 j0Var = null;
        switch (i4) {
            case 1:
                u uVar = (u) com.google.android.gms.internal.measurement.y.a(parcel, u.CREATOR);
                n4 n4Var = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                v0(uVar, n4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                i4 i4Var = (i4) com.google.android.gms.internal.measurement.y.a(parcel, i4.CREATOR);
                n4 n4Var2 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                B2(i4Var, n4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                n4 n4Var3 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                m0(n4Var3);
                parcel2.writeNoException();
                return true;
            case 5:
                u uVar2 = (u) com.google.android.gms.internal.measurement.y.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                pb.y.h(uVar2);
                pb.y.e(string);
                e0(string, true);
                r0(new b4.o(this, uVar2, string, 6));
                parcel2.writeNoException();
                return true;
            case 6:
                n4 n4Var4 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                J3(n4Var4);
                parcel2.writeNoException();
                return true;
            case 7:
                n4 n4Var5 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                byte b10 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.d(parcel);
                T(n4Var5);
                String str = n4Var5.f22915a;
                pb.y.h(str);
                try {
                    List<j4> list2 = (List) g4Var.b().I(new p1(0, this, str)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (j4 j4Var : list2) {
                        if (b10 != false || !l4.a0(j4Var.f22826c)) {
                            arrayList2.add(new i4(j4Var));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e2) {
                    e = e2;
                    g4Var.a().g.f(s0.J(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e10) {
                    e = e10;
                    g4Var.a().g.f(s0.J(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) com.google.android.gms.internal.measurement.y.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                byte[] bArrJ2 = j2(uVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrJ2);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                M0(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                n4 n4Var6 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                String strM1 = m1(n4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strM1);
                return true;
            case 12:
                e eVar = (e) com.google.android.gms.internal.measurement.y.a(parcel, e.CREATOR);
                n4 n4Var7 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                e2(eVar, n4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) com.google.android.gms.internal.measurement.y.a(parcel, e.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                pb.y.h(eVar2);
                pb.y.h(eVar2.f22690c);
                pb.y.e(eVar2.f22688a);
                e0(eVar2.f22688a, true);
                r0(new vd.a(this, false, new e(eVar2), 15));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.y.f20039a;
                z3 = parcel.readInt() != 0;
                n4 n4Var8 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listB1 = b1(string6, string7, z3, n4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB1);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.y.f20039a;
                z3 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listH0 = h0(string8, string9, string10, z3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH0);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                n4 n4Var9 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listK1 = k1(string11, string12, n4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK1);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.y.d(parcel);
                List listN1 = n1(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN1);
                return true;
            case 18:
                n4 n4Var10 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                c3(n4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                n4 n4Var11 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                X0(bundle, n4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                n4 n4Var12 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                w1(n4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                n4 n4Var13 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                i iVarM2 = m2(n4Var13);
                parcel2.writeNoException();
                if (iVarM2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarM2.writeToParcel(parcel2, 1);
                return true;
            case 24:
                n4 n4Var14 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                T(n4Var14);
                String str2 = n4Var14.f22915a;
                pb.y.h(str2);
                if (g4Var.e0().L(null, d0.Z0)) {
                    try {
                        list = (List) g4Var.b().J(new t1(this, n4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                        g4Var.a().g.f(s0.J(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) g4Var.b().I(new t1(this, n4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e12) {
                        g4Var.a().g.f(s0.J(str2), e12, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                n4 n4Var15 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                O0(n4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                n4 n4Var16 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                H3(n4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                n4 n4Var17 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                f3(n4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                n4 n4Var18 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                z3 z3Var = (z3) com.google.android.gms.internal.measurement.y.a(parcel, z3.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    j0Var = iInterfaceQueryLocalInterface instanceof k0 ? (k0) iInterfaceQueryLocalInterface : new j0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                com.google.android.gms.internal.measurement.y.d(parcel);
                e3(n4Var18, z3Var, j0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                n4 n4Var19 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                d dVar = (d) com.google.android.gms.internal.measurement.y.a(parcel, d.CREATOR);
                com.google.android.gms.internal.measurement.y.d(parcel);
                R3(n4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                n4 n4Var20 = (n4) com.google.android.gms.internal.measurement.y.a(parcel, n4.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    h0Var = iInterfaceQueryLocalInterface2 instanceof i0 ? (i0) iInterfaceQueryLocalInterface2 : new h0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                com.google.android.gms.internal.measurement.y.d(parcel);
                i1(n4Var20, bundle3, h0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // ec.g0
    public final void O0(n4 n4Var) {
        pb.y.e(n4Var.f22915a);
        pb.y.h(n4Var.f22931s);
        S(new q1(this, n4Var, 6));
    }

    @Override // ec.g0
    public final void R3(n4 n4Var, d dVar) {
        T(n4Var);
        r0(new b4.o(this, n4Var, dVar, false, 8));
    }

    public final void S(Runnable runnable) {
        g4 g4Var = this.f23089a;
        if (g4Var.b().H()) {
            runnable.run();
        } else {
            g4Var.b().M(runnable);
        }
    }

    public final void T(n4 n4Var) {
        pb.y.h(n4Var);
        String str = n4Var.f22915a;
        pb.y.e(str);
        e0(str, false);
        this.f23089a.k0().F(n4Var.f22916b);
    }

    @Override // ec.g0
    public final void X0(Bundle bundle, n4 n4Var) {
        T(n4Var);
        String str = n4Var.f22915a;
        pb.y.h(str);
        r0(new ab.c(this, bundle, str, n4Var));
    }

    @Override // ec.g0
    public final List b1(String str, String str2, boolean z3, n4 n4Var) {
        T(n4Var);
        String str3 = n4Var.f22915a;
        pb.y.h(str3);
        g4 g4Var = this.f23089a;
        try {
            List<j4> list = (List) g4Var.b().I(new s1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j4 j4Var : list) {
                if (z3 || !l4.a0(j4Var.f22826c)) {
                    arrayList.add(new i4(j4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            g4Var.a().g.f(s0.J(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            g4Var.a().g.f(s0.J(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ec.g0
    public final void c3(n4 n4Var) {
        String str = n4Var.f22915a;
        pb.y.e(str);
        e0(str, false);
        r0(new q1(this, n4Var, 3));
    }

    public final void e0(String str, boolean z3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        g4 g4Var = this.f23089a;
        if (zIsEmpty) {
            g4Var.a().g.d("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z3) {
            try {
                if (this.f23090b == null) {
                    boolean z10 = true;
                    if (!"com.google.android.gms".equals(this.f23091c)) {
                        if (!tb.b.i(Binder.getCallingUid(), g4Var.f22740l.f22949a) && !nb.j.a(g4Var.f22740l.f22949a).b(Binder.getCallingUid())) {
                            z10 = false;
                        }
                    }
                    this.f23090b = Boolean.valueOf(z10);
                }
                if (this.f23090b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e2) {
                g4Var.a().g.e(s0.J(str), "Measurement Service called with invalid calling package. appId");
                throw e2;
            }
        }
        if (this.f23091c == null) {
            Context context = g4Var.f22740l.f22949a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = nb.i.f29900a;
            if (tb.b.m(context, callingUid, str)) {
                this.f23091c = str;
            }
        }
        if (str.equals(this.f23091c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // ec.g0
    public final void e2(e eVar, n4 n4Var) {
        pb.y.h(eVar);
        pb.y.h(eVar.f22690c);
        T(n4Var);
        e eVar2 = new e(eVar);
        eVar2.f22688a = n4Var.f22915a;
        r0(new b4.o(this, eVar2, n4Var, 4));
    }

    @Override // ec.g0
    public final void e3(n4 n4Var, z3 z3Var, k0 k0Var) {
        T(n4Var);
        String str = n4Var.f22915a;
        pb.y.h(str);
        this.f23089a.b().K(new ab.c(this, str, z3Var, k0Var, 2));
    }

    @Override // ec.g0
    public final void f3(n4 n4Var) {
        T(n4Var);
        r0(new q1(this, n4Var, 1));
    }

    @Override // ec.g0
    public final List h0(String str, String str2, String str3, boolean z3) {
        e0(str, true);
        g4 g4Var = this.f23089a;
        try {
            List<j4> list = (List) g4Var.b().I(new s1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (j4 j4Var : list) {
                if (z3 || !l4.a0(j4Var.f22826c)) {
                    arrayList.add(new i4(j4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e2) {
            e = e2;
            g4Var.a().g.f(s0.J(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            g4Var.a().g.f(s0.J(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ec.g0
    public final void i1(n4 n4Var, Bundle bundle, i0 i0Var) {
        T(n4Var);
        String str = n4Var.f22915a;
        pb.y.h(str);
        this.f23089a.b().K(new k7(this, n4Var, bundle, i0Var, str, 1));
    }

    @Override // ec.g0
    public final byte[] j2(u uVar, String str) {
        pb.y.e(str);
        pb.y.h(uVar);
        e0(str, true);
        g4 g4Var = this.f23089a;
        or orVar = g4Var.a().f23059n;
        o1 o1Var = g4Var.f22740l;
        o0 o0Var = o1Var.j;
        String str2 = uVar.f23085a;
        orVar.e(o0Var.a(str2), "Log and bundle. event");
        g4Var.f().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) g4Var.b().J(new g1(this, uVar, str)).get();
            if (bArr == null) {
                g4Var.a().g.e(s0.J(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            g4Var.f().getClass();
            g4Var.a().f23059n.g("Log and bundle processed. event, size, time_ms", o1Var.j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e2) {
            e = e2;
            g4Var.a().g.g("Failed to log and bundle. appId, event, error", s0.J(str), o1Var.j.a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            g4Var.a().g.g("Failed to log and bundle. appId, event, error", s0.J(str), o1Var.j.a(str2), e);
            return null;
        }
    }

    @Override // ec.g0
    public final List k1(String str, String str2, n4 n4Var) {
        T(n4Var);
        String str3 = n4Var.f22915a;
        pb.y.h(str3);
        g4 g4Var = this.f23089a;
        try {
            return (List) g4Var.b().I(new s1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e2) {
            g4Var.a().g.e(e2, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // ec.g0
    public final void m0(n4 n4Var) {
        T(n4Var);
        r0(new q1(this, n4Var, 0));
    }

    @Override // ec.g0
    public final String m1(n4 n4Var) {
        T(n4Var);
        g4 g4Var = this.f23089a;
        try {
            return (String) g4Var.b().I(new p1(g4Var, n4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            g4Var.a().g.f(s0.J(n4Var.f22915a), e2, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // ec.g0
    public final i m2(n4 n4Var) {
        T(n4Var);
        String str = n4Var.f22915a;
        pb.y.e(str);
        g4 g4Var = this.f23089a;
        try {
            return (i) g4Var.b().J(new p1(1, this, n4Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            g4Var.a().g.f(s0.J(str), e2, "Failed to get consent. appId");
            return new i(null);
        }
    }

    @Override // ec.g0
    public final List n1(String str, String str2, String str3) {
        e0(str, true);
        g4 g4Var = this.f23089a;
        try {
            return (List) g4Var.b().I(new s1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e2) {
            g4Var.a().g.e(e2, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    public final void r0(Runnable runnable) {
        g4 g4Var = this.f23089a;
        if (g4Var.b().H()) {
            runnable.run();
        } else {
            g4Var.b().K(runnable);
        }
    }

    @Override // ec.g0
    public final void v0(u uVar, n4 n4Var) {
        pb.y.h(uVar);
        T(n4Var);
        r0(new b4.o(this, uVar, n4Var, 5));
    }

    @Override // ec.g0
    public final void w1(n4 n4Var) {
        pb.y.e(n4Var.f22915a);
        pb.y.h(n4Var.f22931s);
        S(new q1(this, n4Var, 4));
    }
}

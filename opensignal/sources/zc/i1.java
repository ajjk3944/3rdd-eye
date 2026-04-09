package zc;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i1 extends com.google.android.gms.internal.measurement.y implements x {

    /* renamed from: d, reason: collision with root package name */
    public final p3 f26968d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f26969e;

    /* renamed from: f, reason: collision with root package name */
    public String f26970f;

    public i1(p3 p3Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        cc.s.h(p3Var);
        this.f26968d = p3Var;
        this.f26970f = null;
    }

    @Override // zc.x
    public final zzao A(zzr zzrVar) {
        f(zzrVar);
        String str = zzrVar.f5426a;
        cc.s.e(str);
        p3 p3Var = this.f26968d;
        try {
            return (zzao) p3Var.J().A1(new d1(this, zzrVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            p3Var.x().B.d(j0.A1(str), e4, "Failed to get consent. appId");
            return new zzao(null);
        }
    }

    @Override // zc.x
    public final void B(Bundle bundle, zzr zzrVar) {
        f(zzrVar);
        String str = zzrVar.f5426a;
        cc.s.h(str);
        S(new o.e(this, bundle, str, zzrVar, 4, false));
    }

    @Override // zc.x
    public final void D(zzr zzrVar, Bundle bundle, z zVar) {
        f(zzrVar);
        String str = zzrVar.f5426a;
        cc.s.h(str);
        this.f26968d.J().B1(new io.sentry.android.replay.x(this, zzrVar, bundle, zVar, str));
    }

    @Override // zc.x
    public final void E(zzr zzrVar) {
        f(zzrVar);
        S(new e1(this, zzrVar, 0));
    }

    @Override // zc.x
    public final void G(zzr zzrVar) {
        f(zzrVar);
        S(new e1(this, zzrVar, 1));
    }

    @Override // zc.x
    public final List I(String str, String str2, boolean z10, zzr zzrVar) {
        f(zzrVar);
        String str3 = zzrVar.f5426a;
        cc.s.h(str3);
        p3 p3Var = this.f26968d;
        try {
            List<r3> list = (List) p3Var.J().z1(new g1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r3 r3Var : list) {
                if (z10 || !s3.Q1(r3Var.f27135c)) {
                    arrayList.add(new zzpl(r3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            p3Var.x().B.d(j0.A1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            p3Var.x().B.d(j0.A1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // zc.x
    public final String M(zzr zzrVar) {
        f(zzrVar);
        p3 p3Var = this.f26968d;
        try {
            return (String) p3Var.J().z1(new d1(p3Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            p3Var.x().B.d(j0.A1(zzrVar.f5426a), e4, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // zc.x
    public final List N(String str, String str2, zzr zzrVar) {
        f(zzrVar);
        String str3 = zzrVar.f5426a;
        cc.s.h(str3);
        p3 p3Var = this.f26968d;
        try {
            return (List) p3Var.J().z1(new g1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            p3Var.x().B.c(e4, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // zc.x
    public final void Q(zzr zzrVar) {
        cc.s.e(zzrVar.f5426a);
        cc.s.h(zzrVar.O);
        e(new e1(this, zzrVar, 4));
    }

    public final void R(String str, boolean z10) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        p3 p3Var = this.f26968d;
        if (zIsEmpty) {
            p3Var.x().B.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f26969e == null) {
                    boolean z11 = true;
                    if (!"com.google.android.gms".equals(this.f26970f) && !gc.b.f(p3Var.H.f26884a, Binder.getCallingUid()) && !zb.g.a(p3Var.H.f26884a).c(Binder.getCallingUid())) {
                        z11 = false;
                    }
                    this.f26969e = Boolean.valueOf(z11);
                }
                if (this.f26969e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e4) {
                p3Var.x().B.c(j0.A1(str), "Measurement Service called with invalid calling package. appId");
                throw e4;
            }
        }
        if (this.f26970f == null) {
            Context context = p3Var.H.f26884a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = zb.f.f26819a;
            if (gc.b.h(callingUid, context, str)) {
                this.f26970f = str;
            }
        }
        if (str.equals(this.f26970f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void S(Runnable runnable) {
        p3 p3Var = this.f26968d;
        if (p3Var.J().y1()) {
            runnable.run();
        } else {
            p3Var.J().B1(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.y
    public final boolean d(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        List list;
        p3 p3Var = this.f26968d;
        ArrayList arrayList = null;
        z yVar = null;
        b0 a0Var = null;
        switch (i10) {
            case 1:
                zzbg zzbgVar = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                s(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) com.google.android.gms.internal.measurement.z.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                z(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                E(zzrVar3);
                parcel2.writeNoException();
                return true;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                zzbg zzbgVar2 = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                cc.s.h(zzbgVar2);
                cc.s.e(string);
                R(string, true);
                S(new bc.e0(this, zzbgVar2, string, 10));
                parcel2.writeNoException();
                return true;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                t(zzrVar4);
                parcel2.writeNoException();
                return true;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                byte b2 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                f(zzrVar5);
                String str = zzrVar5.f5426a;
                cc.s.h(str);
                try {
                    List<r3> list2 = (List) p3Var.J().z1(new d1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (r3 r3Var : list2) {
                        if (b2 != false || !s3.Q1(r3Var.f27135c)) {
                            arrayList2.add(new zzpl(r3Var));
                        }
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e4) {
                    e = e4;
                    p3Var.x().B.d(j0.A1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e10) {
                    e = e10;
                    p3Var.x().B.d(j0.A1(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) com.google.android.gms.internal.measurement.z.a(parcel, zzbg.CREATOR);
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                byte[] bArrX = x(zzbgVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrX);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                k(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                String strM = M(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strM);
                return true;
            case 12:
                zzah zzahVar = (zzah) com.google.android.gms.internal.measurement.z.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                h(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) com.google.android.gms.internal.measurement.z.a(parcel, zzah.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                cc.s.h(zzahVar2);
                cc.s.h(zzahVar2.f5399g);
                cc.s.e(zzahVar2.f5397a);
                R(zzahVar2.f5397a, true);
                S(new re.a(29, this, new zzah(zzahVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.google.android.gms.internal.measurement.z.f5276a;
                z10 = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listI = I(string6, string7, z10, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.google.android.gms.internal.measurement.z.f5276a;
                z10 = parcel.readInt() != 0;
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listG = g(string8, string9, string10, z10);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listN = N(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listN);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.google.android.gms.internal.measurement.z.d(parcel);
                List listO = o(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                m(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                B(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                Q(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                zzao zzaoVarA = A(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarA == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarA.writeToParcel(parcel2, 1);
                return true;
            case 24:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                f(zzrVar14);
                String str2 = zzrVar14.f5426a;
                cc.s.h(str2);
                if (p3Var.b0().C1(null, u.Y0)) {
                    try {
                        list = (List) p3Var.J().A1(new h1(this, zzrVar14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e11) {
                        p3Var.x().B.d(j0.A1(str2), e11, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) p3Var.J().z1(new h1(this, zzrVar14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e12) {
                        p3Var.x().B.d(j0.A1(str2), e12, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                p(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                u(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                G(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) com.google.android.gms.internal.measurement.z.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    a0Var = iInterfaceQueryLocalInterface instanceof b0 ? (b0) iInterfaceQueryLocalInterface : new a0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                q(zzrVar18, zzooVar, a0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) com.google.android.gms.internal.measurement.z.a(parcel, zzaf.CREATOR);
                com.google.android.gms.internal.measurement.z.d(parcel);
                w(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.z.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.z.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    yVar = iInterfaceQueryLocalInterface2 instanceof z ? (z) iInterfaceQueryLocalInterface2 : new y(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 0);
                }
                com.google.android.gms.internal.measurement.z.d(parcel);
                D(zzrVar20, bundle3, yVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void e(Runnable runnable) {
        p3 p3Var = this.f26968d;
        if (p3Var.J().y1()) {
            runnable.run();
        } else {
            p3Var.J().D1(runnable);
        }
    }

    public final void f(zzr zzrVar) {
        cc.s.h(zzrVar);
        String str = zzrVar.f5426a;
        cc.s.e(str);
        R(str, false);
        this.f26968d.h0().w1(zzrVar.f5428d);
    }

    @Override // zc.x
    public final List g(String str, String str2, String str3, boolean z10) {
        R(str, true);
        p3 p3Var = this.f26968d;
        try {
            List<r3> list = (List) p3Var.J().z1(new g1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (r3 r3Var : list) {
                if (z10 || !s3.Q1(r3Var.f27135c)) {
                    arrayList.add(new zzpl(r3Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            p3Var.x().B.d(j0.A1(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e10) {
            e = e10;
            p3Var.x().B.d(j0.A1(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // zc.x
    public final void h(zzah zzahVar, zzr zzrVar) {
        cc.s.h(zzahVar);
        cc.s.h(zzahVar.f5399g);
        f(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f5397a = zzrVar.f5426a;
        S(new bc.e0(this, zzahVar2, zzrVar, 8));
    }

    @Override // zc.x
    public final void k(long j, String str, String str2, String str3) {
        S(new f1(this, str2, str3, str, j, 0));
    }

    @Override // zc.x
    public final void m(zzr zzrVar) {
        String str = zzrVar.f5426a;
        cc.s.e(str);
        R(str, false);
        S(new e1(this, zzrVar, 3));
    }

    @Override // zc.x
    public final List o(String str, String str2, String str3) {
        R(str, true);
        p3 p3Var = this.f26968d;
        try {
            return (List) p3Var.J().z1(new g1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            p3Var.x().B.c(e4, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // zc.x
    public final void p(zzr zzrVar) {
        cc.s.e(zzrVar.f5426a);
        cc.s.h(zzrVar.O);
        e(new e1(this, zzrVar, 6));
    }

    @Override // zc.x
    public final void q(zzr zzrVar, zzoo zzooVar, b0 b0Var) {
        f(zzrVar);
        String str = zzrVar.f5426a;
        cc.s.h(str);
        this.f26968d.J().B1(new o.e(this, str, zzooVar, b0Var, 2, false));
    }

    @Override // zc.x
    public final void s(zzbg zzbgVar, zzr zzrVar) {
        cc.s.h(zzbgVar);
        f(zzrVar);
        S(new bc.e0(this, zzbgVar, zzrVar, 9));
    }

    @Override // zc.x
    public final void t(zzr zzrVar) {
        f(zzrVar);
        S(new e1(this, zzrVar, 2));
    }

    @Override // zc.x
    public final void u(zzr zzrVar) {
        cc.s.e(zzrVar.f5426a);
        cc.s.h(zzrVar.O);
        e(new e1(this, zzrVar, 5));
    }

    @Override // zc.x
    public final void w(zzr zzrVar, zzaf zzafVar) {
        f(zzrVar);
        S(new bc.e0(this, zzrVar, zzafVar, 12, false));
    }

    @Override // zc.x
    public final byte[] x(zzbg zzbgVar, String str) {
        cc.s.e(str);
        cc.s.h(zzbgVar);
        R(str, true);
        p3 p3Var = this.f26968d;
        su.b bVar = p3Var.x().J;
        c1 c1Var = p3Var.H;
        f0 f0Var = c1Var.F;
        String str2 = zzbgVar.f5405a;
        bVar.c(f0Var.a(str2), "Log and bundle. event");
        p3Var.C0().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) p3Var.J().A1(new v0(this, zzbgVar, str)).get();
            if (bArr == null) {
                p3Var.x().B.c(j0.A1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            p3Var.C0().getClass();
            p3Var.x().J.e("Log and bundle processed. event, size, time_ms", c1Var.F.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            p3Var.x().B.e("Failed to log and bundle. appId, event, error", j0.A1(str), c1Var.F.a(str2), e);
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            p3Var.x().B.e("Failed to log and bundle. appId, event, error", j0.A1(str), c1Var.F.a(str2), e);
            return null;
        }
    }

    @Override // zc.x
    public final void z(zzpl zzplVar, zzr zzrVar) {
        cc.s.h(zzplVar);
        f(zzrVar);
        S(new bc.e0(this, zzplVar, zzrVar, 11));
    }
}

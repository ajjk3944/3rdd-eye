package androidx.work.multiprocess;

import T1.C1598j;
import T1.I;
import T1.z;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.work.multiprocess.c;
import androidx.work.multiprocess.d;
import c2.C2047C;
import c2.C2049E;
import c2.C2052b;
import c2.C2055e;
import c2.RunnableC2046B;
import c2.RunnableC2048D;
import c2.s;
import c2.u;
import d2.C4268c;
import e2.InterfaceC4306b;
import g2.C4385i;
import g2.C4386j;
import g2.C4387k;
import g2.l;
import h2.C4407a;
import h2.C4410d;
import h2.m;
import h2.n;
import h2.o;
import java.util.UUID;

/* compiled from: IWorkManagerImpl.java */
/* loaded from: classes.dex */
public interface b extends IInterface {

    /* renamed from: h8, reason: collision with root package name */
    public static final String f16982h8 = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', '.');

    void a(String str, c cVar) throws RemoteException;

    void o(String str, c cVar) throws RemoteException;

    void u(byte[] bArr, c cVar) throws RemoteException;

    /* compiled from: IWorkManagerImpl.java */
    public static abstract class a extends Binder implements b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f16983b = 0;

        /* compiled from: IWorkManagerImpl.java */
        /* renamed from: androidx.work.multiprocess.b$a$a, reason: collision with other inner class name */
        public static class C0270a implements b {

            /* renamed from: b, reason: collision with root package name */
            public IBinder f16984b;

            @Override // androidx.work.multiprocess.b
            public final void a(String str, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16982h8);
                    parcelObtain.writeString("CloseSessionWorker");
                    parcelObtain.writeStrongInterface(cVar);
                    this.f16984b.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f16984b;
            }

            @Override // androidx.work.multiprocess.b
            public final void o(String str, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16982h8);
                    parcelObtain.writeString("InitWorker");
                    parcelObtain.writeStrongInterface(cVar);
                    this.f16984b.transact(5, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.work.multiprocess.b
            public final void u(byte[] bArr, c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f16982h8);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeStrongInterface(cVar);
                    this.f16984b.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
            String str = b.f16982h8;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    c cVarV = c.a.v(parcel.readStrongBinder());
                    z zVar = ((i) this).f17016c;
                    try {
                        new C4386j(zVar.f12233d.c(), cVarV, ((C1598j) zVar.a(((o) C4407a.b(bArrCreateByteArray, o.CREATOR)).f38183b)).f12183d).a();
                    } catch (Throwable th) {
                        d.a.a(cVarV, th);
                    }
                    return true;
                case 2:
                    String string = parcel.readString();
                    byte[] bArrCreateByteArray2 = parcel.createByteArray();
                    c cVarV2 = c.a.v(parcel.readStrongBinder());
                    z zVar2 = ((i) this).f17016c;
                    try {
                        new C4385i(zVar2.f12233d.c(), cVarV2, I.a(zVar2, string, ((n) C4407a.b(bArrCreateByteArray2, n.CREATOR)).f38182b).f12183d).a();
                    } catch (Throwable th2) {
                        d.a.a(cVarV2, th2);
                    }
                    return true;
                case 3:
                    ((i) this).u(parcel.createByteArray(), c.a.v(parcel.readStrongBinder()));
                    return true;
                case 4:
                    String string2 = parcel.readString();
                    c cVarV3 = c.a.v(parcel.readStrongBinder());
                    z zVar3 = ((i) this).f17016c;
                    try {
                        UUID uuidFromString = UUID.fromString(string2);
                        zVar3.getClass();
                        C2052b c2052b = new C2052b(zVar3, uuidFromString);
                        zVar3.f12233d.d(c2052b);
                        new C4387k(zVar3.f12233d.c(), cVarV3, c2052b.f18416b.f12183d).a();
                    } catch (Throwable th3) {
                        d.a.a(cVarV3, th3);
                    }
                    return true;
                case 5:
                    ((i) this).o(parcel.readString(), c.a.v(parcel.readStrongBinder()));
                    return true;
                case 6:
                    ((i) this).a(parcel.readString(), c.a.v(parcel.readStrongBinder()));
                    return true;
                case 7:
                    c cVarV4 = c.a.v(parcel.readStrongBinder());
                    z zVar4 = ((i) this).f17016c;
                    try {
                        zVar4.getClass();
                        InterfaceC4306b interfaceC4306b = zVar4.f12233d;
                        C2055e c2055e = new C2055e(zVar4);
                        interfaceC4306b.d(c2055e);
                        new l(interfaceC4306b.c(), cVarV4, c2055e.f18416b.f12183d).a();
                    } catch (Throwable th4) {
                        d.a.a(cVarV4, th4);
                    }
                    return true;
                case 8:
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    c cVarV5 = c.a.v(parcel.readStrongBinder());
                    z zVar5 = ((i) this).f17016c;
                    try {
                        m mVar = (m) C4407a.b(bArrCreateByteArray3, m.CREATOR);
                        s sVarC = zVar5.f12233d.c();
                        u uVar = new u(zVar5, mVar.f38181b);
                        zVar5.f12233d.c().execute(uVar);
                        new g2.m(sVarC, cVarV5, uVar.f18438b).a();
                    } catch (Throwable th5) {
                        d.a.a(cVarV5, th5);
                    }
                    return true;
                case 9:
                    byte[] bArrCreateByteArray4 = parcel.createByteArray();
                    c cVarV6 = c.a.v(parcel.readStrongBinder());
                    z zVar6 = ((i) this).f17016c;
                    try {
                        h2.i iVar = (h2.i) C4407a.b(bArrCreateByteArray4, h2.i.CREATOR);
                        Context context = zVar6.f12230a;
                        InterfaceC4306b interfaceC4306b2 = zVar6.f12233d;
                        s sVarC2 = interfaceC4306b2.c();
                        C2049E c2049e = new C2049E(zVar6.f12232c, interfaceC4306b2);
                        UUID uuidFromString2 = UUID.fromString(iVar.f38170b);
                        androidx.work.e eVar = iVar.f38171c.f38161b;
                        C4268c c4268c = new C4268c();
                        interfaceC4306b2.d(new RunnableC2048D(c2049e, uuidFromString2, eVar, c4268c));
                        new g2.n(sVarC2, cVarV6, c4268c).a();
                    } catch (Throwable th6) {
                        d.a.a(cVarV6, th6);
                    }
                    return true;
                case 10:
                    byte[] bArrCreateByteArray5 = parcel.createByteArray();
                    c cVarV7 = c.a.v(parcel.readStrongBinder());
                    z zVar7 = ((i) this).f17016c;
                    try {
                        C4410d c4410d = (C4410d) C4407a.b(bArrCreateByteArray5, C4410d.CREATOR);
                        InterfaceC4306b interfaceC4306b3 = zVar7.f12233d;
                        s sVarC3 = interfaceC4306b3.c();
                        C2047C c2047c = new C2047C(zVar7.f12232c, zVar7.f12235f, interfaceC4306b3);
                        Context context2 = zVar7.f12230a;
                        UUID uuidFromString3 = UUID.fromString(c4410d.f38162b);
                        androidx.work.h hVar = c4410d.f38163c;
                        C4268c c4268c2 = new C4268c();
                        interfaceC4306b3.d(new RunnableC2046B(c2047c, c4268c2, uuidFromString3, hVar, context2));
                        new g2.o(sVarC3, cVarV7, c4268c2).a();
                    } catch (Throwable th7) {
                        d.a.a(cVarV7, th7);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i10);
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }
    }
}

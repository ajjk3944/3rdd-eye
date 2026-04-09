package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7095a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f7096b;

    public static class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f7097a;

        /* renamed from: b, reason: collision with root package name */
        private final s4 f7098b;

        public a(com.applovin.impl.sdk.o oVar, s4 s4Var) {
            this.f7097a = oVar;
            this.f7098b = s4Var;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7097a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f7097a, this.f7098b, iNextInt, new Runnable() { // from class: com.applovin.impl.fd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6032a.a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                parcelObtain.writeLong(iNextInt);
                parcelObtain.writeString(com.applovin.impl.sdk.k.o().getPackageName());
                parcelObtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, parcelObtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7097a.a("LicenseVerificationManager", "Failed to check license", e10);
                }
                a();
                this.f7098b.a((Object) e10);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.o.a()) {
                this.f7097a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f7098b.a((Object) illegalStateException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7097a.d("LicenseVerificationManager", "Failed to unbind license service", e10);
                }
            }
        }
    }

    public static final class b extends Binder {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f7099a;

        /* renamed from: b, reason: collision with root package name */
        private final s4 f7100b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7101c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f7102d;

        public b(com.applovin.impl.sdk.o oVar, s4 s4Var, int i10, Runnable runnable) {
            this.f7099a = oVar;
            this.f7100b = s4Var;
            this.f7101c = i10;
            this.f7102d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7099a.a("LicenseVerificationManager", "Verified with code " + i12);
                }
                this.f7100b.b(p2.a().b(string).a(string2).b(i12).a(this.f7101c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f7102d.run();
                return true;
            } catch (Throwable th) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7099a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th);
                    }
                    this.f7100b.a((Object) new Exception(th));
                    this.f7102d.run();
                    return false;
                } catch (Throwable th2) {
                    this.f7102d.run();
                    throw th2;
                }
            }
        }
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.f7095a = kVar;
        this.f7096b = kVar.O();
    }

    public s4 a(long j10) {
        s4 s4Var = new s4("verify_license");
        if (j10 > 0) {
            i6.a(j10, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f7095a);
        }
        try {
            if (!com.applovin.impl.sdk.k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f7096b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7096b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
            }
            return s4Var;
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7096b.a("LicenseVerificationManager", "Failed to verify license", e10);
            }
            s4Var.a((Object) e10);
            return s4Var;
        }
    }
}

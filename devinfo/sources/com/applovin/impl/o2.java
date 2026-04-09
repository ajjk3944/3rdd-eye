package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4934a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4935b;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f4936a;

        /* renamed from: b, reason: collision with root package name */
        private final s4 f4937b;

        public a(com.applovin.impl.sdk.o oVar, s4 s4Var) {
            this.f4936a = oVar;
            this.f4937b = s4Var;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4936a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f4936a, this.f4937b, iNextInt, new v9(1, this));
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
            } catch (Exception e2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4936a.a("LicenseVerificationManager", "Failed to check license", e2);
                }
                a();
                this.f4937b.a((Object) e2);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.o.a()) {
                this.f4936a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f4937b.a((Object) illegalStateException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4936a.d("LicenseVerificationManager", "Failed to unbind license service", e2);
                }
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class b extends Binder {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f4938a;

        /* renamed from: b, reason: collision with root package name */
        private final s4 f4939b;

        /* renamed from: c, reason: collision with root package name */
        private final int f4940c;

        /* renamed from: d, reason: collision with root package name */
        private final Runnable f4941d;

        public b(com.applovin.impl.sdk.o oVar, s4 s4Var, int i4, Runnable runnable) {
            this.f4938a = oVar;
            this.f4939b = s4Var;
            this.f4940c = i4;
            this.f4941d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i10) {
            if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i10);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i11 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4938a.a("LicenseVerificationManager", "Verified with code " + i11);
                }
                this.f4939b.b(p2.a().b(string).a(string2).b(i11).a(this.f4940c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                this.f4941d.run();
                return true;
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f4938a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th2);
                    }
                    this.f4939b.a((Object) new Exception(th2));
                    this.f4941d.run();
                    return false;
                } catch (Throwable th3) {
                    this.f4941d.run();
                    throw th3;
                }
            }
        }
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.f4934a = kVar;
        this.f4935b = kVar.O();
    }

    public s4 a(long j) {
        s4 s4Var = new s4("verify_license");
        if (j > 0) {
            i6.a(j, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f4934a);
        }
        try {
            if (!com.applovin.impl.sdk.k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f4935b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4935b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
            }
            return s4Var;
        } catch (Exception e2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4935b.a("LicenseVerificationManager", "Failed to verify license", e2);
            }
            s4Var.a((Object) e2);
            return s4Var;
        }
    }
}

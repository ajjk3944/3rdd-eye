package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes3.dex */
public class c {

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f15386a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f15387b;

        public b(String str, boolean z10) {
            this.f15386a = str;
            this.f15387b = z10;
        }

        public String a() {
            return this.f15386a;
        }

        public boolean b() {
            return this.f15387b;
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    public final class ServiceConnectionC0270c implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f15389a;

        /* renamed from: b, reason: collision with root package name */
        boolean f15390b;

        private ServiceConnectionC0270c() {
            this.f15389a = new LinkedBlockingQueue<>(1);
            this.f15390b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.f15390b) {
                throw new IllegalStateException();
            }
            this.f15390b = true;
            return this.f15389a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            try {
                this.f15389a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final class d implements IInterface {

        /* renamed from: a, reason: collision with root package name */
        private IBinder f15392a;

        public d(IBinder iBinder) {
            this.f15392a = iBinder;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f15392a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f15392a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f15392a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th) {
                try {
                    q0.b("AdvertisingIdClient", th.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0270c serviceConnectionC0270c = new ServiceConnectionC0270c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC0270c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC0270c.a());
                return new b(dVar.getId(), dVar.a(true));
            } catch (Exception e10) {
                throw e10;
            }
        } finally {
            context.unbindService(serviceConnectionC0270c);
        }
    }
}

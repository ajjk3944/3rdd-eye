package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.fp0;
import com.yandex.mobile.ads.impl.kc;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class GmsServiceAdvertisingInfoReader implements kc, IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f23647a;

    public GmsServiceAdvertisingInfoReader(IBinder binder) {
        l.f(binder, "binder");
        this.f23647a = binder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f23647a;
    }

    @Override // com.yandex.mobile.ads.impl.kc
    public Boolean readAdTrackingLimited() {
        Parcel parcelObtain = Parcel.obtain();
        l.e(parcelObtain, "obtain(...)");
        Parcel parcelObtain2 = Parcel.obtain();
        l.e(parcelObtain2, "obtain(...)");
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z10 = true;
                parcelObtain.writeInt(1);
                this.f23647a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                if (parcelObtain2.readInt() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            } catch (Throwable unused) {
                fp0.c(new Object[0]);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // com.yandex.mobile.ads.impl.kc
    public String readAdvertisingId() {
        Parcel parcelObtain = Parcel.obtain();
        l.e(parcelObtain, "obtain(...)");
        Parcel parcelObtain2 = Parcel.obtain();
        l.e(parcelObtain2, "obtain(...)");
        try {
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f23647a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } catch (Throwable unused) {
                fp0.c(new Object[0]);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return null;
            }
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}

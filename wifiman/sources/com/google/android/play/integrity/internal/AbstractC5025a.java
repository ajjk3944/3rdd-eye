package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5025a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f38122a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38123b;

    protected AbstractC5025a(IBinder iBinder, String str) {
        this.f38122a = iBinder;
        this.f38123b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38122a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f38123b);
        return parcelObtain;
    }

    protected final void c(int i10, Parcel parcel) {
        try {
            this.f38122a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

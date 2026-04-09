package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g0 extends x implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f19748a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19749b;

    public g0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.f19748a = new AtomicReference();
    }

    public static final Object T(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e2) {
            Log.w("AM", je.u.u("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e2);
            throw e2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x
    public final boolean O(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) y.a(parcel, Bundle.CREATOR);
        y.d(parcel);
        X2(bundle);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle S(long j) {
        Bundle bundle;
        AtomicReference atomicReference = this.f19748a;
        synchronized (atomicReference) {
            if (!this.f19749b) {
                try {
                    atomicReference.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f19748a.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void X2(Bundle bundle) {
        AtomicReference atomicReference = this.f19748a;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f19749b = true;
                } finally {
                    this.f19748a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

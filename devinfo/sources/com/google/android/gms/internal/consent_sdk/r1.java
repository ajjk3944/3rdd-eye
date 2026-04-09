package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r1 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f19503a;

    public r1(int i4, String str) {
        super(str);
        this.f19503a = i4;
    }

    public final FormError a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.f19503a, super.getMessage());
    }

    public r1(int i4, IOException iOException, String str) {
        super(str, iOException);
        this.f19503a = i4;
    }
}

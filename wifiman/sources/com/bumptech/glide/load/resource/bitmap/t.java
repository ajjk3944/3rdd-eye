package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class t implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final l f34581a;

    public t(l lVar) {
        this.f34581a = lVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C2.g gVar) {
        return this.f34581a.d(parcelFileDescriptor, i10, i11, gVar);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, C2.g gVar) {
        return e(parcelFileDescriptor) && this.f34581a.o(parcelFileDescriptor);
    }
}

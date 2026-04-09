package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* loaded from: classes.dex */
final class ParcelFileDescriptorRewinder$InternalRewinder {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelFileDescriptor f6536a;

    public ParcelFileDescriptorRewinder$InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6536a = parcelFileDescriptor;
    }

    public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
        ParcelFileDescriptor parcelFileDescriptor = this.f6536a;
        try {
            Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
            return parcelFileDescriptor;
        } catch (ErrnoException e6) {
            throw new IOException(e6);
        }
    }
}

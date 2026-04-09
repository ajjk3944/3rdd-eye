package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e<ParcelFileDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f22293a;

    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f22294a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f22294a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            ParcelFileDescriptor parcelFileDescriptor = this.f22294a;
            try {
                Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return parcelFileDescriptor;
            } catch (ErrnoException e4) {
                throw new IOException(e4);
            }
        }
    }

    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f22293a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.e
    public final ParcelFileDescriptor a() throws IOException {
        return this.f22293a.rewind();
    }

    public final ParcelFileDescriptor c() throws IOException {
        return this.f22293a.rewind();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
    }
}

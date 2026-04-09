package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements e {

    /* renamed from: a, reason: collision with root package name */
    private final InternalRewinder f34260a;

    private static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f34261a;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f34261a = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f34261a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f34261a;
            } catch (ErrnoException e10) {
                throw new IOException(e10);
            }
        }
    }

    public static final class a implements e.a {
        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f34260a = new InternalRewinder(parcelFileDescriptor);
    }

    public static boolean c() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() {
        return this.f34260a.rewind();
    }
}

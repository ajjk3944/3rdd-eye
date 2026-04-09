package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public final class UploadDataProviders {

    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f23794a;

        public a(File file) {
            this.f23794a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() {
            return new FileInputStream(this.f23794a).getChannel();
        }
    }

    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ParcelFileDescriptor f23795a;

        public b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f23795a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.d
        public FileChannel a() throws IOException {
            if (this.f23795a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f23795a).getChannel();
            }
            this.f23795a.close();
            throw new IllegalArgumentException("Not a file: " + this.f23795a);
        }
    }

    public static final class c extends UploadDataProvider {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f23796a;

        public /* synthetic */ c(ByteBuffer byteBuffer, a aVar) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f23796a.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            if (byteBuffer.remaining() >= this.f23796a.remaining()) {
                byteBuffer.put(this.f23796a);
            } else {
                int iLimit = this.f23796a.limit();
                ByteBuffer byteBuffer2 = this.f23796a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.f23796a);
                this.f23796a.limit(iLimit);
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f23796a.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        public c(ByteBuffer byteBuffer) {
            this.f23796a = byteBuffer;
        }
    }

    public interface d {
        FileChannel a();
    }

    public static final class e extends UploadDataProvider {

        /* renamed from: a, reason: collision with root package name */
        public volatile FileChannel f23797a;

        /* renamed from: b, reason: collision with root package name */
        public final d f23798b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f23799c;

        public /* synthetic */ e(d dVar, a aVar) {
            this(dVar);
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f23797a;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final FileChannel d() {
            if (this.f23797a == null) {
                synchronized (this.f23799c) {
                    try {
                        if (this.f23797a == null) {
                            this.f23797a = this.f23798b.a();
                        }
                    } finally {
                    }
                }
            }
            return this.f23797a;
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return d().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (!byteBuffer.hasRemaining()) {
                throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
            }
            FileChannel fileChannelD = d();
            int i10 = 0;
            while (i10 == 0) {
                int i11 = fileChannelD.read(byteBuffer);
                if (i11 == -1) {
                    break;
                } else {
                    i10 += i11;
                }
            }
            uploadDataSink.onReadSucceeded(false);
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            d().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        public e(d dVar) {
            this.f23799c = new Object();
            this.f23798b = dVar;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new e(new a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new e(new b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i10, int i11) {
        return new c(ByteBuffer.wrap(bArr, i10, i11).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}

package h3;

import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4412a {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference<byte[]> f38190a = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: h3.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f38193a;

        /* renamed from: b, reason: collision with root package name */
        public final int f38194b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f38195c;

        public b(byte[] bArr, int i, int i10) {
            this.f38195c = bArr;
            this.f38193a = i;
            this.f38194b = i10;
        }
    }

    public static MappedByteBuffer a(File file) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, Constants.REVENUE_AMOUNT_KEY);
            try {
                channel = randomAccessFile.getChannel();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = channel;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        AtomicReference<byte[]> atomicReference = f38190a;
        byte[] andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i < 0) {
                atomicReference.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, i);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static void d(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        c(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            channel = randomAccessFile.getChannel();
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (channel != null) {
                try {
                    channel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: h3.a$a, reason: collision with other inner class name */
    public static class C0463a extends InputStream {

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f38191b;

        /* renamed from: c, reason: collision with root package name */
        public int f38192c = -1;

        public C0463a(ByteBuffer byteBuffer) {
            this.f38191b = byteBuffer;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f38191b.remaining();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i) {
            this.f38192c = this.f38191b.position();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read() {
            ByteBuffer byteBuffer = this.f38191b;
            if (byteBuffer.hasRemaining()) {
                return byteBuffer.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() throws IOException {
            int i = this.f38192c;
            if (i == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f38191b.position(i);
        }

        @Override // java.io.InputStream
        public final long skip(long j4) {
            ByteBuffer byteBuffer = this.f38191b;
            if (!byteBuffer.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j4, byteBuffer.remaining());
            byteBuffer.position((int) (byteBuffer.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i10) {
            ByteBuffer byteBuffer = this.f38191b;
            if (!byteBuffer.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i10, byteBuffer.remaining());
            byteBuffer.get(bArr, i, iMin);
            return iMin;
        }
    }
}

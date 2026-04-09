package W2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import org.snmp4j.transport.TLSTM;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReference f23572a = new AtomicReference();

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f23575a;

        /* renamed from: b, reason: collision with root package name */
        final int f23576b;

        /* renamed from: c, reason: collision with root package name */
        final byte[] f23577c;

        b(byte[] bArr, int i10, int i11) {
            this.f23577c = bArr;
            this.f23575a = i10;
            this.f23576b = i11;
        }
    }

    public static ByteBuffer a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileChannel channel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, SnmpConfigurator.O_RETRIES);
            try {
                channel = randomAccessFile.getChannel();
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
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(TLSTM.TLS_MAX_FRAGMENT_SIZE);
        byte[] bArr = (byte[]) f23572a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[TLSTM.TLS_MAX_FRAGMENT_SIZE];
        }
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 < 0) {
                f23572a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    private static b c(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    public static byte[] e(ByteBuffer byteBuffer) {
        b bVarC = c(byteBuffer);
        if (bVarC != null && bVarC.f23575a == 0 && bVarC.f23576b == bVarC.f23577c.length) {
            return byteBuffer.array();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        d(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static void f(ByteBuffer byteBuffer, File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        d(byteBuffer);
        FileChannel channel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th2) {
            th = th2;
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
        } catch (Throwable th3) {
            th = th3;
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

    public static InputStream g(ByteBuffer byteBuffer) {
        return new C0875a(byteBuffer);
    }

    /* renamed from: W2.a$a, reason: collision with other inner class name */
    private static class C0875a extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f23573a;

        /* renamed from: b, reason: collision with root package name */
        private int f23574b = -1;

        C0875a(ByteBuffer byteBuffer) {
            this.f23573a = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f23573a.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f23574b = this.f23573a.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f23573a.hasRemaining()) {
                return this.f23573a.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            int i10 = this.f23574b;
            if (i10 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f23573a.position(i10);
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (!this.f23573a.hasRemaining()) {
                return -1L;
            }
            long jMin = Math.min(j10, available());
            this.f23573a.position((int) (r0.position() + jMin));
            return jMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (!this.f23573a.hasRemaining()) {
                return -1;
            }
            int iMin = Math.min(i11, available());
            this.f23573a.get(bArr, i10, iMin);
            return iMin;
        }
    }
}

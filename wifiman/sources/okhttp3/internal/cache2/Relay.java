package okhttp3.internal.cache2;

import Yg.J;
import ej.C5481e;
import ej.E;
import ej.InterfaceC5476D;
import ej.h;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0002@AJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bR$\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000bR\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u00102\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b0\u00101R\"\u00108\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00104\u001a\u0004\b\"\u00105\"\u0004\b6\u00107R\u0017\u00109\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b\u001e\u0010/\u001a\u0004\b\u0015\u00101R\"\u0010?\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\b'\u0010<\"\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lej/h;", "prefix", "", "upstreamSize", "metadataSize", "LYg/J;", SnmpConfigurator.O_OPERATION, "(Lej/h;JJ)V", "p", "(J)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/io/RandomAccessFile;", "Ljava/io/RandomAccessFile;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/io/RandomAccessFile;", "k", "(Ljava/io/RandomAccessFile;)V", "file", "Lej/D;", SnmpConfigurator.O_BIND_ADDRESS, "Lej/D;", "g", "()Lej/D;", "setUpstream", "(Lej/D;)V", "upstream", SnmpConfigurator.O_COMMUNITY, "J", "i", "()J", "m", "upstreamPos", "d", "Lej/h;", "metadata", "bufferMaxSize", "Ljava/lang/Thread;", "f", "Ljava/lang/Thread;", "j", "()Ljava/lang/Thread;", SnmpConfigurator.O_CONTEXT_NAME, "(Ljava/lang/Thread;)V", "upstreamReader", "Lej/e;", "Lej/e;", "h", "()Lej/e;", "upstreamBuffer", "", "Z", "()Z", "setComplete", "(Z)V", "complete", "buffer", "", "I", "()I", "l", "(I)V", "sourceCount", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Relay {

    /* renamed from: l, reason: collision with root package name */
    public static final h f56315l;

    /* renamed from: m, reason: collision with root package name */
    public static final h f56316m;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private RandomAccessFile file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5476D upstream;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long upstreamPos;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h metadata;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long bufferMaxSize;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Thread upstreamReader;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C5481e upstreamBuffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean complete;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C5481e buffer;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int sourceCount;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lej/D;", "Lej/e;", "sink", "", "byteCount", "U", "(Lej/e;J)J", "Lej/E;", SnmpConfigurator.O_COMMUNITY, "()Lej/E;", "LYg/J;", "close", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lej/E;", "timeout", "Lokhttp3/internal/cache2/FileOperator;", SnmpConfigurator.O_BIND_ADDRESS, "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "J", "sourcePos", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RelaySource implements InterfaceC5476D {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final E timeout;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private FileOperator fileOperator;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long sourcePos;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Relay f56330d;

        @Override // ej.InterfaceC5476D
        public long U(C5481e sink, long byteCount) throws IOException {
            char c10;
            AbstractC6492s.i(sink, "sink");
            if (this.fileOperator == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = this.f56330d;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.sourcePos != relay.getUpstreamPos()) {
                            long upstreamPos = relay.getUpstreamPos() - relay.getBuffer().D0();
                            if (this.sourcePos >= upstreamPos) {
                                long jMin = Math.min(byteCount, relay.getUpstreamPos() - this.sourcePos);
                                relay.getBuffer().S(sink, this.sourcePos - upstreamPos, jMin);
                                this.sourcePos += jMin;
                                return jMin;
                            }
                            c10 = 2;
                        } else if (!relay.getComplete()) {
                            if (relay.getUpstreamReader() == null) {
                                relay.n(Thread.currentThread());
                                c10 = 1;
                                break;
                            }
                            this.timeout.j(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (c10 == 2) {
                    long jMin2 = Math.min(byteCount, this.f56330d.getUpstreamPos() - this.sourcePos);
                    FileOperator fileOperator = this.fileOperator;
                    AbstractC6492s.f(fileOperator);
                    fileOperator.a(this.sourcePos + 32, sink, jMin2);
                    this.sourcePos += jMin2;
                    return jMin2;
                }
                try {
                    InterfaceC5476D upstream = this.f56330d.getUpstream();
                    AbstractC6492s.f(upstream);
                    long jU = upstream.U(this.f56330d.getUpstreamBuffer(), this.f56330d.getBufferMaxSize());
                    if (jU == -1) {
                        Relay relay2 = this.f56330d;
                        relay2.a(relay2.getUpstreamPos());
                        Relay relay3 = this.f56330d;
                        synchronized (relay3) {
                            relay3.n(null);
                            AbstractC6492s.g(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            J j10 = J.f24997a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(jU, byteCount);
                    this.f56330d.getUpstreamBuffer().S(sink, 0L, jMin3);
                    this.sourcePos += jMin3;
                    FileOperator fileOperator2 = this.fileOperator;
                    AbstractC6492s.f(fileOperator2);
                    fileOperator2.b(this.f56330d.getUpstreamPos() + 32, this.f56330d.getUpstreamBuffer().clone(), jU);
                    Relay relay4 = this.f56330d;
                    synchronized (relay4) {
                        try {
                            relay4.getBuffer().Z(relay4.getUpstreamBuffer(), jU);
                            if (relay4.getBuffer().D0() > relay4.getBufferMaxSize()) {
                                relay4.getBuffer().d(relay4.getBuffer().D0() - relay4.getBufferMaxSize());
                            }
                            relay4.m(relay4.getUpstreamPos() + jU);
                            J j11 = J.f24997a;
                        } finally {
                        }
                    }
                    Relay relay5 = this.f56330d;
                    synchronized (relay5) {
                        relay5.n(null);
                        AbstractC6492s.g(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th3) {
                    Relay relay6 = this.f56330d;
                    synchronized (relay6) {
                        relay6.n(null);
                        AbstractC6492s.g(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        J j12 = J.f24997a;
                        throw th3;
                    }
                }
            }
        }

        @Override // ej.InterfaceC5476D
        /* renamed from: c, reason: from getter */
        public E getTimeout() {
            return this.timeout;
        }

        @Override // ej.InterfaceC5476D, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = this.f56330d;
            synchronized (relay) {
                try {
                    relay.l(relay.getSourceCount() - 1);
                    if (relay.getSourceCount() == 0) {
                        RandomAccessFile file = relay.getFile();
                        relay.k(null);
                        randomAccessFile = file;
                    }
                    J j10 = J.f24997a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (randomAccessFile != null) {
                Util.m(randomAccessFile);
            }
        }
    }

    static {
        h.a aVar = h.f46470d;
        f56315l = aVar.d("OkHttp cache v1\n");
        f56316m = aVar.d("OkHttp DIRTY :(\n");
    }

    private final void o(h prefix, long upstreamSize, long metadataSize) throws IOException {
        C5481e c5481e = new C5481e();
        c5481e.R(prefix);
        c5481e.P0(upstreamSize);
        c5481e.P0(metadataSize);
        if (c5481e.D0() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.file;
        AbstractC6492s.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        AbstractC6492s.h(channel, "file!!.channel");
        new FileOperator(channel).b(0L, c5481e, 32L);
    }

    private final void p(long upstreamSize) throws IOException {
        C5481e c5481e = new C5481e();
        c5481e.R(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        AbstractC6492s.f(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        AbstractC6492s.h(channel, "file!!.channel");
        new FileOperator(channel).b(32 + upstreamSize, c5481e, this.metadata.b0());
    }

    public final void a(long upstreamSize) throws IOException {
        p(upstreamSize);
        RandomAccessFile randomAccessFile = this.file;
        AbstractC6492s.f(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        o(f56315l, upstreamSize, this.metadata.b0());
        RandomAccessFile randomAccessFile2 = this.file;
        AbstractC6492s.f(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            J j10 = J.f24997a;
        }
        InterfaceC5476D interfaceC5476D = this.upstream;
        if (interfaceC5476D != null) {
            Util.m(interfaceC5476D);
        }
        this.upstream = null;
    }

    /* renamed from: b, reason: from getter */
    public final C5481e getBuffer() {
        return this.buffer;
    }

    /* renamed from: c, reason: from getter */
    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getComplete() {
        return this.complete;
    }

    /* renamed from: e, reason: from getter */
    public final RandomAccessFile getFile() {
        return this.file;
    }

    /* renamed from: f, reason: from getter */
    public final int getSourceCount() {
        return this.sourceCount;
    }

    /* renamed from: g, reason: from getter */
    public final InterfaceC5476D getUpstream() {
        return this.upstream;
    }

    /* renamed from: h, reason: from getter */
    public final C5481e getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    /* renamed from: i, reason: from getter */
    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    /* renamed from: j, reason: from getter */
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final void k(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void l(int i10) {
        this.sourceCount = i10;
    }

    public final void m(long j10) {
        this.upstreamPos = j10;
    }

    public final void n(Thread thread) {
        this.upstreamReader = thread;
    }
}

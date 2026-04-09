package okhttp3.internal.cache2;

import ej.C5481e;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "Ljava/nio/channels/FileChannel;", "fileChannel", "<init>", "(Ljava/nio/channels/FileChannel;)V", "", "pos", "Lej/e;", "source", "byteCount", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(JLej/e;J)V", "sink", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/nio/channels/FileChannel;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FileOperator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        AbstractC6492s.i(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void a(long pos, C5481e sink, long byteCount) throws IOException {
        AbstractC6492s.i(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferTo = this.fileChannel.transferTo(pos, byteCount, sink);
            pos += jTransferTo;
            byteCount -= jTransferTo;
        }
    }

    public final void b(long pos, C5481e source, long byteCount) throws IOException {
        AbstractC6492s.i(source, "source");
        if (byteCount < 0 || byteCount > source.D0()) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, pos, byteCount);
            pos += jTransferFrom;
            byteCount -= jTransferFrom;
        }
    }
}

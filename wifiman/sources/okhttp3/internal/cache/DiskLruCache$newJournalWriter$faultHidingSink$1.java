package okhttp3.internal.cache;

import Yg.J;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends AbstractC6494u implements InterfaceC6835l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DiskLruCache f56306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.f56306a = diskLruCache;
    }

    public final void a(IOException it) {
        AbstractC6492s.i(it, "it");
        DiskLruCache diskLruCache = this.f56306a;
        if (!Util.f56223h || Thread.holdsLock(diskLruCache)) {
            this.f56306a.hasJournalErrors = true;
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }

    @Override // mh.InterfaceC6835l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IOException) obj);
        return J.f24997a;
    }
}

package z2;

import a3.b;
import a3.c;
import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.emc.emc.emc.xq.xq;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a extends MediaDataSource {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f25317e = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final b f25318a;

    /* renamed from: b, reason: collision with root package name */
    public long f25319b = -2147483648L;

    /* renamed from: c, reason: collision with root package name */
    public final Context f25320c;

    /* renamed from: d, reason: collision with root package name */
    public final xq f25321d;

    public a(Context context, xq xqVar) {
        this.f25320c = context;
        this.f25321d = xqVar;
        this.f25318a = new c(xqVar);
    }

    public static a e(Context context, xq xqVar) {
        a aVar = new a(context, xqVar);
        f25317e.put(xqVar.aa(), aVar);
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f25321d.vk();
        b bVar = this.f25318a;
        if (bVar != null) {
            bVar.ypw();
        }
        f25317e.remove(this.f25321d.aa());
    }

    public xq d() {
        return this.f25321d;
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        if (this.f25319b == -2147483648L) {
            if (this.f25320c == null || TextUtils.isEmpty(this.f25321d.vk())) {
                return -1L;
            }
            this.f25319b = this.f25318a.xq();
        }
        return this.f25319b;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j10, byte[] bArr, int i10, int i11) {
        int iA = this.f25318a.a(j10, bArr, i10, i11);
        int length = bArr.length;
        return iA;
    }
}

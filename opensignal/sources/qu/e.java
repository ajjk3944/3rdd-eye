package qu;

import br.l;
import cv.f0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f21080a;

    /* renamed from: d, reason: collision with root package name */
    public final long f21081d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f21082g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f21083r;

    public e(g gVar, String str, long j, ArrayList arrayList, long[] jArr) {
        l.e(str, "key");
        l.e(jArr, "lengths");
        this.f21083r = gVar;
        this.f21080a = str;
        this.f21081d = j;
        this.f21082g = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f21082g.iterator();
        while (it.hasNext()) {
            pu.b.d((f0) it.next());
        }
    }
}

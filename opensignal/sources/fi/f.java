package fi;

import android.content.ContentProviderClient;
import android.net.Uri;
import ar.k;
import br.n;
import cj.l;
import lq.b0;

/* loaded from: classes.dex */
public final class f extends n implements k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8896d = 1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8897g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8898r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(long j, vj.c cVar) {
        super(1);
        this.f8897g = j;
        this.f8898r = cVar;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f8896d) {
            case 0:
                ContentProviderClient contentProviderClient = (ContentProviderClient) obj;
                return Integer.valueOf(contentProviderClient != null ? contentProviderClient.delete((Uri) this.f8898r, "time_in_millis<?", new String[]{String.valueOf(this.f8897g)}) : 0);
            default:
                l lVar = (l) obj;
                br.l.e(lVar, "listener");
                vj.c cVar = (vj.c) this.f8898r;
                lVar.y(this.f8897g, cVar.c(), cVar.h());
                return b0.f15562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Uri uri, long j) {
        super(1);
        this.f8898r = uri;
        this.f8897g = j;
    }
}

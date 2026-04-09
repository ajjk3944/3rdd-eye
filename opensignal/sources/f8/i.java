package f8;

import android.net.Uri;
import l8.n;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final lq.h f8685a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.h f8686b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8687c;

    public i(lq.h hVar, lq.h hVar2, boolean z10) {
        this.f8685a = hVar;
        this.f8686b = hVar2;
        this.f8687c = z10;
    }

    @Override // f8.f
    public final g a(Object obj, n nVar) {
        Uri uri = (Uri) obj;
        if (!br.l.a(uri.getScheme(), "http") && !br.l.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), nVar, this.f8685a, this.f8686b, this.f8687c);
    }
}

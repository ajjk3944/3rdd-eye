package yb;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import km.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h extends ob.f implements AppSetIdClient {

    /* renamed from: k, reason: collision with root package name */
    public static final n f37513k = new n("AppSet.API", new gc.b(3), new ja.c());

    /* renamed from: i, reason: collision with root package name */
    public final Context f37514i;
    public final nb.f j;

    public h(Context context, nb.f fVar) {
        super(context, f37513k, ob.b.f30481a, ob.e.f30483b);
        this.f37514i = context;
        this.j = fVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        if (this.j.c(212800000, this.f37514i) != 0) {
            return Tasks.forException(new ob.d(new Status(17, null, null, null)));
        }
        k kVar = new k();
        kVar.f9096b = new nb.d[]{zze.zza};
        kVar.f9099e = new f();
        kVar.f9097c = false;
        kVar.f9098d = 27601;
        return b(0, new k(kVar, (nb.d[]) kVar.f9096b, kVar.f9097c, kVar.f9098d));
    }
}

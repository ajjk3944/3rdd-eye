package m8;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28953a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.o f28954b;

    public c(Context context, com.bumptech.glide.o oVar) {
        this.f28953a = context.getApplicationContext();
        this.f28954b = oVar;
    }

    @Override // m8.i
    public final void onStart() {
        s sVarC = s.c(this.f28953a);
        com.bumptech.glide.o oVar = this.f28954b;
        synchronized (sVarC) {
            ((HashSet) sVarC.f28984c).add(oVar);
            if (!sVarC.f28982a && !((HashSet) sVarC.f28984c).isEmpty()) {
                sVarC.f28982a = ((o) sVarC.f28983b).a();
            }
        }
    }

    @Override // m8.i
    public final void onStop() {
        s sVarC = s.c(this.f28953a);
        com.bumptech.glide.o oVar = this.f28954b;
        synchronized (sVarC) {
            ((HashSet) sVarC.f28984c).remove(oVar);
            if (sVarC.f28982a && ((HashSet) sVarC.f28984c).isEmpty()) {
                ((o) sVarC.f28983b).b();
                sVarC.f28982a = false;
            }
        }
    }

    @Override // m8.i
    public final void onDestroy() {
    }
}

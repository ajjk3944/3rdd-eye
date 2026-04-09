package A1;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f97a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.m f98b;

    public c(Context context, com.bumptech.glide.m mVar) {
        this.f97a = context.getApplicationContext();
        this.f98b = mVar;
    }

    @Override // A1.j
    public final void e() {
        w wVarB = w.b(this.f97a);
        com.bumptech.glide.m mVar = this.f98b;
        synchronized (wVarB) {
            ((HashSet) wVarB.f139b).remove(mVar);
            if (wVarB.f140c && ((HashSet) wVarB.f139b).isEmpty()) {
                ((p) wVarB.f141d).b();
                wVarB.f140c = false;
            }
        }
    }

    @Override // A1.j
    public final void j() {
        w wVarB = w.b(this.f97a);
        com.bumptech.glide.m mVar = this.f98b;
        synchronized (wVarB) {
            ((HashSet) wVarB.f139b).add(mVar);
            if (!wVarB.f140c && !((HashSet) wVarB.f139b).isEmpty()) {
                wVarB.f140c = ((p) wVarB.f141d).a();
            }
        }
    }

    @Override // A1.j
    public final void onDestroy() {
    }
}

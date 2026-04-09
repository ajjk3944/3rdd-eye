package j0;

import androidx.compose.material.ripple.RippleNode;
import io.sentry.t;
import java.util.LinkedHashMap;
import x1.k;

/* loaded from: classes.dex */
public final class a extends RippleNode {

    /* renamed from: y, reason: collision with root package name */
    public d f13017y;

    /* renamed from: z, reason: collision with root package name */
    public e f13018z;

    @Override // z0.l
    public final void V() throws Throwable {
        d dVar = this.f13017y;
        if (dVar != null) {
            this.f13018z = null;
            k.j(this);
            t tVar = dVar.f13027r;
            e eVar = (e) ((LinkedHashMap) tVar.f12736a).get(this);
            if (eVar != null) {
                eVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) tVar.f12736a;
                e eVar2 = (e) linkedHashMap.get(this);
                if (eVar2 != null) {
                }
                linkedHashMap.remove(this);
                dVar.f13026g.add(eVar);
            }
        }
    }
}

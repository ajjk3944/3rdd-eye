package W;

import androidx.camera.core.impl.H0;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class S implements H0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13185b;

    public /* synthetic */ S(Object obj, int i) {
        this.f13184a = i;
        this.f13185b = obj;
    }

    @Override // androidx.camera.core.impl.H0.d
    public final void a(H0 h02, H0.g gVar) {
        switch (this.f13184a) {
            case 0:
                ((T) this.f13185b).K();
                break;
            default:
                Iterator it = ((H0.h) this.f13185b).f14898l.iterator();
                while (it.hasNext()) {
                    ((H0.d) it.next()).a(h02, gVar);
                }
                break;
        }
    }
}

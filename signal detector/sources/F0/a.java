package F0;

import android.os.Bundle;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1430b;

    public a(f fVar) {
        this.f1429a = 0;
        this.f1430b = new LinkedHashSet();
        fVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // F0.e
    public final Bundle a() {
        switch (this.f1429a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1430b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC2349g) this.f1430b).q().getClass();
                return bundle2;
        }
    }

    public a(AbstractActivityC2349g abstractActivityC2349g) {
        this.f1429a = 1;
        this.f1430b = abstractActivityC2349g;
    }
}

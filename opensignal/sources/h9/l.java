package h9;

import com.google.android.gms.internal.measurement.h4;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public List f10398a;

    @Override // h9.h
    public final boolean a(o1 o1Var) {
        Iterator it = this.f10398a.iterator();
        while (it.hasNext()) {
            if (h4.h((q) it.next(), o1Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "not(" + this.f10398a + ")";
    }
}

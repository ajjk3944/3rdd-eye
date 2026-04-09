package A1;

import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class o implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f116a;

    public o(w wVar) {
        this.f116a = wVar;
    }

    @Override // A1.a
    public final void a(boolean z6) {
        ArrayList arrayList;
        H1.p.a();
        synchronized (this.f116a) {
            arrayList = new ArrayList((HashSet) this.f116a.f139b);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((a) obj).a(z6);
        }
    }
}

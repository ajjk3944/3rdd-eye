package A1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Set f142a = Collections.newSetFromMap(new WeakHashMap());

    @Override // A1.j
    public final void e() {
        ArrayList arrayListE = H1.p.e(this.f142a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((E1.c) obj).e();
        }
    }

    @Override // A1.j
    public final void j() {
        ArrayList arrayListE = H1.p.e(this.f142a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((E1.c) obj).j();
        }
    }

    @Override // A1.j
    public final void onDestroy() {
        ArrayList arrayListE = H1.p.e(this.f142a);
        int size = arrayListE.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListE.get(i);
            i++;
            ((E1.c) obj).onDestroy();
        }
    }
}

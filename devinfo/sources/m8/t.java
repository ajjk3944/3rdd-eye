package m8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class t implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Set f28985a = Collections.newSetFromMap(new WeakHashMap());

    @Override // m8.i
    public final void onDestroy() {
        ArrayList arrayListE = t8.m.e(this.f28985a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((q8.e) obj).onDestroy();
        }
    }

    @Override // m8.i
    public final void onStart() {
        ArrayList arrayListE = t8.m.e(this.f28985a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((q8.e) obj).onStart();
        }
    }

    @Override // m8.i
    public final void onStop() {
        ArrayList arrayListE = t8.m.e(this.f28985a);
        int size = arrayListE.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListE.get(i4);
            i4++;
            ((q8.e) obj).onStop();
        }
    }
}

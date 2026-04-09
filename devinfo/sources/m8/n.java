package m8;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f28968a;

    public n(s sVar) {
        this.f28968a = sVar;
    }

    @Override // m8.a
    public final void a(boolean z3) {
        ArrayList arrayList;
        t8.m.a();
        synchronized (this.f28968a) {
            arrayList = new ArrayList((HashSet) this.f28968a.f28984c);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((a) obj).a(z3);
        }
    }
}

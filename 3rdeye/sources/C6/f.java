package C6;

import N7.B8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Releasables.kt */
/* loaded from: classes.dex */
public final class f implements i7.k {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f946b = new ArrayList();

    @Override // i7.k
    public final /* synthetic */ void b(j6.d dVar) {
        B8.c(this, dVar);
    }

    @Override // i7.k
    public final List<j6.d> getSubscriptions() {
        return this.f946b;
    }

    @Override // i7.k
    public final /* synthetic */ void h() throws Exception {
        B8.d(this);
    }

    @Override // H6.O
    public final void release() throws Exception {
        h();
    }
}

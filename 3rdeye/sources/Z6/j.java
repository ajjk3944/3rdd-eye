package z6;

import Q1.f;
import kotlin.jvm.internal.l;

/* compiled from: UpdateStateChangePageCallback.kt */
/* loaded from: classes.dex */
public final class j extends f.e {

    /* renamed from: d, reason: collision with root package name */
    public final String f48470d;

    /* renamed from: e, reason: collision with root package name */
    public final C5866e f48471e;

    public j(String mBlockId, C5866e c5866e) {
        l.f(mBlockId, "mBlockId");
        this.f48470d = mBlockId;
        this.f48471e = c5866e;
    }

    @Override // Q1.f.e
    public final void onPageSelected(int i) {
        if (i != -1) {
            this.f48471e.f48466b.put(this.f48470d, new g(i));
        }
    }
}

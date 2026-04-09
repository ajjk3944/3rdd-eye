package androidx.compose.ui.platform;

import java.util.Comparator;

/* renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3961y implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f29732a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparator f29733b;

    public C3961y(Comparator comparator, Comparator comparator2) {
        this.f29732a = comparator;
        this.f29733b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f29732a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.f29733b.compare(((J0.n) obj).q(), ((J0.n) obj2).q());
    }
}

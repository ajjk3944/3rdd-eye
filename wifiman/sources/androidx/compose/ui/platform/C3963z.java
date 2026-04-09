package androidx.compose.ui.platform;

import ch.AbstractC4260a;
import java.util.Comparator;

/* renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3963z implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f29736a;

    public C3963z(Comparator comparator) {
        this.f29736a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f29736a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : AbstractC4260a.e(Integer.valueOf(((J0.n) obj).o()), Integer.valueOf(((J0.n) obj2).o()));
    }
}

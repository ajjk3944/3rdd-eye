package oq;

import br.l;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final a f19659d = new a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final a f19660g = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19661a;

    public /* synthetic */ a(int i10) {
        this.f19661a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19661a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                l.e(comparable, "a");
                l.e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                l.e(comparable3, "a");
                l.e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f19661a) {
            case 0:
                return f19660g;
            default:
                return f19659d;
        }
    }
}

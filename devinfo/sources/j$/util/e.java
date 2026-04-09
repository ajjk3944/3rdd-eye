package j$.util;

import java.io.Serializable;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements java.util.Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Comparator f26369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26370c;

    public /* synthetic */ e(java.util.Comparator comparator, Object obj, int i4) {
        this.f26368a = i4;
        this.f26369b = comparator;
        this.f26370c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26368a) {
            case 0:
                java.util.Comparator comparator = this.f26369b;
                java.util.Comparator comparator2 = (java.util.Comparator) this.f26370c;
                int iCompare = comparator.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
            default:
                java.util.Comparator comparator3 = this.f26369b;
                Function function = (Function) this.f26370c;
                return comparator3.compare(function.apply(obj), function.apply(obj2));
        }
    }
}

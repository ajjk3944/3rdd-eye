package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2385e implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20779a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f20780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20781c;

    public /* synthetic */ C2385e(EnumC2386f enumC2386f, Comparator comparator) {
        this.f20781c = enumC2386f;
        this.f20780b = comparator;
    }

    public /* synthetic */ C2385e(Function function, Comparator comparator) {
        this.f20780b = comparator;
        this.f20781c = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20779a) {
            case 0:
                EnumC2386f enumC2386f = (EnumC2386f) this.f20781c;
                Comparator comparator = this.f20780b;
                int iCompare = enumC2386f.compare(obj, obj2);
                return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
            default:
                Comparator comparator2 = this.f20780b;
                Function function = (Function) this.f20781c;
                return comparator2.compare(function.apply(obj), function.apply(obj2));
        }
    }
}

package K6;

import N7.Ub;
import java.util.List;

/* compiled from: DivStateBinder.kt */
/* loaded from: classes.dex */
public final class s1 extends kotlin.jvm.internal.m implements p9.l<i7.b, Boolean> {

    /* renamed from: g, reason: collision with root package name */
    public static final s1 f3632g = new s1(1);

    @Override // p9.l
    public final Boolean invoke(i7.b bVar) {
        i7.b item = bVar;
        kotlin.jvm.internal.l.f(item, "item");
        List<Ub> listM = item.f38460a.d().m();
        return Boolean.valueOf(listM != null ? listM.contains(Ub.STATE_CHANGE) : true);
    }
}

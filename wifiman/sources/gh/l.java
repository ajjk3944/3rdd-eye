package Gh;

import Gh.AbstractC2916h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class l extends AbstractC2916h implements Qh.e {

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f7481c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Zh.f fVar, Object[] values) {
        super(fVar, null);
        AbstractC6492s.i(values, "values");
        this.f7481c = values;
    }

    @Override // Qh.e
    public List e() {
        Object[] objArr = this.f7481c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC2916h.a aVar = AbstractC2916h.f7478b;
            AbstractC6492s.f(obj);
            arrayList.add(aVar.a(obj, null));
        }
        return arrayList;
    }
}

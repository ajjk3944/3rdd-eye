package Bh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import ri.InterfaceC7619j;

/* loaded from: classes4.dex */
public abstract class q0 {
    public /* synthetic */ q0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(Zh.f fVar);

    public final q0 b(InterfaceC6835l transform) {
        AbstractC6492s.i(transform, "transform");
        if (this instanceof A) {
            A a10 = (A) this;
            return new A(a10.c(), (InterfaceC7619j) transform.invoke(a10.d()));
        }
        if (!(this instanceof H)) {
            throw new NoWhenBranchMatchedException();
        }
        List<Yg.s> listC = ((H) this).c();
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listC, 10));
        for (Yg.s sVar : listC) {
            arrayList.add(Yg.z.a((Zh.f) sVar.a(), transform.invoke((InterfaceC7619j) sVar.c())));
        }
        return new H(arrayList);
    }

    private q0() {
    }
}

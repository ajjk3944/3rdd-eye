package Ag;

import gg.i;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.MPv3;
import sh.C7972g;

/* loaded from: classes4.dex */
public abstract class b {
    public static final i a(Iterable merge) {
        AbstractC6492s.i(merge, "$this$merge");
        i iVarO0 = i.O0(b(merge));
        AbstractC6492s.h(iVarO0, "Flowable.merge(this.toFlowable())");
        return iVarO0;
    }

    public static final i b(Iterable toFlowable) {
        AbstractC6492s.i(toFlowable, "$this$toFlowable");
        i iVarA0 = i.A0(toFlowable);
        AbstractC6492s.h(iVarA0, "Flowable.fromIterable(this)");
        return iVarA0;
    }

    public static final i c(C7972g toFlowable) {
        AbstractC6492s.i(toFlowable, "$this$toFlowable");
        if (toFlowable.k() != 1 || toFlowable.j() - toFlowable.i() >= MPv3.MAX_MESSAGE_ID) {
            i iVarA0 = i.A0(toFlowable);
            AbstractC6492s.h(iVarA0, "Flowable.fromIterable(this)");
            return iVarA0;
        }
        i iVarJ1 = i.j1(toFlowable.i(), Math.max(0, (toFlowable.j() - toFlowable.i()) + 1));
        AbstractC6492s.h(iVarJ1, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return iVarJ1;
    }
}

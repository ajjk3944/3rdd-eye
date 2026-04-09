package Yh;

import Xh.a;
import Zg.AbstractC3689v;
import Zg.d0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class f extends g {

    /* renamed from: h, reason: collision with root package name */
    private final a.e f25048h;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(a.e types, String[] strings) {
        Set setN1;
        AbstractC6492s.i(types, "types");
        AbstractC6492s.i(strings, "strings");
        List listS = types.S();
        if (listS.isEmpty()) {
            setN1 = d0.e();
        } else {
            AbstractC6492s.f(listS);
            setN1 = AbstractC3689v.n1(listS);
        }
        List listT = types.T();
        AbstractC6492s.h(listT, "getRecordList(...)");
        super(strings, setN1, h.a(listT));
        this.f25048h = types;
    }
}

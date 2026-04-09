package Rh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f19885a;

    /* renamed from: b, reason: collision with root package name */
    private final List f19886b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19887c;

    /* renamed from: d, reason: collision with root package name */
    private final Y f19888d;

    public Y(j0 j0Var, List parametersInfo, String str) {
        AbstractC6492s.i(parametersInfo, "parametersInfo");
        this.f19885a = j0Var;
        this.f19886b = parametersInfo;
        this.f19887c = str;
        Y y10 = null;
        if (str != null) {
            j0 j0VarA = j0Var != null ? j0Var.a() : null;
            List<j0> list = parametersInfo;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
            for (j0 j0Var2 : list) {
                arrayList.add(j0Var2 != null ? j0Var2.a() : null);
            }
            y10 = new Y(j0VarA, arrayList, null);
        }
        this.f19888d = y10;
    }

    public final String a() {
        return this.f19887c;
    }

    public final List b() {
        return this.f19886b;
    }

    public final j0 c() {
        return this.f19885a;
    }

    public final Y d() {
        return this.f19888d;
    }
}

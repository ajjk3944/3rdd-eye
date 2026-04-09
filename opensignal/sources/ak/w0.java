package ak;

import java.util.List;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f756a;

    /* renamed from: b, reason: collision with root package name */
    public final List f757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f758c;

    public w0(t0 t0Var, List list, boolean z10) {
        br.l.e(list, "taskItemConfigs");
        this.f756a = t0Var;
        this.f757b = list;
        this.f758c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return br.l.a(this.f756a, w0Var.f756a) && br.l.a(this.f757b, w0Var.f757b) && this.f758c == w0Var.f758c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f758c) + h0.b.c(this.f756a.f720a.hashCode() * 31, 31, this.f757b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TaskSchedulerConfig(taskConfig=");
        sb2.append(this.f756a);
        sb2.append(", taskItemConfigs=");
        sb2.append(this.f757b);
        sb2.append(", useTelephonyCallState=");
        return c7.a.r(sb2, this.f758c, ')');
    }
}

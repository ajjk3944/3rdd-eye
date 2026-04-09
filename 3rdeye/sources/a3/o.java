package a3;

import d3.InterfaceC4272d;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Set<InterfaceC4272d> f14128a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f14129b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public boolean f14130c;

    public final boolean a(InterfaceC4272d interfaceC4272d) {
        boolean z10 = true;
        if (interfaceC4272d == null) {
            return true;
        }
        boolean zRemove = this.f14128a.remove(interfaceC4272d);
        if (!this.f14129b.remove(interfaceC4272d) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            interfaceC4272d.clear();
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.f14128a.size());
        sb.append(", isPaused=");
        return androidx.work.s.h(sb, this.f14130c, "}");
    }
}

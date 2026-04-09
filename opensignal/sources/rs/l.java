package rs;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class l extends k implements x {

    /* renamed from: d, reason: collision with root package name */
    public i f21764d = i.f21759c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21765g;

    public final void f(m mVar) {
        b0 b0Var;
        if (!this.f21765g) {
            this.f21764d = this.f21764d.clone();
            this.f21765g = true;
        }
        i iVar = this.f21764d;
        i iVar2 = mVar.f21766a;
        iVar.getClass();
        int i10 = 0;
        while (true) {
            b0Var = iVar2.f21760a;
            if (i10 >= b0Var.f21735d.size()) {
                break;
            }
            iVar.g((Map.Entry) b0Var.f21735d.get(i10));
            i10++;
        }
        Iterator it = b0Var.c().iterator();
        while (it.hasNext()) {
            iVar.g((Map.Entry) it.next());
        }
    }
}

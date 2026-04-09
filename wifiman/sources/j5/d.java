package J5;

import gg.s;
import kg.InterfaceC6469f;

/* loaded from: classes3.dex */
public abstract class d extends s implements InterfaceC6469f {
    public abstract void accept(Object obj);

    public abstract boolean i1();

    public final d j1() {
        return this instanceof e ? this : new e(this);
    }
}

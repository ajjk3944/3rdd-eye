package kotlin.coroutines.jvm.internal;

import dh.InterfaceC5380e;
import dh.InterfaceC5381f;
import dh.InterfaceC5384i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class d extends a {
    private final InterfaceC5384i _context;
    private transient InterfaceC5380e<Object> intercepted;

    public d(InterfaceC5380e interfaceC5380e, InterfaceC5384i interfaceC5384i) {
        super(interfaceC5380e);
        this._context = interfaceC5384i;
    }

    @Override // dh.InterfaceC5380e
    public InterfaceC5384i getContext() {
        InterfaceC5384i interfaceC5384i = this._context;
        AbstractC6492s.f(interfaceC5384i);
        return interfaceC5384i;
    }

    public final InterfaceC5380e<Object> intercepted() {
        InterfaceC5380e interfaceC5380eY = this.intercepted;
        if (interfaceC5380eY == null) {
            InterfaceC5381f interfaceC5381f = (InterfaceC5381f) getContext().get(InterfaceC5381f.f46086m0);
            if (interfaceC5381f == null || (interfaceC5380eY = interfaceC5381f.y(this)) == null) {
                interfaceC5380eY = this;
            }
            this.intercepted = interfaceC5380eY;
        }
        return interfaceC5380eY;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        InterfaceC5380e<Object> interfaceC5380e = this.intercepted;
        if (interfaceC5380e != null && interfaceC5380e != this) {
            InterfaceC5384i.b bVar = getContext().get(InterfaceC5381f.f46086m0);
            AbstractC6492s.f(bVar);
            ((InterfaceC5381f) bVar).C(interfaceC5380e);
        }
        this.intercepted = c.f51674a;
    }

    public d(InterfaceC5380e interfaceC5380e) {
        this(interfaceC5380e, interfaceC5380e != null ? interfaceC5380e.getContext() : null);
    }
}

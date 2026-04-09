package h9;

import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;
import kotlin.jvm.internal.l;

/* compiled from: ContinuationImpl.kt */
/* loaded from: classes3.dex */
public abstract class c extends AbstractC4424a {
    private final InterfaceC4350h _context;
    private transient InterfaceC4347e<Object> intercepted;

    public c(InterfaceC4347e<Object> interfaceC4347e, InterfaceC4350h interfaceC4350h) {
        super(interfaceC4347e);
        this._context = interfaceC4350h;
    }

    @Override // f9.InterfaceC4347e
    public InterfaceC4350h getContext() {
        InterfaceC4350h interfaceC4350h = this._context;
        l.c(interfaceC4350h);
        return interfaceC4350h;
    }

    public final InterfaceC4347e<Object> intercepted() {
        InterfaceC4347e<Object> interfaceC4347eD0 = this.intercepted;
        if (interfaceC4347eD0 == null) {
            InterfaceC4348f interfaceC4348f = (InterfaceC4348f) getContext().get(InterfaceC4348f.a.f37870b);
            interfaceC4347eD0 = interfaceC4348f != null ? interfaceC4348f.D0(this) : this;
            this.intercepted = interfaceC4347eD0;
        }
        return interfaceC4347eD0;
    }

    @Override // h9.AbstractC4424a
    public void releaseIntercepted() {
        InterfaceC4347e<?> interfaceC4347e = this.intercepted;
        if (interfaceC4347e != null && interfaceC4347e != this) {
            InterfaceC4350h.a aVar = getContext().get(InterfaceC4348f.a.f37870b);
            l.c(aVar);
            ((InterfaceC4348f) aVar).D(interfaceC4347e);
        }
        this.intercepted = C4425b.f38271b;
    }

    public c(InterfaceC4347e<Object> interfaceC4347e) {
        this(interfaceC4347e, interfaceC4347e != null ? interfaceC4347e.getContext() : null);
    }
}

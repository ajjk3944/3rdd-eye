package kotlin.jvm.internal;

import w9.InterfaceC5747b;
import w9.InterfaceC5750e;

/* compiled from: FunctionReference.java */
/* loaded from: classes3.dex */
public class j extends c implements i, InterfaceC5750e {
    private final int arity;
    private final int flags;

    public j(int i) {
        this(i, c.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC5747b computeReflected() {
        x.f43661a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && l.b(getBoundReceiver(), jVar.getBoundReceiver()) && l.b(getOwner(), jVar.getOwner());
        }
        if (obj instanceof InterfaceC5750e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // w9.InterfaceC5750e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // w9.InterfaceC5750e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // w9.InterfaceC5750e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // w9.InterfaceC5750e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.c, w9.InterfaceC5747b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC5747b interfaceC5747bCompute = compute();
        if (interfaceC5747bCompute != this) {
            return interfaceC5747bCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.c
    public InterfaceC5750e getReflected() {
        return (InterfaceC5750e) super.getReflected();
    }

    public j(int i, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.arity = i;
        this.flags = i10 >> 1;
    }
}

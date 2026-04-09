package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6489o extends AbstractC6480f implements InterfaceC6488n, th.g {
    private final int arity;
    private final int flags;

    public AbstractC6489o(int i10) {
        this(i10, AbstractC6480f.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    protected th.c computeReflected() {
        return O.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6489o) {
            AbstractC6489o abstractC6489o = (AbstractC6489o) obj;
            return getName().equals(abstractC6489o.getName()) && getSignature().equals(abstractC6489o.getSignature()) && this.flags == abstractC6489o.flags && this.arity == abstractC6489o.arity && AbstractC6492s.d(getBoundReceiver(), abstractC6489o.getBoundReceiver()) && AbstractC6492s.d(getOwner(), abstractC6489o.getOwner());
        }
        if (obj instanceof th.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC6488n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // th.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // th.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // th.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // th.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // th.c, th.g
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        th.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC6489o(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6480f
    public th.g getReflected() {
        return (th.g) super.getReflected();
    }

    public AbstractC6489o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}

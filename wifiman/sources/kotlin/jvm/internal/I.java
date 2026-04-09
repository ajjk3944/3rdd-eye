package kotlin.jvm.internal;

/* loaded from: classes4.dex */
public abstract class I extends AbstractC6480f implements th.l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f51684a;

    public I() {
        this.f51684a = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC6480f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public th.l getReflected() {
        if (this.f51684a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (th.l) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC6480f
    public th.c compute() {
        return this.f51684a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            I i10 = (I) obj;
            return getOwner().equals(i10.getOwner()) && getName().equals(i10.getName()) && getSignature().equals(i10.getSignature()) && AbstractC6492s.d(getBoundReceiver(), i10.getBoundReceiver());
        }
        if (obj instanceof th.l) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        th.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public I(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f51684a = (i10 & 2) == 2;
    }
}

package kotlin.jvm.internal;

import w9.InterfaceC5747b;

/* compiled from: PropertyReference.java */
/* loaded from: classes3.dex */
public abstract class s extends c implements w9.i {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f43656b;

    public s() {
        this.f43656b = false;
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC5747b compute() {
        return this.f43656b ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return getOwner().equals(sVar.getOwner()) && getName().equals(sVar.getName()) && getSignature().equals(sVar.getSignature()) && l.b(getBoundReceiver(), sVar.getBoundReceiver());
        }
        if (obj instanceof w9.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final w9.i getReflected() {
        if (this.f43656b) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (w9.i) super.getReflected();
    }

    public final String toString() {
        InterfaceC5747b interfaceC5747bCompute = compute();
        if (interfaceC5747bCompute != this) {
            return interfaceC5747bCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public s(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.f43656b = (i & 2) == 2;
    }
}

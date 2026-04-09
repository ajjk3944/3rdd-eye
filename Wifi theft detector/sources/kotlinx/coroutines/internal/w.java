package kotlinx.coroutines.internal;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final LockFreeLinkedListNode f22566a;

    public w(LockFreeLinkedListNode lockFreeLinkedListNode) {
        this.f22566a = lockFreeLinkedListNode;
    }

    public String toString() {
        return "Removed[" + this.f22566a + ']';
    }
}

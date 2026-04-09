package ng;

/* renamed from: ng.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6940a implements Dg.d, Dg.b {
    @Override // Dj.c
    public void cancel() {
    }

    @Override // Dg.g
    public final void clear() {
    }

    @Override // hg.InterfaceC6043c
    public void dispose() {
    }

    @Override // hg.InterfaceC6043c
    public boolean isDisposed() {
        return false;
    }

    @Override // Dg.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // Dg.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Dg.g
    public final Object poll() {
        return null;
    }

    @Override // Dj.c
    public final void request(long j10) {
    }

    @Override // Dg.c
    public final int requestFusion(int i10) {
        return i10 & 2;
    }
}

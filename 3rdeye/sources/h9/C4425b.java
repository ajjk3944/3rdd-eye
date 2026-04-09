package h9;

import f9.InterfaceC4347e;
import f9.InterfaceC4350h;

/* compiled from: ContinuationImpl.kt */
/* renamed from: h9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4425b implements InterfaceC4347e<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final C4425b f38271b = new C4425b();

    @Override // f9.InterfaceC4347e
    public final InterfaceC4350h getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // f9.InterfaceC4347e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}

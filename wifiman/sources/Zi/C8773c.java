package zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;

/* renamed from: zi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8773c implements InterfaceC8780j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8780j f67334a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6835l f67335b;

    public C8773c(InterfaceC8780j source, InterfaceC6835l keySelector) {
        AbstractC6492s.i(source, "source");
        AbstractC6492s.i(keySelector, "keySelector");
        this.f67334a = source;
        this.f67335b = keySelector;
    }

    @Override // zi.InterfaceC8780j
    public Iterator iterator() {
        return new C8772b(this.f67334a.iterator(), this.f67335b);
    }
}

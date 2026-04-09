package Bh;

import java.util.Collection;

/* renamed from: Bh.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2492b extends InterfaceC2491a, C {

    /* renamed from: Bh.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean isReal() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // Bh.InterfaceC2491a, Bh.InterfaceC2503m
    InterfaceC2492b a();

    InterfaceC2492b c0(InterfaceC2503m interfaceC2503m, D d10, AbstractC2510u abstractC2510u, a aVar, boolean z10);

    @Override // Bh.InterfaceC2491a
    Collection f();

    a h();

    void x0(Collection collection);
}

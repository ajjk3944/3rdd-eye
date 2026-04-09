package t7;

import s7.InterfaceC7921h;

/* renamed from: t7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC8038b implements InterfaceC7921h {
    NORMAL,
    FACTORY_DEFAULT,
    RECOVERY;

    private final boolean isSingle = true;

    EnumC8038b() {
    }

    @Override // s7.InterfaceC7921h
    public boolean isSingle() {
        return this.isSingle;
    }
}

package ri;

import java.util.ArrayList;

/* renamed from: ri.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7610a extends ArrayList implements InterfaceC7620k {
    public C7610a(int i10) {
        super(i10);
    }

    public /* bridge */ int F(InterfaceC7621l interfaceC7621l) {
        return super.indexOf(interfaceC7621l);
    }

    public /* bridge */ boolean M0(InterfaceC7621l interfaceC7621l) {
        return super.remove(interfaceC7621l);
    }

    public /* bridge */ int S(InterfaceC7621l interfaceC7621l) {
        return super.lastIndexOf(interfaceC7621l);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC7621l) {
            return m((InterfaceC7621l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC7621l) {
            return F((InterfaceC7621l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC7621l) {
            return S((InterfaceC7621l) obj);
        }
        return -1;
    }

    public /* bridge */ boolean m(InterfaceC7621l interfaceC7621l) {
        return super.contains(interfaceC7621l);
    }

    public /* bridge */ int o() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC7621l) {
            return M0((InterfaceC7621l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return o();
    }
}

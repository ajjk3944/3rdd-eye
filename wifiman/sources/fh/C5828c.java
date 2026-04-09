package fh;

import Zg.AbstractC3672d;
import Zg.AbstractC3682n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: fh.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5828c extends AbstractC3672d implements InterfaceC5826a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final Enum[] f47351b;

    public C5828c(Enum[] entries) {
        AbstractC6492s.i(entries, "entries");
        this.f47351b = entries;
    }

    public int C(Enum element) {
        AbstractC6492s.i(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC3682n.i0(this.f47351b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int J(Enum element) {
        AbstractC6492s.i(element, "element");
        return indexOf(element);
    }

    @Override // Zg.AbstractC3670b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return v((Enum) obj);
        }
        return false;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return C((Enum) obj);
        }
        return -1;
    }

    @Override // Zg.AbstractC3670b
    public int j() {
        return this.f47351b.length;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return J((Enum) obj);
        }
        return -1;
    }

    public boolean v(Enum element) {
        AbstractC6492s.i(element, "element");
        return ((Enum) AbstractC3682n.i0(this.f47351b, element.ordinal())) == element;
    }

    @Override // Zg.AbstractC3672d, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC3672d.f25361a.b(i10, this.f47351b.length);
        return this.f47351b[i10];
    }
}

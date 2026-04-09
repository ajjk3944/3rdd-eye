package i9;

import N7.H7;
import c9.AbstractC2082c;
import c9.C2091l;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.l;

/* compiled from: EnumEntries.kt */
/* renamed from: i9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4464b<T extends Enum<T>> extends AbstractC2082c<T> implements InterfaceC4463a<T>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final T[] f38635b;

    public C4464b(T[] entries) {
        l.f(entries, "entries");
        this.f38635b = entries;
    }

    @Override // c9.AbstractC2080a
    public final int c() {
        return this.f38635b.length;
    }

    @Override // c9.AbstractC2080a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        l.f(element, "element");
        return ((Enum) C2091l.n(this.f38635b, element.ordinal())) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        T[] tArr = this.f38635b;
        int length = tArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(H7.n(i, length, "index: ", ", size: "));
        }
        return tArr[i];
    }

    @Override // c9.AbstractC2082c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        l.f(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C2091l.n(this.f38635b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // c9.AbstractC2082c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        l.f(element, "element");
        return indexOf(element);
    }
}

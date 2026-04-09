package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.n0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements o0 {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    /* renamed from: f, reason: collision with root package name */
    public final transient ImmutableSet f11827f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final n0.b f11828a = n0.a(ImmutableSetMultimap.class, "emptySet");
    }

    public static ImmutableSet r(Comparator comparator) {
        return comparator == null ? ImmutableSet.F() : ImmutableSortedSet.N(comparator);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Invalid key count ");
            sb.append(i10);
            throw new InvalidObjectException(sb.toString());
        }
        ImmutableMap.a aVarD = ImmutableMap.d();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value count ");
                sb2.append(i13);
                throw new InvalidObjectException(sb2.toString());
            }
            ImmutableSet.a aVarV = v(comparator);
            for (int i14 = 0; i14 < i13; i14++) {
                aVarV.f(objectInputStream.readObject());
            }
            ImmutableSet immutableSetJ = aVarV.j();
            if (immutableSetJ.size() != i13) {
                String strValueOf = String.valueOf(object);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 40);
                sb3.append("Duplicate key-value pairs exist for key ");
                sb3.append(strValueOf);
                throw new InvalidObjectException(sb3.toString());
            }
            aVarD.g(object, immutableSetJ);
            i11 += i13;
        }
        try {
            ImmutableMultimap.b.f11808a.b(this, aVarD.d());
            ImmutableMultimap.b.f11809b.a(this, i11);
            a.f11828a.b(this, r(comparator));
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    public static ImmutableSet.a v(Comparator comparator) {
        return comparator == null ? new ImmutableSet.a() : new ImmutableSortedSet.a(comparator);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(u());
        n0.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public ImmutableSet get(Object obj) {
        return (ImmutableSet) com.google.common.base.e.a((ImmutableSet) this.f11802d.get(obj), this.f11827f);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Comparator u() {
        ImmutableSet immutableSet = this.f11827f;
        if (immutableSet instanceof ImmutableSortedSet) {
            return ((ImmutableSortedSet) immutableSet).comparator();
        }
        return null;
    }
}

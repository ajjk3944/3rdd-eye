package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements c0 {

    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
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
            ImmutableList.a aVarV = ImmutableList.v();
            for (int i14 = 0; i14 < i13; i14++) {
                aVarV.f(objectInputStream.readObject());
            }
            aVarD.g(object, aVarV.g());
            i11 += i13;
        }
        try {
            ImmutableMultimap.b.f11808a.b(this, aVarD.d());
            ImmutableMultimap.b.f11809b.a(this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        n0.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ImmutableList get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f11802d.get(obj);
        return immutableList == null ? ImmutableList.A() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableList a(Object obj) {
        throw new UnsupportedOperationException();
    }
}

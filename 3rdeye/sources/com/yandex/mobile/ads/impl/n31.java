package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class n31<K, V> extends AbstractC4124i<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    transient h32<? extends List<V>> f30753g;

    public n31(Map<K, Collection<V>> map, h32<? extends List<V>> h32Var) {
        super(map);
        this.f30753g = (h32) pj1.a(h32Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f30753g = (h32) objectInputStream.readObject();
        a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f30753g);
        objectOutputStream.writeObject(c());
    }
}

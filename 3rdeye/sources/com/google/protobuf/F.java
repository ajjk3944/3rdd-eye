package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes2.dex */
public class F extends G {
    private final U defaultInstance;

    /* compiled from: LazyField.java */
    public static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, F> entry;

        public F getField() {
            return this.entry.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.entry.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            F value = this.entry.getValue();
            if (value == null) {
                return null;
            }
            return value.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof U) {
                return this.entry.getValue().setValue((U) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, F> entry) {
            this.entry = entry;
        }
    }

    /* compiled from: LazyField.java */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> iterator;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.iterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.iterator.next();
            return next.getValue() instanceof F ? new b(next) : next;
        }
    }

    public F(U u8, C4034q c4034q, AbstractC4026i abstractC4026i) {
        super(c4034q, abstractC4026i);
        this.defaultInstance = u8;
    }

    @Override // com.google.protobuf.G
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override // com.google.protobuf.G
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public U getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.G
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}

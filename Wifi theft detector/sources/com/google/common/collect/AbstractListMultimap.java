package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements c0 {
    private static final long serialVersionUID = 6588350623831699109L;

    public AbstractListMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection A(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection B(Object obj, Collection collection) {
        return C(obj, (List) collection, null);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public List w() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public List get(Object obj) {
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public List a(Object obj) {
        return (List) super.a(obj);
    }

    @Override // com.google.common.collect.c, com.google.common.collect.c0
    public Map d() {
        return super.d();
    }

    @Override // com.google.common.collect.c
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

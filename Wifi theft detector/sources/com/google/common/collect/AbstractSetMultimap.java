package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements o0 {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractSetMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection A(Collection collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    public Collection B(Object obj, Collection collection) {
        return new AbstractMapBasedMultimap.m(obj, (Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public Set w() {
        return Collections.EMPTY_SET;
    }

    public Set E() {
        return (Set) super.j();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public Set get(Object obj) {
        return (Set) super.get(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.c0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public Set a(Object obj) {
        return (Set) super.a(obj);
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

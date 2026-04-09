package com.google.common.collect;

import com.google.common.collect.e0;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* loaded from: classes2.dex */
public interface r0 extends e0, p0 {
    r0 a(Object obj, BoundType boundType, Object obj2, BoundType boundType2);

    @Override // com.google.common.collect.p0
    Comparator comparator();

    @Override // com.google.common.collect.e0
    Set entrySet();

    e0.a firstEntry();

    @Override // com.google.common.collect.e0
    NavigableSet k();

    e0.a lastEntry();

    r0 o();

    e0.a pollFirstEntry();

    e0.a pollLastEntry();

    r0 q(Object obj, BoundType boundType);

    r0 t(Object obj, BoundType boundType);
}

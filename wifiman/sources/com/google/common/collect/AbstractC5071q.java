package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.common.collect.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5071q extends AbstractC5059e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final transient AbstractC5070p f38407a;

    /* renamed from: b, reason: collision with root package name */
    final transient int f38408b;

    /* renamed from: com.google.common.collect.q$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f38409a = H.c();

        /* renamed from: b, reason: collision with root package name */
        Comparator f38410b;

        /* renamed from: c, reason: collision with root package name */
        Comparator f38411c;
    }

    AbstractC5071q(AbstractC5070p abstractC5070p, int i10) {
        this.f38407a = abstractC5070p;
        this.f38408b = i10;
    }

    @Override // com.google.common.collect.AbstractC5058d
    public boolean c(Object obj) {
        return obj != null && super.c(obj);
    }

    @Override // com.google.common.collect.AbstractC5058d, com.google.common.collect.A
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC5070p a() {
        return this.f38407a;
    }

    @Override // com.google.common.collect.AbstractC5058d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC5058d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC5058d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}

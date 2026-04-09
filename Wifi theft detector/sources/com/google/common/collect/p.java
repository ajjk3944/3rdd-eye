package com.google.common.collect;

import com.google.common.base.Optional;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class p implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f12068a;

    public class a extends p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Iterable f12069b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f12069b = iterable2;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f12069b.iterator();
        }
    }

    public p() {
        this.f12068a = Optional.d();
    }

    public static p c(Iterable iterable) {
        return iterable instanceof p ? (p) iterable : new a(iterable, iterable);
    }

    public final p b(com.google.common.base.h hVar) {
        return c(a0.c(d(), hVar));
    }

    public final Iterable d() {
        return (Iterable) this.f12068a.i(this);
    }

    public final ImmutableSet e() {
        return ImmutableSet.z(d());
    }

    public String toString() {
        return a0.g(d());
    }

    public p(Iterable iterable) {
        this.f12068a = Optional.h(iterable);
    }
}

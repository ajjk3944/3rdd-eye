package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class AbstractIterator extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public State f11613a = State.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    public Object f11614b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11620a;

        static {
            int[] iArr = new int[State.values().length];
            f11620a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11620a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract Object a();

    public final Object b() {
        this.f11613a = State.DONE;
        return null;
    }

    public final boolean c() {
        this.f11613a = State.FAILED;
        this.f11614b = a();
        if (this.f11613a == State.DONE) {
            return false;
        }
        this.f11613a = State.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.g.r(this.f11613a != State.FAILED);
        int i10 = a.f11620a[this.f11613a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11613a = State.NOT_READY;
        Object objA = f0.a(this.f11614b);
        this.f11614b = null;
        return objA;
    }
}

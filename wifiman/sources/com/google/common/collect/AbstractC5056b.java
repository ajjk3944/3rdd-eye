package com.google.common.collect;

import java.util.NoSuchElementException;
import m4.AbstractC6769h;

/* renamed from: com.google.common.collect.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5056b extends S {

    /* renamed from: a, reason: collision with root package name */
    private EnumC1211b f38355a = EnumC1211b.NOT_READY;

    /* renamed from: b, reason: collision with root package name */
    private Object f38356b;

    /* renamed from: com.google.common.collect.b$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38357a;

        static {
            int[] iArr = new int[EnumC1211b.values().length];
            f38357a = iArr;
            try {
                iArr[EnumC1211b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38357a[EnumC1211b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.collect.b$b, reason: collision with other inner class name */
    private enum EnumC1211b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected AbstractC5056b() {
    }

    private boolean d() {
        this.f38355a = EnumC1211b.FAILED;
        this.f38356b = a();
        if (this.f38355a == EnumC1211b.DONE) {
            return false;
        }
        this.f38355a = EnumC1211b.READY;
        return true;
    }

    protected abstract Object a();

    protected final Object c() {
        this.f38355a = EnumC1211b.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        AbstractC6769h.n(this.f38355a != EnumC1211b.FAILED);
        int i10 = a.f38357a[this.f38355a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f38355a = EnumC1211b.NOT_READY;
        Object objA = E.a(this.f38356b);
        this.f38356b = null;
        return objA;
    }
}

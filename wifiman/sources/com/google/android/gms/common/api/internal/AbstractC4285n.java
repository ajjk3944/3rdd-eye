package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.TaskCompletionSource;
import r3.C7566d;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.common.api.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4285n {

    /* renamed from: a, reason: collision with root package name */
    private final C7566d[] f34839a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34840b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34841c;

    /* renamed from: com.google.android.gms.common.api.internal.n$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC4283l f34842a;

        /* renamed from: c, reason: collision with root package name */
        private C7566d[] f34844c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34843b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f34845d = 0;

        /* synthetic */ a(Q q10) {
        }

        public AbstractC4285n a() {
            AbstractC7901p.b(this.f34842a != null, "execute parameter required");
            return new P(this, this.f34844c, this.f34843b, this.f34845d);
        }

        public a b(InterfaceC4283l interfaceC4283l) {
            this.f34842a = interfaceC4283l;
            return this;
        }

        public a c(boolean z10) {
            this.f34843b = z10;
            return this;
        }

        public a d(C7566d... c7566dArr) {
            this.f34844c = c7566dArr;
            return this;
        }

        public a e(int i10) {
            this.f34845d = i10;
            return this;
        }
    }

    public AbstractC4285n() {
        this.f34839a = null;
        this.f34840b = false;
        this.f34841c = 0;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, TaskCompletionSource taskCompletionSource);

    public boolean c() {
        return this.f34840b;
    }

    public final int d() {
        return this.f34841c;
    }

    public final C7566d[] e() {
        return this.f34839a;
    }

    protected AbstractC4285n(C7566d[] c7566dArr, boolean z10, int i10) {
        this.f34839a = c7566dArr;
        boolean z11 = false;
        if (c7566dArr != null && z10) {
            z11 = true;
        }
        this.f34840b = z11;
        this.f34841c = i10;
    }
}

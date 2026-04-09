package k3;

import k3.C6367a;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6371e {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC6371e f51171a = a().f(10485760).d(200).b(10000).c(604800000).e(81920).a();

    /* renamed from: k3.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC6371e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC6371e() {
    }

    static a a() {
        return new C6367a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}

package oi;

/* loaded from: classes4.dex */
class l {

    /* renamed from: a, reason: collision with root package name */
    private final Object f55739a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f55740b = Thread.currentThread();

    l(Object obj) {
        this.f55739a = obj;
    }

    public Object a() {
        if (b()) {
            return this.f55739a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f55740b == Thread.currentThread();
    }
}

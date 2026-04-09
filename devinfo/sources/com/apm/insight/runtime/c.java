package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f3449a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f3450b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f3451c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f3452d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f3453e = new CopyOnWriteArrayList();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3454a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f3454a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3454a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3454a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3454a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3454a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i4 = AnonymousClass1.f3454a[crashType.ordinal()];
        if (i4 == 1) {
            this.f3449a.add(iCrashCallback);
            this.f3450b.add(iCrashCallback);
            this.f3451c.add(iCrashCallback);
            this.f3452d.add(iCrashCallback);
            return;
        }
        if (i4 == 2) {
            this.f3452d.add(iCrashCallback);
            return;
        }
        if (i4 == 3) {
            this.f3450b.add(iCrashCallback);
        } else if (i4 == 4) {
            this.f3449a.add(iCrashCallback);
        } else {
            if (i4 != 5) {
                return;
            }
            this.f3451c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i4 = AnonymousClass1.f3454a[crashType.ordinal()];
        if (i4 == 1) {
            this.f3449a.remove(iCrashCallback);
            this.f3450b.remove(iCrashCallback);
            this.f3451c.remove(iCrashCallback);
            this.f3452d.remove(iCrashCallback);
            return;
        }
        if (i4 == 2) {
            this.f3452d.remove(iCrashCallback);
            return;
        }
        if (i4 == 3) {
            this.f3450b.remove(iCrashCallback);
        } else if (i4 == 4) {
            this.f3449a.remove(iCrashCallback);
        } else {
            if (i4 != 5) {
                return;
            }
            this.f3451c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f3450b;
    }

    public final List<ICrashCallback> d() {
        return this.f3451c;
    }

    public final List<ICrashCallback> e() {
        return this.f3452d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f3453e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f3453e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f3453e;
    }

    public final List<ICrashCallback> b() {
        return this.f3449a;
    }
}

package com.apm.insight.runtime;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f6411a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f6412b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f6413c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f6414d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f6415e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6416a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f6416a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6416a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6416a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6416a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6416a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f6416a[crashType.ordinal()];
        if (i == 1) {
            this.f6411a.add(iCrashCallback);
            this.f6412b.add(iCrashCallback);
            this.f6413c.add(iCrashCallback);
            this.f6414d.add(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.f6414d.add(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.f6412b.add(iCrashCallback);
        } else if (i == 4) {
            this.f6411a.add(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.f6413c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f6416a[crashType.ordinal()];
        if (i == 1) {
            this.f6411a.remove(iCrashCallback);
            this.f6412b.remove(iCrashCallback);
            this.f6413c.remove(iCrashCallback);
            this.f6414d.remove(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.f6414d.remove(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.f6412b.remove(iCrashCallback);
        } else if (i == 4) {
            this.f6411a.remove(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.f6413c.remove(iCrashCallback);
        }
    }

    public final List<ICrashCallback> c() {
        return this.f6412b;
    }

    public final List<ICrashCallback> d() {
        return this.f6413c;
    }

    public final List<ICrashCallback> e() {
        return this.f6414d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f6415e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f6415e.remove(iOOMCallback);
    }

    public final List<IOOMCallback> a() {
        return this.f6415e;
    }

    public final List<ICrashCallback> b() {
        return this.f6411a;
    }
}

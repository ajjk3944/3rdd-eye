package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f5234a = new CopyOnWriteArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<ICrashCallback> f5235b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<ICrashCallback> f5236c = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List<ICrashCallback> f5237d = new CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List<IOOMCallback> f5238e = new CopyOnWriteArrayList();

    /* renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5239a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f5239a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5239a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5239a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5239a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5239a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f5239a[crashType.ordinal()];
        if (i10 == 1) {
            this.f5234a.add(iCrashCallback);
            this.f5235b.add(iCrashCallback);
            this.f5236c.add(iCrashCallback);
            this.f5237d.add(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f5237d.add(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f5235b.add(iCrashCallback);
        } else if (i10 == 4) {
            this.f5234a.add(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f5236c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i10 = AnonymousClass1.f5239a[crashType.ordinal()];
        if (i10 == 1) {
            this.f5234a.remove(iCrashCallback);
            this.f5235b.remove(iCrashCallback);
            this.f5236c.remove(iCrashCallback);
            this.f5237d.remove(iCrashCallback);
            return;
        }
        if (i10 == 2) {
            this.f5237d.remove(iCrashCallback);
            return;
        }
        if (i10 == 3) {
            this.f5235b.remove(iCrashCallback);
        } else if (i10 == 4) {
            this.f5234a.remove(iCrashCallback);
        } else {
            if (i10 != 5) {
                return;
            }
            this.f5236c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.f5235b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.f5236c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.f5237d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.f5238e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.f5238e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.f5238e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f5234a;
    }
}

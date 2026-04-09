package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class zr0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f36597d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static volatile zr0 f36598e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f36599f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final v31 f36600a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f36601b;

    /* renamed from: c, reason: collision with root package name */
    private int f36602c;

    public static final class a {
        public static zr0 a() {
            zr0 zr0Var;
            zr0 zr0Var2 = zr0.f36598e;
            if (zr0Var2 != null) {
                return zr0Var2;
            }
            synchronized (zr0.f36597d) {
                zr0Var = zr0.f36598e;
                if (zr0Var == null) {
                    zr0Var = new zr0();
                    zr0.f36598e = zr0Var;
                }
            }
            return zr0Var;
        }
    }

    public /* synthetic */ zr0() {
        this(new v31(v31.f34328c));
    }

    public final Executor c() {
        Executor executorNewSingleThreadExecutor;
        synchronized (f36597d) {
            try {
                if (this.f36601b.size() < 4) {
                    executorNewSingleThreadExecutor = Executors.newSingleThreadExecutor(this.f36600a);
                    kotlin.jvm.internal.l.e(executorNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
                    this.f36601b.add(executorNewSingleThreadExecutor);
                } else {
                    ArrayList arrayList = this.f36601b;
                    int i = this.f36602c;
                    this.f36602c = i + 1;
                    executorNewSingleThreadExecutor = (Executor) arrayList.get(i);
                    if (this.f36602c == 4) {
                        this.f36602c = 0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorNewSingleThreadExecutor;
    }

    private zr0(v31 v31Var) {
        this.f36600a = v31Var;
        this.f36601b = new ArrayList();
    }
}

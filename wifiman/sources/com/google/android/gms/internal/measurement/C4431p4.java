package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D4;
import f.AbstractC5487d;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4431p4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C4431p4 f35428b;

    /* renamed from: c, reason: collision with root package name */
    static final C4431p4 f35429c = new C4431p4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f35430a = Collections.emptyMap();

    /* renamed from: com.google.android.gms.internal.measurement.p4$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f35431a;

        /* renamed from: b, reason: collision with root package name */
        private final int f35432b;

        a(Object obj, int i10) {
            this.f35431a = obj;
            this.f35432b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f35431a == aVar.f35431a && this.f35432b == aVar.f35432b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f35431a) * 65535) + this.f35432b;
        }
    }

    private C4431p4(boolean z10) {
    }

    public static C4431p4 a() {
        C4431p4 c4431p4 = f35428b;
        if (c4431p4 != null) {
            return c4431p4;
        }
        synchronized (C4431p4.class) {
            try {
                C4431p4 c4431p42 = f35428b;
                if (c4431p42 != null) {
                    return c4431p42;
                }
                C4431p4 c4431p4A = B4.a(C4431p4.class);
                f35428b = c4431p4A;
                return c4431p4A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final D4.d b(InterfaceC4366h5 interfaceC4366h5, int i10) {
        AbstractC5487d.a(this.f35430a.get(new a(interfaceC4366h5, i10)));
        return null;
    }
}

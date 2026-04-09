package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5095w;
import f.AbstractC5487d;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5088o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f38582b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile C5088o f38583c;

    /* renamed from: d, reason: collision with root package name */
    static final C5088o f38584d = new C5088o(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f38585a = Collections.emptyMap();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.o$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f38586a;

        /* renamed from: b, reason: collision with root package name */
        private final int f38587b;

        a(Object obj, int i10) {
            this.f38586a = obj;
            this.f38587b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38586a == aVar.f38586a && this.f38587b == aVar.f38587b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f38586a) * 65535) + this.f38587b;
        }
    }

    C5088o(boolean z10) {
    }

    public static C5088o b() {
        C5088o c5088oA = f38583c;
        if (c5088oA == null) {
            synchronized (C5088o.class) {
                try {
                    c5088oA = f38583c;
                    if (c5088oA == null) {
                        c5088oA = f38582b ? AbstractC5087n.a() : f38584d;
                        f38583c = c5088oA;
                    }
                } finally {
                }
            }
        }
        return c5088oA;
    }

    public AbstractC5095w.c a(M m10, int i10) {
        AbstractC5487d.a(this.f38585a.get(new a(m10, i10)));
        return null;
    }
}

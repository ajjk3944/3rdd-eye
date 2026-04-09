package com.google.common.hash;

import com.google.common.base.j;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class LongAddables {

    /* renamed from: a, reason: collision with root package name */
    public static final j f12077a;

    public static final class PureJavaLongAddable extends AtomicLong implements com.google.common.hash.b {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.hash.b
        public void add(long j10) {
            getAndAdd(j10);
        }

        public /* synthetic */ PureJavaLongAddable(a aVar) {
            this();
        }
    }

    public class a implements j {
        @Override // com.google.common.base.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.hash.b get() {
            return new LongAdder();
        }
    }

    public class b implements j {
        @Override // com.google.common.base.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.common.hash.b get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        j bVar;
        try {
            new LongAdder();
            bVar = new a();
        } catch (Throwable unused) {
            bVar = new b();
        }
        f12077a = bVar;
    }

    public static com.google.common.hash.b a() {
        return (com.google.common.hash.b) f12077a.get();
    }
}

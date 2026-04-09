package w1;

import i9.InterfaceC4463a;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f47221a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final long[] f47222b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f47223c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47224d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvalidationTracker.kt */
    public static final class a {
        private static final /* synthetic */ InterfaceC4463a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NO_OP = new a("NO_OP", 0);
        public static final a ADD = new a("ADD", 1);
        public static final a REMOVE = new a("REMOVE", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NO_OP, ADD, REMOVE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = com.google.gson.internal.c.l(aVarArr$values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC4463a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public f(int i) {
        this.f47222b = new long[i];
        this.f47223c = new boolean[i];
    }
}

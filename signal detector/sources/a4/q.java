package a4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4715a;

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f4716b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ q[] f4717c;

    static {
        q qVar = new q("INSTANCE", 0);
        f4715a = qVar;
        f4717c = new q[]{qVar};
        f4716b = new AtomicReference(null);
    }

    public static q[] values() {
        return (q[]) f4717c.clone();
    }
}

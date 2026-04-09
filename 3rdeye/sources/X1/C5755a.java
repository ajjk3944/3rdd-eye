package x1;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.l;

/* compiled from: ExclusiveLock.kt */
/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5755a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0549a f47635c = new C0549a();

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f47636d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f47637a;

    /* renamed from: b, reason: collision with root package name */
    public final K4.b f47638b;

    /* compiled from: ExclusiveLock.kt */
    /* renamed from: x1.a$a, reason: collision with other inner class name */
    public static final class C0549a {
    }

    public C5755a(String filename, boolean z10) {
        ReentrantLock reentrantLock;
        l.f(filename, "filename");
        synchronized (f47635c) {
            try {
                LinkedHashMap linkedHashMap = f47636d;
                Object reentrantLock2 = linkedHashMap.get(filename);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(filename, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f47637a = reentrantLock;
        this.f47638b = z10 ? new K4.b(filename, 7) : null;
    }
}

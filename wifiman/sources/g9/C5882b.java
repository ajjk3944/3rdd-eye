package g9;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: g9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5882b implements InterfaceC5881a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f47753a = new AtomicLong();

    @Override // g9.InterfaceC5881a
    public String a() {
        String string;
        synchronized (this.f47753a) {
            string = new UUID(0L, this.f47753a.getAndIncrement()).toString();
        }
        AbstractC6492s.h(string, "synchronized(index) {\n  …t()).toString()\n        }");
        return string;
    }
}

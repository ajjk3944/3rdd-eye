package p;

import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7176d {
    public static final void a(String message) {
        AbstractC6492s.i(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        AbstractC6492s.i(message, "message");
        throw new IllegalStateException(message);
    }
}

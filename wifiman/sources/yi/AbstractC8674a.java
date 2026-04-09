package yi;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: yi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC8674a {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f66782a = new ConcurrentHashMap();

    public static final Void a(String message) {
        AbstractC6492s.i(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}

package w1;

import android.content.Context;
import w1.k;

/* compiled from: Room.android.kt */
/* loaded from: classes.dex */
public final class h {
    public static final <T extends k> k.a<T> a(Context context, Class<T> cls, String str) {
        kotlin.jvm.internal.l.f(context, "context");
        if (y9.q.i0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new k.a<>(context, cls, str);
    }
}

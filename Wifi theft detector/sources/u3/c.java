package u3;

import com.google.android.datatransport.Priority;

/* loaded from: classes2.dex */
public abstract class c {
    public static c d(Object obj) {
        return new a(null, obj, Priority.DEFAULT);
    }

    public abstract Integer a();

    public abstract Object b();

    public abstract Priority c();
}

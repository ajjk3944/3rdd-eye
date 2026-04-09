package V4;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.firebase.f;

/* loaded from: classes3.dex */
public abstract class a {
    public static synchronized a b() {
        return c(f.l());
    }

    public static synchronized a c(f fVar) {
        return (a) fVar.j(a.class);
    }

    public abstract Task a(Intent intent);
}

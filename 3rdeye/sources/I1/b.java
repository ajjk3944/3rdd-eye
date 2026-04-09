package I1;

import android.content.Context;
import java.util.List;

/* compiled from: Initializer.java */
/* loaded from: classes.dex */
public interface b<T> {
    T create(Context context);

    List<Class<? extends b<?>>> dependencies();
}

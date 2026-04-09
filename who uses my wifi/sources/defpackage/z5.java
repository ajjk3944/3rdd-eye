package defpackage;

import android.window.OnBackInvokedCallback;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.a) {
            case 0:
                ((h6) this.b).D();
                break;
            case 1:
                ((nb0) this.b).a();
                break;
            case 2:
                ((vi0) this.b).a();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}

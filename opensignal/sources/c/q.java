package c;

import android.window.OnBackInvokedCallback;
import i.a0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3041b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f3040a = i10;
        this.f3041b = obj;
    }

    public final void onBackInvoked() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f3040a) {
            case 0:
                ar.a aVar = (ar.a) this.f3041b;
                br.l.e(aVar, "$onBackInvoked");
                aVar.c();
                break;
            case 1:
                ((a0) this.f3041b).C();
                break;
            default:
                ((Runnable) this.f3041b).run();
                break;
        }
    }
}

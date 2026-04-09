package A9;

import android.os.Bundle;
import android.util.Log;
import b9.C1992A;
import java.lang.reflect.Method;
import s.BinderC5541e;

/* compiled from: Executors.kt */
/* loaded from: classes3.dex */
public final class J0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f195c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f196d;

    public /* synthetic */ J0(int i, Object obj, Object obj2) {
        this.f194b = i;
        this.f195c = obj;
        this.f196d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f195c;
        Object obj2 = this.f196d;
        switch (this.f194b) {
            case 0:
                ((C0583j) obj2).B((C0578g0) obj, C1992A.f18074a);
                return;
            case 1:
                ((BinderC5541e) obj2).f45882c.onMessageChannelReady((Bundle) obj);
                return;
            default:
                try {
                    Method method = y0.d.f47861d;
                    if (method != null) {
                        method.invoke(obj, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        y0.d.f47862e.invoke(obj, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public J0(BinderC5541e binderC5541e, Bundle bundle) {
        this.f194b = 1;
        this.f196d = binderC5541e;
        this.f195c = bundle;
    }
}

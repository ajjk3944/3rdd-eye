package f2;

import A9.C0599r0;
import B.f;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.mobile.ads.impl.O5;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import n5.l;
import n5.q;
import n5.r;
import s1.ExecutorC5546b;
import u2.C5629h;
import v.C5664t;
import v.C5670z;
import v.a0;
import v.q0;
import v.r0;
import y0.RunnableC5789b;
import y0.d;

/* compiled from: R8$$SyntheticClass */
/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4331a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f37813c;

    public /* synthetic */ RunnableC4331a(Object obj, int i) {
        this.f37812b = i;
        this.f37813c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = 8;
        switch (this.f37812b) {
            case 0:
                ((C0599r0) this.f37813c).c(null);
                return;
            case 1:
                ((h5.b) this.f37813c).c();
                return;
            case 2:
                C5629h.b((ByteArrayInputStream) this.f37813c);
                return;
            case 3:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f37813c;
                Context context = firebaseMessaging.f23260c;
                q.a(context);
                boolean zF = firebaseMessaging.f();
                boolean zIsAtLeastQ = PlatformVersion.isAtLeastQ();
                l lVar = firebaseMessaging.f23261d;
                if (zIsAtLeastQ) {
                    SharedPreferences sharedPreferencesA = r.a(context);
                    if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zF) {
                        lVar.f44357c.setRetainProxiedNotifications(zF).addOnSuccessListener(new ExecutorC5546b(), new O5(context, zF));
                    }
                }
                if (firebaseMessaging.f()) {
                    lVar.f44357c.getProxiedNotificationData().addOnSuccessListener(firebaseMessaging.f23264g, new f(firebaseMessaging, 16));
                    return;
                }
                return;
            case 4:
                Toolbar.f fVar = ((Toolbar) this.f37813c).f14714N;
                h hVar = fVar != null ? fVar.f14751c : null;
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case 5:
                androidx.profileinstaller.c.b((Context) this.f37813c, new ExecutorC5546b(), androidx.profileinstaller.c.f16356a, false);
                return;
            case 6:
                C5664t.e.a aVar = (C5664t.e.a) this.f37813c;
                if (aVar.f46906b.getAndSet(true)) {
                    return;
                }
                C5664t.this.f46874d.execute(new C8.a(aVar, 24));
                return;
            case 7:
                ((C5670z.d) this.f37813c).i.c();
                return;
            case 8:
                q0 q0Var = (q0) this.f37813c;
                q0Var.l(q0Var);
                return;
            case 9:
                r0 r0Var = (r0) this.f37813c;
                r0Var.x("Session call super.close()");
                A2.l.p(r0Var.f46840g, "Need to call openCaptureSession before using this API.");
                a0 a0Var = r0Var.f46835b;
                synchronized (a0Var.f46663b) {
                    a0Var.f46665d.add(r0Var);
                }
                r0Var.f46840g.f47112a.f47137a.close();
                r0Var.f46837d.execute(new RunnableC4331a(r0Var, i));
                return;
            default:
                Activity activity = (Activity) this.f37813c;
                if (activity.isFinishing()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    Class<?> cls = d.f47858a;
                    activity.recreate();
                    return;
                }
                Class<?> cls2 = d.f47858a;
                boolean z10 = i10 == 26 || i10 == 27;
                Method method = d.f47863f;
                if ((!z10 || method != null) && (d.f47862e != null || d.f47861d != null)) {
                    try {
                        Object obj2 = d.f47860c.get(activity);
                        if (obj2 != null && (obj = d.f47859b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            d.a aVar2 = new d.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar2);
                            Handler handler = d.f47864g;
                            handler.post(new RunnableC5789b(aVar2, obj2));
                            try {
                                if (i10 == 26 || i10 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new y0.c(application, aVar2));
                                return;
                            } finally {
                                handler.post(new y0.c(application, aVar2));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
        }
    }
}

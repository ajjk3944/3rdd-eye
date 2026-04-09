package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ypw {
    private static emc emc;

    public interface emc {
        boolean emc();

        ExecutorService xq();

        boolean ypw();
    }

    /* renamed from: com.bytedance.sdk.component.utils.ypw$ypw, reason: collision with other inner class name */
    public interface InterfaceC0122ypw {
        void emc();

        void emc(Throwable th);
    }

    public static void emc(emc emcVar) {
        emc = emcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean xq(Context context, Intent intent, InterfaceC0122ypw interfaceC0122ypw) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0122ypw == null) {
                    return true;
                }
                interfaceC0122ypw.emc();
                return true;
            } catch (Throwable th) {
                if (interfaceC0122ypw != null) {
                    interfaceC0122ypw.emc(th);
                }
            }
        }
        return false;
    }

    public static void emc(final Context context, final Intent intent, final InterfaceC0122ypw interfaceC0122ypw) {
        ExecutorService executorServiceXq;
        emc emcVar = emc;
        if (emcVar == null || !emcVar.ypw() || (executorServiceXq = emc.xq()) == null) {
            xq(context, intent, interfaceC0122ypw);
        } else {
            executorServiceXq.execute(new com.bytedance.sdk.component.msw.msw("startAct") { // from class: com.bytedance.sdk.component.utils.ypw.1
                @Override // java.lang.Runnable
                public void run() {
                    ypw.xq(context, intent, interfaceC0122ypw);
                }
            });
        }
    }

    public static boolean emc(final Context context, final Intent intent, final InterfaceC0122ypw interfaceC0122ypw, boolean z10) {
        emc emcVar;
        ExecutorService executorServiceXq;
        if (z10 && (emcVar = emc) != null && emcVar.emc() && (executorServiceXq = emc.xq()) != null) {
            executorServiceXq.execute(new com.bytedance.sdk.component.msw.msw("startAct") { // from class: com.bytedance.sdk.component.utils.ypw.2
                @Override // java.lang.Runnable
                public void run() {
                    ypw.xq(context, intent, interfaceC0122ypw);
                }
            });
            return true;
        }
        return xq(context, intent, interfaceC0122ypw);
    }

    public static Activity emc(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean emc(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}

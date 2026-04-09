package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt {
    private static ouw ouw;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface ouw {
        ExecutorService lh();

        boolean ouw();

        boolean vt();
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.component.utils.vt$vt, reason: collision with other inner class name */
    public interface InterfaceC0061vt {
        void ouw();

        void ouw(Throwable th2);
    }

    public static void ouw(ouw ouwVar) {
        ouw = ouwVar;
    }

    public static boolean vt(Context context, Intent intent, InterfaceC0061vt interfaceC0061vt) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0061vt == null) {
                    return true;
                }
                interfaceC0061vt.ouw();
                return true;
            } catch (Throwable th2) {
                if (interfaceC0061vt != null) {
                    interfaceC0061vt.ouw(th2);
                }
            }
        }
        return false;
    }

    public static void ouw(final Context context, final Intent intent, final InterfaceC0061vt interfaceC0061vt) {
        ExecutorService executorServiceLh;
        ouw ouwVar = ouw;
        if (ouwVar == null || !ouwVar.vt() || (executorServiceLh = ouw.lh()) == null) {
            vt(context, intent, interfaceC0061vt);
        } else {
            executorServiceLh.execute(new com.bytedance.sdk.component.pno.pno("startAct") { // from class: com.bytedance.sdk.component.utils.vt.1
                @Override // java.lang.Runnable
                public final void run() {
                    vt.vt(context, intent, interfaceC0061vt);
                }
            });
        }
    }

    public static boolean ouw(final Context context, final Intent intent, final InterfaceC0061vt interfaceC0061vt, boolean z3) {
        ouw ouwVar;
        ExecutorService executorServiceLh;
        if (z3 && (ouwVar = ouw) != null && ouwVar.ouw() && (executorServiceLh = ouw.lh()) != null) {
            executorServiceLh.execute(new com.bytedance.sdk.component.pno.pno("startAct") { // from class: com.bytedance.sdk.component.utils.vt.2
                @Override // java.lang.Runnable
                public final void run() {
                    vt.vt(context, intent, interfaceC0061vt);
                }
            });
            return true;
        }
        return vt(context, intent, interfaceC0061vt);
    }

    public static Activity ouw(View view) {
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

    public static boolean ouw(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}

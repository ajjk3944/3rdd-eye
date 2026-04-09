package io.sentry;

import android.os.Build;
import android.os.Process;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import io.sentry.android.ndk.SentryNdk;

/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12795a;

    public /* synthetic */ u4(int i10) {
        this.f12795a = i10;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12795a) {
            case 0:
                return;
            case 1:
                io.sentry.android.core.internal.util.e.f11648b = Process.myTid();
                return;
            case 2:
                SentryNdk.lambda$static$0();
                return;
            case 3:
                int i10 = AlarmManagerSchedulerBroadcastReceiver.f4018a;
                return;
            default:
                u.z zVar = AndroidComposeView.f1154e1;
                synchronized (zVar) {
                    try {
                        int i11 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = zVar.f23134a;
                            int i12 = zVar.f23135b;
                            while (i11 < i12) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i11];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.f1151b1;
                                androidComposeView.setShowLayoutBounds(y1.e0.m());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    AndroidComposeView.l(androidComposeView.getRoot());
                                }
                                i11++;
                            }
                        } else {
                            Object[] objArr2 = zVar.f23134a;
                            int i13 = zVar.f23135b;
                            while (i11 < i13) {
                                AndroidComposeView.l(((AndroidComposeView) objArr2[i11]).getRoot());
                                i11++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}

package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d6 extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                ((e6) this.b).l();
                return;
            case 1:
                if (intent != null) {
                    ((zb) this.b).g(intent);
                    return;
                }
                return;
            case 2:
                ((nt1) this.b).c();
                return;
            case 3:
                ((pv1) this.b).d(3);
                return;
            case 4:
                m30 m30Var = (m30) this.b;
                synchronized (m30Var) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : ((WeakHashMap) m30Var.i).entrySet()) {
                            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                                arrayList.add((BroadcastReceiver) entry.getKey());
                            }
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 5:
                ((Executor) ((vy2) this.b).c).execute(new n62(this, context, 29));
                return;
            case 6:
                qc3 qc3Var = (qc3) this.b;
                if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                    qc3Var.a(true, qc3Var.c);
                    qc3Var.b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        qc3Var.a(false, qc3Var.c);
                        qc3Var.b = false;
                        return;
                    }
                    return;
                }
            case 7:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    ((d13) this.b).d(new vr(10));
                    return;
                }
                return;
            case 8:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                x03 x03Var = (x03) this.b;
                x03Var.b(ae4.b(context, intent, (in2) x03Var.o, (AudioDeviceInfo) x03Var.n));
                return;
            default:
                lf4 lf4Var = (lf4) this.b;
                if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
                    lf4Var.e = true;
                    return;
                } else {
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        lf4Var.e = false;
                        return;
                    }
                    return;
                }
        }
    }

    public d6() {
        this.a = 6;
        this.b = qc3.d;
    }

    public d6(tt3 tt3Var, d13 d13Var) {
        this.a = 7;
        this.b = d13Var;
    }
}

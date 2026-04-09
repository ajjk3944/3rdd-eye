package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p.v2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11540a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v2 f11541d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f11542g;

    public /* synthetic */ b(v2 v2Var, Activity activity, int i10) {
        this.f11540a = i10;
        this.f11541d = v2Var;
        this.f11542g = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f11540a) {
            case 0:
                a5.t tVar = ((FrameMetricsAggregator) ((io.sentry.util.e) this.f11541d.f20201d).a()).f1209a;
                tVar.getClass();
                if (a5.t.f151f == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    a5.t.f151f = handlerThread;
                    handlerThread.start();
                    a5.t.f152g = new Handler(a5.t.f151f.getLooper());
                }
                for (int i10 = 0; i10 <= 8; i10++) {
                    SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) tVar.f154b;
                    if (sparseIntArrayArr[i10] == null && (tVar.f153a & (1 << i10)) != 0) {
                        sparseIntArrayArr[i10] = new SparseIntArray();
                    }
                }
                Activity activity2 = this.f11542g;
                activity2.getWindow().addOnFrameMetricsAvailableListener((g3.h) tVar.f156d, a5.t.f152g);
                ((ArrayList) tVar.f155c).add(new WeakReference(activity2));
                break;
            default:
                a5.t tVar2 = ((FrameMetricsAggregator) ((io.sentry.util.e) this.f11541d.f20201d).a()).f1209a;
                ArrayList arrayList = (ArrayList) tVar2.f155c;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    activity = this.f11542g;
                    if (zHasNext) {
                        WeakReference weakReference = (WeakReference) it.next();
                        if (weakReference.get() == activity) {
                            arrayList.remove(weakReference);
                        }
                    }
                }
                activity.getWindow().removeOnFrameMetricsAvailableListener((g3.h) tVar2.f156d);
                break;
        }
    }
}

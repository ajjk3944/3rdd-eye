package qe;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import ba.f;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import e4.c2;
import e4.s;
import e4.v0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import je.z;
import zh.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements f, s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32276d;

    public /* synthetic */ b(Object obj, Object obj2, boolean z3, Object obj3) {
        this.f32274b = obj;
        this.f32275c = obj2;
        this.f32273a = z3;
        this.f32276d = obj3;
    }

    @Override // ba.f
    public void a(Exception exc) throws Throwable {
        c cVar = (c) this.f32274b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f32275c;
        je.b bVar = (je.b) this.f32276d;
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (this.f32273a) {
            boolean z3 = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new k1.b(8, cVar, countDownLatch)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = z.f27634a;
            boolean z10 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            nanos = jNanoTime - System.nanoTime();
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                if (z10) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = z10;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // e4.s
    public c2 j(View view, c2 c2Var) {
        SettingsActivity settingsActivity = (SettingsActivity) this.f32274b;
        Toolbar toolbar = (Toolbar) this.f32275c;
        ScrollView scrollView = (ScrollView) this.f32276d;
        int i4 = SettingsActivity.J;
        v3.b bVarX = nh.a.x(c2Var);
        int i10 = bVarX.f35796d;
        int i11 = bVarX.f35795c;
        int i12 = bVarX.f35793a;
        i.a(toolbar, bVarX);
        if (this.f32273a) {
            View viewFindViewById = settingsActivity.findViewById(R.id.container);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams();
            marginLayoutParams.topMargin = toolbar.getLayoutParams().height;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i11;
            marginLayoutParams.bottomMargin = i10;
            viewFindViewById.setLayoutParams(marginLayoutParams);
        } else {
            scrollView.setPadding(i12, toolbar.getLayoutParams().height, i11, i10);
        }
        return v0.j(view, c2Var);
    }
}

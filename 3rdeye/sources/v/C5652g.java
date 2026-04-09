package v;

import android.hardware.camera2.TotalCaptureResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.zipoapps.premiumhelper.ui.rate.f;
import o0.b;
import v.C5658m;

/* compiled from: R8$$SyntheticClass */
/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5652g implements b.c, OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f46698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46699c;

    public /* synthetic */ C5652g(long j4, f.a aVar) {
        this.f46698b = j4;
        this.f46699c = aVar;
    }

    @Override // o0.b.c
    public Object i(final b.a aVar) {
        C5658m c5658m = (C5658m) this.f46699c;
        c5658m.getClass();
        final long j4 = this.f46698b;
        c5658m.l(new C5658m.c() { // from class: v.h
            @Override // v.C5658m.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                if (!C5658m.s(totalCaptureResult, j4)) {
                    return false;
                }
                aVar.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j4;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task it) {
        kotlin.jvm.internal.l.f(it, "it");
        ((f.a) this.f46699c).a(System.currentTimeMillis() - this.f46698b > 2000 ? f.c.IN_APP_REVIEW : f.c.NONE);
    }

    public /* synthetic */ C5652g(C5658m c5658m, long j4) {
        this.f46699c = c5658m;
        this.f46698b = j4;
    }
}

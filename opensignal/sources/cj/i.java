package cj;

import android.app.job.JobParameters;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class i extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final JobParameters f3986g;

    /* JADX WARN: Illegal instructions before constructor call */
    public i(JobParameters jobParameters) {
        Bundle transientExtras = jobParameters.getTransientExtras();
        br.l.d(transientExtras, "getTransientExtras(...)");
        super(3, transientExtras);
        this.f3986g = jobParameters;
    }
}

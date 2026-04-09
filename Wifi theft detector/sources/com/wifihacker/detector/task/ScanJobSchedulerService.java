package com.wifihacker.detector.task;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.RequiresApi;
import g8.k;
import w8.a;

@RequiresApi(api = 21)
/* loaded from: classes3.dex */
public class ScanJobSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        switch (jobParameters.getJobId()) {
            case 1:
                a.b().d(this, 4);
                break;
            case 2:
                a.b().d(this, 3);
                break;
            case 3:
            case 4:
            case 5:
                try {
                    startService(new Intent(this, (Class<?>) ScanNoticeService.class));
                    break;
                } catch (Exception e10) {
                    k.b(Log.getStackTraceString(e10));
                    return false;
                }
            case 6:
                a.b().d(this, 5);
                break;
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}

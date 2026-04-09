package com.vungle.ads.internal.task;

import android.os.Bundle;

/* compiled from: JobInfo.kt */
/* loaded from: classes2.dex */
public final class d implements Cloneable {
    public static final a Companion = new a(null);
    private static final String TAG = "JobInfo";
    private long delay;
    private Bundle extras;
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    /* compiled from: JobInfo.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public d(String jobTag) {
        kotlin.jvm.internal.l.f(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    public Object clone() {
        return super.clone();
    }

    public final d copy() throws CloneNotSupportedException {
        try {
            Object objClone = super.clone();
            kotlin.jvm.internal.l.d(objClone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (d) objClone;
        } catch (CloneNotSupportedException e4) {
            com.vungle.ads.internal.util.k.Companion.e(TAG, "Cannot copy JobInfo " + this, e4);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j4 = this.rescheduleTimeout;
        if (j4 == 0) {
            return 0L;
        }
        long j10 = this.nextRescheduleTimeout;
        if (j10 == 0) {
            this.nextRescheduleTimeout = j4;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j10 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    public final d setDelay(long j4) {
        this.delay = j4;
        return this;
    }

    public final d setExtras(Bundle extras) {
        kotlin.jvm.internal.l.f(extras, "extras");
        this.extras = extras;
        return this;
    }

    public final d setPriority(int i) {
        this.priority = i;
        return this;
    }

    public final d setRequiredNetworkType(int i) {
        this.requiredNetworkType = i;
        return this;
    }

    public final d setReschedulePolicy(long j4, int i) {
        this.rescheduleTimeout = j4;
        this.reschedulePolicy = i;
        return this;
    }

    public final d setUpdateCurrent(boolean z10) {
        this.updateCurrent = z10;
        return this;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }
}

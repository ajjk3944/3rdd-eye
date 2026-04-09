package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ResendTpatJob implements Job {

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public static final String TAG = "ResendTpatJob";

    @NotNull
    private final Context context;

    @NotNull
    private final q pathProvider;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final JobInfo makeJobInfo() {
            return new JobInfo(ResendTpatJob.TAG).setPriority(0).setUpdateCurrent(true);
        }

        private a() {
        }
    }

    public ResendTpatJob(@NotNull Context context, @NotNull q pathProvider) {
        p.e(context, "context");
        p.e(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.h m353onRunJob$lambda0(y8.h hVar) {
        return (com.vungle.ads.internal.network.h) hVar.getValue();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final q getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(@NotNull Bundle bundle, @NotNull c jobRunner) {
        p.e(bundle, "bundle");
        p.e(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        final Context context = this.context;
        m353onRunJob$lambda0(kotlin.b.a(LazyThreadSafetyMode.f21907a, new l9.a() { // from class: com.vungle.ads.internal.task.ResendTpatJob$onRunJob$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.h, java.lang.Object] */
            @Override // l9.a
            @NotNull
            public final com.vungle.ads.internal.network.h invoke() {
                return ServiceLocator.Companion.getInstance(context).getService(com.vungle.ads.internal.network.h.class);
            }
        })).resendStoredTpats$vungle_ads_release();
        return 0;
    }
}

package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.q;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g implements a {

    @NotNull
    private final Context context;

    @NotNull
    private final q pathProvider;

    public g(@NotNull Context context, @NotNull q pathProvider) {
        p.e(context, "context");
        p.e(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.a
    @NotNull
    public Job create(@NotNull String tag) throws UnknownTagException {
        p.e(tag, "tag");
        if (tag.length() == 0) {
            throw new UnknownTagException("Job tag is null");
        }
        if (p.a(tag, CleanupJob.TAG)) {
            return new CleanupJob(this.context, this.pathProvider);
        }
        if (p.a(tag, ResendTpatJob.TAG)) {
            return new ResendTpatJob(this.context, this.pathProvider);
        }
        throw new UnknownTagException("Unknown Job Type " + tag);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final q getPathProvider() {
        return this.pathProvider;
    }
}

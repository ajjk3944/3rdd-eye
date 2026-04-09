package com.vungle.ads.internal.task;

import android.content.Context;

/* compiled from: VungleJobCreator.kt */
/* loaded from: classes2.dex */
public final class l implements c {
    private final Context context;
    private final com.vungle.ads.internal.util.l pathProvider;

    public l(Context context, com.vungle.ads.internal.util.l pathProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.c
    public b create(String tag) throws k {
        kotlin.jvm.internal.l.f(tag, "tag");
        if (tag.length() == 0) {
            throw new k("Job tag is null");
        }
        if (tag.equals(a.TAG)) {
            return new a(this.context, this.pathProvider);
        }
        if (tag.equals(i.TAG)) {
            return new i(this.context, this.pathProvider);
        }
        throw new k("Unknown Job Type ".concat(tag));
    }

    public final Context getContext() {
        return this.context;
    }

    public final com.vungle.ads.internal.util.l getPathProvider() {
        return this.pathProvider;
    }
}

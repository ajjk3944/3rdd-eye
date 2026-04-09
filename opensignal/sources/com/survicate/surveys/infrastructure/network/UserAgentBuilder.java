package com.survicate.surveys.infrastructure.network;

import android.os.Build;
import h0.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/UserAgentBuilder;", "", "()V", "build", "", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserAgentBuilder {
    public static final UserAgentBuilder INSTANCE = new UserAgentBuilder();

    private UserAgentBuilder() {
    }

    public final String build() {
        StringBuilder sb2 = new StringBuilder("SurvicateSDK/6.4.3 (Android ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append('/');
        return b.r(sb2, Build.VERSION.RELEASE, ')');
    }
}

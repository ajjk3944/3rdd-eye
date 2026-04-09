package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleOpenUrl;", "Lcom/unity3d/ads/core/domain/HandleOpenUrl;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "Ly8/s;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidHandleOpenUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHandleOpenUrl.kt\ncom/unity3d/ads/core/domain/AndroidHandleOpenUrl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/* loaded from: classes3.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {

    @NotNull
    private final Context context;

    public AndroidHandleOpenUrl(@NotNull Context context) {
        p.e(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public void invoke(@NotNull String url, @Nullable String packageName) {
        p.e(url, "url");
        Intent intent = new Intent();
        if (packageName == null || packageName.length() <= 0) {
            packageName = null;
        }
        intent.setPackage(packageName);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }
}

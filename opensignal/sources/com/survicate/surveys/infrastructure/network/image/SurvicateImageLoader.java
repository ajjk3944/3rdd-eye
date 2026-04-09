package com.survicate.surveys.infrastructure.network.image;

import android.content.Context;
import android.widget.ImageView;
import ar.k;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ=\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\rH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/image/SurvicateImageLoader;", "", "Landroid/content/Context;", "context", "Landroid/widget/ImageView;", "imageView", "", "data", "Llq/b0;", "loadCompanyLogo", "(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V", "loadAvatar", "imageUrl", "Lkotlin/Function1;", "", "onLoadingComplete", "loadSurveyPointImage", "(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Lar/k;)V", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SurvicateImageLoader {
    void loadAvatar(Context context, ImageView imageView, String data);

    void loadCompanyLogo(Context context, ImageView imageView, String data);

    void loadSurveyPointImage(Context context, ImageView imageView, String imageUrl, k onLoadingComplete);
}

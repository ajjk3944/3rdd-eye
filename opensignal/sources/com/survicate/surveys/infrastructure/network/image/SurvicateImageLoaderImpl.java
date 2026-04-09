package com.survicate.surveys.infrastructure.network.image;

import a8.a;
import a8.f;
import a8.g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import ar.k;
import br.l;
import c8.i0;
import c8.v;
import c8.y;
import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import kotlin.Metadata;
import l8.i;
import n8.b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\fJ=\u0010\u0012\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/image/SurvicateImageLoaderImpl;", "Lcom/survicate/surveys/infrastructure/network/image/SurvicateImageLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/ImageView;", "imageView", "", "data", "Llq/b0;", "loadCompanyLogo", "(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;)V", "loadAvatar", "imageUrl", "Lkotlin/Function1;", "", "onLoadingComplete", "loadSurveyPointImage", "(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Lar/k;)V", "La8/g;", "imageLoader", "La8/g;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateImageLoaderImpl implements SurvicateImageLoader {
    private final g imageLoader;

    public SurvicateImageLoaderImpl(Context context) {
        l.e(context, "context");
        f fVar = new f(new f(context).d());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new i0());
        if (Build.VERSION.SDK_INT >= 28) {
            arrayList5.add(new y());
        } else {
            arrayList5.add(new v());
        }
        fVar.f201g = new a(e5.R(arrayList), e5.R(arrayList2), e5.R(arrayList3), e5.R(arrayList4), e5.R(arrayList5));
        this.imageLoader = fVar.d();
    }

    @Override // com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader
    public void loadAvatar(Context context, ImageView imageView, String data) {
        l.e(imageView, "imageView");
        if (data == null || tt.l.D0(data)) {
            return;
        }
        if (context == null) {
            context = imageView.getContext();
        }
        l.b(context);
        i iVar = new i(context);
        iVar.f14913c = data;
        iVar.f14914d = new b(imageView);
        iVar.k = null;
        iVar.f14920l = null;
        iVar.f14921m = null;
        iVar.f14915e = e5.R(mq.l.A0(new o8.a[]{new o8.a()}));
        ((a8.l) this.imageLoader).b(iVar.a());
    }

    @Override // com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader
    public void loadCompanyLogo(Context context, ImageView imageView, String data) {
        l.e(imageView, "imageView");
        if (data == null || tt.l.D0(data)) {
            return;
        }
        if (context == null) {
            context = imageView.getContext();
        }
        l.b(context);
        i iVar = new i(context);
        iVar.f14913c = data;
        iVar.f14914d = new b(imageView);
        iVar.k = null;
        iVar.f14920l = null;
        iVar.f14921m = null;
        ((a8.l) this.imageLoader).b(iVar.a());
    }

    @Override // com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader
    public void loadSurveyPointImage(Context context, final ImageView imageView, String imageUrl, final k onLoadingComplete) {
        l.e(imageView, "imageView");
        l.e(imageUrl, "imageUrl");
        l.e(onLoadingComplete, "onLoadingComplete");
        b bVar = new b(imageView) { // from class: com.survicate.surveys.infrastructure.network.image.SurvicateImageLoaderImpl$loadSurveyPointImage$target$1
            @Override // n8.a
            public void onError(Drawable error) {
                updateDrawable(error);
                onLoadingComplete.a(Boolean.FALSE);
            }

            @Override // n8.a
            public void onSuccess(Drawable result) {
                l.e(result, "result");
                updateDrawable(result);
                onLoadingComplete.a(Boolean.TRUE);
            }
        };
        if (context == null) {
            context = imageView.getContext();
        }
        l.b(context);
        i iVar = new i(context);
        iVar.f14913c = imageUrl;
        iVar.f14914d = bVar;
        iVar.k = null;
        iVar.f14920l = null;
        iVar.f14921m = null;
        ((a8.l) this.imageLoader).b(iVar.a());
    }
}

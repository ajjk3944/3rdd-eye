.class public abstract LH0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm0/J0$a;Landroid/content/res/Resources;I)Lm0/J0;
    .locals 0

    const/4 p0, 0x0

    invoke-virtual {p1, p2, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0}, Lm0/O;->c(Landroid/graphics/Bitmap;)Lm0/J0;

    move-result-object p0

    return-object p0
.end method

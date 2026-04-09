.class public abstract LS6/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/drawable/Drawable;Ljava/util/List;LT/l;I)Lr0/d;
    .locals 9

    const-string/jumbo v0, "drawable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imagePlugins"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x18649388

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.skydoves.landscapist.rememberDrawablePainter (RememberDrawablePainter.kt:49)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const v0, 0x45ab67ec

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    :cond_1
    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_2

    new-instance v0, Lr0/a;

    move-object v1, p0

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    const-string/jumbo v2, "getBitmap(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lm0/O;->c(Landroid/graphics/Bitmap;)Lm0/J0;

    move-result-object v2

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lr0/a;-><init>(Lm0/J0;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    instance-of v0, p0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_3

    new-instance v0, Lr0/c;

    move-object v1, p0

    check-cast v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result v1

    invoke-static {v1}, Lm0/x0;->b(I)J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lr0/c;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_3
    new-instance v0, LS6/c;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string/jumbo v2, "mutate(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LS6/c;-><init>(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :goto_1
    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lr0/d;

    invoke-interface {p2}, LT/l;->J()V

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lx1/b;->b(Landroid/graphics/drawable/Drawable;IILandroid/graphics/Bitmap$Config;ILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0}, Lm0/O;->c(Landroid/graphics/Bitmap;)Lm0/J0;

    move-result-object p0

    and-int/lit8 p3, p3, 0x70

    invoke-static {v1, p1, p0, p2, p3}, LX6/a;->a(Lr0/d;Ljava/util/List;Lm0/J0;LT/l;I)Lr0/d;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p2}, LT/l;->J()V

    return-object p0
.end method

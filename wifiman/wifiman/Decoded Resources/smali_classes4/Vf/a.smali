.class public abstract LVf/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LT/l;I)Ll0/i;
    .locals 3

    const v0, 0x8358526

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.valentinilk.shimmer.rememberWindowBounds (ScreenInfo.android.kt:8)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, -0x758bcf6b

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    new-instance v0, Ll0/i;

    iget v1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Ll0/i;-><init>(FFFF)V

    invoke-interface {p0, v0}, LT/l;->K(Ljava/lang/Object;)V

    move-object p1, v0

    :cond_1
    check-cast p1, Ll0/i;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method

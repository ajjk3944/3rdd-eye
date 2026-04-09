.class public abstract Lm0/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JI)Landroid/graphics/ColorFilter;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    sget-object v0, Lm0/j0;->a:Lm0/j0;

    invoke-virtual {v0, p0, p1, p2}, Lm0/j0;->a(JI)Landroid/graphics/BlendModeColorFilter;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {p0, p1}, Lm0/x0;->j(J)I

    move-result p0

    invoke-static {p2}, Lm0/F;->c(I)Landroid/graphics/PorterDuff$Mode;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final b(Lm0/w0;)Landroid/graphics/ColorFilter;
    .locals 0

    invoke-virtual {p0}, Lm0/w0;->a()Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0
.end method

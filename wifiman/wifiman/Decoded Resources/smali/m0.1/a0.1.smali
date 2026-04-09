.class public abstract Lm0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(I)Landroid/graphics/Shader$TileMode;
    .locals 2

    sget-object v0, Lm0/m1;->a:Lm0/m1$a;

    invoke-virtual {v0}, Lm0/m1$a;->a()I

    move-result v1

    invoke-static {p0, v1}, Lm0/m1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/m1$a;->d()I

    move-result v1

    invoke-static {p0, v1}, Lm0/m1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lm0/m1$a;->c()I

    move-result v1

    invoke-static {p0, v1}, Lm0/m1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p0, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lm0/m1$a;->b()I

    move-result v0

    invoke-static {p0, v0}, Lm0/m1;->f(II)Z

    move-result p0

    if-eqz p0, :cond_4

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1f

    if-lt p0, v0, :cond_3

    sget-object p0, Lm0/o1;->a:Lm0/o1;

    invoke-virtual {p0}, Lm0/o1;->b()Landroid/graphics/Shader$TileMode;

    move-result-object p0

    goto :goto_0

    :cond_3
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    goto :goto_0

    :cond_4
    sget-object p0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_0
    return-object p0
.end method

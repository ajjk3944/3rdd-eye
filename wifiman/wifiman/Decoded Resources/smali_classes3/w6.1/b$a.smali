.class public abstract Lw6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lw6/b;Z)F
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lw6/b;->d()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lw6/b;->b()F

    move-result p0

    :goto_0
    return p0
.end method

.method public static b(Lw6/b;Z)F
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p0}, Lw6/b;->b()F

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lw6/b;->d()F

    move-result p0

    :goto_0
    return p0
.end method

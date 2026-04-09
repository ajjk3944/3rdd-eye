.class public abstract Lj6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lj6/b;)F
    .locals 0

    invoke-interface {p0}, Lj6/b;->g()F

    move-result p0

    return p0
.end method

.method public static b(Lj6/b;)F
    .locals 0

    invoke-interface {p0}, Lj6/b;->e()F

    move-result p0

    return p0
.end method

.method public static c(Lj6/b;)F
    .locals 1

    invoke-interface {p0}, Lj6/b;->g()F

    move-result v0

    invoke-interface {p0}, Lj6/b;->e()F

    move-result p0

    add-float/2addr v0, p0

    return v0
.end method

.method public static d(Lj6/b;F)Lj6/b;
    .locals 2

    invoke-interface {p0}, Lj6/b;->g()F

    move-result v0

    mul-float/2addr v0, p1

    invoke-interface {p0}, Lj6/b;->e()F

    move-result v1

    mul-float/2addr v1, p1

    invoke-interface {p0}, Lj6/b;->d()La6/a;

    move-result-object p0

    invoke-static {v0, v1, p0}, Lj6/c;->a(FFLa6/a;)Lj6/b;

    move-result-object p0

    return-object p0
.end method

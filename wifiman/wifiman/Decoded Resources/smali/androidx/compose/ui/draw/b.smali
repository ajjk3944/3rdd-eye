.class public abstract Landroidx/compose/ui/draw/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/l;)Lj0/c;
    .locals 2

    new-instance v0, Landroidx/compose/ui/draw/a;

    new-instance v1, Lj0/d;

    invoke-direct {v1}, Lj0/d;-><init>()V

    invoke-direct {v0, v1, p0}, Landroidx/compose/ui/draw/a;-><init>(Lj0/d;Lmh/l;)V

    return-object v0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawBehindElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawBehindElement;-><init>(Lmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithCacheElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithCacheElement;-><init>(Lmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Landroidx/compose/ui/draw/DrawWithContentElement;

    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawWithContentElement;-><init>(Lmh/l;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

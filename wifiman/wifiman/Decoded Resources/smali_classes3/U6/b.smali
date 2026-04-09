.class public abstract LU6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;Lz/f;)Landroidx/compose/ui/e;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "boxConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lz/f;->c()F

    move-result v0

    invoke-interface {p1}, Lz/f;->b()F

    move-result v1

    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/r;->A(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-interface {p1}, Lz/f;->g()F

    move-result v1

    invoke-interface {p1}, Lz/f;->e()F

    move-result p1

    invoke-static {p0, v1, p1}, Landroidx/compose/foundation/layout/r;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-interface {v0, p0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

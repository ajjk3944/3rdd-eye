.class public abstract Ls/Y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 2

    const/4 v0, 0x1

    sget-object v1, Ls/Y$b;->a:Ls/Y$b;

    invoke-static {p0, v0, v1}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;FLsh/e;I)Landroidx/compose/ui/e;
    .locals 1

    new-instance v0, Ls/Y$a;

    invoke-direct {v0, p1, p2, p3}, Ls/Y$a;-><init>(FLsh/e;I)V

    const/4 p1, 0x1

    invoke-static {p0, p1, v0}, LJ0/m;->b(Landroidx/compose/ui/e;ZLmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/e;FLsh/e;IILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    const/high16 p5, 0x3f800000    # 1.0f

    invoke-static {p2, p5}, Lsh/m;->b(FF)Lsh/e;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3}, Ls/Y;->b(Landroidx/compose/ui/e;FLsh/e;I)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

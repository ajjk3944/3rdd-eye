.class public abstract Ljj/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ly0/G;JLmh/a;Lmh/a;Lmh/p;Ldh/e;)Ljava/lang/Object;
    .locals 8

    new-instance v7, Ljj/f$a;

    const/4 v6, 0x0

    move-object v0, v7

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Ljj/f$a;-><init>(JLmh/a;Lmh/a;Lmh/p;Ldh/e;)V

    invoke-interface {p0, v7, p6}, Ly0/G;->P(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/e;Ljj/i;)Landroidx/compose/ui/e;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v1, LYg/J;->a:LYg/J;

    new-instance v2, Ljj/f$b;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3}, Ljj/f$b;-><init>(Ljj/i;Ldh/e;)V

    invoke-static {v0, v1, v2}, Ly0/P;->d(Landroidx/compose/ui/e;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.class public abstract LT5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(J)J
    .locals 0

    invoke-static {p0, p1}, LT5/a;->c(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final b(Landroidx/compose/ui/e;Lmh/l;Lw/y;Lmh/p;Ly/m;)Landroidx/compose/ui/e;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "interactionSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, LYg/J;->a:LYg/J;

    new-instance v2, LT5/a$a;

    invoke-direct {v2, p1, v0}, LT5/a$a;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p0, v1, v1, v2}, Ly0/P;->c(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_0
    if-eqz p3, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, p3, v1, v2, v0}, LU5/a;->b(Landroidx/compose/ui/e;Lmh/p;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    :cond_1
    move-object v1, p0

    if-eqz p2, :cond_2

    sget-object v3, Lw/q;->Horizontal:Lw/q;

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v2, p2

    move-object v7, p4

    invoke-static/range {v1 .. v9}, Landroidx/compose/foundation/gestures/d;->i(Landroidx/compose/ui/e;Lw/y;Lw/q;ZZLw/n;Ly/m;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    sget-object p0, LYg/J;->a:LYg/J;

    new-instance p2, LT5/a$b;

    invoke-direct {p2, p1, v0}, LT5/a$b;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {v1, p0, p0, p2}, Ly0/P;->c(Landroidx/compose/ui/e;Ljava/lang/Object;Ljava/lang/Object;Lmh/p;)Landroidx/compose/ui/e;

    move-result-object v1

    :cond_3
    :goto_0
    return-object v1
.end method

.method private static final c(J)J
    .locals 1

    invoke-static {p0, p1}, Ll0/g;->m(J)F

    move-result v0

    invoke-static {p0, p1}, Ll0/g;->n(J)F

    move-result p0

    invoke-static {v0, p0}, LD6/b;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method

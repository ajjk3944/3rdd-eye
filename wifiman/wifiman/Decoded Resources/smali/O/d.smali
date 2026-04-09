.class public abstract LO/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;
    .locals 1

    sget-object v0, LO/d$a;->a:LO/d$a;

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    new-instance v0, LO/d$b;

    invoke-direct {v0, p1, p2}, LO/d$b;-><init>(LO/g;Z)V

    invoke-static {p0, v0}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

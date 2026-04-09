.class public abstract LM/I;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM/G;Lv/i;)Lmh/l;
    .locals 1

    new-instance v0, LM/I$a;

    invoke-direct {v0, p0, p1}, LM/I$a;-><init>(LM/G;Lv/i;)V

    return-object v0
.end method

.method public static final b(Ly0/n;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Landroidx/compose/ui/e;LM/G;)Landroidx/compose/ui/e;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Ls/K;->d(IILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LM/I$b;

    invoke-direct {v0, p1}, LM/I$b;-><init>(LM/G;)V

    invoke-static {p0, v2, v0, v1, v2}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/e;Lmh/l;Lmh/q;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

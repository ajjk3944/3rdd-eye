.class public abstract Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Ld2/a;
    .locals 4

    :try_start_0
    invoke-static {}, LIi/c0;->c()LIi/H0;

    move-result-object v0

    invoke-virtual {v0}, LIi/H0;->p0()LIi/H0;

    move-result-object v0
    :try_end_0
    .catch LYg/r; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Ldh/j;->a:Ldh/j;

    goto :goto_0

    :catch_1
    sget-object v0, Ldh/j;->a:Ldh/j;

    :goto_0
    new-instance v1, Ld2/a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v2, v3}, LIi/S0;->b(LIi/y0;ILjava/lang/Object;)LIi/A;

    move-result-object v2

    invoke-interface {v0, v2}, Ldh/i;->plus(Ldh/i;)Ldh/i;

    move-result-object v0

    invoke-direct {v1, v0}, Ld2/a;-><init>(Ldh/i;)V

    return-object v1
.end method

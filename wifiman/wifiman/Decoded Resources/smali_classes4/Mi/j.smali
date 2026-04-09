.class public abstract LMi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LLi/h;[LLi/g;Lmh/a;Lmh/q;Ldh/e;)Ljava/lang/Object;
    .locals 7

    new-instance v6, LMi/j$a;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, LMi/j$a;-><init>([LLi/g;Lmh/a;Lmh/q;LLi/h;Ldh/e;)V

    invoke-static {v6, p4}, LMi/m;->a(Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

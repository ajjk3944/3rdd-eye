.class abstract synthetic LLi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lmh/p;)LLi/g;
    .locals 8

    new-instance v7, LLi/b;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LLi/b;-><init>(Lmh/p;Ldh/i;ILKi/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public static final b()LLi/g;
    .locals 1

    sget-object v0, LLi/f;->a:LLi/f;

    return-object v0
.end method

.method public static final c(Lmh/p;)LLi/g;
    .locals 1

    new-instance v0, LLi/C;

    invoke-direct {v0, p0}, LLi/C;-><init>(Lmh/p;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;)LLi/g;
    .locals 1

    new-instance v0, LLi/j$a;

    invoke-direct {v0, p0}, LLi/j$a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

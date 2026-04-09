.class public abstract Lbj/L;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Laj/b;Laj/j;LVi/a;)Ljava/lang/Object;
    .locals 8

    const-string v0, "json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Laj/E;

    if-eqz v0, :cond_0

    new-instance v0, Lbj/z;

    move-object v3, p1

    check-cast v3, Laj/E;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lbj/z;-><init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_0
    instance-of v0, p1, Laj/c;

    if-eqz v0, :cond_1

    new-instance v0, Lbj/A;

    check-cast p1, Laj/c;

    invoke-direct {v0, p0, p1}, Lbj/A;-><init>(Laj/b;Laj/c;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Laj/x;

    if-nez v0, :cond_3

    sget-object v0, Laj/B;->INSTANCE:Laj/B;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_3
    :goto_0
    new-instance v6, Lbj/v;

    move-object v2, p1

    check-cast v2, Laj/G;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lbj/v;-><init>(Laj/b;Laj/j;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    invoke-virtual {v0, p2}, Lbj/c;->t(LVi/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Laj/b;Ljava/lang/String;Laj/E;LVi/a;)Ljava/lang/Object;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "discriminator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbj/z;

    invoke-interface {p3}, LVi/a;->a()LXi/f;

    move-result-object v1

    invoke-direct {v0, p0, p2, p1, v1}, Lbj/z;-><init>(Laj/b;Laj/E;Ljava/lang/String;LXi/f;)V

    invoke-virtual {v0, p3}, Lbj/c;->t(LVi/a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

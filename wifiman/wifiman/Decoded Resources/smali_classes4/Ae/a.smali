.class public abstract LAe/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/u;LAe/p;LAe/n;Lmh/q;Lmh/q;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LAe/p;->a()Ljava/lang/String;

    move-result-object v0

    instance-of v1, p1, LAe/p$a;

    if-eqz v1, :cond_0

    check-cast p1, LAe/p$a;

    invoke-interface {p1}, LAe/p$a;->j()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, LAe/p$b;

    if-eqz p1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :goto_0
    new-instance v1, LAe/a$b;

    invoke-direct {v1, p3, p4}, LAe/a$b;-><init>(Lmh/q;Lmh/q;)V

    const p3, 0x713d3706

    const/4 p4, 0x1

    invoke-static {p3, p4, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p3

    invoke-static {p0, v0, p1, p2, p3}, LAe/a;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;)V

    return-void

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;)V
    .locals 14

    move-object/from16 v0, p4

    const-string v1, "<this>"

    move-object v2, p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "route"

    move-object v3, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "arguments"

    move-object/from16 v4, p2

    invoke-static {v4, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "content"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    invoke-virtual/range {p3 .. p3}, LAe/n;->getEnterTransition()Lmh/l;

    move-result-object v5

    move-object v6, v5

    goto :goto_0

    :cond_0
    move-object v6, v1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual/range {p3 .. p3}, LAe/n;->getExitTransition()Lmh/l;

    move-result-object v5

    move-object v7, v5

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    if-eqz p3, :cond_2

    invoke-virtual/range {p3 .. p3}, LAe/n;->getPopEnterTransition()Lmh/l;

    move-result-object v5

    move-object v8, v5

    goto :goto_2

    :cond_2
    move-object v8, v1

    :goto_2
    if-eqz p3, :cond_3

    invoke-virtual/range {p3 .. p3}, LAe/n;->getPopExitTransition()Lmh/l;

    move-result-object v1

    :cond_3
    move-object v9, v1

    new-instance v1, LAe/a$a;

    invoke-direct {v1, v0}, LAe/a$a;-><init>(Lmh/q;)V

    const v0, 0x47e4b595

    const/4 v5, 0x1

    invoke-static {v0, v5, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v11

    const/16 v12, 0x84

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v13}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, LAe/a;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;LAe/n;Lmh/q;)V

    return-void
.end method

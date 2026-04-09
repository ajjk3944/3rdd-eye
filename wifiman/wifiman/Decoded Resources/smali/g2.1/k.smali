.class public abstract Lg2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;)V
    .locals 3

    new-instance v0, Lg2/f;

    invoke-virtual {p0}, Lf2/u;->h()Lf2/E;

    move-result-object v1

    const-class v2, Lg2/e;

    invoke-virtual {v1, v2}, Lf2/E;->d(Ljava/lang/Class;)Lf2/D;

    move-result-object v1

    check-cast v1, Lg2/e;

    invoke-direct {v0, v1, p1, p9}, Lg2/f;-><init>(Lg2/e;Ljava/lang/String;Lmh/r;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf2/e;

    invoke-virtual {p2}, Lf2/e;->a()Ljava/lang/String;

    move-result-object p9

    invoke-virtual {p2}, Lf2/e;->b()Lf2/h;

    move-result-object p2

    invoke-virtual {v0, p9, p2}, Lf2/s;->a(Ljava/lang/String;Lf2/h;)V

    goto :goto_0

    :cond_0
    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lf2/p;

    invoke-virtual {v0, p2}, Lf2/s;->c(Lf2/p;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p4}, Lg2/f;->h(Lmh/l;)V

    invoke-virtual {v0, p5}, Lg2/f;->i(Lmh/l;)V

    invoke-virtual {v0, p6}, Lg2/f;->j(Lmh/l;)V

    invoke-virtual {v0, p7}, Lg2/f;->k(Lmh/l;)V

    invoke-virtual {v0, p8}, Lg2/f;->l(Lmh/l;)V

    invoke-virtual {p0, v0}, Lf2/u;->g(Lf2/s;)V

    return-void
.end method

.method public static synthetic b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object/from16 v7, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v8, v6

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v9, v7

    goto :goto_5

    :cond_5
    move-object/from16 v9, p7

    :goto_5
    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_6

    move-object v10, v2

    goto :goto_6

    :cond_6
    move-object/from16 v10, p8

    :goto_6
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v11, p9

    invoke-static/range {v2 .. v11}, Lg2/k;->a(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;)V

    return-void
.end method

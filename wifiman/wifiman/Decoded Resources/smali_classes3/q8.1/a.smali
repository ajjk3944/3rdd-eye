.class public abstract Lq8/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lwc/a;LCc/a$b;Lwc/b;Z)LBe/A0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lwc/a;->d()Lh9/a;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    if-eqz v1, :cond_0

    sget-object v4, Lcom/ubnt/usurvey/product/m$c;->SMALL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v1, v4}, Ln8/m;->c(LCc/k;Lcom/ubnt/usurvey/product/m$c;)Ls9/a;

    move-result-object v4

    move-object v6, v4

    goto :goto_0

    :cond_0
    move-object v6, v2

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface/range {p1 .. p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v7, Ls9/d$c;

    invoke-direct {v7, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    new-instance v4, Ls9/d$b;

    const v7, 0x7f1100af

    invoke-direct {v4, v7}, Ls9/d$b;-><init>(I)V

    move-object v7, v4

    :goto_1
    if-eqz v1, :cond_2

    invoke-interface/range {p1 .. p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    const/4 v4, 0x0

    const/4 v8, 0x1

    if-eqz v1, :cond_3

    move v1, v8

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_3
    invoke-static {v0, v8, v4}, Lq8/f;->a(Lwc/a;ZZ)Ljava/util/List;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lwc/a;->e()Z

    move-result v10

    new-instance v11, Ls9/d$c;

    invoke-virtual/range {p0 .. p0}, Lwc/a;->d()Lh9/a;

    move-result-object v4

    invoke-virtual {v4, v3}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "toLowerCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v12, Ls9/d$c;

    const-string v3, ""

    invoke-direct {v12, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p0 .. p0}, Lwc/a;->e()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v13, v4

    goto :goto_4

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lwc/a;->k()LU7/a;

    move-result-object v3

    const/4 v4, 0x2

    invoke-static {v3, v8, v2, v4, v2}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v3

    move-object v13, v3

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lwc/a;->k()LU7/a;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lwc/a;->e()Z

    move-result v3

    if-nez v3, :cond_5

    if-eqz p2, :cond_6

    invoke-virtual/range {p2 .. p2}, Lwc/b;->a()LU7/a;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    move-object v15, v2

    goto :goto_6

    :cond_6
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lwc/a;->k()LU7/a;

    move-result-object v0

    move-object v15, v0

    :goto_6
    new-instance v0, LBe/A0;

    move-object v4, v0

    move v8, v1

    invoke-direct/range {v4 .. v15}, LBe/A0;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;ZLjava/util/List;ZLs9/d;Ls9/d;Ls9/d;LW7/f;LW7/f;)V

    return-object v0
.end method

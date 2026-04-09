.class public abstract LH/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LK/d;)Z
    .locals 2

    invoke-virtual {p0}, LK/d;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, LK/d;->f()Ljava/lang/String;

    move-result-object p0

    const-string v0, "\r\n"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static final b(LK/d;LK/d;)LK/d;
    .locals 16

    invoke-virtual/range {p0 .. p0}, LK/d;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-virtual/range {p1 .. p1}, LK/d;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LK/d;->j()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, LK/d;->j()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-ltz v0, :cond_7

    invoke-virtual/range {p1 .. p1}, LK/d;->j()J

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, LK/d;->j()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {}, LF/v0;->a()I

    move-result v0

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_1

    goto/16 :goto_0

    :cond_1
    invoke-static/range {p0 .. p0}, LH/q;->a(LK/d;)Z

    move-result v0

    if-nez v0, :cond_7

    invoke-static/range {p1 .. p1}, LH/q;->a(LK/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual/range {p0 .. p0}, LK/d;->i()LK/b;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LK/d;->i()LK/b;

    move-result-object v2

    if-eq v0, v2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual/range {p0 .. p0}, LK/d;->i()LK/b;

    move-result-object v0

    sget-object v2, LK/b;->Insert:LK/b;

    if-ne v0, v2, :cond_4

    invoke-virtual/range {p0 .. p0}, LK/d;->d()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, LK/d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v0, v2

    invoke-virtual/range {p1 .. p1}, LK/d;->d()I

    move-result v2

    if-ne v0, v2, :cond_4

    new-instance v0, LK/d;

    invoke-virtual/range {p0 .. p0}, LK/d;->d()I

    move-result v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, LK/d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LK/d;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, LK/d;->g()J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, LK/d;->e()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, LK/d;->j()J

    move-result-wide v11

    const/16 v14, 0x40

    const/4 v15, 0x0

    const-string v5, ""

    const/4 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, LK/d;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    invoke-virtual/range {p0 .. p0}, LK/d;->i()LK/b;

    move-result-object v0

    sget-object v2, LK/b;->Delete:LK/b;

    if-ne v0, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, LK/d;->c()LK/a;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LK/d;->c()LK/a;

    move-result-object v2

    if-ne v0, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, LK/d;->c()LK/a;

    move-result-object v0

    sget-object v2, LK/a;->Start:LK/a;

    if-eq v0, v2, :cond_5

    invoke-virtual/range {p0 .. p0}, LK/d;->c()LK/a;

    move-result-object v0

    sget-object v2, LK/a;->End:LK/a;

    if-ne v0, v2, :cond_7

    :cond_5
    invoke-virtual/range {p0 .. p0}, LK/d;->d()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LK/d;->d()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, LK/d;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    if-ne v0, v2, :cond_6

    new-instance v0, LK/d;

    invoke-virtual/range {p1 .. p1}, LK/d;->d()I

    move-result v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p1 .. p1}, LK/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, LK/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LK/d;->g()J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, LK/d;->e()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, LK/d;->j()J

    move-result-wide v11

    const/16 v14, 0x40

    const/4 v15, 0x0

    const-string v6, ""

    const/4 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, LK/d;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_6
    invoke-virtual/range {p0 .. p0}, LK/d;->d()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LK/d;->d()I

    move-result v2

    if-ne v0, v2, :cond_7

    new-instance v0, LK/d;

    invoke-virtual/range {p0 .. p0}, LK/d;->d()I

    move-result v4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, LK/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LK/d;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, LK/d;->g()J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, LK/d;->e()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, LK/d;->j()J

    move-result-wide v11

    const/16 v14, 0x40

    const/4 v15, 0x0

    const-string v6, ""

    const/4 v13, 0x0

    move-object v3, v0

    invoke-direct/range {v3 .. v15}, LK/d;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_7
    :goto_0
    return-object v1
.end method

.method public static final c(LH/p;LH/h;LH/h;LH/f$a;Z)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-interface/range {p3 .. p3}, LH/f$a;->a()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_0

    new-instance v1, LK/d;

    invoke-virtual/range {p1 .. p1}, LH/h;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, LH/h;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LH/h;->f()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, LH/h;->f()J

    move-result-wide v10

    const/16 v15, 0x20

    const/16 v16, 0x0

    const/4 v5, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v16}, LK/d;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, LH/p;->h(LK/d;)V

    goto :goto_0

    :cond_0
    invoke-interface/range {p3 .. p3}, LH/f$a;->a()I

    move-result v2

    if-ne v2, v3, :cond_2

    const/4 v2, 0x0

    invoke-interface {v1, v2}, LH/f$a;->b(I)J

    move-result-wide v3

    invoke-interface {v1, v2}, LH/f$a;->c(I)J

    move-result-wide v1

    invoke-static {v3, v4}, LL0/S;->h(J)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    new-instance v5, LK/d;

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v7

    move-object/from16 v6, p1

    invoke-static {v6, v3, v4}, LL0/T;->e(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object v8

    move-object/from16 v3, p2

    invoke-static {v3, v1, v2}, LL0/T;->e(Ljava/lang/CharSequence;J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, LH/h;->f()J

    move-result-wide v10

    invoke-virtual/range {p2 .. p2}, LH/h;->f()J

    move-result-wide v12

    const/16 v17, 0x20

    const/16 v18, 0x0

    const-wide/16 v14, 0x0

    move-object v6, v5

    move/from16 v16, p4

    invoke-direct/range {v6 .. v18}, LK/d;-><init>(ILjava/lang/String;Ljava/lang/String;JJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v5}, LH/p;->h(LK/d;)V

    :cond_2
    :goto_0
    return-void
.end method

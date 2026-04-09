.class public abstract LQ0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/util/List;LQ0/S;LQ0/g;LQ0/G;Lmh/l;)LYg/s;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LQ0/s;->b(Ljava/util/List;LQ0/S;LQ0/g;LQ0/G;Lmh/l;)LYg/s;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/util/List;LQ0/S;LQ0/g;LQ0/G;Lmh/l;)LYg/s;
    .locals 17

    move-object/from16 v8, p3

    const/4 v9, 0x1

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v10

    const/4 v12, 0x0

    move v13, v12

    const/4 v14, 0x0

    :goto_0
    if-ge v13, v10, :cond_e

    move-object/from16 v15, p0

    invoke-interface {v15, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LQ0/j;

    invoke-interface {v7}, LQ0/j;->a()I

    move-result v0

    sget-object v1, LQ0/t;->a:LQ0/t$a;

    invoke-virtual {v1}, LQ0/t$a;->b()I

    move-result v2

    invoke-static {v0, v2}, LQ0/t;->e(II)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static/range {p2 .. p2}, LQ0/g;->a(LQ0/g;)LT0/r;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    new-instance v0, LQ0/g$b;

    invoke-interface/range {p3 .. p3}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v7, v2}, LQ0/g$b;-><init>(LQ0/j;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, LQ0/g;->c(LQ0/g;)LP0/b;

    move-result-object v2

    invoke-virtual {v2, v0}, LP0/b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ0/g$a;

    if-nez v2, :cond_0

    invoke-static/range {p2 .. p2}, LQ0/g;->b(LQ0/g;)LP0/c;

    move-result-object v2

    invoke-virtual {v2, v0}, LP0/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LQ0/g$a;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_0
    :goto_1
    if-eqz v2, :cond_1

    invoke-virtual {v2}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    move-object v8, v7

    goto :goto_2

    :cond_1
    :try_start_1
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :try_start_2
    invoke-interface {v8, v7}, LQ0/G;->a(LQ0/j;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const/16 v6, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move-object v2, v7

    move-object/from16 v3, p3

    move-object v4, v0

    move-object v8, v7

    move-object v7, v9

    invoke-static/range {v1 .. v7}, LQ0/g;->f(LQ0/g;LQ0/j;LQ0/G;Ljava/lang/Object;ZILjava/lang/Object;)V

    :goto_2
    if-eqz v0, :cond_2

    invoke-virtual/range {p1 .. p1}, LQ0/S;->e()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LQ0/S;->f()LQ0/A;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LQ0/S;->d()I

    move-result v3

    invoke-static {v1, v0, v8, v2, v3}, LQ0/x;->a(ILjava/lang/Object;LQ0/j;LQ0/A;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to load font "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    move-object v8, v7

    move-object v1, v0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to load font "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_3
    monitor-exit v1

    throw v0

    :cond_3
    invoke-virtual {v1}, LQ0/t$a;->c()I

    move-result v2

    invoke-static {v0, v2}, LQ0/t;->e(II)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static/range {p2 .. p2}, LQ0/g;->a(LQ0/g;)LT0/r;

    move-result-object v1

    monitor-enter v1

    :try_start_3
    new-instance v0, LQ0/g$b;

    invoke-interface/range {p3 .. p3}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v7, v2}, LQ0/g$b;-><init>(LQ0/j;Ljava/lang/Object;)V

    invoke-static/range {p2 .. p2}, LQ0/g;->c(LQ0/g;)LP0/b;

    move-result-object v2

    invoke-virtual {v2, v0}, LP0/b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LQ0/g$a;

    if-nez v2, :cond_4

    invoke-static/range {p2 .. p2}, LQ0/g;->b(LQ0/g;)LP0/c;

    move-result-object v2

    invoke-virtual {v2, v0}, LP0/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LQ0/g$a;

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_4
    :goto_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v1

    move-object v11, v7

    goto :goto_6

    :cond_5
    :try_start_4
    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v1

    :try_start_5
    sget-object v0, LYg/u;->b:LYg/u$a;

    invoke-interface {v8, v7}, LQ0/G;->a(LQ0/j;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    sget-object v1, LYg/u;->b:LYg/u$a;

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, LYg/u;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v0, 0x0

    :cond_6
    const/16 v6, 0x8

    const/16 v16, 0x0

    const/4 v5, 0x0

    move-object/from16 v1, p2

    move-object v2, v7

    move-object/from16 v3, p3

    move-object v4, v0

    move-object v11, v7

    move-object/from16 v7, v16

    invoke-static/range {v1 .. v7}, LQ0/g;->f(LQ0/g;LQ0/j;LQ0/G;Ljava/lang/Object;ZILjava/lang/Object;)V

    :goto_6
    if-eqz v0, :cond_7

    invoke-virtual/range {p1 .. p1}, LQ0/S;->e()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LQ0/S;->f()LQ0/A;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LQ0/S;->d()I

    move-result v3

    invoke-static {v1, v0, v11, v2, v3}, LQ0/x;->a(ILjava/lang/Object;LQ0/j;LQ0/A;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0

    :cond_7
    move-object/from16 v1, p2

    goto :goto_8

    :goto_7
    monitor-exit v1

    throw v0

    :cond_8
    move-object v11, v7

    invoke-virtual {v1}, LQ0/t$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LQ0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_d

    move-object/from16 v1, p2

    invoke-virtual {v1, v11, v8}, LQ0/g;->d(LQ0/j;LQ0/G;)LQ0/g$a;

    move-result-object v0

    if-nez v0, :cond_a

    if-nez v14, :cond_9

    new-array v0, v9, [LQ0/j;

    aput-object v11, v0, v12

    invoke-static {v0}, LZg/v;->r([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    goto :goto_8

    :cond_9
    invoke-interface {v14, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    invoke-virtual {v0}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LQ0/g$a;->e(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p1 .. p1}, LQ0/S;->e()I

    move-result v1

    invoke-virtual {v0}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, LQ0/S;->f()LQ0/A;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LQ0/S;->d()I

    move-result v3

    invoke-static {v1, v0, v11, v2, v3}, LQ0/x;->a(ILjava/lang/Object;LQ0/j;LQ0/A;I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0

    :cond_c
    :goto_8
    add-int/2addr v13, v9

    goto/16 :goto_0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown font type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 v1, p1

    move-object/from16 v2, p4

    invoke-interface {v2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v14, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    return-object v0
.end method

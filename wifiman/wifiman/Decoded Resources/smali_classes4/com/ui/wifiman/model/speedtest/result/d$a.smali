.class public abstract Lcom/ui/wifiman/model/speedtest/result/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/speedtest/result/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;
    .locals 36

    move-object/from16 v0, p0

    const-string v1, "$receiver"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    instance-of v3, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v6

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v7

    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->e()Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v8

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;->f()Ljava/util/List;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_0

    goto :goto_0

    :cond_0
    move-object v8, v4

    :goto_0
    if-eqz v8, :cond_1

    invoke-static {v0, v8}, Lcom/ui/wifiman/model/speedtest/result/d$a;->l(Lcom/ui/wifiman/model/speedtest/result/d;Ljava/util/List;)Ljava/lang/String;

    move-result-object v8

    goto :goto_1

    :cond_1
    move-object v8, v4

    :goto_1
    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object v9, v4

    move-object/from16 v22, v9

    move-object/from16 v29, v22

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v7

    move-object/from16 v33, v8

    goto/16 :goto_5

    :cond_2
    instance-of v3, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    if-eqz v3, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;->d()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object v9, v4

    move-object/from16 v22, v9

    move-object/from16 v24, v22

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v29, v26

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v33, v31

    goto/16 :goto_5

    :cond_3
    instance-of v3, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz v3, :cond_7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->f()Lxa/a$d;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-interface {v6}, Lua/a;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->d()Ljava/lang/String;

    move-result-object v6

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v7

    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v8

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->g()LS8/g;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, LS8/g;->a()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_2

    :cond_6
    move-object v8, v4

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v9

    check-cast v9, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;->e()Lrd/b$a$a;

    move-result-object v9

    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    :goto_3
    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v33, v26

    move-object/from16 v22, v5

    move-object/from16 v30, v6

    move-object/from16 v29, v7

    move-object/from16 v31, v8

    goto :goto_5

    :cond_7
    instance-of v1, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v1, :cond_10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    check-cast v1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->e()Lxa/a$d;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-interface {v6}, Lua/a;->getId-2jxHnRY()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_9

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->d()Ljava/lang/String;

    move-result-object v6

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v7

    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v8

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;->f()LS8/g;

    move-result-object v8

    if-eqz v8, :cond_a

    invoke-virtual {v8}, LS8/g;->a()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_4

    :cond_a
    move-object v8, v4

    :goto_4
    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object v9, v4

    move-object/from16 v24, v9

    goto :goto_3

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->d()Ljava/lang/Long;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/speedtest/result/d$a;->h(Lcom/ui/wifiman/model/speedtest/result/d;Lpd/s;)LXb/c$d;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->f()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->e()Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/speedtest/result/d$a;->k(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b$b;)Lcom/ui/wifiman/model/speedtest/result/a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/speedtest/result/d$a;->g(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/a;)LXb/c$c;

    move-result-object v20

    if-eqz v9, :cond_b

    invoke-static {v0, v9}, Lcom/ui/wifiman/model/speedtest/result/d$a;->f(Lcom/ui/wifiman/model/speedtest/result/d;Lrd/b$a$a;)LXb/c$a;

    move-result-object v0

    move-object/from16 v32, v0

    goto :goto_6

    :cond_b
    move-object/from16 v32, v4

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->b()Ljava/util/ArrayList;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->i()Ljava/util/ArrayList;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v1, :cond_c

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    goto :goto_7

    :cond_c
    move-object v0, v4

    :goto_7
    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->b()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v34, v0

    goto :goto_8

    :cond_d
    move-object/from16 v34, v4

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v0

    instance-of v1, v0, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v1, :cond_e

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    goto :goto_9

    :cond_e
    move-object v0, v4

    :goto_9
    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b$b$b;->c()Ljava/lang/String;

    move-result-object v4

    :cond_f
    move-object/from16 v35, v4

    new-instance v0, LXb/c;

    move-object v9, v0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-wide/from16 v11, p2

    invoke-direct/range {v9 .. v35}, LXb/c;-><init>(Ljava/lang/Long;JLXb/c$d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;LXb/c$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LXb/c$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static b(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b;)LXb/d;
    .locals 26

    const-string v0, "$receiver"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXb/b;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->i()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->h()J

    move-result-wide v7

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, LXb/b;-><init>(JLjava/lang/String;Ljava/lang/String;J)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->h()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->i()LS8/g;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LS8/g;->a()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    move-object/from16 v24, v2

    goto :goto_0

    :cond_0
    move-object/from16 v24, v3

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->b()LS8/c;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->c()Ljava/lang/Integer;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->d()LS8/d;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LW7/b;->b()LW7/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LW7/a;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_1

    :cond_1
    move-object/from16 v22, v3

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LW7/b;->c()LW7/a;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, LW7/a;->d()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v23, v2

    goto :goto_2

    :cond_2
    move-object/from16 v23, v3

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->f()LW7/f;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, LW7/f;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_3

    :cond_3
    move-object/from16 v17, v3

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->g()LW7/f;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, LW7/f;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_4

    :cond_4
    move-object/from16 v18, v3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/result/b$d;->j()LS8/a;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->e()Ljava/util/List;

    move-result-object v25

    new-instance v2, LXb/a;

    move-object v9, v2

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v25}, LXb/a;-><init>(JLb8/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LS8/a;Ljava/lang/Integer;Ljava/lang/Integer;LS8/c;Ljava/lang/Integer;LS8/d;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/List;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wifiman/model/speedtest/result/b;->f()J

    move-result-wide v6

    move-object/from16 v8, p0

    invoke-interface {v8, v5, v6, v7}, Lcom/ui/wifiman/model/speedtest/result/d;->c(Lcom/ui/wifiman/model/speedtest/result/b$c;J)LXb/c;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    new-instance v1, LXb/d;

    invoke-direct {v1, v0, v2, v4}, LXb/d;-><init>(LXb/b;LXb/a;Ljava/util/List;)V

    return-object v1
.end method

.method public static c(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;
    .locals 10

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LXb/c;->f()LXb/c$c;

    move-result-object v0

    sget-object v1, Lcom/ui/wifiman/model/speedtest/result/d$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v1, 0x2

    if-eq v0, v1, :cond_9

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    const/4 p0, 0x4

    if-ne v0, p0, :cond_3

    invoke-virtual {p1}, LXb/c;->w()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LXb/c;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LXb/c;->s()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, LXb/c;->v()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, LXb/c;->s()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lua/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lwa/a;->c(Ljava/lang/String;)Lua/a;

    move-result-object v0

    check-cast v0, Lxa/a$d;

    if-nez v0, :cond_0

    invoke-interface {p2, p0}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lxa/a$d;

    :cond_0
    move-object v7, v0

    goto :goto_0

    :cond_1
    move-object v7, v2

    :goto_0
    invoke-virtual {p1}, LXb/c;->z()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    sget-object p1, LS8/g;->b:LS8/g$a;

    invoke-virtual {p1, p0}, LS8/g$a;->a(I)LS8/g;

    move-result-object v2

    :cond_2
    move-object v9, v2

    new-instance p0, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    move-object v3, p0

    invoke-direct/range {v3 .. v9}, Lcom/ui/wifiman/model/speedtest/result/b$b$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;)V

    goto/16 :goto_3

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unknown enpoint type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p1}, LXb/c;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LXb/c;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LXb/c;->s()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LXb/c;->v()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LXb/c;->s()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lua/a$a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p2, v6}, Lwa/a;->c(Ljava/lang/String;)Lua/a;

    move-result-object v6

    check-cast v6, Lxa/a$d;

    if-nez v6, :cond_6

    invoke-interface {p2, v0}, Lwa/a;->d(Ljava/lang/String;)Lua/a;

    move-result-object p2

    move-object v6, p2

    check-cast v6, Lxa/a$d;

    goto :goto_1

    :cond_5
    move-object v6, v2

    :cond_6
    :goto_1
    invoke-virtual {p1}, LXb/c;->z()Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    sget-object v0, LS8/g;->b:LS8/g$a;

    invoke-virtual {v0, p2}, LS8/g$a;->a(I)LS8/g;

    move-result-object p2

    goto :goto_2

    :cond_7
    move-object p2, v2

    :goto_2
    invoke-virtual {p1}, LXb/c;->c()LXb/c$a;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/speedtest/result/d$a;->j(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c$a;)Lrd/b$a$a;

    move-result-object v2

    :cond_8
    move-object v7, v2

    new-instance p0, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    move-object v0, p0

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxa/a$d;Ljava/lang/String;LS8/g;Lrd/b$a$a;)V

    goto :goto_3

    :cond_9
    new-instance p0, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    invoke-virtual {p1}, LXb/c;->w()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, LXb/c;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LXb/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LXb/c;->j()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, v0, v1, p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    new-instance p2, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    invoke-virtual {p1}, LXb/c;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, LXb/c;->x()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, LXb/c;->q()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, LXb/c;->p()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, LXb/c;->o()Ljava/lang/String;

    move-result-object v7

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, LXb/c;->y()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {p0, v0}, Lcom/ui/wifiman/model/speedtest/result/d$a;->e(Lcom/ui/wifiman/model/speedtest/result/d;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_c

    :cond_b
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :cond_c
    invoke-virtual {p1}, LXb/c;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LXb/c;->j()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    invoke-direct {v1, p2, p0, v0, p1}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;-><init>(Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    move-object p0, v1

    :goto_3
    return-object p0
.end method

.method public static d(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;
    .locals 13

    const-string v0, "$receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productCatalog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LXb/c;->h()J

    move-result-wide v0

    invoke-virtual {p1}, LXb/c;->A()LXb/c$d;

    move-result-object v2

    invoke-static {p0, v2}, Lcom/ui/wifiman/model/speedtest/result/d$a;->i(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c$d;)Lpd/s;

    move-result-object v5

    invoke-virtual {p1}, LXb/c;->l()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p1}, LXb/c;->k()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {p1}, LXb/c;->d()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {p1}, LXb/c;->C()Ljava/lang/Long;

    move-result-object v11

    invoke-interface {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/result/d;->g(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v6

    invoke-virtual {p1}, LXb/c;->e()Ljava/util/ArrayList;

    move-result-object v10

    invoke-virtual {p1}, LXb/c;->D()Ljava/util/ArrayList;

    move-result-object v12

    new-instance p0, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    move-object v3, p0

    invoke-direct/range {v3 .. v12}, Lcom/ui/wifiman/model/speedtest/result/b$c;-><init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;)V

    return-object p0
.end method

.method private static e(Lcom/ui/wifiman/model/speedtest/result/d;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    new-instance p0, Lcom/google/gson/e;

    invoke-direct {p0}, Lcom/google/gson/e;-><init>()V

    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/d$a$a;

    invoke-direct {v0}, Lcom/ui/wifiman/model/speedtest/result/d$a$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/reflect/a;->d()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/gson/e;->j(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "fromJson(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static f(Lcom/ui/wifiman/model/speedtest/result/d;Lrd/b$a$a;)LXb/c$a;
    .locals 0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/d$b;->e:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, LXb/c$a;->TABLET_ANDROID:LXb/c$a;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LXb/c$a;->TABLE_IOS:LXb/c$a;

    goto :goto_0

    :cond_2
    sget-object p0, LXb/c$a;->PHONE_ANDROID:LXb/c$a;

    goto :goto_0

    :cond_3
    sget-object p0, LXb/c$a;->PHONE_IOS:LXb/c$a;

    :goto_0
    return-object p0
.end method

.method private static g(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/a;)LXb/c$c;
    .locals 0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/d$b;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, LXb/c$c;->WIFIMAN_APP:LXb/c$c;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LXb/c$c;->LOCAL_SERVER:LXb/c$c;

    goto :goto_0

    :cond_2
    sget-object p0, LXb/c$c;->INTERNET_ISP:LXb/c$c;

    goto :goto_0

    :cond_3
    sget-object p0, LXb/c$c;->INTERNET:LXb/c$c;

    :goto_0
    return-object p0
.end method

.method private static h(Lcom/ui/wifiman/model/speedtest/result/d;Lpd/s;)LXb/c$d;
    .locals 0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/d$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, LXb/c$d;->CONSOLE:LXb/c$d;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, LXb/c$d;->LOCAL:LXb/c$d;

    goto :goto_0

    :cond_2
    sget-object p0, LXb/c$d;->APP_TO_APP:LXb/c$d;

    goto :goto_0

    :cond_3
    sget-object p0, LXb/c$d;->INTERNET:LXb/c$d;

    :goto_0
    return-object p0
.end method

.method private static i(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c$d;)Lpd/s;
    .locals 0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/d$b;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, Lpd/s;->CONSOLE:Lpd/s;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lpd/s;->LOCAL:Lpd/s;

    goto :goto_0

    :cond_2
    sget-object p0, Lpd/s;->APP_TO_APP:Lpd/s;

    goto :goto_0

    :cond_3
    sget-object p0, Lpd/s;->INTERNET:Lpd/s;

    :goto_0
    return-object p0
.end method

.method private static j(Lcom/ui/wifiman/model/speedtest/result/d;LXb/c$a;)Lrd/b$a$a;
    .locals 0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/d$b;->f:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_3

    const/4 p1, 0x2

    if-eq p0, p1, :cond_2

    const/4 p1, 0x3

    if-eq p0, p1, :cond_1

    const/4 p1, 0x4

    if-ne p0, p1, :cond_0

    sget-object p0, Lrd/b$a$a;->TABLET_ANDROID:Lrd/b$a$a;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    goto :goto_0

    :cond_2
    sget-object p0, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    goto :goto_0

    :cond_3
    sget-object p0, Lrd/b$a$a;->PHONE_IOS:Lrd/b$a$a;

    :goto_0
    return-object p0
.end method

.method private static k(Lcom/ui/wifiman/model/speedtest/result/d;Lcom/ui/wifiman/model/speedtest/result/b$b;)Lcom/ui/wifiman/model/speedtest/result/a;
    .locals 0

    instance-of p0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b;

    if-eqz p0, :cond_0

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/a;->INTERNET:Lcom/ui/wifiman/model/speedtest/result/a;

    goto :goto_0

    :cond_0
    instance-of p0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$b$a;

    if-eqz p0, :cond_1

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/a;->INTERNET_ISP:Lcom/ui/wifiman/model/speedtest/result/a;

    goto :goto_0

    :cond_1
    instance-of p0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz p0, :cond_2

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/a;->LOCAL_SERVER:Lcom/ui/wifiman/model/speedtest/result/a;

    goto :goto_0

    :cond_2
    instance-of p0, p1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-eqz p0, :cond_3

    sget-object p0, Lcom/ui/wifiman/model/speedtest/result/a;->WIFIMAN_APP:Lcom/ui/wifiman/model/speedtest/result/a;

    :goto_0
    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static l(Lcom/ui/wifiman/model/speedtest/result/d;Ljava/util/List;)Ljava/lang/String;
    .locals 0

    new-instance p0, Lcom/google/gson/e;

    invoke-direct {p0}, Lcom/google/gson/e;-><init>()V

    invoke-virtual {p0, p1}, Lcom/google/gson/e;->s(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "toJson(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static m(Lcom/ui/wifiman/model/speedtest/result/d;LXb/d;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 26

    move-object/from16 v0, p2

    const-string v1, "$receiver"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "productCatalog"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v1

    invoke-virtual {v1}, LXb/b;->d()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v1

    invoke-virtual {v1}, LXb/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v1

    invoke-virtual {v1}, LXb/b;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, LXb/d;->b()LXb/b;

    move-result-object v1

    invoke-virtual {v1}, LXb/b;->e()J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->j()Lb8/c;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->h()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :cond_0
    move-object v10, v1

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->p()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->c()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->r()LS8/c;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->e()Ljava/lang/Integer;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->s()LS8/d;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->t()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-int v1, v1

    sget-object v13, LS8/g;->b:LS8/g$a;

    invoke-virtual {v13, v1}, LS8/g$a;->a(I)LS8/g;

    move-result-object v1

    move-object v13, v1

    goto :goto_0

    :cond_1
    const/4 v13, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->i()LS8/a;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v1

    invoke-virtual {v1}, LXb/a;->n()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v11, LS8/l;->f:LS8/l$a;

    invoke-virtual {v11, v1}, LS8/l$a;->a(I)LS8/l;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v11

    invoke-virtual {v11}, LXb/a;->o()Ljava/lang/Integer;

    move-result-object v11

    if-eqz v11, :cond_3

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    sget-object v2, LS8/l;->f:LS8/l$a;

    invoke-virtual {v2, v11}, LS8/l$a;->a(I)LS8/l;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_2

    :cond_3
    const/16 v18, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v2

    invoke-virtual {v2}, LXb/a;->k()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v2

    invoke-virtual {v2}, LXb/a;->l()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v2, LW7/b;

    sget-object v11, LW7/a;->b:LW7/a$a;

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LXb/a;->k()Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object/from16 v22, v10

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-virtual {v11, v10}, LW7/a$a;->d(I)LW7/a;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, LXb/d;->a()LXb/a;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, LXb/a;->l()Ljava/lang/Integer;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-wide/from16 v23, v8

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v11, v8}, LW7/a$a;->d(I)LW7/a;

    move-result-object v8

    invoke-direct {v2, v10, v8}, LW7/b;-><init>(LW7/a;LW7/a;)V

    move-object/from16 v21, v2

    goto :goto_3

    :cond_4
    move-wide/from16 v23, v8

    move-object/from16 v22, v10

    const/16 v21, 0x0

    :goto_3
    new-instance v25, Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-object/from16 v11, v25

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v21}, Lcom/ui/wifiman/model/speedtest/result/b$d;-><init>(Ljava/lang/String;LS8/g;Ljava/lang/String;LS8/a;LW7/f;LS8/c;LW7/f;Ljava/lang/Integer;LS8/d;LW7/b;)V

    invoke-virtual/range {p1 .. p1}, LXb/d;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LXb/c;

    move-object/from16 v8, p0

    invoke-interface {v8, v2, v0}, Lcom/ui/wifiman/model/speedtest/result/d;->d(LXb/c;Lwa/a;)Lcom/ui/wifiman/model/speedtest/result/b$c;

    move-result-object v2

    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    new-instance v0, Lcom/ui/wifiman/model/speedtest/result/b;

    move-object v2, v0

    move-wide/from16 v8, v23

    move-object/from16 v10, v22

    move-object/from16 v11, v25

    invoke-direct/range {v2 .. v12}, Lcom/ui/wifiman/model/speedtest/result/b;-><init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;)V

    return-object v0
.end method

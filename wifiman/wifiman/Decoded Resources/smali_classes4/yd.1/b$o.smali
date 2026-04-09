.class final Lyd/b$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LW7/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW7/b;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/Speedtest$d;


# direct methods
.method constructor <init>(LW7/b;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V
    .locals 0

    iput-object p1, p0, Lyd/b$o;->a:LW7/b;

    iput-object p2, p0, Lyd/b$o;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, LZc/e;

    check-cast p3, Lje/r;

    check-cast p4, Ll9/a;

    check-cast p5, Ll9/a;

    check-cast p6, Ll9/a;

    invoke-virtual/range {p0 .. p6}, Lyd/b$o;->b(Ljava/util/List;LZc/e;Lje/r;Ll9/a;Ll9/a;Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;LZc/e;Lje/r;Ll9/a;Ll9/a;Ll9/a;)Lcom/ui/wifiman/model/speedtest/result/b;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "measurements"

    move-object/from16 v13, p1

    invoke-static {v13, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "networkConnection"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "wifiConnection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<destruct>"

    move-object/from16 v4, p4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p4 .. p4}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, LS8/g;

    invoke-virtual/range {p5 .. p5}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljd/a$b;

    invoke-virtual/range {p6 .. p6}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lle/i;

    instance-of v5, v1, Lje/r$b$a;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    move-object v7, v1

    check-cast v7, Lje/r$b$a;

    goto :goto_0

    :cond_0
    move-object v7, v6

    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual/range {p2 .. p2}, LZc/e;->g()Lb8/c;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, LZc/e;->a()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Linet/ipaddr/g;

    invoke-virtual {v14}, Linet/ipaddr/a;->toString()Ljava/lang/String;

    move-result-object v14

    const-string v15, "toString(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v12, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual/range {p2 .. p2}, LZc/e;->g()Lb8/c;

    move-result-object v3

    sget-object v11, Lb8/c;->WIFI:Lb8/c;

    if-ne v3, v11, :cond_3

    if-eqz v5, :cond_2

    check-cast v1, Lje/r$b$a;

    goto :goto_2

    :cond_2
    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lje/r$b$a;->i()Lke/c;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lke/c;->b()Ljava/lang/String;

    move-result-object v1

    move-object v15, v1

    goto :goto_3

    :cond_3
    move-object v15, v6

    :goto_3
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lje/r$b$a;->e()LS8/a;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_4

    :cond_4
    move-object/from16 v18, v6

    :goto_4
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, LS8/e;->a()LS8/c;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_5

    :cond_5
    move-object/from16 v20, v6

    :goto_5
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lle/i;->f()LS8/e;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, LS8/e;->b()LS8/d;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_6

    :cond_6
    move-object/from16 v23, v6

    :goto_6
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Lje/r$b$a;->d()Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v22, v1

    goto :goto_7

    :cond_7
    move-object/from16 v22, v6

    :goto_7
    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_8

    :cond_8
    move-object/from16 v17, v6

    :goto_8
    iget-object v1, v0, Lyd/b$o;->a:LW7/b;

    if-nez v1, :cond_9

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lje/r$b$a;->f()LW7/b;

    move-result-object v1

    :cond_9
    move-object/from16 v24, v1

    goto :goto_9

    :cond_a
    move-object/from16 v24, v6

    :goto_9
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lje/r$b$a;->h()LS8/l;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_a

    :cond_b
    move-object/from16 v19, v6

    :goto_a
    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljd/a$b;->b()LCc/a;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-interface {v1}, LCc/a;->j()LDc/j;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LDc/j;->L()LTc/a$a;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LTc/a$a;->m()LS8/l;

    move-result-object v1

    move-object/from16 v21, v1

    goto :goto_b

    :cond_c
    move-object/from16 v21, v6

    :goto_b
    new-instance v1, Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-object v14, v1

    invoke-direct/range {v14 .. v24}, Lcom/ui/wifiman/model/speedtest/result/b$d;-><init>(Ljava/lang/String;LS8/g;Ljava/lang/String;LS8/a;LW7/f;LS8/c;LW7/f;Ljava/lang/Integer;LS8/d;LW7/b;)V

    iget-object v2, v0, Lyd/b$o;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->g()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$c;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$c;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_c

    :cond_d
    move-object v2, v6

    :goto_c
    iget-object v3, v0, Lyd/b$o;->b:Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$d;->g()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/Speedtest$c;

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/Speedtest$c;->b()Ljava/lang/String;

    move-result-object v3

    move-object v7, v3

    goto :goto_d

    :cond_e
    move-object v7, v6

    :goto_d
    new-instance v16, Lcom/ui/wifiman/model/speedtest/result/b;

    const/4 v14, 0x1

    const/4 v15, 0x0

    const-wide/16 v4, 0x0

    move-object/from16 v3, v16

    move-object v6, v2

    move-object v11, v12

    move-object v12, v1

    move-object/from16 v13, p1

    invoke-direct/range {v3 .. v15}, Lcom/ui/wifiman/model/speedtest/result/b;-><init>(JLjava/lang/String;Ljava/lang/String;Lb8/c;JLjava/util/List;Lcom/ui/wifiman/model/speedtest/result/b$d;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16
.end method

.class final Lnd/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnd/h;->r(Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnd/h$g;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lje/r;

    check-cast p2, LCd/f$a;

    check-cast p3, Ldd/i;

    check-cast p4, Ldd/i;

    check-cast p5, La8/a;

    check-cast p6, LBc/a$b;

    check-cast p7, LBc/a$b;

    invoke-virtual/range {p0 .. p7}, Lnd/h$g;->b(Lje/r;LCd/f$a;Ldd/i;Ldd/i;La8/a;LBc/a$b;LBc/a$b;)Lnd/f;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lje/r;LCd/f$a;Ldd/i;Ldd/i;La8/a;LBc/a$b;LBc/a$b;)Lnd/f;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const-string v5, "wifiConnectionState"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "speedtestState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "latency"

    move-object/from16 v6, p3

    invoke-static {v6, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dnsLatency"

    move-object/from16 v7, p4

    invoke-static {v7, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "localDeviceDir"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sim0"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sim1"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v5, v0, Lje/r$b$a;

    const/4 v8, 0x0

    if-eqz v5, :cond_0

    move-object v9, v0

    check-cast v9, Lje/r$b$a;

    goto :goto_0

    :cond_0
    move-object v9, v8

    :goto_0
    if-eqz v9, :cond_1

    invoke-virtual {v9}, Lje/r$b$a;->a()La8/b;

    move-result-object v9

    goto :goto_1

    :cond_1
    move-object v9, v8

    :goto_1
    if-eqz v9, :cond_2

    invoke-virtual {v2, v9}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCc/a$b;

    goto :goto_2

    :cond_2
    move-object v2, v8

    :goto_2
    if-eqz v5, :cond_3

    move-object v9, v0

    check-cast v9, Lje/r$b$a;

    goto :goto_3

    :cond_3
    move-object v9, v8

    :goto_3
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lje/r$b$a;->i()Lke/c;

    move-result-object v9

    if-eqz v9, :cond_4

    invoke-virtual {v9}, Lke/c;->b()Ljava/lang/String;

    move-result-object v9

    move-object v13, v9

    goto :goto_4

    :cond_4
    move-object v13, v8

    :goto_4
    if-eqz v5, :cond_5

    move-object v9, v0

    check-cast v9, Lje/r$b$a;

    goto :goto_5

    :cond_5
    move-object v9, v8

    :goto_5
    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lje/r$b$a;->c()Lh9/a;

    move-result-object v9

    move-object v14, v9

    goto :goto_6

    :cond_6
    move-object v14, v8

    :goto_6
    if-eqz v2, :cond_7

    invoke-interface {v2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v16, v9

    goto :goto_7

    :cond_7
    move-object/from16 v16, v8

    :goto_7
    if-eqz v2, :cond_8

    invoke-interface {v2}, LCc/a;->b()Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object v15, v8

    :goto_8
    if-eqz v5, :cond_9

    move-object v2, v0

    check-cast v2, Lje/r$b$a;

    goto :goto_9

    :cond_9
    move-object v2, v8

    :goto_9
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lje/r$b$a;->h()LS8/l;

    move-result-object v2

    move-object/from16 v17, v2

    goto :goto_a

    :cond_a
    move-object/from16 v17, v8

    :goto_a
    instance-of v2, v1, LCd/f$a$a$b;

    if-eqz v2, :cond_b

    check-cast v1, LCd/f$a$a$b;

    goto :goto_b

    :cond_b
    move-object v1, v8

    :goto_b
    if-eqz v1, :cond_c

    invoke-virtual {v1}, LCd/f$a$a$b;->a()LW7/a;

    move-result-object v1

    move-object/from16 v23, v1

    goto :goto_c

    :cond_c
    move-object/from16 v23, v8

    :goto_c
    invoke-virtual/range {p3 .. p3}, Ldd/i;->d()Lb8/b;

    move-result-object v24

    invoke-virtual/range {p4 .. p4}, Ldd/i;->d()Lb8/b;

    move-result-object v25

    invoke-virtual/range {p3 .. p3}, Ldd/i;->e()Lb8/d;

    move-result-object v26

    if-eqz v5, :cond_d

    move-object v1, v0

    check-cast v1, Lje/r$b$a;

    goto :goto_d

    :cond_d
    move-object v1, v8

    :goto_d
    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lje/r$b$a;->b()LS8/c;

    move-result-object v1

    move-object/from16 v27, v1

    goto :goto_e

    :cond_e
    move-object/from16 v27, v8

    :goto_e
    if-eqz v5, :cond_f

    check-cast v0, Lje/r$b$a;

    goto :goto_f

    :cond_f
    move-object v0, v8

    :goto_f
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lje/r$b$a;->e()LS8/a;

    move-result-object v0

    move-object/from16 v28, v0

    goto :goto_10

    :cond_10
    move-object/from16 v28, v8

    :goto_10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v29

    instance-of v0, v3, LBc/a$b$a$b$a;

    xor-int/lit8 v0, v0, 0x1

    instance-of v1, v3, LBc/a$b$a$b;

    if-eqz v1, :cond_11

    move-object v2, v3

    check-cast v2, LBc/a$b$a$b;

    goto :goto_11

    :cond_11
    move-object v2, v8

    :goto_11
    if-eqz v2, :cond_12

    invoke-virtual {v2}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v2

    move-object/from16 v19, v2

    goto :goto_12

    :cond_12
    move-object/from16 v19, v8

    :goto_12
    if-eqz v1, :cond_13

    move-object v1, v3

    check-cast v1, LBc/a$b$a$b;

    goto :goto_13

    :cond_13
    move-object v1, v8

    :goto_13
    if-eqz v1, :cond_14

    invoke-virtual {v1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_14

    :cond_14
    move-object/from16 v20, v8

    :goto_14
    instance-of v1, v4, LBc/a$b$a$b;

    if-eqz v1, :cond_15

    move-object v2, v4

    check-cast v2, LBc/a$b$a$b;

    goto :goto_15

    :cond_15
    move-object v2, v8

    :goto_15
    if-eqz v2, :cond_16

    invoke-virtual {v2}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_16

    :cond_16
    move-object/from16 v21, v8

    :goto_16
    if-eqz v1, :cond_17

    move-object v1, v4

    check-cast v1, LBc/a$b$a$b;

    goto :goto_17

    :cond_17
    move-object v1, v8

    :goto_17
    if-eqz v1, :cond_18

    invoke-virtual {v1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object v8

    :cond_18
    move-object/from16 v22, v8

    new-instance v1, Lnd/f;

    move-object v10, v1

    move-object/from16 v2, p0

    iget-object v12, v2, Lnd/h$g;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const-string v11, "not_persistent"

    invoke-direct/range {v10 .. v30}, Lnd/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh9/a;Ljava/lang/String;Ljava/lang/String;LS8/l;Ljava/lang/Integer;LV7/a;LV7/b;LV7/a;LV7/b;LW7/a;Lb8/b;Lb8/b;Lb8/d;LS8/c;LS8/a;J)V

    return-object v1
.end method

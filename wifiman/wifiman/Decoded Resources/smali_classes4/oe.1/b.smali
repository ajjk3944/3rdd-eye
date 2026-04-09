.class public final Loe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loe/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;
    .locals 0

    check-cast p1, Lcom/ui/wmw/wifi/a;

    invoke-virtual {p0, p1, p2, p3, p4}, Loe/b;->b(Lcom/ui/wmw/wifi/a;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/ui/wmw/wifi/a;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;
    .locals 24

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const-string v3, "signal"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "vendorDirectory"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "affiliatedStates"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lpe/c;->a:Lpe/c;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->h()LS8/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lpe/c;->b(LS8/a;)Lke/b;

    move-result-object v4

    if-eqz v4, :cond_0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->i()Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->m()I

    move-result v7

    invoke-virtual {v3, v4, v6, v7}, Lpe/c;->a(Lke/b;II)Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v13, v3

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;

    const-string v2, "Failed to get MCS"

    invoke-direct {v1, v2, v0}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    const/4 v13, 0x0

    :goto_0
    if-eqz v13, :cond_6

    sget-object v3, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->h()LS8/a;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->b()LS8/d;

    move-result-object v6

    invoke-virtual {v3, v4, v13, v6}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->b(LS8/a;Lcom/ubnt/usurvey/wifi/WifiMcs;LS8/d;)LW7/a;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->p()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    const/4 v6, 0x0

    goto :goto_1

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move-object v7, v6

    check-cast v7, LS8/d;

    invoke-virtual {v7}, LS8/d;->getWidth()I

    move-result v7

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LS8/d;

    invoke-virtual {v9}, LS8/d;->getWidth()I

    move-result v9

    if-ge v7, v9, :cond_4

    move-object v6, v8

    move v7, v9

    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_3

    :goto_1
    check-cast v6, LS8/d;

    if-nez v6, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->b()LS8/d;

    move-result-object v6

    :cond_5
    sget-object v4, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->h()LS8/a;

    move-result-object v7

    invoke-virtual {v4, v7, v13, v6}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->b(LS8/a;Lcom/ubnt/usurvey/wifi/WifiMcs;LS8/d;)LW7/a;

    move-result-object v4

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    goto/16 :goto_4

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->q()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->q()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_f

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->q()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_7

    const/4 v4, 0x0

    goto :goto_2

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_2

    :cond_8
    move-object v6, v4

    check-cast v6, LW7/a;

    invoke-virtual {v6}, LW7/a;->d()I

    move-result v6

    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->d()I

    move-result v8

    if-ge v6, v8, :cond_a

    move-object v4, v7

    move v6, v8

    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_9

    :goto_2
    move-object v7, v4

    check-cast v7, LW7/a;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->q()Ljava/util/Set;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_b

    const/4 v3, 0x0

    goto :goto_3

    :cond_b
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_3

    :cond_c
    move-object v4, v3

    check-cast v4, LW7/a;

    invoke-virtual {v4}, LW7/a;->d()I

    move-result v4

    :cond_d
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, LW7/a;

    invoke-virtual {v9}, LW7/a;->d()I

    move-result v9

    if-ge v4, v9, :cond_e

    move-object v3, v6

    move v4, v9

    :cond_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_d

    :goto_3
    check-cast v3, LW7/a;

    move-object/from16 v21, v3

    move-object/from16 v20, v7

    goto :goto_4

    :cond_f
    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->n()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-static {v3}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_5

    :cond_10
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_11

    new-instance v4, Lke/c$a;

    invoke-direct {v4, v3}, Lke/c$a;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :cond_11
    sget-object v3, Lke/c$b;->a:Lke/c$b;

    move-object v4, v3

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->h()LS8/a;

    move-result-object v7

    new-instance v8, LS8/e;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->a()LS8/c;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->d()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->f()Ljava/lang/Integer;

    move-result-object v10

    const-string v11, ", "

    const-string v14, "Center channel cannot be translated to frequency "

    if-eqz v10, :cond_15

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->f()Ljava/lang/Integer;

    move-result-object v10

    if-nez v10, :cond_12

    goto :goto_7

    :cond_12
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-eqz v10, :cond_15

    :goto_7
    new-instance v10, LS8/e$b$a;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->b()LS8/d;

    move-result-object v15

    sget-object v5, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->e()I

    move-result v12

    move-object/from16 v23, v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->a()LS8/c;

    move-result-object v13

    invoke-virtual {v5, v12, v13}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b(ILS8/c;)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_14

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->f()Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->a()LS8/c;

    move-result-object v13

    invoke-virtual {v5, v12, v13}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b(ILS8/c;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v10, v15, v11, v5}, LS8/e$b$a;-><init>(LS8/d;II)V

    goto :goto_8

    :cond_13
    new-instance v1, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->f()Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "!!, "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, v3, v2}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :cond_14
    const/4 v2, 0x0

    const/4 v3, 0x2

    new-instance v1, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->e()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v2, v3, v2}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :cond_15
    move-object/from16 v23, v13

    new-instance v10, LS8/e$b$b;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->b()LS8/d;

    move-result-object v5

    sget-object v12, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->e()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->a()LS8/c;

    move-result-object v15

    invoke-virtual {v12, v13, v15}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b(ILS8/c;)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_17

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-direct {v10, v5, v11}, LS8/e$b$b;-><init>(LS8/d;I)V

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->b()LS8/d;

    move-result-object v5

    invoke-direct {v8, v3, v9, v10, v5}, LS8/e;-><init>(LS8/c;ILS8/e$b;LS8/d;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->l()LS8/l;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->j()LS8/j;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v3

    invoke-interface {v1, v3}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->c()Lh9/a;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lke/a;

    if-nez v1, :cond_16

    sget-object v1, Lke/a$b;->a:Lke/a$b;

    :cond_16
    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->n()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->s()Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->k()J

    move-result-wide v10

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->g()Ljava/lang/Float;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->o()Ljava/lang/Integer;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->r()Ljava/lang/Integer;

    move-result-object v17

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object v22

    new-instance v0, Lle/i;

    move-object v3, v0

    move-object v5, v6

    move-object v6, v1

    move-object/from16 v1, v23

    move-object/from16 v16, v1

    invoke-direct/range {v3 .. v22}, Lle/i;-><init>(Lke/c;Lh9/a;Lke/a;LS8/a;LS8/e;LS8/l;JLS8/j;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/Boolean;ZLcom/ubnt/usurvey/wifi/WifiMcs;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;LW7/a;LW7/a;Ljava/util/Set;)V

    return-object v0

    :cond_17
    new-instance v1, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;

    invoke-virtual/range {p1 .. p1}, Lcom/ui/wmw/wifi/a;->e()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v1, v0, v2, v3, v2}, Lcom/ui/wifiman/model/wifi/scan/WifiSignalFactory$Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
.end method

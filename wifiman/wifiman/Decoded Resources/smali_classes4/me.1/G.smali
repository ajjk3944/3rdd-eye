.class public final Lme/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lme/F;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;
    .locals 0

    check-cast p1, Lme/k;

    invoke-virtual {p0, p1, p2, p3, p4}, Lme/G;->b(Lme/k;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;

    move-result-object p1

    return-object p1
.end method

.method public b(Lme/k;Lcom/ui/wifiman/model/vendor/d$a;Ljava/lang/String;Ljava/util/Map;)Lle/i;
    .locals 28

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    const-string v2, "signal"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "vendorDirectory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "affiliatedStates"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lme/k;->d()LS8/a;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    invoke-virtual/range {p1 .. p1}, Lme/k;->f()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v2

    if-eqz v2, :cond_6

    sget-object v2, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    invoke-virtual/range {p1 .. p1}, Lme/k;->d()LS8/a;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lme/k;->c()LS8/e;

    move-result-object v6

    invoke-virtual {v6}, LS8/e;->b()LS8/d;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lme/k;->f()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v7

    invoke-virtual {v2, v5, v7, v6}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->b(LS8/a;Lcom/ubnt/usurvey/wifi/WifiMcs;LS8/d;)LW7/a;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lme/k;->k()Ljava/util/Set;

    move-result-object v5

    if-eqz v5, :cond_4

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    move-object v6, v4

    check-cast v6, LS8/d;

    invoke-virtual {v6}, LS8/d;->getWidth()I

    move-result v6

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LS8/d;

    invoke-virtual {v8}, LS8/d;->getWidth()I

    move-result v8

    if-ge v6, v8, :cond_3

    move-object v4, v7

    move v6, v8

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    :goto_0
    check-cast v4, LS8/d;

    if-nez v4, :cond_5

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lme/k;->c()LS8/e;

    move-result-object v4

    invoke-virtual {v4}, LS8/e;->b()LS8/d;

    move-result-object v4

    :cond_5
    sget-object v5, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->a:Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;

    invoke-virtual/range {p1 .. p1}, Lme/k;->d()LS8/a;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lme/k;->f()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v7

    invoke-virtual {v5, v6, v7, v4}, Lcom/ui/wifiman/model/wifi/utils/WifiDataRateUtils;->b(LS8/a;Lcom/ubnt/usurvey/wifi/WifiMcs;LS8/d;)LW7/a;

    move-result-object v4

    move-object/from16 v25, v2

    move-object/from16 v26, v4

    goto/16 :goto_4

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lme/k;->l()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    if-eqz v2, :cond_10

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    goto/16 :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lme/k;->l()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_8

    move-object v5, v4

    goto :goto_1

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :cond_9
    move-object v6, v5

    check-cast v6, LW7/a;

    invoke-virtual {v6}, LW7/a;->d()I

    move-result v6

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->d()I

    move-result v8

    if-ge v6, v8, :cond_b

    move-object v5, v7

    move v6, v8

    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_a

    :goto_1
    move-object v7, v5

    check-cast v7, LW7/a;

    invoke-virtual/range {p1 .. p1}, Lme/k;->l()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_2

    :cond_d
    move-object v2, v4

    check-cast v2, LW7/a;

    invoke-virtual {v2}, LW7/a;->d()I

    move-result v2

    :cond_e
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LW7/a;

    invoke-virtual {v6}, LW7/a;->d()I

    move-result v6

    if-ge v2, v6, :cond_f

    move-object v4, v5

    move v2, v6

    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_e

    :goto_2
    check-cast v4, LW7/a;

    move-object/from16 v26, v4

    move-object/from16 v25, v7

    goto :goto_4

    :cond_10
    :goto_3
    move-object/from16 v25, v4

    move-object/from16 v26, v25

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lme/k;->i()Lke/c;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lme/k;->b()Lh9/a;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lme/k;->d()LS8/a;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lme/k;->c()LS8/e;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lme/k;->h()LS8/l;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lme/k;->g()LS8/j;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lme/k;->b()Lh9/a;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ui/wifiman/model/vendor/d$a;->a(Lh9/a;)Lcom/ui/wifiman/model/vendor/d;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lme/k;->b()Lh9/a;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lke/a;

    if-nez v0, :cond_11

    sget-object v0, Lke/a$b;->a:Lke/a$b;

    :cond_11
    move-object v11, v0

    invoke-virtual/range {p1 .. p1}, Lme/k;->i()Lke/c;

    move-result-object v0

    invoke-virtual {v0}, Lke/c;->b()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v20

    invoke-virtual/range {p1 .. p1}, Lme/k;->o()Ljava/lang/Boolean;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lme/k;->e()J

    move-result-wide v15

    invoke-virtual/range {p1 .. p1}, Lme/k;->f()Lcom/ubnt/usurvey/wifi/WifiMcs;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Lme/k;->n()Ljava/lang/Float;

    move-result-object v23

    invoke-virtual/range {p1 .. p1}, Lme/k;->j()Ljava/lang/Integer;

    move-result-object v24

    invoke-virtual/range {p1 .. p1}, Lme/k;->m()Ljava/lang/Integer;

    move-result-object v22

    invoke-virtual/range {p1 .. p1}, Lme/k;->a()Ljava/util/Set;

    move-result-object v27

    new-instance v0, Lle/i;

    move-object v8, v0

    invoke-direct/range {v8 .. v27}, Lle/i;-><init>(Lke/c;Lh9/a;Lke/a;LS8/a;LS8/e;LS8/l;JLS8/j;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/Boolean;ZLcom/ubnt/usurvey/wifi/WifiMcs;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;LW7/a;LW7/a;Ljava/util/Set;)V

    return-object v0
.end method

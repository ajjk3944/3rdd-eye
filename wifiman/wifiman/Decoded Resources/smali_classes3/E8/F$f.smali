.class final LE8/F$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/F;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE8/F;


# direct methods
.method constructor <init>(LE8/F;)V
    .locals 0

    iput-object p1, p0, LE8/F$f;->a:LE8/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ll9/a;)LEe/g;
    .locals 17

    move-object/from16 v0, p1

    const-string/jumbo v1, "results"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    const-wide/32 v5, 0x5f5e100

    if-nez v3, :cond_0

    goto/16 :goto_b

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_1

    move-object v7, v4

    goto/16 :goto_3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    goto :goto_0

    :cond_2
    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_0

    :cond_3
    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_0

    :cond_4
    move-wide v7, v5

    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_6

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    goto :goto_2

    :cond_6
    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_2

    :cond_7
    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_2

    :cond_8
    move-wide v8, v5

    :goto_2
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v9

    if-gez v9, :cond_5

    move-object v7, v8

    goto :goto_1

    :cond_9
    :goto_3
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_4

    :cond_a
    move-wide v7, v5

    :goto_4
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    :cond_b
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_c

    move-object v8, v4

    goto/16 :goto_9

    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_d

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_d

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    goto :goto_6

    :cond_d
    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_e

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_6

    :cond_e
    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_f

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    goto :goto_6

    :cond_f
    move-wide v8, v5

    :goto_6
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :cond_10
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_11

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_11

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    goto :goto_8

    :cond_11
    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->a()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_12

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_8

    :cond_12
    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$c;->h()Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_13

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    goto :goto_8

    :cond_13
    move-wide v9, v5

    :goto_8
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v10

    if-gez v10, :cond_10

    move-object v8, v9

    goto :goto_7

    :cond_14
    :goto_9
    if-eqz v8, :cond_15

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    goto :goto_a

    :cond_15
    move-wide v7, v5

    :goto_a
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v8

    if-gez v8, :cond_b

    move-object v3, v7

    goto/16 :goto_5

    :cond_16
    move-object v4, v3

    :goto_b
    if-eqz v4, :cond_17

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_c

    :cond_17
    move-wide v2, v5

    :goto_c
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    move-object/from16 v4, p0

    iget-object v5, v4, LE8/F$f;->a:LE8/F;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v10, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b;

    new-instance v7, Lhf/o;

    invoke-static {v5, v6}, LE8/F;->z0(LE8/F;Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/lang/String;

    move-result-object v12

    sget-object v8, LE8/C;->a:LE8/C;

    invoke-virtual {v8, v6}, LE8/C;->g(Lcom/ui/wifiman/model/speedtest/result/b;)Ls9/d;

    move-result-object v13

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v8

    invoke-static {v8}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v14

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v8

    invoke-virtual {v6}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v9

    invoke-virtual {v9}, Lcom/ui/wifiman/model/speedtest/result/b$d;->h()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/ui/wifiman/ui/component/network/p;->b(Lb8/c;Ljava/lang/String;)Ls9/d;

    move-result-object v15

    invoke-static {v5, v6, v2, v3, v1}, LE8/F;->B0(LE8/F;Lcom/ui/wifiman/model/speedtest/result/b;JLjava/lang/String;)Ljava/util/List;

    move-result-object v16

    move-object v11, v7

    invoke-direct/range {v11 .. v16}, Lhf/o;-><init>(Ljava/lang/String;Ls9/d;Ls9/b;Ls9/d;Ljava/util/List;)V

    invoke-interface {v10, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_18
    new-instance v0, LEe/g$a$a;

    const-string/jumbo v7, "results"

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v6, v0

    invoke-direct/range {v6 .. v12}, LEe/g$a$a;-><init>(Ljava/lang/String;Ls9/d;LEe/g$a$a$a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, LEe/g;

    invoke-direct {v1, v0}, LEe/g;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LE8/F$f;->a(Ljava/util/List;Ll9/a;)LEe/g;

    move-result-object p1

    return-object p1
.end method

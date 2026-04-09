.class final Ly8/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/o;-><init>(Ly8/a$b;LCd/f;Ljd/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ly8/o;


# direct methods
.method constructor <init>(Ly8/o;)V
    .locals 0

    iput-object p1, p0, Ly8/o$a;->a:Ly8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;)LTe/J;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "throughputHistory"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "markers"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    sget-object v7, Lgc/b;->THROUGHPUT:Lgc/b;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v6, v0, Ly8/o$a;->a:Ly8/o;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v1, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const-wide/16 v9, 0x0

    const/4 v13, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LWc/c;

    invoke-virtual {v14}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->floatValue()F

    move-result v15

    const v16, 0x49742400    # 1000000.0f

    div-float v15, v15, v16

    :goto_1
    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v12, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    const/4 v12, 0x0

    goto/16 :goto_5

    :cond_1
    :goto_3
    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-nez v12, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    move-object v12, v2

    goto :goto_4

    :cond_2
    const/4 v12, 0x0

    :goto_4
    if-eqz v12, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly8/a;

    if-nez v12, :cond_3

    goto :goto_2

    :cond_3
    iput-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_4
    if-eqz v13, :cond_0

    const/4 v12, 0x0

    cmpg-float v12, v15, v12

    if-gtz v12, :cond_5

    goto :goto_2

    :cond_5
    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Ly8/a;

    invoke-virtual {v12}, Ly8/a;->a()J

    move-result-wide v16

    invoke-virtual {v13}, LWc/c;->c()J

    move-result-wide v18

    cmp-long v12, v16, v18

    if-gez v12, :cond_6

    const/4 v12, 0x0

    iput-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_6
    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Ly8/a;

    invoke-virtual {v12}, Ly8/a;->a()J

    move-result-wide v16

    invoke-virtual {v14}, LWc/c;->c()J

    move-result-wide v18

    cmp-long v12, v16, v18

    if-gtz v12, :cond_0

    invoke-virtual {v14}, LWc/c;->c()J

    move-result-wide v16

    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Ly8/a;

    invoke-virtual {v12}, Ly8/a;->a()J

    move-result-wide v18

    cmp-long v12, v16, v18

    if-ltz v12, :cond_7

    iget-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v12, Ly8/a;

    invoke-virtual {v6, v4, v5, v12, v15}, Ly8/f;->f(JLy8/a;F)LTe/I;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    iput-object v12, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "Signal Mapper chart marker in illegal state"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_5
    invoke-virtual {v14}, LWc/c;->d()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    move-result-wide v12

    invoke-static {v9, v10, v12, v13}, Ljava/lang/Long;->max(JJ)J

    move-result-wide v9

    new-instance v12, LTe/G;

    move-object v13, v1

    move-object/from16 p2, v2

    invoke-virtual {v14}, LWc/c;->c()J

    move-result-wide v1

    invoke-virtual {v6, v4, v5, v1, v2}, Ly8/f;->h(JJ)F

    move-result v1

    invoke-direct {v12, v1, v15}, LTe/G;-><init>(FF)V

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p2

    move-object v1, v13

    move-object v13, v14

    goto/16 :goto_0

    :cond_8
    new-instance v1, LTe/H$b;

    invoke-direct {v1, v8}, LTe/H$b;-><init>(Ljava/util/List;)V

    invoke-static {v1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    sget-object v1, LW7/a;->b:LW7/a$a;

    invoke-virtual {v1, v9, v10}, LW7/a$a;->b(J)LW7/a;

    move-result-object v1

    invoke-virtual {v1}, LW7/a;->d()I

    move-result v1

    const/16 v2, 0x12

    if-ge v1, v2, :cond_9

    sget-object v1, LTe/M$c$f;->a:LTe/M$c$f;

    :goto_6
    move-object v9, v1

    goto :goto_7

    :cond_9
    const/16 v2, 0x30

    if-ge v1, v2, :cond_a

    sget-object v1, LTe/M$c$j;->a:LTe/M$c$j;

    goto :goto_6

    :cond_a
    const/16 v2, 0x5f

    if-ge v1, v2, :cond_b

    sget-object v1, LTe/M$c$c;->a:LTe/M$c$c;

    goto :goto_6

    :cond_b
    const/16 v2, 0xbe

    if-ge v1, v2, :cond_c

    sget-object v1, LTe/M$c$e;->a:LTe/M$c$e;

    goto :goto_6

    :cond_c
    const/16 v2, 0x122

    if-ge v1, v2, :cond_d

    sget-object v1, LTe/M$c$g;->a:LTe/M$c$g;

    goto :goto_6

    :cond_d
    const/16 v2, 0x1e0

    if-ge v1, v2, :cond_e

    sget-object v1, LTe/M$c$i;->a:LTe/M$c$i;

    goto :goto_6

    :cond_e
    const/16 v2, 0x3d4

    if-ge v1, v2, :cond_f

    sget-object v1, LTe/M$c$b;->a:LTe/M$c$b;

    goto :goto_6

    :cond_f
    const/16 v2, 0x7bc

    if-ge v1, v2, :cond_10

    sget-object v1, LTe/M$c$d;->a:LTe/M$c$d;

    goto :goto_6

    :cond_10
    const/16 v2, 0x1374

    if-ge v1, v2, :cond_11

    sget-object v1, LTe/M$c$h;->a:LTe/M$c$h;

    goto :goto_6

    :cond_11
    sget-object v1, LTe/M$c$a;->a:LTe/M$c$a;

    goto :goto_6

    :goto_7
    iget-object v1, v0, Ly8/o$a;->a:Ly8/o;

    invoke-virtual {v1}, Ly8/f;->e()LTe/L;

    move-result-object v10

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v12

    new-instance v1, LTe/J;

    move-object v6, v1

    invoke-direct/range {v6 .. v12}, LTe/J;-><init>(Lgc/b;Ljava/util/List;LTe/M;LTe/L;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Ly8/o$a;->a(Ljava/util/List;Ljava/util/List;)LTe/J;

    move-result-object p1

    return-object p1
.end method

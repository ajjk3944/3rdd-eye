.class public final LE8/A$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A$e;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll9/a;

.field final synthetic b:LE8/A;

.field final synthetic c:LCc/j;


# direct methods
.method public constructor <init>(Ll9/a;LE8/A;LCc/j;)V
    .locals 0

    iput-object p1, p0, LE8/A$e$b;->a:Ll9/a;

    iput-object p2, p0, LE8/A$e$b;->b:LE8/A;

    iput-object p3, p0, LE8/A$e$b;->c:LCc/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/A;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    :try_start_0
    iget-object v0, v1, LE8/A$e$b;->a:Ll9/a;

    invoke-virtual {v0}, Ll9/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/speedtest/result/b;

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/N;

    invoke-direct {v4}, Lkotlin/jvm/internal/N;-><init>()V

    const/4 v5, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    if-le v6, v7, :cond_8

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v9, Lpd/s;->CONSOLE:Lpd/s;

    if-ne v8, v9, :cond_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    move-object v7, v5

    :goto_0
    if-eqz v7, :cond_8

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v9, Lpd/s;->LOCAL:Lpd/s;

    if-ne v8, v9, :cond_2

    goto :goto_1

    :cond_3
    move-object v7, v5

    :goto_1
    if-eqz v7, :cond_8

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v9, Lpd/s;->CONSOLE:Lpd/s;

    if-ne v8, v9, :cond_4

    goto :goto_2

    :cond_5
    move-object v7, v5

    :goto_2
    iput-object v7, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v9, Lpd/s;->LOCAL:Lpd/s;

    if-ne v8, v9, :cond_6

    goto :goto_3

    :cond_7
    move-object v7, v5

    :goto_3
    iput-object v7, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    goto :goto_4

    :cond_8
    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, LZg/v;->s0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    :cond_9
    :goto_4
    if-eqz v0, :cond_10

    iget-object v6, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v6, :cond_10

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v6

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object v7

    invoke-virtual {v7}, Lcom/ui/wifiman/model/speedtest/result/b$d;->h()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/ui/wifiman/ui/component/network/p;->b(Lb8/c;Ljava/lang/String;)Ls9/d;

    move-result-object v10

    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->d()Lb8/c;

    move-result-object v6

    invoke-static {v6}, Lcom/ui/wifiman/ui/component/network/p;->a(Lb8/c;)Ls9/b;

    move-result-object v9

    sget-object v6, LE8/C;->a:LE8/C;

    invoke-virtual {v6, v0}, LE8/C;->g(Lcom/ui/wifiman/model/speedtest/result/b;)Ls9/d;

    move-result-object v12

    iget-object v6, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    const/4 v7, 0x2

    if-eqz v6, :cond_a

    iget-object v8, v1, LE8/A$e$b;->b:LE8/A;

    check-cast v6, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v8, v6}, LE8/A;->z0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;

    move-result-object v14

    iget-object v6, v1, LE8/A$e$b;->b:LE8/A;

    iget-object v8, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v6, v8}, LE8/A;->A0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;

    move-result-object v15

    new-instance v6, Lhf/t$b;

    iget-object v8, v1, LE8/A$e$b;->c:LCc/j;

    sget-object v11, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v8, v11, v5, v7, v5}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v7

    invoke-direct {v6, v7}, Lhf/t$b;-><init>(Ls9/a;)V

    iget-object v7, v1, LE8/A$e$b;->b:LE8/A;

    iget-object v8, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v7, v8}, LE8/A;->z0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;

    move-result-object v16

    iget-object v7, v1, LE8/A$e$b;->b:LE8/A;

    iget-object v8, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v7, v8}, LE8/A;->A0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;

    move-result-object v17

    new-instance v7, Lhf/t$a$a;

    move-object v13, v7

    move-object/from16 v18, v6

    invoke-direct/range {v13 .. v18}, Lhf/t$a$a;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    move-object v13, v7

    goto :goto_5

    :cond_a
    new-instance v6, Lhf/t$a$b;

    iget-object v8, v1, LE8/A$e$b;->b:LE8/A;

    iget-object v11, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v11, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v8, v11}, LE8/A;->z0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$b;

    move-result-object v8

    iget-object v11, v1, LE8/A$e$b;->b:LE8/A;

    iget-object v13, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v13, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-static {v11, v13}, LE8/A;->A0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b$c;)Lhf/t$c;

    move-result-object v11

    new-instance v13, Lhf/t$b;

    iget-object v14, v1, LE8/A$e$b;->c:LCc/j;

    sget-object v15, Lcom/ubnt/usurvey/product/m$c;->NORMAL:Lcom/ubnt/usurvey/product/m$c;

    invoke-static {v14, v15, v5, v7, v5}, Ln8/m;->f(LCc/k;Lcom/ubnt/usurvey/product/m$c;Ls9/a$b;ILjava/lang/Object;)Ls9/a;

    move-result-object v7

    invoke-direct {v13, v7}, Lhf/t$b;-><init>(Ls9/a;)V

    invoke-direct {v6, v8, v11, v13}, Lhf/t$a$b;-><init>(Lhf/t$b;Lhf/t$c;Lhf/t$b;)V

    move-object v13, v6

    :goto_5
    invoke-virtual {v0}, Lcom/ui/wifiman/model/speedtest/result/b;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v8}, Lcom/ui/wifiman/model/speedtest/result/b$c;->g()Lpd/s;

    move-result-object v8

    sget-object v11, Lpd/s;->APP_TO_APP:Lpd/s;

    if-ne v8, v11, :cond_b

    goto :goto_6

    :cond_c
    move-object v7, v5

    :goto_6
    check-cast v7, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v7, :cond_d

    new-instance v6, Ls9/d$b;

    const v7, 0x7f1102b3

    invoke-direct {v6, v7}, Ls9/d$b;-><init>(I)V

    move-object v14, v6

    goto :goto_7

    :cond_d
    move-object v14, v5

    :goto_7
    sget-object v6, LE8/C;->a:LE8/C;

    iget-object v4, v4, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v4, Lcom/ui/wifiman/model/speedtest/result/b$c;

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v4

    if-nez v4, :cond_f

    :cond_e
    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lcom/ui/wifiman/model/speedtest/result/b$c;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/speedtest/result/b$c;->c()Lcom/ui/wifiman/model/speedtest/result/b$b;

    move-result-object v4

    :cond_f
    iget-object v3, v1, LE8/A$e$b;->c:LCc/j;

    invoke-virtual {v3}, LCc/j;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v4, v5, v3}, LE8/C;->c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;

    move-result-object v11

    iget-object v3, v1, LE8/A$e$b;->b:LE8/A;

    invoke-static {v3, v0}, LE8/A;->E0(LE8/A;Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;

    move-result-object v15

    new-instance v5, Ljf/g;

    move-object v8, v5

    invoke-direct/range {v8 .. v15}, Ljf/g;-><init>(Ls9/b;Ls9/d;Ls9/d;Ls9/d;Lhf/t$a;Ls9/d;Ljava/util/List;)V

    :cond_10
    new-instance v0, Ll9/a;

    invoke-direct {v0, v5}, Ll9/a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_9

    :goto_8
    invoke-interface {v2, v0}, Lgg/A;->onError(Ljava/lang/Throwable;)V

    :goto_9
    return-void
.end method

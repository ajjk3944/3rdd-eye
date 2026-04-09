.class final Lyd/b$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyd/b;->q(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/advanced/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V
    .locals 0

    iput-object p1, p0, Lyd/b$l;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/result/b$b;Ll9/a;)Ljava/util/List;
    .locals 18

    const-string v0, "internetEndpoint"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v3, p0

    iget-object v1, v3, Lyd/b$l;->a:Lcom/ui/wifiman/model/speedtest/advanced/b;

    sget-object v7, Lpd/s;->LOCAL:Lpd/s;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCd/j$d;

    const/16 v17, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LCd/j$d;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v9, v2

    goto :goto_0

    :cond_0
    move-object/from16 v9, v17

    :goto_0
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->t()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCd/j$d;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LCd/j$d;->a()Ljava/lang/Integer;

    move-result-object v2

    move-object v10, v2

    goto :goto_1

    :cond_1
    move-object/from16 v10, v17

    :goto_1
    if-eqz v8, :cond_10

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v11, v2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "download must be ended at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object/from16 v11, v17

    :goto_2
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_5

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_4

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v13, v2

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "upload must be ended at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object/from16 v13, v17

    :goto_3
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_8

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    if-eqz v5, :cond_6

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    goto :goto_4

    :cond_6
    move-object/from16 v2, v17

    :goto_4
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b()Ljava/util/ArrayList;

    move-result-object v2

    move-object v12, v2

    goto :goto_5

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "download must be finished at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move-object/from16 v12, v17

    :goto_5
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_b

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->i()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    if-eqz v5, :cond_9

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    goto :goto_6

    :cond_9
    move-object/from16 v2, v17

    :goto_6
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;->b()Ljava/util/ArrayList;

    move-result-object v2

    move-object v14, v2

    goto :goto_7

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "upload must be finished at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    move-object/from16 v14, v17

    :goto_7
    new-instance v2, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/4 v6, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v16}, Lcom/ui/wifiman/model/speedtest/result/b$c;-><init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Lpd/s;->CONSOLE:Lpd/s;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->o()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->n()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_d

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->l()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_c

    check-cast v2, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object v8, v2

    goto :goto_8

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "console download must be ended at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object/from16 v8, v17

    :goto_8
    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v2

    instance-of v2, v2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    if-nez v2, :cond_f

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->p()Lcom/ui/wifiman/model/speedtest/Speedtest$f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f;->b()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_e

    check-cast v1, Lcom/ui/wifiman/model/speedtest/Speedtest$a;

    invoke-virtual {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v9, v1

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "console upload must be ended at this point"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    move-object/from16 v9, v17

    :goto_9
    new-instance v13, Lcom/ui/wifiman/model/speedtest/result/b$c;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move-object v1, v13

    move-object v3, v5

    move-object/from16 v4, p1

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v10

    move-object v10, v14

    invoke-direct/range {v1 .. v12}, Lcom/ui/wifiman/model/speedtest/result/b$c;-><init>(Ljava/lang/Long;Lpd/s;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Long;Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "failed to obtain gateway endpoint"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/result/b$b;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Lyd/b$l;->a(Lcom/ui/wifiman/model/speedtest/result/b$b;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

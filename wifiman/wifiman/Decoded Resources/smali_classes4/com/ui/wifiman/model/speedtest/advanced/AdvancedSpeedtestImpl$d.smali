.class final Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl;->j(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;->a:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/advanced/b;LVd/c;)Lcom/ui/wifiman/model/speedtest/advanced/b;
    .locals 22

    const-string v0, "result"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, LVd/c;->c()LVd/c$a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, LVd/c;->d()LVd/c$b;

    move-result-object v0

    sget-object v2, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_0

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-virtual/range {p2 .. p2}, LVd/c;->b()Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, LVd/c;->b()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v6, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    move-object v0, v6

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v0, v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual/range {p2 .. p2}, LVd/c;->d()LVd/c$b;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v2, v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    if-eq v6, v5, :cond_4

    if-eq v6, v9, :cond_3

    if-eq v6, v8, :cond_3

    if-ne v6, v7, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    :goto_1
    new-instance v6, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v6, v10}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance v6, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v6}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    :goto_2
    invoke-virtual/range {p2 .. p2}, LVd/c;->d()LVd/c$b;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v2, v10

    if-ne v10, v9, :cond_6

    invoke-virtual/range {p2 .. p2}, LVd/c;->a()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    new-instance v12, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    sget-object v13, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-direct {v12, v13, v10, v11}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;J)V

    goto :goto_3

    :cond_5
    move-object v12, v4

    :goto_3
    new-instance v10, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v10, v12}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    :goto_4
    move-object/from16 v20, v10

    goto :goto_5

    :cond_6
    invoke-virtual/range {p2 .. p2}, LVd/c;->a()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_7

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    new-instance v12, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    new-instance v13, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v13, v10, v11, v14}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;-><init>(JLjava/util/ArrayList;)V

    invoke-direct {v12, v13}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v12

    goto :goto_5

    :cond_7
    new-instance v10, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v10}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_4

    :goto_5
    invoke-virtual/range {p2 .. p2}, LVd/c;->d()LVd/c$b;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v2, v10

    if-eq v10, v5, :cond_a

    if-eq v10, v9, :cond_a

    if-eq v10, v8, :cond_9

    if-ne v10, v7, :cond_8

    goto :goto_6

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    :goto_6
    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v5, v7}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    :goto_7
    move-object v9, v5

    goto :goto_8

    :cond_a
    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;

    invoke-direct {v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$b;-><init>()V

    goto :goto_7

    :goto_8
    invoke-virtual/range {p2 .. p2}, LVd/c;->d()LVd/c$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v2, v2, v5

    if-ne v2, v8, :cond_c

    invoke-virtual/range {p2 .. p2}, LVd/c;->e()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v4, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;

    sget-object v5, Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;->IN_PROGRESS:Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;

    invoke-direct {v4, v5, v1, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$b;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$a$c;J)V

    :cond_b
    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v1, v4}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    :goto_9
    move-object/from16 v21, v1

    goto :goto_a

    :cond_c
    invoke-virtual/range {p2 .. p2}, LVd/c;->e()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    new-instance v4, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;

    new-instance v5, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v5, v1, v2, v7}, Lcom/ui/wifiman/model/speedtest/Speedtest$a$a;-><init>(JLjava/util/ArrayList;)V

    invoke-direct {v4, v5}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$c;-><init>(Ljava/lang/Object;)V

    move-object/from16 v21, v4

    goto :goto_a

    :cond_d
    new-instance v1, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;

    invoke-direct {v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$a$b;-><init>()V

    goto :goto_9

    :goto_a
    const v18, 0xff09

    const/16 v19, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p1

    move-object v4, v0

    move-object/from16 v7, v20

    move-object v8, v9

    move-object/from16 v9, v21

    invoke-static/range {v1 .. v19}, Lcom/ui/wifiman/model/speedtest/advanced/b;->k(Lcom/ui/wifiman/model/speedtest/advanced/b;Lcom/ui/wifiman/model/speedtest/advanced/a$a;LVd/c$a;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;Lcom/ui/wifiman/model/speedtest/Speedtest$f;ILjava/lang/Object;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;->a:Lkotlin/jvm/internal/N;

    iput-object v0, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    check-cast p2, LVd/c;

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/model/speedtest/advanced/AdvancedSpeedtestImpl$d;->a(Lcom/ui/wifiman/model/speedtest/advanced/b;LVd/c;)Lcom/ui/wifiman/model/speedtest/advanced/b;

    move-result-object p1

    return-object p1
.end method

.class final LH8/d$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/d;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/d$h$a;
    }
.end annotation


# instance fields
.field final synthetic a:LH8/d;


# direct methods
.method constructor <init>(LH8/d;)V
    .locals 0

    iput-object p1, p0, LH8/d$h;->a:LH8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, LH8/d$d;

    check-cast p3, LH8/d$c;

    check-cast p4, Ljava/lang/Boolean;

    check-cast p5, LWc/b;

    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p6}, LH8/d$h;->b(Ljava/util/List;LH8/d$d;LH8/d$c;Ljava/lang/Boolean;LWc/b;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/List;LH8/d$d;LH8/d$c;Ljava/lang/Boolean;LWc/b;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 19

    move-object/from16 v0, p1

    const-string/jumbo v1, "consoles"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "consolesFetchState"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "mainConsoleState"

    move-object/from16 v9, p3

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "networkConnected"

    move-object/from16 v10, p4

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v3, p5

    invoke-static {v3, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "inEditMode"

    move-object/from16 v11, p6

    invoke-static {v11, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p5 .. p5}, LWc/b;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOd/a;

    move-object/from16 v12, p0

    iget-object v13, v12, LH8/d$h;->a:LH8/d;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v14

    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/ui/wifiman/model/teleport/h;

    instance-of v6, v6, Lcom/ui/wifiman/model/teleport/h$a;

    if-eqz v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    if-gez v5, :cond_1

    invoke-static {}, LZg/v;->u()V

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    if-nez v5, :cond_6

    sget-object v0, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v3, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    move-object v3, v13

    move-object/from16 v5, p3

    move v15, v6

    move/from16 v6, v16

    move-object v7, v1

    move/from16 v8, v17

    invoke-static/range {v3 .. v8}, LH8/d;->s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v6, v15

    const/4 v7, 0x2

    const/4 v8, 0x3

    goto :goto_2

    :cond_3
    move v15, v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_c

    sget-object v0, LH8/d$h$a;->a:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v15, :cond_5

    const/4 v8, 0x2

    const/4 v7, 0x3

    if-eq v0, v8, :cond_c

    if-eq v0, v7, :cond_c

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string/jumbo v1, "loading1"

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string/jumbo v1, "loading2"

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string/jumbo v1, "loading3"

    invoke-direct {v0, v1}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    const/4 v7, 0x3

    const/4 v8, 0x2

    goto/16 :goto_8

    :cond_6
    move v15, v6

    move/from16 v18, v8

    move v8, v7

    move/from16 v7, v18

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x5

    if-ge v3, v4, :cond_7

    check-cast v0, Ljava/lang/Iterable;

    sget-object v3, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    move-object v3, v13

    move-object/from16 v5, p3

    move-object v7, v1

    move/from16 v8, v16

    invoke-static/range {v3 .. v8}, LH8/d;->s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x3

    const/4 v8, 0x2

    goto :goto_3

    :cond_7
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual {v5}, Lcom/ui/wifiman/model/teleport/h;->h()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_b

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    new-instance v4, Ls9/d$b;

    const v5, 0x7f1102e7

    invoke-direct {v4, v5}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v5, "headerLastUsed"

    invoke-direct {v0, v5, v4}, Lcom/ui/wifiman/ui/teleport/consoles/h$c;-><init>(Ljava/lang/String;Ls9/d;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v3, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v16

    move-object v3, v13

    move-object/from16 v5, p3

    move-object v7, v1

    move-object v15, v8

    move/from16 v8, v16

    invoke-static/range {v3 .. v8}, LH8/d;->s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v8, v15

    const/4 v15, 0x1

    goto :goto_5

    :cond_a
    move-object v15, v8

    new-instance v0, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    new-instance v3, Ls9/d$b;

    const v4, 0x7f1102e8

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    const-string/jumbo v4, "headerOther"

    invoke-direct {v0, v4, v3}, Lcom/ui/wifiman/ui/teleport/consoles/h$c;-><init>(Ljava/lang/String;Ls9/d;)V

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v15, v0}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move-object v3, v13

    move-object/from16 v5, p3

    move-object v7, v1

    invoke-static/range {v3 .. v8}, LH8/d;->s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    sget-object v3, Lcom/ui/wifiman/model/teleport/h;->a:Lcom/ui/wifiman/model/teleport/h$b;

    invoke-virtual {v3}, Lcom/ui/wifiman/model/teleport/h$b;->a()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v0, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/ui/wifiman/model/teleport/h;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move-object v3, v13

    move-object/from16 v5, p3

    move-object v7, v1

    invoke-static/range {v3 .. v8}, LH8/d;->s0(LH8/d;Lcom/ui/wifiman/model/teleport/h;LH8/d$c;ZLOd/a;Z)Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    move-result-object v3

    invoke-interface {v14, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    :goto_8
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_f

    sget-object v0, LH8/d$h$a;->a:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_f

    const/4 v1, 0x2

    if-eq v0, v1, :cond_e

    const/4 v1, 0x3

    if-eq v0, v1, :cond_e

    const/4 v1, 0x4

    if-ne v0, v1, :cond_d

    goto :goto_9

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    invoke-interface {v14, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    :goto_9
    invoke-static {v14}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

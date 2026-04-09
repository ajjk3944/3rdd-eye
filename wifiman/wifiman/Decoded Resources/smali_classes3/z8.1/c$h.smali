.class final Lz8/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz8/c;


# direct methods
.method constructor <init>(Lz8/c;)V
    .locals 0

    iput-object p1, p0, Lz8/c$h;->a:Lz8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Set;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Ljava/util/Map;

    check-cast p4, La8/a;

    check-cast p5, Ll9/a;

    check-cast p6, Ljava/lang/Boolean;

    invoke-virtual/range {p0 .. p6}, Lz8/c$h;->b(Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;La8/a;Ll9/a;Ljava/lang/Boolean;)Lz8/c$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;La8/a;Ll9/a;Ljava/lang/Boolean;)Lz8/c$a;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v7, p2

    const-string/jumbo v2, "apComparable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "apComparing"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "signals"

    move-object/from16 v8, p3

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "devices"

    move-object/from16 v9, p4

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<destruct>"

    move-object/from16 v3, p5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "selectionEnabled"

    move-object/from16 v10, p6

    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p5 .. p5}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, LS8/c;

    new-instance v2, Lz8/c$h$a;

    invoke-direct {v2, v11}, Lz8/c$h$a;-><init>(LS8/c;)V

    new-instance v12, Lz8/c$h$b;

    invoke-direct {v12, v2}, Lz8/c$h$b;-><init>(Ljava/util/Comparator;)V

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/a$a;

    if-eqz v11, :cond_1

    invoke-virtual {v3}, Lre/a$a;->a()LS8/c;

    move-result-object v4

    if-ne v11, v4, :cond_0

    :cond_1
    invoke-interface {v2, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v2}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v13, v0, Lz8/c$h;->a:Lz8/c;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/16 v16, 0x0

    move-object/from16 v6, v16

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lre/a$a;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v17

    move-object v1, v13

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p2

    move-object v8, v6

    move/from16 v6, v17

    invoke-static/range {v1 .. v6}, Lz8/c;->w0(Lz8/c;Lre/a$a;Ljava/util/Map;La8/a;Ljava/util/Set;Z)LTe/e0;

    move-result-object v6

    invoke-virtual {v6}, LTe/e0;->b()Z

    move-result v1

    if-eqz v1, :cond_3

    move-object v8, v6

    move-object/from16 v6, v16

    :cond_3
    if-eqz v6, :cond_4

    invoke-interface {v14, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_4
    move-object v6, v8

    move-object/from16 v8, p3

    goto :goto_1

    :cond_5
    move-object v8, v6

    invoke-static {v14, v12}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v13

    invoke-static {}, LZg/d0;->b()Ljava/util/Set;

    move-result-object v1

    move-object v2, v7

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lre/a$a;

    if-eqz v11, :cond_6

    invoke-virtual {v3}, Lre/a$a;->a()LS8/c;

    move-result-object v4

    if-eq v11, v4, :cond_6

    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {v1}, LZg/d0;->a(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    iget-object v14, v0, Lz8/c$h;->a:Lz8/c;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lre/a$a;

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object v1, v14

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lz8/c;->w0(Lz8/c;Lre/a$a;Ljava/util/Map;La8/a;Ljava/util/Set;Z)LTe/e0;

    move-result-object v1

    invoke-interface {v15, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v15, v12}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lz8/c$a;

    invoke-direct {v2, v11, v8, v13, v1}, Lz8/c$a;-><init>(LS8/c;LTe/e0;Ljava/util/List;Ljava/util/List;)V

    return-object v2
.end method

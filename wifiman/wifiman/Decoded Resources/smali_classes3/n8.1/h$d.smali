.class final Ln8/h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/h;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/h;


# direct methods
.method constructor <init>(Ln8/h;)V
    .locals 0

    iput-object p1, p0, Ln8/h$d;->a:Ln8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;LYg/s;)Ljava/util/List;
    .locals 23

    move-object/from16 v0, p1

    const-string/jumbo v1, "cardItems"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual/range {p2 .. p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Linet/ipaddr/g;

    move-object/from16 v3, p0

    iget-object v12, v3, Ln8/h$d;->a:Ln8/h;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v13

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v13, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v6, Ls9/d$b;

    const v0, 0x7f1101f6

    invoke-direct {v6, v0}, Ls9/d$b;-><init>(I)V

    const v0, 0x7f1103c6

    const/4 v14, 0x0

    if-eqz v2, :cond_0

    invoke-static {v2, v14}, LL8/f;->b(Linet/ipaddr/g;Z)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v4, Ls9/d$c;

    invoke-direct {v4, v2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v8, v4

    goto :goto_0

    :cond_0
    new-instance v2, Ls9/d$b;

    invoke-direct {v2, v0}, Ls9/d$b;-><init>(I)V

    move-object v8, v2

    :goto_0
    const/16 v10, 0x14

    const/4 v11, 0x0

    const-string/jumbo v5, "gateway"

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v4, v12

    invoke-static/range {v4 .. v11}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v2

    invoke-interface {v13, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v6, Ls9/d$b;

    const v2, 0x7f1100f4

    invoke-direct {v6, v2}, Ls9/d$b;-><init>(I)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v12}, Ln8/a;->A()Ljava/util/Comparator;

    move-result-object v2

    invoke-static {v1, v2}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Linet/ipaddr/g;

    invoke-static {v4, v14}, LL8/f;->b(Linet/ipaddr/g;Z)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    :goto_2
    move-object v14, v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    :goto_3
    if-eqz v14, :cond_4

    new-instance v0, Ls9/d$c;

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const-string v15, "\n"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v14 .. v22}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    move-object v8, v0

    goto :goto_4

    :cond_4
    new-instance v1, Ls9/d$b;

    invoke-direct {v1, v0}, Ls9/d$b;-><init>(I)V

    move-object v8, v1

    :goto_4
    const/16 v10, 0x14

    const/4 v11, 0x0

    const-string/jumbo v5, "dns"

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v4, v12

    invoke-static/range {v4 .. v11}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v13}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, LYg/s;

    invoke-virtual {p0, p1, p2}, Ln8/h$d;->a(Ljava/util/List;LYg/s;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

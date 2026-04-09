.class final Ln8/a$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln8/a;


# direct methods
.method constructor <init>(Ln8/a;)V
    .locals 0

    iput-object p1, p0, Ln8/a$m;->a:Ln8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Linet/ipaddr/g;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Ln8/a$m;->c(Linet/ipaddr/g;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Linet/ipaddr/g;)Ljava/lang/CharSequence;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p0, v0}, LL8/f;->b(Linet/ipaddr/g;Z)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Ln8/a$m;->b(LCc/a;Ll9/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(LCc/a;Ll9/a;)Ljava/util/List;
    .locals 22

    const-string/jumbo v0, "device"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldd/i;

    move-object/from16 v2, p0

    iget-object v11, v2, Ln8/a$m;->a:Ln8/a;

    invoke-static {}, LZg/v;->c()Ljava/util/List;

    move-result-object v12

    invoke-interface/range {p1 .. p1}, LCc/a;->q()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Linet/ipaddr/g;

    invoke-virtual {v6}, Linet/ipaddr/g;->g1()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v5, 0x0

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface/range {p1 .. p1}, LCc/a;->q()Ljava/util/Set;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_4

    move-object v5, v3

    :cond_4
    move-object v4, v5

    check-cast v4, Ljava/util/Collection;

    :goto_2
    if-eqz v4, :cond_5

    new-instance v5, Ls9/d$b;

    const v3, 0x7f110137

    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    new-instance v7, Ls9/d$c;

    check-cast v4, Ljava/lang/Iterable;

    invoke-virtual {v11}, Ln8/a;->A()Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v4, v3}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/lang/Iterable;

    new-instance v19, Ln8/c;

    invoke-direct/range {v19 .. v19}, Ln8/c;-><init>()V

    const/16 v20, 0x1e

    const/16 v21, 0x0

    const-string v14, "\n"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v21}, LZg/v;->z0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lmh/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v7, v3}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "ip"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v3

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-interface/range {p1 .. p1}, LCc/a;->o()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v5, Ls9/d$b;

    const v3, 0x7f110097

    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    new-instance v7, Ls9/d$c;

    invoke-direct {v7, v1}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "hostname"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v1

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    const/4 v1, 0x1

    if-eqz v0, :cond_9

    new-instance v5, Ls9/d$b;

    const v3, 0x7f11009a

    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v0}, Ldd/i;->d()Lb8/b;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-static {v3, v1}, LNe/d;->c(Lb8/b;Z)Ls9/d;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    move-object v7, v3

    goto :goto_5

    :cond_8
    :goto_4
    new-instance v3, Ls9/d$b;

    const v4, 0x7f1103c7

    invoke-direct {v3, v4}, Ls9/d$b;-><init>(I)V

    goto :goto_3

    :goto_5
    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "ping"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v3

    invoke-interface {v12, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_9
    if-eqz v0, :cond_a

    new-instance v5, Ls9/d$b;

    const v3, 0x7f110098

    invoke-direct {v5, v3}, Ls9/d$b;-><init>(I)V

    invoke-virtual {v0}, Ldd/i;->e()Lb8/d;

    move-result-object v0

    invoke-static {v0, v1}, Lk8/i;->b(Lb8/d;Z)Ls9/d;

    move-result-object v7

    const/16 v9, 0x14

    const/4 v10, 0x0

    const-string/jumbo v4, "packetloss"

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v3, v11

    invoke-static/range {v3 .. v10}, Ln8/a;->I(Ln8/a;Ljava/lang/String;Ls9/d;Ls9/d;Ls9/d;ZILjava/lang/Object;)LKe/a$b;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-static {v12}, LZg/v;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

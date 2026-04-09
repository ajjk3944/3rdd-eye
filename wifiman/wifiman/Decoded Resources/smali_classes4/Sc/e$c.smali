.class final LSc/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSc/e;->r()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSc/e$c$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;

.field final synthetic b:Lkotlin/jvm/internal/N;

.field final synthetic c:Lkotlin/jvm/internal/N;

.field final synthetic d:Lkotlin/jvm/internal/N;

.field final synthetic e:Lkotlin/jvm/internal/N;

.field final synthetic f:LSc/e;

.field final synthetic g:Lkotlin/jvm/internal/N;

.field final synthetic h:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;LSc/e;Lkotlin/jvm/internal/N;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LSc/e$c;->a:Lkotlin/jvm/internal/N;

    iput-object p2, p0, LSc/e$c;->b:Lkotlin/jvm/internal/N;

    iput-object p3, p0, LSc/e$c;->c:Lkotlin/jvm/internal/N;

    iput-object p4, p0, LSc/e$c;->d:Lkotlin/jvm/internal/N;

    iput-object p5, p0, LSc/e$c;->e:Lkotlin/jvm/internal/N;

    iput-object p6, p0, LSc/e$c;->f:LSc/e;

    iput-object p7, p0, LSc/e$c;->g:Lkotlin/jvm/internal/N;

    iput-object p8, p0, LSc/e$c;->h:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LSc/e;Ly7/n;)Z
    .locals 0

    invoke-static {p0, p1}, LSc/e$c;->g(LSc/e;Ly7/n;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(LSc/e;Lt7/e;)Z
    .locals 0

    invoke-static {p0, p1}, LSc/e$c;->f(LSc/e;Lt7/e;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LSc/e;Ly7/r;)Z
    .locals 0

    invoke-static {p0, p1}, LSc/e$c;->e(LSc/e;Ly7/r;)Z

    move-result p0

    return p0
.end method

.method private static final e(LSc/e;Ly7/r;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly7/r;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LSc/e;->i(LSc/e;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final f(LSc/e;Lt7/e;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lt7/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, LSc/e;->i(LSc/e;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final g(LSc/e;Ly7/n;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LSc/e;->h(LSc/e;Ly7/n;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ls7/b;

    check-cast p2, Lwa/a;

    invoke-virtual {p0, p1, p2}, LSc/e$c;->d(Ls7/b;Lwa/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ls7/b;Lwa/a;)Ll9/a;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "device"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "browser"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, LSc/e$c;->a:Lkotlin/jvm/internal/N;

    const-class v4, Lt7/d;

    invoke-virtual {v1, v4}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v4

    check-cast v4, Lt7/d;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    const-string v6, ""

    invoke-virtual {v4, v6}, Lt7/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    sget-object v6, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v6, v4}, Lh9/a$b;->e(Ljava/lang/String;)Lh9/a;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    iput-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v3, v0, LSc/e$c;->b:Lkotlin/jvm/internal/N;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    invoke-virtual/range {p1 .. p1}, Ls7/b;->c()Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr7/a;

    invoke-virtual {v7}, Lr7/a;->c()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ly7/d;

    if-eqz v8, :cond_2

    check-cast v7, Ly7/d;

    goto :goto_2

    :cond_2
    move-object v7, v5

    :goto_2
    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ly7/d;->b()Ljava/net/InetAddress;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-static {v7}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iput-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v3, v0, LSc/e$c;->a:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v3, :cond_1c

    iget-object v3, v0, LSc/e$c;->b:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1c

    iget-object v3, v0, LSc/e$c;->c:Lkotlin/jvm/internal/N;

    const-class v4, Lt7/e;

    invoke-virtual {v1, v4}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    iput-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v3, v0, LSc/e$c;->d:Lkotlin/jvm/internal/N;

    const-class v4, Ly7/r;

    invoke-virtual {v1, v4}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    iput-object v4, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v3, v0, LSc/e$c;->e:Lkotlin/jvm/internal/N;

    iget-object v4, v0, LSc/e$c;->f:LSc/e;

    iget-object v6, v0, LSc/e$c;->c:Lkotlin/jvm/internal/N;

    iget-object v6, v6, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, Ljava/util/Set;

    iget-object v7, v0, LSc/e$c;->d:Lkotlin/jvm/internal/N;

    iget-object v7, v7, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    const-class v8, Lt7/f;

    invoke-virtual {v1, v8}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v8

    check-cast v8, Lt7/f;

    invoke-static {v4, v6, v7, v2, v8}, LSc/e;->j(LSc/e;Ljava/util/Set;Ljava/util/Set;Lwa/a;Lt7/f;)Lxa/a$d;

    move-result-object v2

    iput-object v2, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v0, LSc/e$c;->g:Lkotlin/jvm/internal/N;

    iget-object v3, v0, LSc/e$c;->e:Lkotlin/jvm/internal/N;

    iget-object v3, v3, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v3, Lxa/a$d;

    if-eqz v3, :cond_4

    invoke-interface {v3}, Lua/a;->h0()Lua/b;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v5

    :goto_3
    instance-of v3, v3, Lua/b$t;

    if-nez v3, :cond_5

    const-class v3, Ly7/s;

    invoke-virtual {v1, v3}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v3

    check-cast v3, Ly7/s;

    if-nez v3, :cond_6

    sget-object v3, Ly7/s;->UNDEFINED:Ly7/s;

    goto :goto_4

    :cond_5
    sget-object v3, Ly7/s;->UNDEFINED:Ly7/s;

    :cond_6
    :goto_4
    iput-object v3, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v0, LSc/e$c;->h:Lkotlin/jvm/internal/N;

    const-class v3, Ly7/n;

    invoke-virtual {v1, v3}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v3

    iput-object v3, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    iget-object v2, v0, LSc/e$c;->b:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ljava/util/HashSet;

    iget-object v2, v0, LSc/e$c;->a:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move-object v10, v2

    check-cast v10, Lh9/a;

    iget-object v2, v0, LSc/e$c;->e:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Lxa/a$d;

    if-eqz v2, :cond_8

    invoke-interface {v2}, Lua/a;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    move-object/from16 v19, v2

    goto :goto_7

    :cond_8
    :goto_6
    iget-object v2, v0, LSc/e$c;->d:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    iget-object v3, v0, LSc/e$c;->f:LSc/e;

    new-instance v4, LSc/f;

    invoke-direct {v4, v3}, LSc/f;-><init>(LSc/e;)V

    invoke-static {v2, v4}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->G(Lzi/j;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly7/r;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ly7/r;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_9
    iget-object v2, v0, LSc/e$c;->c:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    iget-object v3, v0, LSc/e$c;->f:LSc/e;

    new-instance v4, LSc/g;

    invoke-direct {v4, v3}, LSc/g;-><init>(LSc/e;)V

    invoke-static {v2, v4}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-static {v2}, Lzi/m;->G(Lzi/j;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt7/e;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lt7/e;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_a
    move-object/from16 v19, v5

    :goto_7
    iget-object v2, v0, LSc/e$c;->e:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Lxa/a$d;

    check-cast v2, Lxa/a$d;

    if-eqz v2, :cond_b

    invoke-static {v2}, LSc/i;->a(Lxa/a$d;)LCc/b;

    move-result-object v2

    move-object v12, v2

    goto :goto_8

    :cond_b
    move-object v12, v5

    :goto_8
    iget-object v2, v0, LSc/e$c;->f:LSc/e;

    invoke-static {v2, v1}, LSc/e;->f(LSc/e;Ls7/b;)Ljava/util/TreeSet;

    move-result-object v13

    new-instance v14, Ljava/util/HashSet;

    invoke-direct {v14}, Ljava/util/HashSet;-><init>()V

    iget-object v2, v0, LSc/e$c;->h:Lkotlin/jvm/internal/N;

    iget-object v3, v0, LSc/e$c;->f:LSc/e;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, LZg/v;->d0(Ljava/lang/Iterable;)Lzi/j;

    move-result-object v2

    new-instance v4, LSc/h;

    invoke-direct {v4, v3}, LSc/h;-><init>(LSc/e;)V

    invoke-static {v2, v4}, Lzi/m;->C(Lzi/j;Lmh/l;)Lzi/j;

    move-result-object v2

    invoke-interface {v2}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly7/n;

    invoke-virtual {v14, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_c
    const-class v2, Lt7/a;

    invoke-virtual {v1, v2}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_d
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lt7/a;

    invoke-virtual {v4}, Lt7/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_b

    :cond_e
    move-object v4, v5

    :goto_b
    if-eqz v4, :cond_d

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_f
    invoke-static {v3}, LZg/v;->g0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v7, Ljava/util/TreeSet;

    invoke-direct {v7}, Ljava/util/TreeSet;-><init>()V

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_10
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v9

    if-le v9, v6, :cond_11

    const-string v6, "ubnt"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_11
    invoke-virtual {v7, v4}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_12
    const-class v2, Ly7/l;

    invoke-virtual {v1, v2}, Ls7/b;->e(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly7/l;

    sget-object v9, Lh9/a;->b:Lh9/a$b;

    invoke-virtual {v4}, Ly7/l;->a()[B

    move-result-object v15

    invoke-virtual {v9, v15}, Lh9/a$b;->d([B)Lh9/a;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v15, Lh9/a;

    invoke-direct {v15, v9}, Lh9/a;-><init>(Lh9/a;)V

    goto :goto_e

    :cond_14
    move-object v15, v5

    :goto_e
    invoke-virtual {v4}, Ly7/l;->b()Ljava/net/InetAddress;

    move-result-object v9

    if-eqz v9, :cond_15

    if-eqz v15, :cond_15

    invoke-virtual {v4}, Ly7/l;->b()Ljava/net/InetAddress;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v4}, Lee/b;->a(Ljava/net/InetAddress;)Linet/ipaddr/g;

    move-result-object v4

    invoke-static {v15, v4}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v4

    goto :goto_f

    :cond_15
    move-object v4, v5

    :goto_f
    if-eqz v4, :cond_13

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_16
    invoke-static {v3}, LZg/U;->r(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v15

    const-class v2, Lt7/g;

    invoke-virtual {v1, v2}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v2

    check-cast v2, Lt7/g;

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Lt7/g;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_10

    :cond_17
    move-object/from16 v16, v5

    :goto_10
    iget-object v2, v0, LSc/e$c;->g:Lkotlin/jvm/internal/N;

    iget-object v2, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v2, Ly7/s;

    sget-object v3, LSc/e$c$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    if-eq v2, v6, :cond_1a

    const/4 v3, 0x2

    if-eq v2, v3, :cond_19

    const/4 v3, 0x3

    if-eq v2, v3, :cond_18

    :goto_11
    move-object/from16 v17, v5

    goto :goto_12

    :cond_18
    sget-object v5, LS8/h;->REPEATER:LS8/h;

    goto :goto_11

    :cond_19
    sget-object v5, LS8/h;->STATION:LS8/h;

    goto :goto_11

    :cond_1a
    sget-object v5, LS8/h;->ACCESS_POINT:LS8/h;

    goto :goto_11

    :goto_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v20

    new-instance v9, Lcom/ui/wifiman/model/vendor/d$c;

    sget-object v2, Lcom/ui/wifiman/model/vendor/d$d;->UBIQUITI:Lcom/ui/wifiman/model/vendor/d$d;

    invoke-direct {v9, v2}, Lcom/ui/wifiman/model/vendor/d$c;-><init>(Lcom/ui/wifiman/model/vendor/d$d;)V

    const-class v2, Lt7/b;

    invoke-virtual {v1, v2}, Ls7/b;->d(Ljava/lang/Class;)Ls7/h;

    move-result-object v2

    sget-object v3, Lt7/b;->FACTORY_DEFAULT:Lt7/b;

    if-ne v2, v3, :cond_1b

    move/from16 v18, v6

    goto :goto_13

    :cond_1b
    const/4 v2, 0x0

    move/from16 v18, v2

    :goto_13
    iget-object v2, v0, LSc/e$c;->f:LSc/e;

    invoke-static {v2, v1}, LSc/e;->g(LSc/e;Ls7/b;)J

    move-result-wide v22

    new-instance v1, LSc/b$a;

    move-object v6, v1

    invoke-direct/range {v6 .. v23}, LSc/b$a;-><init>(Ljava/util/Set;Ljava/util/Set;Lcom/ui/wifiman/model/vendor/d;Lh9/a;Lxa/a$d;LCc/b;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;Ljava/lang/Long;LS8/h;ZLjava/lang/String;JJ)V

    new-instance v2, Ll9/a;

    invoke-direct {v2, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_14

    :cond_1c
    new-instance v2, Ll9/a;

    invoke-direct {v2, v5}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_14
    return-object v2
.end method

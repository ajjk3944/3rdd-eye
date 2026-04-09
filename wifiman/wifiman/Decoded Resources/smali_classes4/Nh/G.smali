.class public final LNh/G;
.super LNh/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LNh/G$a;,
        LNh/G$b;
    }
.end annotation


# instance fields
.field private final n:LQh/u;

.field private final o:LNh/D;

.field private final p:Loi/j;

.field private final q:Loi/h;


# direct methods
.method public constructor <init>(LMh/k;LQh/u;LNh/D;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LNh/b0;-><init>(LMh/k;)V

    iput-object p2, p0, LNh/G;->n:LQh/u;

    iput-object p3, p0, LNh/G;->o:LNh/D;

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/E;

    invoke-direct {p3, p1, p0}, LNh/E;-><init>(LMh/k;LNh/G;)V

    invoke-interface {p2, p3}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p2

    iput-object p2, p0, LNh/G;->p:Loi/j;

    invoke-virtual {p1}, LMh/k;->e()Loi/n;

    move-result-object p2

    new-instance p3, LNh/F;

    invoke-direct {p3, p0, p1}, LNh/F;-><init>(LNh/G;LMh/k;)V

    invoke-interface {p2, p3}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, LNh/G;->q:Loi/h;

    return-void
.end method

.method static synthetic g0(LMh/k;LNh/G;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, LNh/G;->o0(LMh/k;LNh/G;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h0(LNh/G;LMh/k;LNh/G$a;)LBh/e;
    .locals 0

    invoke-static {p0, p1, p2}, LNh/G;->i0(LNh/G;LMh/k;LNh/G$a;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(LNh/G;LMh/k;LNh/G$a;)LBh/e;
    .locals 15

    const-string v0, "request"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZh/b;

    invoke-virtual {p0}, LNh/G;->n0()LNh/D;

    move-result-object v2

    invoke-virtual {v2}, LDh/H;->e()LZh/c;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LNh/G$a;->b()LZh/f;

    move-result-object v3

    invoke-direct {v0, v2, v3}, LZh/b;-><init>(LZh/c;LZh/f;)V

    invoke-virtual/range {p2 .. p2}, LNh/G$a;->a()LQh/g;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->j()LSh/v;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, LNh/G$a;->a()LQh/g;

    move-result-object v3

    invoke-direct {p0}, LNh/G;->m0()LYh/e;

    move-result-object v4

    invoke-interface {v2, v3, v4}, LSh/v;->b(LQh/g;LYh/e;)LSh/v$a;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v2

    invoke-virtual {v2}, LMh/d;->j()LSh/v;

    move-result-object v2

    invoke-direct {p0}, LNh/G;->m0()LYh/e;

    move-result-object v3

    invoke-interface {v2, v0, v3}, LSh/v;->a(LZh/b;LYh/e;)LSh/v$a;

    move-result-object v2

    :goto_0
    const/4 v7, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LSh/v$a;->a()LSh/x;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v7

    :goto_1
    if-eqz v2, :cond_2

    invoke-interface {v2}, LSh/x;->b()LZh/b;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v7

    :goto_2
    if-eqz v3, :cond_3

    invoke-virtual {v3}, LZh/b;->j()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, LZh/b;->i()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    move-object v8, p0

    goto :goto_4

    :cond_4
    :goto_3
    return-object v7

    :goto_4
    invoke-direct {p0, v2}, LNh/G;->p0(LSh/x;)LNh/G$b;

    move-result-object v2

    instance-of v3, v2, LNh/G$b$a;

    if-eqz v3, :cond_5

    check-cast v2, LNh/G$b$a;

    invoke-virtual {v2}, LNh/G$b$a;->a()LBh/e;

    move-result-object v7

    goto/16 :goto_7

    :cond_5
    instance-of v3, v2, LNh/G$b$c;

    if-eqz v3, :cond_6

    goto/16 :goto_7

    :cond_6
    instance-of v2, v2, LNh/G$b$b;

    if-eqz v2, :cond_d

    invoke-virtual/range {p2 .. p2}, LNh/G$a;->a()LQh/g;

    move-result-object v1

    if-nez v1, :cond_7

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v1

    invoke-virtual {v1}, LMh/d;->d()LJh/u;

    move-result-object v9

    new-instance v10, LJh/u$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v10

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, LJh/u$a;-><init>(LZh/b;[BLQh/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v9, v10}, LJh/u;->c(LJh/u$a;)LQh/g;

    move-result-object v1

    :cond_7
    move-object v11, v1

    if-eqz v11, :cond_8

    invoke-interface {v11}, LQh/g;->I()LQh/D;

    move-result-object v1

    goto :goto_5

    :cond_8
    move-object v1, v7

    :goto_5
    sget-object v2, LQh/D;->BINARY:LQh/D;

    if-eq v1, v2, :cond_c

    if-eqz v11, :cond_9

    invoke-interface {v11}, LQh/g;->e()LZh/c;

    move-result-object v0

    goto :goto_6

    :cond_9
    move-object v0, v7

    :goto_6
    if-eqz v0, :cond_b

    invoke-virtual {v0}, LZh/c;->d()Z

    move-result v1

    if-nez v1, :cond_b

    invoke-virtual {v0}, LZh/c;->e()LZh/c;

    move-result-object v0

    invoke-virtual {p0}, LNh/G;->n0()LNh/D;

    move-result-object v1

    invoke-virtual {v1}, LDh/H;->e()LZh/c;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_7

    :cond_a
    new-instance v7, LNh/n;

    invoke-virtual {p0}, LNh/G;->n0()LNh/D;

    move-result-object v10

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object v8, v7

    move-object/from16 v9, p1

    invoke-direct/range {v8 .. v14}, LNh/n;-><init>(LMh/k;LBh/m;LQh/g;LBh/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->e()LJh/v;

    move-result-object v0

    invoke-interface {v0, v7}, LJh/v;->a(LLh/c;)V

    :cond_b
    :goto_7
    return-object v7

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t find kotlin binary class for light class created by kotlin binary file\nJavaClass: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\nClassId: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\nfindKotlinClass(JavaClass) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->j()LSh/v;

    move-result-object v3

    invoke-direct {p0}, LNh/G;->m0()LYh/e;

    move-result-object v4

    invoke-static {v3, v11, v4}, LSh/w;->a(LSh/v;LQh/g;LYh/e;)LSh/x;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\nfindKotlinClass(ClassId) = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, LMh/k;->a()LMh/d;

    move-result-object v3

    invoke-virtual {v3}, LMh/d;->j()LSh/v;

    move-result-object v3

    invoke-direct {p0}, LNh/G;->m0()LYh/e;

    move-result-object v4

    invoke-static {v3, v0, v4}, LSh/w;->b(LSh/v;LZh/b;LYh/e;)LSh/x;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final j0(LZh/f;LQh/g;)LBh/e;
    .locals 3

    sget-object v0, LZh/h;->a:LZh/h;

    invoke-virtual {v0, p1}, LZh/h;->a(LZh/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LNh/G;->p:Loi/j;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez p2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, LNh/G;->q:Loi/h;

    new-instance v1, LNh/G$a;

    invoke-direct {v1, p1, p2}, LNh/G$a;-><init>(LZh/f;LQh/g;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/e;

    return-object p1
.end method

.method private final m0()LYh/e;
    .locals 1

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->b()LSh/n;

    move-result-object v0

    invoke-virtual {v0}, LSh/n;->f()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-static {v0}, Lxi/c;->a(Lli/o;)LYh/e;

    move-result-object v0

    return-object v0
.end method

.method private static final o0(LMh/k;LNh/G;)Ljava/util/Set;
    .locals 0

    invoke-virtual {p0}, LMh/k;->a()LMh/d;

    move-result-object p0

    invoke-virtual {p0}, LMh/d;->d()LJh/u;

    move-result-object p0

    invoke-virtual {p1}, LNh/G;->n0()LNh/D;

    move-result-object p1

    invoke-virtual {p1}, LDh/H;->e()LZh/c;

    move-result-object p1

    invoke-interface {p0, p1}, LJh/u;->b(LZh/c;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final p0(LSh/x;)LNh/G$b;
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, LNh/G$b$b;->a:LNh/G$b$b;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LSh/x;->a()LTh/a;

    move-result-object v0

    invoke-virtual {v0}, LTh/a;->c()LTh/a$a;

    move-result-object v0

    sget-object v1, LTh/a$a;->CLASS:LTh/a$a;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LNh/U;->L()LMh/k;

    move-result-object v0

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->b()LSh/n;

    move-result-object v0

    invoke-virtual {v0, p1}, LSh/n;->n(LSh/x;)LBh/e;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, LNh/G$b$a;

    invoke-direct {v0, p1}, LNh/G$b$a;-><init>(LBh/e;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    sget-object p1, LNh/G$b$b;->a:LNh/G$b$b;

    goto :goto_0

    :cond_2
    sget-object p1, LNh/G$b$c;->a:LNh/G$b$c;

    :goto_0
    return-object p1
.end method


# virtual methods
.method protected B(Ljava/util/Collection;LZh/f;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected D(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic R()LBh/m;
    .locals 1

    invoke-virtual {p0}, LNh/G;->n0()LNh/D;

    move-result-object v0

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 4

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lii/d;->c:Lii/d$a;

    invoke-virtual {v0}, Lii/d$a;->c()I

    move-result v1

    invoke-virtual {v0}, Lii/d$a;->e()I

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lii/d;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LNh/U;->K()Loi/i;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/m;

    instance-of v3, v2, LBh/e;

    if-eqz v3, :cond_1

    check-cast v2, LBh/e;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic g(LZh/f;LIh/b;)LBh/h;
    .locals 0

    invoke-virtual {p0, p1, p2}, LNh/G;->l0(LZh/f;LIh/b;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public final k0(LQh/g;)LBh/e;
    .locals 1

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LQh/t;->getName()LZh/f;

    move-result-object v0

    invoke-direct {p0, v0, p1}, LNh/G;->j0(LZh/f;LQh/g;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method public l0(LZh/f;LIh/b;)LBh/e;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, LNh/G;->j0(LZh/f;LQh/g;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method protected n0()LNh/D;
    .locals 1

    iget-object v0, p0, LNh/G;->o:LNh/D;

    return-object v0
.end method

.method protected v(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lii/d;->c:Lii/d$a;

    invoke-virtual {v0}, Lii/d$a;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Lii/d;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LNh/G;->p:Loi/j;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    iget-object p1, p0, LNh/G;->n:LQh/u;

    if-nez p2, :cond_3

    invoke-static {}, Lxi/j;->k()Lmh/l;

    move-result-object p2

    :cond_3
    invoke-interface {p1, p2}, LQh/u;->q(Lmh/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LQh/g;

    invoke-interface {v0}, LQh/g;->I()LQh/D;

    move-result-object v1

    sget-object v2, LQh/D;->SOURCE:LQh/D;

    if-ne v1, v2, :cond_5

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    invoke-interface {v0}, LQh/t;->getName()LZh/f;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object p2
.end method

.method protected x(Lii/d;Lmh/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZg/d0;->e()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected z()LNh/c;
    .locals 1

    sget-object v0, LNh/c$a;->a:LNh/c$a;

    return-object v0
.end method

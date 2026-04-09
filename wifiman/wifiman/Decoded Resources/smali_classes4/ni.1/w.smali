.class public abstract Lni/w;
.super Lii/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lni/w$a;,
        Lni/w$b;,
        Lni/w$c;
    }
.end annotation


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final b:Lli/p;

.field private final c:Lni/w$a;

.field private final d:Loi/i;

.field private final e:Loi/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lni/w;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "classNames"

    const-string v4, "getClassNames$deserialization()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "classifierNamesLazy"

    const-string v4, "getClassifierNamesLazy()Ljava/util/Set;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lni/w;->f:[Lth/l;

    return-void
.end method

.method protected constructor <init>(Lli/p;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lmh/a;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classNames"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/l;-><init>()V

    iput-object p1, p0, Lni/w;->b:Lli/p;

    invoke-direct {p0, p2, p3, p4}, Lni/w;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lni/w$a;

    move-result-object p2

    iput-object p2, p0, Lni/w;->c:Lni/w$a;

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p2

    new-instance p3, Lni/u;

    invoke-direct {p3, p5}, Lni/u;-><init>(Lmh/a;)V

    invoke-interface {p2, p3}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lni/w;->d:Loi/i;

    invoke-virtual {p1}, Lli/p;->h()Loi/n;

    move-result-object p1

    new-instance p2, Lni/v;

    invoke-direct {p2, p0}, Lni/v;-><init>(Lni/w;)V

    invoke-interface {p1, p2}, Loi/n;->b(Lmh/a;)Loi/j;

    move-result-object p1

    iput-object p1, p0, Lni/w;->e:Loi/j;

    return-void
.end method

.method static synthetic h(Lmh/a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Lni/w;->k(Lmh/a;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lni/w;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Lni/w;->l(Lni/w;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lmh/a;)Ljava/util/Set;
    .locals 0

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, LZg/v;->n1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lni/w;)Ljava/util/Set;
    .locals 2

    invoke-virtual {p0}, Lni/w;->v()Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lni/w;->t()Ljava/util/Set;

    move-result-object v1

    iget-object p0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {p0}, Lni/w$a;->g()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v1, p0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p0, v0}, LZg/d0;->l(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private final q(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lni/w$a;
    .locals 1

    iget-object v0, p0, Lni/w;->b:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {v0}, Lli/n;->g()Lli/o;

    move-result-object v0

    invoke-interface {v0}, Lli/o;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lni/w$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lni/w$b;-><init>(Lni/w;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lni/w$c;

    invoke-direct {v0, p0, p1, p2, p3}, Lni/w$c;-><init>(Lni/w;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    :goto_0
    return-object v0
.end method

.method private final r(LZh/f;)LBh/e;
    .locals 1

    iget-object v0, p0, Lni/w;->b:Lli/p;

    invoke-virtual {v0}, Lli/p;->c()Lli/n;

    move-result-object v0

    invoke-virtual {p0, p1}, Lni/w;->p(LZh/f;)LZh/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lli/n;->b(LZh/b;)LBh/e;

    move-result-object p1

    return-object p1
.end method

.method private final u()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w;->e:Loi/j;

    sget-object v1, Lni/w;->f:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->b(Loi/j;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final y(LZh/f;)LBh/k0;
    .locals 1

    iget-object v0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v0, p1}, Lni/w$a;->e(LZh/f;)LBh/k0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method protected A(LBh/f0;)Z
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v0}, Lni/w$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v0, p1, p2}, Lni/w$a;->b(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v0}, Lni/w$a;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v0, p1, p2}, Lni/w$a;->d(LZh/f;LIh/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, Lni/w;->u()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(LZh/f;LIh/b;)LBh/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lni/w;->z(LZh/f;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lni/w;->r(LZh/f;)LBh/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {p2}, Lni/w$a;->g()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, Lni/w;->y(LZh/f;)LBh/k0;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected abstract j(Ljava/util/Collection;Lmh/l;)V
.end method

.method protected final m(Lii/d;Lmh/l;LIh/b;)Ljava/util/Collection;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v1, Lii/d;->c:Lii/d$a;

    invoke-virtual {v1}, Lii/d$a;->g()I

    move-result v2

    invoke-virtual {p1, v2}, Lii/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, p2}, Lni/w;->j(Ljava/util/Collection;Lmh/l;)V

    :cond_0
    iget-object v2, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v2, v0, p1, p2, p3}, Lni/w$a;->f(Ljava/util/Collection;Lii/d;Lmh/l;LIh/b;)V

    invoke-virtual {v1}, Lii/d$a;->c()I

    move-result p3

    invoke-virtual {p1, p3}, Lii/d;->a(I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lni/w;->t()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZh/f;

    invoke-interface {p2, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v1}, Lni/w;->r(LZh/f;)LBh/e;

    move-result-object v1

    invoke-static {v0, v1}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object p3, Lii/d;->c:Lii/d$a;

    invoke-virtual {p3}, Lii/d$a;->h()I

    move-result p3

    invoke-virtual {p1, p3}, Lii/d;->a(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {p1}, Lni/w$a;->g()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LZh/f;

    invoke-interface {p2, p3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lni/w;->c:Lni/w$a;

    invoke-interface {v1, p3}, Lni/w$a;->e(LZh/f;)LBh/k0;

    move-result-object p3

    invoke-static {v0, p3}, Lxi/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lxi/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected n(LZh/f;Ljava/util/List;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "functions"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected o(LZh/f;Ljava/util/List;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "descriptors"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract p(LZh/f;)LZh/b;
.end method

.method protected final s()Lli/p;
    .locals 1

    iget-object v0, p0, Lni/w;->b:Lli/p;

    return-object v0
.end method

.method public final t()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lni/w;->d:Loi/i;

    sget-object v1, Lni/w;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method protected abstract v()Ljava/util/Set;
.end method

.method protected abstract w()Ljava/util/Set;
.end method

.method protected abstract x()Ljava/util/Set;
.end method

.method protected z(LZh/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lni/w;->t()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

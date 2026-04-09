.class public final Lii/q;
.super Lii/l;
.source "SourceFile"


# static fields
.field static final synthetic f:[Lth/l;


# instance fields
.field private final b:LBh/e;

.field private final c:Z

.field private final d:Loi/i;

.field private final e:Loi/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lii/q;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "functions"

    const-string v4, "getFunctions()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v3, "properties"

    const-string v4, "getProperties()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lii/q;->f:[Lth/l;

    return-void
.end method

.method public constructor <init>(Loi/n;LBh/e;Z)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/l;-><init>()V

    iput-object p2, p0, Lii/q;->b:LBh/e;

    iput-boolean p3, p0, Lii/q;->c:Z

    invoke-interface {p2}, LBh/e;->h()LBh/f;

    sget-object p2, LBh/f;->CLASS:LBh/f;

    new-instance p2, Lii/o;

    invoke-direct {p2, p0}, Lii/o;-><init>(Lii/q;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p2

    iput-object p2, p0, Lii/q;->d:Loi/i;

    new-instance p2, Lii/p;

    invoke-direct {p2, p0}, Lii/p;-><init>(Lii/q;)V

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lii/q;->e:Loi/i;

    return-void
.end method

.method static synthetic h(Lii/q;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lii/q;->j(Lii/q;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic i(Lii/q;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lii/q;->p(Lii/q;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lii/q;)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lii/q;->b:LBh/e;

    invoke-static {v0}, Lbi/h;->g(LBh/e;)LBh/f0;

    move-result-object v0

    iget-object p0, p0, Lii/q;->b:LBh/e;

    invoke-static {p0}, Lbi/h;->h(LBh/e;)LBh/f0;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [LBh/f0;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p0, v1, v0

    invoke-static {v1}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final n()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lii/q;->d:Loi/i;

    sget-object v1, Lii/q;->f:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final o()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lii/q;->e:Loi/i;

    sget-object v1, Lii/q;->f:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, Loi/m;->a(Loi/i;Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final p(Lii/q;)Ljava/util/List;
    .locals 1

    iget-boolean v0, p0, Lii/q;->c:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lii/q;->b:LBh/e;

    invoke-static {p0}, Lbi/h;->f(LBh/e;)LBh/Y;

    move-result-object p0

    invoke-static {p0}, LZg/v;->p(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lii/q;->m(LZh/f;LIh/b;)Lxi/k;

    move-result-object p1

    return-object p1
.end method

.method public d(LZh/f;LIh/b;)Ljava/util/Collection;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/q;->o()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Lxi/k;

    invoke-direct {v0}, Lxi/k;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/Y;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic e(Lii/d;Lmh/l;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lii/q;->l(Lii/d;Lmh/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic g(LZh/f;LIh/b;)LBh/h;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lii/q;->k(LZh/f;LIh/b;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, LBh/h;

    return-object p1
.end method

.method public k(LZh/f;LIh/b;)Ljava/lang/Void;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Lii/d;Lmh/l;)Ljava/util/List;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/q;->n()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0}, Lii/q;->o()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, LZg/v;->M0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public m(LZh/f;LIh/b;)Lxi/k;
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lii/q;->n()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Lxi/k;

    invoke-direct {v0}, Lxi/k;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LBh/f0;

    invoke-interface {v2}, LBh/I;->getName()LZh/f;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

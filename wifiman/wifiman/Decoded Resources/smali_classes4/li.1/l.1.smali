.class public final Lli/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lli/l$a;,
        Lli/l$b;
    }
.end annotation


# static fields
.field public static final c:Lli/l$b;

.field private static final d:Ljava/util/Set;


# instance fields
.field private final a:Lli/n;

.field private final b:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lli/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lli/l$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lli/l;->c:Lli/l$b;

    sget-object v0, LZh/b;->d:LZh/b$a;

    sget-object v1, Lkotlin/reflect/jvm/internal/impl/builtins/o$a;->d:LZh/d;

    invoke-virtual {v1}, LZh/d;->l()LZh/c;

    move-result-object v1

    const-string v2, "toSafe(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LZh/b$a;->c(LZh/c;)LZh/b;

    move-result-object v0

    invoke-static {v0}, LZg/d0;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lli/l;->d:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lli/n;)V
    .locals 1

    const-string v0, "components"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lli/l;->a:Lli/n;

    invoke-virtual {p1}, Lli/n;->u()Loi/n;

    move-result-object p1

    new-instance v0, Lli/k;

    invoke-direct {v0, p0}, Lli/k;-><init>(Lli/l;)V

    invoke-interface {p1, v0}, Loi/n;->i(Lmh/l;)Loi/h;

    move-result-object p1

    iput-object p1, p0, Lli/l;->b:Lmh/l;

    return-void
.end method

.method public static final synthetic a()Ljava/util/Set;
    .locals 1

    sget-object v0, Lli/l;->d:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic b(Lli/l;Lli/l$a;)LBh/e;
    .locals 0

    invoke-static {p0, p1}, Lli/l;->c(Lli/l;Lli/l$a;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lli/l;Lli/l$a;)LBh/e;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lli/l;->d(Lli/l$a;)LBh/e;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lli/l$a;)LBh/e;
    .locals 12

    invoke-virtual {p1}, Lli/l$a;->b()LZh/b;

    move-result-object v0

    iget-object v1, p0, Lli/l;->a:Lli/n;

    invoke-virtual {v1}, Lli/n;->l()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCh/b;

    invoke-interface {v2, v0}, LCh/b;->b(LZh/b;)LBh/e;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_1
    sget-object v1, Lli/l;->d:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, Lli/l$a;->a()Lli/i;

    move-result-object p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lli/l;->a:Lli/n;

    invoke-virtual {p1}, Lli/n;->e()Lli/j;

    move-result-object p1

    invoke-interface {p1, v0}, Lli/j;->a(LZh/b;)Lli/i;

    move-result-object p1

    if-nez p1, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {p1}, Lli/i;->a()LWh/c;

    move-result-object v1

    invoke-virtual {p1}, Lli/i;->b()LUh/c;

    move-result-object v10

    invoke-virtual {p1}, Lli/i;->c()LWh/a;

    move-result-object v11

    invoke-virtual {p1}, Lli/i;->d()LBh/g0;

    move-result-object p1

    invoke-virtual {v0}, LZh/b;->e()LZh/b;

    move-result-object v3

    if-eqz v3, :cond_7

    const/4 v4, 0x2

    invoke-static {p0, v3, v2, v4, v2}, Lli/l;->f(Lli/l;LZh/b;Lli/i;ILjava/lang/Object;)LBh/e;

    move-result-object v3

    instance-of v4, v3, Lni/m;

    if-eqz v4, :cond_4

    check-cast v3, Lni/m;

    goto :goto_0

    :cond_4
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_5

    return-object v2

    :cond_5
    invoke-virtual {v0}, LZh/b;->h()LZh/f;

    move-result-object v0

    invoke-virtual {v3, v0}, Lni/m;->k1(LZh/f;)Z

    move-result v0

    if-nez v0, :cond_6

    return-object v2

    :cond_6
    invoke-virtual {v3}, Lni/m;->d1()Lli/p;

    move-result-object v0

    :goto_1
    move-object v4, v0

    goto :goto_3

    :cond_7
    iget-object v3, p0, Lli/l;->a:Lli/n;

    invoke-virtual {v3}, Lli/n;->s()LBh/N;

    move-result-object v3

    invoke-virtual {v0}, LZh/b;->f()LZh/c;

    move-result-object v4

    invoke-static {v3, v4}, LBh/S;->c(LBh/N;LZh/c;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LBh/M;

    instance-of v6, v5, Lli/r;

    if-eqz v6, :cond_a

    check-cast v5, Lli/r;

    invoke-virtual {v0}, LZh/b;->h()LZh/f;

    move-result-object v6

    invoke-virtual {v5, v6}, Lli/r;->K0(LZh/f;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_9
    move-object v4, v2

    :cond_a
    :goto_2
    check-cast v4, LBh/M;

    if-nez v4, :cond_b

    return-object v2

    :cond_b
    iget-object v3, p0, Lli/l;->a:Lli/n;

    new-instance v6, LWh/g;

    invoke-virtual {v10}, LUh/c;->r2()LUh/t;

    move-result-object v0

    const-string v2, "getTypeTable(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v0}, LWh/g;-><init>(LUh/t;)V

    sget-object v0, LWh/h;->b:LWh/h$a;

    invoke-virtual {v10}, LUh/c;->t2()LUh/w;

    move-result-object v2

    const-string v5, "getVersionRequirementTable(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, LWh/h$a;->a(LUh/w;)LWh/h;

    move-result-object v7

    const/4 v9, 0x0

    move-object v5, v1

    move-object v8, v11

    invoke-virtual/range {v3 .. v9}, Lli/n;->a(LBh/M;LWh/c;LWh/g;LWh/h;LWh/a;Lni/s;)Lli/p;

    move-result-object v0

    goto :goto_1

    :goto_3
    new-instance v0, Lni/m;

    move-object v3, v0

    move-object v5, v10

    move-object v6, v1

    move-object v7, v11

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Lni/m;-><init>(Lli/p;LUh/c;LWh/c;LWh/a;LBh/g0;)V

    return-object v0
.end method

.method public static synthetic f(Lli/l;LZh/b;Lli/i;ILjava/lang/Object;)LBh/e;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lli/l;->e(LZh/b;Lli/i;)LBh/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(LZh/b;Lli/i;)LBh/e;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lli/l;->b:Lmh/l;

    new-instance v1, Lli/l$a;

    invoke-direct {v1, p1, p2}, Lli/l$a;-><init>(LZh/b;Lli/i;)V

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LBh/e;

    return-object p1
.end method

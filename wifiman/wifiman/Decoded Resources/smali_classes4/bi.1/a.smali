.class public final Lbi/a;
.super Lbi/t;
.source "SourceFile"


# static fields
.field public static final a:Lbi/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/a;

    invoke-direct {v0}, Lbi/a;-><init>()V

    sput-object v0, Lbi/a;->a:Lbi/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lbi/t;-><init>()V

    return-void
.end method

.method private static final b(LBh/e;Ljava/util/LinkedHashSet;Lii/k;Z)V
    .locals 4

    sget-object v0, Lii/d;->t:Lii/d;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p2, v0, v2, v1, v2}, Lii/n$a;->a(Lii/n;Lii/d;Lmh/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBh/m;

    instance-of v3, v1, LBh/e;

    if-eqz v3, :cond_0

    check-cast v1, LBh/e;

    invoke-interface {v1}, LBh/C;->L()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, LBh/I;->getName()LZh/f;

    move-result-object v1

    const-string v3, "getName(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    invoke-interface {p2, v1, v3}, Lii/n;->g(LZh/f;LIh/b;)LBh/h;

    move-result-object v1

    instance-of v3, v1, LBh/e;

    if-eqz v3, :cond_1

    check-cast v1, LBh/e;

    goto :goto_1

    :cond_1
    instance-of v3, v1, LBh/k0;

    if-eqz v3, :cond_2

    check-cast v1, LBh/k0;

    invoke-interface {v1}, LBh/k0;->t()LBh/e;

    move-result-object v1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v1, p0}, Lbi/i;->z(LBh/e;LBh/e;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_5
    if-eqz p3, :cond_0

    invoke-interface {v1}, LBh/e;->y0()Lii/k;

    move-result-object v1

    const-string v3, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v1, p3}, Lbi/a;->b(LBh/e;Ljava/util/LinkedHashSet;Lii/k;Z)V

    goto :goto_0

    :cond_6
    return-void
.end method


# virtual methods
.method public a(LBh/e;Z)Ljava/util/Collection;
    .locals 4

    const-string v0, "sealedClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LBh/e;->l()LBh/D;

    move-result-object v0

    sget-object v1, LBh/D;->SEALED:LBh/D;

    if-eq v0, v1, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    if-nez p2, :cond_1

    invoke-interface {p1}, LBh/e;->b()LBh/m;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lfi/e;->u(LBh/m;)Lzi/j;

    move-result-object v1

    invoke-interface {v1}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LBh/m;

    instance-of v3, v3, LBh/M;

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    move-object v1, v2

    check-cast v1, LBh/m;

    :goto_1
    instance-of v2, v1, LBh/M;

    if-eqz v2, :cond_4

    check-cast v1, LBh/M;

    invoke-interface {v1}, LBh/M;->r()Lii/k;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lbi/a;->b(LBh/e;Ljava/util/LinkedHashSet;Lii/k;Z)V

    :cond_4
    invoke-interface {p1}, LBh/e;->y0()Lii/k;

    move-result-object p2

    const-string v1, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-static {p1, v0, p2, v1}, Lbi/a;->b(LBh/e;Ljava/util/LinkedHashSet;Lii/k;Z)V

    new-instance p1, Lbi/a$a;

    invoke-direct {p1}, Lbi/a$a;-><init>()V

    invoke-static {v0, p1}, LZg/v;->X0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

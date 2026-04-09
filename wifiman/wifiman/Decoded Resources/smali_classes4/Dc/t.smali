.class public abstract LDc/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEc/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LDc/t$a;
    }
.end annotation


# static fields
.field public static final c:LDc/t$a;


# instance fields
.field private final a:Ljava/util/Set;

.field private final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LDc/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LDc/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LDc/t;->c:LDc/t$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LDc/t;->a:Ljava/util/Set;

    new-instance v0, LDc/s;

    invoke-direct {v0, p0}, LDc/s;-><init>(LDc/t;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LDc/t;->b:LYg/m;

    return-void
.end method

.method public static synthetic c(LDc/t;)V
    .locals 0

    invoke-static {p0}, LDc/t;->p(LDc/t;)V

    return-void
.end method

.method public static synthetic d(LDc/t;)Lgg/i;
    .locals 0

    invoke-static {p0}, LDc/t;->o(LDc/t;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LDc/t;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, LDc/t;->a:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic f(LDc/t;Ljava/util/Collection;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, LDc/t;->l(Ljava/util/Collection;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LDc/t;Linet/ipaddr/g;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LDc/t;->n(Linet/ipaddr/g;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final j()Lgg/i;
    .locals 1

    iget-object v0, p0, LDc/t;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgg/i;

    return-object v0
.end method

.method private final l(Ljava/util/Collection;)Lgg/i;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lgg/z;->C(Ljava/lang/Iterable;)Lgg/i;

    move-result-object p1

    new-instance v1, LDc/t$c;

    invoke-direct {v1, v0}, LDc/t$c;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string v1, "refCount(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v1, 0x1f4

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v1, v2, v3}, Lgg/i;->O(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->e1()Lgg/i;

    move-result-object v1

    invoke-virtual {p1}, Lgg/i;->n0()Lgg/n;

    move-result-object p1

    invoke-virtual {v1, p1}, Lgg/i;->V0(Lgg/r;)Lgg/i;

    move-result-object p1

    new-instance v1, LDc/t$b;

    invoke-direct {v1, v0}, LDc/t$b;-><init>(Ljava/util/List;)V

    invoke-virtual {p1, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final n(Linet/ipaddr/g;)Lgg/z;
    .locals 1

    iget-object v0, p0, LDc/t;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, LDc/t;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, LDc/t;->m(Linet/ipaddr/g;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method private static final o(LDc/t;)Lgg/i;
    .locals 2

    new-instance v0, LDc/t$j;

    invoke-direct {v0, p0}, LDc/t$j;-><init>(LDc/t;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LDc/t$d;->a:LDc/t$d;

    invoke-virtual {v0, v1}, Lgg/z;->w(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object v0

    sget-object v1, LDc/t$e;->a:LDc/t$e;

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LDc/t$f;

    invoke-direct {v1, p0}, LDc/t$f;-><init>(LDc/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    new-instance v1, LDc/t$g;

    invoke-direct {v1, p0}, LDc/t$g;-><init>(LDc/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object v0

    invoke-virtual {v0}, Ljg/a;->i2()Lgg/i;

    move-result-object v0

    new-instance v1, LDc/t$h;

    invoke-direct {v1, p0}, LDc/t$h;-><init>(LDc/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, LDc/t$i;

    invoke-direct {v1, p0}, LDc/t$i;-><init>(LDc/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->d0(Lkg/f;)Lgg/i;

    move-result-object v0

    new-instance v1, LDc/r;

    invoke-direct {v1, p0}, LDc/r;-><init>(LDc/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p0

    const-string v0, "doFinally(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private static final p(LDc/t;)V
    .locals 1

    const-string v0, "Finished"

    invoke-virtual {p0}, LDc/t;->i()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public b()Lgg/i;
    .locals 1

    invoke-direct {p0}, LDc/t;->j()Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()LDc/k;
.end method

.method protected abstract i()Ljava/lang/String;
.end method

.method protected abstract k()Lgg/y;
.end method

.method protected abstract m(Linet/ipaddr/g;)Lgg/z;
.end method

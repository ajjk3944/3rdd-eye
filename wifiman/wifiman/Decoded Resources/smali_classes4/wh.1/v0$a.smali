.class final Lwh/v0$a;
.super Lwh/d0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# static fields
.field static final synthetic j:[Lth/l;


# instance fields
.field private final d:Lwh/a1$a;

.field private final e:Lwh/a1$a;

.field private final f:LYg/m;

.field private final g:LYg/m;

.field private final h:Lwh/a1$a;

.field final synthetic i:Lwh/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/F;

    const-class v1, Lwh/v0$a;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-string v3, "kotlinClass"

    const-string v4, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    invoke-direct {v0, v2, v3, v4}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-string v4, "scope"

    const-string v5, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v2, v3, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/F;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-string v4, "members"

    const-string v5, "getMembers()Ljava/util/Collection;"

    invoke-direct {v3, v1, v4, v5}, Lkotlin/jvm/internal/F;-><init>(Lth/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->h(Lkotlin/jvm/internal/E;)Lth/n;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [Lth/l;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, Lwh/v0$a;->j:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lwh/v0;)V
    .locals 2

    iput-object p1, p0, Lwh/v0$a;->i:Lwh/v0;

    invoke-direct {p0, p1}, Lwh/d0$b;-><init>(Lwh/d0;)V

    new-instance v0, Lwh/q0;

    invoke-direct {v0, p1}, Lwh/q0;-><init>(Lwh/v0;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    iput-object v0, p0, Lwh/v0$a;->d:Lwh/a1$a;

    new-instance v0, Lwh/r0;

    invoke-direct {v0, p0}, Lwh/r0;-><init>(Lwh/v0$a;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object v0

    iput-object v0, p0, Lwh/v0$a;->e:Lwh/a1$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lwh/s0;

    invoke-direct {v1, p0, p1}, Lwh/s0;-><init>(Lwh/v0$a;Lwh/v0;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v1

    iput-object v1, p0, Lwh/v0$a;->f:LYg/m;

    new-instance v1, Lwh/t0;

    invoke-direct {v1, p0}, Lwh/t0;-><init>(Lwh/v0$a;)V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, Lwh/v0$a;->g:LYg/m;

    new-instance v0, Lwh/u0;

    invoke-direct {v0, p1, p0}, Lwh/u0;-><init>(Lwh/v0;Lwh/v0$a;)V

    invoke-static {v0}, Lwh/a1;->c(Lmh/a;)Lwh/a1$a;

    move-result-object p1

    iput-object p1, p0, Lwh/v0$a;->h:Lwh/a1$a;

    return-void
.end method

.method static synthetic d(Lwh/v0;)LFh/f;
    .locals 0

    invoke-static {p0}, Lwh/v0$a;->m(Lwh/v0;)LFh/f;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lwh/v0$a;)Lii/k;
    .locals 0

    invoke-static {p0}, Lwh/v0$a;->q(Lwh/v0$a;)Lii/k;

    move-result-object p0

    return-object p0
.end method

.method static synthetic f(Lwh/v0$a;Lwh/v0;)Ljava/lang/Class;
    .locals 0

    invoke-static {p0, p1}, Lwh/v0$a;->p(Lwh/v0$a;Lwh/v0;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lwh/v0$a;)LYg/y;
    .locals 0

    invoke-static {p0}, Lwh/v0$a;->o(Lwh/v0$a;)LYg/y;

    move-result-object p0

    return-object p0
.end method

.method static synthetic h(Lwh/v0;Lwh/v0$a;)Ljava/util/Collection;
    .locals 0

    invoke-static {p0, p1}, Lwh/v0$a;->n(Lwh/v0;Lwh/v0$a;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final i()LFh/f;
    .locals 3

    iget-object v0, p0, Lwh/v0$a;->d:Lwh/a1$a;

    sget-object v1, Lwh/v0$a;->j:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LFh/f;

    return-object v0
.end method

.method private static final m(Lwh/v0;)LFh/f;
    .locals 1

    sget-object v0, LFh/f;->c:LFh/f$a;

    invoke-virtual {p0}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {v0, p0}, LFh/f$a;->a(Ljava/lang/Class;)LFh/f;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lwh/v0;Lwh/v0$a;)Ljava/util/Collection;
    .locals 1

    invoke-virtual {p1}, Lwh/v0$a;->l()Lii/k;

    move-result-object p1

    sget-object v0, Lwh/d0$d;->DECLARED:Lwh/d0$d;

    invoke-virtual {p0, p1, v0}, Lwh/d0;->K(Lii/k;Lwh/d0$d;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lwh/v0$a;)LYg/y;
    .locals 3

    invoke-direct {p0}, Lwh/v0$a;->i()LFh/f;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LFh/f;->a()LTh/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LTh/a;->a()[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, LTh/a;->g()[Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    invoke-static {v1, v2}, LYh/i;->m([Ljava/lang/String;[Ljava/lang/String;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYh/f;

    invoke-virtual {v0}, LYg/s;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LUh/l;

    new-instance v2, LYg/y;

    invoke-virtual {p0}, LTh/a;->d()LYh/e;

    move-result-object p0

    invoke-direct {v2, v1, v0, p0}, LYg/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, v2

    :cond_0
    return-object v0
.end method

.method private static final p(Lwh/v0$a;Lwh/v0;)Ljava/lang/Class;
    .locals 7

    invoke-direct {p0}, Lwh/v0$a;->i()LFh/f;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LFh/f;->a()LTh/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LTh/a;->e()Ljava/lang/String;

    move-result-object p0

    move-object v1, p0

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-lez p0, :cond_1

    invoke-virtual {p1}, Lwh/v0;->b()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/t;->K(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private static final q(Lwh/v0$a;)Lii/k;
    .locals 1

    invoke-direct {p0}, Lwh/v0$a;->i()LFh/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lwh/d0$b;->b()LFh/k;

    move-result-object p0

    invoke-virtual {p0}, LFh/k;->c()LFh/a;

    move-result-object p0

    invoke-virtual {p0, v0}, LFh/a;->a(LFh/f;)Lii/k;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p0, Lii/k$b;->b:Lii/k$b;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final j()LYg/y;
    .locals 1

    iget-object v0, p0, Lwh/v0$a;->g:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYg/y;

    return-object v0
.end method

.method public final k()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lwh/v0$a;->f:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    return-object v0
.end method

.method public final l()Lii/k;
    .locals 3

    iget-object v0, p0, Lwh/v0$a;->e:Lwh/a1$a;

    sget-object v1, Lwh/v0$a;->j:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lwh/a1$b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lii/k;

    return-object v0
.end method

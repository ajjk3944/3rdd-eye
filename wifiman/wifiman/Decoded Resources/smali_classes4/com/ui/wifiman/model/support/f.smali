.class public final Lcom/ui/wifiman/model/support/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/support/SupportManager;
.implements Lcom/ui/wifiman/model/support/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ldc/a;

.field private final c:Lcom/ui/wifiman/support/UiSupport;

.field private final d:Ljava/util/concurrent/ConcurrentHashMap;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ldc/a;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/ui/wifiman/model/support/f;->b:Ldc/a;

    new-instance p1, Lcom/ui/wifiman/support/UiSupport;

    invoke-direct {p1}, Lcom/ui/wifiman/support/UiSupport;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/f;->c:Lcom/ui/wifiman/support/UiSupport;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/ui/wifiman/model/support/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static final synthetic d(Lcom/ui/wifiman/model/support/f;Lcom/ui/wifiman/model/support/a$a;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->r(Lcom/ui/wifiman/model/support/a$a;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lcom/ui/wifiman/model/support/f;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/support/f;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/support/f;)Ldc/a;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/support/f;->b:Ldc/a;

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/support/f;)Ljava/util/concurrent/ConcurrentHashMap;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/support/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/support/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/support/f;->e:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic i(Lcom/ui/wifiman/model/support/f;)Lcom/ui/wifiman/support/UiSupport;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/support/f;->c:Lcom/ui/wifiman/support/UiSupport;

    return-object p0
.end method

.method private final j(Lcom/ui/wifiman/model/support/a$a$a;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/a$a$a;->b()Lmd/a;

    move-result-object p1

    invoke-virtual {p1}, Lmd/a;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "settings"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "APP SETTINGS"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final k(Lcom/ui/wifiman/model/support/a$a$b;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/a$a$b;->b()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, LZg/U;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lsh/m;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Led/a$a;

    invoke-virtual {v0}, Led/a$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Led/a$a;->b()Lh9/a;

    move-result-object v0

    invoke-virtual {v0}, Lh9/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object v0

    invoke-virtual {v0}, LYg/s;->h()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, LYg/s;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/support/UiSupport$b;

    const-string v0, "ARP NEIGHBORS"

    invoke-direct {p1, v0, v1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p1
.end method

.method private final l(Lcom/ui/wifiman/model/support/a$a$c;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/a$a$c;->b()Lld/a;

    move-result-object p1

    invoke-virtual {p1}, Lld/a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "id"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "SESSION"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final m(Lcom/ui/wifiman/model/support/a$a$d;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/a$a$d;->b()LZc/e;

    move-result-object p1

    invoke-virtual {p1}, LZc/e;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "state"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "NETWORK CONNECTION"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final n(Lcom/ui/wifiman/model/support/b;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/b;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v1, "available"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Unifi Api Available"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final o(Lcom/ui/wifiman/model/support/c;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/c;->b()Lce/b;

    move-result-object p1

    invoke-virtual {p1}, Lce/b;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "state"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Unifi Api Device Info"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final p(Lcom/ui/wifiman/model/support/d;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/d;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "neig"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Unifi Api Device Neighbors"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final q(Lcom/ui/wifiman/model/support/e;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/support/UiSupport$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/e;->b()Lbe/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lbe/c$b;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "params"

    invoke-static {v1, p1}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    invoke-static {p1}, LZg/U;->e(LYg/s;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "Unifi Api Params"

    invoke-direct {v0, v1, p1}, Lcom/ui/wifiman/support/UiSupport$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method private final r(Lcom/ui/wifiman/model/support/a$a;)Lcom/ui/wifiman/support/UiSupport$b;
    .locals 1

    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/wifiman/model/support/a$a$c;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->l(Lcom/ui/wifiman/model/support/a$a$c;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$d;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/support/a$a$d;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->m(Lcom/ui/wifiman/model/support/a$a$d;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$b;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/ui/wifiman/model/support/a$a$b;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->k(Lcom/ui/wifiman/model/support/a$a$b;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$a;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/ui/wifiman/model/support/a$a$a;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->j(Lcom/ui/wifiman/model/support/a$a$a;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lcom/ui/wifiman/model/support/b;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/ui/wifiman/model/support/b;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->n(Lcom/ui/wifiman/model/support/b;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lcom/ui/wifiman/model/support/e;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/ui/wifiman/model/support/e;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->q(Lcom/ui/wifiman/model/support/e;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lcom/ui/wifiman/model/support/c;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/ui/wifiman/model/support/c;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->o(Lcom/ui/wifiman/model/support/c;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    goto :goto_0

    :cond_6
    instance-of v0, p1, Lcom/ui/wifiman/model/support/d;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/ui/wifiman/model/support/d;

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/support/f;->p(Lcom/ui/wifiman/model/support/d;)Lcom/ui/wifiman/support/UiSupport$b;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/support/f$b;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/support/f$b;-><init>(Lcom/ui/wifiman/model/support/f;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ui/wifiman/model/support/f$c;->a:Lcom/ui/wifiman/model/support/f$c;

    invoke-virtual {v0, v1}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v0

    const-string v1, "onErrorResumeNext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lcom/ui/wifiman/model/support/a$a;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$a;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$d;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/b;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/e;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/c;

    if-nez v0, :cond_2

    instance-of v0, p1, Lcom/ui/wifiman/model/support/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/support/a$a$c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/ui/wifiman/model/support/a$a$c;

    invoke-virtual {v0}, Lcom/ui/wifiman/model/support/a$a$c;->b()Lld/a;

    move-result-object v0

    invoke-virtual {v0}, Lld/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ui/wifiman/model/support/f;->e:Ljava/lang/String;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/ui/wifiman/model/support/f;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/support/a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public c()Lgg/z;
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/support/f$a;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/support/f$a;-><init>(Lcom/ui/wifiman/model/support/f;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.class public final Lo7/l;
.super Lo7/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/l$b;
    }
.end annotation


# instance fields
.field private final b:Ljava/util/List;

.field private final c:Lgg/y;

.field private final d:Lmh/a;

.field private final e:Lgg/y$c;

.field private final f:LFg/b;

.field private final g:LFg/a;

.field private final h:LFg/b;

.field private final i:Lgg/i;

.field private final j:Lgg/i;

.field private final k:Lgg/i;


# direct methods
.method public constructor <init>(Ljava/util/List;Lgg/y;JLmh/a;)V
    .locals 0

    const-string/jumbo p3, "serverFactories"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "scheduler"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p3, "resultCacheFactory"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lo7/f;-><init>()V

    .line 5
    iput-object p1, p0, Lo7/l;->b:Ljava/util/List;

    .line 6
    iput-object p2, p0, Lo7/l;->c:Lgg/y;

    .line 7
    iput-object p5, p0, Lo7/l;->d:Lmh/a;

    .line 8
    invoke-virtual {p2}, Lgg/y;->c()Lgg/y$c;

    move-result-object p1

    const-string/jumbo p3, "scheduler.createWorker()"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->e:Lgg/y$c;

    .line 9
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo p3, "createDefault(false)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->f:LFg/b;

    .line 10
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    const-string/jumbo p3, "createDefault(listOf<Throwable>())"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->g:LFg/a;

    .line 11
    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p1

    invoke-virtual {p1}, LFg/b;->h2()LFg/b;

    move-result-object p1

    const-string/jumbo p3, "createDefault<Unit>(Unit).toSerialized()"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->h:LFg/b;

    .line 12
    new-instance p3, Lo7/l$f;

    invoke-direct {p3, p0}, Lo7/l$f;-><init>(Lo7/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    .line 13
    new-instance p3, Lo7/l$g;

    invoke-direct {p3, p0}, Lo7/l$g;-><init>(Lo7/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p1

    .line 14
    new-instance p3, Lo7/g;

    invoke-direct {p3, p0}, Lo7/g;-><init>(Lo7/l;)V

    invoke-virtual {p1, p3}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p1

    const/4 p3, 0x1

    .line 15
    invoke-virtual {p1, p3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    .line 17
    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "resetProcessor\n         \u2026  .subscribeOn(scheduler)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->i:Lgg/i;

    .line 18
    sget-object p2, Lo7/l$c;->a:Lo7/l$c;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p2

    const-string/jumbo p3, "discoveryStream.switchMa\u2026   it.devices()\n        }"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lo7/l;->j:Lgg/i;

    .line 19
    sget-object p2, Lo7/l$h;->a:Lo7/l$h;

    invoke-virtual {p1, p2}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "discoveryStream.switchMa\u2026it.lastDevice()\n        }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lo7/l;->k:Lgg/i;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lgg/y;JLmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 1
    invoke-static {}, Lo7/n;->a()Lgg/y;

    move-result-object p2

    const-string p7, "DISCOVERY_SCHEDULER"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-wide/16 p3, 0x12c

    :cond_1
    move-wide v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 2
    new-instance p5, Lo7/l$a;

    invoke-direct {p5, v3, v4, v2}, Lo7/l$a;-><init>(JLgg/y;)V

    :cond_2
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    .line 3
    invoke-direct/range {v0 .. v5}, Lo7/l;-><init>(Ljava/util/List;Lgg/y;JLmh/a;)V

    return-void
.end method

.method public static synthetic b(Lo7/l;)V
    .locals 0

    invoke-static {p0}, Lo7/l;->o(Lo7/l;)V

    return-void
.end method

.method public static synthetic c(Lo7/l;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/l;->m(Lo7/l;Lgg/A;)V

    return-void
.end method

.method public static synthetic d(Lo7/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/l;->s(Lo7/l;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic e(Lo7/l;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1}, Lo7/l;->q(Lo7/l;Lgg/A;)V

    return-void
.end method

.method public static synthetic f(Lo7/l;Z)V
    .locals 0

    invoke-static {p0, p1}, Lo7/l;->u(Lo7/l;Z)V

    return-void
.end method

.method public static final synthetic g(Lo7/l;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Lo7/l;->l()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lo7/l;Ljava/util/List;Lq7/c;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo7/l;->n(Ljava/util/List;Lq7/c;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lo7/l;)Lgg/z;
    .locals 0

    invoke-direct {p0}, Lo7/l;->p()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lo7/l;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/l;->r(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final synthetic k(Lo7/l;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lo7/l;->t(Z)V

    return-void
.end method

.method private final l()Lgg/z;
    .locals 2

    new-instance v0, Lo7/j;

    invoke-direct {v0, p0}, Lo7/j;-><init>(Lo7/l;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "create<List<ServerHolder\u2026}\n            )\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final m(Lo7/l;Lgg/A;)V
    .locals 4

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo7/l;->b:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/p;

    invoke-virtual {v1}, Lo7/p;->a()Lu7/b;

    move-result-object v2

    invoke-virtual {v1}, Lo7/p;->b()I

    move-result v1

    new-instance v3, Lo7/l$b;

    invoke-interface {v2}, Lu7/b;->b()Lu7/a;

    move-result-object v2

    invoke-direct {v3, v2, v1}, Lo7/l$b;-><init>(Lu7/a;I)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p1, v0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private final n(Ljava/util/List;Lq7/c;)Lgg/b;
    .locals 4

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo7/l$b;

    invoke-virtual {v1}, Lo7/l$b;->a()Lu7/a;

    move-result-object v2

    invoke-virtual {v2}, Lu7/a;->b()Lgg/i;

    move-result-object v2

    new-instance v3, Lo7/l$d;

    invoke-direct {v3, p2, v1}, Lo7/l$d;-><init>(Lq7/c;Lo7/l$b;)V

    invoke-virtual {v2, v3}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object v1

    new-instance v2, Lo7/l$e;

    invoke-direct {v2, p0}, Lo7/l$e;-><init>(Lo7/l;)V

    invoke-virtual {v1, v2}, Lgg/b;->z(Lkg/f;)Lgg/b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lgg/b;->H(Ljava/lang/Iterable;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "merge(\n            serve\u2026         }\n            })"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final o(Lo7/l;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo7/l;->t(Z)V

    return-void
.end method

.method private final p()Lgg/z;
    .locals 2

    new-instance v0, Lo7/h;

    invoke-direct {v0, p0}, Lo7/h;-><init>(Lo7/l;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string/jumbo v1, "create<DiscoveryResultTt\u2026CacheFactory())\n        }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final q(Lo7/l;Lgg/A;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo7/l;->d:Lmh/a;

    invoke-interface {p0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method private final r(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lo7/l;->e:Lgg/y$c;

    new-instance v1, Lo7/k;

    invoke-direct {v1, p0, p1}, Lo7/k;-><init>(Lo7/l;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method private static final s(Lo7/l;Ljava/lang/Throwable;)V
    .locals 2

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lo7/l;->g:LFg/a;

    invoke-virtual {v1}, LFg/a;->l2()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p0, Lo7/l;->g:LFg/a;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private final t(Z)V
    .locals 2

    iget-object v0, p0, Lo7/l;->e:Lgg/y$c;

    new-instance v1, Lo7/i;

    invoke-direct {v1, p0, p1}, Lo7/i;-><init>(Lo7/l;Z)V

    invoke-virtual {v0, v1}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method private static final u(Lo7/l;Z)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo7/l;->f:LFg/b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lo7/l;->k:Lgg/i;

    return-object v0
.end method

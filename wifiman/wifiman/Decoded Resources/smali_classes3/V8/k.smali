.class public final LV8/k;
.super LV8/e;
.source "SourceFile"


# instance fields
.field private final c:Lh9/a;

.field private final d:Ljava/util/UUID;

.field private final e:Ljava/util/UUID;

.field private final f:Ljava/util/UUID;

.field private final g:Ljava/util/UUID;

.field private final h:LV8/e$b;

.field private final i:LZ8/a$a;

.field private final j:Lgg/y;

.field private final k:Lgg/y;

.field private final l:Lgg/y;

.field private final m:LFg/a;

.field private final n:Lgg/i;

.field private final o:Lgg/b;


# direct methods
.method private constructor <init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
    .locals 1

    const-string/jumbo v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "hwAddress"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "readCharacteristic"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "writeCharacteristic"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, LV8/e;-><init>()V

    .line 3
    iput-object p2, p0, LV8/k;->c:Lh9/a;

    .line 4
    iput-object p3, p0, LV8/k;->d:Ljava/util/UUID;

    .line 5
    iput-object p4, p0, LV8/k;->e:Ljava/util/UUID;

    .line 6
    iput-object p5, p0, LV8/k;->f:Ljava/util/UUID;

    .line 7
    iput-object p6, p0, LV8/k;->g:Ljava/util/UUID;

    .line 8
    iput-object p7, p0, LV8/k;->h:LV8/e$b;

    .line 9
    new-instance p2, LV8/k$a;

    invoke-direct {p2, p0}, LV8/k$a;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 10
    new-instance p2, LV8/k$b;

    invoke-direct {p2, p0}, LV8/k$b;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 11
    new-instance p2, LV8/k$c;

    invoke-direct {p2, p0}, LV8/k$c;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 12
    new-instance p2, LV8/k$d;

    invoke-direct {p2, p0}, LV8/k$d;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 13
    new-instance p2, LV8/k$e;

    invoke-direct {p2, p0}, LV8/k$e;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 14
    new-instance p2, LV8/k$f;

    invoke-direct {p2, p0}, LV8/k$f;-><init>(LV8/k;)V

    invoke-static {p2}, LX8/a;->c(Lmh/a;)V

    .line 15
    invoke-virtual {p7}, LV8/e$b;->b()LZ8/a$a;

    move-result-object p2

    iput-object p2, p0, LV8/k;->i:LZ8/a$a;

    .line 16
    sget-object p2, Lcom/ui/btle/rxandroidble/a$a;->a:Lcom/ui/btle/rxandroidble/a$a;

    invoke-virtual {p2, p0}, Lcom/ui/btle/rxandroidble/a$a;->c(LT8/b;)Lgg/y;

    move-result-object p3

    iput-object p3, p0, LV8/k;->j:Lgg/y;

    .line 17
    invoke-virtual {p2, p0}, Lcom/ui/btle/rxandroidble/a$a;->b(LT8/b;)Lgg/y;

    move-result-object p3

    iput-object p3, p0, LV8/k;->k:Lgg/y;

    .line 18
    invoke-virtual {p2}, Lcom/ui/btle/rxandroidble/a$a;->a()Lgg/y;

    move-result-object p2

    iput-object p2, p0, LV8/k;->l:Lgg/y;

    .line 19
    sget-object p3, Lcom/ui/btle/v2/a$a$c;->a:Lcom/ui/btle/v2/a$a$c;

    invoke-static {p3}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object p3

    const-string/jumbo p4, "createDefault<BTLEv2Conn\u2026ction.State.Disconnected)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LV8/k;->m:LFg/a;

    .line 20
    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p3, p4}, Lgg/i;->X0(Lgg/y;)Lgg/i;

    move-result-object p3

    .line 21
    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    .line 22
    sget-object p4, LV8/k$n;->a:LV8/k$n;

    invoke-virtual {p3, p4}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p3

    .line 23
    sget-object p4, LV8/k$o;->a:LV8/k$o;

    invoke-virtual {p3, p4}, Lgg/i;->g0(Lkg/f;)Lgg/i;

    move-result-object p3

    new-instance p4, LV8/h;

    invoke-direct {p4}, LV8/h;-><init>()V

    .line 24
    invoke-virtual {p3, p4}, Lgg/i;->Z(Lkg/a;)Lgg/i;

    move-result-object p3

    const/4 p4, 0x1

    .line 25
    invoke-virtual {p3, p4}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p3

    .line 26
    invoke-virtual {p3}, Ljg/a;->i2()Lgg/i;

    move-result-object p3

    const-string/jumbo p4, "stateProcessor\n         \u2026)\n            .refCount()"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, LV8/k;->n:Lgg/i;

    .line 27
    new-instance p3, LV8/k$D;

    invoke-direct {p3, p1, p0}, LV8/k$D;-><init>(LG6/G;LV8/k;)V

    invoke-static {p3}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo p3, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    sget-object p3, LV8/k$g;->a:LV8/k$g;

    invoke-virtual {p1, p3}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object p1

    .line 29
    new-instance p3, LV8/k$h;

    invoke-direct {p3, p0}, LV8/k$h;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    .line 30
    new-instance p3, LV8/k$i;

    invoke-direct {p3, p0}, LV8/k$i;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/s;->G(Lkg/f;)Lgg/s;

    move-result-object p1

    .line 31
    new-instance p3, LV8/i;

    invoke-direct {p3, p0}, LV8/i;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/s;->y(Lkg/a;)Lgg/s;

    move-result-object p1

    .line 32
    new-instance p3, LV8/k$k;

    invoke-direct {p3, p0}, LV8/k$k;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/s;->F(Lkg/f;)Lgg/s;

    move-result-object p1

    .line 33
    new-instance p3, LV8/k$l;

    invoke-direct {p3, p0}, LV8/k$l;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/s;->Q0(Lkg/n;)Lgg/b;

    move-result-object p1

    .line 34
    new-instance p3, LV8/j;

    invoke-direct {p3, p0}, LV8/j;-><init>(LV8/k;)V

    invoke-virtual {p1, p3}, Lgg/b;->w(Lkg/a;)Lgg/b;

    move-result-object p1

    .line 35
    invoke-virtual {p1, p2}, Lgg/b;->W(Lgg/y;)Lgg/b;

    move-result-object p1

    .line 36
    sget-object p2, LV8/k$m;->a:LV8/k$m;

    invoke-virtual {p1, p2}, Lgg/b;->O(Lkg/n;)Lgg/b;

    move-result-object p1

    const-string/jumbo p2, "single { client.getBleDe\u2026          }\n            }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LV8/k;->o:Lgg/b;

    return-void
.end method

.method public synthetic constructor <init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V

    return-void
.end method

.method public static final synthetic A(LV8/k;LG6/N;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, LV8/k;->M(LG6/N;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(LV8/k;Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$a;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/btle/v2/b;->f(Lcom/ui/btle/v2/f$a;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(LV8/k;Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$b;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/btle/v2/b;->g(Lcom/ui/btle/v2/f$b;Lgg/y;Lgg/y;)Lcom/ui/btle/v2/d$b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(LV8/k;)Lgg/z;
    .locals 0

    invoke-virtual {p0}, Lcom/ui/btle/v2/b;->h()Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(LV8/k;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)Lcom/ui/btle/v2/i;
    .locals 0

    invoke-virtual/range {p0 .. p5}, Lcom/ui/btle/v2/b;->i(Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;LZ8/a;LT8/b$c;)Lcom/ui/btle/v2/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(LV8/k;LG6/N;)Lgg/b;
    .locals 0

    invoke-direct {p0, p1}, LV8/k;->N(LG6/N;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method private static final G(LV8/k;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LV8/k$j;

    invoke-direct {v0, p0}, LV8/k$j;-><init>(LV8/k;)V

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method private static final H(LV8/k;)V
    .locals 1

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LV8/k;->m:LFg/a;

    sget-object v0, Lcom/ui/btle/v2/a$a$c;->a:Lcom/ui/btle/v2/a$a$c;

    invoke-virtual {p0, v0}, LFg/a;->h(Ljava/lang/Object;)V

    return-void
.end method

.method private static final I()V
    .locals 1

    sget-object v0, LV8/k$p;->a:LV8/k$p;

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method private final K(LG6/N;)LT8/b$c;
    .locals 1

    new-instance v0, LV8/k$q;

    invoke-direct {v0, p1, p0}, LV8/k$q;-><init>(LG6/N;LV8/k;)V

    return-object v0
.end method

.method private final L(LG6/N;Lgg/b;)Lgg/z;
    .locals 2

    invoke-interface {p1}, LG6/N;->b()Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$r;

    invoke-direct {v1, p0}, LV8/k$r;-><init>(LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$s;

    invoke-direct {v1, p0}, LV8/k$s;-><init>(LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$t;

    invoke-direct {v1, p1, p2}, LV8/k$t;-><init>(LG6/N;Lgg/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, LV8/k$u;->a:LV8/k$u;

    invoke-virtual {p1, p2}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo p2, "private fun RxBleConnect\u2026Frame Reader CREATED\" } }"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final M(LG6/N;)Lgg/z;
    .locals 2

    invoke-interface {p1}, LG6/N;->b()Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$v;

    invoke-direct {v1, p0}, LV8/k$v;-><init>(LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$w;

    invoke-direct {v1, p0}, LV8/k$w;-><init>(LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$x;

    invoke-direct {v1, p1, p0}, LV8/k$x;-><init>(LG6/N;LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, LV8/k$y;->a:LV8/k$y;

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "private fun RxBleConnect\u2026Frame Writer CREATED\" } }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final N(LG6/N;)Lgg/b;
    .locals 6

    iget-object v0, p0, LV8/k;->h:LV8/e$b;

    invoke-virtual {v0}, LV8/e$b;->d()LV8/e$b$b;

    move-result-object v0

    instance-of v0, v0, LV8/e$b$b$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, LV8/k;->h:LV8/e$b;

    invoke-virtual {v0}, LV8/e$b;->d()LV8/e$b$b;

    move-result-object v0

    check-cast v0, LV8/e$b$b$a;

    invoke-virtual {v0}, LV8/e$b$b$a;->a()I

    move-result v0

    invoke-interface {p1, v0}, LG6/N;->e(I)Lgg/z;

    move-result-object v0

    new-instance v1, LV8/k$z;

    invoke-direct {v1, p0}, LV8/k$z;-><init>(LV8/k;)V

    invoke-virtual {v0, v1}, Lgg/z;->n(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, LV8/k$A;->a:LV8/k$A;

    invoke-virtual {v0, v1}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object v0

    invoke-virtual {v0}, Lgg/z;->y()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "private fun RxBleConnect\u2026\n            },\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LV8/k;->h:LV8/e$b;

    invoke-virtual {v2}, LV8/e$b;->a()LV8/e$b$a;

    move-result-object v2

    instance-of v2, v2, LV8/e$b$a$a;

    if-eqz v2, :cond_0

    iget-object v2, p0, LV8/k;->h:LV8/e$b;

    invoke-virtual {v2}, LV8/e$b;->a()LV8/e$b$a;

    move-result-object v2

    check-cast v2, LV8/e$b$a$a;

    invoke-virtual {v2}, LV8/e$b$a$a;->b()I

    move-result v2

    iget-object v3, p0, LV8/k;->h:LV8/e$b;

    invoke-virtual {v3}, LV8/e$b;->a()LV8/e$b$a;

    move-result-object v3

    check-cast v3, LV8/e$b$a$a;

    invoke-virtual {v3}, LV8/e$b$a$a;->a()J

    move-result-wide v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v2, v3, v4, v5}, LG6/N;->d(IJLjava/util/concurrent/TimeUnit;)Lgg/b;

    move-result-object p1

    sget-object v2, LV8/k$B;->a:LV8/k$B;

    invoke-virtual {p1, v2}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v2, LV8/g;

    invoke-direct {v2}, LV8/g;-><init>()V

    invoke-virtual {p1, v2}, Lgg/b;->x(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo v2, "requestConnectionPriorit\u2026ity Successfully set\" } }"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    new-array v2, v2, [Lgg/f;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object p1, v2, v0

    invoke-static {v2}, Lgg/b;->p([Lgg/f;)Lgg/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final O()V
    .locals 1

    sget-object v0, LV8/k$C;->a:LV8/k$C;

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    return-void
.end method

.method public static synthetic j()V
    .locals 0

    invoke-static {}, LV8/k;->O()V

    return-void
.end method

.method public static synthetic k(LV8/k;)V
    .locals 0

    invoke-static {p0}, LV8/k;->H(LV8/k;)V

    return-void
.end method

.method public static synthetic l()V
    .locals 0

    invoke-static {}, LV8/k;->I()V

    return-void
.end method

.method public static synthetic m(LV8/k;)V
    .locals 0

    invoke-static {p0}, LV8/k;->G(LV8/k;)V

    return-void
.end method

.method public static final synthetic n(LV8/k;LZ8/a$a;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;)Lgg/z;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/btle/v2/b;->c(LZ8/a$a;Lcom/ui/btle/v2/d$a;Lcom/ui/btle/v2/d$b;Lc9/a;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LV8/k;)Lh9/a;
    .locals 0

    iget-object p0, p0, LV8/k;->c:Lh9/a;

    return-object p0
.end method

.method public static final synthetic p(LV8/k;)LV8/e$b;
    .locals 0

    iget-object p0, p0, LV8/k;->h:LV8/e$b;

    return-object p0
.end method

.method public static final synthetic q(LV8/k;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, LV8/k;->e:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic r(LV8/k;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, LV8/k;->d:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic s(LV8/k;)Lgg/y;
    .locals 0

    iget-object p0, p0, LV8/k;->k:Lgg/y;

    return-object p0
.end method

.method public static final synthetic t(LV8/k;)Lgg/y;
    .locals 0

    iget-object p0, p0, LV8/k;->j:Lgg/y;

    return-object p0
.end method

.method public static final synthetic u(LV8/k;)Lgg/y;
    .locals 0

    iget-object p0, p0, LV8/k;->l:Lgg/y;

    return-object p0
.end method

.method public static final synthetic v(LV8/k;)LFg/a;
    .locals 0

    iget-object p0, p0, LV8/k;->m:LFg/a;

    return-object p0
.end method

.method public static final synthetic w(LV8/k;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, LV8/k;->g:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic x(LV8/k;)Ljava/util/UUID;
    .locals 0

    iget-object p0, p0, LV8/k;->f:Ljava/util/UUID;

    return-object p0
.end method

.method public static final synthetic y(LV8/k;LG6/N;)LT8/b$c;
    .locals 0

    invoke-direct {p0, p1}, LV8/k;->K(LG6/N;)LT8/b$c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(LV8/k;LG6/N;Lgg/b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1, p2}, LV8/k;->L(LG6/N;Lgg/b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public J()LZ8/a$a;
    .locals 1

    iget-object v0, p0, LV8/k;->i:LZ8/a$a;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, LV8/k;->n:Lgg/i;

    return-object v0
.end method

.method protected d()Lgg/b;
    .locals 1

    iget-object v0, p0, LV8/k;->o:Lgg/b;

    return-object v0
.end method

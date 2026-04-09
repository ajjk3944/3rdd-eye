.class public final Ltb/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ltb/N;

.field private b:I

.field private final c:Ltb/l;

.field private final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ltb/N;)V
    .locals 2

    const-string/jumbo v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/u;->a:Ltb/N;

    const/4 p1, 0x1

    iput p1, p0, Ltb/u;->b:I

    new-instance p1, Ltb/l;

    new-instance v0, Ltb/u$a;

    invoke-direct {v0, p0}, Ltb/u$a;-><init>(Ljava/lang/Object;)V

    const/16 v1, 0x32

    invoke-direct {p1, v1, v0}, Ltb/l;-><init>(ILmh/a;)V

    iput-object p1, p0, Ltb/u;->c:Ltb/l;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltb/u;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static synthetic a(Ltb/q;Ltb/u;)V
    .locals 0

    invoke-static {p0, p1}, Ltb/u;->o(Ltb/q;Ltb/u;)V

    return-void
.end method

.method public static synthetic b(Ltb/u;Lmh/l;Lgg/A;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ltb/u;->n(Ltb/u;Lmh/l;Lgg/A;)V

    return-void
.end method

.method public static synthetic c(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;Ltb/q;)Lgg/z;
    .locals 0

    invoke-static/range {p0 .. p5}, Ltb/u;->m(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;Ltb/q;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltb/u;)Ltb/q;
    .locals 0

    invoke-direct {p0}, Ltb/u;->f()Ltb/q;

    move-result-object p0

    return-object p0
.end method

.method private final f()Ltb/q;
    .locals 3

    iget v0, p0, Ltb/u;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ltb/u;->b:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "api:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ltb/q;

    iget-object v2, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {v2, v0}, Ltb/N;->P(Ljava/lang/String;)Ltb/f;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ltb/q;-><init>(Ltb/f;Ljava/lang/String;)V

    return-object v1
.end method

.method private final i(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Ltb/i;
    .locals 10

    iget-object v0, p0, Ltb/u;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    sget-object v1, Lkb/a;->a:Lkb/a;

    sget-object v2, Leb/g$c;->a:Leb/g$c$a;

    iget-object v3, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {v3}, Ltb/N;->a0()Llb/c;

    move-result-object v3

    invoke-virtual {v2, p4, v3}, Leb/g$c$a;->a(Ljava/util/Map;Llb/c;)Ljava/util/Map;

    move-result-object v6

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move v2, v0

    move-object v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-static/range {v1 .. v9}, Lkb/a;->b(Lkb/a;ILkb/o;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZILjava/lang/Object;)Lkb/j;

    move-result-object p1

    new-instance p2, Ltb/i;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ltb/i;-><init>(Ljava/lang/String;Lkb/j;)V

    return-object p2
.end method

.method private final j(Ltb/q;)V
    .locals 4

    sget-object v0, LSj/a;->a:LSj/a$b;

    invoke-virtual {p1}, Ltb/q;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "release requester: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ltb/q;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltb/u;->c:Ltb/l;

    invoke-virtual {v0, p1}, Ltb/l;->f(Ltb/q;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ltb/u;->c:Ltb/l;

    invoke-virtual {v0, p1}, Ltb/l;->d(Ltb/q;)V

    iget-object v0, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {p1}, Ltb/q;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ltb/N;->r0(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method private final l(Lmh/l;)Lgg/z;
    .locals 1

    new-instance v0, Ltb/s;

    invoke-direct {v0, p0, p1}, Ltb/s;-><init>(Ltb/u;Lmh/l;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v0

    invoke-virtual {p1, v0}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "subscribeOn(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final m(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;Ltb/q;)Lgg/z;
    .locals 2

    const-string/jumbo v0, "requester"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ltb/q;->o(Ljava/lang/String;)V

    invoke-direct {p2, p1, p0, p3, p4}, Ltb/u;->i(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Ltb/i;

    move-result-object p0

    invoke-virtual {p5, p0}, Ltb/q;->m(Ltb/i;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Ltb/u;Lmh/l;Lgg/A;)V
    .locals 6

    const-string/jumbo v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string/jumbo v3, "request start"

    invoke-virtual {v0, v3, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, Ltb/u;->c:Ltb/l;

    invoke-virtual {v0}, Ltb/l;->e()Ltb/q;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v2, LSj/a;->a:LSj/a$b;

    const-string v3, "Couldn\'t retrieve requester"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3, v4}, LSj/a$b;->p(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    sget-object v2, LSj/a;->a:LSj/a$b;

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    move v3, v1

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "request requester available: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v1}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    :try_start_1
    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lgg/z;

    invoke-virtual {p1}, Lgg/z;->d()Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v1, "blockingGet(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lkb/p;

    invoke-interface {p2, p1}, Lgg/A;->onSuccess(Ljava/lang/Object;)V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p1

    invoke-interface {p2, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/Exception;

    const-string/jumbo v1, "Requester not available"

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lgg/A;->c(Ljava/lang/Throwable;)Z

    :goto_2
    new-instance p1, Ltb/t;

    invoke-direct {p1, v0, p0}, Ltb/t;-><init>(Ltb/q;Ltb/u;)V

    invoke-interface {p2, p1}, Lgg/A;->d(Lkg/e;)V

    return-void
.end method

.method private static final o(Ltb/q;Ltb/u;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-direct {p1, p0}, Ltb/u;->j(Ltb/q;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final e()Lgg/s;
    .locals 1

    iget-object v0, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {v0}, Ltb/N;->J()Lgg/s;

    move-result-object v0

    return-object v0
.end method

.method public final g(Ljava/lang/String;)Lgg/z;
    .locals 3

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSj/a;->a:LSj/a$b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Creating WS data channel "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, LSj/a$b;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lsb/g;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "ws:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object v0, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {v0, p1}, Ltb/N;->P(Ljava/lang/String;)Ltb/f;

    move-result-object p1

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Ltb/u;->a:Ltb/N;

    invoke-virtual {v0}, Ltb/N;->e0()Z

    move-result v0

    return v0
.end method

.method public final k(Ljava/lang/String;Lkb/o;Ljava/lang/String;Ljava/util/Map;)Lgg/z;
    .locals 7

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltb/r;

    move-object v1, v0

    move-object v2, p2

    move-object v3, p1

    move-object v4, p0

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Ltb/r;-><init>(Lkb/o;Ljava/lang/String;Ltb/u;Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p0, v0}, Ltb/u;->l(Lmh/l;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

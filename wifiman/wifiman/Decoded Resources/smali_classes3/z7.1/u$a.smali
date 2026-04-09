.class final Lz7/u$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz7/u;-><init>(Ljava/net/DatagramSocket;Lp7/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz7/u;


# direct methods
.method constructor <init>(Lz7/u;)V
    .locals 0

    iput-object p1, p0, Lz7/u$a;->a:Lz7/u;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lgg/y;Lz7/u;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz7/u$a;->l(Lgg/y;Lz7/u;Lgg/j;)V

    return-void
.end method

.method public static synthetic c(Lgg/y$c;Lz7/u;Lgg/j;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lz7/u$a;->o(Lgg/y$c;Lz7/u;Lgg/j;)V

    return-void
.end method

.method public static synthetic h(Lgg/y$c;)V
    .locals 0

    invoke-static {p0}, Lz7/u$a;->n(Lgg/y$c;)V

    return-void
.end method

.method private static final l(Lgg/y;Lz7/u;Lgg/j;)V
    .locals 1

    const-string v0, "$scheduler"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz7/u$a$a;->a:Lz7/u$a$a;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    invoke-virtual {p0}, Lgg/y;->c()Lgg/y$c;

    move-result-object p0

    const-string/jumbo v0, "scheduler.createWorker()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz7/s;

    invoke-direct {v0, p0}, Lz7/s;-><init>(Lgg/y$c;)V

    invoke-interface {p2, v0}, Lgg/j;->d(Lkg/e;)V

    sget-object v0, Lz7/u$a$b;->a:Lz7/u$a$b;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    new-instance v0, Lz7/t;

    invoke-direct {v0, p0, p1, p2}, Lz7/t;-><init>(Lgg/y$c;Lz7/u;Lgg/j;)V

    invoke-virtual {p0, v0}, Lgg/y$c;->b(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method private static final n(Lgg/y$c;)V
    .locals 1

    const-string v0, "$worker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lhg/c;->dispose()V

    return-void
.end method

.method private static final o(Lgg/y$c;Lz7/u;Lgg/j;)V
    .locals 3

    const-string v0, "$worker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz7/u$a$c;->a:Lz7/u$a$c;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    :goto_0
    :try_start_0
    invoke-interface {p0}, Lhg/c;->isDisposed()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x800

    new-array v1, v0, [B

    new-instance v2, Ljava/net/DatagramPacket;

    invoke-direct {v2, v1, v0}, Ljava/net/DatagramPacket;-><init>([BI)V

    invoke-static {p1}, Lz7/u;->c(Lz7/u;)Ljava/net/DatagramSocket;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    invoke-interface {p2, v2}, Lgg/h;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object p0, Lz7/u$a$d;->a:Lz7/u$a$d;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v0}, Lx7/a;->e(Lmh/a;Ljava/lang/Throwable;ILjava/lang/Object;)V

    invoke-interface {p2}, Lgg/h;->a()V

    :cond_0
    sget-object p0, Lz7/u$a$e;->a:Lz7/u$a$e;

    invoke-static {p0}, Lx7/a;->c(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz7/u$a;->j()Lgg/i;

    move-result-object v0

    return-object v0
.end method

.method public final j()Lgg/i;
    .locals 3

    iget-object v0, p0, Lz7/u$a;->a:Lz7/u;

    invoke-static {v0}, Lz7/u;->b(Lz7/u;)Lp7/b;

    move-result-object v0

    invoke-interface {v0}, Lp7/b;->a()Lgg/y;

    move-result-object v0

    iget-object v1, p0, Lz7/u$a;->a:Lz7/u;

    new-instance v2, Lz7/r;

    invoke-direct {v2, v0, v1}, Lz7/r;-><init>(Lgg/y;Lz7/u;)V

    sget-object v0, Lgg/a;->DROP:Lgg/a;

    invoke-static {v2, v0}, Lgg/i;->N(Lgg/k;Lgg/a;)Lgg/i;

    move-result-object v0

    sget-object v1, Lz7/u$a$f;->a:Lz7/u$a$f;

    invoke-virtual {v0, v1}, Lgg/i;->d1(Lkg/f;)Lgg/i;

    move-result-object v0

    const-string/jumbo v1, "create<DatagramPacket>({\u2026g packet\" }\n            }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

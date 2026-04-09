.class public final Lz7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhg/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz7/w$a;
    }
.end annotation


# static fields
.field public static final e:Lz7/w$a;


# instance fields
.field private final a:Lgg/y;

.field private b:Lgg/y$c;

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final d:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz7/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz7/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz7/w;->e:Lz7/w$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lgg/y;)V
    .locals 1

    const-string/jumbo v0, "packets"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "scheduler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz7/w;->a:Lgg/y;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lz7/w;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Lz7/w$b;

    invoke-direct {p2, p1}, Lz7/w$b;-><init>(Ljava/util/List;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lz7/w;->d:LYg/m;

    return-void
.end method

.method public static synthetic a(Lz7/w;Ljava/net/DatagramSocket;)V
    .locals 0

    invoke-static {p0, p1}, Lz7/w;->d(Lz7/w;Ljava/net/DatagramSocket;)V

    return-void
.end method

.method private final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lz7/w;->d:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final d(Lz7/w;Ljava/net/DatagramSocket;)V
    .locals 3

    const-string/jumbo v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz7/w$e;->a:Lz7/w$e;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    invoke-direct {p0}, Lz7/w;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/DatagramPacket;

    invoke-virtual {p1}, Ljava/net/DatagramSocket;->isClosed()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lz7/w;->e()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    sget-object v2, Lz7/w$f;->a:Lz7/w$f;

    invoke-static {v2, v1}, Lx7/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final c(Ljava/net/DatagramSocket;)V
    .locals 8

    const-string/jumbo v0, "socket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz7/w;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lz7/w$d;->a:Lz7/w$d;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    iget-object v0, p0, Lz7/w;->a:Lgg/y;

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v1

    const-string/jumbo v0, "scheduler.createWorker()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lz7/w;->b:Lgg/y$c;

    new-instance v2, Lz7/v;

    invoke-direct {v2, p0, p1}, Lz7/v;-><init>(Lz7/w;Ljava/net/DatagramSocket;)V

    const-wide/16 v5, 0x3e8

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x0

    invoke-virtual/range {v1 .. v7}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    iget-object p1, p0, Lz7/w;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p1, Lz7/w$g;->a:Lz7/w$g;

    invoke-static {p1}, Lx7/a;->c(Lmh/a;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    sget-object v0, Lz7/w$c;->a:Lz7/w$c;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    invoke-virtual {p0}, Lz7/w;->e()V

    return-void
.end method

.method public final e()V
    .locals 2

    sget-object v0, Lz7/w$h;->a:Lz7/w$h;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    iget-object v0, p0, Lz7/w;->b:Lgg/y$c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lhg/c;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lz7/w;->b:Lgg/y$c;

    iget-object v0, p0, Lz7/w;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lz7/w$i;->a:Lz7/w$i;

    invoke-static {v0}, Lx7/a;->c(Lmh/a;)V

    return-void
.end method

.method public isDisposed()Z
    .locals 1

    iget-object v0, p0, Lz7/w;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

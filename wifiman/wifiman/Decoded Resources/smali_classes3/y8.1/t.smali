.class public abstract Ly8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/r;


# instance fields
.field private final a:Lgg/i;

.field private final b:Ljava/util/LinkedList;

.field private final c:LFg/a;

.field private final d:Lgg/b;

.field private final e:Lgg/i;

.field private final f:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LZc/c;Lad/d;)V
    .locals 4

    const-string/jumbo v0, "internetLatencyService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dnsLatencyService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, LZc/c;->a()Lgg/i;

    move-result-object v0

    iput-object v0, p0, Ly8/t;->a:Lgg/i;

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ly8/t;->b:Ljava/util/LinkedList;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LFg/a;->k2(Ljava/lang/Object;)LFg/a;

    move-result-object v0

    const-string/jumbo v1, "createDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly8/t;->c:LFg/a;

    invoke-interface {p1}, LZc/c;->a()Lgg/i;

    move-result-object p1

    new-instance v1, Ly8/t$b;

    invoke-direct {v1, p0}, Ly8/t$b;-><init>(Ly8/t;)V

    invoke-virtual {p1, v1}, Lgg/i;->t0(Lkg/n;)Lgg/b;

    move-result-object p1

    new-instance v1, Ly8/t$c;

    invoke-direct {v1, p0}, Ly8/t$c;-><init>(Ly8/t;)V

    invoke-virtual {p1, v1}, Lgg/b;->B(Lkg/f;)Lgg/b;

    move-result-object p1

    new-instance v1, Ly8/s;

    invoke-direct {v1, p0}, Ly8/s;-><init>(Ly8/t;)V

    invoke-virtual {p1, v1}, Lgg/b;->C(Lkg/a;)Lgg/b;

    move-result-object p1

    const-string/jumbo v1, "doOnTerminate(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/t;->d:Lgg/b;

    invoke-virtual {v0}, Lgg/i;->e1()Lgg/i;

    move-result-object v0

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object v0

    new-instance v1, Ly8/t$a;

    invoke-direct {v1, p0}, Ly8/t$a;-><init>(Ly8/t;)V

    invoke-virtual {v0, v1}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/i;->U0(Lgg/f;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v3}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "refCount(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly8/t;->e:Lgg/i;

    invoke-interface {p2}, Lad/d;->a()Lgg/i;

    move-result-object p1

    iput-object p1, p0, Ly8/t;->f:Lgg/i;

    return-void
.end method

.method public static synthetic f(Ly8/t;)V
    .locals 0

    invoke-static {p0}, Ly8/t;->i(Ly8/t;)V

    return-void
.end method

.method public static final synthetic g(Ly8/t;)Ljava/util/LinkedList;
    .locals 0

    iget-object p0, p0, Ly8/t;->b:Ljava/util/LinkedList;

    return-object p0
.end method

.method public static final synthetic h(Ly8/t;)LFg/a;
    .locals 0

    iget-object p0, p0, Ly8/t;->c:LFg/a;

    return-object p0
.end method

.method private static final i(Ly8/t;)V
    .locals 5

    iget-object v0, p0, Ly8/t;->b:Ljava/util/LinkedList;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Ly8/t;->b:Ljava/util/LinkedList;

    new-instance v1, LWc/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, LWc/c;-><init>(JLjava/lang/Object;)V

    invoke-virtual {p0, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    sget-object p0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/t;->e:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/t;->a:Lgg/i;

    return-object v0
.end method

.method public e()Lgg/i;
    .locals 1

    iget-object v0, p0, Ly8/t;->f:Lgg/i;

    return-object v0
.end method

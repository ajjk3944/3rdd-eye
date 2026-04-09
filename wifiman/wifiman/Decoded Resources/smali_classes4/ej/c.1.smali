.class public Lej/c;
.super Lej/E;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej/c$a;,
        Lej/c$b;
    }
.end annotation


# static fields
.field private static final j:Lej/c$a;

.field private static final k:Ljava/util/concurrent/locks/ReentrantLock;

.field private static final l:Ljava/util/concurrent/locks/Condition;

.field private static final m:J

.field private static final n:J

.field private static o:Lej/c;


# instance fields
.field private g:I

.field private h:Lej/c;

.field private i:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lej/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lej/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lej/c;->j:Lej/c$a;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lej/c;->k:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lej/c;->l:Ljava/util/concurrent/locks/Condition;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3c

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lej/c;->m:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lej/c;->n:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lej/E;-><init>()V

    return-void
.end method

.method private final A(J)J
    .locals 2

    iget-wide v0, p0, Lej/c;->i:J

    sub-long/2addr v0, p1

    return-wide v0
.end method

.method public static final synthetic k()Lej/c$a;
    .locals 1

    sget-object v0, Lej/c;->j:Lej/c$a;

    return-object v0
.end method

.method public static final synthetic l()Ljava/util/concurrent/locks/Condition;
    .locals 1

    sget-object v0, Lej/c;->l:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method public static final synthetic m()Lej/c;
    .locals 1

    sget-object v0, Lej/c;->o:Lej/c;

    return-object v0
.end method

.method public static final synthetic n()J
    .locals 2

    sget-wide v0, Lej/c;->m:J

    return-wide v0
.end method

.method public static final synthetic o()J
    .locals 2

    sget-wide v0, Lej/c;->n:J

    return-wide v0
.end method

.method public static final synthetic p()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    sget-object v0, Lej/c;->k:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public static final synthetic q(Lej/c;)Lej/c;
    .locals 0

    iget-object p0, p0, Lej/c;->h:Lej/c;

    return-object p0
.end method

.method public static final synthetic s(Lej/c;J)J
    .locals 0

    invoke-direct {p0, p1, p2}, Lej/c;->A(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic t(Lej/c;)V
    .locals 0

    sput-object p0, Lej/c;->o:Lej/c;

    return-void
.end method

.method public static final synthetic u(Lej/c;Lej/c;)V
    .locals 0

    iput-object p1, p0, Lej/c;->h:Lej/c;

    return-void
.end method

.method public static final synthetic v(Lej/c;I)V
    .locals 0

    iput p1, p0, Lej/c;->g:I

    return-void
.end method

.method public static final synthetic w(Lej/c;J)V
    .locals 0

    iput-wide p1, p0, Lej/c;->i:J

    return-void
.end method


# virtual methods
.method public final B(Lej/B;)Lej/B;
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej/c$c;

    invoke-direct {v0, p0, p1}, Lej/c$c;-><init>(Lej/c;Lej/B;)V

    return-object v0
.end method

.method public final C(Lej/D;)Lej/D;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lej/c$d;

    invoke-direct {v0, p0, p1}, Lej/c$d;-><init>(Lej/c;Lej/D;)V

    return-object v0
.end method

.method protected D()V
    .locals 0

    return-void
.end method

.method public final r(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 0

    invoke-virtual {p0, p1}, Lej/c;->z(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final x()V
    .locals 5

    invoke-virtual {p0}, Lej/E;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Lej/E;->f()Z

    move-result v2

    const-wide/16 v3, 0x0

    cmp-long v3, v0, v3

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    return-void

    :cond_0
    sget-object v3, Lej/c;->k:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v4, p0, Lej/c;->g:I

    if-nez v4, :cond_1

    const/4 v4, 0x1

    iput v4, p0, Lej/c;->g:I

    sget-object v4, Lej/c;->j:Lej/c$a;

    invoke-static {v4, p0, v0, v1, v2}, Lej/c$a;->a(Lej/c$a;Lej/c;JZ)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_1
    const-string v0, "Unbalanced enter/exit"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method

.method public final y()Z
    .locals 5

    sget-object v0, Lej/c;->k:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget v1, p0, Lej/c;->g:I

    const/4 v2, 0x0

    iput v2, p0, Lej/c;->g:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    sget-object v1, Lej/c;->j:Lej/c$a;

    invoke-static {v1, p0}, Lej/c$a;->b(Lej/c$a;Lej/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    move v2, v3

    :cond_1
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return v2

    :goto_0
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method

.method protected z(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

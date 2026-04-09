.class public final Lej/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:Lej/e;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Lej/B;

.field private final g:Ljava/util/concurrent/locks/ReentrantLock;

.field private final h:Ljava/util/concurrent/locks/Condition;

.field private final i:Lej/B;

.field private final j:Lej/D;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lej/v;->a:J

    new-instance v0, Lej/e;

    invoke-direct {v0}, Lej/e;-><init>()V

    iput-object v0, p0, Lej/v;->b:Lej/e;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lej/v;->g:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    const-string v1, "newCondition(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lej/v;->h:Ljava/util/concurrent/locks/Condition;

    const-wide/16 v0, 0x1

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance p1, Lej/v$a;

    invoke-direct {p1, p0}, Lej/v$a;-><init>(Lej/v;)V

    iput-object p1, p0, Lej/v;->i:Lej/B;

    new-instance p1, Lej/v$b;

    invoke-direct {p1, p0}, Lej/v$b;-><init>(Lej/v;)V

    iput-object p1, p0, Lej/v;->j:Lej/D;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "maxBufferSize < 1: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a()Lej/e;
    .locals 1

    iget-object v0, p0, Lej/v;->b:Lej/e;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lej/v;->c:Z

    return v0
.end method

.method public final c()Ljava/util/concurrent/locks/Condition;
    .locals 1

    iget-object v0, p0, Lej/v;->h:Ljava/util/concurrent/locks/Condition;

    return-object v0
.end method

.method public final d()Lej/B;
    .locals 1

    iget-object v0, p0, Lej/v;->f:Lej/B;

    return-object v0
.end method

.method public final e()Ljava/util/concurrent/locks/ReentrantLock;
    .locals 1

    iget-object v0, p0, Lej/v;->g:Ljava/util/concurrent/locks/ReentrantLock;

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lej/v;->a:J

    return-wide v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lej/v;->d:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lej/v;->e:Z

    return v0
.end method

.method public final i(Z)V
    .locals 0

    iput-boolean p1, p0, Lej/v;->d:Z

    return-void
.end method

.method public final j(Z)V
    .locals 0

    iput-boolean p1, p0, Lej/v;->e:Z

    return-void
.end method

.method public final k()Lej/B;
    .locals 1

    iget-object v0, p0, Lej/v;->i:Lej/B;

    return-object v0
.end method

.method public final l()Lej/D;
    .locals 1

    iget-object v0, p0, Lej/v;->j:Lej/D;

    return-object v0
.end method

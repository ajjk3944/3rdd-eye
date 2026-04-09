.class final Lqg/d$a;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements LDj/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:LDj/b;

.field final b:Lqg/d;

.field final c:Ljava/util/concurrent/atomic/AtomicLong;

.field d:Lqg/d$b;

.field e:I

.field f:J


# direct methods
.method constructor <init>(LDj/b;Lqg/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lqg/d$a;->a:LDj/b;

    iput-object p2, p0, Lqg/d$a;->b:Lqg/d;

    iget-object p1, p2, Lqg/d;->g:Lqg/d$b;

    iput-object p1, p0, Lqg/d$a;->d:Lqg/d$b;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lqg/d$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 5

    iget-object v0, p0, Lqg/d$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/d$a;->b:Lqg/d;

    invoke-virtual {v0, p0}, Lqg/d;->i2(Lqg/d$a;)V

    :cond_0
    return-void
.end method

.method public request(J)V
    .locals 1

    invoke-static {p1, p2}, Lyg/g;->validate(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqg/d$a;->c:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lzg/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Lqg/d$a;->b:Lqg/d;

    invoke-virtual {p1, p0}, Lqg/d;->j2(Lqg/d$a;)V

    :cond_0
    return-void
.end method

.class LO6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# static fields
.field private static final d:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private final a:J

.field final b:LM6/j;

.field final c:Lgg/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, LO6/g;->d:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method constructor <init>(LM6/j;Lgg/t;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LO6/g;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, LO6/g;->a:J

    iput-object p1, p0, LO6/g;->b:LM6/j;

    iput-object p2, p0, LO6/g;->c:Lgg/t;

    return-void
.end method


# virtual methods
.method public a(LO6/g;)I
    .locals 4

    iget-object v0, p0, LO6/g;->b:LM6/j;

    iget-object v1, p1, LO6/g;->b:LM6/j;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p1, LO6/g;->b:LM6/j;

    iget-object v2, p0, LO6/g;->b:LM6/j;

    if-eq v1, v2, :cond_1

    iget-wide v0, p0, LO6/g;->a:J

    iget-wide v2, p1, LO6/g;->a:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, -0x1

    :goto_0
    move v0, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return v0
.end method

.method public b(LO6/j;Lgg/y;)V
    .locals 1

    iget-object v0, p0, LO6/g;->c:Lgg/t;

    invoke-interface {v0}, Lgg/t;->isDisposed()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, LO6/g;->b:LM6/j;

    invoke-static {p2}, LL6/b;->s(LM6/j;)V

    invoke-virtual {p1}, LO6/j;->release()V

    return-void

    :cond_0
    new-instance v0, LO6/g$a;

    invoke-direct {v0, p0, p1, p2}, LO6/g$a;-><init>(LO6/g;LO6/j;Lgg/y;)V

    invoke-virtual {p2, v0}, Lgg/y;->e(Ljava/lang/Runnable;)Lhg/c;

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LO6/g;

    invoke-virtual {p0, p1}, LO6/g;->a(LO6/g;)I

    move-result p1

    return p1
.end method

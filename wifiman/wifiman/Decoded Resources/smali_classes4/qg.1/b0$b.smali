.class final Lqg/b0$b;
.super Lqg/b0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final d:LDg/a;


# direct methods
.method constructor <init>(LDg/a;II)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lqg/b0$a;-><init>(II)V

    iput-object p1, p0, Lqg/b0$b;->d:LDg/a;

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    iget v0, p0, Lqg/b0$a;->a:I

    iget-object v1, p0, Lqg/b0$b;->d:LDg/a;

    iget v2, p0, Lqg/b0$a;->b:I

    :goto_0
    if-eq v2, v0, :cond_1

    iget-boolean v3, p0, Lqg/b0$a;->c:Z

    if-eqz v3, :cond_0

    return-void

    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, LDg/a;->m(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lqg/b0$a;->c:Z

    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v1}, LDj/b;->a()V

    return-void
.end method

.method d(J)V
    .locals 9

    iget v0, p0, Lqg/b0$a;->a:I

    iget v1, p0, Lqg/b0$a;->b:I

    iget-object v2, p0, Lqg/b0$b;->d:LDg/a;

    const-wide/16 v3, 0x0

    :cond_0
    move-wide v5, v3

    :cond_1
    :goto_0
    cmp-long v7, v5, p1

    if-eqz v7, :cond_4

    if-eq v1, v0, :cond_4

    iget-boolean v7, p0, Lqg/b0$a;->c:Z

    if-eqz v7, :cond_2

    return-void

    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, LDg/a;->m(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-wide/16 v7, 0x1

    add-long/2addr v5, v7

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-ne v1, v0, :cond_6

    iget-boolean p1, p0, Lqg/b0$a;->c:Z

    if-nez p1, :cond_5

    invoke-interface {v2}, LDj/b;->a()V

    :cond_5
    return-void

    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p1

    cmp-long v7, v5, p1

    if-nez v7, :cond_1

    iput v1, p0, Lqg/b0$a;->b:I

    neg-long p1, v5

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    cmp-long v5, p1, v3

    if-nez v5, :cond_0

    return-void
.end method

.class public final Lqg/L;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/L$a;
    }
.end annotation


# instance fields
.field final b:Lgg/y;

.field final c:J

.field final d:J

.field final e:J

.field final f:J

.field final g:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJJJLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-wide p5, p0, Lqg/L;->e:J

    iput-wide p7, p0, Lqg/L;->f:J

    iput-object p9, p0, Lqg/L;->g:Ljava/util/concurrent/TimeUnit;

    iput-object p10, p0, Lqg/L;->b:Lgg/y;

    iput-wide p1, p0, Lqg/L;->c:J

    iput-wide p3, p0, Lqg/L;->d:J

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 8

    new-instance v7, Lqg/L$a;

    iget-wide v2, p0, Lqg/L;->c:J

    iget-wide v4, p0, Lqg/L;->d:J

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lqg/L$a;-><init>(LDj/b;JJ)V

    invoke-interface {p1, v7}, LDj/b;->j(LDj/c;)V

    iget-object v0, p0, Lqg/L;->b:Lgg/y;

    instance-of p1, v0, Lwg/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Lqg/L$a;->a(Lhg/c;)V

    iget-wide v2, p0, Lqg/L;->e:J

    iget-wide v4, p0, Lqg/L;->f:J

    iget-object v6, p0, Lqg/L;->g:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lqg/L;->e:J

    iget-wide v4, p0, Lqg/L;->f:J

    iget-object v6, p0, Lqg/L;->g:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Lqg/L$a;->a(Lhg/c;)V

    :goto_0
    return-void
.end method

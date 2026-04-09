.class public final Lqg/K;
.super Lgg/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/K$a;
    }
.end annotation


# instance fields
.field final b:Lgg/y;

.field final c:J

.field final d:J

.field final e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/i;-><init>()V

    iput-wide p1, p0, Lqg/K;->c:J

    iput-wide p3, p0, Lqg/K;->d:J

    iput-object p5, p0, Lqg/K;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Lqg/K;->b:Lgg/y;

    return-void
.end method


# virtual methods
.method public E1(LDj/b;)V
    .locals 8

    new-instance v7, Lqg/K$a;

    invoke-direct {v7, p1}, Lqg/K$a;-><init>(LDj/b;)V

    invoke-interface {p1, v7}, LDj/b;->j(LDj/c;)V

    iget-object v0, p0, Lqg/K;->b:Lgg/y;

    instance-of p1, v0, Lwg/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Lqg/K$a;->a(Lhg/c;)V

    iget-wide v2, p0, Lqg/K;->c:J

    iget-wide v4, p0, Lqg/K;->d:J

    iget-object v6, p0, Lqg/K;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lqg/K;->c:J

    iget-wide v4, p0, Lqg/K;->d:J

    iget-object v6, p0, Lqg/K;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Lqg/K$a;->a(Lhg/c;)V

    :goto_0
    return-void
.end method

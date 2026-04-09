.class public final Ltg/K;
.super Lgg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/K$a;
    }
.end annotation


# instance fields
.field final a:Lgg/y;

.field final b:J

.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public constructor <init>(JJLjava/util/concurrent/TimeUnit;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-wide p1, p0, Ltg/K;->b:J

    iput-wide p3, p0, Ltg/K;->c:J

    iput-object p5, p0, Ltg/K;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p6, p0, Ltg/K;->a:Lgg/y;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    new-instance v7, Ltg/K$a;

    invoke-direct {v7, p1}, Ltg/K$a;-><init>(Lgg/x;)V

    invoke-interface {p1, v7}, Lgg/x;->c(Lhg/c;)V

    iget-object v0, p0, Ltg/K;->a:Lgg/y;

    instance-of p1, v0, Lwg/p;

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v0

    invoke-virtual {v7, v0}, Ltg/K$a;->a(Lhg/c;)V

    iget-wide v2, p0, Ltg/K;->b:J

    iget-wide v4, p0, Ltg/K;->c:J

    iget-object v6, p0, Ltg/K;->d:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y$c;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Ltg/K;->b:J

    iget-wide v4, p0, Ltg/K;->c:J

    iget-object v6, p0, Ltg/K;->d:Ljava/util/concurrent/TimeUnit;

    move-object v1, v7

    invoke-virtual/range {v0 .. v6}, Lgg/y;->g(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Lhg/c;

    move-result-object p1

    invoke-virtual {v7, p1}, Ltg/K$a;->a(Lhg/c;)V

    :goto_0
    return-void
.end method

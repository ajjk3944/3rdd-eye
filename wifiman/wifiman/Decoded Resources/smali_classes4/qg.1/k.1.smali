.class public final Lqg/k;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/k$a;
    }
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;

.field final e:Lgg/y;

.field final f:Z


# direct methods
.method public constructor <init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/k;->c:J

    iput-object p4, p0, Lqg/k;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/k;->e:Lgg/y;

    iput-boolean p6, p0, Lqg/k;->f:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 8

    iget-boolean v0, p0, Lqg/k;->f:Z

    if-eqz v0, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    new-instance v0, LIg/a;

    invoke-direct {v0, p1}, LIg/a;-><init>(LDj/b;)V

    move-object v2, v0

    :goto_0
    iget-object p1, p0, Lqg/k;->e:Lgg/y;

    invoke-virtual {p1}, Lgg/y;->c()Lgg/y$c;

    move-result-object v6

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    new-instance v0, Lqg/k$a;

    iget-wide v3, p0, Lqg/k;->c:J

    iget-object v5, p0, Lqg/k;->d:Ljava/util/concurrent/TimeUnit;

    iget-boolean v7, p0, Lqg/k;->f:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lqg/k$a;-><init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Z)V

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

.class public final Lqg/y0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/y0$d;,
        Lqg/y0$a;,
        Lqg/y0$b;,
        Lqg/y0$e;,
        Lqg/y0$c;
    }
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;

.field final e:Lgg/y;

.field final f:LDj/a;


# direct methods
.method public constructor <init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;LDj/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/y0;->c:J

    iput-object p4, p0, Lqg/y0;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/y0;->e:Lgg/y;

    iput-object p6, p0, Lqg/y0;->f:LDj/a;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 10

    iget-object v0, p0, Lqg/y0;->f:LDj/a;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lqg/y0$c;

    iget-wide v5, p0, Lqg/y0;->c:J

    iget-object v7, p0, Lqg/y0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lqg/y0;->e:Lgg/y;

    invoke-virtual {v3}, Lgg/y;->c()Lgg/y$c;

    move-result-object v8

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Lqg/y0$c;-><init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0, v1, v2}, Lqg/y0$c;->c(J)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lqg/y0$b;

    iget-wide v5, p0, Lqg/y0;->c:J

    iget-object v7, p0, Lqg/y0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Lqg/y0;->e:Lgg/y;

    invoke-virtual {v3}, Lgg/y;->c()Lgg/y$c;

    move-result-object v8

    iget-object v9, p0, Lqg/y0;->f:LDj/a;

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Lqg/y0$b;-><init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;LDj/a;)V

    invoke-interface {p1, v0}, LDj/b;->j(LDj/c;)V

    invoke-virtual {v0, v1, v2}, Lqg/y0$b;->s(J)V

    iget-object p1, p0, Lqg/b;->b:Lgg/i;

    invoke-virtual {p1, v0}, Lgg/i;->D1(Lgg/l;)V

    :goto_0
    return-void
.end method

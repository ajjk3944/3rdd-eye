.class public final Ltg/m0;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/m0$d;,
        Ltg/m0$a;,
        Ltg/m0$b;,
        Ltg/m0$e;,
        Ltg/m0$c;
    }
.end annotation


# instance fields
.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Lgg/v;


# direct methods
.method public constructor <init>(Lgg/s;JLjava/util/concurrent/TimeUnit;Lgg/y;Lgg/v;)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/m0;->b:J

    iput-object p4, p0, Ltg/m0;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/m0;->d:Lgg/y;

    iput-object p6, p0, Ltg/m0;->e:Lgg/v;

    return-void
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 10

    iget-object v0, p0, Ltg/m0;->e:Lgg/v;

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Ltg/m0$c;

    iget-wide v5, p0, Ltg/m0;->b:J

    iget-object v7, p0, Ltg/m0;->c:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Ltg/m0;->d:Lgg/y;

    invoke-virtual {v3}, Lgg/y;->c()Lgg/y$c;

    move-result-object v8

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v8}, Ltg/m0$c;-><init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0, v1, v2}, Ltg/m0$c;->j(J)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ltg/m0$b;

    iget-wide v5, p0, Ltg/m0;->b:J

    iget-object v7, p0, Ltg/m0;->c:Ljava/util/concurrent/TimeUnit;

    iget-object v3, p0, Ltg/m0;->d:Lgg/y;

    invoke-virtual {v3}, Lgg/y;->c()Lgg/y$c;

    move-result-object v8

    iget-object v9, p0, Ltg/m0;->e:Lgg/v;

    move-object v3, v0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Ltg/m0$b;-><init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lgg/v;)V

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-virtual {v0, v1, v2}, Ltg/m0$b;->j(J)V

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    :goto_0
    return-void
.end method

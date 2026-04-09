.class public final Ltg/j;
.super Ltg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/j$a;
    }
.end annotation


# instance fields
.field final b:J

.field final c:Ljava/util/concurrent/TimeUnit;

.field final d:Lgg/y;

.field final e:Z


# direct methods
.method public constructor <init>(Lgg/v;JLjava/util/concurrent/TimeUnit;Lgg/y;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ltg/a;-><init>(Lgg/v;)V

    iput-wide p2, p0, Ltg/j;->b:J

    iput-object p4, p0, Ltg/j;->c:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Ltg/j;->d:Lgg/y;

    iput-boolean p6, p0, Ltg/j;->e:Z

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 8

    iget-boolean v0, p0, Ltg/j;->e:Z

    if-eqz v0, :cond_0

    move-object v2, p1

    goto :goto_0

    :cond_0
    new-instance v0, LCg/c;

    invoke-direct {v0, p1}, LCg/c;-><init>(Lgg/x;)V

    move-object v2, v0

    :goto_0
    iget-object p1, p0, Ltg/j;->d:Lgg/y;

    invoke-virtual {p1}, Lgg/y;->c()Lgg/y$c;

    move-result-object v6

    iget-object p1, p0, Ltg/a;->a:Lgg/v;

    new-instance v0, Ltg/j$a;

    iget-wide v3, p0, Ltg/j;->b:J

    iget-object v5, p0, Ltg/j;->c:Ljava/util/concurrent/TimeUnit;

    iget-boolean v7, p0, Ltg/j;->e:Z

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ltg/j$a;-><init>(Lgg/x;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Z)V

    invoke-interface {p1, v0}, Lgg/v;->d(Lgg/x;)V

    return-void
.end method

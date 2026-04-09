.class public final Lqg/v0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/v0$a;
    }
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;

.field final e:Lgg/y;

.field final f:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/v0;->c:J

    iput-object p4, p0, Lqg/v0;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/v0;->e:Lgg/y;

    iput-object p6, p0, Lqg/v0;->f:Lkg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 9

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v8, Lqg/v0$a;

    new-instance v2, LIg/a;

    invoke-direct {v2, p1}, LIg/a;-><init>(LDj/b;)V

    iget-wide v3, p0, Lqg/v0;->c:J

    iget-object v5, p0, Lqg/v0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object p1, p0, Lqg/v0;->e:Lgg/y;

    invoke-virtual {p1}, Lgg/y;->c()Lgg/y$c;

    move-result-object v6

    iget-object v7, p0, Lqg/v0;->f:Lkg/f;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lqg/v0$a;-><init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;Lkg/f;)V

    invoke-virtual {v0, v8}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

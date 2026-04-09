.class public final Lqg/c;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/c$a;,
        Lqg/c$c;,
        Lqg/c$b;
    }
.end annotation


# instance fields
.field final c:J

.field final d:J

.field final e:Ljava/util/concurrent/TimeUnit;

.field final f:Lgg/y;

.field final g:Lkg/q;

.field final h:I

.field final i:Z


# direct methods
.method public constructor <init>(Lgg/i;JJLjava/util/concurrent/TimeUnit;Lgg/y;Lkg/q;IZ)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/c;->c:J

    iput-wide p4, p0, Lqg/c;->d:J

    iput-object p6, p0, Lqg/c;->e:Ljava/util/concurrent/TimeUnit;

    iput-object p7, p0, Lqg/c;->f:Lgg/y;

    iput-object p8, p0, Lqg/c;->g:Lkg/q;

    iput p9, p0, Lqg/c;->h:I

    iput-boolean p10, p0, Lqg/c;->i:Z

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 11

    iget-wide v0, p0, Lqg/c;->c:J

    iget-wide v2, p0, Lqg/c;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lqg/c;->h:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v8, Lqg/c$b;

    new-instance v2, LIg/a;

    invoke-direct {v2, p1}, LIg/a;-><init>(LDj/b;)V

    iget-object v3, p0, Lqg/c;->g:Lkg/q;

    iget-wide v4, p0, Lqg/c;->c:J

    iget-object v6, p0, Lqg/c;->e:Ljava/util/concurrent/TimeUnit;

    iget-object v7, p0, Lqg/c;->f:Lgg/y;

    move-object v1, v8

    invoke-direct/range {v1 .. v7}, Lqg/c$b;-><init>(LDj/b;Lkg/q;JLjava/util/concurrent/TimeUnit;Lgg/y;)V

    invoke-virtual {v0, v8}, Lgg/i;->D1(Lgg/l;)V

    return-void

    :cond_0
    iget-object v0, p0, Lqg/c;->f:Lgg/y;

    invoke-virtual {v0}, Lgg/y;->c()Lgg/y$c;

    move-result-object v9

    iget-wide v0, p0, Lqg/c;->c:J

    iget-wide v2, p0, Lqg/c;->d:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v10, Lqg/c$a;

    new-instance v2, LIg/a;

    invoke-direct {v2, p1}, LIg/a;-><init>(LDj/b;)V

    iget-object v3, p0, Lqg/c;->g:Lkg/q;

    iget-wide v4, p0, Lqg/c;->c:J

    iget-object v6, p0, Lqg/c;->e:Ljava/util/concurrent/TimeUnit;

    iget v7, p0, Lqg/c;->h:I

    iget-boolean v8, p0, Lqg/c;->i:Z

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lqg/c$a;-><init>(LDj/b;Lkg/q;JLjava/util/concurrent/TimeUnit;IZLgg/y$c;)V

    invoke-virtual {v0, v10}, Lgg/i;->D1(Lgg/l;)V

    return-void

    :cond_1
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v10, Lqg/c$c;

    new-instance v2, LIg/a;

    invoke-direct {v2, p1}, LIg/a;-><init>(LDj/b;)V

    iget-object v3, p0, Lqg/c;->g:Lkg/q;

    iget-wide v4, p0, Lqg/c;->c:J

    iget-wide v6, p0, Lqg/c;->d:J

    iget-object v8, p0, Lqg/c;->e:Ljava/util/concurrent/TimeUnit;

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lqg/c$c;-><init>(LDj/b;Lkg/q;JJLjava/util/concurrent/TimeUnit;Lgg/y$c;)V

    invoke-virtual {v0, v10}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

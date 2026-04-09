.class public final Lqg/w0;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/w0$a;
    }
.end annotation


# instance fields
.field final c:J

.field final d:Ljava/util/concurrent/TimeUnit;

.field final e:Lgg/y;

.field final f:Z

.field final g:Lkg/f;


# direct methods
.method public constructor <init>(Lgg/i;JLjava/util/concurrent/TimeUnit;Lgg/y;ZLkg/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-wide p2, p0, Lqg/w0;->c:J

    iput-object p4, p0, Lqg/w0;->d:Ljava/util/concurrent/TimeUnit;

    iput-object p5, p0, Lqg/w0;->e:Lgg/y;

    iput-boolean p6, p0, Lqg/w0;->f:Z

    iput-object p7, p0, Lqg/w0;->g:Lkg/f;

    return-void
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 10

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    new-instance v9, Lqg/w0$a;

    iget-wide v3, p0, Lqg/w0;->c:J

    iget-object v5, p0, Lqg/w0;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lqg/w0;->e:Lgg/y;

    invoke-virtual {v1}, Lgg/y;->c()Lgg/y$c;

    move-result-object v6

    iget-boolean v7, p0, Lqg/w0;->f:Z

    iget-object v8, p0, Lqg/w0;->g:Lkg/f;

    move-object v1, v9

    move-object v2, p1

    invoke-direct/range {v1 .. v8}, Lqg/w0$a;-><init>(LDj/b;JLjava/util/concurrent/TimeUnit;Lgg/y$c;ZLkg/f;)V

    invoke-virtual {v0, v9}, Lgg/i;->D1(Lgg/l;)V

    return-void
.end method

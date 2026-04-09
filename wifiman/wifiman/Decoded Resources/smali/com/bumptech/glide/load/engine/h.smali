.class Lcom/bumptech/glide/load/engine/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/engine/f$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LX2/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/engine/h$d;,
        Lcom/bumptech/glide/load/engine/h$f;,
        Lcom/bumptech/glide/load/engine/h$e;,
        Lcom/bumptech/glide/load/engine/h$b;,
        Lcom/bumptech/glide/load/engine/h$g;,
        Lcom/bumptech/glide/load/engine/h$h;,
        Lcom/bumptech/glide/load/engine/h$c;
    }
.end annotation


# instance fields
.field private A:LC2/a;

.field private B:Lcom/bumptech/glide/load/data/d;

.field private volatile C:Lcom/bumptech/glide/load/engine/f;

.field private volatile D:Z

.field private volatile E:Z

.field private F:Z

.field private final a:Lcom/bumptech/glide/load/engine/g;

.field private final b:Ljava/util/List;

.field private final c:LX2/c;

.field private final d:Lcom/bumptech/glide/load/engine/h$e;

.field private final e:LE1/e;

.field private final f:Lcom/bumptech/glide/load/engine/h$d;

.field private final g:Lcom/bumptech/glide/load/engine/h$f;

.field private h:Lcom/bumptech/glide/d;

.field private i:LC2/e;

.field private j:Lcom/bumptech/glide/g;

.field private k:Lcom/bumptech/glide/load/engine/m;

.field private l:I

.field private m:I

.field private n:LE2/a;

.field private o:LC2/g;

.field private p:Lcom/bumptech/glide/load/engine/h$b;

.field private q:I

.field private r:Lcom/bumptech/glide/load/engine/h$h;

.field private s:Lcom/bumptech/glide/load/engine/h$g;

.field private t:J

.field private u:Z

.field private v:Ljava/lang/Object;

.field private w:Ljava/lang/Thread;

.field private x:LC2/e;

.field private y:LC2/e;

.field private z:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/engine/h$e;LE1/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bumptech/glide/load/engine/g;

    invoke-direct {v0}, Lcom/bumptech/glide/load/engine/g;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-static {}, LX2/c;->a()LX2/c;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->c:LX2/c;

    new-instance v0, Lcom/bumptech/glide/load/engine/h$d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/engine/h$d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    new-instance v0, Lcom/bumptech/glide/load/engine/h$f;

    invoke-direct {v0}, Lcom/bumptech/glide/load/engine/h$f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->g:Lcom/bumptech/glide/load/engine/h$f;

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/h;->d:Lcom/bumptech/glide/load/engine/h$e;

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/h;->e:LE1/e;

    return-void
.end method

.method private B(LE2/c;LC2/a;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->U()V

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->p:Lcom/bumptech/glide/load/engine/h$b;

    invoke-interface {v0, p1, p2, p3}, Lcom/bumptech/glide/load/engine/h$b;->c(LE2/c;LC2/a;Z)V

    return-void
.end method

.method private C(LE2/c;LC2/a;Z)V
    .locals 1

    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    invoke-static {v0}, LX2/b;->a(Ljava/lang/String;)V

    :try_start_0
    instance-of v0, p1, LE2/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LE2/b;

    invoke-interface {v0}, LE2/b;->b()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h$d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/bumptech/glide/load/engine/r;->f(LE2/c;)Lcom/bumptech/glide/load/engine/r;

    move-result-object p1

    move-object v0, p1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/load/engine/h;->B(LE2/c;LC2/a;Z)V

    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->ENCODE:Lcom/bumptech/glide/load/engine/h$h;

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/h$d;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->d:Lcom/bumptech/glide/load/engine/h$e;

    iget-object p3, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    invoke-virtual {p1, p2, p3}, Lcom/bumptech/glide/load/engine/h$d;->b(Lcom/bumptech/glide/load/engine/h$e;LC2/g;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/r;->h()V

    :cond_3
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->E()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {}, LX2/b;->e()V

    return-void

    :goto_3
    if-eqz v0, :cond_4

    :try_start_3
    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/r;->h()V

    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    invoke-static {}, LX2/b;->e()V

    throw p1
.end method

.method private D()V
    .locals 3

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->U()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "Failed to load resource"

    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->p:Lcom/bumptech/glide/load/engine/h$b;

    invoke-interface {v1, v0}, Lcom/bumptech/glide/load/engine/h$b;->a(Lcom/bumptech/glide/load/engine/GlideException;)V

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->H()V

    return-void
.end method

.method private E()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->g:Lcom/bumptech/glide/load/engine/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->K()V

    :cond_0
    return-void
.end method

.method private H()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->g:Lcom/bumptech/glide/load/engine/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h$f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->K()V

    :cond_0
    return-void
.end method

.method private K()V
    .locals 4

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->g:Lcom/bumptech/glide/load/engine/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h$f;->e()V

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/h$d;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/engine/g;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/h;->D:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->h:Lcom/bumptech/glide/d;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->i:LC2/e;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->j:Lcom/bumptech/glide/g;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->k:Lcom/bumptech/glide/load/engine/m;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->p:Lcom/bumptech/glide/load/engine/h$b;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->w:Ljava/lang/Thread;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->z:Ljava/lang/Object;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->A:LC2/a;

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->B:Lcom/bumptech/glide/load/data/d;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/bumptech/glide/load/engine/h;->t:J

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->v:Ljava/lang/Object;

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->e:LE1/e;

    invoke-interface {v0, p0}, LE1/e;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private M(Lcom/bumptech/glide/load/engine/h$g;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/h;->s:Lcom/bumptech/glide/load/engine/h$g;

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->p:Lcom/bumptech/glide/load/engine/h$b;

    invoke-interface {p1, p0}, Lcom/bumptech/glide/load/engine/h$b;->d(Lcom/bumptech/glide/load/engine/h;)V

    return-void
.end method

.method private N()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->w:Ljava/lang/Thread;

    invoke-static {}, LW2/g;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bumptech/glide/load/engine/h;->t:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/engine/f;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0, v1}, Lcom/bumptech/glide/load/engine/h;->r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;

    move-result-object v1

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->p()Lcom/bumptech/glide/load/engine/f;

    move-result-object v1

    iput-object v1, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    sget-object v2, Lcom/bumptech/glide/load/engine/h$h;->SOURCE:Lcom/bumptech/glide/load/engine/h$h;

    if-ne v1, v2, :cond_0

    sget-object v0, Lcom/bumptech/glide/load/engine/h$g;->SWITCH_TO_SOURCE_SERVICE:Lcom/bumptech/glide/load/engine/h$g;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/engine/h;->M(Lcom/bumptech/glide/load/engine/h$g;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    sget-object v2, Lcom/bumptech/glide/load/engine/h$h;->FINISHED:Lcom/bumptech/glide/load/engine/h$h;

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->D()V

    :cond_3
    return-void
.end method

.method private P(Ljava/lang/Object;LC2/a;Lcom/bumptech/glide/load/engine/q;)LE2/c;
    .locals 6

    invoke-direct {p0, p2}, Lcom/bumptech/glide/load/engine/h;->s(LC2/a;)LC2/g;

    move-result-object v2

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->h:Lcom/bumptech/glide/d;

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->h()Lcom/bumptech/glide/Registry;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/Registry;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    move-result-object p1

    :try_start_0
    iget v3, p0, Lcom/bumptech/glide/load/engine/h;->l:I

    iget v4, p0, Lcom/bumptech/glide/load/engine/h;->m:I

    new-instance v5, Lcom/bumptech/glide/load/engine/h$c;

    invoke-direct {v5, p0, p2}, Lcom/bumptech/glide/load/engine/h$c;-><init>(Lcom/bumptech/glide/load/engine/h;LC2/a;)V

    move-object v0, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/q;->a(Lcom/bumptech/glide/load/data/e;LC2/g;IILcom/bumptech/glide/load/engine/i$a;)LE2/c;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/e;->b()V

    throw p2
.end method

.method private T()V
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/engine/h$a;->a:[I

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->s:Lcom/bumptech/glide/load/engine/h$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->n()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->s:Lcom/bumptech/glide/load/engine/h$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->N()V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/bumptech/glide/load/engine/h$h;->INITIALIZE:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/engine/h;->r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->p()Lcom/bumptech/glide/load/engine/f;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->N()V

    :goto_0
    return-void
.end method

.method private U()V
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->c:LX2/c;

    invoke-virtual {v0}, LX2/c;->c()V

    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/h;->D:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/h;->D:Z

    return-void
.end method

.method private j(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;LC2/a;)LE2/c;
    .locals 3

    if-nez p2, :cond_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_0
    invoke-static {}, LW2/g;->b()J

    move-result-wide v0

    invoke-direct {p0, p2, p3}, Lcom/bumptech/glide/load/engine/h;->l(Ljava/lang/Object;LC2/a;)LE2/c;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded result "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, v0, v1}, Lcom/bumptech/glide/load/engine/h;->y(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    return-object p2

    :goto_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->b()V

    throw p2
.end method

.method private l(Ljava/lang/Object;LC2/a;)LE2/c;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/engine/g;->h(Ljava/lang/Class;)Lcom/bumptech/glide/load/engine/q;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/load/engine/h;->P(Ljava/lang/Object;LC2/a;Lcom/bumptech/glide/load/engine/q;)LE2/c;

    move-result-object p1

    return-object p1
.end method

.method private n()V
    .locals 4

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/bumptech/glide/load/engine/h;->t:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/h;->z:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cache key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", fetcher: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/h;->B:Lcom/bumptech/glide/load/data/d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Retrieved data"

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/bumptech/glide/load/engine/h;->z(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->B:Lcom/bumptech/glide/load/data/d;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->z:Ljava/lang/Object;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->A:LC2/a;

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/load/engine/h;->j(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;LC2/a;)LE2/c;

    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/GlideException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->y:LC2/e;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->A:LC2/a;

    invoke-virtual {v0, v1, v2}, Lcom/bumptech/glide/load/engine/GlideException;->n(LC2/e;LC2/a;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->A:LC2/a;

    iget-boolean v2, p0, Lcom/bumptech/glide/load/engine/h;->F:Z

    invoke-direct {p0, v0, v1, v2}, Lcom/bumptech/glide/load/engine/h;->C(LE2/c;LC2/a;Z)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->N()V

    :goto_1
    return-void
.end method

.method private p()Lcom/bumptech/glide/load/engine/f;
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/engine/h$a;->b:[I

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/bumptech/glide/load/engine/v;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/engine/v;-><init>(Lcom/bumptech/glide/load/engine/g;Lcom/bumptech/glide/load/engine/f$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/bumptech/glide/load/engine/c;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/engine/c;-><init>(Lcom/bumptech/glide/load/engine/g;Lcom/bumptech/glide/load/engine/f$a;)V

    return-object v0

    :cond_3
    new-instance v0, Lcom/bumptech/glide/load/engine/s;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/engine/s;-><init>(Lcom/bumptech/glide/load/engine/g;Lcom/bumptech/glide/load/engine/f$a;)V

    return-object v0
.end method

.method private r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/engine/h$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->n:LE2/a;

    invoke-virtual {p1}, LE2/a;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/engine/h;->r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->FINISHED:Lcom/bumptech/glide/load/engine/h$h;

    return-object p1

    :cond_3
    iget-boolean p1, p0, Lcom/bumptech/glide/load/engine/h;->u:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->FINISHED:Lcom/bumptech/glide/load/engine/h$h;

    goto :goto_1

    :cond_4
    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->SOURCE:Lcom/bumptech/glide/load/engine/h$h;

    :goto_1
    return-object p1

    :cond_5
    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->n:LE2/a;

    invoke-virtual {p1}, LE2/a;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->DATA_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    goto :goto_2

    :cond_6
    sget-object p1, Lcom/bumptech/glide/load/engine/h$h;->DATA_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/engine/h;->r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private s(LC2/a;)LC2/g;
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    sget-object v1, LC2/a;->RESOURCE_DISK_CACHE:LC2/a;

    if-eq p1, v1, :cond_1

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/g;->x()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/l;->j:LC2/f;

    invoke-virtual {v0, v1}, LC2/g;->c(LC2/f;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz p1, :cond_3

    :cond_2
    return-object v0

    :cond_3
    new-instance v0, LC2/g;

    invoke-direct {v0}, LC2/g;-><init>()V

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    invoke-virtual {v0, v2}, LC2/g;->d(LC2/g;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LC2/g;->e(LC2/f;Ljava/lang/Object;)LC2/g;

    return-object v0
.end method

.method private t()I
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->j:Lcom/bumptech/glide/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private y(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/bumptech/glide/load/engine/h;->z(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method private z(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, LW2/g;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->k:Lcom/bumptech/glide/load/engine/m;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method I(LC2/a;LE2/c;)LE2/c;
    .locals 11

    invoke-interface {p2}, LE2/c;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v0, LC2/a;->RESOURCE_DISK_CACHE:LC2/a;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/load/engine/g;->s(Ljava/lang/Class;)LC2/k;

    move-result-object v0

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->h:Lcom/bumptech/glide/d;

    iget v3, p0, Lcom/bumptech/glide/load/engine/h;->l:I

    iget v4, p0, Lcom/bumptech/glide/load/engine/h;->m:I

    invoke-interface {v0, v2, p2, v3, v4}, LC2/k;->b(Landroid/content/Context;LE2/c;II)LE2/c;

    move-result-object v2

    move-object v7, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v7, v1

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {p2}, LE2/c;->c()V

    :cond_1
    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/load/engine/g;->w(LE2/c;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/load/engine/g;->n(LE2/c;)LC2/j;

    move-result-object v1

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    invoke-interface {v1, p2}, LC2/j;->b(LC2/g;)LC2/c;

    move-result-object p2

    :goto_1
    move-object v10, v1

    goto :goto_2

    :cond_2
    sget-object p2, LC2/c;->NONE:LC2/c;

    goto :goto_1

    :goto_2
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/load/engine/g;->y(LC2/e;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/h;->n:LE2/a;

    invoke-virtual {v3, v1, p1, p2}, LE2/a;->d(ZLC2/a;LC2/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    sget-object p1, Lcom/bumptech/glide/load/engine/h$a;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    if-eq p1, v2, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    new-instance p1, Lcom/bumptech/glide/load/engine/t;

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p2}, Lcom/bumptech/glide/load/engine/g;->b()LF2/b;

    move-result-object v2

    iget-object v3, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    iget-object v4, p0, Lcom/bumptech/glide/load/engine/h;->i:LC2/e;

    iget v5, p0, Lcom/bumptech/glide/load/engine/h;->l:I

    iget v6, p0, Lcom/bumptech/glide/load/engine/h;->m:I

    iget-object v9, p0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/bumptech/glide/load/engine/t;-><init>(LF2/b;LC2/e;LC2/e;IILC2/k;Ljava/lang/Class;LC2/g;)V

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown strategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/bumptech/glide/load/engine/d;

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->i:LC2/e;

    invoke-direct {p1, p2, v1}, Lcom/bumptech/glide/load/engine/d;-><init>(LC2/e;LC2/e;)V

    :goto_3
    invoke-static {v0}, Lcom/bumptech/glide/load/engine/r;->f(LE2/c;)Lcom/bumptech/glide/load/engine/r;

    move-result-object v0

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->f:Lcom/bumptech/glide/load/engine/h$d;

    invoke-virtual {p2, p1, v10, v0}, Lcom/bumptech/glide/load/engine/h$d;->d(LC2/e;LC2/j;Lcom/bumptech/glide/load/engine/r;)V

    goto :goto_4

    :cond_5
    new-instance p1, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    invoke-interface {v0}, LE2/c;->get()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_6
    :goto_4
    return-object v0
.end method

.method J(Z)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->g:Lcom/bumptech/glide/load/engine/h$f;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/engine/h$f;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->K()V

    :cond_0
    return-void
.end method

.method W()Z
    .locals 2

    sget-object v0, Lcom/bumptech/glide/load/engine/h$h;->INITIALIZE:Lcom/bumptech/glide/load/engine/h$h;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/engine/h;->r(Lcom/bumptech/glide/load/engine/h$h;)Lcom/bumptech/glide/load/engine/h$h;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/engine/h$h;->RESOURCE_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/bumptech/glide/load/engine/h$h;->DATA_CACHE:Lcom/bumptech/glide/load/engine/h$h;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public a(LC2/e;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;LC2/a;LC2/e;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/load/engine/h;->x:LC2/e;

    iput-object p2, p0, Lcom/bumptech/glide/load/engine/h;->z:Ljava/lang/Object;

    iput-object p3, p0, Lcom/bumptech/glide/load/engine/h;->B:Lcom/bumptech/glide/load/data/d;

    iput-object p4, p0, Lcom/bumptech/glide/load/engine/h;->A:LC2/a;

    iput-object p5, p0, Lcom/bumptech/glide/load/engine/h;->y:LC2/e;

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    invoke-virtual {p2}, Lcom/bumptech/glide/load/engine/g;->c()Ljava/util/List;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, Lcom/bumptech/glide/load/engine/h;->F:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->w:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    sget-object p1, Lcom/bumptech/glide/load/engine/h$g;->DECODE_DATA:Lcom/bumptech/glide/load/engine/h$g;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/engine/h;->M(Lcom/bumptech/glide/load/engine/h$g;)V

    goto :goto_0

    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    invoke-static {p1}, LX2/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LX2/b;->e()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, LX2/b;->e()V

    throw p1
.end method

.method public b()LX2/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->c:LX2/c;

    return-object v0
.end method

.method public c(LC2/e;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;LC2/a;)V
    .locals 2

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->b()V

    new-instance v0, Lcom/bumptech/glide/load/engine/GlideException;

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/engine/GlideException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p1, p4, p2}, Lcom/bumptech/glide/load/engine/GlideException;->o(LC2/e;LC2/a;Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/engine/h;->w:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/engine/h$g;->SWITCH_TO_SOURCE_SERVICE:Lcom/bumptech/glide/load/engine/h$g;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/engine/h;->M(Lcom/bumptech/glide/load/engine/h$g;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->N()V

    :goto_0
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/bumptech/glide/load/engine/h;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/h;->h(Lcom/bumptech/glide/load/engine/h;)I

    move-result p1

    return p1
.end method

.method public d()V
    .locals 1

    sget-object v0, Lcom/bumptech/glide/load/engine/h$g;->SWITCH_TO_SOURCE_SERVICE:Lcom/bumptech/glide/load/engine/h$g;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/engine/h;->M(Lcom/bumptech/glide/load/engine/h$g;)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->C:Lcom/bumptech/glide/load/engine/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bumptech/glide/load/engine/f;->cancel()V

    :cond_0
    return-void
.end method

.method public h(Lcom/bumptech/glide/load/engine/h;)I
    .locals 2

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->t()I

    move-result v0

    invoke-direct {p1}, Lcom/bumptech/glide/load/engine/h;->t()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/load/engine/h;->q:I

    iget p1, p1, Lcom/bumptech/glide/load/engine/h;->q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public run()V
    .locals 5

    const-string v0, "DecodeJob"

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->s:Lcom/bumptech/glide/load/engine/h$g;

    iget-object v2, p0, Lcom/bumptech/glide/load/engine/h;->v:Ljava/lang/Object;

    const-string v3, "DecodeJob#run(reason=%s, model=%s)"

    invoke-static {v3, v1, v2}, LX2/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/engine/h;->B:Lcom/bumptech/glide/load/data/d;

    :try_start_0
    iget-boolean v2, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->D()V
    :try_end_0
    .catch Lcom/bumptech/glide/load/engine/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_0
    invoke-static {}, LX2/b;->e()V

    return-void

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->T()V
    :try_end_1
    .catch Lcom/bumptech/glide/load/engine/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_2
    invoke-static {}, LX2/b;->e()V

    return-void

    :goto_0
    const/4 v3, 0x3

    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->r:Lcom/bumptech/glide/load/engine/h$h;

    sget-object v3, Lcom/bumptech/glide/load/engine/h$h;->ENCODE:Lcom/bumptech/glide/load/engine/h$h;

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/engine/h;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/bumptech/glide/load/engine/h;->D()V

    :cond_4
    iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/h;->E:Z

    if-nez v0, :cond_5

    throw v2

    :cond_5
    throw v2

    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    if-eqz v1, :cond_6

    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->b()V

    :cond_6
    invoke-static {}, LX2/b;->e()V

    throw v0
.end method

.method v(Lcom/bumptech/glide/d;Ljava/lang/Object;Lcom/bumptech/glide/load/engine/m;LC2/e;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LE2/a;Ljava/util/Map;ZZZLC2/g;Lcom/bumptech/glide/load/engine/h$b;I)Lcom/bumptech/glide/load/engine/h;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/load/engine/h;->a:Lcom/bumptech/glide/load/engine/g;

    iget-object v15, v0, Lcom/bumptech/glide/load/engine/h;->d:Lcom/bumptech/glide/load/engine/h$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p15

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v15}, Lcom/bumptech/glide/load/engine/g;->v(Lcom/bumptech/glide/d;Ljava/lang/Object;LC2/e;IILE2/a;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;LC2/g;Ljava/util/Map;ZZLcom/bumptech/glide/load/engine/h$e;)V

    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->h:Lcom/bumptech/glide/d;

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->i:LC2/e;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->j:Lcom/bumptech/glide/g;

    move-object/from16 v1, p3

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->k:Lcom/bumptech/glide/load/engine/m;

    move/from16 v1, p5

    iput v1, v0, Lcom/bumptech/glide/load/engine/h;->l:I

    move/from16 v1, p6

    iput v1, v0, Lcom/bumptech/glide/load/engine/h;->m:I

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->n:LE2/a;

    move/from16 v1, p14

    iput-boolean v1, v0, Lcom/bumptech/glide/load/engine/h;->u:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->o:LC2/g;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->p:Lcom/bumptech/glide/load/engine/h$b;

    move/from16 v1, p17

    iput v1, v0, Lcom/bumptech/glide/load/engine/h;->q:I

    sget-object v1, Lcom/bumptech/glide/load/engine/h$g;->INITIALIZE:Lcom/bumptech/glide/load/engine/h$g;

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->s:Lcom/bumptech/glide/load/engine/h$g;

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/bumptech/glide/load/engine/h;->v:Ljava/lang/Object;

    return-object v0
.end method

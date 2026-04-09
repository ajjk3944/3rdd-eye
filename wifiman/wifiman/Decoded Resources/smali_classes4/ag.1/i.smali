.class Lag/i;
.super Lag/m;
.source "SourceFile"

# interfaces
.implements Ldg/b;


# instance fields
.field private c:Ljava/util/Iterator;

.field private d:LZf/d;

.field private e:LZf/d;

.field private f:I

.field private g:I

.field private h:Ljava/util/function/Supplier;

.field protected i:Z

.field private final j:Z

.field private final k:Lag/b$a;

.field private final l:Lag/b$b;


# direct methods
.method private constructor <init>(IILjava/util/function/Supplier;Lag/b$a;ZZLag/b$b;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lag/m;-><init>()V

    .line 4
    iput-object p3, p0, Lag/i;->h:Ljava/util/function/Supplier;

    .line 5
    iput-object p4, p0, Lag/i;->k:Lag/b$a;

    .line 6
    iput-boolean p5, p0, Lag/i;->i:Z

    .line 7
    iput-boolean p6, p0, Lag/i;->j:Z

    .line 8
    iput-object p7, p0, Lag/i;->l:Lag/b$b;

    .line 9
    iput p1, p0, Lag/i;->f:I

    .line 10
    iput p2, p0, Lag/i;->g:I

    return-void
.end method

.method constructor <init>(LZf/d;IILjava/util/function/Supplier;Lag/b$a;Lag/b$b;)V
    .locals 8

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v7, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lag/i;-><init>(IILjava/util/function/Supplier;Lag/b$a;ZZLag/b$b;)V

    .line 2
    iput-object p1, p0, Lag/i;->d:LZf/d;

    return-void
.end method

.method private f()I
    .locals 3

    iget v0, p0, Lag/i;->f:I

    iget-wide v1, p0, Lag/m;->a:J

    long-to-int v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method private g()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, Lag/i;->c:Ljava/util/Iterator;

    if-nez v0, :cond_1

    iget-object v0, p0, Lag/i;->h:Ljava/util/function/Supplier;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    iput-object v0, p0, Lag/i;->c:Ljava/util/Iterator;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lag/i;->k:Lag/b$a;

    iget-boolean v1, p0, Lag/i;->i:Z

    iget-boolean v2, p0, Lag/i;->j:Z

    iget v3, p0, Lag/i;->f:I

    iget v4, p0, Lag/i;->g:I

    invoke-interface {v0, v1, v2, v3, v4}, Lag/b$a;->a(ZZII)Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lag/i;->c:Ljava/util/Iterator;

    :cond_1
    :goto_0
    iget-object v0, p0, Lag/i;->c:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Lag/a;
    .locals 1

    invoke-virtual {p0}, Lag/i;->e()LZf/d;

    move-result-object v0

    return-object v0
.end method

.method public e()LZf/d;
    .locals 3

    iget-object v0, p0, Lag/i;->d:LZf/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lag/i;->l:Lag/b$b;

    iget v1, p0, Lag/i;->f:I

    iget v2, p0, Lag/i;->g:I

    invoke-interface {v0, v1, v2}, Lag/b$b;->a(II)LZf/d;

    move-result-object v0

    iput-object v0, p0, Lag/i;->d:LZf/d;

    :cond_0
    return-object v0
.end method

.method public estimateSize()J
    .locals 4

    iget v0, p0, Lag/i;->g:I

    int-to-long v0, v0

    invoke-direct {p0}, Lag/i;->f()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 5

    iget-boolean v0, p0, Lag/m;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lag/m;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iput-object v1, p0, Lag/i;->e:LZf/d;

    invoke-direct {p0}, Lag/i;->g()Ljava/util/Iterator;

    move-result-object v1

    iget v3, p0, Lag/i;->g:I

    iget v4, p0, Lag/i;->f:I

    sub-int/2addr v3, v4

    add-int/2addr v3, v0

    int-to-long v3, v3

    invoke-virtual {p0, v1, p1, v3, v4}, Lag/m;->c(Ljava/util/Iterator;Ljava/util/function/Consumer;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v2, p0, Lag/m;->b:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v2, p0, Lag/m;->b:Z

    throw p1
.end method

.method public h()Ldg/b;
    .locals 10

    iget-boolean v0, p0, Lag/m;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    invoke-direct {p0}, Lag/i;->f()I

    move-result v3

    iget v0, p0, Lag/i;->g:I

    sub-int/2addr v0, v3

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    return-object v1

    :cond_1
    iput-object v1, p0, Lag/i;->d:LZf/d;

    iput-object v1, p0, Lag/i;->e:LZf/d;

    iput-object v1, p0, Lag/i;->h:Ljava/util/function/Supplier;

    ushr-int/2addr v0, v2

    add-int v4, v3, v0

    add-int/lit8 v0, v4, 0x1

    iput v0, p0, Lag/i;->f:I

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lag/m;->a:J

    new-instance v0, Lag/i;

    iget-object v6, p0, Lag/i;->k:Lag/b$a;

    iget-boolean v7, p0, Lag/i;->i:Z

    const/4 v8, 0x0

    iget-object v9, p0, Lag/i;->l:Lag/b$b;

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lag/i;-><init>(IILjava/util/function/Supplier;Lag/b$a;ZZLag/b$b;)V

    iget-object v2, p0, Lag/i;->c:Ljava/util/Iterator;

    iput-object v2, v0, Lag/i;->c:Ljava/util/Iterator;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lag/i;->i:Z

    iput-object v1, p0, Lag/i;->c:Ljava/util/Iterator;

    return-object v0
.end method

.method public tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 2

    iget-boolean v0, p0, Lag/m;->b:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lag/i;->f()I

    move-result v0

    iget v1, p0, Lag/i;->g:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lag/i;->e:LZf/d;

    invoke-direct {p0}, Lag/i;->g()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lag/m;->d(Ljava/util/Iterator;Ljava/util/function/Consumer;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic trySplit()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Lag/i;->h()Ldg/b;

    move-result-object v0

    return-object v0
.end method

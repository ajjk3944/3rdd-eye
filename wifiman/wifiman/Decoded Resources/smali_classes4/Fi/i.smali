.class public LFi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private a:Ljava/lang/Object;

.field private final b:LFi/d;

.field private c:Ljava/lang/Object;

.field private d:Z

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;LFi/d;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LFi/i;->a:Ljava/lang/Object;

    iput-object p2, p0, LFi/i;->b:LFi/d;

    sget-object p1, LHi/c;->a:LHi/c;

    iput-object p1, p0, LFi/i;->c:Ljava/lang/Object;

    invoke-virtual {p2}, LFi/d;->h()LEi/f;

    move-result-object p1

    invoke-virtual {p1}, LEi/f;->i()I

    move-result p1

    iput p1, p0, LFi/i;->e:I

    return-void
.end method

.method private final d()V
    .locals 2

    iget-object v0, p0, LFi/i;->b:LFi/d;

    invoke-virtual {v0}, LFi/d;->h()LEi/f;

    move-result-object v0

    invoke-virtual {v0}, LEi/f;->i()I

    move-result v0

    iget v1, p0, LFi/i;->e:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method private final e()V
    .locals 1

    invoke-virtual {p0}, LFi/i;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method private final f()V
    .locals 1

    iget-boolean v0, p0, LFi/i;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final g()LFi/d;
    .locals 1

    iget-object v0, p0, LFi/i;->b:LFi/d;

    return-object v0
.end method

.method public final h()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LFi/i;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, LFi/i;->f:I

    iget-object v1, p0, LFi/i;->b:LFi/d;

    invoke-virtual {v1}, LZg/i;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public i()LFi/a;
    .locals 3

    invoke-direct {p0}, LFi/i;->d()V

    invoke-direct {p0}, LFi/i;->e()V

    iget-object v0, p0, LFi/i;->a:Ljava/lang/Object;

    iput-object v0, p0, LFi/i;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, LFi/i;->d:Z

    iget v1, p0, LFi/i;->f:I

    add-int/2addr v1, v0

    iput v1, p0, LFi/i;->f:I

    iget-object v0, p0, LFi/i;->b:LFi/d;

    invoke-virtual {v0}, LFi/d;->h()LEi/f;

    move-result-object v0

    iget-object v1, p0, LFi/i;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, LFi/a;

    invoke-virtual {v0}, LFi/a;->c()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LFi/i;->a:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Hash code of a key ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LFi/i;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ") has changed after it was added to the persistent map."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LFi/i;->i()LFi/a;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    invoke-direct {p0}, LFi/i;->f()V

    iget-object v0, p0, LFi/i;->b:LFi/d;

    iget-object v1, p0, LFi/i;->c:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/V;->d(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, LFi/i;->c:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, LFi/i;->d:Z

    iget-object v0, p0, LFi/i;->b:LFi/d;

    invoke-virtual {v0}, LFi/d;->h()LEi/f;

    move-result-object v0

    invoke-virtual {v0}, LEi/f;->i()I

    move-result v0

    iput v0, p0, LFi/i;->e:I

    iget v0, p0, LFi/i;->f:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LFi/i;->f:I

    return-void
.end method

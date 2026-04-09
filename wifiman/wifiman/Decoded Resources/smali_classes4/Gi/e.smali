.class public final LGi/e;
.super LGi/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lnh/a;


# instance fields
.field private final d:LGi/c;

.field private e:Ljava/lang/Object;

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(LGi/c;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LGi/c;->j()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, LGi/c;->s()LEi/f;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LGi/d;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    iput-object p1, p0, LGi/e;->d:LGi/c;

    invoke-virtual {p1}, LGi/c;->s()LEi/f;

    move-result-object p1

    invoke-virtual {p1}, LEi/f;->i()I

    move-result p1

    iput p1, p0, LGi/e;->g:I

    return-void
.end method

.method private final g()V
    .locals 2

    iget-object v0, p0, LGi/e;->d:LGi/c;

    invoke-virtual {v0}, LGi/c;->s()LEi/f;

    move-result-object v0

    invoke-virtual {v0}, LEi/f;->i()I

    move-result v0

    iget v1, p0, LGi/e;->g:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method private final h()V
    .locals 1

    iget-boolean v0, p0, LGi/e;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2

    invoke-direct {p0}, LGi/e;->g()V

    invoke-super {p0}, LGi/d;->next()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LGi/e;->e:Ljava/lang/Object;

    const/4 v1, 0x1

    iput-boolean v1, p0, LGi/e;->f:Z

    return-object v0
.end method

.method public remove()V
    .locals 2

    invoke-direct {p0}, LGi/e;->h()V

    iget-object v0, p0, LGi/e;->d:LGi/c;

    iget-object v1, p0, LGi/e;->e:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/V;->a(Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-object v0, p0, LGi/e;->e:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, LGi/e;->f:Z

    iget-object v0, p0, LGi/e;->d:LGi/c;

    invoke-virtual {v0}, LGi/c;->s()LEi/f;

    move-result-object v0

    invoke-virtual {v0}, LEi/f;->i()I

    move-result v0

    iput v0, p0, LGi/e;->g:I

    invoke-virtual {p0}, LGi/d;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LGi/d;->f(I)V

    return-void
.end method

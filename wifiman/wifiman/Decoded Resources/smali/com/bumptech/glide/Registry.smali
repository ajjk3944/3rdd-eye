.class public Lcom/bumptech/glide/Registry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;,
        Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;,
        Lcom/bumptech/glide/Registry$NoImageHeaderParserException;,
        Lcom/bumptech/glide/Registry$MissingComponentException;,
        Lcom/bumptech/glide/Registry$NoModelLoaderAvailableException;
    }
.end annotation


# instance fields
.field private final a:LI2/p;

.field private final b:LS2/a;

.field private final c:LS2/e;

.field private final d:LS2/f;

.field private final e:Lcom/bumptech/glide/load/data/f;

.field private final f:LP2/f;

.field private final g:LS2/b;

.field private final h:LS2/d;

.field private final i:LS2/c;

.field private final j:LE1/e;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LS2/d;

    invoke-direct {v0}, LS2/d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->h:LS2/d;

    new-instance v0, LS2/c;

    invoke-direct {v0}, LS2/c;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->i:LS2/c;

    invoke-static {}, LX2/a;->e()LE1/e;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->j:LE1/e;

    new-instance v1, LI2/p;

    invoke-direct {v1, v0}, LI2/p;-><init>(LE1/e;)V

    iput-object v1, p0, Lcom/bumptech/glide/Registry;->a:LI2/p;

    new-instance v0, LS2/a;

    invoke-direct {v0}, LS2/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->b:LS2/a;

    new-instance v0, LS2/e;

    invoke-direct {v0}, LS2/e;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    new-instance v0, LS2/f;

    invoke-direct {v0}, LS2/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->d:LS2/f;

    new-instance v0, Lcom/bumptech/glide/load/data/f;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->e:Lcom/bumptech/glide/load/data/f;

    new-instance v0, LP2/f;

    invoke-direct {v0}, LP2/f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->f:LP2/f;

    new-instance v0, LS2/b;

    invoke-direct {v0}, LS2/b;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/Registry;->g:LS2/b;

    const-string v0, "Bitmap"

    const-string v1, "BitmapDrawable"

    const-string v2, "Animation"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/Registry;->r(Ljava/util/List;)Lcom/bumptech/glide/Registry;

    return-void
.end method

.method private f(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    invoke-virtual {v1, p1, p2}, LS2/e;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    iget-object v2, p0, Lcom/bumptech/glide/Registry;->f:LP2/f;

    invoke-virtual {v2, v1, p3}, LP2/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    iget-object v2, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    invoke-virtual {v2, p1, v1}, LS2/e;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v6

    iget-object v2, p0, Lcom/bumptech/glide/Registry;->f:LP2/f;

    invoke-virtual {v2, v1, v5}, LP2/f;->a(Ljava/lang/Class;Ljava/lang/Class;)LP2/e;

    move-result-object v7

    new-instance v10, Lcom/bumptech/glide/load/engine/i;

    iget-object v8, p0, Lcom/bumptech/glide/Registry;->j:LE1/e;

    move-object v2, v10

    move-object v3, p1

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Lcom/bumptech/glide/load/engine/i;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LP2/e;LE1/e;)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Class;LC2/d;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->b:LS2/a;

    invoke-virtual {v0, p1, p2}, LS2/a;->a(Ljava/lang/Class;LC2/d;)V

    return-object p0
.end method

.method public b(Ljava/lang/Class;LC2/j;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:LS2/f;

    invoke-virtual {v0, p1, p2}, LS2/f;->a(Ljava/lang/Class;LC2/j;)V

    return-object p0
.end method

.method public c(Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;
    .locals 1

    const-string v0, "legacy_append"

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;

    return-object p0
.end method

.method public d(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->a:LI2/p;

    invoke-virtual {v0, p1, p2, p3}, LI2/p;->a(Ljava/lang/Class;Ljava/lang/Class;LI2/o;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LC2/i;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    invoke-virtual {v0, p1, p4, p2, p3}, LS2/e;->a(Ljava/lang/String;LC2/i;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object p0
.end method

.method public g()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->g:LS2/b;

    invoke-virtual {v0}, LS2/b;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;

    invoke-direct {v0}, Lcom/bumptech/glide/Registry$NoImageHeaderParserException;-><init>()V

    throw v0
.end method

.method public h(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/engine/q;
    .locals 9

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->i:LS2/c;

    invoke-virtual {v0, p1, p2, p3}, LS2/c;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/bumptech/glide/load/engine/q;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/Registry;->i:LS2/c;

    invoke-virtual {v1, v0}, LS2/c;->c(Lcom/bumptech/glide/load/engine/q;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2, p3}, Lcom/bumptech/glide/Registry;->f(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v2

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/bumptech/glide/load/engine/q;

    iget-object v8, p0, Lcom/bumptech/glide/Registry;->j:LE1/e;

    move-object v3, v0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Lcom/bumptech/glide/load/engine/q;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LE1/e;)V

    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->i:LS2/c;

    invoke-virtual {v1, p1, p2, p3, v0}, LS2/c;->d(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/load/engine/q;)V

    :cond_2
    return-object v0
.end method

.method public i(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->a:LI2/p;

    invoke-virtual {v0, p1}, LI2/p;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;
    .locals 5

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->h:LS2/d;

    invoke-virtual {v0, p1, p2, p3}, LS2/d;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/Registry;->a:LI2/p;

    invoke-virtual {v1, p1}, LI2/p;->c(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    iget-object v3, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    invoke-virtual {v3, v2, p2}, LS2/e;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    iget-object v4, p0, Lcom/bumptech/glide/Registry;->f:LP2/f;

    invoke-virtual {v4, v3, p3}, LP2/f;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/bumptech/glide/Registry;->h:LS2/d;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, p1, p2, p3, v2}, LS2/d;->b(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V

    :cond_3
    return-object v0
.end method

.method public k(LE2/c;)LC2/j;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:LS2/f;

    invoke-interface {p1}, LE2/c;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LS2/f;->b(Ljava/lang/Class;)LC2/j;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;

    invoke-interface {p1}, LE2/c;->d()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoResultEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw v0
.end method

.method public l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->e:Lcom/bumptech/glide/load/data/f;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/data/f;->a(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    move-result-object p1

    return-object p1
.end method

.method public m(Ljava/lang/Object;)LC2/d;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->b:LS2/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LS2/a;->b(Ljava/lang/Class;)LC2/d;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/bumptech/glide/Registry$NoSourceEncoderAvailableException;-><init>(Ljava/lang/Class;)V

    throw v0
.end method

.method public n(LE2/c;)Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->d:LS2/f;

    invoke-interface {p1}, LE2/c;->d()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, LS2/f;->b(Ljava/lang/Class;)LC2/j;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public o(Lcom/bumptech/glide/load/ImageHeaderParser;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->g:LS2/b;

    invoke-virtual {v0, p1}, LS2/b;->a(Lcom/bumptech/glide/load/ImageHeaderParser;)V

    return-object p0
.end method

.method public p(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->e:Lcom/bumptech/glide/load/data/f;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/data/f;->b(Lcom/bumptech/glide/load/data/e$a;)V

    return-object p0
.end method

.method public q(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)Lcom/bumptech/glide/Registry;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/Registry;->f:LP2/f;

    invoke-virtual {v0, p1, p2, p3}, LP2/f;->c(Ljava/lang/Class;Ljava/lang/Class;LP2/e;)V

    return-object p0
.end method

.method public final r(Ljava/util/List;)Lcom/bumptech/glide/Registry;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const-string v1, "legacy_prepend_all"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string p1, "legacy_append"

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/bumptech/glide/Registry;->c:LS2/e;

    invoke-virtual {p1, v0}, LS2/e;->e(Ljava/util/List;)V

    return-object p0
.end method

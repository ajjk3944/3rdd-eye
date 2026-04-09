.class public final LV6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT2/d;
.implements LU6/a;


# instance fields
.field private final a:LS6/k;

.field private final b:Ljava/lang/Object;

.field private c:LKi/t;

.field private d:LY0/r;

.field private e:Lcom/bumptech/glide/request/c;

.field private final f:Ljava/util/List;

.field private g:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LS6/k;)V
    .locals 1

    const-string/jumbo v0, "imageOptions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/b;->a:LS6/k;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV6/b;->b:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LV6/b;->f:Ljava/util/List;

    return-void
.end method

.method private final m(J)J
    .locals 3

    iget-object v0, p0, LV6/b;->a:LS6/k;

    invoke-virtual {v0}, LS6/k;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, LS6/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    if-lez v0, :cond_0

    iget-object p1, p0, LV6/b;->a:LS6/k;

    invoke-virtual {p1}, LS6/k;->h()J

    move-result-wide p1

    return-wide p1

    :cond_0
    invoke-static {p1, p2}, LY0/b;->h(J)Z

    move-result v0

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v0

    invoke-direct {p0, v0}, LV6/b;->n(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-static {p1, p2}, LY0/b;->g(J)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v2

    invoke-direct {p0, v2}, LV6/b;->n(I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v1

    :cond_2
    invoke-static {v0, v1}, LY0/s;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method private final n(I)Z
    .locals 1

    if-gtz p1, :cond_1

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 4

    invoke-direct {p0, p1, p2}, LV6/b;->m(J)J

    move-result-wide p1

    iget-object v0, p0, LV6/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    iput-object v1, p0, LV6/b;->d:LY0/r;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, LV6/b;->f:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, LV6/b;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v2, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT2/c;

    invoke-static {p1, p2}, LY0/r;->g(J)I

    move-result v2

    invoke-static {p1, p2}, LY0/r;->f(J)I

    move-result v3

    invoke-interface {v1, v2, v3}, LT2/c;->f(II)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public d(LT2/c;)V
    .locals 2

    const-string/jumbo v0, "cb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV6/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV6/b;->f:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public e(Lcom/bumptech/glide/request/c;)V
    .locals 0

    iput-object p1, p0, LV6/b;->e:Lcom/bumptech/glide/request/c;

    return-void
.end method

.method public f()V
    .locals 0

    return-void
.end method

.method public g(Ljava/lang/Object;LU2/b;)V
    .locals 0

    const-string/jumbo p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, LV6/b;->c:LKi/t;

    if-eqz v0, :cond_0

    new-instance v1, LS6/j$a;

    iget-object v2, p0, LV6/b;->g:Ljava/lang/Throwable;

    invoke-direct {v1, p1, v2}, LS6/j$a;-><init>(Ljava/lang/Object;Ljava/lang/Throwable;)V

    invoke-static {v0, v1}, LKi/n;->b(LKi/w;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    iget-object p1, p0, LV6/b;->c:LKi/t;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LKi/t;->g()LKi/w;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public i(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object p1, p0, LV6/b;->c:LKi/t;

    if-eqz p1, :cond_0

    sget-object v0, LS6/j$b;->a:LS6/j$b;

    invoke-static {p1, v0}, LKi/n;->b(LKi/w;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    return-void
.end method

.method public j()Lcom/bumptech/glide/request/c;
    .locals 1

    iget-object v0, p0, LV6/b;->e:Lcom/bumptech/glide/request/c;

    return-object v0
.end method

.method public k(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object p1, p0, LV6/b;->c:LKi/t;

    if-eqz p1, :cond_0

    sget-object v0, LS6/j$c;->a:LS6/j$c;

    invoke-static {p1, v0}, LKi/n;->b(LKi/w;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    iget-object p1, p0, LV6/b;->c:LKi/t;

    if-eqz p1, :cond_1

    invoke-interface {p1}, LKi/t;->g()LKi/w;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public l(LT2/c;)V
    .locals 5

    const-string/jumbo v0, "cb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LV6/b;->d:LY0/r;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v0

    invoke-interface {p1, v1, v0}, LT2/c;->f(II)V

    return-void

    :cond_0
    iget-object v0, p0, LV6/b;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LV6/b;->d:LY0/r;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LY0/r;->j()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    invoke-virtual {v1}, LY0/r;->j()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v1

    invoke-interface {p1, v2, v1}, LT2/c;->f(II)V

    sget-object p1, LYg/J;->a:LYg/J;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object v1, p0, LV6/b;->f:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final o(LKi/t;)V
    .locals 1

    const-string/jumbo v0, "producerScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LV6/b;->c:LKi/t;

    return-void
.end method

.method public final p(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LV6/b;->g:Ljava/lang/Throwable;

    return-void
.end method

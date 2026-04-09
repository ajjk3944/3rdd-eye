.class public final Lzg/c;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    invoke-static {p0}, Lzg/h;->e(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-static {p0, p1}, Lzg/h;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public g(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lzg/c;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public h()V
    .locals 2

    invoke-virtual {p0}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_0

    invoke-static {v0}, LEg/a;->v(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public j(LDj/b;)V
    .locals 2

    invoke-virtual {p0}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LDj/b;->a()V

    goto :goto_0

    :cond_0
    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_1

    invoke-interface {p1, v0}, LDj/b;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public l(Lgg/d;)V
    .locals 2

    invoke-virtual {p0}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lgg/d;->a()V

    goto :goto_0

    :cond_0
    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_1

    invoke-interface {p1, v0}, Lgg/d;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public m(Lgg/h;)V
    .locals 2

    invoke-virtual {p0}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lgg/h;->a()V

    goto :goto_0

    :cond_0
    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_1

    invoke-interface {p1, v0}, Lgg/h;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public n(Lgg/x;)V
    .locals 2

    invoke-virtual {p0}, Lzg/c;->c()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lgg/x;->a()V

    goto :goto_0

    :cond_0
    sget-object v1, Lzg/h;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_1

    invoke-interface {p1, v0}, Lgg/x;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

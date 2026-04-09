.class final Lqg/O$b;
.super Lxg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/O;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final f:Lkg/n;


# direct methods
.method constructor <init>(LDj/b;Lkg/n;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg/b;-><init>(LDj/b;)V

    iput-object p2, p0, Lqg/O$b;->f:Lkg/n;

    return-void
.end method


# virtual methods
.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-boolean v0, p0, Lxg/b;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lxg/b;->e:I

    if-eqz v0, :cond_1

    iget-object p1, p0, Lxg/b;->a:LDj/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, LDj/b;->h(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lqg/O$b;->f:Lkg/n;

    invoke-interface {v0, p1}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper function returned a null value."

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lxg/b;->a:LDj/b;

    invoke-interface {v0, p1}, LDj/b;->h(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lxg/b;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lxg/b;->c:LDg/d;

    invoke-interface {v0}, LDg/g;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqg/O$b;->f:Lkg/n;

    invoke-interface {v1, v0}, Lkg/n;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper function returned a null value."

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public requestFusion(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lxg/b;->e(I)I

    move-result p1

    return p1
.end method

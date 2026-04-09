.class final Lk4/p;
.super Lk4/j;
.source "SourceFile"


# instance fields
.field final synthetic b:Landroid/os/IBinder;

.field final synthetic c:Lk4/r;


# direct methods
.method constructor <init>(Lk4/r;Landroid/os/IBinder;)V
    .locals 0

    iput-object p2, p0, Lk4/p;->b:Landroid/os/IBinder;

    iput-object p1, p0, Lk4/p;->c:Lk4/r;

    invoke-direct {p0}, Lk4/j;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lk4/p;->b:Landroid/os/IBinder;

    invoke-static {v0}, Lk4/e;->c(Landroid/os/IBinder;)Lk4/f;

    move-result-object v0

    iget-object v1, p0, Lk4/p;->c:Lk4/r;

    iget-object v1, v1, Lk4/r;->a:Lk4/t;

    invoke-static {v1, v0}, Lk4/t;->m(Lk4/t;Landroid/os/IInterface;)V

    iget-object v0, p0, Lk4/p;->c:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    invoke-static {v0}, Lk4/t;->q(Lk4/t;)V

    iget-object v0, p0, Lk4/p;->c:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lk4/t;->l(Lk4/t;Z)V

    iget-object v0, p0, Lk4/p;->c:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    invoke-static {v0}, Lk4/t;->h(Lk4/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk4/p;->c:Lk4/r;

    iget-object v0, v0, Lk4/r;->a:Lk4/t;

    invoke-static {v0}, Lk4/t;->h(Lk4/t;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

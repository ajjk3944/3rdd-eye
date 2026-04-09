.class final Lcom/google/android/play/integrity/internal/b;
.super Lcom/google/android/play/integrity/internal/G;
.source "SourceFile"


# instance fields
.field final synthetic g:Landroid/os/IBinder;

.field final synthetic h:Lcom/google/android/play/integrity/internal/e;


# direct methods
.method constructor <init>(Lcom/google/android/play/integrity/internal/e;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iput-object p2, p0, Lcom/google/android/play/integrity/internal/b;->g:Landroid/os/IBinder;

    invoke-direct {p0}, Lcom/google/android/play/integrity/internal/G;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->g(Lcom/google/android/play/integrity/internal/f;)Lcom/google/android/play/integrity/internal/M;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/b;->g:Landroid/os/IBinder;

    invoke-interface {v0, v1}, Lcom/google/android/play/integrity/internal/M;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IInterface;

    iget-object v1, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v1, v1, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v1, v0}, Lcom/google/android/play/integrity/internal/f;->n(Lcom/google/android/play/integrity/internal/f;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->r(Lcom/google/android/play/integrity/internal/f;)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/play/integrity/internal/f;->m(Lcom/google/android/play/integrity/internal/f;Z)V

    iget-object v0, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->i(Lcom/google/android/play/integrity/internal/f;)Ljava/util/List;

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
    iget-object v0, p0, Lcom/google/android/play/integrity/internal/b;->h:Lcom/google/android/play/integrity/internal/e;

    iget-object v0, v0, Lcom/google/android/play/integrity/internal/e;->a:Lcom/google/android/play/integrity/internal/f;

    invoke-static {v0}, Lcom/google/android/play/integrity/internal/f;->i(Lcom/google/android/play/integrity/internal/f;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

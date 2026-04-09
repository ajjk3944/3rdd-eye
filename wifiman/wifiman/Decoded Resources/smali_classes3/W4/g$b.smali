.class LW4/g$b;
.super LW4/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field private final b:Lf5/b;


# direct methods
.method public constructor <init>(Lf5/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, LW4/g$a;-><init>()V

    iput-object p1, p0, LW4/g$b;->b:Lf5/b;

    iput-object p2, p0, LW4/g$b;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public B(Lcom/google/android/gms/common/api/Status;LW4/a;)V
    .locals 4

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, LV4/b;

    invoke-direct {v0, p2}, LV4/b;-><init>(LW4/a;)V

    :goto_0
    iget-object v1, p0, LW4/g$b;->a:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/common/api/internal/o;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, LW4/a;->g()Landroid/os/Bundle;

    move-result-object p1

    const-string/jumbo p2, "scionData"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    iget-object p2, p0, LW4/g$b;->b:Lf5/b;

    invoke-interface {p2}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LD4/a;

    if-nez p2, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    const-string/jumbo v3, "fdl"

    invoke-interface {p2, v3, v1, v2}, LD4/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_4
    :goto_2
    return-void
.end method

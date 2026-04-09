.class public LW4/g;
.super LV4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW4/g$c;,
        LW4/g$b;,
        LW4/g$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/d;

.field private final b:Lf5/b;

.field private final c:Lcom/google/firebase/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/d;Lcom/google/firebase/f;Lf5/b;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LV4/a;-><init>()V

    .line 3
    iput-object p1, p0, LW4/g;->a:Lcom/google/android/gms/common/api/d;

    .line 4
    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/f;

    iput-object p1, p0, LW4/g;->c:Lcom/google/firebase/f;

    .line 5
    iput-object p3, p0, LW4/g;->b:Lf5/b;

    .line 6
    invoke-interface {p3}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    .line 7
    const-string/jumbo p1, "FDL"

    const-string/jumbo p2, "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/f;Lf5/b;)V
    .locals 2

    .line 1
    new-instance v0, LW4/d;

    invoke-virtual {p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LW4/d;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, p1, p2}, LW4/g;-><init>(Lcom/google/android/gms/common/api/d;Lcom/google/firebase/f;Lf5/b;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LW4/g;->a:Lcom/google/android/gms/common/api/d;

    new-instance v2, LW4/g$c;

    iget-object v3, p0, LW4/g;->b:Lf5/b;

    invoke-direct {v2, v3, v0}, LW4/g$c;-><init>(Lf5/b;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/d;->h(Lcom/google/android/gms/common/api/internal/n;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1}, LW4/g;->d(Landroid/content/Intent;)LV4/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public d(Landroid/content/Intent;)LV4/b;
    .locals 2

    const-string/jumbo v0, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"

    sget-object v1, LW4/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0, v1}, Lt3/d;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Lt3/c;

    move-result-object p1

    check-cast p1, LW4/a;

    if-eqz p1, :cond_0

    new-instance v0, LV4/b;

    invoke-direct {v0, p1}, LV4/b;-><init>(LW4/a;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

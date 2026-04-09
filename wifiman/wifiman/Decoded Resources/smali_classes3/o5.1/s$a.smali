.class public final Lo5/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lo5/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg5/e;Ldh/e;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lo5/s$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lo5/s$a$a;

    iget v1, v0, Lo5/s$a$a;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo5/s$a$a;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo5/s$a$a;

    invoke-direct {v0, p0, p2}, Lo5/s$a$a;-><init>(Lo5/s$a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Lo5/s$a$a;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo5/s$a$a;->d:I

    const-string v3, ""

    const-string/jumbo v4, "InstallationId"

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p1, v0, Lo5/s$a$a;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p2

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lo5/s$a$a;->a:Ljava/lang/Object;

    check-cast p1, Lg5/e;

    :try_start_1
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    const/4 p2, 0x0

    :try_start_2
    invoke-interface {p1, p2}, Lg5/e;->a(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    const-string/jumbo v2, "firebaseInstallations.getToken(false)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lo5/s$a$a;->a:Ljava/lang/Object;

    iput v6, v0, Lo5/s$a$a;->d:I

    invoke-static {p2, v0}, LUi/b;->a(Lcom/google/android/gms/tasks/Task;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lcom/google/firebase/installations/f;

    invoke-virtual {p2}, Lcom/google/firebase/installations/f;->b()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v2, "{\n          firebaseInst\u2026).await().token\n        }"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_3

    :goto_2
    const-string/jumbo v2, "Error getting authentication token."

    invoke-static {v4, v2, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p2, p1

    move-object p1, v3

    :goto_3
    :try_start_3
    invoke-interface {p2}, Lg5/e;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    const-string/jumbo v2, "firebaseInstallations.id"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v0, Lo5/s$a$a;->a:Ljava/lang/Object;

    iput v5, v0, Lo5/s$a$a;->d:I

    invoke-static {p2, v0}, LUi/b;->a(Lcom/google/android/gms/tasks/Task;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_4
    const-string/jumbo v0, "{\n          firebaseInst\u2026ions.id.await()\n        }"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v3, p2

    goto :goto_6

    :goto_5
    const-string/jumbo v0, "Error getting Firebase installation id ."

    invoke-static {v4, v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    new-instance p2, Lo5/s;

    const/4 v0, 0x0

    invoke-direct {p2, v3, p1, v0}, Lo5/s;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p2
.end method

.class public final Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;
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
    invoke-direct {p0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;-><init>()V

    return-void
.end method

.method public static synthetic a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a;->c(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final c(ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    const/4 v1, 0x0

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$d;

    invoke-direct {p0, p1, p2}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1}, LX8/a;->b(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;

    invoke-direct {p0, p1, p2}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v1}, LX8/a;->d(Lmh/a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$b;

    invoke-direct {p0, p1, p2}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, LX8/a;->c(Lmh/a;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->d()Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/ui/btle/rxandroidble/a;->a:Lcom/ui/btle/rxandroidble/a;

    invoke-virtual {v0}, Lcom/ui/btle/rxandroidble/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LG6/B$a;

    invoke-direct {v0}, LG6/B$a;-><init>()V

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LG6/B$a;->b(Ljava/lang/Integer;)LG6/B$a;

    move-result-object v0

    new-instance v1, LU8/b;

    invoke-direct {v1}, LU8/b;-><init>()V

    invoke-virtual {v0, v1}, LG6/B$a;->c(LG6/B$b;)LG6/B$a;

    move-result-object v0

    invoke-virtual {v0}, LG6/B$a;->a()LG6/B;

    move-result-object v0

    invoke-static {v0}, LI6/q;->o(LG6/B;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;->a:Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle$a$a;

    invoke-static {v0}, LX8/a;->c(Lmh/a;)V

    new-instance v0, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    invoke-static {p1}, LG6/G;->a(Landroid/content/Context;)LG6/G;

    move-result-object p1

    const-string/jumbo v1, "create(context)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;-><init>(LG6/G;)V

    invoke-static {v0}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->e(Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;)V

    :cond_1
    invoke-static {}, Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;->d()Lcom/ui/btle/rxandroidble/BTLEv2RxAndroidBle;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.class final Lcom/wireguard/android/backend/GoBackend$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/wireguard/android/backend/GoBackend;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/LinkedBlockingQueue;

.field private final b:Ljava/util/concurrent/FutureTask;


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/wireguard/android/backend/GoBackend$c;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 3
    new-instance v1, Ljava/util/concurrent/FutureTask;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, LWf/b;

    invoke-direct {v2, v0}, LWf/b;-><init>(Ljava/util/concurrent/LinkedBlockingQueue;)V

    invoke-direct {v1, v2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    iput-object v1, p0, Lcom/wireguard/android/backend/GoBackend$c;->b:Ljava/util/concurrent/FutureTask;

    return-void
.end method

.method synthetic constructor <init>(Lcom/wireguard/android/backend/GoBackend$a;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/wireguard/android/backend/GoBackend$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend$c;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend$c;->b:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->run()V

    :cond_0
    return p1
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend$c;->b:Ljava/util/concurrent/FutureTask;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/wireguard/android/backend/GoBackend$c;->a:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public d()Lcom/wireguard/android/backend/GoBackend$c;
    .locals 1

    new-instance v0, Lcom/wireguard/android/backend/GoBackend$c;

    invoke-direct {v0}, Lcom/wireguard/android/backend/GoBackend$c;-><init>()V

    return-object v0
.end method

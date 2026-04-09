.class public final Lp7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp7/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lgg/y;
    .locals 2

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-static {v0}, LGg/a;->b(Ljava/util/concurrent/Executor;)Lgg/y;

    move-result-object v0

    const-string/jumbo v1, "from(Executors.newSingleThreadExecutor())"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.class public final Lwt;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lvp0;


# static fields
.field public static final d:Li80;

.field public static final e:Ljava/time/Duration;

.field public static final f:Ljava/time/Duration;


# instance fields
.field public final a:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final b:I

.field public final c:Ljava/time/Duration;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-class v0, Lwt;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lwt;->d:Li80;

    .line 8
    .line 9
    const-wide/16 v0, 0xa

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lwt;->e:Ljava/time/Duration;

    .line 16
    .line 17
    const-wide/16 v0, 0x5

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lwt;->f:Ljava/time/Duration;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lwt;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    iput v1, p0, Lwt;->b:I

    .line 18
    .line 19
    sget-object v1, Lwt;->e:Ljava/time/Duration;

    .line 20
    .line 21
    iput-object v1, p0, Lwt;->c:Ljava/time/Duration;

    .line 22
    .line 23
    invoke-static {}, Lwp0;->a()Lwp0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget-object v1, v1, Lwp0;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Lmp;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v2, v3}, Lmp;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Collection;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Lme0;)Ljava/util/concurrent/CompletionStage;
    .locals 4

    .line 1
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lut;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lut;-><init>(Lwt;Lme0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lut;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletionStage;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v2, Lst;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, v1, v0, v3}, Lst;-><init>(Lut;Ljava/util/concurrent/Executor;I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v2}, Ljava/util/concurrent/CompletionStage;->handle(Ljava/util/function/BiFunction;)Ljava/util/concurrent/CompletionStage;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {}, Ljava/util/function/Function;->identity()Ljava/util/function/Function;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-interface {p1, v0}, Ljava/util/concurrent/CompletionStage;->thenCompose(Ljava/util/function/Function;)Ljava/util/concurrent/CompletionStage;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final b()Ljava/time/Duration;
    .locals 1

    .line 1
    iget-object v0, p0, Lwt;->c:Ljava/time/Duration;

    .line 2
    .line 3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ExtendedResolver of "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lwt;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

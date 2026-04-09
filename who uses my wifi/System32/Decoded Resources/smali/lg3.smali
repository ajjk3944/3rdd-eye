.class public final Llg3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Ljava/util/concurrent/ExecutorService;

.field public final c:Lkg3;

.field public final d:Ljava/util/function/Function;


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lkg3;Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llg3;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    iput-object p3, p0, Llg3;->c:Lkg3;

    .line 9
    .line 10
    iput-object p4, p0, Llg3;->d:Ljava/util/function/Function;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lar3;
    .locals 2

    .line 1
    new-instance v0, Lgs1;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, Lgs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Llg3;->b:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    invoke-static {v0, p1}, Lpu1;->D(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lar3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

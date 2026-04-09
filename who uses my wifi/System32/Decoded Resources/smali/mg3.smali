.class public final Lmg3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;[BLjava/util/function/Function;)Llg3;
    .locals 3

    .line 1
    new-instance v0, Llg3;

    .line 2
    .line 3
    new-instance v1, Lrc3;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2, p2}, Lrc3;-><init>(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lmg3;->a:Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    invoke-direct {v0, p1, p2, v1, p3}, Llg3;-><init>(Ljava/io/File;Ljava/util/concurrent/ExecutorService;Lkg3;Ljava/util/function/Function;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.class public final Lgu1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljt1;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public volatile d:Ljava/lang/reflect/Method;

.field public final e:[Ljava/lang/Class;

.field public final f:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public varargs constructor <init>(Ljt1;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lgu1;->d:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lgu1;->f:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    iput-object p1, p0, Lgu1;->a:Ljt1;

    .line 16
    .line 17
    iput-object p2, p0, Lgu1;->b:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p3, p0, Lgu1;->c:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p4, p0, Lgu1;->e:[Ljava/lang/Class;

    .line 22
    .line 23
    iget-object p1, p1, Ljt1;->b:Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    new-instance p2, Lfu1;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    invoke-direct {p2, p3, p0}, Lfu1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 32
    .line 33
    .line 34
    return-void
.end method

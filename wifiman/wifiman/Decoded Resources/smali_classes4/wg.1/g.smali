.class public final Lwg/g;
.super Lgg/y;
.source "SourceFile"


# static fields
.field private static final d:Lwg/j;


# instance fields
.field final c:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "rx3.newthread-priority"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v1, Lwg/j;

    const-string v2, "RxNewThreadScheduler"

    invoke-direct {v1, v2, v0}, Lwg/j;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwg/g;->d:Lwg/j;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lwg/g;->d:Lwg/j;

    invoke-direct {p0, v0}, Lwg/g;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lgg/y;-><init>()V

    .line 3
    iput-object p1, p0, Lwg/g;->c:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method


# virtual methods
.method public c()Lgg/y$c;
    .locals 2

    new-instance v0, Lwg/h;

    iget-object v1, p0, Lwg/g;->c:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1}, Lwg/h;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-object v0
.end method

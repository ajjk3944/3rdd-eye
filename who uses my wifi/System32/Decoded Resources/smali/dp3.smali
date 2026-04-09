.class public final Ldp3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Ldp3;


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:Ljava/util/concurrent/Executor;

.field public c:Ldp3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldp3;

    .line 2
    .line 3
    invoke-direct {v0}, Ldp3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldp3;->d:Ldp3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ldp3;->a:Ljava/lang/Runnable;

    iput-object v0, p0, Ldp3;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldp3;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Ldp3;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

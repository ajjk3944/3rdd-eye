.class public final Lu93;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final d:Llq3;


# instance fields
.field public final a:Lpq3;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lt93;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Llq3;->g:Llq3;

    .line 2
    .line 3
    sput-object v0, Lu93;->d:Llq3;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lpq3;Ljava/util/concurrent/ScheduledExecutorService;Lt93;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu93;->a:Lpq3;

    .line 5
    .line 6
    iput-object p2, p0, Lu93;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    iput-object p3, p0, Lu93;->c:Lt93;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ln70;Ljava/lang/Object;)Lbu1;
    .locals 7

    .line 1
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v5

    .line 5
    new-instance v0, Lbu1;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v6, p1

    .line 9
    move-object v1, p0

    .line 10
    move-object v4, p1

    .line 11
    move-object v2, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lbu1;-><init>(Lu93;Ljava/lang/Object;Ljava/lang/String;Ln70;Ljava/util/List;Ln70;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

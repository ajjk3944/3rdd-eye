.class public abstract Landroidx/work/impl/WorkDatabase;
.super Lpq0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final j:J

.field public static final synthetic k:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Landroidx/work/impl/WorkDatabase;->j:J

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpq0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract i()Ll92;
.end method

.method public abstract j()Ll92;
.end method

.method public abstract k()Lt83;
.end method

.method public abstract l()Lgw3;
.end method

.method public abstract m()Lmc2;
.end method

.method public abstract n()Lh2;
.end method

.method public abstract o()Ll92;
.end method

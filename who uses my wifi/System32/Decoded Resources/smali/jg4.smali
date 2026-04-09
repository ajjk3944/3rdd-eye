.class public final Ljg4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final f:Ljg4;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Lts;

.field public e:J


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ljg4;

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    move-wide v3, v1

    .line 9
    move-wide v5, v1

    .line 10
    invoke-direct/range {v0 .. v6}, Ljg4;-><init>(JJJ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ljg4;->f:Ljg4;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Ljg4;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Ljg4;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, Ljg4;->c:J

    .line 9
    .line 10
    new-instance p1, Lts;

    .line 11
    .line 12
    invoke-direct {p1}, Lts;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ljg4;->d:Lts;

    .line 16
    .line 17
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    iput-wide p1, p0, Ljg4;->e:J

    .line 23
    .line 24
    return-void
.end method

.class public abstract Lck1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Lyj1;

.field public b:Ljg1;

.field public c:Lnf1;

.field public d:Lak1;

.field public e:J

.field public f:J

.field public g:J

.field public h:I

.field public i:I

.field public j:Ll92;

.field public k:J

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyj1;

    .line 5
    .line 6
    invoke-direct {v0}, Lyj1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lck1;->a:Lyj1;

    .line 10
    .line 11
    new-instance v0, Ll92;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lck1;->j:Ll92;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance p1, Ll92;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lck1;->j:Ll92;

    .line 11
    .line 12
    iput-wide v0, p0, Lck1;->f:J

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :goto_0
    iput p1, p0, Lck1;->h:I

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const-wide/16 v2, -0x1

    .line 21
    .line 22
    iput-wide v2, p0, Lck1;->e:J

    .line 23
    .line 24
    iput-wide v0, p0, Lck1;->g:J

    .line 25
    .line 26
    return-void
.end method

.method public abstract b(Lkz2;)J
.end method

.method public abstract c(Lkz2;JLl92;)Z
.end method

.method public d(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lck1;->g:J

    .line 2
    .line 3
    return-void
.end method

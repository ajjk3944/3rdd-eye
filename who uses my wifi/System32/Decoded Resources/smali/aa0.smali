.class public final Laa0;
.super Lmi0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final i:Lni0;


# instance fields
.field public g:F

.field public h:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Laa0;

    .line 2
    .line 3
    invoke-direct {v0}, Laa0;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    invoke-static {v1, v0}, Lni0;->a(ILmi0;)Lni0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Laa0;->i:Lni0;

    .line 13
    .line 14
    const/high16 v1, 0x3f000000    # 0.5f

    .line 15
    .line 16
    iput v1, v0, Lni0;->f:F

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lmi0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Laa0;->g:F

    .line 6
    .line 7
    iput v0, p0, Laa0;->h:F

    .line 8
    .line 9
    return-void
.end method

.method public static b(FF)Laa0;
    .locals 1

    .line 1
    sget-object v0, Laa0;->i:Lni0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lni0;->b()Lmi0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Laa0;

    .line 8
    .line 9
    iput p0, v0, Laa0;->g:F

    .line 10
    .line 11
    iput p1, v0, Laa0;->h:F

    .line 12
    .line 13
    return-object v0
.end method


# virtual methods
.method public final a()Lmi0;
    .locals 1

    .line 1
    new-instance v0, Laa0;

    .line 2
    .line 3
    invoke-direct {v0}, Laa0;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

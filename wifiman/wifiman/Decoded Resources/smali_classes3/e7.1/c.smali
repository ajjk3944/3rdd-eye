.class public final Le7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le7/c;

    invoke-direct {v0}, Le7/c;-><init>()V

    sput-object v0, Le7/c;->a:Le7/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/Frame;[F)Le7/a;
    .locals 6

    const-string/jumbo v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "sightVectorInitial"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/ar/core/Frame;->getCamera()Lcom/google/ar/core/Camera;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/ar/core/Camera;->getDisplayOrientedPose()Lcom/google/ar/core/Pose;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/google/ar/core/Pose;->rotateVector([F)[F

    move-result-object v0

    const/4 v1, 0x2

    aget v2, v0, v1

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    aput v2, v0, v1

    const/16 v3, 0x5a

    int-to-float v3, v3

    aget v1, p2, v1

    sub-float/2addr v2, v1

    float-to-double v1, v2

    const/4 v4, 0x0

    aget v0, v0, v4

    aget p2, p2, v4

    sub-float/2addr v0, p2

    float-to-double v4, v0

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    double-to-float p2, v0

    float-to-double v0, p2

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float p2, v0

    sub-float/2addr v3, p2

    new-instance p2, Le7/a;

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->tx()F

    move-result v0

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->ty()F

    move-result v1

    invoke-virtual {p1}, Lcom/google/ar/core/Pose;->tz()F

    move-result p1

    invoke-direct {p2, v0, v1, p1, v3}, Le7/a;-><init>(FFFF)V

    return-object p2
.end method

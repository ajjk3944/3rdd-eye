.class public final LW7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LW7/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LW7/a;
    .locals 3

    new-instance v0, LW7/a;

    int-to-long v1, p1

    invoke-direct {v0, v1, v2}, LW7/a;-><init>(J)V

    return-object v0
.end method

.method public final b(J)LW7/a;
    .locals 1

    new-instance v0, LW7/a;

    invoke-direct {v0, p1, p2}, LW7/a;-><init>(J)V

    return-object v0
.end method

.method public final c(F)LW7/a;
    .locals 3

    new-instance v0, LW7/a;

    const v1, 0xf4240

    int-to-float v1, v1

    mul-float/2addr p1, v1

    invoke-static {p1}, Loh/b;->g(F)J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, LW7/a;-><init>(J)V

    return-object v0
.end method

.method public final d(I)LW7/a;
    .locals 5

    new-instance v0, LW7/a;

    int-to-long v1, p1

    const-wide/32 v3, 0xf4240

    mul-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, LW7/a;-><init>(J)V

    return-object v0
.end method

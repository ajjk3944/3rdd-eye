.class public final LU7/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU7/a;
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
    invoke-direct {p0}, LU7/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LU7/a;
    .locals 2

    const/4 v0, 0x0

    if-ltz p1, :cond_0

    return-object v0

    :cond_0
    const/16 v1, -0x64

    if-gt p1, v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, LU7/a;

    const/16 v1, -0x14

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/16 v1, -0x5a

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {v0, p1}, LU7/a;-><init>(I)V

    return-object v0
.end method

.method public final b()LU7/a;
    .locals 2

    new-instance v0, LU7/a;

    const/16 v1, -0x5a

    invoke-direct {v0, v1}, LU7/a;-><init>(I)V

    return-object v0
.end method

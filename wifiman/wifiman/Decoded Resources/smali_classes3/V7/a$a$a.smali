.class public final LV7/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV7/a$a;
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
    invoke-direct {p0}, LV7/a$a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)LV7/a$a;
    .locals 2

    const/16 v0, -0xa

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    return-object v1

    :cond_0
    const/16 v0, -0x96

    if-gt p1, v0, :cond_1

    return-object v1

    :cond_1
    new-instance v0, LV7/a$a;

    const/16 v1, -0x32

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/16 v1, -0x6e

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-direct {v0, p1}, LV7/a$a;-><init>(I)V

    return-object v0
.end method

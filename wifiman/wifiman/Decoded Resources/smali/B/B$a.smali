.class final LB/B$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
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
    invoke-direct {p0}, LB/B$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LB/B$a;III)Lsh/i;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LB/B$a;->b(III)Lsh/i;

    move-result-object p0

    return-object p0
.end method

.method private final b(III)Lsh/i;
    .locals 2

    div-int/2addr p1, p2

    mul-int/2addr p1, p2

    sub-int v0, p1, p3

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p1, p2

    add-int/2addr p1, p3

    invoke-static {v0, p1}, Lsh/m;->s(II)Lsh/i;

    move-result-object p1

    return-object p1
.end method

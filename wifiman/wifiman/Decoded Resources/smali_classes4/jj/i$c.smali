.class public final Ljj/i$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljj/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
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
    invoke-direct {p0}, Ljj/i$c;-><init>()V

    return-void
.end method

.method public static final synthetic a(Ljj/i$c;IFJF)F
    .locals 0

    invoke-direct/range {p0 .. p5}, Ljj/i$c;->b(IFJF)F

    move-result p0

    return p0
.end method

.method private final b(IFJF)F
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr v1, v2

    int-to-float p1, p1

    div-float/2addr v1, p1

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result v1

    mul-float/2addr v1, p5

    invoke-static {}, Ljj/i;->d()Lmh/l;

    move-result-object p5

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p5, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    mul-float/2addr v1, p1

    const-wide/16 v3, 0x5dc

    cmp-long p1, p3, v3

    if-lez p1, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    long-to-float p1, p3

    long-to-float p3, v3

    div-float/2addr p1, p3

    :goto_0
    invoke-static {}, Ljj/i;->c()Lmh/l;

    move-result-object p3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p3, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    mul-float/2addr v1, p1

    cmpg-float p1, v1, v0

    if-nez p1, :cond_3

    cmpl-float p1, p2, v0

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    return v2
.end method

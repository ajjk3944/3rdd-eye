.class public final Lm0/v0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/v0;
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
    invoke-direct {p0}, Lm0/v0$a;-><init>()V

    return-void
.end method

.method public static synthetic h(Lm0/v0$a;FFFFLn0/x;ILjava/lang/Object;)J
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/high16 p4, 0x3f800000    # 1.0f

    :cond_0
    move v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    sget-object p4, Ln0/g;->a:Ln0/g;

    invoke-virtual {p4}, Ln0/g;->w()Ln0/x;

    move-result-object p5

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lm0/v0$a;->g(FFFFLn0/x;)J

    move-result-wide p0

    return-wide p0
.end method

.method private final i(IFFF)F
    .locals 2

    int-to-float p1, p1

    const/high16 v0, 0x41f00000    # 30.0f

    div-float/2addr p2, v0

    add-float/2addr p1, p2

    const/high16 p2, 0x41400000    # 12.0f

    rem-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float v0, p2, p4

    invoke-static {p4, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    mul-float/2addr p3, v0

    const/4 v0, 0x3

    int-to-float v0, v0

    sub-float v0, p1, v0

    const/16 v1, 0x9

    int-to-float v1, v1

    sub-float/2addr v1, p1

    invoke-static {v1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    invoke-static {p2, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    mul-float/2addr p3, p1

    sub-float/2addr p4, p3

    return p4
.end method


# virtual methods
.method public final a()J
    .locals 2

    invoke-static {}, Lm0/v0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b()J
    .locals 2

    invoke-static {}, Lm0/v0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()J
    .locals 2

    invoke-static {}, Lm0/v0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()J
    .locals 2

    invoke-static {}, Lm0/v0;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e()J
    .locals 2

    invoke-static {}, Lm0/v0;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 2

    invoke-static {}, Lm0/v0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(FFFFLn0/x;)J
    .locals 4

    const/4 v0, 0x0

    cmpg-float v1, v0, p1

    const/4 v2, 0x0

    if-gtz v1, :cond_0

    const/high16 v1, 0x43b40000    # 360.0f

    cmpg-float v1, p1, v1

    if-gtz v1, :cond_0

    cmpg-float v1, v0, p2

    if-gtz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v3, p2, v1

    if-gtz v3, :cond_0

    cmpg-float v0, v0, p3

    if-gtz v0, :cond_0

    cmpg-float v0, p3, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HSL ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ") must be in range (0..360, 0..1, 0..1)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm0/M0;->a(Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0, v2, p1, p2, p3}, Lm0/v0$a;->i(IFFF)F

    move-result v0

    const/16 v1, 0x8

    invoke-direct {p0, v1, p1, p2, p3}, Lm0/v0$a;->i(IFFF)F

    move-result v1

    const/4 v2, 0x4

    invoke-direct {p0, v2, p1, p2, p3}, Lm0/v0$a;->i(IFFF)F

    move-result p1

    invoke-static {v0, v1, p1, p4, p5}, Lm0/x0;->a(FFFFLn0/c;)J

    move-result-wide p1

    return-wide p1
.end method

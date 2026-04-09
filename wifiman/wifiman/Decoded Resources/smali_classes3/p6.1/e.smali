.class public final Lp6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp6/e$a;
    }
.end annotation


# static fields
.field public static final a:Lp6/e;

.field private static final b:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp6/e;

    invoke-direct {v0}, Lp6/e;-><init>()V

    sput-object v0, Lp6/e;->a:Lp6/e;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Lp6/e;->b:Landroid/graphics/RectF;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(FFFFLp6/b;Landroid/graphics/Path;)V
    .locals 3

    const-string/jumbo v0, "cornerLocation"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp6/e$a;->a:[I

    invoke-virtual {p5}, Ljava/lang/Enum;->ordinal()I

    move-result p5

    aget p5, v0, p5

    const/4 v0, 0x1

    const/high16 v1, 0x42b40000    # 90.0f

    const/4 v2, 0x2

    if-eq p5, v0, :cond_3

    if-eq p5, v2, :cond_2

    const/4 v0, 0x3

    if-eq p5, v0, :cond_1

    const/4 v0, 0x4

    if-ne p5, v0, :cond_0

    sget-object p5, Lp6/e;->b:Landroid/graphics/RectF;

    int-to-float v0, v2

    mul-float/2addr p4, v0

    sub-float/2addr p4, p2

    mul-float/2addr p1, v0

    sub-float/2addr p1, p3

    invoke-virtual {p5, p3, p4, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    move p1, v1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p5, Lp6/e;->b:Landroid/graphics/RectF;

    int-to-float v0, v2

    mul-float/2addr p3, v0

    sub-float/2addr p3, p1

    mul-float/2addr p2, v0

    sub-float/2addr p2, p4

    invoke-virtual {p5, p3, p2, p1, p4}, Landroid/graphics/RectF;->set(FFFF)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    sget-object p5, Lp6/e;->b:Landroid/graphics/RectF;

    int-to-float v0, v2

    mul-float/2addr p1, v0

    sub-float/2addr p1, p3

    mul-float/2addr p4, v0

    sub-float/2addr p4, p2

    invoke-virtual {p5, p1, p2, p3, p4}, Landroid/graphics/RectF;->set(FFFF)V

    const/high16 p1, 0x43870000    # 270.0f

    goto :goto_0

    :cond_3
    sget-object p5, Lp6/e;->b:Landroid/graphics/RectF;

    int-to-float v0, v2

    mul-float/2addr p3, v0

    sub-float/2addr p3, p1

    mul-float/2addr p2, v0

    sub-float/2addr p2, p4

    invoke-virtual {p5, p1, p4, p3, p2}, Landroid/graphics/RectF;->set(FFFF)V

    const/high16 p1, 0x43340000    # 180.0f

    :goto_0
    sget-object p2, Lp6/e;->b:Landroid/graphics/RectF;

    invoke-virtual {p6, p2, p1, v1}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    return-void
.end method

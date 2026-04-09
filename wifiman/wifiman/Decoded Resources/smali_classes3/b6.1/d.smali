.class public final Lb6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh6/a$a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb6/d$a;
    }
.end annotation


# static fields
.field private static final b:Lb6/d$a;


# instance fields
.field private final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb6/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lb6/d;->b:Lb6/d$a;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lb6/d;->a:F

    return-void
.end method

.method public synthetic constructor <init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lb6/d;-><init>(F)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Path;FFFFLj6/b;Landroid/graphics/RectF;)V
    .locals 6

    const-string/jumbo v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "segmentProperties"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bounds"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p6}, Lj6/b;->e()F

    move-result p6

    iget v0, p0, Lb6/d;->a:F

    mul-float/2addr p6, v0

    sub-float v0, p5, p3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget p7, p7, Landroid/graphics/RectF;->bottom:F

    div-float/2addr v0, p7

    const/4 p7, 0x4

    int-to-float p7, p7

    mul-float/2addr v0, p7

    const/high16 p7, 0x3f800000    # 1.0f

    invoke-static {v0, p7}, Lsh/m;->f(FF)F

    move-result p7

    mul-float v5, p6, p7

    move-object v0, p1

    move v1, p2

    move v2, p3

    move v3, p4

    move v4, p5

    invoke-static/range {v0 .. v5}, Lq6/a;->a(Landroid/graphics/Path;FFFFF)V

    return-void
.end method

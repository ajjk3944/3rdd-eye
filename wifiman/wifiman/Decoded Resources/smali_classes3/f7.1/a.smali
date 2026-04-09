.class public final Lf7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf7/a$a;,
        Lf7/a$b;
    }
.end annotation


# static fields
.field public static final i:Lf7/a$a;


# instance fields
.field private final a:Lf7/a$b;

.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:I

.field private g:I

.field private h:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lf7/a;->i:Lf7/a$a;

    return-void
.end method

.method public constructor <init>(Lf7/a$b;)V
    .locals 1

    const-string/jumbo v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/a;->a:Lf7/a$b;

    const/4 p1, -0x1

    iput p1, p0, Lf7/a;->f:I

    iput p1, p0, Lf7/a;->g:I

    return-void
.end method

.method private final a(FFFFFFFF)F
    .locals 2

    sub-float/2addr p2, p4

    float-to-double v0, p2

    sub-float/2addr p1, p3

    float-to-double p1, p1

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p1

    double-to-float p1, p1

    sub-float/2addr p6, p8

    float-to-double p2, p6

    sub-float/2addr p5, p7

    float-to-double p4, p5

    invoke-static {p2, p3, p4, p5}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p2

    double-to-float p2, p2

    sub-float/2addr p1, p2

    float-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p1

    double-to-float p1, p1

    const/16 p2, 0x168

    int-to-float p2, p2

    rem-float/2addr p1, p2

    const/high16 p2, -0x3ccc0000    # -180.0f

    cmpg-float p2, p1, p2

    const/high16 p3, 0x43b40000    # 360.0f

    if-gez p2, :cond_0

    add-float/2addr p1, p3

    :cond_0
    const/high16 p2, 0x43340000    # 180.0f

    cmpl-float p2, p1, p2

    if-lez p2, :cond_1

    sub-float/2addr p1, p3

    :cond_1
    return p1
.end method


# virtual methods
.method public final b(Landroid/view/MotionEvent;)Z
    .locals 13

    const-string/jumbo v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_9

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v0, v1, :cond_8

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v4, 0x3

    if-eq v0, v4, :cond_4

    const/4 v2, 0x5

    if-eq v0, v2, :cond_1

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    iput v3, p0, Lf7/a;->g:I

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lf7/a;->g:I

    iget v0, p0, Lf7/a;->f:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    iget v2, p0, Lf7/a;->g:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-eq v0, v3, :cond_3

    if-ne v2, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    iput v3, p0, Lf7/a;->d:F

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    iput v0, p0, Lf7/a;->e:F

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    iput v0, p0, Lf7/a;->b:F

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Lf7/a;->c:F

    goto :goto_2

    :cond_3
    :goto_0
    iput v3, p0, Lf7/a;->f:I

    iput v3, p0, Lf7/a;->g:I

    goto :goto_2

    :cond_4
    iput v3, p0, Lf7/a;->f:I

    iput v3, p0, Lf7/a;->g:I

    iput v2, p0, Lf7/a;->h:F

    goto :goto_2

    :cond_5
    iget v0, p0, Lf7/a;->f:I

    if-eq v0, v3, :cond_a

    iget v2, p0, Lf7/a;->g:I

    if-eq v2, v3, :cond_a

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    iget v2, p0, Lf7/a;->g:I

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-eq v0, v3, :cond_7

    if-ne v2, v3, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v11

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v12

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v10

    iget v5, p0, Lf7/a;->b:F

    iget v6, p0, Lf7/a;->c:F

    iget v7, p0, Lf7/a;->d:F

    iget v8, p0, Lf7/a;->e:F

    move-object v4, p0

    invoke-direct/range {v4 .. v12}, Lf7/a;->a(FFFFFFFF)F

    move-result p1

    iget-object v0, p0, Lf7/a;->a:Lf7/a$b;

    iget v2, p0, Lf7/a;->h:F

    sub-float v3, v2, p1

    invoke-interface {v0, v2, v3}, Lf7/a$b;->a(FF)V

    iput p1, p0, Lf7/a;->h:F

    goto :goto_2

    :cond_7
    :goto_1
    iput v3, p0, Lf7/a;->f:I

    iput v3, p0, Lf7/a;->g:I

    goto :goto_2

    :cond_8
    iput v3, p0, Lf7/a;->f:I

    iput v2, p0, Lf7/a;->h:F

    goto :goto_2

    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Lf7/a;->f:I

    :cond_a
    :goto_2
    return v1
.end method

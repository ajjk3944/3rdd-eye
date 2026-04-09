.class final LTe/F;
.super Lo6/d;
.source "SourceFile"


# instance fields
.field private final l:F


# direct methods
.method public constructor <init>(Lo6/c;FI)V
    .locals 10

    const-string v0, "shape"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x3c

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p3

    invoke-direct/range {v1 .. v9}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p2, p0, LTe/F;->l:F

    return-void
.end method


# virtual methods
.method public b(Lu6/b;FFFF)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object v0

    iget v1, p0, LTe/F;->l:F

    sub-float v2, p4, p2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    add-float/2addr v2, p2

    sub-float v4, p5, p3

    div-float/2addr v4, v3

    add-float/2addr v4, p3

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    move-result v3

    invoke-virtual {v0, v1, v2, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    :try_start_0
    invoke-super/range {p0 .. p5}, Lo6/d;->b(Lu6/b;FFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    throw p1
.end method

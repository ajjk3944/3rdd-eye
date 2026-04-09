.class public final Lw/e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final b:F

.field private final c:F

.field private final d:Lr/i;


# direct methods
.method constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Lw/e$b;->b:F

    new-instance v0, Lr/x;

    const v1, 0x3dcccccd    # 0.1f

    const/high16 v2, 0x3f800000    # 1.0f

    const/high16 v3, 0x3e800000    # 0.25f

    invoke-direct {v0, v3, v1, v3, v2}, Lr/x;-><init>(FFFF)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/16 v3, 0x7d

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v1, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    iput-object v0, p0, Lw/e$b;->d:Lr/i;

    return-void
.end method


# virtual methods
.method public a(FFF)F
    .locals 3

    add-float/2addr p2, p1

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpg-float v0, p2, p3

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lw/e$b;->b:F

    mul-float/2addr v1, p3

    iget v2, p0, Lw/e$b;->c:F

    mul-float/2addr v2, p2

    sub-float/2addr v1, v2

    sub-float v2, p3, v1

    if-eqz v0, :cond_1

    cmpg-float v0, v2, p2

    if-gez v0, :cond_1

    sub-float v1, p3, p2

    :cond_1
    sub-float/2addr p1, v1

    return p1
.end method

.method public b()Lr/i;
    .locals 1

    iget-object v0, p0, Lw/e$b;->d:Lr/i;

    return-object v0
.end method

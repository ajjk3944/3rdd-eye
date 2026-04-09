.class final Landroidx/compose/ui/layout/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/layout/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private a:LY0/t;

.field private b:F

.field private c:F

.field final synthetic d:Landroidx/compose/ui/layout/h;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/h;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$c;->d:Landroidx/compose/ui/layout/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LY0/t;->Rtl:LY0/t;

    iput-object p1, p0, Landroidx/compose/ui/layout/h$c;->a:LY0/t;

    return-void
.end method


# virtual methods
.method public Q1(Ljava/lang/Object;Lmh/p;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c;->d:Landroidx/compose/ui/layout/h;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/ui/layout/h;->K(Ljava/lang/Object;Lmh/p;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public a1()Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c;->d:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/G$e;->LookaheadLayingOut:LE0/G$e;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c;->d:Landroidx/compose/ui/layout/h;

    invoke-static {v0}, Landroidx/compose/ui/layout/h;->k(Landroidx/compose/ui/layout/h;)LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->W()LE0/G$e;

    move-result-object v0

    sget-object v1, LE0/G$e;->LookaheadMeasuring:LE0/G$e;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public b(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h$c;->b:F

    return-void
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/h$c;->b:F

    return v0
.end method

.method public getLayoutDirection()LY0/t;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/layout/h$c;->a:LY0/t;

    return-object v0
.end method

.method public i1(IILjava/util/Map;Lmh/l;Lmh/l;)LC0/D;
    .locals 9

    const/high16 v0, -0x1000000

    and-int v1, p1, v0

    if-nez v1, :cond_0

    and-int/2addr v0, p2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Size("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") is out of range. Each dimension must be between 0 and 16777215."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LB0/a;->b(Ljava/lang/String;)V

    :cond_1
    new-instance v0, Landroidx/compose/ui/layout/h$c$a;

    iget-object v7, p0, Landroidx/compose/ui/layout/h$c;->d:Landroidx/compose/ui/layout/h;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p0

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Landroidx/compose/ui/layout/h$c$a;-><init>(IILjava/util/Map;Lmh/l;Landroidx/compose/ui/layout/h$c;Landroidx/compose/ui/layout/h;Lmh/l;)V

    return-object v0
.end method

.method public p(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/layout/h$c;->c:F

    return-void
.end method

.method public q(LY0/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/h$c;->a:LY0/t;

    return-void
.end method

.method public y()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/h$c;->c:F

    return v0
.end method

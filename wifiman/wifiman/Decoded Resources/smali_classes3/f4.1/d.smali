.class public abstract Lf4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Lf4/m;FFF)V
.end method

.method public b(Lf4/m;FFLandroid/graphics/RectF;Lf4/c;)V
    .locals 0

    invoke-interface {p5, p4}, Lf4/c;->a(Landroid/graphics/RectF;)F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lf4/d;->a(Lf4/m;FFF)V

    return-void
.end method

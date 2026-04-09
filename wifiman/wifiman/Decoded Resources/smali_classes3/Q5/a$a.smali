.class public final LQ5/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ5/a;->b(Lm0/i1;)Lo6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:LYg/m;

.field private final b:LYg/m;

.field final synthetic c:Lm0/i1;


# direct methods
.method constructor <init>(Lm0/i1;)V
    .locals 0

    iput-object p1, p0, LQ5/a$a;->c:Lm0/i1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, LQ5/a$a$b;->a:LQ5/a$a$b;

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LQ5/a$a;->a:LYg/m;

    sget-object p1, LQ5/a$a$a;->a:LQ5/a$a$a;

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LQ5/a$a;->b:LYg/m;

    return-void
.end method

.method private final b()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, LQ5/a$a;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    return-object v0
.end method

.method private final c()[F
    .locals 1

    iget-object v0, p0, LQ5/a$a;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method


# virtual methods
.method public a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ5/a$a;->c:Lm0/i1;

    sub-float v1, p6, p4

    sub-float v2, p7, p5

    invoke-static {v1, v2}, Ll0/n;->a(FF)J

    move-result-wide v1

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, LY0/t;->Ltr:LY0/t;

    goto :goto_0

    :cond_0
    sget-object v3, LY0/t;->Rtl:LY0/t;

    :goto_0
    invoke-interface {p1}, Lu6/e;->getDensity()F

    move-result v4

    invoke-interface {p1}, Lu6/e;->y()F

    move-result v5

    invoke-static {v4, v5}, LY0/f;->a(FF)LY0/d;

    move-result-object v4

    invoke-interface {v0, v1, v2, v3, v4}, Lm0/i1;->a(JLY0/t;LY0/d;)Lm0/Q0;

    move-result-object v0

    instance-of v1, v0, Lm0/Q0$b;

    if-eqz v1, :cond_1

    sget-object v7, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    goto :goto_1

    :cond_1
    instance-of v1, v0, Lm0/Q0$c;

    if-eqz v1, :cond_2

    check-cast v0, Lm0/Q0$c;

    invoke-virtual {v0}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v6

    invoke-direct {p0}, LQ5/a$a;->c()[F

    move-result-object v7

    move-object v1, p3

    move v2, p4

    move v3, p5

    move v4, p6

    move v5, p7

    invoke-static/range {v1 .. v7}, LQ5/a;->a(Landroid/graphics/Path;FFFFLl0/k;[F)V

    goto :goto_1

    :cond_2
    instance-of p6, v0, Lm0/Q0$a;

    if-eqz p6, :cond_4

    invoke-direct {p0}, LQ5/a$a;->b()Landroid/graphics/Matrix;

    move-result-object p6

    invoke-virtual {p6, p4, p5}, Landroid/graphics/Matrix;->setTranslate(FF)V

    check-cast v0, Lm0/Q0$a;

    invoke-virtual {v0}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object p4

    instance-of p5, p4, Lm0/T;

    if-eqz p5, :cond_3

    check-cast p4, Lm0/T;

    invoke-virtual {p4}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object p4

    invoke-direct {p0}, LQ5/a$a;->b()Landroid/graphics/Matrix;

    move-result-object p5

    invoke-virtual {p3, p4, p5}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p2, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

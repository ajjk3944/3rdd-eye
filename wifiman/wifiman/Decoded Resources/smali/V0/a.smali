.class public final LV0/a;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field private final a:Lo0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo0/g;)V
    .locals 0

    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    iput-object p1, p0, LV0/a;->a:Lo0/g;

    return-void
.end method

.method private final a(I)Landroid/graphics/Paint$Cap;
    .locals 2

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->a()I

    move-result v1

    invoke-static {p1, v1}, Lm0/k1;->e(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/k1$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lm0/k1;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lm0/k1$a;->c()I

    move-result v0

    invoke-static {p1, v0}, Lm0/k1;->e(II)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    :goto_0
    return-object p1
.end method

.method private final b(I)Landroid/graphics/Paint$Join;
    .locals 2

    sget-object v0, Lm0/l1;->a:Lm0/l1$a;

    invoke-virtual {v0}, Lm0/l1$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lm0/l1;->e(II)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lm0/l1$a;->c()I

    move-result v1

    invoke-static {p1, v1}, Lm0/l1;->e(II)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lm0/l1$a;->a()I

    move-result v0

    invoke-static {p1, v0}, Lm0/l1;->e(II)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    goto :goto_0

    :cond_2
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    sget-object v1, Lo0/j;->a:Lo0/j;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_1

    :cond_0
    instance-of v0, v0, Lo0/k;

    if-eqz v0, :cond_2

    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    check-cast v0, Lo0/k;

    invoke-virtual {v0}, Lo0/k;->f()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    check-cast v0, Lo0/k;

    invoke-virtual {v0}, Lo0/k;->d()F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    check-cast v0, Lo0/k;

    invoke-virtual {v0}, Lo0/k;->c()I

    move-result v0

    invoke-direct {p0, v0}, LV0/a;->b(I)Landroid/graphics/Paint$Join;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    check-cast v0, Lo0/k;

    invoke-virtual {v0}, Lo0/k;->b()I

    move-result v0

    invoke-direct {p0, v0}, LV0/a;->a(I)Landroid/graphics/Paint$Cap;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    iget-object v0, p0, LV0/a;->a:Lo0/g;

    check-cast v0, Lo0/k;

    invoke-virtual {v0}, Lo0/k;->e()Lm0/V0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lm0/V;->c(Lm0/V0;)Landroid/graphics/PathEffect;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    :cond_2
    :goto_1
    return-void
.end method

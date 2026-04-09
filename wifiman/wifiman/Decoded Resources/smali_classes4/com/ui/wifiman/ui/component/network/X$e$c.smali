.class final Lcom/ui/wifiman/ui/component/network/X$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X$e;->c(Lz/f;LA/B;FJLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:LY0/d;

.field final synthetic g:J


# direct methods
.method constructor <init>(FFIIILY0/d;J)V
    .locals 0

    iput p1, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->a:F

    iput p2, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->b:F

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->c:I

    iput p4, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->d:I

    iput p5, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->e:I

    iput-object p6, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->f:LY0/d;

    iput-wide p7, p0, Lcom/ui/wifiman/ui/component/network/X$e$c;->g:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous>.<anonymous> (WifimanNetworkTopology.kt:315)"

    const v3, -0x74580780    # -6.469996E-32f

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget v2, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->a:F

    iget v3, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->b:F

    iget v4, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->c:I

    iget v5, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->d:I

    sub-int/2addr v4, v5

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    const/16 v4, 0x20

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v6

    const/4 v7, 0x2

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    sub-float/2addr v3, v6

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    add-float/2addr v2, v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    iget v3, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->e:I

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    iget-object v6, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->f:LY0/d;

    invoke-interface {v6}, LY0/d;->getDensity()F

    move-result v6

    div-float/2addr v3, v6

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/16 v3, 0x40

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    div-float/2addr v3, v7

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    div-float/2addr v4, v7

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v1, v2, v3}, Landroidx/compose/foundation/layout/l;->b(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v6

    int-to-float v1, v5

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    iget-wide v2, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->g:J

    invoke-static {v1, v2, v3}, Ls/h;->a(FJ)Ls/g;

    move-result-object v12

    invoke-static {}, LE/h;->g()LE/g;

    move-result-object v7

    new-instance v1, Lcom/ui/wifiman/ui/component/network/X$e$c$a;

    iget-wide v2, v0, Lcom/ui/wifiman/ui/component/network/X$e$c;->g:J

    invoke-direct {v1, v2, v3}, Lcom/ui/wifiman/ui/component/network/X$e$c$a;-><init>(J)V

    const/16 v2, 0x36

    const v3, -0x3c275c44

    move-object/from16 v4, p2

    invoke-static {v3, v5, v1, v4, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v14

    const/high16 v16, 0x180000

    const/16 v17, 0x2c

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v15, p2

    invoke-static/range {v6 .. v17}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/X$e$c;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

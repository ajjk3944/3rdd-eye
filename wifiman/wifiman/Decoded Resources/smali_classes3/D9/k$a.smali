.class final LD9/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD9/k;->j(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm0/i1;

.field final synthetic b:J

.field final synthetic c:F

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(Lm0/i1;JFLmh/p;)V
    .locals 0

    iput-object p1, p0, LD9/k$a;->a:Lm0/i1;

    iput-wide p2, p0, LD9/k$a;->b:J

    iput p4, p0, LD9/k$a;->c:F

    iput-object p5, p0, LD9/k$a;->d:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(FLandroidx/compose/ui/graphics/c;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LD9/k$a;->c(FLandroidx/compose/ui/graphics/c;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(FLandroidx/compose/ui/graphics/c;)LYg/J;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Landroidx/compose/ui/graphics/c;->a(F)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(FLT/l;I)V
    .locals 13

    move-object v0, p0

    move v1, p1

    move-object v10, p2

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {p2, p1}, LT/l;->g(F)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v2, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopup.<anonymous> (AnchoredPopup.kt:144)"

    const v6, 0x64f6314a

    invoke-static {v6, v2, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const v5, 0x62b41dfb

    invoke-interface {p2, v5}, LT/l;->U(I)V

    and-int/lit8 v2, v2, 0xe

    const/4 v5, 0x1

    if-ne v2, v3, :cond_5

    move v2, v5

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_7

    :cond_6
    new-instance v3, LD9/j;

    invoke-direct {v3, p1}, LD9/j;-><init>(F)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v4, v3}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, LD9/k$a;->a:Lm0/i1;

    iget-wide v3, v0, LD9/k$a;->b:J

    iget v8, v0, LD9/k$a;->c:F

    new-instance v6, LD9/k$a$a;

    iget-object v7, v0, LD9/k$a;->d:Lmh/p;

    invoke-direct {v6, v7}, LD9/k$a$a;-><init>(Lmh/p;)V

    const/16 v7, 0x36

    const v9, -0x2f1f3a7a

    invoke-static {v9, v5, v6, p2, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x180000

    const/16 v12, 0x18

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v10, p2

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LD9/k$a;->b(FLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

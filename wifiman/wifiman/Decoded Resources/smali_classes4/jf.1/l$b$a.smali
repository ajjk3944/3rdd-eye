.class final Ljf/l$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljf/l$b;->a(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljf/e;

.field final synthetic b:Ljf/h;


# direct methods
.method constructor <init>(Ljf/e;Ljf/h;)V
    .locals 0

    iput-object p1, p0, Ljf/l$b$a;->a:Ljf/e;

    iput-object p2, p0, Ljf/l$b$a;->b:Ljf/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p2

    move/from16 v1, p3

    const-string v2, "$this$UiContentCard"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.speedtest.result.SpeedtestResultDetailContentUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedtestResultDetailContentUi.kt:155)"

    const v4, -0x2dfb0eda

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->q3:I

    const/4 v3, 0x0

    invoke-static {v2, v11, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v4

    sget v2, Lm8/c;->r3:I

    invoke-static {v2, v11, v3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v5

    iget-object v2, v0, Ljf/l$b$a;->a:Ljf/e;

    invoke-virtual {v2}, Ljf/e;->a()Z

    move-result v6

    iget-object v2, v0, Ljf/l$b$a;->b:Ljf/h;

    const v3, 0x5f9430de

    invoke-interface {v11, v3}, LT/l;->U(I)V

    invoke-interface {v11, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v7, v3, :cond_4

    :cond_3
    new-instance v7, Ljf/l$b$a$a;

    invoke-direct {v7, v2}, Ljf/l$b$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v11, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    check-cast v7, Lmh/l;

    const/4 v12, 0x6

    const/16 v13, 0x3c2

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    move-object v3, v4

    move-object v4, v5

    move v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move v9, v10

    move-object v10, v14

    move-object/from16 v11, p2

    invoke-static/range {v1 .. v13}, LF9/u0;->c(Landroidx/compose/ui/e;Ls9/b;Ljava/lang/String;Ljava/lang/String;ZLmh/l;Ls9/b;Lmh/a;ZLjava/lang/String;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Ljf/l$b$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

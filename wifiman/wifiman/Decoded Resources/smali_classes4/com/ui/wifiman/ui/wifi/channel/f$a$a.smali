.class final Lcom/ui/wifiman/ui/wifi/channel/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/wifi/channel/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$UiCardCollapsible"

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

    const-string v4, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:129)"

    const v5, -0x416f294c

    invoke-static {v5, v1, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v14, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    int-to-float v15, v3

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v12, 0x6

    invoke-static {v1, v13, v12}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v11, 0x0

    const/4 v10, 0x1

    const/4 v9, 0x0

    invoke-static {v14, v11, v10, v9}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v8, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v8, v13, v7}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->c()F

    move-result v2

    const/4 v6, 0x2

    invoke-static {v1, v2, v11, v6, v9}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget v2, Lm8/c;->U4:I

    const/4 v5, 0x0

    invoke-static {v2, v13, v5}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/ui/wifiman/ui/wifi/channel/f$a$a$a;

    iget-object v4, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {v3, v4}, Lcom/ui/wifiman/ui/wifi/channel/f$a$a$a;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const/16 v4, 0x36

    const v5, -0x684c85c4

    invoke-static {v5, v10, v3, v13, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v16

    const/high16 v17, 0x6000000

    const/16 v18, 0xfc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v6, v19

    move/from16 v22, v7

    move-object/from16 v7, v20

    move-object/from16 v23, v8

    move-object/from16 v8, v21

    move-object/from16 v9, v16

    move-object/from16 v10, p2

    move/from16 v11, v17

    move v0, v12

    move/from16 v12, v18

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1, v13, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v14, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    move/from16 v6, v22

    move-object/from16 v5, v23

    invoke-virtual {v5, v13, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v7

    invoke-virtual {v7}, Lra/a;->a()Lra/b;

    move-result-object v7

    invoke-virtual {v7}, Lra/b;->a()Lra/b$a$a;

    move-result-object v7

    invoke-virtual {v7}, Lra/b$a$a;->d()F

    move-result v7

    const/4 v8, 0x2

    invoke-static {v4, v7, v1, v8, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    new-instance v7, Ls9/d$b;

    sget v9, Lm8/c;->I4:I

    invoke-direct {v7, v9}, Ls9/d$b;-><init>(I)V

    const/4 v9, 0x0

    invoke-static {v4, v7, v13, v9, v9}, LIe/b;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;II)V

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v14, v4}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v4

    invoke-static {v4, v13, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {v14, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-virtual {v5, v13, v6}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v4

    invoke-virtual {v4}, Lra/a;->a()Lra/b;

    move-result-object v4

    invoke-virtual {v4}, Lra/b;->a()Lra/b$a$a;

    move-result-object v4

    invoke-virtual {v4}, Lra/b$a$a;->d()F

    move-result v4

    invoke-static {v0, v4, v1, v8, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/wifi/channel/c;->q0()LLi/N;

    move-result-object v4

    invoke-static {v4, v3, v13, v9, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v2

    invoke-interface {v2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzf/f;

    iget-object v3, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    const v4, -0x1a457495

    invoke-interface {v13, v4}, LT/l;->U(I)V

    invoke-interface {v13, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lcom/ui/wifiman/ui/wifi/channel/f$a$a$b;

    invoke-direct {v5, v3}, Lcom/ui/wifiman/ui/wifi/channel/f$a$a$b;-><init>(Ljava/lang/Object;)V

    invoke-interface {v13, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v3, v5

    check-cast v3, Lmh/l;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lzf/d;->c(Landroidx/compose/ui/e;Lzf/f;Lmh/l;LT/l;II)V

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

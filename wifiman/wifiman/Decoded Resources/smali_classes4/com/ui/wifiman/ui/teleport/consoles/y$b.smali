.class final Lcom/ui/wifiman/ui/teleport/consoles/y$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/y;->b(Lcom/ui/wifiman/ui/teleport/consoles/w;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/consoles/w;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/consoles/w;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/consoles/y$b;->a:Lcom/ui/wifiman/ui/teleport/consoles/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 28

    move-object/from16 v15, p2

    move/from16 v0, p3

    const-string v1, "$this$ModalScaffold"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.consoles.TeleportConsoleUnavailableUi.<anonymous> (TeleportConsoleUnavailableUi.kt:38)"

    const v3, -0x2baeb5f

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v13, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v14, Lla/a;->a:Lla/a;

    sget v11, Lla/a;->b:I

    invoke-virtual {v14, v15, v11}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->a()Lra/b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$a;->d()F

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v13, v0, v1, v2, v3}, Landroidx/compose/foundation/layout/o;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v4

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v8

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v6

    const/4 v9, 0x5

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    move-object/from16 v9, p0

    iget-object v0, v9, Lcom/ui/wifiman/ui/teleport/consoles/y$b;->a:Lcom/ui/wifiman/ui/teleport/consoles/w;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/teleport/consoles/w;->n0()LLi/N;

    move-result-object v0

    const/4 v2, 0x1

    const/4 v10, 0x0

    invoke-static {v0, v3, v15, v10, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls9/d;

    invoke-static {v0, v15, v10}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, LW0/j;->b:LW0/j$a;

    invoke-virtual {v2}, LW0/j$a;->a()I

    move-result v4

    invoke-virtual {v14, v15, v11}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v2

    invoke-virtual {v2}, Lpa/c;->b()Lpa/b;

    move-result-object v2

    invoke-virtual {v2}, Lpa/b;->a()LL0/U;

    move-result-object v20

    invoke-virtual {v14, v15, v11}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->b()J

    move-result-wide v2

    invoke-static {v4}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    const/16 v23, 0x0

    const v24, 0xfdf8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v16, 0x0

    move-wide/from16 v9, v16

    const/16 v16, 0x0

    move/from16 v25, v11

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-object/from16 v26, v13

    move-object/from16 v27, v14

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    move/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v21, p2

    invoke-static/range {v0 .. v24}, LN/a1;->b(Ljava/lang/String;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILmh/l;LL0/U;LT/l;III)V

    move-object/from16 v0, p2

    move/from16 v2, v25

    move-object/from16 v1, v27

    invoke-virtual {v1, v0, v2}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v1

    invoke-virtual {v1}, Lra/a;->a()Lra/b;

    move-result-object v1

    invoke-virtual {v1}, Lra/b;->b()Lra/b$a$b;

    move-result-object v1

    const/16 v2, 0x20

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    invoke-virtual {v1, v2}, Lra/b$a;->a(F)F

    move-result v1

    move-object/from16 v2, v26

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/consoles/y$b;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.class final Lu9/k$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu9/k;->j(Landroidx/compose/ui/e;Lu9/c;LT/q0;Ljava/lang/String;Landroidx/compose/ui/focus/o;ILCi/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb1/l;

.field final synthetic b:Lb1/f;

.field final synthetic c:Lb1/f;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lb1/f;

.field final synthetic f:LCi/e;

.field final synthetic g:LT/q0;

.field final synthetic h:Lmh/l;

.field final synthetic i:Lu9/c;

.field final synthetic j:Lmh/l;

.field final synthetic k:Landroidx/compose/ui/focus/o;

.field final synthetic l:I

.field final synthetic m:Lmh/l;


# direct methods
.method constructor <init>(Lb1/l;Lb1/f;Lb1/f;Ljava/lang/String;Lb1/f;LCi/e;LT/q0;Lmh/l;Lu9/c;Lmh/l;Landroidx/compose/ui/focus/o;ILmh/l;)V
    .locals 0

    iput-object p1, p0, Lu9/k$f;->a:Lb1/l;

    iput-object p2, p0, Lu9/k$f;->b:Lb1/f;

    iput-object p3, p0, Lu9/k$f;->c:Lb1/f;

    iput-object p4, p0, Lu9/k$f;->d:Ljava/lang/String;

    iput-object p5, p0, Lu9/k$f;->e:Lb1/f;

    iput-object p6, p0, Lu9/k$f;->f:LCi/e;

    iput-object p7, p0, Lu9/k$f;->g:LT/q0;

    iput-object p8, p0, Lu9/k$f;->h:Lmh/l;

    iput-object p9, p0, Lu9/k$f;->i:Lu9/c;

    iput-object p10, p0, Lu9/k$f;->j:Lmh/l;

    iput-object p11, p0, Lu9/k$f;->k:Landroidx/compose/ui/focus/o;

    iput p12, p0, Lu9/k$f;->l:I

    iput-object p13, p0, Lu9/k$f;->m:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string/jumbo v3, "com.ui.core.ui.component.authcode.UiAuthCodeField.<anonymous>.<anonymous> (UiAuthCodeField.kt:227)"

    const v4, 0x55e81820

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lu9/k$f;->a:Lb1/l;

    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v3, v0, Lu9/k$f;->b:Lb1/f;

    const v4, 0x10a55dc2

    invoke-interface {v8, v4}, LT/l;->U(I)V

    iget-object v4, v0, Lu9/k$f;->c:Lb1/f;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    iget-object v5, v0, Lu9/k$f;->d:Ljava/lang/String;

    invoke-interface {v8, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lu9/k$f;->e:Lb1/f;

    invoke-interface {v8, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Lu9/k$f;->c:Lb1/f;

    iget-object v6, v0, Lu9/k$f;->d:Ljava/lang/String;

    iget-object v7, v0, Lu9/k$f;->e:Lb1/f;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v9, v4, :cond_4

    :cond_3
    new-instance v9, Lu9/k$f$a;

    invoke-direct {v9, v5, v6, v7}, Lu9/k$f$a;-><init>(Lb1/f;Ljava/lang/String;Lb1/f;)V

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-virtual {v1, v2, v3, v9}, Lb1/l;->h(Landroidx/compose/ui/e;Lb1/f;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Lu9/k$f;->f:LCi/e;

    const v3, 0x10a5af69

    invoke-interface {v8, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lu9/k$f;->g:LT/q0;

    invoke-interface {v8, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, v0, Lu9/k$f;->h:Lmh/l;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lu9/k$f;->i:Lu9/c;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lu9/k$f;->j:Lmh/l;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lu9/k$f;->g:LT/q0;

    iget-object v5, v0, Lu9/k$f;->h:Lmh/l;

    iget-object v6, v0, Lu9/k$f;->i:Lu9/c;

    iget-object v7, v0, Lu9/k$f;->j:Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_6

    :cond_5
    new-instance v9, Lu9/k$f$b;

    invoke-direct {v9, v4, v5, v6, v7}, Lu9/k$f$b;-><init>(LT/q0;Lmh/l;Lu9/c;Lmh/l;)V

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {v1, v2, v9}, LM9/c;->a(Landroidx/compose/ui/e;LCi/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Lu9/k$f;->k:Landroidx/compose/ui/focus/o;

    invoke-static {v1, v2}, Landroidx/compose/ui/focus/p;->a(Landroidx/compose/ui/e;Landroidx/compose/ui/focus/o;)Landroidx/compose/ui/e;

    move-result-object v3

    new-instance v6, LL0/U;

    move-object v9, v6

    const/16 v1, 0x12

    invoke-static {v1}, LY0/w;->g(I)J

    move-result-wide v12

    const/16 v1, 0x18

    invoke-static {v1}, LY0/w;->g(I)J

    move-result-wide v31

    const v39, 0xfdfffd

    const/16 v40, 0x0

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v9 .. v40}, LL0/U;-><init>(JJLQ0/A;LQ0/v;LQ0/w;LQ0/k;Ljava/lang/String;JLW0/a;LW0/o;LS0/e;JLW0/k;Lm0/g1;Lo0/g;IIJLW0/q;LL0/B;LW0/h;IILW0/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lu9/k$f;->g:LT/q0;

    invoke-interface {v1}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LR0/Q;

    new-instance v7, LF/D;

    iget v12, v0, Lu9/k$f;->l:I

    sget-object v2, LR0/r;->b:LR0/r$a;

    invoke-virtual {v2}, LR0/r$a;->b()I

    move-result v13

    const/16 v17, 0x71

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v7

    invoke-direct/range {v9 .. v18}, LF/D;-><init>(IZIILR0/K;Ljava/lang/Boolean;LS0/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x10a613a8

    invoke-interface {v8, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lu9/k$f;->m:Lmh/l;

    invoke-interface {v8, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lu9/k$f;->g:LT/q0;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lu9/k$f;->m:Lmh/l;

    iget-object v5, v0, Lu9/k$f;->g:LT/q0;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_7

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v9, v2, :cond_8

    :cond_7
    new-instance v9, Lu9/k$f$c;

    invoke-direct {v9, v4, v5}, Lu9/k$f$c;-><init>(Lmh/l;LT/q0;)V

    invoke-interface {v8, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v11, v9

    check-cast v11, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v21, LF/C;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x3e

    const/16 v18, 0x0

    move-object/from16 v10, v21

    invoke-direct/range {v10 .. v18}, LF/C;-><init>(Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x10a5e3de

    invoke-interface {v8, v2}, LT/l;->U(I)V

    iget-object v2, v0, Lu9/k$f;->g:LT/q0;

    invoke-interface {v8, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lu9/k$f;->h:Lmh/l;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lu9/k$f;->i:Lu9/c;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lu9/k$f;->j:Lmh/l;

    invoke-interface {v8, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    iget-object v4, v0, Lu9/k$f;->g:LT/q0;

    iget-object v5, v0, Lu9/k$f;->h:Lmh/l;

    iget-object v9, v0, Lu9/k$f;->i:Lu9/c;

    iget-object v10, v0, Lu9/k$f;->j:Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    if-nez v2, :cond_9

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v11, v2, :cond_a

    :cond_9
    new-instance v11, Lu9/k$f$d;

    invoke-direct {v11, v4, v5, v9, v10}, Lu9/k$f$d;-><init>(LT/q0;Lmh/l;Lu9/c;Lmh/l;)V

    invoke-interface {v8, v11}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v2, v11

    check-cast v2, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/16 v19, 0x0

    const v20, 0xfe18

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/high16 v18, 0x6030000

    move-object/from16 v8, v21

    move-object/from16 v17, p1

    invoke-static/range {v1 .. v20}, LF/f;->c(LR0/Q;Lmh/l;Landroidx/compose/ui/e;ZZLL0/U;LF/D;LF/C;ZIILR0/c0;Lmh/l;Ly/m;Lm0/l0;Lmh/q;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lu9/k$f;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

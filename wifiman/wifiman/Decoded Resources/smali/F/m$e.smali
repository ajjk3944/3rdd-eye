.class final LF/m$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:LF/E;

.field final synthetic c:LL0/U;

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:LF/f0;

.field final synthetic g:LR0/Q;

.field final synthetic h:LR0/c0;

.field final synthetic i:Landroidx/compose/ui/e;

.field final synthetic j:Landroidx/compose/ui/e;

.field final synthetic k:Landroidx/compose/ui/e;

.field final synthetic l:Landroidx/compose/ui/e;

.field final synthetic m:LD/b;

.field final synthetic n:LM/G;

.field final synthetic o:Z

.field final synthetic p:Z

.field final synthetic q:Lmh/l;

.field final synthetic r:LR0/H;

.field final synthetic s:LY0/d;


# direct methods
.method constructor <init>(Lmh/q;LF/E;LL0/U;IILF/f0;LR0/Q;LR0/c0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LD/b;LM/G;ZZLmh/l;LR0/H;LY0/d;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF/m$e;->a:Lmh/q;

    move-object v1, p2

    iput-object v1, v0, LF/m$e;->b:LF/E;

    move-object v1, p3

    iput-object v1, v0, LF/m$e;->c:LL0/U;

    move v1, p4

    iput v1, v0, LF/m$e;->d:I

    move v1, p5

    iput v1, v0, LF/m$e;->e:I

    move-object v1, p6

    iput-object v1, v0, LF/m$e;->f:LF/f0;

    move-object v1, p7

    iput-object v1, v0, LF/m$e;->g:LR0/Q;

    move-object v1, p8

    iput-object v1, v0, LF/m$e;->h:LR0/c0;

    move-object v1, p9

    iput-object v1, v0, LF/m$e;->i:Landroidx/compose/ui/e;

    move-object v1, p10

    iput-object v1, v0, LF/m$e;->j:Landroidx/compose/ui/e;

    move-object v1, p11

    iput-object v1, v0, LF/m$e;->k:Landroidx/compose/ui/e;

    move-object v1, p12

    iput-object v1, v0, LF/m$e;->l:Landroidx/compose/ui/e;

    move-object v1, p13

    iput-object v1, v0, LF/m$e;->m:LD/b;

    move-object/from16 v1, p14

    iput-object v1, v0, LF/m$e;->n:LM/G;

    move/from16 v1, p15

    iput-boolean v1, v0, LF/m$e;->o:Z

    move/from16 v1, p16

    iput-boolean v1, v0, LF/m$e;->p:Z

    move-object/from16 v1, p17

    iput-object v1, v0, LF/m$e;->q:Lmh/l;

    move-object/from16 v1, p18

    iput-object v1, v0, LF/m$e;->r:LR0/H;

    move-object/from16 v1, p19

    iput-object v1, v0, LF/m$e;->s:LY0/d;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)"

    const v5, -0x164ff220

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LF/m$e;->a:Lmh/q;

    new-instance v15, LF/m$e$a;

    move-object v3, v15

    iget-object v4, v0, LF/m$e;->b:LF/E;

    iget-object v5, v0, LF/m$e;->c:LL0/U;

    iget v6, v0, LF/m$e;->d:I

    iget v7, v0, LF/m$e;->e:I

    iget-object v8, v0, LF/m$e;->f:LF/f0;

    iget-object v9, v0, LF/m$e;->g:LR0/Q;

    iget-object v10, v0, LF/m$e;->h:LR0/c0;

    iget-object v11, v0, LF/m$e;->i:Landroidx/compose/ui/e;

    iget-object v12, v0, LF/m$e;->j:Landroidx/compose/ui/e;

    iget-object v13, v0, LF/m$e;->k:Landroidx/compose/ui/e;

    iget-object v14, v0, LF/m$e;->l:Landroidx/compose/ui/e;

    move-object/from16 p2, v15

    iget-object v15, v0, LF/m$e;->m:LD/b;

    move-object/from16 v22, v2

    move-object/from16 v2, p2

    iget-object v1, v0, LF/m$e;->n:LM/G;

    move-object/from16 v16, v1

    iget-boolean v1, v0, LF/m$e;->o:Z

    move/from16 v17, v1

    iget-boolean v1, v0, LF/m$e;->p:Z

    move/from16 v18, v1

    iget-object v1, v0, LF/m$e;->q:Lmh/l;

    move-object/from16 v19, v1

    iget-object v1, v0, LF/m$e;->r:LR0/H;

    move-object/from16 v20, v1

    iget-object v1, v0, LF/m$e;->s:LY0/d;

    move-object/from16 v21, v1

    invoke-direct/range {v3 .. v21}, LF/m$e$a;-><init>(LF/E;LL0/U;IILF/f0;LR0/Q;LR0/c0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LD/b;LM/G;ZZLmh/l;LR0/H;LY0/d;)V

    const/16 v1, 0x36

    const v3, 0x7925855b

    const/4 v4, 0x1

    move-object/from16 v5, p1

    invoke-static {v3, v4, v2, v5, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v22

    invoke-interface {v3, v1, v5, v2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/m$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

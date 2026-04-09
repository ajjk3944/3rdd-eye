.class final LF/m$e$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$e;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:LL0/U;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:LF/f0;

.field final synthetic f:LR0/Q;

.field final synthetic g:LR0/c0;

.field final synthetic h:Landroidx/compose/ui/e;

.field final synthetic i:Landroidx/compose/ui/e;

.field final synthetic j:Landroidx/compose/ui/e;

.field final synthetic k:Landroidx/compose/ui/e;

.field final synthetic l:LD/b;

.field final synthetic m:LM/G;

.field final synthetic n:Z

.field final synthetic o:Z

.field final synthetic p:Lmh/l;

.field final synthetic q:LR0/H;

.field final synthetic r:LY0/d;


# direct methods
.method constructor <init>(LF/E;LL0/U;IILF/f0;LR0/Q;LR0/c0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LD/b;LM/G;ZZLmh/l;LR0/H;LY0/d;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF/m$e$a;->a:LF/E;

    move-object v1, p2

    iput-object v1, v0, LF/m$e$a;->b:LL0/U;

    move v1, p3

    iput v1, v0, LF/m$e$a;->c:I

    move v1, p4

    iput v1, v0, LF/m$e$a;->d:I

    move-object v1, p5

    iput-object v1, v0, LF/m$e$a;->e:LF/f0;

    move-object v1, p6

    iput-object v1, v0, LF/m$e$a;->f:LR0/Q;

    move-object v1, p7

    iput-object v1, v0, LF/m$e$a;->g:LR0/c0;

    move-object v1, p8

    iput-object v1, v0, LF/m$e$a;->h:Landroidx/compose/ui/e;

    move-object v1, p9

    iput-object v1, v0, LF/m$e$a;->i:Landroidx/compose/ui/e;

    move-object v1, p10

    iput-object v1, v0, LF/m$e$a;->j:Landroidx/compose/ui/e;

    move-object v1, p11

    iput-object v1, v0, LF/m$e$a;->k:Landroidx/compose/ui/e;

    move-object v1, p12

    iput-object v1, v0, LF/m$e$a;->l:LD/b;

    move-object v1, p13

    iput-object v1, v0, LF/m$e$a;->m:LM/G;

    move/from16 v1, p14

    iput-boolean v1, v0, LF/m$e$a;->n:Z

    move/from16 v1, p15

    iput-boolean v1, v0, LF/m$e$a;->o:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LF/m$e$a;->p:Lmh/l;

    move-object/from16 v1, p17

    iput-object v1, v0, LF/m$e$a;->q:LR0/H;

    move-object/from16 v1, p18

    iput-object v1, v0, LF/m$e$a;->r:LY0/d;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)"

    const v3, 0x7925855b

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    iget-object v0, p0, LF/m$e$a;->a:LF/E;

    invoke-virtual {v0}, LF/E;->k()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, Landroidx/compose/foundation/layout/r;->k(Landroidx/compose/ui/e;FFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->b:LL0/U;

    iget v1, p0, LF/m$e$a;->c:I

    iget v2, p0, LF/m$e$a;->d:I

    invoke-static {p2, v0, v1, v2}, LF/r;->a(Landroidx/compose/ui/e;LL0/U;II)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->e:LF/f0;

    iget-object v1, p0, LF/m$e$a;->f:LR0/Q;

    iget-object v2, p0, LF/m$e$a;->g:LR0/c0;

    iget-object v3, p0, LF/m$e$a;->a:LF/E;

    invoke-interface {p1, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, LF/m$e$a;->a:LF/E;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, LF/m$e$a$b;

    invoke-direct {v5, v4}, LF/m$e$a$b;-><init>(LF/E;)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lmh/a;

    invoke-static {p2, v0, v1, v2, v5}, LF/e0;->c(Landroidx/compose/ui/e;LF/f0;LR0/Q;LR0/c0;Lmh/a;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->h:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->i:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->b:LL0/U;

    invoke-static {p2, v0}, LF/h0;->a(Landroidx/compose/ui/e;LL0/U;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->j:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->k:Landroidx/compose/ui/e;

    invoke-interface {p2, v0}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v0, p0, LF/m$e$a;->l:LD/b;

    invoke-static {p2, v0}, Landroidx/compose/foundation/relocation/b;->b(Landroidx/compose/ui/e;LD/b;)Landroidx/compose/ui/e;

    move-result-object p2

    new-instance v10, LF/m$e$a$a;

    iget-object v1, p0, LF/m$e$a;->m:LM/G;

    iget-object v2, p0, LF/m$e$a;->a:LF/E;

    iget-boolean v3, p0, LF/m$e$a;->n:Z

    iget-boolean v4, p0, LF/m$e$a;->o:Z

    iget-object v5, p0, LF/m$e$a;->p:Lmh/l;

    iget-object v6, p0, LF/m$e$a;->f:LR0/Q;

    iget-object v7, p0, LF/m$e$a;->q:LR0/H;

    iget-object v8, p0, LF/m$e$a;->r:LY0/d;

    iget v9, p0, LF/m$e$a;->d:I

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LF/m$e$a$a;-><init>(LM/G;LF/E;ZZLmh/l;LR0/Q;LR0/H;LY0/d;I)V

    const/16 v0, 0x36

    const v1, -0x15a57eaf

    const/4 v2, 0x1

    invoke-static {v1, v2, v10, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p1, v1, v2}, LM/D;->a(Landroidx/compose/ui/e;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/m$e$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

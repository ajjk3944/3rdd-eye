.class final LF/f$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/f;->b(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH/j;

.field final synthetic b:LH/k;

.field final synthetic c:LI/l1;

.field final synthetic d:LL0/U;

.field final synthetic e:Z

.field final synthetic f:Z

.field final synthetic g:Z

.field final synthetic h:LI/o1;

.field final synthetic i:LJ/j;

.field final synthetic j:Lm0/l0;

.field final synthetic k:Z

.field final synthetic l:Z

.field final synthetic m:Landroidx/compose/foundation/o;

.field final synthetic n:Lw/q;

.field final synthetic o:Z

.field final synthetic p:Lmh/p;


# direct methods
.method constructor <init>(LH/j;LH/k;LI/l1;LL0/U;ZZZLI/o1;LJ/j;Lm0/l0;ZZLandroidx/compose/foundation/o;Lw/q;ZLmh/p;)V
    .locals 2

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LF/f$g;->a:LH/j;

    move-object v1, p2

    iput-object v1, v0, LF/f$g;->b:LH/k;

    move-object v1, p3

    iput-object v1, v0, LF/f$g;->c:LI/l1;

    move-object v1, p4

    iput-object v1, v0, LF/f$g;->d:LL0/U;

    move v1, p5

    iput-boolean v1, v0, LF/f$g;->e:Z

    move v1, p6

    iput-boolean v1, v0, LF/f$g;->f:Z

    move v1, p7

    iput-boolean v1, v0, LF/f$g;->g:Z

    move-object v1, p8

    iput-object v1, v0, LF/f$g;->h:LI/o1;

    move-object v1, p9

    iput-object v1, v0, LF/f$g;->i:LJ/j;

    move-object v1, p10

    iput-object v1, v0, LF/f$g;->j:Lm0/l0;

    move v1, p11

    iput-boolean v1, v0, LF/f$g;->k:Z

    move v1, p12

    iput-boolean v1, v0, LF/f$g;->l:Z

    move-object v1, p13

    iput-object v1, v0, LF/f$g;->m:Landroidx/compose/foundation/o;

    move-object/from16 v1, p14

    iput-object v1, v0, LF/f$g;->n:Lw/q;

    move/from16 v1, p15

    iput-boolean v1, v0, LF/f$g;->o:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LF/f$g;->p:Lmh/p;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 19

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

    const-string v4, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)"

    const v5, -0x2820d9ff

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, v0, LF/f$g;->a:LH/j;

    if-nez v2, :cond_3

    invoke-static {}, LF/f;->r()LH/j;

    move-result-object v2

    :cond_3
    new-instance v15, LF/f$g$a;

    iget-object v4, v0, LF/f$g;->b:LH/k;

    iget-object v5, v0, LF/f$g;->c:LI/l1;

    iget-object v6, v0, LF/f$g;->d:LL0/U;

    iget-boolean v7, v0, LF/f$g;->e:Z

    iget-boolean v8, v0, LF/f$g;->f:Z

    iget-boolean v9, v0, LF/f$g;->g:Z

    iget-object v10, v0, LF/f$g;->h:LI/o1;

    iget-object v11, v0, LF/f$g;->i:LJ/j;

    iget-object v12, v0, LF/f$g;->j:Lm0/l0;

    iget-boolean v13, v0, LF/f$g;->k:Z

    iget-boolean v14, v0, LF/f$g;->l:Z

    iget-object v3, v0, LF/f$g;->m:Landroidx/compose/foundation/o;

    move-object/from16 p2, v2

    iget-object v2, v0, LF/f$g;->n:Lw/q;

    iget-boolean v1, v0, LF/f$g;->o:Z

    move/from16 v17, v1

    iget-object v1, v0, LF/f$g;->p:Lmh/p;

    move-object/from16 v16, v3

    move-object v3, v15

    move-object v0, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v2

    move-object/from16 v18, v1

    invoke-direct/range {v3 .. v18}, LF/f$g$a;-><init>(LH/k;LI/l1;LL0/U;ZZZLI/o1;LJ/j;Lm0/l0;ZZLandroidx/compose/foundation/o;Lw/q;ZLmh/p;)V

    const/16 v1, 0x36

    const v2, 0x755f253e

    const/4 v3, 0x1

    move-object/from16 v4, p1

    invoke-static {v2, v3, v0, v4, v1}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/4 v1, 0x6

    move-object/from16 v2, p2

    invoke-interface {v2, v0, v4, v1}, LH/j;->a(Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/f$g;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

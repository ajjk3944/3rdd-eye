.class final LF/d$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/d;->b(LH/l;Landroidx/compose/ui/e;ZLH/b;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LH/j;ICLT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LH/l;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:LH/b;

.field final synthetic f:LF/L;

.field final synthetic g:LL0/U;

.field final synthetic h:LF/D;

.field final synthetic i:LH/d;

.field final synthetic j:Lmh/p;

.field final synthetic k:Ly/m;

.field final synthetic l:Lm0/l0;

.field final synthetic m:LI/o;

.field final synthetic n:LH/j;


# direct methods
.method constructor <init>(LH/l;Landroidx/compose/ui/e;ZZLH/b;LF/L;LL0/U;LF/D;LH/d;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/j;)V
    .locals 0

    iput-object p1, p0, LF/d$c;->a:LH/l;

    iput-object p2, p0, LF/d$c;->b:Landroidx/compose/ui/e;

    iput-boolean p3, p0, LF/d$c;->c:Z

    iput-boolean p4, p0, LF/d$c;->d:Z

    iput-object p5, p0, LF/d$c;->e:LH/b;

    iput-object p6, p0, LF/d$c;->f:LF/L;

    iput-object p7, p0, LF/d$c;->g:LL0/U;

    iput-object p8, p0, LF/d$c;->h:LF/D;

    iput-object p9, p0, LF/d$c;->i:LH/d;

    iput-object p10, p0, LF/d$c;->j:Lmh/p;

    iput-object p11, p0, LF/d$c;->k:Ly/m;

    iput-object p12, p0, LF/d$c;->l:Lm0/l0;

    iput-object p13, p0, LF/d$c;->m:LI/o;

    iput-object p14, p0, LF/d$c;->n:LH/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

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

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.text.BasicSecureTextField.<anonymous> (BasicSecureTextField.kt:177)"

    const v4, 0x78a39ead

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v5, v0, LF/d$c;->a:LH/l;

    iget-object v6, v0, LF/d$c;->b:Landroidx/compose/ui/e;

    iget-boolean v7, v0, LF/d$c;->c:Z

    iget-boolean v1, v0, LF/d$c;->d:Z

    if-eqz v1, :cond_3

    iget-object v1, v0, LF/d$c;->e:LH/b;

    iget-object v2, v0, LF/d$c;->f:LF/L;

    invoke-virtual {v2}, LF/L;->f()LF/J;

    move-result-object v2

    invoke-static {v1, v2}, LF/d;->f(LH/b;LH/b;)LH/b;

    move-result-object v1

    :goto_1
    move-object v9, v1

    goto :goto_2

    :cond_3
    iget-object v1, v0, LF/d$c;->e:LH/b;

    goto :goto_1

    :goto_2
    iget-object v10, v0, LF/d$c;->g:LL0/U;

    iget-object v11, v0, LF/d$c;->h:LF/D;

    iget-object v12, v0, LF/d$c;->i:LH/d;

    sget-object v13, LH/k$c;->b:LH/k$c;

    iget-object v14, v0, LF/d$c;->j:Lmh/p;

    iget-object v15, v0, LF/d$c;->k:Ly/m;

    iget-object v1, v0, LF/d$c;->l:Lm0/l0;

    move-object/from16 v16, v1

    iget-object v1, v0, LF/d$c;->m:LI/o;

    move-object/from16 v17, v1

    iget-object v1, v0, LF/d$c;->n:LH/j;

    move-object/from16 v19, v1

    const/high16 v24, 0x180000

    const v25, 0xa000

    const/4 v8, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    const v23, 0x6000c00

    move-object/from16 v22, p1

    invoke-static/range {v5 .. v25}, LF/f;->b(LH/l;Landroidx/compose/ui/e;ZZLH/b;LL0/U;LF/D;LH/d;LH/k;Lmh/p;Ly/m;Lm0/l0;LI/o;LH/e;LH/j;Landroidx/compose/foundation/o;ZLT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/d$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

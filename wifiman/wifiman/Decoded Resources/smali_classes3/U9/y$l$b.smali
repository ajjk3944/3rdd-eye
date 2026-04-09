.class final LU9/y$l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU9/y$l;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic b:LU9/h;

.field final synthetic c:LU9/f;

.field final synthetic d:Lmh/l;

.field final synthetic e:Landroidx/fragment/app/Fragment;

.field final synthetic f:LU9/f;


# direct methods
.method constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;LU9/f;Lmh/l;Landroidx/fragment/app/Fragment;LU9/f;)V
    .locals 0

    iput-object p1, p0, LU9/y$l$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p2, p0, LU9/y$l$b;->b:LU9/h;

    iput-object p3, p0, LU9/y$l$b;->c:LU9/f;

    iput-object p4, p0, LU9/y$l$b;->d:Lmh/l;

    iput-object p5, p0, LU9/y$l$b;->e:Landroidx/fragment/app/Fragment;

    iput-object p6, p0, LU9/y$l$b;->f:LU9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/w;LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v10, p2

    const-string/jumbo v1, "navController"

    move-object/from16 v5, p1

    invoke-static {v5, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.mfa.UiMFA.<anonymous>.<anonymous> (UiMFA.kt:96)"

    const v3, 0x402cffec

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x1

    invoke-static {v1, v2, v11, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, LN/f0;->a:LN/f0;

    sget v3, LN/f0;->b:I

    invoke-virtual {v2, v10, v3}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v2

    invoke-virtual {v2}, LN/m;->c()J

    move-result-wide v12

    new-instance v14, LU9/y$l$b$a;

    iget-object v3, v0, LU9/y$l$b;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v4, v0, LU9/y$l$b;->b:LU9/h;

    iget-object v6, v0, LU9/y$l$b;->c:LU9/f;

    iget-object v7, v0, LU9/y$l$b;->d:Lmh/l;

    iget-object v8, v0, LU9/y$l$b;->e:Landroidx/fragment/app/Fragment;

    iget-object v9, v0, LU9/y$l$b;->f:LU9/f;

    move-object v2, v14

    move-object/from16 v5, p1

    invoke-direct/range {v2 .. v9}, LU9/y$l$b$a;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;LU9/h;Lf2/w;LU9/f;Lmh/l;Landroidx/fragment/app/Fragment;LU9/f;)V

    const/16 v2, 0x36

    const v3, -0x3004e9d8

    invoke-static {v3, v11, v14, v10, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x180006

    const/16 v14, 0x3a

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide v3, v12

    move-object/from16 v10, p2

    move v12, v14

    invoke-static/range {v1 .. v12}, LN/O0;->a(Landroidx/compose/ui/e;Lm0/i1;JJLs/g;FLmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf2/w;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LU9/y$l$b;->a(Lf2/w;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

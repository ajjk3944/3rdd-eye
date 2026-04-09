.class final Lcom/ui/core/ui/sso/login/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/core/ui/sso/login/b$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lmh/a;

.field final synthetic e:Z

.field final synthetic f:Lcom/ui/core/ui/sso/SSOAccountVM;

.field final synthetic g:Landroidx/fragment/app/Fragment;

.field final synthetic h:Lmh/l;


# direct methods
.method constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/core/ui/sso/login/b$a$b;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/ui/core/ui/sso/login/b$a$b;->b:Z

    iput-object p3, p0, Lcom/ui/core/ui/sso/login/b$a$b;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/ui/core/ui/sso/login/b$a$b;->d:Lmh/a;

    iput-boolean p5, p0, Lcom/ui/core/ui/sso/login/b$a$b;->e:Z

    iput-object p6, p0, Lcom/ui/core/ui/sso/login/b$a$b;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iput-object p7, p0, Lcom/ui/core/ui/sso/login/b$a$b;->g:Landroidx/fragment/app/Fragment;

    iput-object p8, p0, Lcom/ui/core/ui/sso/login/b$a$b;->h:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/w;LT/l;I)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    const-string/jumbo v1, "navController"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.login.UiLogin.<anonymous>.<anonymous> (UiLogin.kt:54)"

    const v4, -0x1aeca818

    move/from16 v5, p3

    invoke-static {v4, v5, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v3, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, LN/f0;->a:LN/f0;

    sget v4, LN/f0;->b:I

    invoke-virtual {v3, v10, v4}, LN/f0;->a(LT/l;I)LN/m;

    move-result-object v3

    invoke-virtual {v3}, LN/m;->c()J

    move-result-wide v3

    new-instance v6, Lcom/ui/core/ui/sso/login/b$a$b$a;

    iget-object v13, v0, Lcom/ui/core/ui/sso/login/b$a$b;->a:Ljava/lang/String;

    iget-boolean v14, v0, Lcom/ui/core/ui/sso/login/b$a$b;->b:Z

    iget-object v15, v0, Lcom/ui/core/ui/sso/login/b$a$b;->c:Ljava/lang/String;

    iget-object v7, v0, Lcom/ui/core/ui/sso/login/b$a$b;->d:Lmh/a;

    iget-boolean v8, v0, Lcom/ui/core/ui/sso/login/b$a$b;->e:Z

    iget-object v9, v0, Lcom/ui/core/ui/sso/login/b$a$b;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v12, v0, Lcom/ui/core/ui/sso/login/b$a$b;->g:Landroidx/fragment/app/Fragment;

    iget-object v11, v0, Lcom/ui/core/ui/sso/login/b$a$b;->h:Lmh/l;

    move-object/from16 v20, v11

    move-object v11, v6

    move-object/from16 v19, v12

    move-object/from16 v12, p1

    move-object/from16 v16, v7

    move/from16 v17, v8

    move-object/from16 v18, v9

    invoke-direct/range {v11 .. v20}, Lcom/ui/core/ui/sso/login/b$a$b$a;-><init>(Lf2/w;Ljava/lang/String;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;Lmh/l;)V

    const/16 v2, 0x36

    const v7, -0xcabbcd4

    invoke-static {v7, v5, v6, v10, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v11, 0x180006

    const/16 v12, 0x3a

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/core/ui/sso/login/b$a$b;->a(Lf2/w;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

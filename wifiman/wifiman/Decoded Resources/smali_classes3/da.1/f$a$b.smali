.class final Lda/f$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Landroidx/fragment/app/Fragment;

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lmh/a;

.field final synthetic f:Z

.field final synthetic g:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    iput-object p1, p0, Lda/f$a$b;->a:Ljava/lang/String;

    iput-object p2, p0, Lda/f$a$b;->b:Landroidx/fragment/app/Fragment;

    iput-boolean p3, p0, Lda/f$a$b;->c:Z

    iput-object p4, p0, Lda/f$a$b;->d:Ljava/lang/String;

    iput-object p5, p0, Lda/f$a$b;->e:Lmh/a;

    iput-boolean p6, p0, Lda/f$a$b;->f:Z

    iput-object p7, p0, Lda/f$a$b;->g:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf2/w;LT/l;I)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    const-string/jumbo v1, "navController"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v3, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous> (UiRegister.kt:57)"

    const v4, 0x55fe409f

    move/from16 v5, p3

    invoke-static {v4, v5, v1, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v3, v5, v4}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lla/a;->a:Lla/a;

    sget v4, Lla/a;->b:I

    invoke-virtual {v3, v10, v4}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v3

    invoke-virtual {v3}, Lma/a;->e()Lma/a$e;

    move-result-object v3

    invoke-virtual {v3}, Lma/a$e;->a()J

    move-result-wide v3

    new-instance v6, Lda/f$a$b$a;

    iget-object v13, v0, Lda/f$a$b;->a:Ljava/lang/String;

    iget-object v14, v0, Lda/f$a$b;->b:Landroidx/fragment/app/Fragment;

    iget-boolean v15, v0, Lda/f$a$b;->c:Z

    iget-object v7, v0, Lda/f$a$b;->d:Ljava/lang/String;

    iget-object v8, v0, Lda/f$a$b;->e:Lmh/a;

    iget-boolean v9, v0, Lda/f$a$b;->f:Z

    iget-object v12, v0, Lda/f$a$b;->g:Lcom/ui/core/ui/sso/SSOAccountVM;

    move-object v11, v6

    move-object/from16 v19, v12

    move-object/from16 v12, p1

    move-object/from16 v16, v7

    move-object/from16 v17, v8

    move/from16 v18, v9

    invoke-direct/range {v11 .. v19}, Lda/f$a$b$a;-><init>(Lf2/w;Ljava/lang/String;Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V

    const/16 v2, 0x36

    const v7, -0x35ef2325

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

    invoke-virtual {p0, p1, p2, p3}, Lda/f$a$b;->a(Lf2/w;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

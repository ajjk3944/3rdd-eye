.class final Lda/f$a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f$a$b;->a(Lf2/w;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf2/w;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroidx/fragment/app/Fragment;

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lmh/a;

.field final synthetic g:Z

.field final synthetic h:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Lf2/w;Ljava/lang/String;Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    iput-object p1, p0, Lda/f$a$b$a;->a:Lf2/w;

    iput-object p2, p0, Lda/f$a$b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lda/f$a$b$a;->c:Landroidx/fragment/app/Fragment;

    iput-boolean p4, p0, Lda/f$a$b$a;->d:Z

    iput-object p5, p0, Lda/f$a$b$a;->e:Ljava/lang/String;

    iput-object p6, p0, Lda/f$a$b$a;->f:Lmh/a;

    iput-boolean p7, p0, Lda/f$a$b$a;->g:Z

    iput-object p8, p0, Lda/f$a$b$a;->h:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lf2/u;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lda/f$a$b$a;->c(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lf2/u;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;Lf2/u;)LYg/J;
    .locals 15

    const-string v0, "$this$NavHost"

    move-object/from16 v13, p7

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lda/t$a;->a:Lda/t$a;

    invoke-virtual {v0}, Lda/t$a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lda/f$a$b$a$a;

    move-object v3, v0

    move-object v4, p0

    move/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    invoke-direct/range {v3 .. v10}, Lda/f$a$b$a$a;-><init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V

    const v1, -0xb013a68

    const/4 v14, 0x1

    invoke-static {v1, v14, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v10

    const/16 v11, 0xfe

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v0, Lda/t$b;->a:Lda/t$b;

    invoke-virtual {v0}, Lda/t$b;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Lda/f$a$b$a$b;

    move-object v1, p0

    move-object/from16 v3, p5

    invoke-direct {v0, v3, p0}, Lda/f$a$b$a$b;-><init>(Lcom/ui/core/ui/sso/SSOAccountVM;Landroidx/fragment/app/Fragment;)V

    const v1, 0x7da9bc81

    invoke-static {v1, v14, v0}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v10

    const/4 v3, 0x0

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v12}, Lg2/k;->b(Lf2/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/r;ILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v12, p1

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

    const-string/jumbo v3, "com.ui.core.ui.sso.register.UiRegister.<anonymous>.<anonymous>.<anonymous> (UiRegister.kt:61)"

    const v4, -0x35ef2325

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lda/f$a$b$a;->a:Lf2/w;

    iget-object v2, v0, Lda/f$a$b$a;->b:Ljava/lang/String;

    const v3, -0x474f7dec

    invoke-interface {v12, v3}, LT/l;->U(I)V

    iget-object v3, v0, Lda/f$a$b$a;->c:Landroidx/fragment/app/Fragment;

    invoke-interface {v12, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    iget-boolean v4, v0, Lda/f$a$b$a;->d:Z

    invoke-interface {v12, v4}, LT/l;->c(Z)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lda/f$a$b$a;->e:Ljava/lang/String;

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lda/f$a$b$a;->f:Lmh/a;

    invoke-interface {v12, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-boolean v4, v0, Lda/f$a$b$a;->g:Z

    invoke-interface {v12, v4}, LT/l;->c(Z)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lda/f$a$b$a;->h:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, v0, Lda/f$a$b$a;->a:Lf2/w;

    invoke-interface {v12, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v5, v0, Lda/f$a$b$a;->c:Landroidx/fragment/app/Fragment;

    iget-boolean v6, v0, Lda/f$a$b$a;->d:Z

    iget-object v7, v0, Lda/f$a$b$a;->e:Ljava/lang/String;

    iget-object v8, v0, Lda/f$a$b$a;->f:Lmh/a;

    iget-boolean v9, v0, Lda/f$a$b$a;->g:Z

    iget-object v10, v0, Lda/f$a$b$a;->h:Lcom/ui/core/ui/sso/SSOAccountVM;

    iget-object v11, v0, Lda/f$a$b$a;->a:Lf2/w;

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_4

    :cond_3
    new-instance v3, Lda/g;

    move-object v4, v3

    invoke-direct/range {v4 .. v11}, Lda/g;-><init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;Lf2/w;)V

    invoke-interface {v12, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v4

    check-cast v11, Lmh/l;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const/4 v14, 0x0

    const/16 v15, 0x3fc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v13, 0x30

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, Lg2/m;->b(Lf2/w;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;Lmh/l;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_5

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

    invoke-virtual {p0, p1, p2}, Lda/f$a$b$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

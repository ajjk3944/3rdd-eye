.class final Lda/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/f;->c(Landroidx/fragment/app/Fragment;Lcom/ui/core/ui/sso/SSOAccountVM;ZZLjava/lang/String;Lmh/a;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/fragment/app/Fragment;

.field final synthetic b:Z

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lmh/a;

.field final synthetic e:Z

.field final synthetic f:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    iput-object p1, p0, Lda/f$a;->a:Landroidx/fragment/app/Fragment;

    iput-boolean p2, p0, Lda/f$a;->b:Z

    iput-object p3, p0, Lda/f$a;->c:Ljava/lang/String;

    iput-object p4, p0, Lda/f$a;->d:Lmh/a;

    iput-boolean p5, p0, Lda/f$a;->e:Z

    iput-object p6, p0, Lda/f$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LQ9/j;
    .locals 1

    invoke-static {}, Lda/f$a;->c()LQ9/j;

    move-result-object v0

    return-object v0
.end method

.method private static final c()LQ9/j;
    .locals 1

    new-instance v0, Lda/f$a$a;

    invoke-direct {v0}, Lda/f$a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 12

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

    const-string/jumbo v1, "com.ui.core.ui.sso.register.UiRegister.<anonymous> (UiRegister.kt:50)"

    const v2, -0xa91c3ec

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Lda/t$a;->a:Lda/t$a;

    invoke-virtual {p2}, Lda/t$a;->a()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lda/f$a;->a:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o1()Landroidx/fragment/app/j;

    move-result-object v8

    const-string/jumbo v0, "requireActivity(...)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Lf2/D;

    invoke-static {v1, p1, v0}, Lg2/l;->d([Lf2/D;LT/l;I)Lf2/w;

    move-result-object v9

    const v0, 0x4824629

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    new-instance v0, Lda/e;

    invoke-direct {v0}, Lda/e;-><init>()V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v0

    check-cast v10, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    new-instance v11, Lda/f$a$b;

    iget-object v2, p0, Lda/f$a;->a:Landroidx/fragment/app/Fragment;

    iget-boolean v3, p0, Lda/f$a;->b:Z

    iget-object v4, p0, Lda/f$a;->c:Ljava/lang/String;

    iget-object v5, p0, Lda/f$a;->d:Lmh/a;

    iget-boolean v6, p0, Lda/f$a;->e:Z

    iget-object v7, p0, Lda/f$a;->f:Lcom/ui/core/ui/sso/SSOAccountVM;

    move-object v0, v11

    move-object v1, p2

    invoke-direct/range {v0 .. v7}, Lda/f$a$b;-><init>(Ljava/lang/String;Landroidx/fragment/app/Fragment;ZLjava/lang/String;Lmh/a;ZLcom/ui/core/ui/sso/SSOAccountVM;)V

    const/16 v0, 0x36

    const v1, 0x55fe409f

    const/4 v2, 0x1

    invoke-static {v1, v2, v11, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const v7, 0x301b0

    const/16 v11, 0x8

    const/4 v3, 0x0

    move-object v0, v8

    move-object v1, v10

    move-object v2, p2

    move-object v4, v9

    move-object v6, p1

    move v8, v11

    invoke-static/range {v0 .. v8}, LQ9/h;->g(Landroid/app/Activity;Lmh/a;Ljava/lang/String;Lmh/a;Lf2/w;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

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

    invoke-virtual {p0, p1, p2}, Lda/f$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

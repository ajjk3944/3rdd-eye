.class final Lda/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lda/s;->n(Lda/u;ZLjava/lang/String;Lmh/a;ZLT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lda/u;


# direct methods
.method constructor <init>(Lda/u;)V
    .locals 0

    iput-object p1, p0, Lda/s$c;->a:Lda/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 14

    move-object v0, p0

    move-object/from16 v10, p2

    const-string v1, "$this$UiColumnWithDividers"

    move-object v2, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.sso.register.UiRegisterLayout.<anonymous>.<anonymous>.<anonymous> (UiRegisterLayout.kt:182)"

    const v3, 0x16463d06

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->c0:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    const/4 v11, 0x0

    invoke-static {v1, v10, v11}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v1, Ls9/d$b;

    sget v3, LP9/b;->d0:I

    invoke-direct {v1, v3}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v10, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    iget-object v1, v0, Lda/s$c;->a:Lda/u;

    invoke-virtual {v1}, Lda/u;->f0()LLi/z;

    move-result-object v1

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v1, v12, v10, v11, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v1, v0, Lda/s$c;->a:Lda/u;

    const v5, 0x67239693

    invoke-interface {v10, v5}, LT/l;->U(I)V

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_2

    :cond_1
    new-instance v6, Lda/s$c$a;

    invoke-direct {v6, v1}, Lda/s$c$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v5, v6

    check-cast v5, Lmh/l;

    const/4 v8, 0x0

    const/16 v9, 0x21

    const/4 v1, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lda/s;->u(Landroidx/compose/ui/e;Ljava/lang/String;LL0/d;ZLmh/l;Lmh/l;LT/l;II)V

    new-instance v1, Ls9/d$b;

    sget v2, LP9/b;->t0:I

    invoke-direct {v1, v2}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, v10, v11}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v2

    new-instance v1, Ls9/d$a;

    const-string/jumbo v3, "terms-and-conditions-subtitle"

    sget-object v4, Lda/s$c$b;->a:Lda/s$c$b;

    invoke-direct {v1, v3, v4}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-static {v1, v10, v11}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v3

    iget-object v1, v0, Lda/s$c;->a:Lda/u;

    invoke-virtual {v1}, Lda/u;->o0()LLi/z;

    move-result-object v1

    invoke-static {v1, v12, v10, v11, v13}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v1, v0, Lda/s$c;->a:Lda/u;

    const v5, 0x6724c32b

    invoke-interface {v10, v5}, LT/l;->U(I)V

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v6, v5, :cond_4

    :cond_3
    new-instance v6, Lda/s$c$c;

    invoke-direct {v6, v1}, Lda/s$c$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v5, v6

    check-cast v5, Lmh/l;

    iget-object v1, v0, Lda/s$c;->a:Lda/u;

    const v6, 0x6724cb02

    invoke-interface {v10, v6}, LT/l;->U(I)V

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_5

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_6

    :cond_5
    new-instance v7, Lda/s$c$d;

    invoke-direct {v7, v1}, Lda/s$c$d;-><init>(Ljava/lang/Object;)V

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v6, v7

    check-cast v6, Lmh/l;

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v1, 0x0

    move-object/from16 v7, p2

    invoke-static/range {v1 .. v9}, Lda/s;->u(Landroidx/compose/ui/e;Ljava/lang/String;LL0/d;ZLmh/l;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lda/s$c;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

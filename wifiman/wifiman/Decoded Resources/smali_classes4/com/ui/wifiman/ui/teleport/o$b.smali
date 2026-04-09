.class final Lcom/ui/wifiman/ui/teleport/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/o;->i(Lcom/ui/wifiman/ui/teleport/d;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/teleport/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/teleport/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$b;->a:Lcom/ui/wifiman/ui/teleport/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 10

    const-string v0, "padding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.teleport.TeleportHomeUi.<anonymous> (TeleportHomeUi.kt:51)"

    const v2, 0x28ea3cf4

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget-object p3, p0, Lcom/ui/wifiman/ui/teleport/o$b;->a:Lcom/ui/wifiman/ui/teleport/d;

    invoke-virtual {p3}, Lcom/ui/wifiman/ui/teleport/d;->n0()LLi/N;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p3, v0, p2, v1, v2}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object p3

    invoke-interface {p3}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/ui/wifiman/ui/teleport/b;

    instance-of v3, p3, Lcom/ui/wifiman/ui/teleport/b$c;

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    const p3, 0x297f0ae

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p3, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object p1

    const p3, -0x72e5f4af

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Lc2/a;->a:Lc2/a;

    sget v0, Lc2/a;->c:I

    invoke-virtual {p3, p2, v0}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Landroidx/lifecycle/P$c;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const-class v2, Lcom/ui/wifiman/ui/teleport/B;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object p3

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p2, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Lye/i;

    invoke-direct {v5, p3, v0, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v3, v5, p2, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    check-cast p3, Lcom/ui/wifiman/ui/teleport/B;

    invoke-static {p1, p3, p2, v1}, Lcom/ui/wifiman/ui/teleport/J;->l(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/B;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    instance-of v3, p3, Lcom/ui/wifiman/ui/teleport/b$b;

    if-eqz v3, :cond_9

    const p3, 0x2980d4d

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p3, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p2, v1}, Lcom/ui/wifiman/ui/teleport/f;->b(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_9
    instance-of v3, p3, Lcom/ui/wifiman/ui/teleport/b$a;

    if-eqz v3, :cond_b

    const v3, 0x506c9796

    invoke-interface {p2, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v3, v4, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p3, Lcom/ui/wifiman/ui/teleport/b$a;

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/o$b;->a:Lcom/ui/wifiman/ui/teleport/d;

    invoke-static {p1, p3, v0, p2, v1}, Lcom/ui/wifiman/ui/teleport/v;->d(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/teleport/b$a;Lcom/ui/wifiman/ui/teleport/d;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_3
    return-void

    :cond_b
    const p1, 0x297e50e

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/teleport/o$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

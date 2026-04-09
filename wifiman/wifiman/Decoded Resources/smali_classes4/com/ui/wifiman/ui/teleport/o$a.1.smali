.class final Lcom/ui/wifiman/ui/teleport/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


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

    iput-object p1, p0, Lcom/ui/wifiman/ui/teleport/o$a;->a:Lcom/ui/wifiman/ui/teleport/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

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

    const-string v1, "com.ui.wifiman.ui.teleport.TeleportHomeUi.<anonymous> (TeleportHomeUi.kt:44)"

    const v2, 0x125b480d

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lcom/ui/wifiman/ui/teleport/o$a;->a:Lcom/ui/wifiman/ui/teleport/d;

    const v0, -0x72e5f4af

    invoke-interface {p1, v0}, LT/l;->U(I)V

    sget-object v0, Lc2/a;->a:Lc2/a;

    sget v1, Lc2/a;->c:I

    invoke-virtual {v0, p1, v1}, Lc2/a;->a(LT/l;I)Landroidx/lifecycle/S;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {}, Lye/j;->c()LT/H0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroidx/lifecycle/P$c;

    const/4 v8, 0x0

    const/16 v9, 0x10

    const-class v2, Lof/a$c;

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v2 .. v9}, Lc2/c;->b(Ljava/lang/Class;Landroidx/lifecycle/S;Ljava/lang/String;Landroidx/lifecycle/P$c;Lb2/a;LT/l;II)Landroidx/lifecycle/N;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p1, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-static {}, Ld/c;->a()LT/H0;

    move-result-object v2

    invoke-interface {p1, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/appcompat/app/c;

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v3

    invoke-interface {p1, v3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v3

    const v4, 0x318a4a49

    invoke-interface {p1, v4}, LT/l;->U(I)V

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lye/i;

    invoke-direct {v5, v0, v1, v2}, Lye/i;-><init>(Landroidx/lifecycle/N;Landroidx/lifecycle/o;Landroidx/appcompat/app/c;)V

    invoke-interface {p1, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v1, 0x0

    invoke-static {v3, v5, p1, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    check-cast v0, Lof/a$c;

    invoke-static {p2, v0, p1, v1}, Lcom/ui/wifiman/ui/teleport/o;->q(Lcom/ui/wifiman/ui/teleport/d;Lof/a$c;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/teleport/o$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

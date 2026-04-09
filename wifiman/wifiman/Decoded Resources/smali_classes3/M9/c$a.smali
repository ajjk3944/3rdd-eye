.class final LM9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM9/c;->a(Landroidx/compose/ui/e;LCi/e;Lmh/l;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LCi/e;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(LCi/e;Lmh/l;)V
    .locals 0

    iput-object p1, p0, LM9/c$a;->a:LCi/e;

    iput-object p2, p0, LM9/c$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg0/h;LC0/r;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LM9/c$a;->e(Lg0/h;LC0/r;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg0/d;Lg0/h;Lk0/l;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, LM9/c$a;->f(Lg0/d;Lg0/h;Lk0/l;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lg0/h;LC0/r;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LC0/s;->c(LC0/r;)Ll0/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg0/h;->g(Ll0/i;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f(Lg0/d;Lg0/h;Lk0/l;)LYg/J;
    .locals 1

    const-string/jumbo v0, "focusState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-interface {p2}, Lk0/l;->isFocused()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0, p1}, Lg0/d;->a(Lg0/h;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0, p1}, Lg0/d;->b(Lg0/h;)V

    :cond_1
    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final c(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 8

    const-string v0, "$this$composed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x63b694d3

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.util.autofill.<anonymous> (AutofillModifier.kt:20)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->e()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg0/i;

    const v0, -0x203eabbb

    invoke-interface {p2, v0}, LT/l;->U(I)V

    iget-object v0, p0, LM9/c$a;->a:LCi/e;

    iget-object v4, p0, LM9/c$a;->b:Lmh/l;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_1

    invoke-static {v0}, LZg/v;->i1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    new-instance v0, Lg0/h;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lg0/h;-><init>(Ljava/util/List;Ll0/i;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3, v0}, Lg0/i;->c(Lg0/h;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lg0/h;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->d()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg0/d;

    const v0, -0x203e8fc6

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_3

    :cond_2
    new-instance v2, LM9/a;

    invoke-direct {v2, v1}, LM9/a;-><init>(Lg0/h;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {p1, v2}, Landroidx/compose/ui/layout/o;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    const v0, -0x203e8321

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-interface {p2, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v2, LM9/b;

    invoke-direct {v2, p3, v1}, LM9/b;-><init>(Lg0/d;Lg0/h;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {p1, v2}, Landroidx/compose/ui/focus/b;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LM9/c$a;->c(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

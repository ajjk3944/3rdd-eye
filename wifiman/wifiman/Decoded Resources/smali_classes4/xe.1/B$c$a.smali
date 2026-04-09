.class final Lxe/B$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/B$c;->b(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/B$c$a$f;
    }
.end annotation


# instance fields
.field final synthetic a:LN/n0;

.field final synthetic b:Z

.field final synthetic c:LIi/N;

.field final synthetic d:LT/z1;


# direct methods
.method constructor <init>(LN/n0;ZLIi/N;LT/z1;)V
    .locals 0

    iput-object p1, p0, Lxe/B$c$a;->a:LN/n0;

    iput-boolean p2, p0, Lxe/B$c$a;->b:Z

    iput-object p3, p0, Lxe/B$c$a;->c:LIi/N;

    iput-object p4, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LIi/N;LN/n0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lxe/B$c$a;->c(LIi/N;LN/n0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LIi/N;LN/n0;)LYg/J;
    .locals 6

    new-instance v3, Lxe/B$c$a$e;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lxe/B$c$a$e;-><init>(LN/n0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 5

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.AppPopup.<anonymous>.<anonymous> (WiFimanAppNavigation.kt:290)"

    const v3, 0x3fbeafd4

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-static {p2}, Lxe/B$c;->a(LT/z1;)Lxe/g;

    move-result-object p2

    sget-object v0, Lxe/B$c$a$f;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eq p2, v0, :cond_c

    if-eq p2, v1, :cond_9

    const/4 v1, 0x3

    if-eq p2, v1, :cond_6

    const/4 v1, 0x4

    if-ne p2, v1, :cond_5

    const p2, -0x7c0a7ff

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {v2, p1, v3, v0}, Luf/e;->c(Luf/a;LT/l;II)V

    iget-object p2, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-static {p2}, Lxe/B$c;->a(LT/z1;)Lxe/g;

    move-result-object p2

    const v0, 0x188638c2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_4

    :cond_3
    new-instance v4, Lxe/B$c$a$d;

    invoke-direct {v4, v1, v2}, Lxe/B$c$a$d;-><init>(LN/n0;Ldh/e;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v4, p1, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto/16 :goto_1

    :cond_5
    const p2, 0x1885ce98

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    const p2, -0x7c41cd4

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {v2, p1, v3, v0}, Lgf/j;->g(Lgf/c;LT/l;II)V

    iget-object p2, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-static {p2}, Lxe/B$c;->a(LT/z1;)Lxe/g;

    move-result-object p2

    const v0, 0x18861ae2

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_8

    :cond_7
    new-instance v4, Lxe/B$c$a$c;

    invoke-direct {v4, v1, v2}, Lxe/B$c$a$c;-><init>(LN/n0;Ldh/e;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v4, p1, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto/16 :goto_1

    :cond_9
    const p2, -0x7c76611

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-static {v2, p1, v3, v0}, LIf/P;->d(LIf/b;LT/l;II)V

    iget-object p2, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-static {p2}, Lxe/B$c;->a(LT/z1;)Lxe/g;

    move-result-object p2

    const v0, 0x1885ff62

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_a

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_b

    :cond_a
    new-instance v4, Lxe/B$c$a$b;

    invoke-direct {v4, v1, v2}, Lxe/B$c$a$b;-><init>(LN/n0;Ldh/e;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v4, p1, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_1

    :cond_c
    const p2, -0x7cb0909

    invoke-interface {p1, p2}, LT/l;->U(I)V

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    invoke-static {p2, v1, v0, v2}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    iget-object p2, p0, Lxe/B$c$a;->d:LT/z1;

    invoke-static {p2}, Lxe/B$c;->a(LT/z1;)Lxe/g;

    move-result-object p2

    const v0, 0x1885e442

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_e

    :cond_d
    new-instance v4, Lxe/B$c$a$a;

    invoke-direct {v4, v1, v2}, Lxe/B$c$a$a;-><init>(LN/n0;Ldh/e;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v4, p1, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_1
    iget-boolean p2, p0, Lxe/B$c$a;->b:Z

    const v0, 0x18865f6c

    invoke-interface {p1, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lxe/B$c$a;->c:LIi/N;

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, Lxe/B$c$a;->c:LIi/N;

    iget-object v2, p0, Lxe/B$c$a;->a:LN/n0;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_f

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_10

    :cond_f
    new-instance v4, Lxe/E;

    invoke-direct {v4, v1, v2}, Lxe/E;-><init>(LIi/N;LN/n0;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v4, p1, v3, v3}, Ld/a;->a(ZLmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lxe/B$c$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

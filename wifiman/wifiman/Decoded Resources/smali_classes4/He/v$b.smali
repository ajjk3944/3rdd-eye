.class final LHe/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHe/v;->e(Landroidx/compose/ui/e;LL9/d;Lmh/a;Ljava/lang/String;Ls9/b;LHe/p;Lmh/q;JFLz/N;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ls9/b;

.field final synthetic c:LHe/p;


# direct methods
.method constructor <init>(Ljava/lang/String;Ls9/b;LHe/p;)V
    .locals 0

    iput-object p1, p0, LHe/v$b;->a:Ljava/lang/String;

    iput-object p2, p0, LHe/v$b;->b:Ls9/b;

    iput-object p3, p0, LHe/v$b;->c:LHe/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LHe/p;)LYg/J;
    .locals 0

    invoke-static {p0}, LHe/v$b;->c(LHe/p;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LHe/p;)LYg/J;
    .locals 1

    invoke-virtual {p0}, LHe/p;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LHe/p;->b()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LHe/p;->d()V

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 13

    const/4 v0, 0x3

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdown.<anonymous> (WifimanToolbarDropdown.kt:118)"

    const v3, 0x28d825e5

    invoke-static {v3, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p2, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->b()Lz/c$f;

    move-result-object v2

    iget-object v5, p0, LHe/v$b;->a:Ljava/lang/String;

    iget-object v6, p0, LHe/v$b;->b:Ls9/b;

    iget-object v4, p0, LHe/v$b;->c:LHe/p;

    sget-object v7, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v7}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v7

    const/4 v8, 0x6

    invoke-static {v2, v7, p1, v8}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {p1, v7}, LT/j;->a(LT/l;I)I

    move-result v8

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v9

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v10, LE0/g;->K:LE0/g$a;

    invoke-virtual {v10}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v12

    if-nez v12, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {p1, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v10}, LE0/g$a;->e()Lmh/p;

    move-result-object v12

    invoke-static {v11, v2, v12}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v11, v9, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v10}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v11}, LT/l;->o()Z

    move-result v9

    if-nez v9, :cond_5

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v11, v8, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v10}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v11, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    invoke-static {p2, v3, v7, v0, v3}, Landroidx/compose/foundation/layout/r;->H(Landroidx/compose/ui/e;Lf0/c$b;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    invoke-virtual {v4}, LHe/p;->c()Z

    move-result v7

    const v0, 0x1046be1a

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, LHe/w;

    invoke-direct {v1, v4}, LHe/w;-><init>(LHe/p;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v9, v1

    check-cast v9, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v11, 0x6

    const/16 v12, 0x10

    const/4 v8, 0x0

    move-object v4, p2

    move-object v10, p1

    invoke-static/range {v4 .. v12}, LL9/Q;->b(Landroidx/compose/ui/e;Ljava/lang/String;Ls9/b;ZLs/g;Lmh/a;LT/l;II)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LHe/v$b;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

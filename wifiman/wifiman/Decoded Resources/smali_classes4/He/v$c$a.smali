.class final LHe/v$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LHe/v$c;->b(Lq/e;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LT/z1;

.field final synthetic b:J

.field final synthetic c:Lmh/q;


# direct methods
.method constructor <init>(LT/z1;JLmh/q;)V
    .locals 0

    iput-object p1, p0, LHe/v$c$a;->a:LT/z1;

    iput-wide p2, p0, LHe/v$c$a;->b:J

    iput-object p4, p0, LHe/v$c$a;->c:Lmh/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LT/z1;LY0/d;)LY0/n;
    .locals 0

    invoke-static {p0, p1}, LHe/v$c$a;->c(LT/z1;LY0/d;)LY0/n;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LT/z1;LY0/d;)LY0/n;
    .locals 2

    const-string v0, "$this$offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, -0x64

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-static {p0}, LHe/v;->l(LT/z1;)F

    move-result p0

    sub-float/2addr v1, p0

    mul-float/2addr v0, v1

    invoke-static {v0}, LY0/h;->j(F)F

    move-result p0

    invoke-interface {p1, p0}, LY0/d;->x1(F)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, LY0/o;->a(II)J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/n;->b(J)LY0/n;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 11

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

    const-string v2, "com.ui.wifiman.ui.component.toolbar.WifimanToolbarDropdownContent.<anonymous>.<anonymous> (WifimanToolbarDropdown.kt:171)"

    const v3, -0x76bcc892

    invoke-static {v3, p2, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v0, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v0}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {p2, v2, v4, v1, v3}, Landroidx/compose/foundation/layout/r;->D(Landroidx/compose/ui/e;Lf0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    const v1, 0x5e768dea

    invoke-interface {p1, v1}, LT/l;->U(I)V

    iget-object v1, p0, LHe/v$c$a;->a:LT/z1;

    invoke-interface {p1, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LHe/v$c$a;->a:LT/z1;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_3

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, LHe/y;

    invoke-direct {v3, v2}, LHe/y;-><init>(LT/z1;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    invoke-static {p2, v3}, Landroidx/compose/foundation/layout/l;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p2

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v7

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v10}, LE/h;->f(FFFFILjava/lang/Object;)LE/g;

    move-result-object v1

    invoke-static {p2, v1}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v5

    iget-wide v6, p0, LHe/v$c$a;->b:J

    const/4 v9, 0x2

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p2

    iget-object v1, p0, LHe/v$c$a;->c:Lmh/q;

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    invoke-virtual {v0}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v0

    invoke-static {v2, v0, p1, v4}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v0

    invoke-static {p1, v4}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p1, p2}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p2

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_6
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, v0, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object v0

    invoke-static {v5, v3, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object v0

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, v0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object v0

    invoke-static {v5, p2, v0}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Lz/k;->a:Lz/k;

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p2, p1, v0}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LHe/v$c$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

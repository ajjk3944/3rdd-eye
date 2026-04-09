.class final LY9/i$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY9/i$g;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz/N;


# direct methods
.method constructor <init>(Lz/N;)V
    .locals 0

    iput-object p1, p0, LY9/i$g$b;->a:Lz/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/e;LT/l;I)V
    .locals 10

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.sso.mfa.auth.push.PushAuthLayout.<anonymous>.<anonymous> (PushAuthLayout.kt:86)"

    const v1, -0x4aace996

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    sget-object p1, Lla/a;->a:Lla/a;

    sget p3, Lla/a;->b:I

    invoke-virtual {p1, p2, p3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object p1

    invoke-virtual {p1}, Lma/a;->d()J

    move-result-wide v3

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LY9/i$g$b;->a:Lz/N;

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object p3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {p3}, Lf0/c$a;->e()Lf0/c;

    move-result-object p3

    const/4 v0, 0x0

    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object p3

    invoke-static {p2, v0}, LT/j;->a(LT/l;I)I

    move-result v0

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v1

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v2, LE0/g;->K:LE0/g$a;

    invoke-virtual {v2}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p2, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface {p2}, LT/l;->I()V

    :goto_0
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual {v2}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v3, p3, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->g()Lmh/p;

    move-result-object p3

    invoke-static {v3, v1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->b()Lmh/p;

    move-result-object p3

    invoke-interface {v3}, LT/l;->o()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0, p3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-virtual {v2}, LE0/g$a;->f()Lmh/p;

    move-result-object p3

    invoke-static {v3, p1, p3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/4 v8, 0x0

    const/16 v9, 0x1f

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LN/t0;->b(Landroidx/compose/ui/e;JFJILT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LY9/i$g$b;->a(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

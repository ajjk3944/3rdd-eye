.class final LL9/E$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/E;->g(LL9/d;Lmh/a;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL9/d;

.field final synthetic b:Lmh/a;


# direct methods
.method constructor <init>(LL9/d;Lmh/a;)V
    .locals 0

    iput-object p1, p0, LL9/E$a;->a:LL9/d;

    iput-object p2, p0, LL9/E$a;->b:Lmh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 9

    const-string v0, "$this$Container"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string/jumbo v0, "com.ui.core.ui.component.toolbar.Draw.<anonymous> (UiToolbar.kt:61)"

    const v1, -0x1acc920b

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, LL9/E$a;->a:LL9/d;

    instance-of p3, p1, LL9/d$a;

    if-eqz p3, :cond_3

    const p1, 0x2c6d5e30

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo p3, "ui_toolbar_back"

    invoke-static {p1, p3}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->h()Ls9/b;

    move-result-object p1

    new-instance p3, Ls9/d$b;

    sget v0, Lt9/b;->a:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p1, p3}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object v0

    iget-object v5, p0, LL9/E$a;->b:Lmh/a;

    const/4 v7, 0x0

    const/16 v8, 0xc

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto/16 :goto_1

    :cond_3
    instance-of p3, p1, LL9/d$b;

    if-eqz p3, :cond_4

    const p1, 0x2c73b03e

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo p3, "ui_toolbar_close"

    invoke-static {p1, p3}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->s()Ls9/b;

    move-result-object p1

    new-instance p3, Ls9/d$b;

    sget v0, Lt9/b;->b:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-virtual {p1, p3}, Ls9/b;->g(Ls9/d;)Ls9/b;

    move-result-object v0

    iget-object v5, p0, LL9/E$a;->b:Lmh/a;

    const/4 v7, 0x0

    const/16 v8, 0xc

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    move-object v6, p2

    invoke-static/range {v0 .. v8}, LL9/z;->c(Ls9/b;Landroidx/compose/ui/e;JZLmh/a;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_4
    instance-of p3, p1, LL9/d$c$b;

    const/4 v0, 0x0

    if-eqz p3, :cond_5

    const p1, 0x2c79dfe8

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const-string/jumbo p3, "ui_toolbar_custom_text"

    invoke-static {p1, p3}, LM9/i;->g(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object v2

    iget-object p1, p0, LL9/E$a;->a:LL9/d;

    check-cast p1, LL9/d$c$b;

    invoke-virtual {p1}, LL9/d$c$b;->a()Z

    move-result v3

    iget-object p1, p0, LL9/E$a;->a:LL9/d;

    check-cast p1, LL9/d$c$b;

    invoke-virtual {p1}, LL9/d$c$b;->b()Ls9/d;

    move-result-object p1

    invoke-static {p1, p2, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, LL9/E$a;->b:Lmh/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v1 .. v7}, LL9/O;->c(Ljava/lang/String;Landroidx/compose/ui/e;ZLmh/a;LT/l;II)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_1

    :cond_5
    instance-of p1, p1, LL9/d$c$a;

    if-eqz p1, :cond_7

    const p1, 0x2277de28

    invoke-interface {p2, p1}, LT/l;->U(I)V

    iget-object p1, p0, LL9/E$a;->a:LL9/d;

    check-cast p1, LL9/d$c$a;

    invoke-virtual {p1}, LL9/d$c$a;->a()Lmh/p;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LT/l;->J()V

    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_2
    return-void

    :cond_7
    const p1, 0x227720ed

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LL9/E$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

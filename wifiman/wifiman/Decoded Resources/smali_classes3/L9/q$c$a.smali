.class final LL9/q$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LL9/q$c;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;)V
    .locals 0

    iput-object p1, p0, LL9/q$c$a;->a:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ui.core.ui.component.toolbar.Title.<anonymous>.<anonymous> (UiToolbarBase.kt:143)"

    const v2, 0x7ae39a34

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x1a1b29d7

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p2, v1, :cond_3

    new-instance p2, Lr/C;

    sget-object v1, LY0/r;->b:LY0/r$a;

    invoke-static {v1}, Lr/u0;->e(LY0/r$a;)Lr/s0;

    move-result-object v1

    invoke-direct {p2, v1}, Lr/C;-><init>(Lr/s0;)V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, Lr/C;

    invoke-interface {p1}, LT/l;->J()V

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_4

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p1}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v1, LT/A;

    invoke-direct {v1, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, LT/A;

    invoke-virtual {v1}, LT/A;->a()LIi/N;

    move-result-object v0

    new-instance v1, LL9/q$c$a$a;

    iget-object v2, p0, LL9/q$c$a;->a:Lmh/p;

    invoke-direct {v1, p2, v0, v2}, LL9/q$c$a$a;-><init>(Lr/C;LIi/N;Lmh/p;)V

    const/16 p2, 0x36

    const v0, -0x7e3cb38d

    const/4 v2, 0x1

    invoke-static {v0, v2, v1, p1, p2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Landroidx/compose/ui/layout/l;->a(Lmh/q;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LL9/q$c$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.class final LLe/s$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLe/s$c;->b(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLe/d;

.field final synthetic b:LT/z1;


# direct methods
.method constructor <init>(LLe/d;LT/z1;)V
    .locals 0

    iput-object p1, p0, LLe/s$c$b;->a:LLe/d;

    iput-object p2, p0, LLe/s$c$b;->b:LT/z1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LLe/a;LT/l;I)V
    .locals 4

    const-string v0, "cnt"

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

    const-string v1, "com.ui.wifiman.ui.discovery.DiscoveryHomeUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeUi.kt:124)"

    const v2, 0x7f739448

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    instance-of p3, p1, LLe/a$a;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x6

    if-eqz p3, :cond_5

    const p3, -0xa6e92b3

    invoke-interface {p2, p3}, LT/l;->U(I)V

    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p3, v1, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p3

    check-cast p1, LLe/a$a;

    iget-object v0, p0, LLe/s$c$b;->a:LLe/d;

    invoke-static {p3, p1, v0, p2, v3}, LLe/f;->b(Landroidx/compose/ui/e;LLe/a$a;LLe/d;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_5
    instance-of p3, p1, LLe/a$b;

    if-eqz p3, :cond_6

    const p1, -0xa6e757d

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v1, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p1, p2, v3}, LLe/j;->d(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_6
    instance-of p1, p1, LLe/a$c;

    if-eqz p1, :cond_8

    const p1, -0x435daffa

    invoke-interface {p2, p1}, LT/l;->U(I)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p1, v1, v2, v0}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LLe/s$c$b;->b:LT/z1;

    invoke-static {p3}, LLe/s;->i(LT/z1;)LBe/b0;

    move-result-object p3

    invoke-virtual {p3}, LBe/b0;->c()LT/q0;

    move-result-object p3

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    xor-int/2addr p3, v2

    iget-object v0, p0, LLe/s$c$b;->a:LLe/d;

    invoke-static {p1, p3, v0, p2, v3}, LLe/m;->c(Landroidx/compose/ui/e;ZLLe/d;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_3
    return-void

    :cond_8
    const p1, -0xa6e993d

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLe/a;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LLe/s$c$b;->a(LLe/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

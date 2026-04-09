.class public final Landroidx/compose/ui/platform/T;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/g0;


# instance fields
.field private final a:Landroid/view/Choreographer;

.field private final b:Landroidx/compose/ui/platform/Q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;Landroidx/compose/ui/platform/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/platform/T;->a:Landroid/view/Choreographer;

    iput-object p2, p0, Landroidx/compose/ui/platform/T;->b:Landroidx/compose/ui/platform/Q;

    return-void
.end method


# virtual methods
.method public final b()Landroid/view/Choreographer;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/T;->a:Landroid/view/Choreographer;

    return-object v0
.end method

.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LT/g0$a;->a(LT/g0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->b(LT/g0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Landroidx/compose/ui/platform/T;->b:Landroidx/compose/ui/platform/Q;

    if-nez v0, :cond_1

    invoke-interface {p2}, Ldh/e;->getContext()Ldh/i;

    move-result-object v0

    sget-object v1, Ldh/f;->m0:Ldh/f$b;

    invoke-interface {v0, v1}, Ldh/i;->get(Ldh/i$c;)Ldh/i$b;

    move-result-object v0

    instance-of v1, v0, Landroidx/compose/ui/platform/Q;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/compose/ui/platform/Q;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    new-instance v1, LIi/p;

    invoke-static {p2}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LIi/p;-><init>(Ldh/e;I)V

    invoke-virtual {v1}, LIi/p;->A()V

    new-instance v2, Landroidx/compose/ui/platform/T$c;

    invoke-direct {v2, v1, p0, p1}, Landroidx/compose/ui/platform/T$c;-><init>(LIi/n;Landroidx/compose/ui/platform/T;Lmh/l;)V

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/platform/Q;->x0()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/T;->b()Landroid/view/Choreographer;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, v2}, Landroidx/compose/ui/platform/Q;->C0(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Landroidx/compose/ui/platform/T$a;

    invoke-direct {p1, v0, v2}, Landroidx/compose/ui/platform/T$a;-><init>(Landroidx/compose/ui/platform/Q;Landroid/view/Choreographer$FrameCallback;)V

    invoke-interface {v1, p1}, LIi/n;->B(Lmh/l;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/platform/T;->b()Landroid/view/Choreographer;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    new-instance p1, Landroidx/compose/ui/platform/T$b;

    invoke-direct {p1, p0, v2}, Landroidx/compose/ui/platform/T$b;-><init>(Landroidx/compose/ui/platform/T;Landroid/view/Choreographer$FrameCallback;)V

    invoke-interface {v1, p1}, LIi/n;->B(Lmh/l;)V

    :goto_1
    invoke-virtual {v1}, LIi/p;->u()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_3

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_3
    return-object p1
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->c(LT/g0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->d(LT/g0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

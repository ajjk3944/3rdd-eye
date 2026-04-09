.class final Laf/N$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/N;->b(Landroidx/compose/ui/e;Laf/I;Lmh/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Laf/J;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Laf/J;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Laf/N$a;->a:Laf/J;

    iput-object p2, p0, Laf/N$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Laf/J;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Laf/N$a;->e(Lmh/l;Laf/J;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()LYg/J;
    .locals 1

    invoke-static {}, Laf/N$a;->f()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Lmh/l;Laf/J;)LYg/J;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final f()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public final c(Lq/e;LT/l;I)V
    .locals 11

    const-string v0, "$this$AnimatedVisibility"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speed.component.SpeedTabPermissionCardUi.<anonymous>.<anonymous>.<anonymous> (SpeedTabPermissionCardUi.kt:40)"

    const v1, -0x20d08f14

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p3, v0}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    new-instance p1, LC9/i;

    iget-object p3, p0, Laf/N$a;->a:Laf/J;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    sget-object p3, LN9/b;->a:LN9/b;

    invoke-virtual {p3}, LN9/b;->v()Ls9/b;

    move-result-object p3

    new-instance v0, Ls9/b$b;

    const-string v1, "orange"

    sget-object v3, Laf/N$a$a;->a:Laf/N$a$a;

    invoke-direct {v0, v1, v3}, Ls9/b$b;-><init>(Ljava/lang/String;Lmh/p;)V

    invoke-virtual {p3, v0}, Ls9/b;->f(Ls9/b$b;)Ls9/b;

    move-result-object v5

    iget-object p3, p0, Laf/N$a;->a:Laf/J;

    invoke-virtual {p3}, Laf/J;->getText()Ls9/d;

    move-result-object v6

    new-instance v7, LC9/i$a$b;

    new-instance p3, Ls9/d$b;

    sget v0, Lm8/c;->J1:I

    invoke-direct {p3, v0}, Ls9/d$b;-><init>(I)V

    invoke-direct {v7, p3}, LC9/i$a$b;-><init>(Ls9/d;)V

    const/16 v9, 0x10

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v3 .. v10}, LC9/i;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;LC9/i$a;LC9/i$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p3, -0x5503ad7a

    invoke-interface {p2, p3}, LT/l;->U(I)V

    iget-object p3, p0, Laf/N$a;->b:Lmh/l;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    iget-object v0, p0, Laf/N$a;->a:Laf/J;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    iget-object v0, p0, Laf/N$a;->b:Lmh/l;

    iget-object v1, p0, Laf/N$a;->a:Laf/J;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p3, :cond_1

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v3, p3, :cond_2

    :cond_1
    new-instance v3, Laf/L;

    invoke-direct {v3, v0, v1}, Laf/L;-><init>(Lmh/l;Laf/J;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v5, v3

    check-cast v5, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const p3, -0x5503a384

    invoke-interface {p2, p3}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_3

    new-instance p3, Laf/M;

    invoke-direct {p3}, Laf/M;-><init>()V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    move-object v6, p3

    check-cast v6, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    sget-object v7, LC9/h$a;->a:LC9/h$a;

    const v9, 0x36006

    const/4 v10, 0x4

    const/4 v4, 0x0

    move-object v3, p1

    move-object v8, p2

    invoke-static/range {v2 .. v10}, LC9/s;->o(Landroidx/compose/ui/e;LC9/i;ZLmh/a;Lmh/a;LC9/h;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Laf/N$a;->c(Lq/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

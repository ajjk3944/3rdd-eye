.class final Laf/m0$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laf/m0$d$a;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Boolean;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Ljava/lang/Boolean;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Laf/m0$d$a$a;->a:Ljava/lang/Boolean;

    iput-object p2, p0, Laf/m0$d$a$a;->b:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lmh/l;Ljava/lang/Boolean;Z)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Laf/m0$d$a$a;->c(Lmh/l;Ljava/lang/Boolean;Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lmh/l;Ljava/lang/Boolean;Z)LYg/J;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.speed.component.SpeedTestButtonsContainer.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SpeedTabSpeedtestCardUi.kt:193)"

    const v2, -0x53e55c03

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, Laf/m0$d$a$a;->a:Ljava/lang/Boolean;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :goto_1
    move v1, p2

    goto :goto_2

    :cond_3
    const/4 p2, 0x0

    goto :goto_1

    :goto_2
    const p2, -0x2e130d96

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, Laf/m0$d$a$a;->b:Lmh/l;

    invoke-interface {p1, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    iget-object v0, p0, Laf/m0$d$a$a;->a:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    iget-object v0, p0, Laf/m0$d$a$a;->b:Lmh/l;

    iget-object v2, p0, Laf/m0$d$a$a;->a:Ljava/lang/Boolean;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_4

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v3, p2, :cond_5

    :cond_4
    new-instance v3, Laf/o0;

    invoke-direct {v3, v0, v2}, Laf/o0;-><init>(Lmh/l;Ljava/lang/Boolean;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v2, v3

    check-cast v2, Lmh/l;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v6, 0x0

    const/16 v7, 0x19

    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v7}, Lx9/h;->m(Landroidx/compose/ui/e;ZLmh/l;ZLy/m;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    :goto_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Laf/m0$d$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

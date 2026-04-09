.class final Llf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llf/d;->b(Landroidx/compose/ui/e;Llf/l;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Llf/l;


# direct methods
.method constructor <init>(Llf/l;)V
    .locals 0

    iput-object p1, p0, Llf/d$a;->a:Llf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Llf/l;Lmf/a;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Llf/d$a;->c(Llf/l;Lmf/a;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llf/l;Lmf/a;)LYg/J;
    .locals 0

    check-cast p1, Lmf/a$a;

    invoke-virtual {p1}, Lmf/a$a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Llf/l;->q0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/e;Lmf/a;LT/l;I)V
    .locals 10

    const-string v0, "itemModifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    const/16 v1, 0x20

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    move p4, v1

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v2, 0x92

    if-ne p4, v2, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.server.SpeedtestInternetServerPickerContentUi.<anonymous> (SpeedtestInternetServerPickerContentUi.kt:20)"

    const v3, -0x1ee30091

    invoke-static {v3, v0, p4, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    instance-of p4, p2, Lmf/a$a;

    if-eqz p4, :cond_b

    const p4, 0x6dc8a1f1

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, Llf/d$a;->a:Llf/l;

    invoke-interface {p3, p4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    and-int/lit8 v0, v0, 0x70

    const/4 v2, 0x0

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_4

    :cond_7
    move v0, v2

    :goto_4
    or-int/2addr p4, v0

    iget-object v0, p0, Llf/d$a;->a:Llf/l;

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_8

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_9

    :cond_8
    new-instance v1, Llf/c;

    invoke-direct {v1, v0, p2}, Llf/c;-><init>(Llf/l;Lmf/a;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v7, v1

    check-cast v7, Lmh/a;

    invoke-interface {p3}, LT/l;->J()V

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v9}, Landroidx/compose/foundation/d;->d(Landroidx/compose/ui/e;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    check-cast p2, Lmf/a$a;

    invoke-static {p1, p2, p3, v2}, Lmf/d;->c(Landroidx/compose/ui/e;Lmf/a$a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    return-void

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, Lmf/a;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Llf/d$a;->b(Landroidx/compose/ui/e;Lmf/a;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

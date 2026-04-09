.class final Lkf/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkf/f;->b(Landroidx/compose/ui/e;Lkf/b;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkf/b;


# direct methods
.method constructor <init>(Lkf/b;)V
    .locals 0

    iput-object p1, p0, Lkf/f$b;->a:Lkf/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lkf/b;Lhf/o;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lkf/f$b;->c(Lkf/b;Lhf/o;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lkf/b;Lhf/o;)LYg/J;
    .locals 0

    invoke-virtual {p1}, Lhf/o;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkf/b;->t0(Ljava/lang/String;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lhf/o;LT/l;I)V
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.results.SpeedtestResultsContentUi.<anonymous> (SpeedtestResultsContentUi.kt:25)"

    const v3, -0x996ea3c

    invoke-static {v3, p3, v0, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    const v0, 0x672926c1

    invoke-interface {p2, v0}, LT/l;->U(I)V

    iget-object v0, p0, Lkf/f$b;->a:Lkf/b;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 p3, p3, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne p3, v1, :cond_5

    move p3, v3

    goto :goto_2

    :cond_5
    move p3, v2

    :goto_2
    or-int/2addr p3, v0

    iget-object v0, p0, Lkf/f$b;->a:Lkf/b;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p3, :cond_6

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v1, p3, :cond_7

    :cond_6
    new-instance v1, Lkf/g;

    invoke-direct {v1, v0, p1}, Lkf/g;-><init>(Lkf/b;Lhf/o;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    const/4 p1, 0x0

    invoke-static {p1, v1, p2, v2, v3}, LEe/I;->c(Landroidx/compose/ui/e;Lmh/a;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lhf/o;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lkf/f$b;->b(Lhf/o;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

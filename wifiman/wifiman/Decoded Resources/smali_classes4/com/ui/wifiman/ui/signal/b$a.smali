.class final Lcom/ui/wifiman/ui/signal/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/signal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/signal/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/signal/b$a;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/signal/b$a;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/signal/b$a;->a:Lcom/ui/wifiman/ui/signal/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LTe/K0;LT/l;I)V
    .locals 9

    const-string v2, "mdf"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "item"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_1
    move v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    const/16 v4, 0x40

    const/16 v5, 0x10

    if-nez v3, :cond_4

    and-int/lit8 v3, p4, 0x40

    if-nez v3, :cond_2

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    move v3, v5

    :goto_3
    or-int/2addr v2, v3

    :cond_4
    and-int/lit16 v3, v2, 0x93

    const/16 v6, 0x92

    if-ne v3, v6, :cond_6

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_7

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_7

    const/4 v3, -0x1

    const-string v6, "com.ui.wifiman.ui.signal.ComposableSingletons$SignalTabSignalStrengthUiKt.lambda-1.<anonymous> (SignalTabSignalStrengthUi.kt:52)"

    const v7, -0x522551f9

    invoke-static {v7, v2, v3, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of v2, p2, LTe/K0$i;

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_8

    const v1, -0x23efdf58

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-static {p1, v7, v6, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v1, v4

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v4

    int-to-float v1, v5

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_6

    :cond_8
    instance-of v2, p2, LTe/K0$c;

    if-eqz v2, :cond_a

    const v2, -0x5a07e969

    invoke-interface {p3, v2}, LT/l;->U(I)V

    move-object v1, p2

    check-cast v1, LTe/K0$c;

    invoke-virtual {v1}, LTe/K0$c;->b()I

    move-result v1

    if-lez v1, :cond_9

    invoke-static {p1, v7, v6, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v1, v5

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    :cond_9
    invoke-interface {p3}, LT/l;->J()V

    goto :goto_6

    :cond_a
    instance-of v2, p2, LTe/K0$l;

    if-nez v2, :cond_c

    instance-of v2, p2, LTe/K0$b;

    if-nez v2, :cond_c

    instance-of v2, p2, LTe/K0$k;

    if-nez v2, :cond_c

    instance-of v1, p2, LTe/K0$d;

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    const v1, -0x23ef6fa6

    invoke-interface {p3, v1}, LT/l;->U(I)V

    invoke-static {p1, v7, v6, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    int-to-float v1, v5

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v4

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v6, p3

    invoke-static/range {v0 .. v8}, Lz9/b;->b(Landroidx/compose/ui/e;JFFFLT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_6

    :cond_c
    :goto_5
    const v0, -0x59ffbd84

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_7
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LTe/K0;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/signal/b$a;->a(Landroidx/compose/ui/e;LTe/K0;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

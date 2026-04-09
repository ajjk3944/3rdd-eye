.class final Lcom/ui/wifiman/ui/speedtest/feedback/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/ui/speedtest/feedback/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/ui/speedtest/feedback/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;-><init>()V

    sput-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(Lz/j;LT/l;I)V
    .locals 12

    const-string v1, "$this$ModalScaffold"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.speedtest.feedback.ComposableSingletons$SpeedtestFeedbackUiKt.lambda-2.<anonymous> (SpeedtestFeedbackUi.kt:55)"

    const v3, -0x65739b8a

    invoke-static {v3, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxe/f$b;

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    new-instance v2, Ls9/d$b;

    sget v3, Lm8/c;->d3:I

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    sget-object v3, LL9/d$a;->b:LL9/d$a;

    const v4, -0x578042a3

    invoke-interface {p2, v4}, LT/l;->U(I)V

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Lcom/ui/wifiman/ui/speedtest/feedback/b;

    invoke-direct {v5, v0}, Lcom/ui/wifiman/ui/speedtest/feedback/b;-><init>(Lxe/f$b;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    move-object v4, v5

    check-cast v4, Lmh/a;

    invoke-interface {p2}, LT/l;->J()V

    sget-object v0, Lcom/ui/wifiman/ui/speedtest/feedback/a;->a:Lcom/ui/wifiman/ui/speedtest/feedback/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/speedtest/feedback/a;->a()Lmh/q;

    move-result-object v5

    sget v0, LL9/d$a;->c:I

    shl-int/lit8 v0, v0, 0x6

    or-int/lit16 v8, v0, 0x6006

    const/16 v9, 0x20

    const-wide/16 v10, 0x0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    move-wide v5, v10

    move-object v7, p2

    invoke-static/range {v0 .. v9}, LFe/j;->c(Landroidx/compose/ui/e;Ls9/d;LL9/d;Lmh/a;Lmh/q;JLT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/speedtest/feedback/a$b;->b(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.class final Lnf/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lnf/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnf/a$c;

    invoke-direct {v0}, Lnf/a$c;-><init>()V

    sput-object v0, Lnf/a$c;->a:Lnf/a$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lq/b;Lnf/f;LT/l;I)V
    .locals 3

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speedtest.test.ComposableSingletons$SpeedtestProcessUiKt.lambda-3.<anonymous> (SpeedtestProcessUi.kt:366)"

    const v1, 0x7a7b34d6

    invoke-static {v1, p4, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v0, Lla/a;->a:Lla/a;

    sget v1, Lla/a;->b:I

    invoke-virtual {v0, p3, v1}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v2

    invoke-virtual {v2}, Lra/a;->a()Lra/b;

    move-result-object v2

    invoke-virtual {v2}, Lra/b;->a()Lra/b$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lra/b$a$a;->d()F

    move-result v2

    invoke-virtual {v0, p3, v1}, Lla/a;->d(LT/l;I)Lra/a;

    move-result-object v0

    invoke-virtual {v0}, Lra/a;->a()Lra/b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b;->b()Lra/b$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lra/b$a$b;->d()F

    move-result v0

    invoke-static {p1, v2, v0}, Landroidx/compose/foundation/layout/o;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p1

    and-int/lit8 p4, p4, 0x70

    invoke-static {p1, p2, p3, p4}, Lnf/p;->p(Landroidx/compose/ui/e;Lnf/f;LT/l;I)V

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq/b;

    check-cast p2, Lnf/f;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lnf/a$c;->a(Lq/b;Lnf/f;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

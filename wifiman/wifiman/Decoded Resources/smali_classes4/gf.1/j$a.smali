.class final Lgf/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgf/j;->g(Lgf/c;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgf/c;


# direct methods
.method constructor <init>(Lgf/c;)V
    .locals 0

    iput-object p1, p0, Lgf/j$a;->a:Lgf/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/Y;LT/l;I)V
    .locals 2

    const-string v0, "$this$UiToolbar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LT/l;->v()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.ui.wifiman.ui.speedtest.a2a.A2ASpeedtestPopupUi.<anonymous>.<anonymous> (A2ASpeedtestPopupUi.kt:66)"

    const v1, 0x1de27b66

    invoke-static {v1, p3, p1, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p1, Lgf/j$a$a;

    iget-object p3, p0, Lgf/j$a;->a:Lgf/c;

    invoke-direct {p1, p3}, Lgf/j$a$a;-><init>(Lgf/c;)V

    const/16 p3, 0x36

    const v0, 0x1731beff

    const/4 v1, 0x1

    invoke-static {v0, v1, p1, p2, p3}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object p1

    const/16 p3, 0x30

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3, v1}, LL9/L;->b(Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/Y;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lgf/j$a;->a(Lz/Y;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

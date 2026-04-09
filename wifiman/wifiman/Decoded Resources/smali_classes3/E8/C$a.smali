.class final LE8/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/C;->c(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b$b;

.field final synthetic b:Lcom/ui/wifiman/model/speedtest/result/b$b;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b$b;Lcom/ui/wifiman/model/speedtest/result/b$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LE8/C$a;->a:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iput-object p2, p0, LE8/C$a;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    iput-object p3, p0, LE8/C$a;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 6

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x335254dd    # -9.105231E7f

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultPresentationUtil.measurementDirectionText.<anonymous> (SpeedtestResultPresentationUtil.kt:53)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p3, 0x7f1102ba

    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string/jumbo v0, "getString(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LE8/C$a;->a:Lcom/ui/wifiman/model/speedtest/result/b$b;

    instance-of v2, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    const v3, 0x7f1100af

    const v4, 0x7f110134

    if-nez v2, :cond_3

    instance-of v2, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v1, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v1, :cond_2

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v2, LE8/C;->a:LE8/C;

    invoke-static {v2, v1}, LE8/C;->a(LE8/C;Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    iget-object v2, p0, LE8/C$a;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    if-eqz v2, :cond_5

    sget-object v5, LE8/C;->a:LE8/C;

    invoke-static {v5, v2}, LE8/C;->a(LE8/C;Lcom/ui/wifiman/model/speedtest/result/b$b;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    :cond_5
    iget-object v2, p0, LE8/C$a;->b:Lcom/ui/wifiman/model/speedtest/result/b$b;

    instance-of v5, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$a;

    if-nez v5, :cond_9

    instance-of v5, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$c;

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    instance-of v3, v2, Lcom/ui/wifiman/model/speedtest/result/b$b$b;

    if-eqz v3, :cond_7

    invoke-virtual {p1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v2, p1

    goto :goto_4

    :cond_7
    if-nez v2, :cond_8

    iget-object v2, p0, LE8/C$a;->c:Ljava/lang/String;

    if-nez v2, :cond_a

    const v2, 0x7f1100ae

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_3
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_a
    :goto_4
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :cond_b
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p3, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p3, "format(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/Context;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LE8/C$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.class final LE8/A$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/A;->Q0(Lcom/ui/wifiman/model/speedtest/result/b;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/speedtest/result/b;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/speedtest/result/b;)V
    .locals 0

    iput-object p1, p0, LE8/A$h;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 10

    const-string v0, "$unused$var$"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x5179d468

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultDetailVM.getDetails.<anonymous>.<anonymous> (SpeedtestResultDetailVM.kt:108)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Lhf/c;->a:Lhf/c;

    iget-object p1, p0, LE8/A$h;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LW7/b;->b()LW7/a;

    move-result-object v3

    iget-object p1, p0, LE8/A$h;->a:Lcom/ui/wifiman/model/speedtest/result/b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b;->j()Lcom/ui/wifiman/model/speedtest/result/b$d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/result/b$d;->e()LW7/b;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, LW7/b;->c()LW7/a;

    move-result-object v5

    sget p1, Lhf/c;->c:I

    shl-int/lit8 v8, p1, 0xc

    const/16 v9, 0xa

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v7, p2

    invoke-virtual/range {v2 .. v9}, Lhf/c;->e(LW7/a;ZLW7/a;ZLT/l;II)LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
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

    invoke-virtual {p0, p1, p2, p3}, LE8/A$h;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

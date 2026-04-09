.class final LD8/x$z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/x$z;->b(Ljava/lang/Boolean;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$c;Ll9/a;Ll9/a;Ll9/a;)Laf/e0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LD8/x$b;


# direct methods
.method constructor <init>(LD8/x$b;)V
    .locals 0

    iput-object p1, p0, LD8/x$z$a;->a:LD8/x$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 12

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7cc6dd63

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ubnt.usurvey.ui.speed.SpeedTabVM.speedtestCard.<anonymous>.<anonymous> (SpeedTabVM.kt:198)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Lhf/c;->a:Lhf/c;

    iget-object p1, p0, LD8/x$z$a;->a:LD8/x$b;

    invoke-virtual {p1}, LD8/x$b;->f()Ljava/lang/Long;

    move-result-object p1

    const/4 p3, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, v0, v1}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    move-object v3, p1

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    iget-object p1, p0, LD8/x$z$a;->a:LD8/x$b;

    invoke-virtual {p1}, LD8/x$b;->g()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    sget-object p1, LW7/a;->b:LW7/a$a;

    invoke-virtual {p1, v0, v1}, LW7/a$a;->b(J)LW7/a;

    move-result-object p1

    move-object v5, p1

    goto :goto_1

    :cond_2
    move-object v5, p3

    :goto_1
    sget p1, Lhf/c;->c:I

    shl-int/lit8 p1, p1, 0x12

    const/high16 p3, 0x30000

    or-int v10, p1, p3

    const/16 v11, 0x1a

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p2

    invoke-virtual/range {v2 .. v11}, Lhf/c;->a(LW7/a;ZLW7/a;ZLjava/lang/String;Ls9/d;LT/l;II)LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
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

    invoke-virtual {p0, p1, p2, p3}, LD8/x$z$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

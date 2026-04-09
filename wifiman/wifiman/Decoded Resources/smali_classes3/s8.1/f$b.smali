.class final Ls8/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls8/f;->g(Lhd/a;)Ls9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LS8/l;

.field final synthetic b:Ljava/lang/Integer;

.field final synthetic c:LS8/c;


# direct methods
.method constructor <init>(LS8/l;Ljava/lang/Integer;LS8/c;)V
    .locals 0

    iput-object p1, p0, Ls8/f$b;->a:LS8/l;

    iput-object p2, p0, Ls8/f$b;->b:Ljava/lang/Integer;

    iput-object p3, p0, Ls8/f$b;->c:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 7

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3b93d3ef

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ubnt.usurvey.ui.notification.NetworkConnectionNotificationServiceImpl.additionalInfoText.<anonymous>.<anonymous> (NetworkConnectionNotificationServiceImpl.kt:75)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p3, p0, Ls8/f$b;->a:LS8/l;

    iget-object v0, p0, Ls8/f$b;->b:Ljava/lang/Integer;

    iget-object v1, p0, Ls8/f$b;->c:LS8/c;

    new-instance v2, LL0/d$a;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-direct {v2, v3, v4, v5}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p3, :cond_1

    const/4 v6, 0x2

    invoke-static {p3, v4, v5, v6, v5}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v5

    :cond_1
    const p3, -0x72cccceb

    invoke-interface {p2, p3}, LT/l;->U(I)V

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v5, p2, v3}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object p3

    invoke-virtual {v2, p3}, LL0/d$a;->g(LL0/d;)V

    :goto_0
    invoke-interface {p2}, LT/l;->J()V

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {v2}, LL0/d$a;->j()I

    move-result v0

    const-string v3, "  "

    if-lez v0, :cond_3

    invoke-virtual {v2, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_3
    const v0, 0x7f1101f5

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v5, "getString(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v6, "format(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, LL0/d$a;->i(Ljava/lang/String;)V

    if-eqz v1, :cond_4

    invoke-virtual {v2, v3}, LL0/d$a;->i(Ljava/lang/String;)V

    const v0, 0x7f1103be

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->a:Lcom/ubnt/usurvey/wifi/WifiChannelUtils;

    invoke-virtual {v0, p3, v1}, Lcom/ubnt/usurvey/wifi/WifiChannelUtils;->b(ILS8/c;)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v2}, LL0/d$a;->p()LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
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

    invoke-virtual {p0, p1, p2, p3}, Ls8/f$b;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

.class public final LO8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lse/g;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/NotificationManager;

.field private c:Lcom/ui/wifiman/model/wmw/g$c$b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "notificationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO8/d;->a:Landroid/content/Context;

    iput-object p2, p0, LO8/d;->b:Landroid/app/NotificationManager;

    return-void
.end method

.method private final e()Ls1/k$d;
    .locals 7

    new-instance v0, Ls1/k$d;

    iget-object v1, p0, LO8/d;->a:Landroid/content/Context;

    sget-object v2, LO7/b;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/b;

    invoke-virtual {v2}, LO7/b;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ls1/k$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x7f0703e2

    invoke-virtual {v0, v1}, Ls1/k$d;->t(I)Ls1/k$d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ls1/k$d;->r(I)Ls1/k$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls1/k$d;->q(Z)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/k$d;->w(I)Ls1/k$d;

    move-result-object v0

    const-string/jumbo v2, "status"

    invoke-virtual {v0, v2}, Ls1/k$d;->f(Ljava/lang/String;)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/k$d;->e(Z)Ls1/k$d;

    move-result-object v0

    iget-object v2, p0, LO8/d;->a:Landroid/content/Context;

    invoke-static {v2}, Ls1/u;->i(Landroid/content/Context;)Ls1/u;

    move-result-object v2

    sget-object v3, Li8/s;->a:Li8/s$a;

    iget-object v4, p0, LO8/d;->a:Landroid/content/Context;

    new-instance v5, Li8/s$c;

    sget-object v6, LQe/c$a;->SCAN:LQe/c$a;

    invoke-direct {v5, v6}, Li8/s$c;-><init>(LQe/c$a;)V

    invoke-virtual {v3, v4, v5}, Li8/s$a;->d(Landroid/content/Context;Li8/s;)Landroid/content/Intent;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls1/u;->b(Landroid/content/Intent;)Ls1/u;

    const/4 v3, 0x0

    const/high16 v4, 0xc000000

    invoke-virtual {v2, v3, v4}, Ls1/u;->j(II)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v2}, Ls1/k$d;->j(Landroid/app/PendingIntent;)Ls1/k$d;

    move-result-object v0

    iget-object v2, p0, LO8/d;->a:Landroid/content/Context;

    const v3, 0x7f11043a

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ls1/k$d;->l(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/k$d;->n(I)Ls1/k$d;

    move-result-object v0

    const-string/jumbo v1, "setForegroundServiceBehavior(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final f(Landroid/app/Notification;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string/jumbo v2, "WMW Upgrade Service - Updating Wifiman Wizard Upgrade notification"

    invoke-static {v2, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    invoke-static {v0}, Ls1/n;->b(Landroid/content/Context;)Ls1/n;

    move-result-object v0

    sget-object v1, LO7/c;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/c;

    invoke-virtual {v1}, LO7/c;->getId()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Ls1/n;->d(ILandroid/app/Notification;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    const-string v0, "Creating Wifiman Wizard FW Upgrade notification channel"

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v3, 0x7f11043e

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v3, "getString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f11043d

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Landroid/app/NotificationChannel;

    sget-object v5, LO7/b;->WIFIMAN_WIZARD_FW_UPGRADE:LO7/b;

    invoke-virtual {v5}, LO7/b;->getId()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x3

    invoke-direct {v3, v5, v0, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v3, v4}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    iget-object v0, p0, LO8/d;->b:Landroid/app/NotificationManager;

    invoke-virtual {v0, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    const-string/jumbo v0, "WiFiman Wizard Upgrade notification channel created"

    invoke-static {v0, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, LO8/d;->c:Lcom/ui/wifiman/model/wmw/g$c$b$b;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LO8/d;->c(Lcom/ui/wifiman/model/wmw/g$c;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LO8/d;->c:Lcom/ui/wifiman/model/wmw/g$c$b$b;

    return-void
.end method

.method public c(Lcom/ui/wifiman/model/wmw/g$c;)V
    .locals 6

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$a;

    if-nez v0, :cond_2

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    if-nez v1, :cond_2

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    if-nez v1, :cond_2

    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    if-eqz v1, :cond_1

    move-object v1, p1

    check-cast v1, Lcom/ui/wifiman/model/wmw/g$c$b$b;

    iput-object v1, p0, LO8/d;->c:Lcom/ui/wifiman/model/wmw/g$c$b$b;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    invoke-direct {p0}, LO8/d;->e()Ls1/k$d;

    move-result-object v1

    if-eqz v0, :cond_3

    const/4 p1, 0x0

    goto/16 :goto_1

    :cond_3
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    const/4 v2, 0x0

    const/high16 v3, 0x447a0000    # 1000.0f

    const/16 v4, 0x3e8

    if-eqz v0, :cond_4

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f110436

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b$a;->a()F

    move-result p1

    mul-float/2addr p1, v3

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-virtual {v0, v4, p1, v2}, Ls1/k$d;->s(IIZ)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    goto/16 :goto_1

    :cond_4
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    if-eqz v0, :cond_5

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f11043c

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$d;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b$d;->a()F

    move-result p1

    mul-float/2addr p1, v3

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-virtual {v0, v4, p1, v2}, Ls1/k$d;->s(IIZ)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    goto/16 :goto_1

    :cond_5
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    if-eqz v0, :cond_6

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f11043b

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$c;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b$c;->a()F

    move-result p1

    mul-float/2addr p1, v3

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    invoke-virtual {v0, v4, p1, v2}, Ls1/k$d;->s(IIZ)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    const-string/jumbo v2, "format(...)"

    const/4 v3, 0x1

    const-string/jumbo v4, "getString(...)"

    if-eqz v0, :cond_7

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f110438

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b$b$b;->b()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    goto :goto_1

    :cond_7
    instance-of v0, p1, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;

    if-eqz v0, :cond_9

    iget-object v0, p0, LO8/d;->a:Landroid/content/Context;

    const v5, 0x7f110437

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/wmw/g$c$b$b$a;->b()Lcom/ui/common/semver/SemVer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_8

    invoke-direct {p0, p1}, LO8/d;->f(Landroid/app/Notification;)V

    :cond_8
    return-void

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public d()Landroid/app/Notification;
    .locals 3

    invoke-direct {p0}, LO8/d;->e()Ls1/k$d;

    move-result-object v0

    iget-object v1, p0, LO8/d;->a:Landroid/content/Context;

    const v2, 0x7f110439

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object v0

    const-string/jumbo v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

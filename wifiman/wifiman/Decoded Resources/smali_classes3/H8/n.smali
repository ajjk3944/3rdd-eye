.class public final LH8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/teleport/g;
.implements LK8/d;
.implements LId/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH8/n$a;
    }
.end annotation


# static fields
.field public static final c:LH8/n$a;

.field public static final d:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LH8/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LH8/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LH8/n;->c:LH8/n$a;

    const/16 v0, 0x8

    sput v0, LH8/n;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 1

    const-string/jumbo v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "notificationManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/n;->a:Landroid/content/Context;

    iput-object p2, p0, LH8/n;->b:Landroid/app/NotificationManager;

    return-void
.end method

.method public static final synthetic c(LH8/n;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, LH8/n;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic d(LH8/n;)Landroid/app/NotificationManager;
    .locals 0

    iget-object p0, p0, LH8/n;->b:Landroid/app/NotificationManager;

    return-object p0
.end method

.method private final e()Ls1/k$d;
    .locals 6

    new-instance v0, Ls1/k$d;

    iget-object v1, p0, LH8/n;->a:Landroid/content/Context;

    sget-object v2, LO7/b;->TELEPORT:LO7/b;

    invoke-virtual {v2}, LO7/b;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ls1/k$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x7f070394

    invoke-virtual {v0, v1}, Ls1/k$d;->t(I)Ls1/k$d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ls1/k$d;->i(Z)Ls1/k$d;

    move-result-object v0

    iget-object v2, p0, LH8/n;->a:Landroid/content/Context;

    const v3, 0x7f050315

    invoke-virtual {v2, v3}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ls1/k$d;->h(I)Ls1/k$d;

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ls1/k$d;->r(I)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/k$d;->q(Z)Ls1/k$d;

    move-result-object v0

    invoke-virtual {v0, v1}, Ls1/k$d;->w(I)Ls1/k$d;

    move-result-object v0

    const-string/jumbo v1, "status"

    invoke-virtual {v0, v1}, Ls1/k$d;->f(Ljava/lang/String;)Ls1/k$d;

    move-result-object v0

    iget-object v1, p0, LH8/n;->a:Landroid/content/Context;

    invoke-static {v1}, Ls1/u;->i(Landroid/content/Context;)Ls1/u;

    move-result-object v1

    sget-object v2, Li8/s;->a:Li8/s$a;

    iget-object v3, p0, LH8/n;->a:Landroid/content/Context;

    new-instance v4, Li8/s$c;

    sget-object v5, LQe/c$a;->TELEPORT:LQe/c$a;

    invoke-direct {v4, v5}, Li8/s$c;-><init>(LQe/c$a;)V

    invoke-virtual {v2, v3, v4}, Li8/s$a;->d(Landroid/content/Context;Li8/s;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls1/u;->b(Landroid/content/Intent;)Ls1/u;

    const/4 v2, 0x0

    const/high16 v3, 0xc000000

    invoke-virtual {v1, v2, v3}, Ls1/u;->j(II)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/k$d;->j(Landroid/app/PendingIntent;)Ls1/k$d;

    move-result-object v0

    const-string/jumbo v1, "setContentIntent(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final g(Ls1/k$d;Ljava/lang/Float;)Ls1/k$d;
    .locals 3

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p1, v0, v0, v0}, Ls1/k$d;->s(IIZ)Ls1/k$d;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    const/16 v1, 0x3e8

    int-to-float v2, v1

    mul-float/2addr p2, v2

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    invoke-virtual {p1, v1, p2, v0}, Ls1/k$d;->s(IIZ)Ls1/k$d;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method


# virtual methods
.method public B(Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->a(LId/f;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnel$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public S(Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->d(LId/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public a()Lgg/b;
    .locals 2

    new-instance v0, LH8/n$b;

    invoke-direct {v0, p0}, LH8/n$b;-><init>(LH8/n;)V

    invoke-static {v0}, Lgg/b;->r(Lgg/e;)Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Landroid/app/Notification;
    .locals 7

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    const/4 v1, 0x0

    const-string/jumbo v2, "setContentText(...)"

    const v3, 0x7f1102d8

    const-string/jumbo v4, "build(...)"

    const/4 v5, 0x1

    if-eqz v0, :cond_0

    invoke-direct {p0}, LH8/n;->e()Ls1/k$d;

    move-result-object v0

    iget-object v6, p0, LH8/n;->a:Landroid/content/Context;

    invoke-virtual {v6, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ls1/k$d;->l(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    iget-object v3, p0, LH8/n;->a:Landroid/content/Context;

    const v6, 0x7f110311

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$a;->a()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LH8/n;->g(Ls1/k$d;Ljava/lang/Float;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1, v5}, Ls1/k$d;->e(Z)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1, v1}, Ls1/k$d;->p(Z)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b$b;

    if-eqz v0, :cond_1

    invoke-direct {p0}, LH8/n;->e()Ls1/k$d;

    move-result-object v0

    iget-object v1, p0, LH8/n;->a:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/k$d;->l(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    iget-object v1, p0, LH8/n;->a:Landroid/content/Context;

    const v3, 0x7f110313

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;->a()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, v0, p1}, LH8/n;->g(Ls1/k$d;Ljava/lang/Float;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1, v5}, Ls1/k$d;->p(Z)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    if-eqz v0, :cond_4

    invoke-direct {p0}, LH8/n;->e()Ls1/k$d;

    move-result-object v0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2}, LH8/n;->f(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, LK8/b;->c(LId/c;)Lec/a;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v6, p0, LH8/n;->a:Landroid/content/Context;

    invoke-virtual {v2, v6}, Lec/a;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Ls1/k$d;->l(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$a;->b()Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, p1}, LH8/n;->f(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, LK8/b;->b(LId/c;)Lec/a;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v2, p0, LH8/n;->a:Landroid/content/Context;

    invoke-virtual {p1, v2}, Lec/a;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    invoke-virtual {v0, p1}, Ls1/k$d;->k(Ljava/lang/CharSequence;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1, v5}, Ls1/k$d;->e(Z)Ls1/k$d;

    move-result-object p1

    const-string/jumbo v0, "setAutoCancel(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, v3}, LH8/n;->g(Ls1/k$d;Ljava/lang/Float;)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1, v1}, Ls1/k$d;->p(Z)Ls1/k$d;

    move-result-object p1

    invoke-virtual {p1}, Ls1/k$d;->b()Landroid/app/Notification;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public f(Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->c(LId/f;Lcom/ui/wifiman/model/teleport/TeleportConnection$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;
    .locals 0

    invoke-static {p0, p1}, LId/f$a;->b(LId/f;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$Error;)LId/c;

    move-result-object p1

    return-object p1
.end method

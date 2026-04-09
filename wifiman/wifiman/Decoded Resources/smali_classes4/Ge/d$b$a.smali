.class final LGe/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGe/d$b;->b(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LGe/d$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGe/d$b$a;

    invoke-direct {v0}, LGe/d$b$a;-><init>()V

    sput-object v0, LGe/d$b$a;->a:LGe/d$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x78a9efbe

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.notification.ComposableSingletons$ApRoamingNotificationKt.lambda-2.<anonymous>.<anonymous> (ApRoamingNotification.kt:108)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    new-instance v0, LL0/d$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, LS8/l;->f:LS8/l$a;

    const/16 v4, -0x1e

    invoke-virtual {v1, v4}, LS8/l$a;->a(I)LS8/l;

    move-result-object v1

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v1

    and-int/lit8 p3, p3, 0xe

    invoke-virtual {v1, p1, p2, p3}, Ls9/d;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, LL0/d$a;->e(Ljava/lang/CharSequence;)LL0/d$a;

    const-string p1, " "

    invoke-virtual {v0, p1}, LL0/d$a;->i(Ljava/lang/String;)V

    const-string p3, "Channel 48"

    invoke-virtual {v0, p3}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, LL0/d$a;->i(Ljava/lang/String;)V

    const-string p1, "5240 MHz"

    invoke-virtual {v0, p1}, LL0/d$a;->i(Ljava/lang/String;)V

    invoke-virtual {v0}, LL0/d$a;->p()LL0/d;

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

    invoke-virtual {p0, p1, p2, p3}, LGe/d$b$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

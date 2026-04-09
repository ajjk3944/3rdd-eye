.class final Ls8/f$c;
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
.field final synthetic a:LBc/a$b$a$b;


# direct methods
.method constructor <init>(LBc/a$b$a$b;)V
    .locals 0

    iput-object p1, p0, Ls8/f$c;->a:LBc/a$b$a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 5

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x28efd2a8

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ubnt.usurvey.ui.notification.NetworkConnectionNotificationServiceImpl.additionalInfoText.<anonymous>.<anonymous> (NetworkConnectionNotificationServiceImpl.kt:102)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-object p1, p0, Ls8/f$c;->a:LBc/a$b$a$b;

    new-instance p3, LL0/d$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p3, v0, v1, v2}, LL0/d$a;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, LBc/a$b$a$b;->b()LV7/a;

    move-result-object v3

    if-eqz v3, :cond_1

    const/4 v4, 0x2

    invoke-static {v3, v1, v2, v4, v2}, LNe/f;->h(LW7/f;ZLW7/f$a;ILjava/lang/Object;)Ls9/d;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    const v3, -0x72cc1b4b

    invoke-interface {p2, v3}, LT/l;->U(I)V

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1, p2, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v1

    invoke-virtual {p3, v1}, LL0/d$a;->g(LL0/d;)V

    :goto_1
    invoke-interface {p2}, LT/l;->J()V

    invoke-virtual {p1}, LBc/a$b$a$b;->c()LV7/b;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, LNe/a;->a(LV7/b;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_3
    const p1, -0x72cc1086

    invoke-interface {p2, p1}, LT/l;->U(I)V

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p3}, LL0/d$a;->j()I

    move-result v1

    if-lez v1, :cond_5

    const-string v1, "  "

    invoke-virtual {p3, v1}, LL0/d$a;->i(Ljava/lang/String;)V

    :cond_5
    new-instance v1, Ls9/d$b;

    invoke-direct {v1, p1}, Ls9/d$b;-><init>(I)V

    invoke-static {v1, p2, v0}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object p1

    invoke-virtual {p3, p1}, LL0/d$a;->g(LL0/d;)V

    :goto_2
    invoke-interface {p2}, LT/l;->J()V

    invoke-virtual {p3}, LL0/d$a;->p()LL0/d;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3}, Ls8/f$c;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

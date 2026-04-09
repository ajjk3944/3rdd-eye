.class final LTe/w0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/w0;->o(Landroidx/compose/ui/e;LTe/l0;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LW7/b;


# direct methods
.method constructor <init>(LW7/b;)V
    .locals 0

    iput-object p1, p0, LTe/w0$c;->a:LW7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 10

    const-string v0, "$unused$var$"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x19b6596b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:112)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Lhf/c;->a:Lhf/c;

    iget-object p1, p0, LTe/w0$c;->a:LW7/b;

    invoke-virtual {p1}, LW7/b;->b()LW7/a;

    move-result-object v3

    iget-object p1, p0, LTe/w0$c;->a:LW7/b;

    invoke-virtual {p1}, LW7/b;->c()LW7/a;

    move-result-object v5

    const/16 v8, 0x6c30

    const/4 v9, 0x0

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

    invoke-virtual {p0, p1, p2, p3}, LTe/w0$c;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

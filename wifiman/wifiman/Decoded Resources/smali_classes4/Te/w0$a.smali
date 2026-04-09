.class final LTe/w0$a;
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
.field final synthetic a:LS8/c;

.field final synthetic b:LS8/d;


# direct methods
.method constructor <init>(LS8/c;LS8/d;)V
    .locals 0

    iput-object p1, p0, LTe/w0$a;->a:LS8/c;

    iput-object p2, p0, LTe/w0$a;->b:LS8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x26f65cdd

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.signal.components.SignalTabConnectionStatsBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SignalTabConnectionStatsBar.kt:84)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget p1, Lm8/c;->q2:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LTe/w0$a;->a:LS8/c;

    invoke-static {v0}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v0

    invoke-static {v0, p2, p3}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object p3

    iget-object v0, p0, LTe/w0$a;->b:LS8/d;

    invoke-virtual {v0}, LS8/d;->getWidth()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p3, v0}, [Ljava/lang/Object;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p3, "format(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-virtual {p0, p1, p2, p3}, LTe/w0$a;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

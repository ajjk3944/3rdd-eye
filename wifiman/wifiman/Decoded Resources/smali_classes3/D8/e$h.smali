.class final LD8/e$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/e;->E0(Laf/O$b;LS8/c;Z)Lef/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:LS8/c;


# direct methods
.method constructor <init>(ZLS8/c;)V
    .locals 0

    iput-boolean p1, p0, LD8/e$h;->a:Z

    iput-object p2, p0, LD8/e$h;->b:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;
    .locals 3

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x4c87d7bf

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string/jumbo v1, "com.ubnt.usurvey.ui.speed.SpeedFactorExplanationVM.getWifiIssueModel.<anonymous> (SpeedFactorExplanationVM.kt:99)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget-boolean p1, p0, LD8/e$h;->a:Z

    const-string/jumbo p3, "format(...)"

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x6

    if-eqz p1, :cond_1

    const p1, 0x7e0cb4e1

    invoke-interface {p2, p1}, LT/l;->U(I)V

    const p1, 0x7f11027f

    invoke-static {p1, p2, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, LD8/e$h;->b:LS8/c;

    invoke-static {v2}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v2

    invoke-static {v2, p2, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_0

    :cond_1
    const p1, 0x7e104a2a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    const p1, 0x7f110280

    invoke-static {p1, p2, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, LD8/e$h;->b:LS8/c;

    invoke-static {v2}, LNe/h;->c(LS8/c;)Ls9/d;

    move-result-object v2

    invoke-static {v2, p2, v0}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
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

    invoke-virtual {p0, p1, p2, p3}, LD8/e$h;->a(Landroid/content/Context;LT/l;I)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method

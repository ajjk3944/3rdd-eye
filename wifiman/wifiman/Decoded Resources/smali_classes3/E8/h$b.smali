.class final LE8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/h;-><init>(Lgg/i;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LE8/h$b$a;
    }
.end annotation


# instance fields
.field final synthetic a:LE8/h;


# direct methods
.method constructor <init>(LE8/h;)V
    .locals 0

    iput-object p1, p0, LE8/h$b;->a:LE8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/speedtest/advanced/b;Ll9/a;)Lcom/ui/wifiman/ui/component/network/k;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljd/a$b;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/advanced/b;->r()Lcom/ui/wifiman/model/speedtest/advanced/b$b;

    move-result-object p1

    sget-object v0, LE8/h$b$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, LE8/h$b;->a:LE8/h;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2}, LCc/a;->f()Lxa/a$d;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    :cond_0
    sget-object p2, Lcom/ui/wifiman/ui/component/network/h$a;->a:Lcom/ui/wifiman/ui/component/network/h$a;

    invoke-static {p1, v0, p2}, LE8/h;->n(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    goto/16 :goto_0

    :pswitch_1
    iget-object p1, p0, LE8/h$b;->a:LE8/h;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, LCc/a;->f()Lxa/a$d;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    :cond_1
    sget-object p2, Lcom/ui/wifiman/ui/component/network/h$b$b;->a:Lcom/ui/wifiman/ui/component/network/h$b$b;

    invoke-static {p1, v0, p2}, LE8/h;->n(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, LE8/h$b;->a:LE8/h;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p2}, LCc/a;->f()Lxa/a$d;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-interface {p2}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    :cond_2
    sget-object p2, Lcom/ui/wifiman/ui/component/network/h$b$a;->a:Lcom/ui/wifiman/ui/component/network/h$b$a;

    invoke-static {p1, v0, p2}, LE8/h;->n(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, LE8/h$b;->a:LE8/h;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, LCc/a;->f()Lxa/a$d;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    :cond_3
    sget-object p2, Lcom/ui/wifiman/ui/component/network/h$b$b;->a:Lcom/ui/wifiman/ui/component/network/h$b$b;

    invoke-static {p1, v0, p2}, LE8/h;->l(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h$b;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    iget-object p1, p0, LE8/h$b;->a:LE8/h;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljd/a$b;->b()LCc/a;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p2}, LCc/a;->f()Lxa/a$d;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-interface {p2}, Lxa/a$d;->N()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/ubnt/usurvey/product/l;

    :cond_4
    sget-object p2, Lcom/ui/wifiman/ui/component/network/h$b$a;->a:Lcom/ui/wifiman/ui/component/network/h$b$a;

    invoke-static {p1, v0, p2}, LE8/h;->l(LE8/h;Lcom/ubnt/usurvey/product/l;Lcom/ui/wifiman/ui/component/network/h$b;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LE8/h$b;->a(Lcom/ui/wifiman/model/speedtest/advanced/b;Ll9/a;)Lcom/ui/wifiman/ui/component/network/k;

    move-result-object p1

    return-object p1
.end method

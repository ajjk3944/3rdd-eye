.class final Lcom/ui/wifiman/ui/wifi/channel/f$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f$b;->a(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/wifi/channel/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/channel/f$b$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;Lzf/g;LT/l;I)V
    .locals 7

    const-string v0, "itemModifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_4

    and-int/lit8 p4, p4, 0x40

    if-nez p4, :cond_2

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    goto :goto_2

    :cond_2
    invoke-interface {p3, p2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    :goto_2
    if-eqz p4, :cond_3

    const/16 p4, 0x20

    goto :goto_3

    :cond_3
    const/16 p4, 0x10

    :goto_3
    or-int/2addr v0, p4

    :cond_4
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_6

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_7

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous>.<anonymous> (WifiChannelDetailUi.kt:172)"

    const v2, 0x6d338e5f

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    instance-of p4, p2, Lzf/g$a;

    if-eqz p4, :cond_a

    const p4, -0x1a4533a3

    invoke-interface {p3, p4}, LT/l;->U(I)V

    check-cast p2, Lzf/g$a;

    invoke-virtual {p2}, Lzf/g$a;->a()LAf/c;

    move-result-object v2

    iget-object p2, p0, Lcom/ui/wifiman/ui/wifi/channel/f$b$a;->a:Lcom/ui/wifiman/ui/wifi/channel/c;

    const p4, -0x1a452132

    invoke-interface {p3, p4}, LT/l;->U(I)V

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_8

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_9

    :cond_8
    new-instance v1, Lcom/ui/wifiman/ui/wifi/channel/f$b$a$a;

    invoke-direct {v1, p2}, Lcom/ui/wifiman/ui/wifi/channel/f$b$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lth/g;

    invoke-interface {p3}, LT/l;->J()V

    move-object v3, v1

    check-cast v3, Lmh/l;

    and-int/lit8 v5, v0, 0xe

    const/4 v6, 0x0

    move-object v1, p1

    move-object v4, p3

    invoke-static/range {v1 .. v6}, LAf/f;->c(Landroidx/compose/ui/e;LAf/c;Lmh/l;LT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_5

    :cond_a
    instance-of p4, p2, Lzf/g$b;

    if-eqz p4, :cond_c

    const p4, -0x1a4512e0

    invoke-interface {p3, p4}, LT/l;->U(I)V

    check-cast p2, Lzf/g$b;

    invoke-virtual {p2}, Lzf/g$b;->a()Ls9/d;

    move-result-object p2

    and-int/lit8 p4, v0, 0xe

    invoke-static {p1, p2, p3, p4}, LEe/F;->b(Landroidx/compose/ui/e;Ls9/d;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    :goto_6
    return-void

    :cond_c
    const p1, -0x1a453bbc

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, Lzf/g;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/wifi/channel/f$b$a;->a(Landroidx/compose/ui/e;Lzf/g;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

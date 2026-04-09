.class final Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B$c$a$a;->h(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/s;

.field final synthetic b:F


# direct methods
.method constructor <init>(Lmh/s;F)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;->a:Lmh/s;

    iput p2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA/c;LYg/s;LT/l;I)V
    .locals 7

    const-string v0, "$this$paddedItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$destruct$"

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

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_7

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NetworkTopology.kt:242)"

    const v2, -0x4933a769

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-virtual {p2}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Lcom/ui/wifiman/ui/component/network/q$a;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;->a:Lmh/s;

    iget p2, p0, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;->b:F

    invoke-static {p2}, LY0/h;->d(F)LY0/h;

    move-result-object v3

    and-int/lit8 p2, v0, 0xe

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v2, p1

    move-object v5, p3

    invoke-interface/range {v1 .. v6}, Lmh/s;->K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {}, LT/o;->P()V

    :cond_8
    :goto_5
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, LYg/s;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B$c$a$a$a;->a(LA/c;LYg/s;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

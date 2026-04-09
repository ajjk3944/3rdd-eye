.class final Lcom/ui/wifiman/ui/component/network/B$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B;->B(LA/y;ILmh/l;Lmh/l;Lmh/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lmh/r;

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(ILmh/r;Lmh/l;)V
    .locals 0

    iput p1, p0, Lcom/ui/wifiman/ui/component/network/B$d;->a:I

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/B$d;->b:Lmh/r;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/B$d;->c:Lmh/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 3

    const-string v0, "$this$items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

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
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->i(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_6

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.paddedItems.<anonymous> (NetworkTopology.kt:156)"

    const v2, 0x72373b10

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    if-eqz p2, :cond_8

    iget p4, p0, Lcom/ui/wifiman/ui/component/network/B$d;->a:I

    add-int/lit8 p4, p4, -0x1

    if-ne p2, p4, :cond_7

    goto :goto_4

    :cond_7
    const p4, -0xc11a186

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, Lcom/ui/wifiman/ui/component/network/B$d;->b:Lmh/r;

    iget-object v1, p0, Lcom/ui/wifiman/ui/component/network/B$d;->c:Lmh/l;

    add-int/lit8 p2, p2, -0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v1, p2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p4, p1, p2, p3, v0}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_5

    :cond_8
    :goto_4
    const p1, -0xc11a70f

    invoke-interface {p3, p1}, LT/l;->U(I)V

    const/4 p1, 0x0

    invoke-static {p3, p1}, Lcom/ui/wifiman/ui/component/network/B;->y(LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_6
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B$d;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

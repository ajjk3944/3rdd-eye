.class final LKe/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKe/s;->f(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/Integer;Ls9/d;Ljava/lang/Float;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Integer;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LKe/s$b;->a:Ljava/lang/Integer;

    iput-object p2, p0, LKe/s$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FFLT/l;I)V
    .locals 7

    and-int/lit8 p2, p4, 0x6

    if-nez p2, :cond_1

    invoke-interface {p3, p1}, LT/l;->g(F)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p4, p2

    :cond_1
    and-int/lit16 p2, p4, 0x83

    const/16 v0, 0x82

    if-ne p2, v0, :cond_3

    invoke-interface {p3}, LT/l;->v()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, -0x1

    const-string v0, "com.ui.wifiman.ui.device.card.BasePortItem.<anonymous>.<anonymous>.<anonymous> (DeviceDetailCardPortScan.kt:137)"

    const v1, -0x4d38ef05

    invoke-static {v1, p4, p2, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/r;->s(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p2, p0, LKe/s$b;->a:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v5, 0x180

    const/16 v6, 0xa

    const/4 v1, 0x0

    const-string v2, "port"

    const/4 v3, 0x0

    move-object v4, p3

    invoke-static/range {v0 .. v6}, Lr/c;->e(ILr/i;Ljava/lang/String;Lmh/l;LT/l;II)LT/z1;

    move-result-object p2

    invoke-interface {p2}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    new-instance p4, Ls9/d$c;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p4, p2}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    iget-object p2, p0, LKe/s$b;->b:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, p4, p2, p3, v0}, LKe/s;->o(Landroidx/compose/ui/e;Ls9/d;Ljava/lang/String;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    check-cast p2, LY0/h;

    invoke-virtual {p2}, LY0/h;->s()F

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LKe/s$b;->a(FFLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

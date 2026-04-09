.class final Lcom/ui/wifiman/ui/component/network/B$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/B;->k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:Lmh/q;

.field final synthetic c:Lmh/r;

.field final synthetic d:Lmh/t;

.field final synthetic e:Lmh/s;

.field final synthetic f:Lmh/s;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;Lmh/q;Lmh/r;Lmh/t;Lmh/s;Lmh/s;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/B$c;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/B$c;->b:Lmh/q;

    iput-object p3, p0, Lcom/ui/wifiman/ui/component/network/B$c;->c:Lmh/r;

    iput-object p4, p0, Lcom/ui/wifiman/ui/component/network/B$c;->d:Lmh/t;

    iput-object p5, p0, Lcom/ui/wifiman/ui/component/network/B$c;->e:Lmh/s;

    iput-object p6, p0, Lcom/ui/wifiman/ui/component/network/B$c;->f:Lmh/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.ui.wifiman.ui.component.network.BaseNetworkTopology.<anonymous> (NetworkTopology.kt:206)"

    const v2, -0x6bc62971

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v3, p0, Lcom/ui/wifiman/ui/component/network/B$c;->a:Landroidx/compose/ui/e;

    new-instance p2, Lcom/ui/wifiman/ui/component/network/B$c$a;

    iget-object v5, p0, Lcom/ui/wifiman/ui/component/network/B$c;->b:Lmh/q;

    iget-object v6, p0, Lcom/ui/wifiman/ui/component/network/B$c;->c:Lmh/r;

    iget-object v7, p0, Lcom/ui/wifiman/ui/component/network/B$c;->d:Lmh/t;

    iget-object v8, p0, Lcom/ui/wifiman/ui/component/network/B$c;->e:Lmh/s;

    iget-object v9, p0, Lcom/ui/wifiman/ui/component/network/B$c;->f:Lmh/s;

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lcom/ui/wifiman/ui/component/network/B$c$a;-><init>(Lmh/q;Lmh/r;Lmh/t;Lmh/s;Lmh/s;)V

    const/16 v0, 0x36

    const v1, -0x1a212f07

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const/16 v8, 0xc00

    const/4 v9, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/B$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.class final Lcom/ui/wifiman/ui/wifi/channel/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/channel/f;->c(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/wifi/channel/c;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LQ/z;

.field final synthetic b:Lcom/ui/wifiman/ui/wifi/channel/c;


# direct methods
.method constructor <init>(LQ/z;Lcom/ui/wifiman/ui/wifi/channel/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/channel/f$a;->a:LQ/z;

    iput-object p2, p0, Lcom/ui/wifiman/ui/wifi/channel/f$a;->b:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p1

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.wifi.channel.Content.<anonymous> (WifiChannelDetailUi.kt:93)"

    const v4, 0x3fd2402c

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v4, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a;->a:LQ/z;

    new-instance v3, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;

    iget-object v5, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a;->b:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {v3, v5}, Lcom/ui/wifiman/ui/wifi/channel/f$a$a;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v5, -0x416f294c

    const/16 v6, 0x36

    invoke-static {v5, v4, v3, v11, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget-object v3, Lcom/ui/wifiman/ui/wifi/channel/a;->a:Lcom/ui/wifiman/ui/wifi/channel/a;

    invoke-virtual {v3}, Lcom/ui/wifiman/ui/wifi/channel/a;->a()Lmh/p;

    move-result-object v9

    new-instance v3, Lcom/ui/wifiman/ui/wifi/channel/f$a$b;

    iget-object v7, v0, Lcom/ui/wifiman/ui/wifi/channel/f$a;->b:Lcom/ui/wifiman/ui/wifi/channel/c;

    invoke-direct {v3, v7}, Lcom/ui/wifiman/ui/wifi/channel/f$a$b;-><init>(Lcom/ui/wifiman/ui/wifi/channel/c;)V

    const v7, 0x10b1b1fe

    invoke-static {v7, v4, v3, v11, v6}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    const v12, 0x36000c06

    const/16 v13, 0xf4

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v14, 0x0

    move-object v4, v5

    move-object v5, v6

    move v6, v7

    move-object v7, v8

    move v8, v14

    move-object/from16 v11, p1

    invoke-static/range {v1 .. v13}, LBe/M;->d(Landroidx/compose/ui/e;LQ/z;Lmh/q;Lmh/q;Lmh/q;ZLmh/q;ZLmh/p;Lmh/p;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

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

    invoke-virtual {p0, p1, p2}, Lcom/ui/wifiman/ui/wifi/channel/f$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

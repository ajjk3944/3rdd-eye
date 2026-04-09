.class final Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v13, p2

    move/from16 v1, p3

    const-string v2, "$this$UiSettings"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.discovery.prefs.bluetooth.DiscoveryHomeDisplayPrefsBluetoothUi.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:50)"

    const v4, 0x27b42070    # 4.9995205E-15f

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v1, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;

    iget-object v2, v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;-><init>(Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;)V

    const v2, -0x27754e18

    const/4 v14, 0x1

    const/16 v15, 0x36

    invoke-static {v2, v14, v1, v13, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/high16 v11, 0x6000000

    const/16 v12, 0xff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p2

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    new-instance v1, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$b;

    iget-object v2, v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    invoke-direct {v1, v2}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$b;-><init>(Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;)V

    const v2, 0x2e4b6a9f

    invoke-static {v2, v14, v1, v13, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v12}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/j;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

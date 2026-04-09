.class final Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a;->a(Lz/j;LT/l;I)V
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

    iput-object p1, p0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LA9/i;LT/l;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    const-string v1, "$this$UiSettingsCard"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.discovery.prefs.bluetooth.DiscoveryHomeDisplayPrefsBluetoothUi.<anonymous>.<anonymous>.<anonymous> (DiscoveryHomeDisplayPrefsBluetoothUi.kt:51)"

    const v3, -0x27754e18

    move/from16 v4, p3

    invoke-static {v3, v4, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget v1, Lm8/c;->u0:I

    const/4 v2, 0x0

    invoke-static {v1, v12, v2}, LH0/f;->a(ILT/l;I)Ljava/lang/String;

    move-result-object v3

    iget-object v1, v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;->o0()LLi/N;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v1, v4, v12, v2, v5}, LT/o1;->b(LLi/N;Ldh/i;LT/l;II)LT/z1;

    move-result-object v1

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-object v1, v0, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;->a:Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/d;

    const v2, 0x10fdb181    # 1.0006439E-28f

    invoke-interface {v12, v2}, LT/l;->U(I)V

    invoke-interface {v12, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface/range {p2 .. p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_1

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v5, v2, :cond_2

    :cond_1
    new-instance v5, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a$a;

    invoke-direct {v5, v1}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a$a;-><init>(Ljava/lang/Object;)V

    invoke-interface {v12, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v5, Lth/g;

    invoke-interface/range {p2 .. p2}, LT/l;->J()V

    move-object v7, v5

    check-cast v7, Lmh/l;

    const/4 v14, 0x0

    const/16 v15, 0x7b5

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object v2, v3

    move-object v3, v5

    move-object v5, v6

    move v6, v8

    move-object v8, v9

    move v9, v10

    move-object v10, v11

    move-object v11, v13

    move-object/from16 v12, p2

    move/from16 v13, v16

    invoke-static/range {v1 .. v15}, LF9/I;->c(Landroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;ZLs9/a;FLmh/l;Lmh/a;ZLjava/lang/String;Ljava/lang/String;LT/l;III)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA9/i;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/discovery/prefs/bluetooth/f$a$a$a;->a(LA9/i;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

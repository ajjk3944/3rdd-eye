.class final Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a;->a(Lz/j;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/j;LT/l;I)V
    .locals 17

    move/from16 v0, p3

    const-string v1, "$this$UiSettings"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, v0, 0x11

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    invoke-interface/range {p2 .. p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LT/l;->C()V

    move-object/from16 v1, p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.wifi.scan.prefs.quality.WifiScanDisplayPrefsQualityUi.<anonymous>.<anonymous> (WifiScanDisplayPrefsQualityUi.kt:48)"

    const v3, 0x7989f5f3

    invoke-static {v3, v0, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a$a;

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a;->a:Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;

    invoke-direct {v0, v2}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a$a;-><init>(Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/d;)V

    const/16 v2, 0x36

    const v3, 0x71e2776b

    const/4 v4, 0x1

    move-object/from16 v14, p2

    invoke-static {v3, v4, v0, v14, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v13

    const/high16 v15, 0x6000000

    const/16 v16, 0xff

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, LF9/x;->c(Landroidx/compose/ui/e;Ljava/lang/String;LB9/b;LB9/b;Ls9/a;Lmh/a;Ljava/lang/String;Lmh/a;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/wifi/scan/prefs/quality/f$a$a;->a(Lz/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

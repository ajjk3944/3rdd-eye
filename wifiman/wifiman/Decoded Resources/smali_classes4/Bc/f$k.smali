.class public final LBc/f$k;
.super Landroid/telephony/PhoneStateListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBc/f;->u(LBc/f$f;)Lgg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LBc/f;

.field final synthetic b:Lgg/t;

.field final synthetic c:LBc/f$f;


# direct methods
.method constructor <init>(LBc/f;Lgg/t;LBc/f$f;)V
    .locals 0

    iput-object p1, p0, LBc/f$k;->a:LBc/f;

    iput-object p2, p0, LBc/f$k;->b:Lgg/t;

    iput-object p3, p0, LBc/f$k;->c:LBc/f$f;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataConnectionStateChanged(II)V
    .locals 3

    invoke-super {p0, p1, p2}, Landroid/telephony/PhoneStateListener;->onDataConnectionStateChanged(II)V

    iget-object p1, p0, LBc/f$k;->b:Lgg/t;

    new-instance v0, LBc/f$b$a;

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultDataSubscriptionId()I

    move-result v1

    iget-object v2, p0, LBc/f$k;->c:LBc/f$f;

    invoke-virtual {v2}, LBc/f$f;->a()I

    move-result v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LBc/f$k;->a:LBc/f;

    invoke-static {v2, p2}, LBc/f;->l(LBc/f;I)LV7/b;

    move-result-object p2

    invoke-direct {v0, v1, p2}, LBc/f$b$a;-><init>(ZLV7/b;)V

    invoke-interface {p1, v0}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onDisplayInfoChanged(Landroid/telephony/TelephonyDisplayInfo;)V
    .locals 7

    const-string v0, "telephonyDisplayInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/telephony/PhoneStateListener;->onDisplayInfoChanged(Landroid/telephony/TelephonyDisplayInfo;)V

    iget-object v0, p0, LBc/f$k;->a:LBc/f;

    invoke-static {p1}, LBc/g;->a(Landroid/telephony/TelephonyDisplayInfo;)I

    move-result v1

    invoke-static {v0, v1}, LBc/f;->l(LBc/f;I)LV7/b;

    move-result-object v0

    iget-object v1, p0, LBc/f$k;->b:Lgg/t;

    new-instance v2, LBc/f$b$a;

    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultSubscriptionId()I

    move-result v3

    iget-object v4, p0, LBc/f$k;->c:LBc/f$f;

    invoke-virtual {v4}, LBc/f$f;->a()I

    move-result v4

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    instance-of v4, v0, LV7/b$c;

    const/4 v6, 0x4

    if-eqz v4, :cond_4

    invoke-static {p1}, LBc/h;->a(Landroid/telephony/TelephonyDisplayInfo;)I

    move-result p1

    if-eq p1, v5, :cond_3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_2

    const/4 v4, 0x3

    if-eq p1, v4, :cond_1

    if-eq p1, v6, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, LV7/b$d$b;->a:LV7/b$d$b;

    goto :goto_1

    :cond_2
    sget-object v0, LV7/b$c$c;->a:LV7/b$c$c;

    goto :goto_1

    :cond_3
    sget-object v0, LV7/b$c$d;->a:LV7/b$c$d;

    goto :goto_1

    :cond_4
    instance-of v4, v0, LV7/b$d;

    if-eqz v4, :cond_7

    invoke-static {p1}, LBc/h;->a(Landroid/telephony/TelephonyDisplayInfo;)I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v6, :cond_5

    const/4 v4, 0x5

    if-eq p1, v4, :cond_5

    check-cast v0, LV7/b$d;

    goto :goto_1

    :cond_5
    sget-object p1, LV7/b$d$c;->a:LV7/b$d$c;

    move-object v0, p1

    goto :goto_1

    :cond_6
    check-cast v0, LV7/b$d;

    :cond_7
    :goto_1
    invoke-direct {v2, v3, v0}, LBc/f$b$a;-><init>(ZLV7/b;)V

    invoke-interface {v1, v2}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/telephony/PhoneStateListener;->onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_12

    invoke-static {p1}, LBc/i;->a(Landroid/telephony/SignalStrength;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_12

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/telephony/CellSignalStrength;

    invoke-static {v3}, LBc/j;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    check-cast v2, Landroid/telephony/CellSignalStrength;

    if-eqz v2, :cond_2

    const-string p1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthNr"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LBc/k;->a(Ljava/lang/Object;)Landroid/telephony/CellSignalStrengthNr;

    move-result-object p1

    invoke-static {p1}, LBc/l;->a(Landroid/telephony/CellSignalStrengthNr;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_9

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/telephony/CellSignalStrength;

    instance-of v3, v3, Landroid/telephony/CellSignalStrengthLte;

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_4
    move-object v2, v0

    :goto_1
    check-cast v2, Landroid/telephony/CellSignalStrength;

    if-eqz v2, :cond_5

    const-string p1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthLte"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/telephony/CellSignalStrengthLte;

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthLte;->getDbm()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto/16 :goto_9

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/telephony/CellSignalStrength;

    invoke-static {v3}, LBc/m;->a(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_7
    move-object v2, v0

    :goto_2
    check-cast v2, Landroid/telephony/CellSignalStrength;

    if-eqz v2, :cond_8

    const-string v1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthTdscdma"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, LBc/n;->a(Ljava/lang/Object;)Landroid/telephony/CellSignalStrengthTdscdma;

    move-result-object v1

    invoke-static {v1}, LBc/o;->a(Landroid/telephony/CellSignalStrengthTdscdma;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_3

    :cond_8
    move-object v1, v0

    :goto_3
    if-nez v1, :cond_11

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/telephony/CellSignalStrength;

    instance-of v3, v3, Landroid/telephony/CellSignalStrengthCdma;

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_a
    move-object v2, v0

    :goto_4
    check-cast v2, Landroid/telephony/CellSignalStrength;

    if-eqz v2, :cond_b

    const-string v1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthCdma"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/telephony/CellSignalStrengthCdma;

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthCdma;->getDbm()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_5

    :cond_b
    move-object v1, v0

    :goto_5
    if-nez v1, :cond_11

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/telephony/CellSignalStrength;

    instance-of v3, v3, Landroid/telephony/CellSignalStrengthWcdma;

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_d
    move-object v2, v0

    :goto_6
    check-cast v2, Landroid/telephony/CellSignalStrength;

    if-eqz v2, :cond_e

    const-string v1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthWcdma"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/telephony/CellSignalStrengthWcdma;

    invoke-virtual {v2}, Landroid/telephony/CellSignalStrengthWcdma;->getDbm()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_7

    :cond_e
    move-object v1, v0

    :goto_7
    if-nez v1, :cond_11

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/telephony/CellSignalStrength;

    instance-of v2, v2, Landroid/telephony/CellSignalStrengthGsm;

    if-eqz v2, :cond_f

    goto :goto_8

    :cond_10
    move-object v1, v0

    :goto_8
    check-cast v1, Landroid/telephony/CellSignalStrength;

    if-eqz v1, :cond_12

    const-string p1, "null cannot be cast to non-null type android.telephony.CellSignalStrengthGsm"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/telephony/CellSignalStrengthGsm;

    invoke-virtual {v1}, Landroid/telephony/CellSignalStrengthGsm;->getDbm()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_9

    :cond_11
    move-object v0, v1

    :cond_12
    :goto_9
    iget-object p1, p0, LBc/f$k;->b:Lgg/t;

    new-instance v1, LBc/f$b$c;

    invoke-direct {v1, v0}, LBc/f$b$c;-><init>(Ljava/lang/Integer;)V

    invoke-interface {p1, v1}, Lgg/h;->h(Ljava/lang/Object;)V

    return-void
.end method

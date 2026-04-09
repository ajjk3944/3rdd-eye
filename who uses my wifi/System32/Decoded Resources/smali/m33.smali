.class public final Lm33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput p1, p0, Lm33;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lm33;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lm33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/json/JSONObject;

    .line 7
    .line 8
    iget-object v0, p0, Lm33;->b:Landroid/os/Bundle;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-string v1, "device"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lbd2;->U(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v1, "play_store"

    .line 19
    .line 20
    invoke-static {v1, p1}, Lbd2;->U(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v1, "parental_controls"

    .line 25
    .line 26
    sget-object v2, Lsv1;->f:Lsv1;

    .line 27
    .line 28
    iget-object v2, v2, Lsv1;->a:Lj63;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Lj63;->j(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    const-string p1, "Failed putting parental controls bundle."

    .line 39
    .line 40
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    :goto_0
    return-void

    .line 44
    :pswitch_0
    check-cast p1, Ljm2;

    .line 45
    .line 46
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 47
    .line 48
    const-string v0, "device"

    .line 49
    .line 50
    invoke-static {p1, v0}, Li30;->Y(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "android_mem_info"

    .line 55
    .line 56
    iget-object v3, p0, Lm33;->b:Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    check-cast p1, Ljm2;

    .line 66
    .line 67
    iget-object v0, p0, Lm33;->b:Landroid/os/Bundle;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 76
    .line 77
    const-string v1, "installed_adapter_data"

    .line 78
    .line 79
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

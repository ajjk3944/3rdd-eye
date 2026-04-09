.class public final Lj33;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj33;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lj33;->b:Ljava/lang/String;

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
    .locals 2

    .line 1
    iget v0, p0, Lj33;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lorg/json/JSONObject;

    .line 7
    .line 8
    :try_start_0
    iget-object v0, p0, Lj33;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "pii"

    .line 17
    .line 18
    invoke-static {v1, p1}, Lbd2;->U(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "adsid"

    .line 23
    .line 24
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const/4 p1, 0x5

    .line 29
    invoke-static {p1}, Lgi2;->q0(I)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    :goto_0
    return-void

    .line 33
    :pswitch_0
    check-cast p1, Lorg/json/JSONObject;

    .line 34
    .line 35
    :try_start_1
    const-string v0, "ms"

    .line 36
    .line 37
    iget-object v1, p0, Lj33;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catch_1
    invoke-static {}, Lgi2;->R()Z

    .line 44
    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :pswitch_1
    check-cast p1, Ljm2;

    .line 48
    .line 49
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 50
    .line 51
    const-string v0, "omid_v"

    .line 52
    .line 53
    iget-object v1, p0, Lj33;->b:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_2
    check-cast p1, Ljm2;

    .line 60
    .line 61
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 62
    .line 63
    const-string v0, "key_schema"

    .line 64
    .line 65
    iget-object v1, p0, Lj33;->b:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_3
    check-cast p1, Ljm2;

    .line 72
    .line 73
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 74
    .line 75
    const-string v0, "ms"

    .line 76
    .line 77
    iget-object v1, p0, Lj33;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_4
    check-cast p1, Ljm2;

    .line 84
    .line 85
    iget-object v0, p0, Lj33;->b:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 90
    .line 91
    const-string v1, "arek"

    .line 92
    .line 93
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_1
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

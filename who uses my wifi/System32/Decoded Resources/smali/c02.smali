.class public final synthetic Lc02;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lyp3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfa2;


# direct methods
.method public synthetic constructor <init>(Lfa2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lc02;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lc02;->b:Lfa2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ln70;
    .locals 4

    .line 1
    iget v0, p0, Lc02;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/io/InputStream;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1}, Lmo3;->a(Ljava/io/InputStream;)[B

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lc02;->b:Lfa2;

    .line 20
    .line 21
    iput-object v0, p1, Lfa2;->o:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p1}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ljava/io/InputStream;

    .line 29
    .line 30
    new-instance v0, Lny2;

    .line 31
    .line 32
    iget-object v1, p0, Lc02;->b:Lfa2;

    .line 33
    .line 34
    invoke-direct {v0, p1, v1}, Lny2;-><init>(Ljava/io/InputStream;Lfa2;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :pswitch_1
    check-cast p1, Ljava/io/InputStream;

    .line 43
    .line 44
    new-instance v0, Lny2;

    .line 45
    .line 46
    iget-object v1, p0, Lc02;->b:Lfa2;

    .line 47
    .line 48
    invoke-direct {v0, p1, v1}, Lny2;-><init>(Ljava/io/InputStream;Lfa2;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :pswitch_2
    check-cast p1, Lny2;

    .line 57
    .line 58
    new-instance v0, Ll22;

    .line 59
    .line 60
    new-instance v1, Landroid/util/JsonReader;

    .line 61
    .line 62
    new-instance v2, Ljava/io/InputStreamReader;

    .line 63
    .line 64
    iget-object v3, p1, Lny2;->a:Ljava/io/InputStream;

    .line 65
    .line 66
    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {v1, v2}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, Lny2;->b:Lfa2;

    .line 73
    .line 74
    invoke-direct {v0, v1, p1}, Ll22;-><init>(Landroid/util/JsonReader;Lfa2;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p0, Lc02;->b:Lfa2;

    .line 78
    .line 79
    :try_start_0
    sget-object v1, Lsv1;->f:Lsv1;

    .line 80
    .line 81
    iget-object v1, v1, Lsv1;->a:Lj63;

    .line 82
    .line 83
    iget-object v2, p1, Lfa2;->f:Landroid/os/Bundle;

    .line 84
    .line 85
    invoke-virtual {v1, v2}, Lj63;->j(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, v0, Ll22;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :catch_0
    const-string v1, "{}"

    .line 97
    .line 98
    iput-object v1, v0, Ll22;->b:Ljava/lang/String;

    .line 99
    .line 100
    :goto_0
    iget-object p1, p1, Lfa2;->s:Landroid/os/Bundle;

    .line 101
    .line 102
    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-nez v1, :cond_0

    .line 107
    .line 108
    :try_start_1
    sget-object v1, Lsv1;->f:Lsv1;

    .line 109
    .line 110
    iget-object v1, v1, Lsv1;->a:Lj63;

    .line 111
    .line 112
    invoke-virtual {v1, p1}, Lj63;->j(Landroid/os/Bundle;)Lorg/json/JSONObject;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, v0, Ll22;->c:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 121
    .line 122
    :catch_1
    :cond_0
    invoke-static {v0}, Lpu1;->r(Ljava/lang/Object;)Llq3;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

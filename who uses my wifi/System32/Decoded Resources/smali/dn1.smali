.class public final synthetic Ldn1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lzk3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldn1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldn1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Ldn1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Ldn1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldn1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lft2;

    .line 9
    .line 10
    iget-object v1, p0, Ldn1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lorg/json/JSONObject;

    .line 13
    .line 14
    move-object v4, p1

    .line 15
    check-cast v4, Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    if-eqz v4, :cond_2

    .line 22
    .line 23
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v2, "text"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v2, "bg_color"

    .line 37
    .line 38
    invoke-static {v2, v1}, Lft2;->c(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v2, "text_color"

    .line 43
    .line 44
    invoke-static {v2, v1}, Lft2;->c(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string v2, "text_size"

    .line 49
    .line 50
    const/4 v7, -0x1

    .line 51
    invoke-virtual {v1, v2, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const-string v7, "allow_pub_rendering"

    .line 56
    .line 57
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    const-string v7, "animation_ms"

    .line 61
    .line 62
    const/16 v8, 0x3e8

    .line 63
    .line 64
    invoke-virtual {v1, v7, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    const-string v8, "presentation_ms"

    .line 69
    .line 70
    const/16 v9, 0xfa0

    .line 71
    .line 72
    invoke-virtual {v1, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    move v8, v2

    .line 77
    new-instance v2, Ln12;

    .line 78
    .line 79
    if-lez v8, :cond_1

    .line 80
    .line 81
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :cond_1
    add-int v8, v1, v7

    .line 86
    .line 87
    iget-object v0, v0, Lft2;->h:Lr12;

    .line 88
    .line 89
    iget v9, v0, Lr12;->j:I

    .line 90
    .line 91
    move-object v7, p1

    .line 92
    invoke-direct/range {v2 .. v9}, Ln12;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;II)V

    .line 93
    .line 94
    .line 95
    move-object p1, v2

    .line 96
    :cond_2
    :goto_0
    return-object p1

    .line 97
    :pswitch_0
    check-cast p1, Lc62;

    .line 98
    .line 99
    iget-object v0, p0, Ldn1;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    iget-object v1, p0, Ldn1;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Ly32;

    .line 106
    .line 107
    invoke-interface {p1, v0, v1}, Lc62;->h(Ljava/lang/String;Ly32;)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_1
    iget-object v0, p0, Ldn1;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lcr1;

    .line 114
    .line 115
    iget-object v1, p0, Ldn1;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v1, Ljava/util/List;

    .line 118
    .line 119
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    new-instance v2, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_5

    .line 135
    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Landroid/net/Uri;

    .line 141
    .line 142
    iget-object v4, v0, Lcr1;->E:Ljava/util/ArrayList;

    .line 143
    .line 144
    iget-object v5, v0, Lcr1;->F:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-static {v3, v4, v5}, Lcr1;->F3(Landroid/net/Uri;Ljava/util/List;Ljava/util/List;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-eqz v4, :cond_3

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    const-string v4, "nas"

    .line 160
    .line 161
    invoke-static {v3, v4, p1}, Lcr1;->I3(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    :goto_2
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_5
    return-object v2

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lwr3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lew3;


# static fields
.field public static final a:Lwr3;

.field public static final b:Law3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lwr3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwr3;->a:Lwr3;

    .line 7
    .line 8
    sget-object v0, Lsu2;->q:Lsu2;

    .line 9
    .line 10
    new-instance v1, Law3;

    .line 11
    .line 12
    const-class v2, Lfv3;

    .line 13
    .line 14
    const-class v3, Lcr3;

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lwr3;->b:Law3;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcr3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Ljr3;Lhv3;Llv2;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget-object v2, p1, Ljr3;->g:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_6

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljr3;->o(I)Lir3;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, v2, Lir3;->b:Ler3;

    .line 22
    .line 23
    sget-object v4, Ler3;->h:Ler3;

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_5

    .line 30
    .line 31
    invoke-virtual {v2}, Lir3;->a()Lgi2;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    instance-of v4, v3, Lsr3;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    check-cast v3, Lsr3;

    .line 40
    .line 41
    invoke-virtual {v3}, Lsr3;->r0()Lv34;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    instance-of v4, v3, Lfv3;

    .line 47
    .line 48
    if-eqz v4, :cond_4

    .line 49
    .line 50
    check-cast v3, Lfv3;

    .line 51
    .line 52
    invoke-virtual {v3}, Lfv3;->r0()Lv34;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    :goto_1
    new-instance v4, Lur3;

    .line 57
    .line 58
    invoke-virtual {p3, v2}, Llv2;->g(Lir3;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    check-cast v5, Lcr3;

    .line 63
    .line 64
    iget v2, v2, Lir3;->c:I

    .line 65
    .line 66
    invoke-direct {v4, v5, v2}, Lur3;-><init>(Lcr3;I)V

    .line 67
    .line 68
    .line 69
    iget-object v2, v3, Lv34;->a:[B

    .line 70
    .line 71
    array-length v5, v2

    .line 72
    if-eqz v5, :cond_2

    .line 73
    .line 74
    array-length v2, v2

    .line 75
    const/4 v5, 0x5

    .line 76
    if-ne v2, v5, :cond_1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 80
    .line 81
    const-string p2, "PrefixMap only supports 0 and 5 byte prefixes"

    .line 82
    .line 83
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    :goto_2
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/util/List;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :goto_3
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance p2, Ljava/security/GeneralSecurityException;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {v3}, Lgi2;->D()Lmr3;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    add-int/lit8 v0, v0, 0x3b

    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    new-instance v2, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    add-int/2addr v0, v1

    .line 143
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 144
    .line 145
    .line 146
    const-string v0, "Cannot get output prefix for key of class "

    .line 147
    .line 148
    const-string v1, " with parameters "

    .line 149
    .line 150
    invoke-static {v2, v0, p1, v1, p3}, Lex0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p2

    .line 158
    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_6
    iget-object p2, p2, Lhv3;->a:Ljava/util/Map;

    .line 163
    .line 164
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-nez p2, :cond_7

    .line 169
    .line 170
    sget-object p2, Lnv3;->b:Lnv3;

    .line 171
    .line 172
    invoke-virtual {p2}, Lnv3;->a()Lmv3;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    :cond_7
    new-instance p2, Lvr3;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljr3;->i()Lir3;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {p3, v1}, Llv2;->g(Lir3;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    check-cast p3, Lcr3;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljr3;->i()Lir3;

    .line 192
    .line 193
    .line 194
    new-instance p1, Lzv3;

    .line 195
    .line 196
    invoke-direct {p1, v0}, Lzv3;-><init>(Ljava/util/HashMap;)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p2, p1}, Lvr3;-><init>(Lzv3;)V

    .line 200
    .line 201
    .line 202
    return-object p2
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lcr3;

    .line 2
    .line 3
    return-object v0
.end method

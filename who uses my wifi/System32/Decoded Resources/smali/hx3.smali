.class public abstract Lhx3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Ltb1;

.field public static final b:Ltb1;

.field public static final c:Lvv3;

.field public static final d:Ltv3;

.field public static final e:Lzu3;

.field public static final f:Lwu3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    .line 2
    .line 3
    invoke-static {v0}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sget-object v3, Li04;->j:Li04;

    .line 18
    .line 19
    sget-object v4, Lyw3;->e:Lyw3;

    .line 20
    .line 21
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object v3, Li04;->h:Li04;

    .line 28
    .line 29
    sget-object v4, Lyw3;->b:Lyw3;

    .line 30
    .line 31
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v3, Li04;->i:Li04;

    .line 38
    .line 39
    sget-object v4, Lyw3;->d:Lyw3;

    .line 40
    .line 41
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v3, Li04;->k:Li04;

    .line 48
    .line 49
    sget-object v4, Lyw3;->c:Lyw3;

    .line 50
    .line 51
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v3, Ltb1;

    .line 58
    .line 59
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-direct {v3, v1, v2}, Ltb1;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    sput-object v3, Lhx3;->a:Ltb1;

    .line 71
    .line 72
    new-instance v1, Ljava/util/HashMap;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v2, Ljava/util/HashMap;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 80
    .line 81
    .line 82
    sget-object v3, Lgz3;->h:Lgz3;

    .line 83
    .line 84
    sget-object v4, Lxw3;->b:Lxw3;

    .line 85
    .line 86
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    sget-object v3, Lgz3;->l:Lgz3;

    .line 93
    .line 94
    sget-object v4, Lxw3;->c:Lxw3;

    .line 95
    .line 96
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    sget-object v3, Lgz3;->j:Lgz3;

    .line 103
    .line 104
    sget-object v4, Lxw3;->d:Lxw3;

    .line 105
    .line 106
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    sget-object v3, Lgz3;->i:Lgz3;

    .line 113
    .line 114
    sget-object v4, Lxw3;->e:Lxw3;

    .line 115
    .line 116
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    sget-object v3, Lgz3;->k:Lgz3;

    .line 123
    .line 124
    sget-object v4, Lxw3;->f:Lxw3;

    .line 125
    .line 126
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    new-instance v3, Ltb1;

    .line 133
    .line 134
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {v3, v1, v2}, Ltb1;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 143
    .line 144
    .line 145
    sput-object v3, Lhx3;->b:Ltb1;

    .line 146
    .line 147
    sget-object v1, Lvt3;->x:Lvt3;

    .line 148
    .line 149
    new-instance v2, Lvv3;

    .line 150
    .line 151
    const-class v3, Lzw3;

    .line 152
    .line 153
    invoke-direct {v2, v3, v1}, Lvv3;-><init>(Ljava/lang/Class;Lwv3;)V

    .line 154
    .line 155
    .line 156
    sput-object v2, Lhx3;->c:Lvv3;

    .line 157
    .line 158
    sget-object v1, Ltt3;->x:Ltt3;

    .line 159
    .line 160
    new-instance v2, Ltv3;

    .line 161
    .line 162
    invoke-direct {v2, v0, v1}, Ltv3;-><init>(Lv34;Luv3;)V

    .line 163
    .line 164
    .line 165
    sput-object v2, Lhx3;->d:Ltv3;

    .line 166
    .line 167
    sget-object v1, Lvt3;->w:Lvt3;

    .line 168
    .line 169
    new-instance v2, Lzu3;

    .line 170
    .line 171
    const-class v3, Luw3;

    .line 172
    .line 173
    invoke-direct {v2, v3, v1}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 174
    .line 175
    .line 176
    sput-object v2, Lhx3;->e:Lzu3;

    .line 177
    .line 178
    sget-object v1, Ltt3;->y:Ltt3;

    .line 179
    .line 180
    new-instance v2, Lwu3;

    .line 181
    .line 182
    invoke-direct {v2, v0, v1}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 183
    .line 184
    .line 185
    sput-object v2, Lhx3;->f:Lwu3;

    .line 186
    .line 187
    return-void
.end method

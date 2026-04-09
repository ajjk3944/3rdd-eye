.class public abstract Lc34;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final a:Lvv3;

.field public static final b:Ltv3;

.field public static final c:Lzu3;

.field public static final d:Lwu3;

.field public static final e:Lzu3;

.field public static final f:Lwu3;

.field public static final g:Ltb1;

.field public static final h:Ltb1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey"

    .line 2
    .line 3
    invoke-static {v0}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey"

    .line 8
    .line 9
    invoke-static {v1}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lt24;->m:Lt24;

    .line 14
    .line 15
    new-instance v3, Lvv3;

    .line 16
    .line 17
    const-class v4, Lj24;

    .line 18
    .line 19
    invoke-direct {v3, v4, v2}, Lvv3;-><init>(Ljava/lang/Class;Lwv3;)V

    .line 20
    .line 21
    .line 22
    sput-object v3, Lc34;->a:Lvv3;

    .line 23
    .line 24
    sget-object v2, Ly24;->j:Ly24;

    .line 25
    .line 26
    new-instance v3, Ltv3;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Ltv3;-><init>(Lv34;Luv3;)V

    .line 29
    .line 30
    .line 31
    sput-object v3, Lc34;->b:Ltv3;

    .line 32
    .line 33
    sget-object v2, Lt24;->k:Lt24;

    .line 34
    .line 35
    new-instance v3, Lzu3;

    .line 36
    .line 37
    const-class v4, Ll24;

    .line 38
    .line 39
    invoke-direct {v3, v4, v2}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 40
    .line 41
    .line 42
    sput-object v3, Lc34;->c:Lzu3;

    .line 43
    .line 44
    sget-object v2, Ly24;->k:Ly24;

    .line 45
    .line 46
    new-instance v3, Lwu3;

    .line 47
    .line 48
    invoke-direct {v3, v1, v2}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lc34;->d:Lwu3;

    .line 52
    .line 53
    sget-object v1, Lt24;->l:Lt24;

    .line 54
    .line 55
    new-instance v2, Lzu3;

    .line 56
    .line 57
    const-class v3, Lk24;

    .line 58
    .line 59
    invoke-direct {v2, v3, v1}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 60
    .line 61
    .line 62
    sput-object v2, Lc34;->e:Lzu3;

    .line 63
    .line 64
    sget-object v1, Ly24;->l:Ly24;

    .line 65
    .line 66
    new-instance v2, Lwu3;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 69
    .line 70
    .line 71
    sput-object v2, Lc34;->f:Lwu3;

    .line 72
    .line 73
    new-instance v0, Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v1, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 81
    .line 82
    .line 83
    sget-object v2, Li04;->j:Li04;

    .line 84
    .line 85
    sget-object v3, Li24;->e:Li24;

    .line 86
    .line 87
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    sget-object v2, Li04;->h:Li04;

    .line 94
    .line 95
    sget-object v3, Li24;->b:Li24;

    .line 96
    .line 97
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v2, Li04;->k:Li04;

    .line 104
    .line 105
    sget-object v3, Li24;->c:Li24;

    .line 106
    .line 107
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    sget-object v2, Li04;->i:Li04;

    .line 114
    .line 115
    sget-object v3, Li24;->d:Li24;

    .line 116
    .line 117
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    new-instance v2, Ltb1;

    .line 124
    .line 125
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v2, v0, v1}, Ltb1;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 134
    .line 135
    .line 136
    sput-object v2, Lc34;->g:Ltb1;

    .line 137
    .line 138
    new-instance v0, Ljava/util/HashMap;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 141
    .line 142
    .line 143
    new-instance v1, Ljava/util/HashMap;

    .line 144
    .line 145
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 146
    .line 147
    .line 148
    sget-object v2, Lgz3;->j:Lgz3;

    .line 149
    .line 150
    sget-object v3, Lh24;->b:Lh24;

    .line 151
    .line 152
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    sget-object v2, Lgz3;->i:Lgz3;

    .line 159
    .line 160
    sget-object v3, Lh24;->c:Lh24;

    .line 161
    .line 162
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    sget-object v2, Lgz3;->k:Lgz3;

    .line 169
    .line 170
    sget-object v3, Lh24;->d:Lh24;

    .line 171
    .line 172
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    new-instance v2, Ltb1;

    .line 179
    .line 180
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-direct {v2, v0, v1}, Ltb1;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 189
    .line 190
    .line 191
    sput-object v2, Lc34;->h:Ltb1;

    .line 192
    .line 193
    return-void
.end method

.method public static a(Lj24;)Lv04;
    .locals 4

    .line 1
    invoke-static {}, Lv04;->D()Lu04;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lj24;->d:Lh24;

    .line 6
    .line 7
    sget-object v2, Lc34;->h:Ltb1;

    .line 8
    .line 9
    invoke-virtual {v2, v1}, Ltb1;->b(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lgz3;

    .line 14
    .line 15
    invoke-virtual {v0}, Ln54;->b()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Ln54;->g:Lp54;

    .line 19
    .line 20
    check-cast v3, Lv04;

    .line 21
    .line 22
    invoke-virtual {v3, v1}, Lv04;->F(Lgz3;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lj24;->e:Lh24;

    .line 26
    .line 27
    invoke-virtual {v2, v1}, Ltb1;->b(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lgz3;

    .line 32
    .line 33
    invoke-virtual {v0}, Ln54;->b()V

    .line 34
    .line 35
    .line 36
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 37
    .line 38
    check-cast v2, Lv04;

    .line 39
    .line 40
    invoke-virtual {v2, v1}, Lv04;->G(Lgz3;)V

    .line 41
    .line 42
    .line 43
    iget p0, p0, Lj24;->f:I

    .line 44
    .line 45
    invoke-virtual {v0}, Ln54;->b()V

    .line 46
    .line 47
    .line 48
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 49
    .line 50
    check-cast v1, Lv04;

    .line 51
    .line 52
    invoke-virtual {v1, p0}, Lv04;->H(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Lv04;

    .line 60
    .line 61
    return-object p0
.end method

.method public static b(Ll24;)Lz04;
    .locals 4

    .line 1
    invoke-static {}, Lz04;->F()Ly04;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ll24;->j:Lj24;

    .line 6
    .line 7
    invoke-static {v1}, Lc34;->a(Lj24;)Lv04;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0}, Ln54;->b()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 15
    .line 16
    check-cast v2, Lz04;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Lz04;->J(Lv04;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ll24;->k:Ljava/math/BigInteger;

    .line 22
    .line 23
    invoke-static {v1}, La30;->q(Ljava/math/BigInteger;)[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, La54;->g:Ly44;

    .line 28
    .line 29
    array-length v2, v1

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v1, v3, v2}, La54;->n([BII)Ly44;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0}, Ln54;->b()V

    .line 36
    .line 37
    .line 38
    iget-object v2, v0, Ln54;->g:Lp54;

    .line 39
    .line 40
    check-cast v2, Lz04;

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Lz04;->K(Ly44;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Ll24;->j:Lj24;

    .line 46
    .line 47
    iget-object p0, p0, Lj24;->b:Ljava/math/BigInteger;

    .line 48
    .line 49
    invoke-static {p0}, La30;->q(Ljava/math/BigInteger;)[B

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    array-length v1, p0

    .line 54
    invoke-static {p0, v3, v1}, La54;->n([BII)Ly44;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0}, Ln54;->b()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 62
    .line 63
    check-cast v1, Lz04;

    .line 64
    .line 65
    invoke-virtual {v1, p0}, Lz04;->L(Ly44;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ln54;->b()V

    .line 69
    .line 70
    .line 71
    iget-object p0, v0, Ln54;->g:Lp54;

    .line 72
    .line 73
    check-cast p0, Lz04;

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Lz04;->I(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, Lz04;

    .line 83
    .line 84
    return-object p0
.end method

.method public static c(La54;)Lx34;
    .locals 2

    .line 1
    invoke-virtual {p0}, La54;->p()[B

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/math/BigInteger;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Lx34;

    .line 12
    .line 13
    invoke-direct {p0, v0}, Lx34;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

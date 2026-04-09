.class public abstract Lu24;
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


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    .line 2
    .line 3
    invoke-static {v0}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    .line 8
    .line 9
    invoke-static {v1}, Low3;->a(Ljava/lang/String;)Lv34;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Lt24;->g:Lt24;

    .line 14
    .line 15
    new-instance v3, Lvv3;

    .line 16
    .line 17
    const-class v4, Lq14;

    .line 18
    .line 19
    invoke-direct {v3, v4, v2}, Lvv3;-><init>(Ljava/lang/Class;Lwv3;)V

    .line 20
    .line 21
    .line 22
    sput-object v3, Lu24;->a:Lvv3;

    .line 23
    .line 24
    sget-object v2, Lvt3;->G:Lvt3;

    .line 25
    .line 26
    new-instance v3, Ltv3;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Ltv3;-><init>(Lv34;Luv3;)V

    .line 29
    .line 30
    .line 31
    sput-object v3, Lu24;->b:Ltv3;

    .line 32
    .line 33
    sget-object v2, Ltt3;->H:Ltt3;

    .line 34
    .line 35
    new-instance v3, Lzu3;

    .line 36
    .line 37
    const-class v4, Lt14;

    .line 38
    .line 39
    invoke-direct {v3, v4, v2}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 40
    .line 41
    .line 42
    sput-object v3, Lu24;->c:Lzu3;

    .line 43
    .line 44
    sget-object v2, Lvt3;->H:Lvt3;

    .line 45
    .line 46
    new-instance v3, Lwu3;

    .line 47
    .line 48
    invoke-direct {v3, v1, v2}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 49
    .line 50
    .line 51
    sput-object v3, Lu24;->d:Lwu3;

    .line 52
    .line 53
    sget-object v1, Ltt3;->I:Ltt3;

    .line 54
    .line 55
    new-instance v2, Lzu3;

    .line 56
    .line 57
    const-class v3, Lr14;

    .line 58
    .line 59
    invoke-direct {v2, v3, v1}, Lzu3;-><init>(Ljava/lang/Class;Lav3;)V

    .line 60
    .line 61
    .line 62
    sput-object v2, Lu24;->e:Lzu3;

    .line 63
    .line 64
    sget-object v1, Lvt3;->I:Lvt3;

    .line 65
    .line 66
    new-instance v2, Lwu3;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lwu3;-><init>(Lv34;Lxu3;)V

    .line 69
    .line 70
    .line 71
    sput-object v2, Lu24;->f:Lwu3;

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
    sget-object v3, Lp14;->e:Lp14;

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
    sget-object v3, Lp14;->b:Lp14;

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
    sget-object v3, Lp14;->c:Lp14;

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
    sget-object v3, Lp14;->d:Lp14;

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
    sput-object v2, Lu24;->g:Ltb1;

    .line 137
    .line 138
    return-void
.end method

.method public static a(Lt14;)Lfz3;
    .locals 3

    .line 1
    invoke-static {}, Lfz3;->D()Lez3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lt14;->k:Lv34;

    .line 6
    .line 7
    invoke-virtual {p0}, Lv34;->b()[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p0, v2, v1}, La54;->n([BII)Ly44;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0}, Ln54;->b()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 21
    .line 22
    check-cast v1, Lfz3;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Lfz3;->G(La54;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lfz3;

    .line 32
    .line 33
    return-object p0
.end method

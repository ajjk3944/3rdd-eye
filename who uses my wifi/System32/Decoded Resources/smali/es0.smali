.class public abstract Les0;
.super Ltn0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final n:Lbs0;


# instance fields
.field public k:I

.field public l:Lgg0;

.field public final m:Ljava/util/TreeMap;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lbs0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lbs0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Les0;->n:Lbs0;

    .line 8
    .line 9
    new-instance v1, Lwr0;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const-string v3, "mandatory"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lwr0;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const-string v3, "alpn"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lwr0;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    const-string v3, "no-default-alpn"

    .line 38
    .line 39
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lwr0;

    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 46
    .line 47
    .line 48
    const-string v3, "port"

    .line 49
    .line 50
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 51
    .line 52
    .line 53
    new-instance v1, Lwr0;

    .line 54
    .line 55
    const/4 v2, 0x4

    .line 56
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const-string v3, "ipv4hint"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lwr0;

    .line 65
    .line 66
    const/4 v2, 0x5

    .line 67
    invoke-direct {v1, v2}, Lwr0;-><init>(I)V

    .line 68
    .line 69
    .line 70
    const-string v3, "ech"

    .line 71
    .line 72
    invoke-virtual {v0, v2, v3, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lwr0;

    .line 76
    .line 77
    const/4 v3, 0x6

    .line 78
    invoke-direct {v1, v3}, Lwr0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    const-string v4, "ipv6hint"

    .line 82
    .line 83
    invoke-virtual {v0, v3, v4, v1}, Lbs0;->h(ILjava/lang/String;Ljava/util/function/Supplier;)V

    .line 84
    .line 85
    .line 86
    const-string v1, "echconfig"

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Lue0;->c(Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/TreeMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Les0;->m:Ljava/util/TreeMap;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final k(Lcm;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcm;->f()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Lcm;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iput v0, p0, Les0;->k:I

    .line 10
    .line 11
    new-instance v0, Lgg0;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lgg0;-><init>(Lcm;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Les0;->l:Lgg0;

    .line 17
    .line 18
    iget-object v0, p0, Les0;->m:Ljava/util/TreeMap;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/util/TreeMap;->clear()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x4

    .line 28
    const/4 v4, 0x0

    .line 29
    if-lt v2, v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Lcm;->f()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {p1}, Lcm;->f()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {p1, v3}, Lcm;->c(I)[B

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    sget-object v5, Les0;->n:Lbs0;

    .line 44
    .line 45
    iget-object v5, v5, Lbs0;->m:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Ljava/util/function/Supplier;

    .line 56
    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lyr0;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    new-instance v5, Lzr0;

    .line 67
    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-direct {v5, v6}, Lzr0;-><init>(I)V

    .line 70
    .line 71
    .line 72
    new-array v4, v4, [B

    .line 73
    .line 74
    iput-object v4, v5, Lzr0;->g:[B

    .line 75
    .line 76
    move-object v4, v5

    .line 77
    :goto_1
    invoke-virtual {v4, v3}, Lyr0;->a([B)V

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-gtz p1, :cond_4

    .line 93
    .line 94
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lyr0;

    .line 103
    .line 104
    check-cast p1, Las0;

    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    iget-object p1, p1, Las0;->f:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    :goto_2
    if-ge v4, v1, :cond_3

    .line 115
    .line 116
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    check-cast v2, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v2}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lyr0;

    .line 132
    .line 133
    if-eqz v2, :cond_2

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_2
    new-instance p1, Lt91;

    .line 137
    .line 138
    const-string v0, "Not all mandatory SvcParams are specified"

    .line 139
    .line 140
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_3
    return-void

    .line 145
    :cond_4
    new-instance p1, Lt91;

    .line 146
    .line 147
    const-string v0, "Record had unexpected number of bytes"

    .line 148
    .line 149
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method

.method public final l()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Les0;->k:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Les0;->l:Lgg0;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Les0;->m:Ljava/util/TreeMap;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Ljava/util/Map$Entry;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/lang/Integer;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    sget-object v5, Les0;->n:Lbs0;

    .line 57
    .line 58
    invoke-virtual {v5, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lyr0;

    .line 70
    .line 71
    invoke-virtual {v3}, Lyr0;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    if-eqz v3, :cond_0

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_0

    .line 82
    .line 83
    const-string v4, "="

    .line 84
    .line 85
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0
.end method

.method public final m(Lt3;Ljh;Z)V
    .locals 2

    .line 1
    iget p2, p0, Les0;->k:I

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lt3;->m(I)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Les0;->l:Lgg0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p2, p1, v0, p3}, Lgg0;->r(Lt3;Ljh;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Les0;->m:Ljava/util/TreeMap;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    check-cast p3, Lyr0;

    .line 52
    .line 53
    invoke-virtual {p3}, Lyr0;->b()[B

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    array-length v0, p3

    .line 58
    invoke-virtual {p1, v0}, Lt3;->m(I)V

    .line 59
    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    array-length v1, p3

    .line 63
    invoke-virtual {p1, p3, v0, v1}, Lt3;->k([BII)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    return-void
.end method

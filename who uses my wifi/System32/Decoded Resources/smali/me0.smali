.class public final Lme0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final k:Li80;


# instance fields
.field public f:Ll00;

.field public g:[Ljava/util/List;

.field public h:I

.field public i:La01;

.field public j:La01;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lme0;

    .line 2
    .line 3
    invoke-static {v0}, Lk80;->d(Ljava/lang/Class;)Li80;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lme0;->k:Li80;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 4
    new-instance v0, Ll00;

    .line 5
    sget-object v1, Ll00;->i:Ljava/security/SecureRandom;

    const v2, 0xffff

    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    invoke-direct {v0, v1}, Ll00;-><init>(I)V

    .line 6
    invoke-direct {p0, v0}, Lme0;-><init>(Ll00;)V

    return-void
.end method

.method public constructor <init>(Ll00;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Ljava/util/List;

    iput-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 3
    iput-object p1, p0, Lme0;->f:Ll00;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 10

    .line 7
    new-instance v0, Lcm;

    invoke-direct {v0, p1}, Lcm;-><init>([B)V

    iget-object p1, v0, Lcm;->j:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    .line 8
    new-instance v1, Ll00;

    .line 9
    invoke-virtual {v0}, Lcm;->f()I

    move-result v2

    invoke-direct {v1, v2}, Ll00;-><init>(I)V

    .line 10
    invoke-virtual {v0}, Lcm;->f()I

    move-result v2

    iput v2, v1, Ll00;->g:I

    const/4 v2, 0x0

    move v3, v2

    .line 11
    :goto_0
    iget-object v4, v1, Ll00;->h:[I

    array-length v5, v4

    if-ge v3, v5, :cond_0

    .line 12
    invoke-virtual {v0}, Lcm;->f()I

    move-result v5

    aput v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 13
    :cond_0
    invoke-direct {p0, v1}, Lme0;-><init>(Ll00;)V

    .line 14
    invoke-virtual {v1}, Ll00;->d()I

    move-result v1

    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v2

    .line 15
    :goto_1
    iget-object v3, p0, Lme0;->f:Ll00;

    const/4 v4, 0x6

    .line 16
    iget v3, v3, Ll00;->g:I

    .line 17
    invoke-static {v3, v4}, Ll00;->c(II)Z

    move-result v3

    move v4, v2

    :goto_2
    const/4 v5, 0x4

    if-ge v4, v5, :cond_8

    .line 18
    :try_start_0
    iget-object v5, p0, Lme0;->f:Ll00;

    .line 19
    iget-object v5, v5, Ll00;->h:[I

    .line 20
    aget v5, v5, v4

    if-lez v5, :cond_2

    .line 21
    iget-object v6, p0, Lme0;->g:[Ljava/util/List;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    aput-object v7, v6, v4

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_6

    :cond_2
    :goto_3
    move v6, v2

    :goto_4
    if-ge v6, v5, :cond_6

    .line 22
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    .line 23
    invoke-static {v0, v4, v1}, Ltn0;->e(Lcm;IZ)Ltn0;

    move-result-object v7

    .line 24
    iget-object v8, p0, Lme0;->g:[Ljava/util/List;

    aget-object v8, v8, v4

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v8, 0x3

    if-ne v4, v8, :cond_5

    .line 25
    iget v8, v7, Ltn0;->g:I

    const/16 v9, 0xfa

    if-ne v8, v9, :cond_4

    add-int/lit8 v9, v5, -0x1

    if-ne v6, v9, :cond_3

    goto :goto_5

    .line 26
    :cond_3
    new-instance v1, Lt91;

    const-string v2, "TSIG is not the last record in the message"

    .line 27
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 28
    throw v1

    :cond_4
    :goto_5
    const/16 v9, 0x18

    if-ne v8, v9, :cond_5

    .line 29
    check-cast v7, Lpr0;
    :try_end_0
    .catch Lt91; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :goto_6
    if-eqz v3, :cond_7

    goto :goto_7

    .line 30
    :cond_7
    throw v1

    .line 31
    :cond_8
    :goto_7
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    iget v0, v0, Lcm;->f:I

    sub-int/2addr p1, v0

    .line 32
    iput p1, p0, Lme0;->h:I

    return-void
.end method

.method public static a(Lkn0;Ljava/util/List;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkn0;->getType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x3

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    if-eq v0, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    if-eq v0, v1, :cond_0

    .line 16
    .line 17
    const/16 v1, 0xf

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x21

    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    const/16 v1, 0x23

    .line 26
    .line 27
    if-eq v0, v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0x24

    .line 30
    .line 31
    if-eq v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0}, Lkn0;->f(Z)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ltn0;

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_1

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    check-cast v3, Lkn0;

    .line 70
    .line 71
    invoke-virtual {v3}, Lkn0;->e()Ltn0;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 76
    .line 77
    invoke-virtual {v0}, Ltn0;->f()Lgg0;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v4, v5}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    invoke-virtual {v3}, Lkn0;->getType()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-static {v4, v2}, Lme0;->h(II)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_2

    .line 96
    .line 97
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    :goto_1
    return-void
.end method

.method public static h(II)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lk31;->a(I)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ltt0;->a:Lue0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lue0;->d(I)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq p1, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eq p0, v0, :cond_3

    .line 18
    .line 19
    const/16 p1, 0x1c

    .line 20
    .line 21
    if-ne p0, p1, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 p1, 0x6

    .line 25
    if-eq p0, p1, :cond_3

    .line 26
    .line 27
    if-eq p0, v1, :cond_3

    .line 28
    .line 29
    const/16 p1, 0x2b

    .line 30
    .line 31
    if-eq p0, p1, :cond_3

    .line 32
    .line 33
    const/16 p1, 0x2f

    .line 34
    .line 35
    if-eq p0, p1, :cond_3

    .line 36
    .line 37
    const/16 p1, 0x32

    .line 38
    .line 39
    if-ne p0, p1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_0
    const-string p0, "dnsjava.harden_unknown_additional"

    .line 43
    .line 44
    const-string p1, "true"

    .line 45
    .line 46
    invoke-static {p0, p1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    xor-int/2addr p0, v0

    .line 55
    return p0

    .line 56
    :cond_3
    :goto_1
    return v0
.end method

.method public static k(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    move v3, v2

    .line 24
    :goto_0
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    check-cast v4, Lkn0;

    .line 33
    .line 34
    invoke-virtual {v4, v2}, Lkn0;->f(Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 39
    .line 40
    .line 41
    iget-object v4, v4, Lkn0;->g:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final b(Ltn0;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 2
    .line 3
    aget-object v1, v0, p2

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Ljava/util/LinkedList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 10
    .line 11
    .line 12
    aput-object v1, v0, p2

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lme0;->f:Ll00;

    .line 15
    .line 16
    iget-object v0, v0, Ll00;->h:[I

    .line 17
    .line 18
    aget v1, v0, p2

    .line 19
    .line 20
    const v2, 0xffff

    .line 21
    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    aput v1, v0, p2

    .line 28
    .line 29
    iget-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 30
    .line 31
    aget-object p2, v0, p2

    .line 32
    .line 33
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string p2, "DNS section count cannot be incremented"

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1
.end method

.method public final c()Lme0;
    .locals 5

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lme0;

    .line 6
    .line 7
    iget-object v1, p0, Lme0;->g:[Ljava/util/List;

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    new-array v1, v1, [Ljava/util/List;

    .line 11
    .line 12
    iput-object v1, v0, Lme0;->g:[Ljava/util/List;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    iget-object v2, p0, Lme0;->g:[Ljava/util/List;

    .line 16
    .line 17
    array-length v3, v2

    .line 18
    if-ge v1, v3, :cond_1

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v0, Lme0;->g:[Ljava/util/List;

    .line 25
    .line 26
    new-instance v3, Ljava/util/LinkedList;

    .line 27
    .line 28
    iget-object v4, p0, Lme0;->g:[Ljava/util/List;

    .line 29
    .line 30
    aget-object v4, v4, v1

    .line 31
    .line 32
    invoke-direct {v3, v4}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    aput-object v3, v2, v1

    .line 36
    .line 37
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v1, p0, Lme0;->f:Ll00;

    .line 41
    .line 42
    invoke-virtual {v1}, Ll00;->b()Ll00;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iput-object v1, v0, Lme0;->f:Ll00;

    .line 47
    .line 48
    iget-object v1, p0, Lme0;->j:La01;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1}, Ltn0;->d()Ltn0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, La01;

    .line 57
    .line 58
    iput-object v1, v0, Lme0;->j:La01;

    .line 59
    .line 60
    :cond_2
    iget-object v1, p0, Lme0;->i:La01;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {v1}, Ltn0;->d()Ltn0;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La01;

    .line 69
    .line 70
    iput-object v1, v0, Lme0;->i:La01;

    .line 71
    .line 72
    :cond_3
    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lme0;->c()Lme0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final d()Lki0;
    .locals 3

    .line 1
    sget-object v0, Ltt0;->a:Lue0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-virtual {v0, v1}, Lue0;->d(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 8
    .line 9
    aget-object v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ltn0;

    .line 35
    .line 36
    instance-of v2, v1, Lki0;

    .line 37
    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    check-cast v1, Lki0;

    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_2
    const/4 v0, 0x0

    .line 44
    return-object v0
.end method

.method public final e()Ltn0;
    .locals 3

    .line 1
    iget-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ltn0;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public final f()I
    .locals 4

    .line 1
    iget-object v0, p0, Lme0;->f:Ll00;

    .line 2
    .line 3
    iget v0, v0, Ll00;->g:I

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0xf

    .line 6
    .line 7
    invoke-virtual {p0}, Lme0;->d()Lki0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget-wide v1, v1, Ltn0;->i:J

    .line 14
    .line 15
    const/16 v3, 0x18

    .line 16
    .line 17
    ushr-long/2addr v1, v3

    .line 18
    long-to-int v1, v1

    .line 19
    shl-int/lit8 v1, v1, 0x4

    .line 20
    .line 21
    add-int/2addr v0, v1

    .line 22
    :cond_0
    return v0
.end method

.method public final g(I)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, Ltt0;->a:Lue0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lue0;->d(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lme0;->g:[Ljava/util/List;

    .line 7
    .line 8
    aget-object v0, v0, p1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lme0;->g:[Ljava/util/List;

    .line 21
    .line 22
    aget-object p1, v1, p1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_4

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ltn0;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/lit8 v2, v2, -0x1

    .line 45
    .line 46
    :goto_1
    if-ltz v2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lkn0;

    .line 53
    .line 54
    invoke-virtual {v1}, Ltn0;->h()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v3}, Lkn0;->getType()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-ne v4, v5, :cond_2

    .line 63
    .line 64
    iget v4, v1, Ltn0;->h:I

    .line 65
    .line 66
    invoke-virtual {v3}, Lkn0;->e()Ltn0;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    iget v5, v5, Ltn0;->h:I

    .line 71
    .line 72
    if-ne v4, v5, :cond_2

    .line 73
    .line 74
    iget-object v4, v1, Ltn0;->f:Lgg0;

    .line 75
    .line 76
    invoke-virtual {v3}, Lkn0;->e()Ltn0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    iget-object v5, v5, Ltn0;->f:Lgg0;

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    instance-of v2, v1, Ljn0;

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    check-cast v1, Ljn0;

    .line 93
    .line 94
    iget-object v2, v3, Lkn0;->g:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v3, v1, v2}, Lkn0;->c(Ltn0;Ljava/util/ArrayList;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget-object v2, v3, Lkn0;->f:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v3, v1, v2}, Lkn0;->c(Ltn0;Ljava/util/ArrayList;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    add-int/lit8 v2, v2, -0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    new-instance v2, Lkn0;

    .line 110
    .line 111
    invoke-direct {v2, v1}, Lkn0;-><init>(Ltn0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_4
    return-object v0
.end method

.method public final i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Ltn0;->f:Lgg0;

    .line 6
    .line 7
    invoke-virtual {p2}, Lkn0;->e()Ltn0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, Ltn0;->h:I

    .line 12
    .line 13
    sget-object v2, Lyl;->a:Lxl;

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Lue0;->e(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lkn0;->getType()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    sget-object v3, Lk31;->a:Lbs0;

    .line 24
    .line 25
    invoke-virtual {v3, p2}, Lue0;->e(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p4}, Lme0;->e()Ltn0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget v4, v4, Ltn0;->h:I

    .line 34
    .line 35
    invoke-virtual {v2, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {p4}, Lme0;->e()Ltn0;

    .line 40
    .line 41
    .line 42
    move-result-object p4

    .line 43
    iget p4, p4, Ltn0;->g:I

    .line 44
    .line 45
    invoke-virtual {v3, p4}, Lue0;->e(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    iget-object p4, p0, Lme0;->f:Ll00;

    .line 50
    .line 51
    iget p4, p4, Ll00;->f:I

    .line 52
    .line 53
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    move-object v3, p2

    .line 58
    move-object v4, p3

    .line 59
    move-object v2, v0

    .line 60
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    sget-object p3, Lme0;->k:Li80;

    .line 65
    .line 66
    invoke-interface {p3, p1, p2}, Li80;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final j(Lme0;)Lme0;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lme0;->f()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x3

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lme0;->f()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eq v2, v3, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, Ltn0;->f:Lgg0;

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-virtual {v0, v4}, Lme0;->g(I)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v0, v3}, Lme0;->g(I)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    const/4 v7, 0x2

    .line 35
    invoke-virtual {v0, v7}, Lme0;->g(I)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    new-instance v9, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v10, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v11, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    move-object v13, v2

    .line 55
    const/4 v2, 0x0

    .line 56
    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v14

    .line 60
    const/16 v15, 0x27

    .line 61
    .line 62
    if-ge v2, v14, :cond_e

    .line 63
    .line 64
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v14

    .line 68
    check-cast v14, Lkn0;

    .line 69
    .line 70
    invoke-virtual {v14}, Lkn0;->getType()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    iget-object v12, v14, Lkn0;->f:Ljava/util/ArrayList;

    .line 75
    .line 76
    sget-object v3, Lme0;->k:Li80;

    .line 77
    .line 78
    if-ne v7, v15, :cond_6

    .line 79
    .line 80
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    iget-object v7, v7, Ltn0;->f:Lgg0;

    .line 85
    .line 86
    invoke-virtual {v13, v7}, Lgg0;->o(Lgg0;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_6

    .line 91
    .line 92
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    const/16 v23, 0x0

    .line 97
    .line 98
    if-le v7, v4, :cond_1

    .line 99
    .line 100
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget v2, v2, Ltn0;->g:I

    .line 105
    .line 106
    sget-object v4, Lk31;->a:Lbs0;

    .line 107
    .line 108
    invoke-virtual {v4, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget v1, v1, Ltn0;->h:I

    .line 117
    .line 118
    sget-object v4, Lyl;->a:Lxl;

    .line 119
    .line 120
    invoke-virtual {v4, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    iget-object v1, v0, Lme0;->f:Ll00;

    .line 125
    .line 126
    iget v1, v1, Ll00;->f:I

    .line 127
    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v16

    .line 132
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v17

    .line 140
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget-object v1, v1, Ltn0;->f:Lgg0;

    .line 145
    .line 146
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    iget v5, v5, Ltn0;->h:I

    .line 151
    .line 152
    invoke-virtual {v4, v5}, Lue0;->e(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v19

    .line 156
    move-object/from16 v18, v1

    .line 157
    .line 158
    move-object v14, v2

    .line 159
    filled-new-array/range {v13 .. v19}, [Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const-string v2, "Normalization failed in response to <{}/{}/{}> (id {}), found {} entries (instead of just one) in DNAME RRSet <{}/{}>"

    .line 164
    .line 165
    invoke-interface {v3, v2, v1}, Li80;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    return-object v23

    .line 169
    :cond_1
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    iget v7, v7, Ltn0;->g:I

    .line 174
    .line 175
    if-eq v7, v15, :cond_6

    .line 176
    .line 177
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    add-int/lit8 v12, v2, 0x2

    .line 185
    .line 186
    if-lt v7, v12, :cond_2

    .line 187
    .line 188
    add-int/lit8 v7, v2, 0x1

    .line 189
    .line 190
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    check-cast v7, Lkn0;

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_2
    move-object/from16 v7, v23

    .line 198
    .line 199
    :goto_1
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    check-cast v12, Lbm;

    .line 204
    .line 205
    if-eqz v7, :cond_3

    .line 206
    .line 207
    :try_start_0
    invoke-virtual {v7}, Lkn0;->getType()I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    const/4 v4, 0x5

    .line 212
    if-ne v15, v4, :cond_3

    .line 213
    .line 214
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 219
    .line 220
    invoke-virtual {v4, v13}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v4

    .line 224
    if-eqz v4, :cond_3

    .line 225
    .line 226
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 231
    .line 232
    iget-object v15, v12, Ltn0;->f:Lgg0;

    .line 233
    .line 234
    invoke-virtual {v4, v15}, Lgg0;->m(Lgg0;)Lgg0;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iget-object v15, v12, Lgw0;->k:Lgg0;

    .line 239
    .line 240
    invoke-static {v4, v15}, Lgg0;->e(Lgg0;Lgg0;)Lgg0;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    check-cast v7, Loc;

    .line 249
    .line 250
    iget-object v7, v7, Lgw0;->k:Lgg0;

    .line 251
    .line 252
    invoke-virtual {v4, v7}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_3

    .line 257
    .line 258
    move-object/from16 v25, v8

    .line 259
    .line 260
    move-object/from16 v26, v10

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :catch_0
    move-object v12, v13

    .line 264
    goto :goto_4

    .line 265
    :cond_3
    invoke-virtual {v13, v12}, Lgg0;->i(Lbm;)Lgg0;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    new-instance v7, Lkn0;

    .line 270
    .line 271
    new-instance v15, Loc;

    .line 272
    .line 273
    iget v12, v12, Ltn0;->h:I

    .line 274
    .line 275
    move-object/from16 v25, v8

    .line 276
    .line 277
    const-string v8, "target"

    .line 278
    .line 279
    move-object/from16 v26, v10

    .line 280
    .line 281
    const/4 v10, 0x5

    .line 282
    invoke-direct {v15, v13, v10, v12}, Ltn0;-><init>(Lgg0;II)V

    .line 283
    .line 284
    .line 285
    invoke-static {v8, v4}, Ltn0;->b(Ljava/lang/String;Lgg0;)V

    .line 286
    .line 287
    .line 288
    iput-object v4, v15, Lgw0;->k:Lgg0;

    .line 289
    .line 290
    invoke-direct {v7, v15}, Lkn0;-><init>(Ltn0;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lhg0; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    .line 295
    .line 296
    :try_start_1
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 297
    .line 298
    .line 299
    move-result-object v7

    .line 300
    iget v7, v7, Ltn0;->g:I

    .line 301
    .line 302
    const/16 v8, 0xff

    .line 303
    .line 304
    if-ne v7, v8, :cond_4

    .line 305
    .line 306
    add-int/lit8 v2, v2, 0x1

    .line 307
    .line 308
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-ge v2, v7, :cond_4

    .line 313
    .line 314
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    check-cast v7, Lkn0;
    :try_end_1
    .catch Lhg0; {:try_start_1 .. :try_end_1} :catch_2

    .line 319
    .line 320
    :try_start_2
    invoke-virtual {v7}, Lkn0;->e()Ltn0;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    iget-object v8, v8, Ltn0;->f:Lgg0;

    .line 325
    .line 326
    invoke-virtual {v8, v13}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v8

    .line 330
    if-eqz v8, :cond_4

    .line 331
    .line 332
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Lhg0; {:try_start_2 .. :try_end_2} :catch_1

    .line 333
    .line 334
    .line 335
    add-int/lit8 v2, v2, 0x1

    .line 336
    .line 337
    move-object v14, v7

    .line 338
    goto :goto_2

    .line 339
    :catch_1
    move-object v12, v4

    .line 340
    move-object v14, v7

    .line 341
    goto :goto_4

    .line 342
    :catch_2
    move-object v12, v4

    .line 343
    goto :goto_4

    .line 344
    :cond_4
    move-object v13, v4

    .line 345
    :cond_5
    :goto_3
    const/4 v7, 0x1

    .line 346
    goto/16 :goto_8

    .line 347
    .line 348
    :goto_4
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    iget v2, v2, Ltn0;->g:I

    .line 353
    .line 354
    sget-object v4, Lk31;->a:Lbs0;

    .line 355
    .line 356
    invoke-virtual {v4, v2}, Lue0;->e(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v13

    .line 360
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    iget v1, v1, Ltn0;->h:I

    .line 365
    .line 366
    sget-object v2, Lyl;->a:Lxl;

    .line 367
    .line 368
    invoke-virtual {v2, v1}, Lue0;->e(I)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    iget-object v4, v0, Lme0;->f:Ll00;

    .line 373
    .line 374
    iget v4, v4, Ll00;->f:I

    .line 375
    .line 376
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 377
    .line 378
    .line 379
    move-result-object v15

    .line 380
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 385
    .line 386
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    iget v5, v5, Ltn0;->h:I

    .line 391
    .line 392
    invoke-virtual {v2, v5}, Lue0;->e(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v17

    .line 396
    move-object v14, v1

    .line 397
    move-object/from16 v16, v4

    .line 398
    .line 399
    filled-new-array/range {v12 .. v17}, [Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    const-string v2, "Normalization failed in response to <{}/{}/{}> (id {}), could not synthesize CNAME for DNAME <{}/{}>"

    .line 404
    .line 405
    invoke-interface {v3, v2, v1}, Li80;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    return-object v23

    .line 409
    :cond_6
    move-object/from16 v25, v8

    .line 410
    .line 411
    move-object/from16 v26, v10

    .line 412
    .line 413
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    iget-object v4, v4, Ltn0;->f:Lgg0;

    .line 418
    .line 419
    invoke-virtual {v13, v4}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move-result v4

    .line 423
    if-nez v4, :cond_7

    .line 424
    .line 425
    const-string v3, "Ignoring irrelevant RRset <{}/{}/{}> in response to <{}/{}/{}> (id {})"

    .line 426
    .line 427
    invoke-virtual {v0, v3, v14, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 428
    .line 429
    .line 430
    goto :goto_3

    .line 431
    :cond_7
    invoke-virtual {v14}, Lkn0;->getType()I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    const/4 v10, 0x5

    .line 436
    if-ne v4, v10, :cond_c

    .line 437
    .line 438
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    iget v4, v4, Ltn0;->g:I

    .line 443
    .line 444
    if-eq v4, v10, :cond_c

    .line 445
    .line 446
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 447
    .line 448
    .line 449
    move-result v4

    .line 450
    const/4 v7, 0x1

    .line 451
    if-le v4, v7, :cond_9

    .line 452
    .line 453
    const/4 v4, 0x0

    .line 454
    invoke-virtual {v14, v4}, Lkn0;->f(Z)Ljava/util/List;

    .line 455
    .line 456
    .line 457
    move-result-object v7

    .line 458
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    iget-object v7, v7, Ltn0;->f:Lgg0;

    .line 471
    .line 472
    invoke-virtual {v14}, Lkn0;->e()Ltn0;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    iget v8, v8, Ltn0;->h:I

    .line 477
    .line 478
    sget-object v10, Lyl;->a:Lxl;

    .line 479
    .line 480
    invoke-virtual {v10, v8}, Lue0;->e(I)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v15

    .line 484
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    iget v8, v8, Ltn0;->g:I

    .line 489
    .line 490
    move-object/from16 v16, v4

    .line 491
    .line 492
    sget-object v4, Lk31;->a:Lbs0;

    .line 493
    .line 494
    invoke-virtual {v4, v8}, Lue0;->e(I)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v17

    .line 498
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    iget v4, v4, Ltn0;->h:I

    .line 503
    .line 504
    invoke-virtual {v10, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v18

    .line 508
    iget-object v4, v0, Lme0;->f:Ll00;

    .line 509
    .line 510
    iget v4, v4, Ll00;->f:I

    .line 511
    .line 512
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v19

    .line 516
    move-object/from16 v4, v16

    .line 517
    .line 518
    move-object/from16 v16, v13

    .line 519
    .line 520
    move-object v13, v4

    .line 521
    move-object v4, v14

    .line 522
    move-object v14, v7

    .line 523
    filled-new-array/range {v13 .. v19}, [Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v7

    .line 527
    move-object/from16 v13, v16

    .line 528
    .line 529
    const-string v8, "Found {} CNAMEs in <{}/{}> response to <{}/{}/{}> (id {}), removing all but the first"

    .line 530
    .line 531
    invoke-interface {v3, v8, v7}, Li80;->n(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    .line 533
    .line 534
    const/4 v3, 0x0

    .line 535
    invoke-virtual {v4, v3}, Lkn0;->f(Z)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v7

    .line 539
    const/4 v3, 0x1

    .line 540
    :goto_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 541
    .line 542
    .line 543
    move-result v8

    .line 544
    if-ge v3, v8, :cond_a

    .line 545
    .line 546
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    check-cast v8, Ltn0;

    .line 551
    .line 552
    instance-of v10, v8, Ljn0;

    .line 553
    .line 554
    if-eqz v10, :cond_8

    .line 555
    .line 556
    iget-object v10, v4, Lkn0;->g:Ljava/util/ArrayList;

    .line 557
    .line 558
    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    goto :goto_6

    .line 562
    :cond_8
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 566
    .line 567
    goto :goto_5

    .line 568
    :cond_9
    move-object v4, v14

    .line 569
    :cond_a
    invoke-virtual {v4}, Lkn0;->e()Ltn0;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    check-cast v3, Loc;

    .line 574
    .line 575
    iget-object v3, v3, Lgw0;->k:Lgg0;

    .line 576
    .line 577
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 578
    .line 579
    .line 580
    invoke-virtual {v1}, Lme0;->e()Ltn0;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    iget v4, v4, Ltn0;->g:I

    .line 585
    .line 586
    const/16 v8, 0xff

    .line 587
    .line 588
    if-ne v4, v8, :cond_b

    .line 589
    .line 590
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 591
    .line 592
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-ge v2, v4, :cond_b

    .line 597
    .line 598
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v4

    .line 602
    check-cast v4, Lkn0;

    .line 603
    .line 604
    invoke-virtual {v4}, Lkn0;->e()Ltn0;

    .line 605
    .line 606
    .line 607
    move-result-object v7

    .line 608
    iget-object v7, v7, Ltn0;->f:Lgg0;

    .line 609
    .line 610
    invoke-virtual {v7, v13}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    if-eqz v7, :cond_b

    .line 615
    .line 616
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    goto :goto_7

    .line 620
    :cond_b
    move-object v13, v3

    .line 621
    goto/16 :goto_3

    .line 622
    .line 623
    :cond_c
    move-object v4, v14

    .line 624
    invoke-virtual {v0}, Lme0;->e()Ltn0;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    iget v3, v3, Ltn0;->g:I

    .line 629
    .line 630
    const/16 v8, 0xff

    .line 631
    .line 632
    if-eq v3, v8, :cond_d

    .line 633
    .line 634
    invoke-virtual {v4}, Lkn0;->e()Ltn0;

    .line 635
    .line 636
    .line 637
    move-result-object v7

    .line 638
    iget v7, v7, Ltn0;->g:I

    .line 639
    .line 640
    if-eq v7, v3, :cond_d

    .line 641
    .line 642
    const-string v3, "Ignoring irrelevant RRset <{}/{}/{}> in ANSWER section response to <{}/{}/{}> (id {})"

    .line 643
    .line 644
    invoke-virtual {v0, v3, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_3

    .line 648
    .line 649
    :cond_d
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    invoke-virtual {v4}, Lkn0;->e()Ltn0;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    iget-object v3, v3, Ltn0;->f:Lgg0;

    .line 657
    .line 658
    invoke-virtual {v13, v3}, Lgg0;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    if-eqz v3, :cond_5

    .line 663
    .line 664
    invoke-static {v4, v6, v11}, Lme0;->a(Lkn0;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 665
    .line 666
    .line 667
    goto/16 :goto_3

    .line 668
    .line 669
    :goto_8
    add-int/2addr v2, v7

    .line 670
    move v4, v7

    .line 671
    move-object/from16 v8, v25

    .line 672
    .line 673
    move-object/from16 v10, v26

    .line 674
    .line 675
    const/4 v3, 0x3

    .line 676
    const/4 v7, 0x2

    .line 677
    goto/16 :goto_0

    .line 678
    .line 679
    :cond_e
    move v7, v4

    .line 680
    move-object/from16 v25, v8

    .line 681
    .line 682
    move-object/from16 v26, v10

    .line 683
    .line 684
    invoke-interface/range {v25 .. v25}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    const/4 v3, 0x0

    .line 689
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v4

    .line 693
    if-eqz v4, :cond_17

    .line 694
    .line 695
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    check-cast v4, Lkn0;

    .line 700
    .line 701
    invoke-virtual {v4}, Lkn0;->getType()I

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    if-eq v5, v7, :cond_16

    .line 706
    .line 707
    const/4 v10, 0x5

    .line 708
    if-eq v5, v10, :cond_15

    .line 709
    .line 710
    const/16 v7, 0x1c

    .line 711
    .line 712
    if-eq v5, v7, :cond_15

    .line 713
    .line 714
    if-eq v5, v15, :cond_15

    .line 715
    .line 716
    invoke-virtual {v4}, Lkn0;->getType()I

    .line 717
    .line 718
    .line 719
    move-result v5

    .line 720
    const/4 v7, 0x2

    .line 721
    invoke-static {v5, v7}, Lme0;->h(II)Z

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    if-nez v5, :cond_f

    .line 726
    .line 727
    const-string v5, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {})"

    .line 728
    .line 729
    invoke-virtual {v0, v5, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 730
    .line 731
    .line 732
    :goto_a
    move-object/from16 v5, v26

    .line 733
    .line 734
    goto :goto_d

    .line 735
    :cond_f
    invoke-virtual {v4}, Lkn0;->getType()I

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-ne v5, v7, :cond_12

    .line 740
    .line 741
    invoke-virtual {v4}, Lkn0;->e()Ltn0;

    .line 742
    .line 743
    .line 744
    move-result-object v5

    .line 745
    iget-object v5, v5, Ltn0;->f:Lgg0;

    .line 746
    .line 747
    invoke-virtual {v13, v5}, Lgg0;->o(Lgg0;)Z

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    if-nez v5, :cond_10

    .line 752
    .line 753
    const-string v5, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), not a subdomain of the query"

    .line 754
    .line 755
    invoke-virtual {v0, v5, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 756
    .line 757
    .line 758
    goto :goto_a

    .line 759
    :cond_10
    invoke-virtual {v0}, Lme0;->f()I

    .line 760
    .line 761
    .line 762
    move-result v5

    .line 763
    const/4 v7, 0x3

    .line 764
    if-eq v5, v7, :cond_14

    .line 765
    .line 766
    invoke-virtual {v0}, Lme0;->f()I

    .line 767
    .line 768
    .line 769
    move-result v5

    .line 770
    if-nez v5, :cond_11

    .line 771
    .line 772
    invoke-interface/range {v25 .. v25}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 773
    .line 774
    .line 775
    move-result-object v5

    .line 776
    new-instance v7, Lia;

    .line 777
    .line 778
    const/4 v8, 0x2

    .line 779
    invoke-direct {v7, v8}, Lia;-><init>(I)V

    .line 780
    .line 781
    .line 782
    invoke-interface {v5, v7}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 783
    .line 784
    .line 785
    move-result v5

    .line 786
    if-eqz v5, :cond_11

    .line 787
    .line 788
    iget-object v5, v0, Lme0;->g:[Ljava/util/List;

    .line 789
    .line 790
    const/16 v24, 0x1

    .line 791
    .line 792
    aget-object v5, v5, v24

    .line 793
    .line 794
    if-nez v5, :cond_11

    .line 795
    .line 796
    goto :goto_b

    .line 797
    :cond_11
    if-nez v3, :cond_13

    .line 798
    .line 799
    const/4 v3, 0x1

    .line 800
    :cond_12
    move-object/from16 v5, v26

    .line 801
    .line 802
    goto :goto_c

    .line 803
    :cond_13
    const-string v5, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), already seen another NS"

    .line 804
    .line 805
    invoke-virtual {v0, v5, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 806
    .line 807
    .line 808
    goto :goto_a

    .line 809
    :cond_14
    :goto_b
    const-string v5, "Ignoring disallowed RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {}), NXDOMAIN or NODATA"

    .line 810
    .line 811
    invoke-virtual {v0, v5, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 812
    .line 813
    .line 814
    goto :goto_a

    .line 815
    :goto_c
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    invoke-static {v4, v6, v11}, Lme0;->a(Lkn0;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 819
    .line 820
    .line 821
    :goto_d
    move-object/from16 v26, v5

    .line 822
    .line 823
    const/4 v7, 0x1

    .line 824
    goto/16 :goto_9

    .line 825
    .line 826
    :cond_15
    move-object/from16 v5, v26

    .line 827
    .line 828
    goto :goto_e

    .line 829
    :cond_16
    move-object/from16 v5, v26

    .line 830
    .line 831
    const/4 v10, 0x5

    .line 832
    :goto_e
    const-string v7, "Ignoring forbidden RRset <{}/{}/{}> in AUTHORITY section response to <{}/{}/{}> (id {})"

    .line 833
    .line 834
    invoke-virtual {v0, v7, v4, v13, v1}, Lme0;->i(Ljava/lang/String;Lkn0;Lgg0;Lme0;)V

    .line 835
    .line 836
    .line 837
    goto :goto_d

    .line 838
    :cond_17
    move-object/from16 v5, v26

    .line 839
    .line 840
    new-instance v1, Lme0;

    .line 841
    .line 842
    iget-object v2, v0, Lme0;->f:Ll00;

    .line 843
    .line 844
    invoke-direct {v1, v2}, Lme0;-><init>(Ll00;)V

    .line 845
    .line 846
    .line 847
    iget-object v2, v1, Lme0;->g:[Ljava/util/List;

    .line 848
    .line 849
    iget-object v3, v0, Lme0;->g:[Ljava/util/List;

    .line 850
    .line 851
    const/16 v22, 0x0

    .line 852
    .line 853
    aget-object v3, v3, v22

    .line 854
    .line 855
    aput-object v3, v2, v22

    .line 856
    .line 857
    invoke-static {v9}, Lme0;->k(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    const/16 v24, 0x1

    .line 862
    .line 863
    aput-object v3, v2, v24

    .line 864
    .line 865
    iget-object v2, v1, Lme0;->g:[Ljava/util/List;

    .line 866
    .line 867
    invoke-static {v5}, Lme0;->k(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    const/16 v21, 0x2

    .line 872
    .line 873
    aput-object v3, v2, v21

    .line 874
    .line 875
    iget-object v2, v1, Lme0;->g:[Ljava/util/List;

    .line 876
    .line 877
    invoke-static {v11}, Lme0;->k(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    .line 878
    .line 879
    .line 880
    move-result-object v3

    .line 881
    const/16 v20, 0x3

    .line 882
    .line 883
    aput-object v3, v2, v20

    .line 884
    .line 885
    return-object v1
.end method

.method public final l(Lt3;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lme0;->d()Lki0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const v3, 0xffff

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x3

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    new-instance v6, Lt3;

    .line 17
    .line 18
    const/4 v7, 0x2

    .line 19
    const/4 v8, 0x0

    .line 20
    invoke-direct {v6, v7, v8}, Lt3;-><init>(IB)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v6, v5, v4}, Ltn0;->o(Lt3;ILjh;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v6}, Lt3;->i()[B

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    array-length v6, v2

    .line 31
    sub-int/2addr v3, v6

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v4

    .line 34
    :goto_0
    iget v6, v1, Lt3;->g:I

    .line 35
    .line 36
    iget-object v7, v0, Lme0;->f:Ll00;

    .line 37
    .line 38
    iget v8, v7, Ll00;->f:I

    .line 39
    .line 40
    invoke-virtual {v1, v8}, Lt3;->m(I)V

    .line 41
    .line 42
    .line 43
    iget v8, v7, Ll00;->g:I

    .line 44
    .line 45
    invoke-virtual {v1, v8}, Lt3;->m(I)V

    .line 46
    .line 47
    .line 48
    iget-object v7, v7, Ll00;->h:[I

    .line 49
    .line 50
    array-length v8, v7

    .line 51
    const/4 v10, 0x0

    .line 52
    :goto_1
    if-ge v10, v8, :cond_1

    .line 53
    .line 54
    aget v11, v7, v10

    .line 55
    .line 56
    invoke-virtual {v1, v11}, Lt3;->m(I)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v10, v10, 0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-instance v7, Ljh;

    .line 63
    .line 64
    invoke-direct {v7}, Ljh;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v8, v0, Lme0;->f:Ll00;

    .line 68
    .line 69
    iget v8, v8, Ll00;->g:I

    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    :goto_2
    const/4 v13, 0x4

    .line 74
    if-ge v10, v13, :cond_a

    .line 75
    .line 76
    iget-object v13, v0, Lme0;->g:[Ljava/util/List;

    .line 77
    .line 78
    aget-object v13, v13, v10

    .line 79
    .line 80
    if-nez v13, :cond_2

    .line 81
    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_2
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    iget v14, v1, Lt3;->g:I

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    :goto_3
    if-ge v15, v13, :cond_7

    .line 96
    .line 97
    const/16 v18, 0x6

    .line 98
    .line 99
    iget-object v12, v0, Lme0;->g:[Ljava/util/List;

    .line 100
    .line 101
    aget-object v12, v12, v10

    .line 102
    .line 103
    invoke-interface {v12, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, Ltn0;

    .line 108
    .line 109
    if-ne v10, v5, :cond_3

    .line 110
    .line 111
    instance-of v9, v12, Lki0;

    .line 112
    .line 113
    if-eqz v9, :cond_3

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_3
    if-eqz v4, :cond_4

    .line 117
    .line 118
    invoke-virtual {v12, v4}, Ltn0;->n(Ltn0;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-nez v4, :cond_4

    .line 123
    .line 124
    iget v14, v1, Lt3;->g:I

    .line 125
    .line 126
    move/from16 v17, v16

    .line 127
    .line 128
    :cond_4
    invoke-virtual {v12, v1, v10, v7}, Ltn0;->o(Lt3;ILjh;)V

    .line 129
    .line 130
    .line 131
    iget v4, v1, Lt3;->g:I

    .line 132
    .line 133
    if-le v4, v3, :cond_6

    .line 134
    .line 135
    if-gt v14, v4, :cond_5

    .line 136
    .line 137
    iput v14, v1, Lt3;->g:I

    .line 138
    .line 139
    sub-int v13, v13, v17

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 143
    .line 144
    const-string v2, "cannot jump past end of data"

    .line 145
    .line 146
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_6
    add-int/lit8 v16, v16, 0x1

    .line 151
    .line 152
    move-object v4, v12

    .line 153
    :goto_4
    add-int/lit8 v15, v15, 0x1

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    const/16 v18, 0x6

    .line 157
    .line 158
    sub-int v13, v13, v16

    .line 159
    .line 160
    :goto_5
    if-eqz v13, :cond_8

    .line 161
    .line 162
    if-eq v10, v5, :cond_8

    .line 163
    .line 164
    invoke-static/range {v18 .. v18}, Ll00;->a(I)V

    .line 165
    .line 166
    .line 167
    or-int/lit16 v8, v8, 0x200

    .line 168
    .line 169
    iget-object v3, v0, Lme0;->f:Ll00;

    .line 170
    .line 171
    iget-object v3, v3, Ll00;->h:[I

    .line 172
    .line 173
    aget v3, v3, v10

    .line 174
    .line 175
    sub-int/2addr v3, v13

    .line 176
    add-int/lit8 v4, v6, 0x4

    .line 177
    .line 178
    mul-int/lit8 v7, v10, 0x2

    .line 179
    .line 180
    add-int/2addr v7, v4

    .line 181
    invoke-virtual {v1, v3, v7}, Lt3;->n(II)V

    .line 182
    .line 183
    .line 184
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 185
    .line 186
    if-ge v10, v5, :cond_b

    .line 187
    .line 188
    mul-int/lit8 v3, v10, 0x2

    .line 189
    .line 190
    add-int/2addr v3, v4

    .line 191
    const/4 v7, 0x0

    .line 192
    invoke-virtual {v1, v7, v3}, Lt3;->n(II)V

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :cond_8
    if-ne v10, v5, :cond_9

    .line 197
    .line 198
    iget-object v4, v0, Lme0;->f:Ll00;

    .line 199
    .line 200
    iget-object v4, v4, Ll00;->h:[I

    .line 201
    .line 202
    aget v4, v4, v10

    .line 203
    .line 204
    sub-int v11, v4, v13

    .line 205
    .line 206
    :cond_9
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 207
    .line 208
    const/4 v4, 0x0

    .line 209
    goto/16 :goto_2

    .line 210
    .line 211
    :cond_a
    const/16 v18, 0x6

    .line 212
    .line 213
    :cond_b
    if-eqz v2, :cond_c

    .line 214
    .line 215
    array-length v3, v2

    .line 216
    const/4 v7, 0x0

    .line 217
    invoke-virtual {v1, v2, v7, v3}, Lt3;->k([BII)V

    .line 218
    .line 219
    .line 220
    add-int/lit8 v11, v11, 0x1

    .line 221
    .line 222
    :cond_c
    iget-object v2, v0, Lme0;->f:Ll00;

    .line 223
    .line 224
    iget v2, v2, Ll00;->g:I

    .line 225
    .line 226
    if-eq v8, v2, :cond_d

    .line 227
    .line 228
    add-int/lit8 v2, v6, 0x2

    .line 229
    .line 230
    invoke-virtual {v1, v8, v2}, Lt3;->n(II)V

    .line 231
    .line 232
    .line 233
    :cond_d
    iget-object v2, v0, Lme0;->f:Ll00;

    .line 234
    .line 235
    iget-object v2, v2, Ll00;->h:[I

    .line 236
    .line 237
    aget v2, v2, v5

    .line 238
    .line 239
    if-eq v11, v2, :cond_e

    .line 240
    .line 241
    add-int/lit8 v6, v6, 0xa

    .line 242
    .line 243
    invoke-virtual {v1, v11, v6}, Lt3;->n(II)V

    .line 244
    .line 245
    .line 246
    :cond_e
    move/from16 v1, v18

    .line 247
    .line 248
    invoke-static {v8, v1}, Ll00;->c(II)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    xor-int/lit8 v1, v1, 0x1

    .line 253
    .line 254
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lme0;->d()Lki0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    iget-object v4, p0, Lme0;->f:Ll00;

    .line 16
    .line 17
    invoke-virtual {p0}, Lme0;->f()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {v4, v5}, Ll00;->f(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, "\n\n;; OPT PSEUDOSECTION: \n; EDNS: version: "

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-wide v4, v1, Ltn0;->i:J

    .line 34
    .line 35
    const/16 v6, 0x10

    .line 36
    .line 37
    ushr-long/2addr v4, v6

    .line 38
    const-wide/16 v7, 0xff

    .line 39
    .line 40
    and-long/2addr v4, v7

    .line 41
    long-to-int v4, v4

    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, "; flags: "

    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move v4, v2

    .line 51
    :goto_0
    if-ge v4, v6, :cond_1

    .line 52
    .line 53
    iget-wide v7, v1, Ltn0;->i:J

    .line 54
    .line 55
    const-wide/32 v9, 0xffff

    .line 56
    .line 57
    .line 58
    and-long/2addr v7, v9

    .line 59
    long-to-int v5, v7

    .line 60
    rsub-int/lit8 v7, v4, 0xf

    .line 61
    .line 62
    const/4 v8, 0x1

    .line 63
    shl-int v7, v8, v7

    .line 64
    .line 65
    and-int/2addr v5, v7

    .line 66
    if-eqz v5, :cond_0

    .line 67
    .line 68
    sget-object v5, Lqt;->a:Lue0;

    .line 69
    .line 70
    invoke-virtual {v5, v7}, Lue0;->e(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v5, " "

    .line 78
    .line 79
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const-string v4, "; udp: "

    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget v4, v1, Ltn0;->h:I

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, Lki0;->k:Ljava/util/ArrayList;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    move v5, v2

    .line 104
    :goto_1
    if-ge v5, v4, :cond_2

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    check-cast v6, Lcr;

    .line 113
    .line 114
    const-string v7, "\n; "

    .line 115
    .line 116
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget v7, v6, Lcr;->f:I

    .line 120
    .line 121
    sget-object v8, Lbr;->a:Lue0;

    .line 122
    .line 123
    invoke-virtual {v8, v7}, Lue0;->e(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v7, ": "

    .line 131
    .line 132
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, Lcr;->b()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_3
    iget-object v1, p0, Lme0;->f:Ll00;

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    :goto_2
    const/4 v1, 0x4

    .line 156
    if-ge v2, v1, :cond_a

    .line 157
    .line 158
    iget-object v1, p0, Lme0;->f:Ll00;

    .line 159
    .line 160
    invoke-virtual {v1}, Ll00;->d()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    const/4 v3, 0x5

    .line 165
    const-string v4, ":\n"

    .line 166
    .line 167
    const-string v5, ";; "

    .line 168
    .line 169
    if-eq v1, v3, :cond_4

    .line 170
    .line 171
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    sget-object v1, Ltt0;->a:Lue0;

    .line 175
    .line 176
    invoke-virtual {v1, v2}, Lue0;->d(I)V

    .line 177
    .line 178
    .line 179
    sget-object v1, Ltt0;->b:[Ljava/lang/String;

    .line 180
    .line 181
    aget-object v1, v1, v2

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_4
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    sget-object v1, Ltt0;->a:Lue0;

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Lue0;->d(I)V

    .line 196
    .line 197
    .line 198
    sget-object v1, Ltt0;->c:[Ljava/lang/String;

    .line 199
    .line 200
    aget-object v1, v1, v2

    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    :goto_3
    const-string v1, "\n"

    .line 209
    .line 210
    const/4 v3, 0x3

    .line 211
    if-le v2, v3, :cond_5

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_5
    sget-object v3, Ltt0;->a:Lue0;

    .line 215
    .line 216
    invoke-virtual {v3, v2}, Lue0;->d(I)V

    .line 217
    .line 218
    .line 219
    iget-object v3, p0, Lme0;->g:[Ljava/util/List;

    .line 220
    .line 221
    aget-object v3, v3, v2

    .line 222
    .line 223
    if-nez v3, :cond_6

    .line 224
    .line 225
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_6
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_9

    .line 241
    .line 242
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    check-cast v4, Ltn0;

    .line 247
    .line 248
    if-nez v2, :cond_7

    .line 249
    .line 250
    const-string v5, ";;\t"

    .line 251
    .line 252
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    iget-object v5, v4, Ltn0;->f:Lgg0;

    .line 256
    .line 257
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const-string v5, ", type = "

    .line 261
    .line 262
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    iget v5, v4, Ltn0;->g:I

    .line 266
    .line 267
    sget-object v6, Lk31;->a:Lbs0;

    .line 268
    .line 269
    invoke-virtual {v6, v5}, Lue0;->e(I)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v5

    .line 273
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const-string v5, ", class = "

    .line 277
    .line 278
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    iget v4, v4, Ltn0;->h:I

    .line 282
    .line 283
    sget-object v5, Lyl;->a:Lxl;

    .line 284
    .line 285
    invoke-virtual {v5, v4}, Lue0;->e(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_7
    instance-of v5, v4, Lki0;

    .line 294
    .line 295
    if-nez v5, :cond_8

    .line 296
    .line 297
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    :cond_8
    :goto_6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_9
    :goto_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    add-int/lit8 v2, v2, 0x1

    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :cond_a
    const-string v1, ";; Message size: "

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    iget v1, p0, Lme0;->h:I

    .line 317
    .line 318
    const-string v2, " bytes"

    .line 319
    .line 320
    invoke-static {v0, v1, v2}, Lex0;->i(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    return-object v0
.end method

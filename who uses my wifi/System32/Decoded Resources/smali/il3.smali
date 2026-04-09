.class public final synthetic Lil3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lkl3;
.implements Ll34;
.implements Lks2;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lil3;->f:I

    iput-object p2, p0, Lil3;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lad4;Lb84;)V
    .locals 0

    const/4 p1, 0x4

    iput p1, p0, Lil3;->f:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lil3;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lil3;->f:I

    .line 2
    .line 3
    iget-object v1, p0, Lil3;->g:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lbd4;

    .line 9
    .line 10
    check-cast v1, Lb84;

    .line 11
    .line 12
    invoke-interface {p1, v1}, Lbd4;->j(Lb84;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p1, Lzt1;

    .line 17
    .line 18
    sget v0, Lya4;->g0:I

    .line 19
    .line 20
    check-cast v1, Ldc4;

    .line 21
    .line 22
    iget-object v0, v1, Ldc4;->f:Lb84;

    .line 23
    .line 24
    invoke-interface {p1, v0}, Lzt1;->G(Lb84;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lsq0;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object p1, p0, Lil3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lal3;

    .line 4
    .line 5
    iget-object p1, p1, Lal3;->t:Ljava/util/regex/Pattern;

    .line 6
    .line 7
    new-instance v0, Lci3;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, p1}, Lci3;-><init>(Ljava/util/regex/Matcher;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, Lgl3;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {p1, p2, v0, v1}, Lgl3;-><init>(Ljava/lang/CharSequence;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public l(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lil3;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo34;

    .line 4
    .line 5
    const-string v1, "GmsCore_OpenSSL"

    .line 6
    .line 7
    const-string v2, "AndroidOpenSSL"

    .line 8
    .line 9
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    const/4 v5, 0x2

    .line 21
    if-ge v4, v5, :cond_1

    .line 22
    .line 23
    aget-object v5, v1, v4

    .line 24
    .line 25
    invoke-static {v5}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :catch_0
    if-ge v3, v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    check-cast v4, Ljava/security/Provider;

    .line 50
    .line 51
    :try_start_0
    invoke-interface {v0, p1, v4}, Lo34;->d(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    return-object p1

    .line 56
    :cond_2
    const/4 v1, 0x0

    .line 57
    invoke-interface {v0, p1, v1}, Lo34;->d(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

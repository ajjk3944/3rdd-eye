.class public final Lht1;
.super Lvq2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final i:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lus0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lvq2;-><init>(Lus0;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lht1;->i:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method

.method public static u(Landroid/content/Context;)Lko1;
    .locals 4

    .line 1
    new-instance v0, Lht1;

    .line 2
    .line 3
    new-instance v1, Lus0;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lht1;-><init>(Landroid/content/Context;Lus0;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/io/File;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v2, Ljava/io/File;

    .line 18
    .line 19
    const-string v3, "admob_volley"

    .line 20
    .line 21
    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p0, Lko1;

    .line 32
    .line 33
    new-instance v2, Lwo1;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Lwo1;-><init>(Ljava/io/File;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v2, v0}, Lko1;-><init>(Lwo1;Lvq2;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lko1;->a()V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method


# virtual methods
.method public final c(Ljo1;)Lho1;
    .locals 4

    .line 1
    iget v0, p1, Ljo1;->g:I

    .line 2
    .line 3
    iget-object v1, p1, Ljo1;->h:Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lmz1;->Q4:Liz1;

    .line 8
    .line 9
    sget-object v2, Ltw1;->e:Ltw1;

    .line 10
    .line 11
    iget-object v2, v2, Ltw1;->c:Lkz1;

    .line 12
    .line 13
    invoke-virtual {v2, v0}, Lkz1;->a(Liz1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/util/regex/Pattern;->matches(Ljava/lang/String;Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Lsv1;->f:Lsv1;

    .line 26
    .line 27
    iget-object v0, v0, Lsv1;->a:Lj63;

    .line 28
    .line 29
    const v0, 0xcc77c0

    .line 30
    .line 31
    .line 32
    sget-object v2, Lgz;->b:Lgz;

    .line 33
    .line 34
    iget-object v3, p0, Lht1;->i:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v2, v3, v0}, Lgz;->c(Landroid/content/Context;I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    new-instance v0, Lij;

    .line 43
    .line 44
    invoke-direct {v0, v3}, Lij;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lij;->c(Ljo1;)Lho1;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v1, "Got gmscore asset response: "

    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, Lgi2;->G(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "Failed to get gmscore asset response: "

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lgi2;->G(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-super {p0, p1}, Lvq2;->c(Ljo1;)Lho1;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1
.end method

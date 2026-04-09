.class public final Llb3;
.super Ld42;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Lwq3;

.field public final synthetic g:Lw23;

.field public final synthetic h:Ljb3;


# direct methods
.method public constructor <init>(Ljb3;Lwq3;Lw23;)V
    .locals 0

    .line 1
    iput-object p2, p0, Llb3;->f:Lwq3;

    .line 2
    .line 3
    iput-object p3, p0, Llb3;->g:Lw23;

    .line 4
    .line 5
    iput-object p1, p0, Llb3;->h:Ljb3;

    .line 6
    .line 7
    invoke-direct {p0}, Ld42;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final O(Lnx2;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lnx2;->b()Lu70;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lu70;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Llb3;->h:Ljb3;

    .line 10
    .line 11
    iget-object v2, v1, Ljb3;->e:Lae3;

    .line 12
    .line 13
    iget-object v2, v2, Lae3;->f:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    new-instance v5, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x39

    .line 34
    .line 35
    add-int/2addr v3, v4

    .line 36
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-string v3, "Failed to load interstitial ad with error: "

    .line 40
    .line 41
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, " for ad unit: "

    .line 48
    .line 49
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lgi2;->i0(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, p1}, Ljb3;->q(Lnx2;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final y()V
    .locals 2

    .line 1
    iget-object v0, p0, Llb3;->h:Ljb3;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Llb3;->g:Lw23;

    .line 7
    .line 8
    iget-object v1, p0, Llb3;->f:Lwq3;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lgp3;->d(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

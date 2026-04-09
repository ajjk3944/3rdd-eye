.class public final Lps3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ldp2;


# static fields
.field public static final h:Lps3;

.field public static final i:Lps3;

.field public static final j:Lps3;

.field public static final k:Lps3;

.field public static final l:Lps3;


# instance fields
.field public final synthetic f:I

.field public final g:Ljava/lang/String;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lps3;

    .line 2
    .line 3
    const-string v1, "TINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lps3;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lps3;->h:Lps3;

    .line 10
    .line 11
    new-instance v0, Lps3;

    .line 12
    .line 13
    const-string v1, "CRUNCHY"

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Lps3;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lps3;->i:Lps3;

    .line 19
    .line 20
    new-instance v0, Lps3;

    .line 21
    .line 22
    const-string v1, "NO_PREFIX"

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lps3;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lps3;->j:Lps3;

    .line 28
    .line 29
    new-instance v0, Lps3;

    .line 30
    .line 31
    const-string v1, "IEEE_P1363"

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v1, v2}, Lps3;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lps3;->k:Lps3;

    .line 38
    .line 39
    new-instance v0, Lps3;

    .line 40
    .line 41
    const-string v1, "DER"

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Lps3;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lps3;->l:Lps3;

    .line 47
    .line 48
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lps3;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Lps3;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Ldq2;

    .line 2
    .line 3
    iget-object v0, p0, Lps3;->g:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ldq2;->G(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lps3;->f:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, Lps3;->g:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_1
    iget-object v0, p0, Lps3;->g:Ljava/lang/String;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

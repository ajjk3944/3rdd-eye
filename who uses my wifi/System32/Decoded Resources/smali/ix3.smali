.class public final Lix3;
.super Lgi2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final j:Ljx3;

.field public final k:Lyf3;


# direct methods
.method public constructor <init>(Ljx3;Lyf3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lix3;->j:Ljx3;

    .line 5
    .line 6
    iput-object p2, p0, Lix3;->k:Lyf3;

    .line 7
    .line 8
    return-void
.end method

.method public static r0(Ljx3;Lyf3;)Lix3;
    .locals 2

    .line 1
    iget v0, p0, Ljx3;->a:I

    .line 2
    .line 3
    iget-object v1, p1, Lyf3;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lv34;

    .line 6
    .line 7
    iget-object v1, v1, Lv34;->a:[B

    .line 8
    .line 9
    array-length v1, v1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lix3;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, Lix3;-><init>(Ljx3;Lyf3;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 19
    .line 20
    const-string p1, "Key size mismatch"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method


# virtual methods
.method public final synthetic D()Lmr3;
    .locals 1

    .line 1
    iget-object v0, p0, Lix3;->j:Ljx3;

    .line 2
    .line 3
    return-object v0
.end method

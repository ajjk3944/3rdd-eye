.class public final Lr34;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Llr3;


# static fields
.field public static final e:[B


# instance fields
.field public final a:Lkx3;

.field public final b:I

.field public final c:[B

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-byte v1, v0, v1

    .line 6
    .line 7
    sput-object v0, Lr34;->e:[B

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lpw3;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, Lpw3;->j:Lrw3;

    .line 3
    iget v0, v0, Lrw3;->a:I

    .line 4
    invoke-static {v0}, Ljx3;->b(I)Ljx3;

    move-result-object v0

    .line 5
    iget-object v1, p1, Lpw3;->k:Lyf3;

    .line 6
    invoke-static {v0, v1}, Lix3;->r0(Ljx3;Lyf3;)Lix3;

    move-result-object v0

    .line 7
    invoke-static {v0}, Lpu1;->x(Lix3;)Lkx3;

    move-result-object v0

    iput-object v0, p0, Lr34;->a:Lkx3;

    .line 8
    iget-object v0, p1, Lpw3;->j:Lrw3;

    .line 9
    iget v1, v0, Lrw3;->b:I

    .line 10
    iput v1, p0, Lr34;->b:I

    .line 11
    iget-object p1, p1, Lpw3;->l:Lv34;

    .line 12
    invoke-virtual {p1}, Lv34;->b()[B

    move-result-object p1

    iput-object p1, p0, Lr34;->c:[B

    .line 13
    iget-object p1, v0, Lrw3;->c:Lgs3;

    .line 14
    sget-object v0, Lgs3;->m:Lgs3;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lr34;->e:[B

    const/4 v0, 0x1

    .line 15
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lr34;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    iput-object p1, p0, Lr34;->d:[B

    return-void
.end method

.method public constructor <init>(Lr2;I)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr34;->a:Lkx3;

    iput p2, p0, Lr34;->b:I

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lr34;->c:[B

    new-array v1, v0, [B

    iput-object v1, p0, Lr34;->d:[B

    new-array v0, v0, [B

    invoke-virtual {p1, p2, v0}, Lr2;->b(I[B)[B

    return-void
.end method

.method public constructor <init>(Luw3;)V
    .locals 5

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr2;

    .line 17
    iget-object v1, p1, Luw3;->j:Lzw3;

    .line 18
    iget-object v1, v1, Lzw3;->d:Lxw3;

    .line 19
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 20
    iget-object v3, p1, Luw3;->k:Lyf3;

    .line 21
    iget-object v3, v3, Lyf3;->f:Ljava/lang/Object;

    check-cast v3, Lv34;

    .line 22
    invoke-virtual {v3}, Lv34;->b()[B

    move-result-object v3

    .line 23
    const-string v4, "HMAC"

    invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Lr2;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;)V

    iput-object v0, p0, Lr34;->a:Lkx3;

    .line 24
    iget-object v0, p1, Luw3;->j:Lzw3;

    .line 25
    iget v1, v0, Lzw3;->b:I

    .line 26
    iput v1, p0, Lr34;->b:I

    .line 27
    iget-object p1, p1, Luw3;->l:Lv34;

    .line 28
    invoke-virtual {p1}, Lv34;->b()[B

    move-result-object p1

    iput-object p1, p0, Lr34;->c:[B

    .line 29
    iget-object p1, v0, Lzw3;->c:Lyw3;

    .line 30
    sget-object v0, Lyw3;->d:Lyw3;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lr34;->e:[B

    const/4 v0, 0x1

    .line 31
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lr34;->d:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [B

    iput-object p1, p0, Lr34;->d:[B

    return-void
.end method

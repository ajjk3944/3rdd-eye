.class public abstract Lku3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcr3;


# static fields
.field public static final a:Ldu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldu;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldu;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lku3;->a:Ldu;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Lns3;)Lzt3;
    .locals 2

    .line 1
    sget-object v0, Lzt3;->d:[B

    .line 2
    .line 3
    :try_start_0
    sget-object v0, Lku3;->a:Ldu;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-static {v0}, Lzt3;->a(Ljavax/crypto/Cipher;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lzt3;

    .line 20
    .line 21
    iget-object v1, p0, Lns3;->k:Lyf3;

    .line 22
    .line 23
    iget-object v1, v1, Lyf3;->f:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lv34;

    .line 26
    .line 27
    invoke-virtual {v1}, Lv34;->b()[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object p0, p0, Lns3;->l:Lv34;

    .line 32
    .line 33
    invoke-virtual {p0}, Lv34;->b()[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v0, v1, p0}, Lzt3;-><init>([B[B)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v0, "Cipher does not implement AES GCM SIV."

    .line 44
    .line 45
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_1
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 50
    .line 51
    const-string v0, "AES GCM SIV cipher is invalid."

    .line 52
    .line 53
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 57
    :catch_0
    move-exception p0

    .line 58
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 59
    .line 60
    const-string v1, "AES GCM SIV cipher is not available or is invalid."

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.class Lw4/k$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw4/k;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lv4/m;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA4/v;

    invoke-virtual {p0, p1}, Lw4/k$a;->c(LA4/v;)Lo4/t;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/v;)Lo4/t;
    .locals 4

    invoke-virtual {p1}, LA4/v;->Z()LA4/x;

    move-result-object v0

    invoke-virtual {v0}, LA4/x;->X()LA4/u;

    move-result-object v0

    invoke-virtual {p1}, LA4/v;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->N0()[B

    move-result-object v1

    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string/jumbo v3, "HMAC"

    invoke-direct {v2, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1}, LA4/v;->Z()LA4/x;

    move-result-object p1

    invoke-virtual {p1}, LA4/x;->Y()I

    move-result p1

    sget-object v1, Lw4/k$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    new-instance v0, LB4/o;

    new-instance v1, LB4/n;

    const-string/jumbo v3, "HMACSHA512"

    invoke-direct {v1, v3, v2}, LB4/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, LB4/o;-><init>(Lz4/a;I)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "unknown hash"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, LB4/o;

    new-instance v1, LB4/n;

    const-string/jumbo v3, "HMACSHA384"

    invoke-direct {v1, v3, v2}, LB4/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, LB4/o;-><init>(Lz4/a;I)V

    return-object v0

    :cond_2
    new-instance v0, LB4/o;

    new-instance v1, LB4/n;

    const-string/jumbo v3, "HMACSHA256"

    invoke-direct {v1, v3, v2}, LB4/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, LB4/o;-><init>(Lz4/a;I)V

    return-object v0

    :cond_3
    new-instance v0, LB4/o;

    new-instance v1, LB4/n;

    const-string/jumbo v3, "HMACSHA224"

    invoke-direct {v1, v3, v2}, LB4/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, LB4/o;-><init>(Lz4/a;I)V

    return-object v0

    :cond_4
    new-instance v0, LB4/o;

    new-instance v1, LB4/n;

    const-string/jumbo v3, "HMACSHA1"

    invoke-direct {v1, v3, v2}, LB4/n;-><init>(Ljava/lang/String;Ljava/security/Key;)V

    invoke-direct {v0, v1, p1}, LB4/o;-><init>(Lz4/a;I)V

    return-object v0
.end method

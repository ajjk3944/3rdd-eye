.class Lw4/k$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw4/k;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lw4/k;


# direct methods
.method constructor <init>(Lw4/k;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lw4/k$b;->b:Lw4/k;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/w;

    invoke-virtual {p0, p1}, Lw4/k$b;->f(LA4/w;)LA4/v;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, LA4/u;->SHA256:LA4/u;

    sget-object v2, Lo4/l$b;->TINK:Lo4/l$b;

    const/16 v3, 0x20

    const/16 v4, 0x10

    invoke-static {v3, v4, v1, v2}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v5

    const-string/jumbo v6, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-static {v3, v4, v1, v5}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v6

    const-string/jumbo v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v6, "HMAC_SHA256_256BITTAG"

    invoke-static {v3, v3, v1, v2}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v7

    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-static {v3, v3, v1, v5}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LA4/u;->SHA512:LA4/u;

    const/16 v6, 0x40

    invoke-static {v6, v4, v1, v2}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v7

    const-string/jumbo v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-static {v6, v4, v1, v5}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v4

    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v4, "HMAC_SHA512_256BITTAG"

    invoke-static {v6, v3, v1, v2}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v7

    invoke-interface {v0, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v4, "HMAC_SHA512_256BITTAG_RAW"

    invoke-static {v6, v3, v1, v5}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v3, "HMAC_SHA512_512BITTAG"

    invoke-static {v6, v6, v1, v2}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-static {v6, v6, v1, v5}, Lw4/k;->l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lw4/k$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/w;

    invoke-virtual {p0, p1}, Lw4/k$b;->h(LA4/w;)V

    return-void
.end method

.method public f(LA4/w;)LA4/v;
    .locals 2

    invoke-static {}, LA4/v;->b0()LA4/v$b;

    move-result-object v0

    iget-object v1, p0, Lw4/k$b;->b:Lw4/k;

    invoke-virtual {v1}, Lw4/k;->n()I

    move-result v1

    invoke-virtual {v0, v1}, LA4/v$b;->w(I)LA4/v$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/w;->Y()LA4/x;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/v$b;->u(LA4/x;)LA4/v$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/w;->X()I

    move-result p1

    invoke-static {p1}, LB4/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/v$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/v$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/v;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/w;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/w;->a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/w;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/w;)V
    .locals 2

    invoke-virtual {p1}, LA4/w;->X()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LA4/w;->Y()LA4/x;

    move-result-object p1

    invoke-static {p1}, Lw4/k;->k(LA4/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

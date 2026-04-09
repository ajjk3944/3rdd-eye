.class Lp4/e$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/e;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/e;


# direct methods
.method constructor <init>(Lp4/e;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/e$b;->b:Lp4/e;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/e;

    invoke-virtual {p0, p1}, Lp4/e$b;->f(LA4/e;)LA4/d;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v7, LA4/u;->SHA256:LA4/u;

    sget-object v8, Lo4/l$b;->TINK:Lo4/l$b;

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    move-object v5, v7

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lp4/e;->k(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lo4/l$b;->RAW:Lo4/l$b;

    const/16 v1, 0x10

    const/16 v2, 0x10

    move-object v6, v9

    invoke-static/range {v1 .. v6}, Lp4/e;->k(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x20

    const/16 v1, 0x20

    const/16 v2, 0x10

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lp4/e;->k(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    const/16 v2, 0x10

    move-object v6, v9

    invoke-static/range {v1 .. v6}, Lp4/e;->k(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/e$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/e;

    invoke-virtual {p0, p1}, Lp4/e$b;->h(LA4/e;)V

    return-void
.end method

.method public f(LA4/e;)LA4/d;
    .locals 2

    new-instance v0, Lp4/f;

    invoke-direct {v0}, Lp4/f;-><init>()V

    invoke-virtual {v0}, Lp4/f;->f()Lv4/d$a;

    move-result-object v0

    invoke-virtual {p1}, LA4/e;->W()LA4/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv4/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object v0

    check-cast v0, LA4/f;

    new-instance v1, Lw4/k;

    invoke-direct {v1}, Lw4/k;-><init>()V

    invoke-virtual {v1}, Lw4/k;->f()Lv4/d$a;

    move-result-object v1

    invoke-virtual {p1}, LA4/e;->X()LA4/w;

    move-result-object p1

    invoke-virtual {v1, p1}, Lv4/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    check-cast p1, LA4/v;

    invoke-static {}, LA4/d;->a0()LA4/d$b;

    move-result-object v1

    invoke-virtual {v1, v0}, LA4/d$b;->t(LA4/f;)LA4/d$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LA4/d$b;->u(LA4/v;)LA4/d$b;

    move-result-object p1

    iget-object v0, p0, Lp4/e$b;->b:Lp4/e;

    invoke-virtual {v0}, Lp4/e;->n()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/d$b;->w(I)LA4/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/d;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/e;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/e;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/e;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/e;)V
    .locals 2

    new-instance v0, Lp4/f;

    invoke-direct {v0}, Lp4/f;-><init>()V

    invoke-virtual {v0}, Lp4/f;->f()Lv4/d$a;

    move-result-object v0

    invoke-virtual {p1}, LA4/e;->W()LA4/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv4/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/M;)V

    new-instance v0, Lw4/k;

    invoke-direct {v0}, Lw4/k;-><init>()V

    invoke-virtual {v0}, Lw4/k;->f()Lv4/d$a;

    move-result-object v0

    invoke-virtual {p1}, LA4/e;->X()LA4/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lv4/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/M;)V

    invoke-virtual {p1}, LA4/e;->W()LA4/g;

    move-result-object p1

    invoke-virtual {p1}, LA4/g;->X()I

    move-result p1

    invoke-static {p1}, LB4/r;->a(I)V

    return-void
.end method

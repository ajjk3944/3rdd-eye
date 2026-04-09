.class Lp4/h$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/h;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/h;


# direct methods
.method constructor <init>(Lp4/h;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/h$b;->b:Lp4/h;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/j;

    invoke-virtual {p0, p1}, Lp4/h$b;->f(LA4/j;)LA4/i;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lo4/l$b;->TINK:Lo4/l$b;

    const/16 v2, 0x10

    invoke-static {v2, v2, v1}, Lp4/h;->k(IILo4/l$b;)Lv4/d$a$a;

    move-result-object v3

    const-string v4, "AES128_EAX"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-static {v2, v2, v3}, Lp4/h;->k(IILo4/l$b;)Lv4/d$a$a;

    move-result-object v4

    const-string v5, "AES128_EAX_RAW"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x20

    invoke-static {v4, v2, v1}, Lp4/h;->k(IILo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v5, "AES256_EAX"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_EAX_RAW"

    invoke-static {v4, v2, v3}, Lp4/h;->k(IILo4/l$b;)Lv4/d$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/h$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/j;

    invoke-virtual {p0, p1}, Lp4/h$b;->h(LA4/j;)V

    return-void
.end method

.method public f(LA4/j;)LA4/i;
    .locals 2

    invoke-static {}, LA4/i;->a0()LA4/i$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/j;->W()I

    move-result v1

    invoke-static {v1}, LB4/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/i$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/i$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/j;->X()LA4/k;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/i$b;->u(LA4/k;)LA4/i$b;

    move-result-object p1

    iget-object v0, p0, Lp4/h$b;->b:Lp4/h;

    invoke-virtual {v0}, Lp4/h;->m()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/i$b;->w(I)LA4/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/i;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/j;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/j;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/j;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/j;)V
    .locals 2

    invoke-virtual {p1}, LA4/j;->W()I

    move-result v0

    invoke-static {v0}, LB4/r;->a(I)V

    invoke-virtual {p1}, LA4/j;->X()LA4/k;

    move-result-object v0

    invoke-virtual {v0}, LA4/k;->W()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, LA4/j;->X()LA4/k;

    move-result-object p1

    invoke-virtual {p1}, LA4/k;->W()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.class Lt4/a$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt4/a;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lt4/a;


# direct methods
.method constructor <init>(Lt4/a;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lt4/a$b;->b:Lt4/a;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/q;

    invoke-virtual {p0, p1}, Lt4/a$b;->f(LA4/q;)LA4/p;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/q;->W()LA4/q$b;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v3}, LA4/q$b;->t(I)LA4/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v2

    check-cast v2, LA4/q;

    sget-object v4, Lo4/l$b;->TINK:Lo4/l$b;

    invoke-direct {v1, v2, v4}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "AES256_SIV"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/q;->W()LA4/q$b;

    move-result-object v2

    invoke-virtual {v2, v3}, LA4/q$b;->t(I)LA4/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v2

    check-cast v2, LA4/q;

    sget-object v3, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-direct {v1, v2, v3}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "AES256_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lt4/a$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/q;

    invoke-virtual {p0, p1}, Lt4/a$b;->h(LA4/q;)V

    return-void
.end method

.method public f(LA4/q;)LA4/p;
    .locals 1

    invoke-static {}, LA4/p;->Y()LA4/p$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/q;->V()I

    move-result p1

    invoke-static {p1}, LB4/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/p$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/p$b;

    move-result-object p1

    iget-object v0, p0, Lt4/a$b;->b:Lt4/a;

    invoke-virtual {v0}, Lt4/a;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/p$b;->u(I)LA4/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/p;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/q;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/q;->X(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/q;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/q;)V
    .locals 4

    invoke-virtual {p1}, LA4/q;->V()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LA4/q;->V()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

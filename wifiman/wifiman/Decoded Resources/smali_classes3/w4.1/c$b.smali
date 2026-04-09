.class Lw4/c$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw4/c;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lw4/c;


# direct methods
.method constructor <init>(Lw4/c;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lw4/c$b;->b:Lw4/c;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/b;

    invoke-virtual {p0, p1}, Lw4/c$b;->f(LA4/b;)LA4/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 7

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/b;->Y()LA4/b$b;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, LA4/b$b;->t(I)LA4/b$b;

    move-result-object v2

    invoke-static {}, LA4/c;->X()LA4/c$b;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, LA4/c$b;->t(I)LA4/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v4

    check-cast v4, LA4/c;

    invoke-virtual {v2, v4}, LA4/b$b;->u(LA4/c;)LA4/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v2

    check-cast v2, LA4/b;

    sget-object v4, Lo4/l$b;->TINK:Lo4/l$b;

    invoke-direct {v1, v2, v4}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/b;->Y()LA4/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, LA4/b$b;->t(I)LA4/b$b;

    move-result-object v2

    invoke-static {}, LA4/c;->X()LA4/c$b;

    move-result-object v6

    invoke-virtual {v6, v5}, LA4/c$b;->t(I)LA4/c$b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v6

    check-cast v6, LA4/c;

    invoke-virtual {v2, v6}, LA4/b$b;->u(LA4/c;)LA4/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v2

    check-cast v2, LA4/b;

    invoke-direct {v1, v2, v4}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/b;->Y()LA4/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, LA4/b$b;->t(I)LA4/b$b;

    move-result-object v2

    invoke-static {}, LA4/c;->X()LA4/c$b;

    move-result-object v3

    invoke-virtual {v3, v5}, LA4/c$b;->t(I)LA4/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v3

    check-cast v3, LA4/c;

    invoke-virtual {v2, v3}, LA4/b$b;->u(LA4/c;)LA4/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v2

    check-cast v2, LA4/b;

    sget-object v3, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-direct {v1, v2, v3}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lw4/c$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/b;

    invoke-virtual {p0, p1}, Lw4/c$b;->h(LA4/b;)V

    return-void
.end method

.method public f(LA4/b;)LA4/a;
    .locals 2

    invoke-static {}, LA4/a;->a0()LA4/a$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LA4/a$b;->w(I)LA4/a$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/b;->W()I

    move-result v1

    invoke-static {v1}, LB4/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/a$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/a$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/b;->X()LA4/c;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/a$b;->u(LA4/c;)LA4/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/a;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/b;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/b;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/b;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/b;)V
    .locals 1

    invoke-virtual {p1}, LA4/b;->X()LA4/c;

    move-result-object v0

    invoke-static {v0}, Lw4/c;->k(LA4/c;)V

    invoke-virtual {p1}, LA4/b;->W()I

    move-result p1

    invoke-static {p1}, Lw4/c;->l(I)V

    return-void
.end method

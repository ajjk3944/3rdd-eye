.class Lp4/z$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/z;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/z;


# direct methods
.method constructor <init>(Lp4/z;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/z$b;->b:Lp4/z;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/s;

    invoke-virtual {p0, p1}, Lp4/z$b;->f(LA4/s;)LA4/r;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/s;->U()LA4/s;

    move-result-object v2

    sget-object v3, Lo4/l$b;->TINK:Lo4/l$b;

    invoke-direct {v1, v2, v3}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lv4/d$a$a;

    invoke-static {}, LA4/s;->U()LA4/s;

    move-result-object v2

    sget-object v3, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-direct {v1, v2, v3}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/z$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/s;

    invoke-virtual {p0, p1}, Lp4/z$b;->h(LA4/s;)V

    return-void
.end method

.method public f(LA4/s;)LA4/r;
    .locals 1

    invoke-static {}, LA4/r;->Y()LA4/r$b;

    move-result-object p1

    iget-object v0, p0, Lp4/z$b;->b:Lp4/z;

    invoke-virtual {v0}, Lp4/z;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/r$b;->u(I)LA4/r$b;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {v0}, LB4/p;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p1, v0}, LA4/r$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/r;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/s;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/s;->V(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/s;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/s;)V
    .locals 0

    return-void
.end method

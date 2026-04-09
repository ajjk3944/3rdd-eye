.class Lp4/p$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/p;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/p;


# direct methods
.method constructor <init>(Lp4/p;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/p$b;->b:Lp4/p;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/m;

    invoke-virtual {p0, p1}, Lp4/p$b;->f(LA4/m;)LA4/l;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lo4/l$b;->TINK:Lo4/l$b;

    const/16 v2, 0x10

    invoke-static {v2, v1}, Lp4/p;->k(ILo4/l$b;)Lv4/d$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lo4/l$b;->RAW:Lo4/l$b;

    invoke-static {v2, v3}, Lp4/p;->k(ILo4/l$b;)Lv4/d$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, Lp4/p;->k(ILo4/l$b;)Lv4/d$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES256_GCM_RAW"

    invoke-static {v2, v3}, Lp4/p;->k(ILo4/l$b;)Lv4/d$a$a;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/p$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/m;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/m;

    invoke-virtual {p0, p1}, Lp4/p$b;->h(LA4/m;)V

    return-void
.end method

.method public f(LA4/m;)LA4/l;
    .locals 1

    invoke-static {}, LA4/l;->Y()LA4/l$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/m;->V()I

    move-result p1

    invoke-static {p1}, LB4/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/l$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/l$b;

    move-result-object p1

    iget-object v0, p0, Lp4/p$b;->b:Lp4/p;

    invoke-virtual {v0}, Lp4/p;->m()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/l$b;->u(I)LA4/l$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/l;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/m;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/m;->X(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/m;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/m;)V
    .locals 0

    invoke-virtual {p1}, LA4/m;->V()I

    move-result p1

    invoke-static {p1}, LB4/r;->a(I)V

    return-void
.end method

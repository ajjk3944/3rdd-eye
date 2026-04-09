.class public final LA4/g$b;
.super Lcom/google/crypto/tink/shaded/protobuf/w$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, LA4/g;->T()LA4/g;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method synthetic constructor <init>(LA4/g$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LA4/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->o()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->l()Lcom/google/crypto/tink/shaded/protobuf/w$a;

    move-result-object v0

    return-object v0
.end method

.method public t(I)LA4/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->m()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/g;

    invoke-static {v0, p1}, LA4/g;->V(LA4/g;I)V

    return-object p0
.end method

.method public u(LA4/h;)LA4/g$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->m()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/g;

    invoke-static {v0, p1}, LA4/g;->U(LA4/g;LA4/h;)V

    return-object p0
.end method

.method public bridge synthetic y()Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->k()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    return-object v0
.end method

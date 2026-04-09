.class public final LA4/C$b;
.super Lcom/google/crypto/tink/shaded/protobuf/w$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/N;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA4/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-static {}, LA4/C;->T()LA4/C;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/w;)V

    return-void
.end method

.method synthetic constructor <init>(LA4/C$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LA4/C$b;-><init>()V

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

.method public t(LA4/C$c;)LA4/C$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->m()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/C;

    invoke-static {v0, p1}, LA4/C;->V(LA4/C;LA4/C$c;)V

    return-object p0
.end method

.method public u(I)LA4/C$c;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/C;

    invoke-virtual {v0, p1}, LA4/C;->Y(I)LA4/C$c;

    move-result-object p1

    return-object p1
.end method

.method public w()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/C;

    invoke-virtual {v0}, LA4/C;->Z()I

    move-result v0

    return v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/C;

    invoke-virtual {v0}, LA4/C;->a0()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic y()Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->k()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public z(I)LA4/C$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->m()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/w$a;->b:Lcom/google/crypto/tink/shaded/protobuf/w;

    check-cast v0, LA4/C;

    invoke-static {v0, p1}, LA4/C;->U(LA4/C;I)V

    return-object p0
.end method

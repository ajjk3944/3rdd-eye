.class public final Lt4/a;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lt4/a$a;

    const-class v1, Lo4/e;

    invoke-direct {v0, v1}, Lt4/a$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/p;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance v0, Lt4/a;

    invoke-direct {v0}, Lt4/a;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lt4/a$b;

    const-class v1, LA4/q;

    invoke-direct {v0, p0, v1}, Lt4/a$b;-><init>(Lt4/a;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lt4/a;->l(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/p;

    invoke-virtual {p0, p1}, Lt4/a;->n(LA4/p;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/p;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/p;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/p;

    move-result-object p1

    return-object p1
.end method

.method public n(LA4/p;)V
    .locals 4

    invoke-virtual {p1}, LA4/p;->X()I

    move-result v0

    invoke-virtual {p0}, Lt4/a;->k()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/p;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidKeyException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LA4/p;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

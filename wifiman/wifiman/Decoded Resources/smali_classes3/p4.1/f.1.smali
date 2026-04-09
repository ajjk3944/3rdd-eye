.class public Lp4/f;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/f$a;

    const-class v1, LB4/l;

    invoke-direct {v0, v1}, Lp4/f$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/f;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(Lp4/f;LA4/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lp4/f;->o(LA4/h;)V

    return-void
.end method

.method private o(LA4/h;)V
    .locals 2

    invoke-virtual {p1}, LA4/h;->W()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LA4/h;->W()I

    move-result p1

    const/16 v0, 0x10

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/f$b;

    const-class v1, LA4/g;

    invoke-direct {v0, p0, v1}, Lp4/f$b;-><init>(Lp4/f;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/f;->m(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/f;

    invoke-virtual {p0, p1}, Lp4/f;->n(LA4/f;)V

    return-void
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/f;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/f;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/f;

    move-result-object p1

    return-object p1
.end method

.method public n(LA4/f;)V
    .locals 2

    invoke-virtual {p1}, LA4/f;->a0()I

    move-result v0

    invoke-virtual {p0}, Lp4/f;->l()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/f;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, LB4/r;->a(I)V

    invoke-virtual {p1}, LA4/f;->Z()LA4/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lp4/f;->o(LA4/h;)V

    return-void
.end method

.class public Lp4/D;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/D$a;

    const-class v1, Lo4/a;

    invoke-direct {v0, v1}, Lp4/D$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/E;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance v0, Lp4/D;

    invoke-direct {v0}, Lp4/D;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/D$b;

    const-class v1, LA4/F;

    invoke-direct {v0, p0, v1}, Lp4/D$b;-><init>(Lp4/D;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->REMOTE:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/D;->l(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/E;

    invoke-virtual {p0, p1}, Lp4/D;->n(LA4/E;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/E;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/E;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/E;

    move-result-object p1

    return-object p1
.end method

.method public n(LA4/E;)V
    .locals 1

    invoke-virtual {p1}, LA4/E;->X()I

    move-result p1

    invoke-virtual {p0}, Lp4/D;->k()I

    move-result v0

    invoke-static {p1, v0}, LB4/r;->c(II)V

    return-void
.end method

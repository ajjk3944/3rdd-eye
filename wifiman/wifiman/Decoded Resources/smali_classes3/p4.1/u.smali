.class public final Lp4/u;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/u$a;

    const-class v1, Lo4/a;

    invoke-direct {v0, v1}, Lp4/u$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/n;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(ILo4/l$b;)Lv4/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lp4/u;->m(ILo4/l$b;)Lv4/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private static m(ILo4/l$b;)Lv4/d$a$a;
    .locals 1

    invoke-static {}, LA4/o;->W()LA4/o$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LA4/o$b;->t(I)LA4/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/o;

    new-instance v0, Lv4/d$a$a;

    invoke-direct {v0, p0, p1}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    invoke-static {}, Lp4/u;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lp4/u;

    invoke-direct {v0}, Lp4/u;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    invoke-static {}, Lp4/x;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/u$b;

    const-class v1, LA4/o;

    invoke-direct {v0, p0, v1}, Lp4/u$b;-><init>(Lp4/u;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/u;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/n;

    invoke-virtual {p0, p1}, Lp4/u;->q(LA4/n;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/n;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/n;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/n;

    move-result-object p1

    return-object p1
.end method

.method public q(LA4/n;)V
    .locals 2

    invoke-virtual {p1}, LA4/n;->X()I

    move-result v0

    invoke-virtual {p0}, Lp4/u;->n()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/n;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-static {p1}, LB4/r;->a(I)V

    return-void
.end method

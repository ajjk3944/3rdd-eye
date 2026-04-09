.class public final Lw4/c;
.super Lv4/d;
.source "SourceFile"


# static fields
.field private static final d:Lv4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw4/b;

    invoke-direct {v0}, Lw4/b;-><init>()V

    const-class v1, Lw4/a;

    const-class v2, Lw4/g;

    invoke-static {v0, v1, v2}, Lv4/l;->b(Lv4/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/l;

    move-result-object v0

    sput-object v0, Lw4/c;->d:Lv4/l;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    new-instance v0, Lw4/c$a;

    const-class v1, Lo4/t;

    invoke-direct {v0, v1}, Lw4/c$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/a;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(LA4/c;)V
    .locals 0

    invoke-static {p0}, Lw4/c;->q(LA4/c;)V

    return-void
.end method

.method static synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lw4/c;->r(I)V

    return-void
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lw4/c;

    invoke-direct {v0}, Lw4/c;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    invoke-static {}, Lw4/f;->c()V

    invoke-static {}, Lv4/h;->c()Lv4/h;

    move-result-object p0

    sget-object v0, Lw4/c;->d:Lv4/l;

    invoke-virtual {p0, v0}, Lv4/h;->d(Lv4/l;)V

    return-void
.end method

.method private static q(LA4/c;)V
    .locals 2

    invoke-virtual {p0}, LA4/c;->W()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, LA4/c;->W()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static r(I)V
    .locals 1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lw4/c$b;

    const-class v1, LA4/b;

    invoke-direct {v0, p0, v1}, Lw4/c$b;-><init>(Lw4/c;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lw4/c;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/a;

    invoke-virtual {p0, p1}, Lw4/c;->p(LA4/a;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/a;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/a;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/a;

    move-result-object p1

    return-object p1
.end method

.method public p(LA4/a;)V
    .locals 2

    invoke-virtual {p1}, LA4/a;->Z()I

    move-result v0

    invoke-virtual {p0}, Lw4/c;->m()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/a;->X()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, Lw4/c;->r(I)V

    invoke-virtual {p1}, LA4/a;->Y()LA4/c;

    move-result-object p1

    invoke-static {p1}, Lw4/c;->q(LA4/c;)V

    return-void
.end method

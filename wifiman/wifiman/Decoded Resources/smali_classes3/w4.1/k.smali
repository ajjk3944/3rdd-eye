.class public final Lw4/k;
.super Lv4/d;
.source "SourceFile"


# static fields
.field private static final d:Lv4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw4/j;

    invoke-direct {v0}, Lw4/j;-><init>()V

    const-class v1, Lw4/i;

    const-class v2, Lw4/g;

    invoke-static {v0, v1, v2}, Lv4/l;->b(Lv4/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lv4/l;

    move-result-object v0

    sput-object v0, Lw4/k;->d:Lv4/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lw4/k$a;

    const-class v1, Lo4/t;

    invoke-direct {v0, v1}, Lw4/k$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/v;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(LA4/x;)V
    .locals 0

    invoke-static {p0}, Lw4/k;->r(LA4/x;)V

    return-void
.end method

.method static synthetic l(IILA4/u;Lo4/l$b;)Lv4/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw4/k;->m(IILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static m(IILA4/u;Lo4/l$b;)Lv4/d$a$a;
    .locals 3

    new-instance v0, Lv4/d$a$a;

    invoke-static {}, LA4/w;->Z()LA4/w$b;

    move-result-object v1

    invoke-static {}, LA4/x;->Z()LA4/x$b;

    move-result-object v2

    invoke-virtual {v2, p2}, LA4/x$b;->t(LA4/u;)LA4/x$b;

    move-result-object p2

    invoke-virtual {p2, p1}, LA4/x$b;->u(I)LA4/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/x;

    invoke-virtual {v1, p1}, LA4/w$b;->u(LA4/x;)LA4/w$b;

    move-result-object p1

    invoke-virtual {p1, p0}, LA4/w$b;->t(I)LA4/w$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/w;

    invoke-direct {v0, p0, p3}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lw4/k;

    invoke-direct {v0}, Lw4/k;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    invoke-static {}, Lw4/n;->c()V

    invoke-static {}, Lv4/h;->c()Lv4/h;

    move-result-object p0

    sget-object v0, Lw4/k;->d:Lv4/l;

    invoke-virtual {p0, v0}, Lv4/h;->d(Lv4/l;)V

    return-void
.end method

.method private static r(LA4/x;)V
    .locals 3

    invoke-virtual {p0}, LA4/x;->Y()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    sget-object v0, Lw4/k$c;->a:[I

    invoke-virtual {p0}, LA4/x;->X()LA4/u;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, LA4/x;->Y()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, LA4/x;->Y()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, LA4/x;->Y()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, LA4/x;->Y()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, LA4/x;->Y()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Lcom/google/crypto/tink/config/internal/b$b;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lw4/k$b;

    const-class v1, LA4/w;

    invoke-direct {v0, p0, v1}, Lw4/k$b;-><init>(Lw4/k;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lw4/k;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/v;

    invoke-virtual {p0, p1}, Lw4/k;->q(LA4/v;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/v;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/v;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/v;

    move-result-object p1

    return-object p1
.end method

.method public q(LA4/v;)V
    .locals 2

    invoke-virtual {p1}, LA4/v;->a0()I

    move-result v0

    invoke-virtual {p0}, Lw4/k;->n()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/v;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LA4/v;->Z()LA4/x;

    move-result-object p1

    invoke-static {p1}, Lw4/k;->r(LA4/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

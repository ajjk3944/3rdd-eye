.class public final Lp4/p;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/p$a;

    const-class v1, Lo4/a;

    invoke-direct {v0, v1}, Lp4/p$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/l;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(ILo4/l$b;)Lv4/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lp4/p;->l(ILo4/l$b;)Lv4/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(ILo4/l$b;)Lv4/d$a$a;
    .locals 1

    invoke-static {}, LA4/m;->W()LA4/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LA4/m$b;->t(I)LA4/m$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/m;

    new-instance v0, Lv4/d$a$a;

    invoke-direct {v0, p0, p1}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    return-object v0
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lp4/p;

    invoke-direct {v0}, Lp4/p;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    invoke-static {}, Lp4/s;->c()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/crypto/tink/config/internal/b$b;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/config/internal/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lcom/google/crypto/tink/config/internal/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/p$b;

    const-class v1, LA4/m;

    invoke-direct {v0, p0, v1}, Lp4/p$b;-><init>(Lp4/p;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/p;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/l;

    invoke-virtual {p0, p1}, Lp4/p;->p(LA4/l;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/l;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/l;->Z(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/l;

    move-result-object p1

    return-object p1
.end method

.method public p(LA4/l;)V
    .locals 2

    invoke-virtual {p1}, LA4/l;->X()I

    move-result v0

    invoke-virtual {p0}, Lp4/p;->m()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/l;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-static {p1}, LB4/r;->a(I)V

    return-void
.end method

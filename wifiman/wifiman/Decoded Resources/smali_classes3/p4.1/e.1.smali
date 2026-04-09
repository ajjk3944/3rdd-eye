.class public final Lp4/e;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/e$a;

    const-class v1, Lo4/a;

    invoke-direct {v0, v1}, Lp4/e$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/d;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp4/e;->m(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IIIILA4/u;)LA4/e;
    .locals 2

    invoke-static {}, LA4/g;->Z()LA4/g$b;

    move-result-object v0

    invoke-static {}, LA4/h;->X()LA4/h$b;

    move-result-object v1

    invoke-virtual {v1, p1}, LA4/h$b;->t(I)LA4/h$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/h;

    invoke-virtual {v0, p1}, LA4/g$b;->u(LA4/h;)LA4/g$b;

    move-result-object p1

    invoke-virtual {p1, p0}, LA4/g$b;->t(I)LA4/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/g;

    invoke-static {}, LA4/w;->Z()LA4/w$b;

    move-result-object p1

    invoke-static {}, LA4/x;->Z()LA4/x$b;

    move-result-object v0

    invoke-virtual {v0, p4}, LA4/x$b;->t(LA4/u;)LA4/x$b;

    move-result-object p4

    invoke-virtual {p4, p3}, LA4/x$b;->u(I)LA4/x$b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p3

    check-cast p3, LA4/x;

    invoke-virtual {p1, p3}, LA4/w$b;->u(LA4/x;)LA4/w$b;

    move-result-object p1

    invoke-virtual {p1, p2}, LA4/w$b;->t(I)LA4/w$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/w;

    invoke-static {}, LA4/e;->Y()LA4/e$b;

    move-result-object p2

    invoke-virtual {p2, p0}, LA4/e$b;->t(LA4/g;)LA4/e$b;

    move-result-object p0

    invoke-virtual {p0, p1}, LA4/e$b;->u(LA4/w;)LA4/e$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/e;

    return-object p0
.end method

.method private static m(IIIILA4/u;Lo4/l$b;)Lv4/d$a$a;
    .locals 1

    new-instance v0, Lv4/d$a$a;

    invoke-static {p0, p1, p2, p3, p4}, Lp4/e;->l(IIIILA4/u;)LA4/e;

    move-result-object p0

    invoke-direct {v0, p0, p5}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lp4/e;

    invoke-direct {v0}, Lp4/e;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

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

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/e$b;

    const-class v1, LA4/e;

    invoke-direct {v0, p0, v1}, Lp4/e$b;-><init>(Lp4/e;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/e;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/d;

    invoke-virtual {p0, p1}, Lp4/e;->q(LA4/d;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/d;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/d;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/d;

    move-result-object p1

    return-object p1
.end method

.method public q(LA4/d;)V
    .locals 2

    invoke-virtual {p1}, LA4/d;->Z()I

    move-result v0

    invoke-virtual {p0}, Lp4/e;->n()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    new-instance v0, Lp4/f;

    invoke-direct {v0}, Lp4/f;-><init>()V

    invoke-virtual {p1}, LA4/d;->X()LA4/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp4/f;->n(LA4/f;)V

    new-instance v0, Lw4/k;

    invoke-direct {v0}, Lw4/k;-><init>()V

    invoke-virtual {p1}, LA4/d;->Y()LA4/v;

    move-result-object p1

    invoke-virtual {v0, p1}, Lw4/k;->q(LA4/v;)V

    return-void
.end method

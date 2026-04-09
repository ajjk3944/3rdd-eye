.class public final Lp4/h;
.super Lv4/d;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 3

    new-instance v0, Lp4/h$a;

    const-class v1, Lo4/a;

    invoke-direct {v0, v1}, Lp4/h$a;-><init>(Ljava/lang/Class;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lv4/m;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-class v0, LA4/i;

    invoke-direct {p0, v0, v1}, Lv4/d;-><init>(Ljava/lang/Class;[Lv4/m;)V

    return-void
.end method

.method static synthetic k(IILo4/l$b;)Lv4/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2}, Lp4/h;->l(IILo4/l$b;)Lv4/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IILo4/l$b;)Lv4/d$a$a;
    .locals 1

    invoke-static {}, LA4/j;->Y()LA4/j$b;

    move-result-object v0

    invoke-virtual {v0, p0}, LA4/j$b;->t(I)LA4/j$b;

    move-result-object p0

    invoke-static {}, LA4/k;->X()LA4/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LA4/k$b;->t(I)LA4/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/k;

    invoke-virtual {p0, p1}, LA4/j$b;->u(LA4/k;)LA4/j$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p0

    check-cast p0, LA4/j;

    new-instance p1, Lv4/d$a$a;

    invoke-direct {p1, p0, p2}, Lv4/d$a$a;-><init>(Ljava/lang/Object;Lo4/l$b;)V

    return-object p1
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lp4/h;

    invoke-direct {v0}, Lp4/h;-><init>()V

    invoke-static {v0, p0}, Lo4/x;->l(Lv4/d;Z)V

    invoke-static {}, Lp4/n;->c()V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public f()Lv4/d$a;
    .locals 2

    new-instance v0, Lp4/h$b;

    const-class v1, LA4/j;

    invoke-direct {v0, p0, v1}, Lp4/h$b;-><init>(Lp4/h;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()LA4/y$c;
    .locals 1

    sget-object v0, LA4/y$c;->SYMMETRIC:LA4/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/h;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/i;

    invoke-virtual {p0, p1}, Lp4/h;->p(LA4/i;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/i;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/i;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/i;

    move-result-object p1

    return-object p1
.end method

.method public p(LA4/i;)V
    .locals 2

    invoke-virtual {p1}, LA4/i;->Z()I

    move-result v0

    invoke-virtual {p0}, Lp4/h;->m()I

    move-result v1

    invoke-static {v0, v1}, LB4/r;->c(II)V

    invoke-virtual {p1}, LA4/i;->X()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, LB4/r;->a(I)V

    invoke-virtual {p1}, LA4/i;->Y()LA4/k;

    move-result-object v0

    invoke-virtual {v0}, LA4/k;->W()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, LA4/i;->Y()LA4/k;

    move-result-object p1

    invoke-virtual {p1}, LA4/k;->W()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

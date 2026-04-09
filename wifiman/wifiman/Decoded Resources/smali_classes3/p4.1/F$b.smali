.class Lp4/F$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/F;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/F;


# direct methods
.method constructor <init>(Lp4/F;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/F$b;->b:Lp4/F;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/H;

    invoke-virtual {p0, p1}, Lp4/F$b;->f(LA4/H;)LA4/G;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/F$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/H;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/H;

    invoke-virtual {p0, p1}, Lp4/F$b;->h(LA4/H;)V

    return-void
.end method

.method public f(LA4/H;)LA4/G;
    .locals 1

    invoke-static {}, LA4/G;->Y()LA4/G$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LA4/G$b;->t(LA4/H;)LA4/G$b;

    move-result-object p1

    iget-object v0, p0, Lp4/F$b;->b:Lp4/F;

    invoke-virtual {v0}, Lp4/F;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/G$b;->u(I)LA4/G$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/G;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/H;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/H;->Y(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/H;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/H;)V
    .locals 1

    invoke-virtual {p1}, LA4/H;->W()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, LA4/H;->X()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string/jumbo v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

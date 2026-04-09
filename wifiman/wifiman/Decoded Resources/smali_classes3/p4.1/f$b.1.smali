.class Lp4/f$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/f;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/f;


# direct methods
.method constructor <init>(Lp4/f;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/f$b;->b:Lp4/f;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/g;

    invoke-virtual {p0, p1}, Lp4/f$b;->f(LA4/g;)LA4/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/f$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/g;

    invoke-virtual {p0, p1}, Lp4/f$b;->h(LA4/g;)V

    return-void
.end method

.method public f(LA4/g;)LA4/f;
    .locals 2

    invoke-static {}, LA4/f;->b0()LA4/f$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/g;->Y()LA4/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LA4/f$b;->u(LA4/h;)LA4/f$b;

    move-result-object v0

    invoke-virtual {p1}, LA4/g;->X()I

    move-result p1

    invoke-static {p1}, LB4/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->s([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, LA4/f$b;->t(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/f$b;

    move-result-object p1

    iget-object v0, p0, Lp4/f$b;->b:Lp4/f;

    invoke-virtual {v0}, Lp4/f;->l()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/f$b;->w(I)LA4/f$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/f;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/g;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/g;->a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/g;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/g;)V
    .locals 1

    invoke-virtual {p1}, LA4/g;->X()I

    move-result v0

    invoke-static {v0}, LB4/r;->a(I)V

    iget-object v0, p0, Lp4/f$b;->b:Lp4/f;

    invoke-virtual {p1}, LA4/g;->Y()LA4/h;

    move-result-object p1

    invoke-static {v0, p1}, Lp4/f;->k(Lp4/f;LA4/h;)V

    return-void
.end method

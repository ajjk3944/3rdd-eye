.class Lp4/D$b;
.super Lv4/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/D;->f()Lv4/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp4/D;


# direct methods
.method constructor <init>(Lp4/D;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp4/D$b;->b:Lp4/D;

    invoke-direct {p0, p2}, Lv4/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    check-cast p1, LA4/F;

    invoke-virtual {p0, p1}, Lp4/D$b;->f(LA4/F;)LA4/E;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 0

    invoke-virtual {p0, p1}, Lp4/D$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/M;)V
    .locals 0

    check-cast p1, LA4/F;

    invoke-virtual {p0, p1}, Lp4/D$b;->h(LA4/F;)V

    return-void
.end method

.method public f(LA4/F;)LA4/E;
    .locals 1

    invoke-static {}, LA4/E;->Y()LA4/E$b;

    move-result-object v0

    invoke-virtual {v0, p1}, LA4/E$b;->t(LA4/F;)LA4/E$b;

    move-result-object p1

    iget-object v0, p0, Lp4/D$b;->b:Lp4/D;

    invoke-virtual {v0}, Lp4/D;->k()I

    move-result v0

    invoke-virtual {p1, v0}, LA4/E$b;->u(I)LA4/E$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/w$a;->i()Lcom/google/crypto/tink/shaded/protobuf/w;

    move-result-object p1

    check-cast p1, LA4/E;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)LA4/F;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/o;->b()Lcom/google/crypto/tink/shaded/protobuf/o;

    move-result-object v0

    invoke-static {p1, v0}, LA4/F;->W(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/o;)LA4/F;

    move-result-object p1

    return-object p1
.end method

.method public h(LA4/F;)V
    .locals 0

    return-void
.end method

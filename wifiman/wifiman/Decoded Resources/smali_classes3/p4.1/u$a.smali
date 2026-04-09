.class Lp4/u$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/u;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lv4/m;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/M;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA4/n;

    invoke-virtual {p0, p1}, Lp4/u$a;->c(LA4/n;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/n;)Lo4/a;
    .locals 1

    new-instance v0, Lr4/a;

    invoke-virtual {p1}, LA4/n;->W()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->N0()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lr4/a;-><init>([B)V

    return-object v0
.end method

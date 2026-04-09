.class Lp4/F$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/F;-><init>()V
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

    check-cast p1, LA4/G;

    invoke-virtual {p0, p1}, Lp4/F$a;->c(LA4/G;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/G;)Lo4/a;
    .locals 2

    invoke-virtual {p1}, LA4/G;->W()LA4/H;

    move-result-object v0

    invoke-virtual {v0}, LA4/H;->W()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo4/s;->a(Ljava/lang/String;)Lo4/r;

    move-result-object v1

    invoke-interface {v1, v0}, Lo4/r;->b(Ljava/lang/String;)Lo4/a;

    move-result-object v0

    new-instance v1, Lp4/E;

    invoke-virtual {p1}, LA4/G;->W()LA4/H;

    move-result-object p1

    invoke-virtual {p1}, LA4/H;->V()LA4/A;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lp4/E;-><init>(LA4/A;Lo4/a;)V

    return-object v1
.end method

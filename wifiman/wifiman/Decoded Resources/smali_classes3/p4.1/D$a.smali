.class Lp4/D$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/D;-><init>()V
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

    check-cast p1, LA4/E;

    invoke-virtual {p0, p1}, Lp4/D$a;->c(LA4/E;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/E;)Lo4/a;
    .locals 1

    invoke-virtual {p1}, LA4/E;->W()LA4/F;

    move-result-object p1

    invoke-virtual {p1}, LA4/F;->V()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lo4/s;->a(Ljava/lang/String;)Lo4/r;

    move-result-object v0

    invoke-interface {v0, p1}, Lo4/r;->b(Ljava/lang/String;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.class Lp4/f$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/f;-><init>()V
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

    check-cast p1, LA4/f;

    invoke-virtual {p0, p1}, Lp4/f$a;->c(LA4/f;)LB4/l;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/f;)LB4/l;
    .locals 2

    new-instance v0, LB4/a;

    invoke-virtual {p1}, LA4/f;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->N0()[B

    move-result-object v1

    invoke-virtual {p1}, LA4/f;->Z()LA4/h;

    move-result-object p1

    invoke-virtual {p1}, LA4/h;->W()I

    move-result p1

    invoke-direct {v0, v1, p1}, LB4/a;-><init>([BI)V

    return-object v0
.end method

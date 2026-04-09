.class Lp4/e$a;
.super Lv4/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp4/e;-><init>()V
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

    check-cast p1, LA4/d;

    invoke-virtual {p0, p1}, Lp4/e$a;->c(LA4/d;)Lo4/a;

    move-result-object p1

    return-object p1
.end method

.method public c(LA4/d;)Lo4/a;
    .locals 5

    new-instance v0, LB4/h;

    new-instance v1, Lp4/f;

    invoke-direct {v1}, Lp4/f;-><init>()V

    invoke-virtual {p1}, LA4/d;->X()LA4/f;

    move-result-object v2

    const-class v3, LB4/l;

    invoke-virtual {v1, v2, v3}, Lv4/d;->e(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB4/l;

    new-instance v2, Lw4/k;

    invoke-direct {v2}, Lw4/k;-><init>()V

    invoke-virtual {p1}, LA4/d;->Y()LA4/v;

    move-result-object v3

    const-class v4, Lo4/t;

    invoke-virtual {v2, v3, v4}, Lv4/d;->e(Lcom/google/crypto/tink/shaded/protobuf/M;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo4/t;

    invoke-virtual {p1}, LA4/d;->Y()LA4/v;

    move-result-object p1

    invoke-virtual {p1}, LA4/v;->Z()LA4/x;

    move-result-object p1

    invoke-virtual {p1}, LA4/x;->Y()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, LB4/h;-><init>(LB4/l;Lo4/t;I)V

    return-object v0
.end method

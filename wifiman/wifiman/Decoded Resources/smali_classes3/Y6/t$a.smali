.class LY6/t$a;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, LY6/h;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(LY6/k;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LY6/t$a;->l(LY6/k;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LY6/t$a;->m(LY6/o;Ljava/lang/String;)V

    return-void
.end method

.method public l(LY6/k;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, LY6/k;->Y()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public m(LY6/o;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, LY6/o;->r0(Ljava/lang/String;)LY6/o;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "JsonAdapter(String)"

    return-object v0
.end method

.class LY6/t$e;
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

    invoke-virtual {p0, p1}, LY6/t$e;->l(LY6/k;)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Byte;

    invoke-virtual {p0, p1, p2}, LY6/t$e;->m(LY6/o;Ljava/lang/Byte;)V

    return-void
.end method

.method public l(LY6/k;)Ljava/lang/Byte;
    .locals 3

    const/16 v0, -0x80

    const/16 v1, 0xff

    const-string/jumbo v2, "a byte"

    invoke-static {p1, v2, v0, v1}, LY6/t;->a(LY6/k;Ljava/lang/String;II)I

    move-result p1

    int-to-byte p1, p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public m(LY6/o;Ljava/lang/Byte;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Byte;->intValue()I

    move-result p2

    and-int/lit16 p2, p2, 0xff

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, LY6/o;->o0(J)LY6/o;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "JsonAdapter(Byte)"

    return-object v0
.end method

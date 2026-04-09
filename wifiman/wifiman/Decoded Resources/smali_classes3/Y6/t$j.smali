.class LY6/t$j;
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

    invoke-virtual {p0, p1}, LY6/t$j;->l(LY6/k;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(LY6/o;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, LY6/t$j;->m(LY6/o;Ljava/lang/Long;)V

    return-void
.end method

.method public l(LY6/k;)Ljava/lang/Long;
    .locals 2

    invoke-virtual {p1}, LY6/k;->P()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public m(LY6/o;Ljava/lang/Long;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LY6/o;->o0(J)LY6/o;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "JsonAdapter(Long)"

    return-object v0
.end method

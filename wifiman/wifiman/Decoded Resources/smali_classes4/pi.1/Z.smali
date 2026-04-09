.class final Lpi/Z;
.super Lpi/B;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lpi/d0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpi/B;-><init>(Lpi/d0;)V

    return-void
.end method


# virtual methods
.method public O0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/Z;->Z0(Lpi/d0;)Lpi/Z;

    move-result-object p1

    return-object p1
.end method

.method public Z0(Lpi/d0;)Lpi/Z;
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/Z;

    invoke-direct {v0, p1}, Lpi/Z;-><init>(Lpi/d0;)V

    return-object v0
.end method

.class final Lpi/f0;
.super Lpi/B;
.source "SourceFile"


# instance fields
.field private final c:Lpi/r0;


# direct methods
.method public constructor <init>(Lpi/d0;Lpi/r0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lpi/B;-><init>(Lpi/d0;)V

    iput-object p2, p0, Lpi/f0;->c:Lpi/r0;

    return-void
.end method


# virtual methods
.method public M0()Lpi/r0;
    .locals 1

    iget-object v0, p0, Lpi/f0;->c:Lpi/r0;

    return-object v0
.end method

.method public bridge synthetic Y0(Lpi/d0;)Lpi/A;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/f0;->Z0(Lpi/d0;)Lpi/f0;

    move-result-object p1

    return-object p1
.end method

.method public Z0(Lpi/d0;)Lpi/f0;
    .locals 2

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/f0;

    invoke-virtual {p0}, Lpi/f0;->M0()Lpi/r0;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lpi/f0;-><init>(Lpi/d0;Lpi/r0;)V

    return-object v0
.end method

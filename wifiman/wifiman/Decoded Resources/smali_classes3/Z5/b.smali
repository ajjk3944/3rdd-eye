.class public final LZ5/b;
.super Lz6/a;
.source "SourceFile"

# interfaces
.implements LZ5/a;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 2
    const-string v2, "#.##;\u2212#.##"

    invoke-direct {p0, v2, v0, v1, v0}, LZ5/b;-><init>(Ljava/lang/String;Ljava/math/RoundingMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/math/RoundingMode;)V
    .locals 1

    const-string/jumbo v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "roundingMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Lz6/a;->b:Lz6/a$a;

    invoke-virtual {v0, p1, p2}, Lz6/a$a;->a(Ljava/lang/String;Ljava/math/RoundingMode;)Ljava/text/DecimalFormat;

    move-result-object p1

    invoke-direct {p0, p1}, LZ5/b;-><init>(Ljava/text/DecimalFormat;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/math/RoundingMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 3
    sget-object p2, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2}, LZ5/b;-><init>(Ljava/lang/String;Ljava/math/RoundingMode;)V

    return-void
.end method

.method public constructor <init>(Ljava/text/DecimalFormat;)V
    .locals 1

    const-string/jumbo v0, "decimalFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lz6/a;-><init>(Ljava/text/DecimalFormat;)V

    return-void
.end method

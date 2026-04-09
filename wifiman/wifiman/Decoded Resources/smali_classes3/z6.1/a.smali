.class public Lz6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz6/a$a;
    }
.end annotation


# static fields
.field public static final b:Lz6/a$a;


# instance fields
.field private final a:Ljava/text/DecimalFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lz6/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz6/a;->b:Lz6/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 2
    const-string v2, "#.##;\u2212#.##"

    invoke-direct {p0, v2, v0, v1, v0}, Lz6/a;-><init>(Ljava/lang/String;Ljava/math/RoundingMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct {p0, p1}, Lz6/a;-><init>(Ljava/text/DecimalFormat;)V

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
    invoke-direct {p0, p1, p2}, Lz6/a;-><init>(Ljava/lang/String;Ljava/math/RoundingMode;)V

    return-void
.end method

.method public constructor <init>(Ljava/text/DecimalFormat;)V
    .locals 1

    const-string/jumbo v0, "decimalFormat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/a;->a:Ljava/text/DecimalFormat;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(FLk6/b;)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lz6/a;->b(FLk6/b;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(FLk6/b;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "chartValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lz6/a;->a:Ljava/text/DecimalFormat;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo p2, "decimalFormat.format(value)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

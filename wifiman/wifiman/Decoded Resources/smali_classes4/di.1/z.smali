.class public final Ldi/z;
.super Ldi/b;
.source "SourceFile"


# instance fields
.field private final c:Lpi/S;


# direct methods
.method public constructor <init>(Ljava/util/List;Lpi/S;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldi/y;

    invoke-direct {v0, p2}, Ldi/y;-><init>(Lpi/S;)V

    invoke-direct {p0, p1, v0}, Ldi/b;-><init>(Ljava/util/List;Lmh/l;)V

    iput-object p2, p0, Ldi/z;->c:Lpi/S;

    return-void
.end method

.method private static final c(Lpi/S;LBh/G;)Lpi/S;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method static synthetic d(Lpi/S;LBh/G;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, Ldi/z;->c(Lpi/S;LBh/G;)Lpi/S;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e()Lpi/S;
    .locals 1

    iget-object v0, p0, Ldi/z;->c:Lpi/S;

    return-object v0
.end method

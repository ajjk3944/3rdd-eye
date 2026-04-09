.class public final Lpi/Y;
.super Lpi/O0;
.source "SourceFile"


# instance fields
.field private final b:Loi/n;

.field private final c:Lmh/a;

.field private final d:Loi/i;


# direct methods
.method public constructor <init>(Loi/n;Lmh/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "computation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/O0;-><init>()V

    iput-object p1, p0, Lpi/Y;->b:Loi/n;

    iput-object p2, p0, Lpi/Y;->c:Lmh/a;

    invoke-interface {p1, p2}, Loi/n;->f(Lmh/a;)Loi/i;

    move-result-object p1

    iput-object p1, p0, Lpi/Y;->d:Loi/i;

    return-void
.end method

.method static synthetic T0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)Lpi/S;
    .locals 0

    invoke-static {p0, p1}, Lpi/Y;->V0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)Lpi/S;
    .locals 0

    iget-object p1, p1, Lpi/Y;->c:Lmh/a;

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lri/i;

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/types/checker/g;->h(Lri/i;)Lpi/S;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic P0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/S;
    .locals 0

    invoke-virtual {p0, p1}, Lpi/Y;->U0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/Y;

    move-result-object p1

    return-object p1
.end method

.method protected R0()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/Y;->d:Loi/i;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    return-object v0
.end method

.method public S0()Z
    .locals 1

    iget-object v0, p0, Lpi/Y;->d:Loi/i;

    invoke-interface {v0}, Loi/i;->m()Z

    move-result v0

    return v0
.end method

.method public U0(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/Y;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lpi/Y;

    iget-object v1, p0, Lpi/Y;->b:Loi/n;

    new-instance v2, Lpi/X;

    invoke-direct {v2, p1, p0}, Lpi/X;-><init>(Lkotlin/reflect/jvm/internal/impl/types/checker/g;Lpi/Y;)V

    invoke-direct {v0, v1, v2}, Lpi/Y;-><init>(Loi/n;Lmh/a;)V

    return-object v0
.end method

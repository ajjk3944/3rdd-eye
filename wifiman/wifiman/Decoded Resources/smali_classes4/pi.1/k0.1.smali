.class public final Lpi/k0;
.super Lpi/C0;
.source "SourceFile"


# instance fields
.field private final a:LBh/l0;

.field private final b:LYg/m;


# direct methods
.method public constructor <init>(LBh/l0;)V
    .locals 1

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lpi/C0;-><init>()V

    iput-object p1, p0, Lpi/k0;->a:LBh/l0;

    sget-object p1, LYg/q;->PUBLICATION:LYg/q;

    new-instance v0, Lpi/j0;

    invoke-direct {v0, p0}, Lpi/j0;-><init>(Lpi/k0;)V

    invoke-static {p1, v0}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Lpi/k0;->b:LYg/m;

    return-void
.end method

.method private static final d(Lpi/k0;)Lpi/S;
    .locals 0

    iget-object p0, p0, Lpi/k0;->a:LBh/l0;

    invoke-static {p0}, Lpi/l0;->b(LBh/l0;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lpi/k0;)Lpi/S;
    .locals 0

    invoke-static {p0}, Lpi/k0;->d(Lpi/k0;)Lpi/S;

    move-result-object p0

    return-object p0
.end method

.method private final f()Lpi/S;
    .locals 1

    iget-object v0, p0, Lpi/k0;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpi/S;

    return-object v0
.end method


# virtual methods
.method public a()Lpi/N0;
    .locals 1

    sget-object v0, Lpi/N0;->OUT_VARIANCE:Lpi/N0;

    return-object v0
.end method

.method public b(Lkotlin/reflect/jvm/internal/impl/types/checker/g;)Lpi/B0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getType()Lpi/S;
    .locals 1

    invoke-direct {p0}, Lpi/k0;->f()Lpi/S;

    move-result-object v0

    return-object v0
.end method

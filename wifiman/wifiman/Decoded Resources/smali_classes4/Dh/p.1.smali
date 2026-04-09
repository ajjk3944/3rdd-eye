.class public final LDh/p;
.super LDh/H;
.source "SourceFile"


# direct methods
.method public constructor <init>(LBh/G;LZh/c;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LDh/H;-><init>(LBh/G;LZh/c;)V

    return-void
.end method


# virtual methods
.method public G0()Lii/k$b;
    .locals 1

    sget-object v0, Lii/k$b;->b:Lii/k$b;

    return-object v0
.end method

.method public bridge synthetic r()Lii/k;
    .locals 1

    invoke-virtual {p0}, LDh/p;->G0()Lii/k$b;

    move-result-object v0

    return-object v0
.end method

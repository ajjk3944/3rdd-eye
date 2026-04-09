.class public abstract Lli/r;
.super LDh/H;
.source "SourceFile"


# instance fields
.field private final g:Loi/n;


# direct methods
.method public constructor <init>(LZh/c;Loi/n;LBh/G;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1}, LDh/H;-><init>(LBh/G;LZh/c;)V

    iput-object p2, p0, Lli/r;->g:Loi/n;

    return-void
.end method


# virtual methods
.method public abstract G0()Lli/j;
.end method

.method public K0(LZh/f;)Z
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LBh/M;->r()Lii/k;

    move-result-object v0

    instance-of v1, v0, Lni/w;

    if-eqz v1, :cond_0

    check-cast v0, Lni/w;

    invoke-virtual {v0}, Lni/w;->t()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public abstract L0(Lli/n;)V
.end method

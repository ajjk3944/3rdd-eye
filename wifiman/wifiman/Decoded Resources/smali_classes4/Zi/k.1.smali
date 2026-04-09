.class public final LZi/k;
.super LZi/M0;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final c:LZi/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZi/k;

    invoke-direct {v0}, LZi/k;-><init>()V

    sput-object v0, LZi/k;->c:LZi/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/e;->a:Lkotlin/jvm/internal/e;

    invoke-static {v0}, LWi/a;->D(Lkotlin/jvm/internal/e;)LVi/b;

    move-result-object v0

    invoke-direct {p0, v0}, LZi/M0;-><init>(LVi/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(LYi/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, [B

    invoke-virtual {p0, p1, p2, p3}, LZi/k;->F(LYi/d;[BI)V

    return-void
.end method

.method protected B([B)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method protected C()[B
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method protected D(LYi/c;ILZi/j;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/M0;->a()LXi/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LYi/c;->H(LXi/f;I)B

    move-result p1

    invoke-virtual {p3, p1}, LZi/j;->e(B)V

    return-void
.end method

.method protected E([B)LZi/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZi/j;

    invoke-direct {v0, p1}, LZi/j;-><init>([B)V

    return-object v0
.end method

.method protected F(LYi/d;[BI)V
    .locals 3

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, LZi/M0;->a()LXi/f;

    move-result-object v1

    aget-byte v2, p2, v0

    invoke-interface {p1, v1, v0, v2}, LYi/d;->F(LXi/f;IB)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LZi/k;->B([B)I

    move-result p1

    return p1
.end method

.method public bridge synthetic n(LYi/c;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, LZi/j;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/k;->D(LYi/c;ILZi/j;Z)V

    return-void
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, LZi/k;->E([B)LZi/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/k;->C()[B

    move-result-object v0

    return-object v0
.end method

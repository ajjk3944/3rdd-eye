.class public final LZi/h1;
.super LZi/M0;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final c:LZi/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZi/h1;

    invoke-direct {v0}, LZi/h1;-><init>()V

    sput-object v0, LZi/h1;->c:LZi/h1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, LYg/C;->b:LYg/C$a;

    invoke-static {v0}, LWi/a;->y(LYg/C$a;)LVi/b;

    move-result-object v0

    invoke-direct {p0, v0}, LZi/M0;-><init>(LVi/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(LYi/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, LYg/D;

    invoke-virtual {p2}, LYg/D;->A()[I

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, LZi/h1;->F(LYi/d;[II)V

    return-void
.end method

.method protected B([I)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYg/D;->u([I)I

    move-result p1

    return p1
.end method

.method protected C()[I
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LYg/D;->e(I)[I

    move-result-object v0

    return-object v0
.end method

.method protected D(LYi/c;ILZi/g1;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/M0;->a()LXi/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LYi/c;->E(LXi/f;I)LYi/e;

    move-result-object p1

    invoke-interface {p1}, LYi/e;->n()I

    move-result p1

    invoke-static {p1}, LYg/C;->b(I)I

    move-result p1

    invoke-virtual {p3, p1}, LZi/g1;->e(I)V

    return-void
.end method

.method protected E([I)LZi/g1;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZi/g1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZi/g1;-><init>([ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected F(LYi/d;[II)V
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

    invoke-interface {p1, v1, v0}, LYi/d;->e(LXi/f;I)LYi/f;

    move-result-object v1

    invoke-static {p2, v0}, LYg/D;->q([II)I

    move-result v2

    invoke-interface {v1, v2}, LYi/f;->A(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYg/D;

    invoke-virtual {p1}, LYg/D;->A()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/h1;->B([I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic n(LYi/c;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, LZi/g1;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/h1;->D(LYi/c;ILZi/g1;Z)V

    return-void
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/D;

    invoke-virtual {p1}, LYg/D;->A()[I

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/h1;->E([I)LZi/g1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/h1;->C()[I

    move-result-object v0

    invoke-static {v0}, LYg/D;->b([I)LYg/D;

    move-result-object v0

    return-object v0
.end method

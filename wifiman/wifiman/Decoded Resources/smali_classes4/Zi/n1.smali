.class public final LZi/n1;
.super LZi/M0;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final c:LZi/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZi/n1;

    invoke-direct {v0}, LZi/n1;-><init>()V

    sput-object v0, LZi/n1;->c:LZi/n1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, LYg/H;->b:LYg/H$a;

    invoke-static {v0}, LWi/a;->A(LYg/H$a;)LVi/b;

    move-result-object v0

    invoke-direct {p0, v0}, LZi/M0;-><init>(LVi/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(LYi/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, LYg/I;

    invoke-virtual {p2}, LYg/I;->A()[S

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, LZi/n1;->F(LYi/d;[SI)V

    return-void
.end method

.method protected B([S)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYg/I;->u([S)I

    move-result p1

    return p1
.end method

.method protected C()[S
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LYg/I;->e(I)[S

    move-result-object v0

    return-object v0
.end method

.method protected D(LYi/c;ILZi/m1;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/M0;->a()LXi/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LYi/c;->E(LXi/f;I)LYi/e;

    move-result-object p1

    invoke-interface {p1}, LYi/e;->F()S

    move-result p1

    invoke-static {p1}, LYg/H;->b(S)S

    move-result p1

    invoke-virtual {p3, p1}, LZi/m1;->e(S)V

    return-void
.end method

.method protected E([S)LZi/m1;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZi/m1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZi/m1;-><init>([SLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected F(LYi/d;[SI)V
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

    invoke-static {p2, v0}, LYg/I;->q([SI)S

    move-result v2

    invoke-interface {v1, v2}, LYi/f;->k(S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYg/I;

    invoke-virtual {p1}, LYg/I;->A()[S

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/n1;->B([S)I

    move-result p1

    return p1
.end method

.method public bridge synthetic n(LYi/c;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, LZi/m1;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/n1;->D(LYi/c;ILZi/m1;Z)V

    return-void
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/I;

    invoke-virtual {p1}, LYg/I;->A()[S

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/n1;->E([S)LZi/m1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/n1;->C()[S

    move-result-object v0

    invoke-static {v0}, LYg/I;->b([S)LYg/I;

    move-result-object v0

    return-object v0
.end method

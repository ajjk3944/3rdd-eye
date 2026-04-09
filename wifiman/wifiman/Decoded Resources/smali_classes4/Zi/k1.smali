.class public final LZi/k1;
.super LZi/M0;
.source "SourceFile"

# interfaces
.implements LVi/b;


# static fields
.field public static final c:LZi/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZi/k1;

    invoke-direct {v0}, LZi/k1;-><init>()V

    sput-object v0, LZi/k1;->c:LZi/k1;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, LYg/E;->b:LYg/E$a;

    invoke-static {v0}, LWi/a;->z(LYg/E$a;)LVi/b;

    move-result-object v0

    invoke-direct {p0, v0}, LZi/M0;-><init>(LVi/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(LYi/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, LYg/F;

    invoke-virtual {p2}, LYg/F;->A()[J

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, LZi/k1;->F(LYi/d;[JI)V

    return-void
.end method

.method protected B([J)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYg/F;->u([J)I

    move-result p1

    return p1
.end method

.method protected C()[J
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, LYg/F;->e(I)[J

    move-result-object v0

    return-object v0
.end method

.method protected D(LYi/c;ILZi/j1;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/M0;->a()LXi/f;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LYi/c;->E(LXi/f;I)LYi/e;

    move-result-object p1

    invoke-interface {p1}, LYi/e;->v()J

    move-result-wide p1

    invoke-static {p1, p2}, LYg/E;->b(J)J

    move-result-wide p1

    invoke-virtual {p3, p1, p2}, LZi/j1;->e(J)V

    return-void
.end method

.method protected E([J)LZi/j1;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LZi/j1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LZi/j1;-><init>([JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method protected F(LYi/d;[JI)V
    .locals 4

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

    invoke-static {p2, v0}, LYg/F;->q([JI)J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, LYi/f;->E(J)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LYg/F;

    invoke-virtual {p1}, LYg/F;->A()[J

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/k1;->B([J)I

    move-result p1

    return p1
.end method

.method public bridge synthetic n(LYi/c;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, LZi/j1;

    invoke-virtual {p0, p1, p2, p3, p4}, LZi/k1;->D(LYi/c;ILZi/j1;Z)V

    return-void
.end method

.method public bridge synthetic q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/F;

    invoke-virtual {p1}, LYg/F;->A()[J

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/k1;->E([J)LZi/j1;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic x()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZi/k1;->C()[J

    move-result-object v0

    invoke-static {v0}, LYg/F;->b([J)LYg/F;

    move-result-object v0

    return-object v0
.end method

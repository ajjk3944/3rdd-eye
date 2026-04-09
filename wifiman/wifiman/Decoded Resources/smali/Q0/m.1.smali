.class public final LQ0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/k$b;


# instance fields
.field private final a:LQ0/G;

.field private final b:LQ0/H;

.field private final c:LQ0/T;

.field private final d:LQ0/r;

.field private final e:LQ0/F;

.field private final f:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LQ0/G;LQ0/H;LQ0/T;LQ0/r;LQ0/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LQ0/m;->a:LQ0/G;

    .line 3
    iput-object p2, p0, LQ0/m;->b:LQ0/H;

    .line 4
    iput-object p3, p0, LQ0/m;->c:LQ0/T;

    .line 5
    iput-object p4, p0, LQ0/m;->d:LQ0/r;

    .line 6
    iput-object p5, p0, LQ0/m;->e:LQ0/F;

    .line 7
    new-instance p1, LQ0/m$a;

    invoke-direct {p1, p0}, LQ0/m$a;-><init>(LQ0/m;)V

    iput-object p1, p0, LQ0/m;->f:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(LQ0/G;LQ0/H;LQ0/T;LQ0/r;LQ0/F;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 8
    sget-object p2, LQ0/H;->a:LQ0/H$a;

    invoke-virtual {p2}, LQ0/H$a;->a()LQ0/H;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 9
    invoke-static {}, LQ0/n;->b()LQ0/T;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 10
    new-instance p4, LQ0/r;

    invoke-static {}, LQ0/n;->a()LQ0/g;

    move-result-object p2

    const/4 p3, 0x0

    const/4 p7, 0x2

    invoke-direct {p4, p2, p3, p7, p3}, LQ0/r;-><init>(LQ0/g;Ldh/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 11
    new-instance p5, LQ0/F;

    invoke-direct {p5}, LQ0/F;-><init>()V

    :cond_3
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, LQ0/m;-><init>(LQ0/G;LQ0/H;LQ0/T;LQ0/r;LQ0/F;)V

    return-void
.end method

.method public static final synthetic c(LQ0/m;)Lmh/l;
    .locals 0

    iget-object p0, p0, LQ0/m;->f:Lmh/l;

    return-object p0
.end method

.method public static final synthetic d(LQ0/m;)LQ0/r;
    .locals 0

    iget-object p0, p0, LQ0/m;->d:LQ0/r;

    return-object p0
.end method

.method public static final synthetic e(LQ0/m;)LQ0/F;
    .locals 0

    iget-object p0, p0, LQ0/m;->e:LQ0/F;

    return-object p0
.end method

.method public static final synthetic f(LQ0/m;LQ0/S;)LT/z1;
    .locals 0

    invoke-direct {p0, p1}, LQ0/m;->h(LQ0/S;)LT/z1;

    move-result-object p0

    return-object p0
.end method

.method private final h(LQ0/S;)LT/z1;
    .locals 2

    iget-object v0, p0, LQ0/m;->c:LQ0/T;

    new-instance v1, LQ0/m$b;

    invoke-direct {v1, p0, p1}, LQ0/m$b;-><init>(LQ0/m;LQ0/S;)V

    invoke-virtual {v0, p1, v1}, LQ0/T;->c(LQ0/S;Lmh/l;)LT/z1;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(LQ0/k;LQ0/A;II)LT/z1;
    .locals 8

    new-instance v7, LQ0/S;

    iget-object v0, p0, LQ0/m;->b:LQ0/H;

    invoke-interface {v0, p1}, LQ0/H;->d(LQ0/k;)LQ0/k;

    move-result-object v1

    iget-object p1, p0, LQ0/m;->b:LQ0/H;

    invoke-interface {p1, p2}, LQ0/H;->c(LQ0/A;)LQ0/A;

    move-result-object v2

    iget-object p1, p0, LQ0/m;->b:LQ0/H;

    invoke-interface {p1, p3}, LQ0/H;->a(I)I

    move-result v3

    iget-object p1, p0, LQ0/m;->b:LQ0/H;

    invoke-interface {p1, p4}, LQ0/H;->b(I)I

    move-result v4

    iget-object p1, p0, LQ0/m;->a:LQ0/G;

    invoke-interface {p1}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LQ0/S;-><init>(LQ0/k;LQ0/A;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, v7}, LQ0/m;->h(LQ0/S;)LT/z1;

    move-result-object p1

    return-object p1
.end method

.method public final g()LQ0/G;
    .locals 1

    iget-object v0, p0, LQ0/m;->a:LQ0/G;

    return-object v0
.end method

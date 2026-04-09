.class abstract Lz/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/d;
.implements LD0/j;


# instance fields
.field private final a:LT/q0;


# direct methods
.method private constructor <init>()V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    invoke-static {v0, v0, v0, v0}, Lz/h0;->a(IIII)Lz/f0;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    iput-object v0, p0, Lz/D;->a:LT/q0;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lz/D;-><init>()V

    return-void
.end method

.method private final c()Lz/f0;
    .locals 1

    iget-object v0, p0, Lz/D;->a:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz/f0;

    return-object v0
.end method

.method private final e(Lz/f0;)V
    .locals 1

    iget-object v0, p0, Lz/D;->a:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public Z0(LD0/k;)V
    .locals 1

    invoke-static {}, Lz/i0;->b()LD0/l;

    move-result-object v0

    invoke-interface {p1, v0}, LD0/k;->z(LD0/c;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz/f0;

    invoke-virtual {p0, p1}, Lz/D;->a(Lz/f0;)Lz/f0;

    move-result-object p1

    invoke-direct {p0, p1}, Lz/D;->e(Lz/f0;)V

    return-void
.end method

.method public abstract a(Lz/f0;)Lz/f0;
.end method

.method public d()Lz/f0;
    .locals 1

    invoke-direct {p0}, Lz/D;->c()Lz/f0;

    move-result-object v0

    return-object v0
.end method

.method public getKey()LD0/l;
    .locals 1

    invoke-static {}, Lz/i0;->b()LD0/l;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz/D;->d()Lz/f0;

    move-result-object v0

    return-object v0
.end method

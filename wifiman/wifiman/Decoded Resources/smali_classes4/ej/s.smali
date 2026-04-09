.class public final Lej/s;
.super LZg/d;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lej/s$a;
    }
.end annotation


# static fields
.field public static final d:Lej/s$a;


# instance fields
.field private final b:[Lej/h;

.field private final c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lej/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lej/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lej/s;->d:Lej/s$a;

    return-void
.end method

.method private constructor <init>([Lej/h;[I)V
    .locals 0

    .line 2
    invoke-direct {p0}, LZg/d;-><init>()V

    .line 3
    iput-object p1, p0, Lej/s;->b:[Lej/h;

    .line 4
    iput-object p2, p0, Lej/s;->c:[I

    return-void
.end method

.method public synthetic constructor <init>([Lej/h;[ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lej/s;-><init>([Lej/h;[I)V

    return-void
.end method

.method public static final varargs b0([Lej/h;)Lej/s;
    .locals 1

    sget-object v0, Lej/s;->d:Lej/s$a;

    invoke-virtual {v0, p0}, Lej/s$a;->d([Lej/h;)Lej/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final C()[Lej/h;
    .locals 1

    iget-object v0, p0, Lej/s;->b:[Lej/h;

    return-object v0
.end method

.method public final J()[I
    .locals 1

    iget-object v0, p0, Lej/s;->c:[I

    return-object v0
.end method

.method public bridge S(Lej/h;)I
    .locals 0

    invoke-super {p0, p1}, LZg/d;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge T(Lej/h;)I
    .locals 0

    invoke-super {p0, p1}, LZg/d;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lej/h;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lej/h;

    invoke-virtual {p0, p1}, Lej/s;->v(Lej/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lej/s;->y(I)Lej/h;

    move-result-object p1

    return-object p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lej/h;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lej/h;

    invoke-virtual {p0, p1}, Lej/s;->S(Lej/h;)I

    move-result p1

    return p1
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lej/s;->b:[Lej/h;

    array-length v0, v0

    return v0
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    instance-of v0, p1, Lej/h;

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    check-cast p1, Lej/h;

    invoke-virtual {p0, p1}, Lej/s;->T(Lej/h;)I

    move-result p1

    return p1
.end method

.method public bridge v(Lej/h;)Z
    .locals 0

    invoke-super {p0, p1}, LZg/b;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y(I)Lej/h;
    .locals 1

    iget-object v0, p0, Lej/s;->b:[Lej/h;

    aget-object p1, v0, p1

    return-object p1
.end method

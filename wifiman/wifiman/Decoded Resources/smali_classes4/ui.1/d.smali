.class public final Lui/d;
.super Lui/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lui/d$a;
    }
.end annotation


# static fields
.field public static final c:Lui/d$a;


# instance fields
.field private a:[Ljava/lang/Object;

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lui/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lui/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lui/d;->c:Lui/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/16 v0, 0x14

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lui/d;-><init>([Ljava/lang/Object;I)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lui/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lui/d;->a:[Ljava/lang/Object;

    .line 3
    iput p2, p0, Lui/d;->b:I

    return-void
.end method

.method public static final synthetic f(Lui/d;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lui/d;->a:[Ljava/lang/Object;

    return-object p0
.end method

.method private final g(I)V
    .locals 2

    iget-object v0, p0, Lui/d;->a:[Ljava/lang/Object;

    array-length v1, v0

    if-le v1, p1, :cond_0

    return-void

    :cond_0
    array-length v0, v0

    :cond_1
    mul-int/lit8 v0, v0, 0x2

    if-le v0, p1, :cond_1

    iget-object p1, p0, Lui/d;->a:[Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lui/d;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lui/d;->b:I

    return v0
.end method

.method public e(ILjava/lang/Object;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lui/d;->g(I)V

    iget-object v0, p0, Lui/d;->a:[Ljava/lang/Object;

    aget-object v0, v0, p1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lui/d;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lui/d;->b:I

    :cond_0
    iget-object v0, p0, Lui/d;->a:[Ljava/lang/Object;

    aput-object p2, v0, p1

    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lui/d;->a:[Ljava/lang/Object;

    invoke-static {v0, p1}, LZg/n;->i0([Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lui/d$b;

    invoke-direct {v0, p0}, Lui/d$b;-><init>(Lui/d;)V

    return-object v0
.end method

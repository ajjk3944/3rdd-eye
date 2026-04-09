.class final LE0/k0$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE0/k0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field public static final a:LE0/k0$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE0/k0$a$a;

    invoke-direct {v0}, LE0/k0$a$a;-><init>()V

    sput-object v0, LE0/k0$a$a;->a:LE0/k0$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LE0/G;LE0/G;)I
    .locals 2

    invoke-virtual {p2}, LE0/G;->L()I

    move-result v0

    invoke-virtual {p1}, LE0/G;->L()I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->k(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->k(II)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, LE0/G;

    invoke-virtual {p0, p1, p2}, LE0/k0$a$a;->a(LE0/G;LE0/G;)I

    move-result p1

    return p1
.end method

.class public abstract Lsh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lnh/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsh/a$a;
    }
.end annotation


# static fields
.field public static final d:Lsh/a$a;


# instance fields
.field private final a:C

.field private final b:C

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsh/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lsh/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lsh/a;->d:Lsh/a$a;

    return-void
.end method

.method public constructor <init>(CCI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput-char p1, p0, Lsh/a;->a:C

    invoke-static {p1, p2, p3}, Lgh/c;->c(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Lsh/a;->b:C

    iput p3, p0, Lsh/a;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Step must be non-zero."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final i()C
    .locals 1

    iget-char v0, p0, Lsh/a;->a:C

    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lsh/a;->k()LZg/u;

    move-result-object v0

    return-object v0
.end method

.method public final j()C
    .locals 1

    iget-char v0, p0, Lsh/a;->b:C

    return v0
.end method

.method public k()LZg/u;
    .locals 4

    new-instance v0, Lsh/b;

    iget-char v1, p0, Lsh/a;->a:C

    iget-char v2, p0, Lsh/a;->b:C

    iget v3, p0, Lsh/a;->c:I

    invoke-direct {v0, v1, v2, v3}, Lsh/b;-><init>(CCI)V

    return-object v0
.end method

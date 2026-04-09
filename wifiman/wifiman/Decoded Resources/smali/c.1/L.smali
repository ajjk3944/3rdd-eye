.class public final Lc/L;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/L$a;
    }
.end annotation


# static fields
.field public static final e:Lc/L$a;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc/L$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc/L$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc/L;->e:Lc/L$a;

    return-void
.end method

.method private constructor <init>(IIILmh/l;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc/L;->a:I

    .line 4
    iput p2, p0, Lc/L;->b:I

    .line 5
    iput p3, p0, Lc/L;->c:I

    .line 6
    iput-object p4, p0, Lc/L;->d:Lmh/l;

    return-void
.end method

.method public synthetic constructor <init>(IIILmh/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lc/L;-><init>(IIILmh/l;)V

    return-void
.end method


# virtual methods
.method public final a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lc/L;->d:Lmh/l;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lc/L;->c:I

    return v0
.end method

.method public final c(Z)I
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Lc/L;->b:I

    goto :goto_0

    :cond_0
    iget p1, p0, Lc/L;->a:I

    :goto_0
    return p1
.end method

.method public final d(Z)I
    .locals 1

    iget v0, p0, Lc/L;->c:I

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget p1, p0, Lc/L;->b:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lc/L;->a:I

    :goto_0
    return p1
.end method

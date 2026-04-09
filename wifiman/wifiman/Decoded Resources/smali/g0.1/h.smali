.class public final Lg0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/h$a;
    }
.end annotation


# static fields
.field public static final e:Lg0/h$a;

.field public static final f:I

.field private static g:I


# instance fields
.field private final a:Ljava/util/List;

.field private b:Ll0/i;

.field private final c:Lmh/l;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lg0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lg0/h;->e:Lg0/h$a;

    const/16 v0, 0x8

    sput v0, Lg0/h;->f:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ll0/i;Lmh/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg0/h;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lg0/h;->b:Ll0/i;

    .line 4
    iput-object p3, p0, Lg0/h;->c:Lmh/l;

    .line 5
    sget-object p1, Lg0/h;->e:Lg0/h$a;

    invoke-static {p1}, Lg0/h$a;->a(Lg0/h$a;)I

    move-result p1

    iput p1, p0, Lg0/h;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ll0/i;Lmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x0

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lg0/h;-><init>(Ljava/util/List;Ll0/i;Lmh/l;)V

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lg0/h;->g:I

    return v0
.end method

.method public static final synthetic b(I)V
    .locals 0

    sput p0, Lg0/h;->g:I

    return-void
.end method


# virtual methods
.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lg0/h;->a:Ljava/util/List;

    return-object v0
.end method

.method public final d()Ll0/i;
    .locals 1

    iget-object v0, p0, Lg0/h;->b:Ll0/i;

    return-object v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lg0/h;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lg0/h;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Lg0/h;->a:Ljava/util/List;

    check-cast p1, Lg0/h;

    iget-object v3, p1, Lg0/h;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lg0/h;->b:Ll0/i;

    iget-object v3, p1, Lg0/h;->b:Ll0/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lg0/h;->c:Lmh/l;

    iget-object p1, p1, Lg0/h;->c:Lmh/l;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f()Lmh/l;
    .locals 1

    iget-object v0, p0, Lg0/h;->c:Lmh/l;

    return-object v0
.end method

.method public final g(Ll0/i;)V
    .locals 0

    iput-object p1, p0, Lg0/h;->b:Ll0/i;

    return-void
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lg0/h;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg0/h;->b:Ll0/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll0/i;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lg0/h;->c:Lmh/l;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method

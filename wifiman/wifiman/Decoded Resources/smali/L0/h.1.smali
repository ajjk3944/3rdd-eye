.class public final LL0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL0/h$a;
    }
.end annotation


# static fields
.field public static final b:LL0/h$a;

.field private static final c:I

.field private static final d:I

.field private static final e:I


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL0/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL0/h;->b:LL0/h$a;

    const/4 v0, 0x0

    invoke-static {v0}, LL0/h;->e(I)I

    move-result v0

    sput v0, LL0/h;->c:I

    const/4 v0, 0x1

    invoke-static {v0}, LL0/h;->e(I)I

    move-result v0

    sput v0, LL0/h;->d:I

    const/4 v0, 0x2

    invoke-static {v0}, LL0/h;->e(I)I

    move-result v0

    sput v0, LL0/h;->e:I

    return-void
.end method

.method private synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LL0/h;->a:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LL0/h;->e:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LL0/h;->c:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LL0/h;->d:I

    return v0
.end method

.method public static final synthetic d(I)LL0/h;
    .locals 1

    new-instance v0, LL0/h;

    invoke-direct {v0, p0}, LL0/h;-><init>(I)V

    return-object v0
.end method

.method private static e(I)I
    .locals 0

    return p0
.end method

.method public static f(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LL0/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LL0/h;

    invoke-virtual {p1}, LL0/h;->j()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final g(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static h(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static i(I)Ljava/lang/String;
    .locals 2

    sget v0, LL0/h;->c:I

    if-ne p0, v0, :cond_0

    const-string p0, "EmojiSupportMatch.Default"

    goto :goto_0

    :cond_0
    sget v0, LL0/h;->d:I

    if-ne p0, v0, :cond_1

    const-string p0, "EmojiSupportMatch.None"

    goto :goto_0

    :cond_1
    sget v0, LL0/h;->e:I

    if-ne p0, v0, :cond_2

    const-string p0, "EmojiSupportMatch.All"

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LL0/h;->a:I

    invoke-static {v0, p1}, LL0/h;->f(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LL0/h;->a:I

    invoke-static {v0}, LL0/h;->h(I)I

    move-result v0

    return v0
.end method

.method public final synthetic j()I
    .locals 1

    iget v0, p0, LL0/h;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LL0/h;->a:I

    invoke-static {v0}, LL0/h;->i(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

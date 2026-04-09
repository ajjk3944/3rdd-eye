.class public final LR0/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/x$a;
    }
.end annotation


# static fields
.field public static final b:LR0/x$a;

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I

.field private static final g:I


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR0/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR0/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LR0/x;->b:LR0/x$a;

    const/4 v0, -0x1

    invoke-static {v0}, LR0/x;->g(I)I

    move-result v0

    sput v0, LR0/x;->c:I

    const/4 v0, 0x0

    invoke-static {v0}, LR0/x;->g(I)I

    move-result v0

    sput v0, LR0/x;->d:I

    const/4 v0, 0x1

    invoke-static {v0}, LR0/x;->g(I)I

    move-result v0

    sput v0, LR0/x;->e:I

    const/4 v0, 0x2

    invoke-static {v0}, LR0/x;->g(I)I

    move-result v0

    sput v0, LR0/x;->f:I

    const/4 v0, 0x3

    invoke-static {v0}, LR0/x;->g(I)I

    move-result v0

    sput v0, LR0/x;->g:I

    return-void
.end method

.method private synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LR0/x;->a:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LR0/x;->e:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LR0/x;->d:I

    return v0
.end method

.method public static final synthetic c()I
    .locals 1

    sget v0, LR0/x;->g:I

    return v0
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, LR0/x;->c:I

    return v0
.end method

.method public static final synthetic e()I
    .locals 1

    sget v0, LR0/x;->f:I

    return v0
.end method

.method public static final synthetic f(I)LR0/x;
    .locals 1

    new-instance v0, LR0/x;

    invoke-direct {v0, p0}, LR0/x;-><init>(I)V

    return-object v0
.end method

.method private static g(I)I
    .locals 0

    return p0
.end method

.method public static h(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LR0/x;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LR0/x;

    invoke-virtual {p1}, LR0/x;->l()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final i(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static j(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static k(I)Ljava/lang/String;
    .locals 1

    sget v0, LR0/x;->c:I

    invoke-static {p0, v0}, LR0/x;->i(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "Unspecified"

    goto :goto_0

    :cond_0
    sget v0, LR0/x;->d:I

    invoke-static {p0, v0}, LR0/x;->i(II)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "None"

    goto :goto_0

    :cond_1
    sget v0, LR0/x;->e:I

    invoke-static {p0, v0}, LR0/x;->i(II)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "Characters"

    goto :goto_0

    :cond_2
    sget v0, LR0/x;->f:I

    invoke-static {p0, v0}, LR0/x;->i(II)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p0, "Words"

    goto :goto_0

    :cond_3
    sget v0, LR0/x;->g:I

    invoke-static {p0, v0}, LR0/x;->i(II)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "Sentences"

    goto :goto_0

    :cond_4
    const-string p0, "Invalid"

    :goto_0
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LR0/x;->a:I

    invoke-static {v0, p1}, LR0/x;->h(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LR0/x;->a:I

    invoke-static {v0}, LR0/x;->j(I)I

    move-result v0

    return v0
.end method

.method public final synthetic l()I
    .locals 1

    iget v0, p0, LR0/x;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LR0/x;->a:I

    invoke-static {v0}, LR0/x;->k(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

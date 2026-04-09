.class public final LW0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/f$a;,
        LW0/f$b;,
        LW0/f$c;,
        LW0/f$d;
    }
.end annotation


# static fields
.field public static final b:LW0/f$a;

.field private static final c:I

.field private static final d:I

.field private static final e:I

.field private static final f:I


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LW0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/f;->b:LW0/f$a;

    sget-object v0, LW0/f$b;->a:LW0/f$b$a;

    invoke-virtual {v0}, LW0/f$b$a;->c()I

    move-result v1

    sget-object v2, LW0/f$c;->a:LW0/f$c$a;

    invoke-virtual {v2}, LW0/f$c$a;->c()I

    move-result v3

    sget-object v4, LW0/f$d;->a:LW0/f$d$a;

    invoke-virtual {v4}, LW0/f$d$a;->a()I

    move-result v5

    invoke-static {v1, v3, v5}, LW0/g;->a(III)I

    move-result v1

    invoke-static {v1}, LW0/f;->d(I)I

    move-result v1

    sput v1, LW0/f;->c:I

    invoke-virtual {v0}, LW0/f$b$a;->a()I

    move-result v1

    invoke-virtual {v2}, LW0/f$c$a;->b()I

    move-result v3

    invoke-virtual {v4}, LW0/f$d$a;->b()I

    move-result v5

    invoke-static {v1, v3, v5}, LW0/g;->a(III)I

    move-result v1

    invoke-static {v1}, LW0/f;->d(I)I

    move-result v1

    sput v1, LW0/f;->d:I

    invoke-virtual {v0}, LW0/f$b$a;->b()I

    move-result v0

    invoke-virtual {v2}, LW0/f$c$a;->d()I

    move-result v1

    invoke-virtual {v4}, LW0/f$d$a;->a()I

    move-result v2

    invoke-static {v0, v1, v2}, LW0/g;->a(III)I

    move-result v0

    invoke-static {v0}, LW0/f;->d(I)I

    move-result v0

    sput v0, LW0/f;->e:I

    const/4 v0, 0x0

    invoke-static {v0}, LW0/f;->d(I)I

    move-result v0

    sput v0, LW0/f;->f:I

    return-void
.end method

.method private synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LW0/f;->a:I

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, LW0/f;->c:I

    return v0
.end method

.method public static final synthetic b()I
    .locals 1

    sget v0, LW0/f;->f:I

    return v0
.end method

.method public static final synthetic c(I)LW0/f;
    .locals 1

    new-instance v0, LW0/f;

    invoke-direct {v0, p0}, LW0/f;-><init>(I)V

    return-object v0
.end method

.method private static d(I)I
    .locals 0

    return p0
.end method

.method public static e(ILjava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LW0/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LW0/f;

    invoke-virtual {p1}, LW0/f;->l()I

    move-result p1

    if-eq p0, p1, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final f(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(I)I
    .locals 0

    invoke-static {p0}, LW0/g;->b(I)I

    move-result p0

    invoke-static {p0}, LW0/f$b;->d(I)I

    move-result p0

    return p0
.end method

.method public static final h(I)I
    .locals 0

    invoke-static {p0}, LW0/g;->c(I)I

    move-result p0

    invoke-static {p0}, LW0/f$c;->e(I)I

    move-result p0

    return p0
.end method

.method public static final i(I)I
    .locals 0

    invoke-static {p0}, LW0/g;->d(I)I

    move-result p0

    invoke-static {p0}, LW0/f$d;->c(I)I

    move-result p0

    return p0
.end method

.method public static j(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    move-result p0

    return p0
.end method

.method public static k(I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LineBreak(strategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW0/f;->g(I)I

    move-result v1

    invoke-static {v1}, LW0/f$b;->f(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strictness="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW0/f;->h(I)I

    move-result v1

    invoke-static {v1}, LW0/f$c;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wordBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LW0/f;->i(I)I

    move-result p0

    invoke-static {p0}, LW0/f$d;->e(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LW0/f;->a:I

    invoke-static {v0, p1}, LW0/f;->e(ILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LW0/f;->a:I

    invoke-static {v0}, LW0/f;->j(I)I

    move-result v0

    return v0
.end method

.method public final synthetic l()I
    .locals 1

    iget v0, p0, LW0/f;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, LW0/f;->a:I

    invoke-static {v0}, LW0/f;->k(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

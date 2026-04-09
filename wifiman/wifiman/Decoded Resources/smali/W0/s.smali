.class public final LW0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW0/s$a;,
        LW0/s$b;
    }
.end annotation


# static fields
.field public static final c:LW0/s$a;

.field private static final d:LW0/s;

.field private static final e:LW0/s;


# instance fields
.field private final a:I

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LW0/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW0/s$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/s;->c:LW0/s$a;

    new-instance v0, LW0/s;

    sget-object v2, LW0/s$b;->a:LW0/s$b$a;

    invoke-virtual {v2}, LW0/s$b$a;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, LW0/s;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/s;->d:LW0/s;

    new-instance v0, LW0/s;

    invoke-virtual {v2}, LW0/s$b$a;->b()I

    move-result v2

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LW0/s;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LW0/s;->e:LW0/s;

    return-void
.end method

.method private constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LW0/s;->a:I

    .line 4
    iput-boolean p2, p0, LW0/s;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LW0/s;-><init>(IZ)V

    return-void
.end method

.method public static final synthetic a()LW0/s;
    .locals 1

    sget-object v0, LW0/s;->d:LW0/s;

    return-object v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LW0/s;->a:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, LW0/s;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LW0/s;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LW0/s;->a:I

    check-cast p1, LW0/s;

    iget v3, p1, LW0/s;->a:I

    invoke-static {v1, v3}, LW0/s$b;->e(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, LW0/s;->b:Z

    iget-boolean p1, p1, LW0/s;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LW0/s;->a:I

    invoke-static {v0}, LW0/s$b;->f(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LW0/s;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    sget-object v0, LW0/s;->d:LW0/s;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "TextMotion.Static"

    goto :goto_0

    :cond_0
    sget-object v0, LW0/s;->e:LW0/s;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "TextMotion.Animated"

    goto :goto_0

    :cond_1
    const-string v0, "Invalid"

    :goto_0
    return-object v0
.end method

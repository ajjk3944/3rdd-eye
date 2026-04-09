.class public final enum Lc6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc6/a$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lc6/a;

.field public static final enum Grouped:Lc6/a;

.field public static final enum Stack:Lc6/a;


# direct methods
.method private static final synthetic $values()[Lc6/a;
    .locals 2

    sget-object v0, Lc6/a;->Grouped:Lc6/a;

    sget-object v1, Lc6/a;->Stack:Lc6/a;

    filled-new-array {v0, v1}, [Lc6/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc6/a;

    const-string/jumbo v1, "Grouped"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc6/a;->Grouped:Lc6/a;

    new-instance v0, Lc6/a;

    const-string/jumbo v1, "Stack"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lc6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc6/a;->Stack:Lc6/a;

    invoke-static {}, Lc6/a;->$values()[Lc6/a;

    move-result-object v0

    sput-object v0, Lc6/a;->$VALUES:[Lc6/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc6/a;
    .locals 1

    const-class v0, Lc6/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc6/a;

    return-object p0
.end method

.method public static values()[Lc6/a;
    .locals 1

    sget-object v0, Lc6/a;->$VALUES:[Lc6/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc6/a;

    return-object v0
.end method


# virtual methods
.method public final getMaxY(Lx6/b;)F
    .locals 2

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc6/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lx6/b;->h()F

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-interface {p1}, Lx6/b;->a()F

    move-result p1

    :goto_0
    return p1
.end method

.method public final getMinY(Lx6/b;)F
    .locals 3

    const-string/jumbo v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc6/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Lx6/b;->g()F

    move-result p1

    invoke-static {p1, v2}, Lsh/m;->f(FF)F

    move-result p1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-interface {p1}, Lx6/b;->c()F

    move-result p1

    invoke-static {p1, v2}, Lsh/m;->f(FF)F

    move-result p1

    :goto_0
    return p1
.end method

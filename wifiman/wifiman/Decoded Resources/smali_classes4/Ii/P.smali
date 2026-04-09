.class public final enum LIi/P;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIi/P$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LIi/P;

.field public static final enum ATOMIC:LIi/P;

.field public static final enum DEFAULT:LIi/P;

.field public static final enum LAZY:LIi/P;

.field public static final enum UNDISPATCHED:LIi/P;


# direct methods
.method private static final synthetic $values()[LIi/P;
    .locals 4

    sget-object v0, LIi/P;->DEFAULT:LIi/P;

    sget-object v1, LIi/P;->LAZY:LIi/P;

    sget-object v2, LIi/P;->ATOMIC:LIi/P;

    sget-object v3, LIi/P;->UNDISPATCHED:LIi/P;

    filled-new-array {v0, v1, v2, v3}, [LIi/P;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LIi/P;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIi/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIi/P;->DEFAULT:LIi/P;

    new-instance v0, LIi/P;

    const-string v1, "LAZY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIi/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIi/P;->LAZY:LIi/P;

    new-instance v0, LIi/P;

    const-string v1, "ATOMIC"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LIi/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIi/P;->ATOMIC:LIi/P;

    new-instance v0, LIi/P;

    const-string v1, "UNDISPATCHED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LIi/P;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIi/P;->UNDISPATCHED:LIi/P;

    invoke-static {}, LIi/P;->$values()[LIi/P;

    move-result-object v0

    sput-object v0, LIi/P;->$VALUES:[LIi/P;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LIi/P;->$ENTRIES:Lfh/a;

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

.method public static getEntries()Lfh/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfh/a;"
        }
    .end annotation

    sget-object v0, LIi/P;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static synthetic isLazy$annotations()V
    .locals 0

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LIi/P;
    .locals 1

    const-class v0, LIi/P;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIi/P;

    return-object p0
.end method

.method public static values()[LIi/P;
    .locals 1

    sget-object v0, LIi/P;->$VALUES:[LIi/P;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIi/P;

    return-object v0
.end method


# virtual methods
.method public final invoke(Lmh/p;Ljava/lang/Object;Ldh/e;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmh/p;",
            "TR;",
            "Ldh/e<",
            "-TT;>;)V"
        }
    .end annotation

    sget-object v0, LIi/P$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-static {p1, p2, p3}, LOi/b;->a(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    goto :goto_0

    :cond_2
    invoke-static {p1, p2, p3}, Ldh/g;->b(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    goto :goto_0

    :cond_3
    invoke-static {p1, p2, p3}, LOi/a;->d(Lmh/p;Ljava/lang/Object;Ldh/e;)V

    :goto_0
    return-void
.end method

.method public final isLazy()Z
    .locals 1

    sget-object v0, LIi/P;->LAZY:LIi/P;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

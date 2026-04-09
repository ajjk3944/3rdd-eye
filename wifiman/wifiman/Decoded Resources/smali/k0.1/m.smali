.class public final enum Lk0/m;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lk0/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/m$a;
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk0/m;

.field public static final enum Active:Lk0/m;

.field public static final enum ActiveParent:Lk0/m;

.field public static final enum Captured:Lk0/m;

.field public static final enum Inactive:Lk0/m;


# direct methods
.method private static final synthetic $values()[Lk0/m;
    .locals 4

    sget-object v0, Lk0/m;->Active:Lk0/m;

    sget-object v1, Lk0/m;->ActiveParent:Lk0/m;

    sget-object v2, Lk0/m;->Captured:Lk0/m;

    sget-object v3, Lk0/m;->Inactive:Lk0/m;

    filled-new-array {v0, v1, v2, v3}, [Lk0/m;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk0/m;

    const-string v1, "Active"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/m;->Active:Lk0/m;

    new-instance v0, Lk0/m;

    const-string v1, "ActiveParent"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk0/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/m;->ActiveParent:Lk0/m;

    new-instance v0, Lk0/m;

    const-string v1, "Captured"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lk0/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/m;->Captured:Lk0/m;

    new-instance v0, Lk0/m;

    const-string v1, "Inactive"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lk0/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/m;->Inactive:Lk0/m;

    invoke-static {}, Lk0/m;->$values()[Lk0/m;

    move-result-object v0

    sput-object v0, Lk0/m;->$VALUES:[Lk0/m;

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

.method public static valueOf(Ljava/lang/String;)Lk0/m;
    .locals 1

    const-class v0, Lk0/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk0/m;

    return-object p0
.end method

.method public static values()[Lk0/m;
    .locals 1

    sget-object v0, Lk0/m;->$VALUES:[Lk0/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/m;

    return-object v0
.end method


# virtual methods
.method public getHasFocus()Z
    .locals 3

    sget-object v0, Lk0/m$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    return v1
.end method

.method public isCaptured()Z
    .locals 2

    sget-object v0, Lk0/m$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

.method public isFocused()Z
    .locals 3

    sget-object v0, Lk0/m$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :cond_2
    return v1
.end method

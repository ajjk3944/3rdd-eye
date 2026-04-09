.class public final enum LLg/l$h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LLg/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "h"
.end annotation


# static fields
.field private static final synthetic $VALUES:[LLg/l$h;

.field public static final enum Add:LLg/l$h;

.field public static final enum Noop:LLg/l$h;

.field public static final enum RegisterServiceType:LLg/l$h;

.field public static final enum Remove:LLg/l$h;

.field public static final enum Update:LLg/l$h;


# direct methods
.method private static synthetic $values()[LLg/l$h;
    .locals 5

    sget-object v0, LLg/l$h;->Remove:LLg/l$h;

    sget-object v1, LLg/l$h;->Update:LLg/l$h;

    sget-object v2, LLg/l$h;->Add:LLg/l$h;

    sget-object v3, LLg/l$h;->RegisterServiceType:LLg/l$h;

    sget-object v4, LLg/l$h;->Noop:LLg/l$h;

    filled-new-array {v0, v1, v2, v3, v4}, [LLg/l$h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LLg/l$h;

    const-string v1, "Remove"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLg/l$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/l$h;->Remove:LLg/l$h;

    new-instance v0, LLg/l$h;

    const-string v1, "Update"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LLg/l$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/l$h;->Update:LLg/l$h;

    new-instance v0, LLg/l$h;

    const-string v1, "Add"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LLg/l$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/l$h;->Add:LLg/l$h;

    new-instance v0, LLg/l$h;

    const-string v1, "RegisterServiceType"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LLg/l$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/l$h;->RegisterServiceType:LLg/l$h;

    new-instance v0, LLg/l$h;

    const-string v1, "Noop"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LLg/l$h;-><init>(Ljava/lang/String;I)V

    sput-object v0, LLg/l$h;->Noop:LLg/l$h;

    invoke-static {}, LLg/l$h;->$values()[LLg/l$h;

    move-result-object v0

    sput-object v0, LLg/l$h;->$VALUES:[LLg/l$h;

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

.method public static valueOf(Ljava/lang/String;)LLg/l$h;
    .locals 1

    const-class v0, LLg/l$h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LLg/l$h;

    return-object p0
.end method

.method public static values()[LLg/l$h;
    .locals 1

    sget-object v0, LLg/l$h;->$VALUES:[LLg/l$h;

    invoke-virtual {v0}, [LLg/l$h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LLg/l$h;

    return-object v0
.end method

.class public enum LJh/U$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJh/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJh/U$c$a;
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LJh/U$c;

.field public static final enum FALSE:LJh/U$c;

.field public static final enum INDEX:LJh/U$c;

.field public static final enum MAP_GET_OR_DEFAULT:LJh/U$c;

.field public static final enum NULL:LJh/U$c;


# instance fields
.field private final defaultValue:Ljava/lang/Object;


# direct methods
.method private static final synthetic $values()[LJh/U$c;
    .locals 4

    sget-object v0, LJh/U$c;->NULL:LJh/U$c;

    sget-object v1, LJh/U$c;->INDEX:LJh/U$c;

    sget-object v2, LJh/U$c;->FALSE:LJh/U$c;

    sget-object v3, LJh/U$c;->MAP_GET_OR_DEFAULT:LJh/U$c;

    filled-new-array {v0, v1, v2, v3}, [LJh/U$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LJh/U$c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "NULL"

    invoke-direct {v0, v3, v1, v2}, LJh/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LJh/U$c;->NULL:LJh/U$c;

    new-instance v0, LJh/U$c;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "INDEX"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, LJh/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LJh/U$c;->INDEX:LJh/U$c;

    new-instance v0, LJh/U$c;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "FALSE"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, LJh/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    sput-object v0, LJh/U$c;->FALSE:LJh/U$c;

    new-instance v0, LJh/U$c$a;

    const-string v1, "MAP_GET_OR_DEFAULT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LJh/U$c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, LJh/U$c;->MAP_GET_OR_DEFAULT:LJh/U$c;

    invoke-static {}, LJh/U$c;->$values()[LJh/U$c;

    move-result-object v0

    sput-object v0, LJh/U$c;->$VALUES:[LJh/U$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LJh/U$c;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LJh/U$c;->defaultValue:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LJh/U$c;-><init>(Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LJh/U$c;
    .locals 1

    const-class v0, LJh/U$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LJh/U$c;

    return-object p0
.end method

.method public static values()[LJh/U$c;
    .locals 1

    sget-object v0, LJh/U$c;->$VALUES:[LJh/U$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LJh/U$c;

    return-object v0
.end method

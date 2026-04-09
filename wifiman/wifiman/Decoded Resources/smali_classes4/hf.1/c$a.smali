.class public final enum Lhf/c$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhf/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lhf/c$a;

.field public static final enum DOWN:Lhf/c$a;

.field public static final enum UP:Lhf/c$a;


# instance fields
.field private final inlineContentId:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lhf/c$a;
    .locals 2

    sget-object v0, Lhf/c$a;->UP:Lhf/c$a;

    sget-object v1, Lhf/c$a;->DOWN:Lhf/c$a;

    filled-new-array {v0, v1}, [Lhf/c$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhf/c$a;

    const/4 v1, 0x0

    const-string v2, "<up>"

    const-string v3, "UP"

    invoke-direct {v0, v3, v1, v2}, Lhf/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lhf/c$a;->UP:Lhf/c$a;

    new-instance v0, Lhf/c$a;

    const/4 v1, 0x1

    const-string v2, "<down>"

    const-string v3, "DOWN"

    invoke-direct {v0, v3, v1, v2}, Lhf/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lhf/c$a;->DOWN:Lhf/c$a;

    invoke-static {}, Lhf/c$a;->$values()[Lhf/c$a;

    move-result-object v0

    sput-object v0, Lhf/c$a;->$VALUES:[Lhf/c$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lhf/c$a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lhf/c$a;->inlineContentId:Ljava/lang/String;

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

    sget-object v0, Lhf/c$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhf/c$a;
    .locals 1

    const-class v0, Lhf/c$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhf/c$a;

    return-object p0
.end method

.method public static values()[Lhf/c$a;
    .locals 1

    sget-object v0, Lhf/c$a;->$VALUES:[Lhf/c$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhf/c$a;

    return-object v0
.end method


# virtual methods
.method public final getInlineContentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhf/c$a;->inlineContentId:Ljava/lang/String;

    return-object v0
.end method

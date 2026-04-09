.class public final enum Lrd/b$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrd/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lrd/b$a$a;

.field public static final enum PHONE_ANDROID:Lrd/b$a$a;

.field public static final enum PHONE_IOS:Lrd/b$a$a;

.field public static final enum TABLET_ANDROID:Lrd/b$a$a;

.field public static final enum TABLE_IOS:Lrd/b$a$a;


# direct methods
.method private static final synthetic $values()[Lrd/b$a$a;
    .locals 4

    sget-object v0, Lrd/b$a$a;->PHONE_IOS:Lrd/b$a$a;

    sget-object v1, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    sget-object v2, Lrd/b$a$a;->TABLE_IOS:Lrd/b$a$a;

    sget-object v3, Lrd/b$a$a;->TABLET_ANDROID:Lrd/b$a$a;

    filled-new-array {v0, v1, v2, v3}, [Lrd/b$a$a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrd/b$a$a;

    const-string v1, "PHONE_IOS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrd/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd/b$a$a;->PHONE_IOS:Lrd/b$a$a;

    new-instance v0, Lrd/b$a$a;

    const-string v1, "PHONE_ANDROID"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrd/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd/b$a$a;->PHONE_ANDROID:Lrd/b$a$a;

    new-instance v0, Lrd/b$a$a;

    const-string v1, "TABLE_IOS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lrd/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd/b$a$a;->TABLE_IOS:Lrd/b$a$a;

    new-instance v0, Lrd/b$a$a;

    const-string v1, "TABLET_ANDROID"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lrd/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrd/b$a$a;->TABLET_ANDROID:Lrd/b$a$a;

    invoke-static {}, Lrd/b$a$a;->$values()[Lrd/b$a$a;

    move-result-object v0

    sput-object v0, Lrd/b$a$a;->$VALUES:[Lrd/b$a$a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lrd/b$a$a;->$ENTRIES:Lfh/a;

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

    sget-object v0, Lrd/b$a$a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrd/b$a$a;
    .locals 1

    const-class v0, Lrd/b$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrd/b$a$a;

    return-object p0
.end method

.method public static values()[Lrd/b$a$a;
    .locals 1

    sget-object v0, Lrd/b$a$a;->$VALUES:[Lrd/b$a$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrd/b$a$a;

    return-object v0
.end method

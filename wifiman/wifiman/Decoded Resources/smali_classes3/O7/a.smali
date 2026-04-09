.class public final enum LO7/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LO7/a;

.field public static final enum PACKAGE_INSTALL:LO7/a;

.field public static final enum SSO_ACCOUNT_DONE:LO7/a;

.field public static final enum VPN_PROFILE_CREATION:LO7/a;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[LO7/a;
    .locals 3

    sget-object v0, LO7/a;->VPN_PROFILE_CREATION:LO7/a;

    sget-object v1, LO7/a;->SSO_ACCOUNT_DONE:LO7/a;

    sget-object v2, LO7/a;->PACKAGE_INSTALL:LO7/a;

    filled-new-array {v0, v1, v2}, [LO7/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO7/a;

    const-string/jumbo v1, "VPN_PROFILE_CREATION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LO7/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LO7/a;->VPN_PROFILE_CREATION:LO7/a;

    new-instance v0, LO7/a;

    const-string/jumbo v1, "SSO_ACCOUNT_DONE"

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, LO7/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LO7/a;->SSO_ACCOUNT_DONE:LO7/a;

    new-instance v0, LO7/a;

    const-string/jumbo v1, "PACKAGE_INSTALL"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v3, v2}, LO7/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, LO7/a;->PACKAGE_INSTALL:LO7/a;

    invoke-static {}, LO7/a;->$values()[LO7/a;

    move-result-object v0

    sput-object v0, LO7/a;->$VALUES:[LO7/a;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LO7/a;->$ENTRIES:Lfh/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, LO7/a;->code:I

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

    sget-object v0, LO7/a;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO7/a;
    .locals 1

    const-class v0, LO7/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LO7/a;

    return-object p0
.end method

.method public static values()[LO7/a;
    .locals 1

    sget-object v0, LO7/a;->$VALUES:[LO7/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO7/a;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, LO7/a;->code:I

    return v0
.end method

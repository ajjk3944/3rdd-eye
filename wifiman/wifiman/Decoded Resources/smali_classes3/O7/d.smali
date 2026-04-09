.class public final enum LO7/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LO7/d;

.field public static final enum APP_CONFIG:LO7/d;

.field public static final enum LOCALE:LO7/d;

.field public static final enum PASSCODES:LO7/d;

.field public static final enum THEME:LO7/d;

.field public static final enum UIDB:LO7/d;

.field public static final enum WIFI_SCANNER:LO7/d;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[LO7/d;
    .locals 6

    sget-object v0, LO7/d;->APP_CONFIG:LO7/d;

    sget-object v1, LO7/d;->THEME:LO7/d;

    sget-object v2, LO7/d;->LOCALE:LO7/d;

    sget-object v3, LO7/d;->WIFI_SCANNER:LO7/d;

    sget-object v4, LO7/d;->PASSCODES:LO7/d;

    sget-object v5, LO7/d;->UIDB:LO7/d;

    filled-new-array/range {v0 .. v5}, [LO7/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LO7/d;

    const/4 v1, 0x0

    const-string/jumbo v2, "app_config"

    const-string v3, "APP_CONFIG"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->APP_CONFIG:LO7/d;

    new-instance v0, LO7/d;

    const/4 v1, 0x1

    const-string/jumbo v2, "theme"

    const-string/jumbo v3, "THEME"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->THEME:LO7/d;

    new-instance v0, LO7/d;

    const/4 v1, 0x2

    const-string/jumbo v2, "locale"

    const-string/jumbo v3, "LOCALE"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->LOCALE:LO7/d;

    new-instance v0, LO7/d;

    const/4 v1, 0x3

    const-string/jumbo v2, "wifi_scan"

    const-string/jumbo v3, "WIFI_SCANNER"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->WIFI_SCANNER:LO7/d;

    new-instance v0, LO7/d;

    const/4 v1, 0x4

    const-string/jumbo v2, "pass"

    const-string/jumbo v3, "PASSCODES"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->PASSCODES:LO7/d;

    new-instance v0, LO7/d;

    const/4 v1, 0x5

    const-string/jumbo v2, "uidb"

    const-string/jumbo v3, "UIDB"

    invoke-direct {v0, v3, v1, v2}, LO7/d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LO7/d;->UIDB:LO7/d;

    invoke-static {}, LO7/d;->$values()[LO7/d;

    move-result-object v0

    sput-object v0, LO7/d;->$VALUES:[LO7/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LO7/d;->$ENTRIES:Lfh/a;

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

    iput-object p3, p0, LO7/d;->id:Ljava/lang/String;

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

    sget-object v0, LO7/d;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LO7/d;
    .locals 1

    const-class v0, LO7/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LO7/d;

    return-object p0
.end method

.method public static values()[LO7/d;
    .locals 1

    sget-object v0, LO7/d;->$VALUES:[LO7/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LO7/d;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LO7/d;->id:Ljava/lang/String;

    return-object v0
.end method

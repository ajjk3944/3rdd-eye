.class public final enum LIh/d;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LIh/b;


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[LIh/d;

.field public static final enum FOR_ALREADY_TRACKED:LIh/d;

.field public static final enum FOR_DEFAULT_IMPORTS:LIh/d;

.field public static final enum FOR_NON_TRACKED_SCOPE:LIh/d;

.field public static final enum FOR_SCRIPT:LIh/d;

.field public static final enum FROM_BACKEND:LIh/d;

.field public static final enum FROM_BUILTINS:LIh/d;

.field public static final enum FROM_DESERIALIZATION:LIh/d;

.field public static final enum FROM_IDE:LIh/d;

.field public static final enum FROM_JAVA_LOADER:LIh/d;

.field public static final enum FROM_REFLECTION:LIh/d;

.field public static final enum FROM_SYNTHETIC_SCOPE:LIh/d;

.field public static final enum FROM_TEST:LIh/d;

.field public static final enum WHEN_CHECK_DECLARATION_CONFLICTS:LIh/d;

.field public static final enum WHEN_CHECK_OVERRIDES:LIh/d;

.field public static final enum WHEN_FIND_BY_FQNAME:LIh/d;

.field public static final enum WHEN_GET_ALL_DESCRIPTORS:LIh/d;

.field public static final enum WHEN_GET_COMPANION_OBJECT:LIh/d;

.field public static final enum WHEN_GET_DECLARATION_SCOPE:LIh/d;

.field public static final enum WHEN_GET_LOCAL_VARIABLE:LIh/d;

.field public static final enum WHEN_GET_SUPER_MEMBERS:LIh/d;

.field public static final enum WHEN_RESOLVE_DECLARATION:LIh/d;

.field public static final enum WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS:LIh/d;

.field public static final enum WHEN_TYPING:LIh/d;


# direct methods
.method private static final synthetic $values()[LIh/d;
    .locals 23

    sget-object v0, LIh/d;->FROM_IDE:LIh/d;

    sget-object v1, LIh/d;->FROM_BACKEND:LIh/d;

    sget-object v2, LIh/d;->FROM_TEST:LIh/d;

    sget-object v3, LIh/d;->FROM_BUILTINS:LIh/d;

    sget-object v4, LIh/d;->WHEN_CHECK_DECLARATION_CONFLICTS:LIh/d;

    sget-object v5, LIh/d;->WHEN_CHECK_OVERRIDES:LIh/d;

    sget-object v6, LIh/d;->FOR_SCRIPT:LIh/d;

    sget-object v7, LIh/d;->FROM_REFLECTION:LIh/d;

    sget-object v8, LIh/d;->WHEN_RESOLVE_DECLARATION:LIh/d;

    sget-object v9, LIh/d;->WHEN_GET_DECLARATION_SCOPE:LIh/d;

    sget-object v10, LIh/d;->WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS:LIh/d;

    sget-object v11, LIh/d;->FOR_ALREADY_TRACKED:LIh/d;

    sget-object v12, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    sget-object v13, LIh/d;->WHEN_TYPING:LIh/d;

    sget-object v14, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    sget-object v15, LIh/d;->FOR_NON_TRACKED_SCOPE:LIh/d;

    sget-object v16, LIh/d;->FROM_SYNTHETIC_SCOPE:LIh/d;

    sget-object v17, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    sget-object v18, LIh/d;->FROM_JAVA_LOADER:LIh/d;

    sget-object v19, LIh/d;->WHEN_GET_LOCAL_VARIABLE:LIh/d;

    sget-object v20, LIh/d;->WHEN_FIND_BY_FQNAME:LIh/d;

    sget-object v21, LIh/d;->WHEN_GET_COMPANION_OBJECT:LIh/d;

    sget-object v22, LIh/d;->FOR_DEFAULT_IMPORTS:LIh/d;

    filled-new-array/range {v0 .. v22}, [LIh/d;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LIh/d;

    const-string v1, "FROM_IDE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_IDE:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_BACKEND"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_BACKEND:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_TEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_TEST:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_BUILTINS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_BUILTINS:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_CHECK_DECLARATION_CONFLICTS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_CHECK_DECLARATION_CONFLICTS:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_CHECK_OVERRIDES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_CHECK_OVERRIDES:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FOR_SCRIPT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FOR_SCRIPT:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_REFLECTION"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_REFLECTION:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_RESOLVE_DECLARATION"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_RESOLVE_DECLARATION:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_GET_DECLARATION_SCOPE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_GET_DECLARATION_SCOPE:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FOR_ALREADY_TRACKED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FOR_ALREADY_TRACKED:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_GET_ALL_DESCRIPTORS"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_GET_ALL_DESCRIPTORS:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_TYPING"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_TYPING:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_GET_SUPER_MEMBERS"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_GET_SUPER_MEMBERS:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FOR_NON_TRACKED_SCOPE"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FOR_NON_TRACKED_SCOPE:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_SYNTHETIC_SCOPE"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_SYNTHETIC_SCOPE:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_DESERIALIZATION"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_DESERIALIZATION:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FROM_JAVA_LOADER"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FROM_JAVA_LOADER:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_GET_LOCAL_VARIABLE"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_GET_LOCAL_VARIABLE:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_FIND_BY_FQNAME"

    const/16 v2, 0x14

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_FIND_BY_FQNAME:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "WHEN_GET_COMPANION_OBJECT"

    const/16 v2, 0x15

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->WHEN_GET_COMPANION_OBJECT:LIh/d;

    new-instance v0, LIh/d;

    const-string v1, "FOR_DEFAULT_IMPORTS"

    const/16 v2, 0x16

    invoke-direct {v0, v1, v2}, LIh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, LIh/d;->FOR_DEFAULT_IMPORTS:LIh/d;

    invoke-static {}, LIh/d;->$values()[LIh/d;

    move-result-object v0

    sput-object v0, LIh/d;->$VALUES:[LIh/d;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, LIh/d;->$ENTRIES:Lfh/a;

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

.method public static valueOf(Ljava/lang/String;)LIh/d;
    .locals 1

    const-class v0, LIh/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LIh/d;

    return-object p0
.end method

.method public static values()[LIh/d;
    .locals 1

    sget-object v0, LIh/d;->$VALUES:[LIh/d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LIh/d;

    return-object v0
.end method


# virtual methods
.method public getLocation()LIh/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

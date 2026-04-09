.class public final enum Ltb/N$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Ltb/N$c;

.field public static final enum CONNECTED:Ltb/N$c;

.field public static final enum CREATE_OFFER:Ltb/N$c;

.field public static final enum ICE_GATHERING_COMPLETE:Ltb/N$c;

.field public static final enum NONE:Ltb/N$c;

.field public static final enum REQUESTING_SDP_ANSWER:Ltb/N$c;

.field public static final enum SET_LOCAL_SDP:Ltb/N$c;

.field public static final enum SET_LOCAL_SDP_SUCCESS:Ltb/N$c;

.field public static final enum SET_REMOTE_SDP:Ltb/N$c;

.field public static final enum SET_REMOTE_SDP_SUCCESS:Ltb/N$c;


# direct methods
.method private static final synthetic $values()[Ltb/N$c;
    .locals 9

    sget-object v0, Ltb/N$c;->NONE:Ltb/N$c;

    sget-object v1, Ltb/N$c;->CREATE_OFFER:Ltb/N$c;

    sget-object v2, Ltb/N$c;->SET_LOCAL_SDP:Ltb/N$c;

    sget-object v3, Ltb/N$c;->SET_LOCAL_SDP_SUCCESS:Ltb/N$c;

    sget-object v4, Ltb/N$c;->ICE_GATHERING_COMPLETE:Ltb/N$c;

    sget-object v5, Ltb/N$c;->REQUESTING_SDP_ANSWER:Ltb/N$c;

    sget-object v6, Ltb/N$c;->SET_REMOTE_SDP:Ltb/N$c;

    sget-object v7, Ltb/N$c;->SET_REMOTE_SDP_SUCCESS:Ltb/N$c;

    sget-object v8, Ltb/N$c;->CONNECTED:Ltb/N$c;

    filled-new-array/range {v0 .. v8}, [Ltb/N$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->NONE:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string v1, "CREATE_OFFER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->CREATE_OFFER:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "SET_LOCAL_SDP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->SET_LOCAL_SDP:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "SET_LOCAL_SDP_SUCCESS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->SET_LOCAL_SDP_SUCCESS:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "ICE_GATHERING_COMPLETE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->ICE_GATHERING_COMPLETE:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "REQUESTING_SDP_ANSWER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->REQUESTING_SDP_ANSWER:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "SET_REMOTE_SDP"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->SET_REMOTE_SDP:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string/jumbo v1, "SET_REMOTE_SDP_SUCCESS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->SET_REMOTE_SDP_SUCCESS:Ltb/N$c;

    new-instance v0, Ltb/N$c;

    const-string v1, "CONNECTED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ltb/N$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltb/N$c;->CONNECTED:Ltb/N$c;

    invoke-static {}, Ltb/N$c;->$values()[Ltb/N$c;

    move-result-object v0

    sput-object v0, Ltb/N$c;->$VALUES:[Ltb/N$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Ltb/N$c;->$ENTRIES:Lfh/a;

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

    sget-object v0, Ltb/N$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltb/N$c;
    .locals 1

    const-class v0, Ltb/N$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltb/N$c;

    return-object p0
.end method

.method public static values()[Ltb/N$c;
    .locals 1

    sget-object v0, Ltb/N$c;->$VALUES:[Ltb/N$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltb/N$c;

    return-object v0
.end method

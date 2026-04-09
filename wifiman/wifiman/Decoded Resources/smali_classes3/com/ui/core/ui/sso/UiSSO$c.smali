.class public final enum Lcom/ui/core/ui/sso/UiSSO$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/core/ui/sso/UiSSO;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lfh/a;

.field private static final synthetic $VALUES:[Lcom/ui/core/ui/sso/UiSSO$c;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/ui/core/ui/sso/UiSSO$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum LOGIN:Lcom/ui/core/ui/sso/UiSSO$c;

.field public static final enum REGISTER:Lcom/ui/core/ui/sso/UiSSO$c;


# direct methods
.method private static final synthetic $values()[Lcom/ui/core/ui/sso/UiSSO$c;
    .locals 2

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->REGISTER:Lcom/ui/core/ui/sso/UiSSO$c;

    sget-object v1, Lcom/ui/core/ui/sso/UiSSO$c;->LOGIN:Lcom/ui/core/ui/sso/UiSSO$c;

    filled-new-array {v0, v1}, [Lcom/ui/core/ui/sso/UiSSO$c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$c;

    const-string/jumbo v1, "REGISTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ui/core/ui/sso/UiSSO$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->REGISTER:Lcom/ui/core/ui/sso/UiSSO$c;

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$c;

    const-string/jumbo v1, "LOGIN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/ui/core/ui/sso/UiSSO$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->LOGIN:Lcom/ui/core/ui/sso/UiSSO$c;

    invoke-static {}, Lcom/ui/core/ui/sso/UiSSO$c;->$values()[Lcom/ui/core/ui/sso/UiSSO$c;

    move-result-object v0

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->$VALUES:[Lcom/ui/core/ui/sso/UiSSO$c;

    invoke-static {v0}, Lfh/b;->a([Ljava/lang/Enum;)Lfh/a;

    move-result-object v0

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->$ENTRIES:Lfh/a;

    new-instance v0, Lcom/ui/core/ui/sso/UiSSO$c$a;

    invoke-direct {v0}, Lcom/ui/core/ui/sso/UiSSO$c$a;-><init>()V

    sput-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->CREATOR:Landroid/os/Parcelable$Creator;

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

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->$ENTRIES:Lfh/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ui/core/ui/sso/UiSSO$c;
    .locals 1

    const-class v0, Lcom/ui/core/ui/sso/UiSSO$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ui/core/ui/sso/UiSSO$c;

    return-object p0
.end method

.method public static values()[Lcom/ui/core/ui/sso/UiSSO$c;
    .locals 1

    sget-object v0, Lcom/ui/core/ui/sso/UiSSO$c;->$VALUES:[Lcom/ui/core/ui/sso/UiSSO$c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ui/core/ui/sso/UiSSO$c;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string/jumbo p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

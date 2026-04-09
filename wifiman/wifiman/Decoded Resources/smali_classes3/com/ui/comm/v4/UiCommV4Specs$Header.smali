.class public abstract Lcom/ui/comm/v4/UiCommV4Specs$Header;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Cmd;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$CmdResponse;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$a;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Error;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Event;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpResponse;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Log;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Request;,
        Lcom/ui/comm/v4/UiCommV4Specs$Header$Response;
    }
.end annotation


# static fields
.field public static final a:Lcom/ui/comm/v4/UiCommV4Specs$Header$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/comm/v4/UiCommV4Specs$Header$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/comm/v4/UiCommV4Specs$Header$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/comm/v4/UiCommV4Specs$Header;->a:Lcom/ui/comm/v4/UiCommV4Specs$Header$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/ui/comm/v4/UiCommV4Specs$Header;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
.end method

.method public abstract b()Lg9/c;
.end method

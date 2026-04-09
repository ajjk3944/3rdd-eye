.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;
.super Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final h:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;

.field private static final i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;

    invoke-direct {v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;->h:Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;

    const/4 v0, 0x1

    sput-boolean v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;->i:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    sget-boolean v0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$c;->i:Z

    return v0
.end method

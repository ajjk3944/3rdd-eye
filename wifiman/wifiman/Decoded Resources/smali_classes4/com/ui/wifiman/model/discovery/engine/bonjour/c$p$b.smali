.class public final Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;
.super Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v0, "_ipp._tcp"

    iput-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/discovery/engine/bonjour/c$p$b;->a:Ljava/lang/String;

    return-object v0
.end method

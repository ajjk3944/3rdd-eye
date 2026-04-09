.class final LH8/l$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH8/l;->s0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LH8/l$j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LH8/l$j;

    invoke-direct {v0}, LH8/l$j;-><init>()V

    sput-object v0, LH8/l$j;->a:LH8/l$j;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;->a()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;

    invoke-virtual {p0, p1}, LH8/l$j;->a(Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationProcessor;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

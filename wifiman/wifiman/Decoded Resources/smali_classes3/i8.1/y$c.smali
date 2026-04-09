.class final Li8/y$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/y;->m(Landroid/net/Uri;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Li8/y$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/y$c;

    invoke-direct {v0}, Li8/y$c;-><init>()V

    sput-object v0, Li8/y$c;->a:Li8/y$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)Lgg/r;
    .locals 1

    const-string/jumbo v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/ui/wifiman/model/teleport/invitation/TeleportInvitationService$Error$InvitationNotValid;

    if-eqz v0, :cond_0

    invoke-static {}, Lgg/n;->h()Lgg/n;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lgg/n;->i(Ljava/lang/Throwable;)Lgg/n;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Li8/y$c;->a(Ljava/lang/Throwable;)Lgg/r;

    move-result-object p1

    return-object p1
.end method

.class final Lbe/i$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbe/i;-><init>(LZc/f;Lbe/c$a;LP7/a;Lcom/ui/wifiman/model/teleport/TeleportConnection;LFd/D;Lcom/ui/wifiman/model/support/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lbe/i$l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbe/i$l;

    invoke-direct {v0}, Lbe/i$l;-><init>()V

    sput-object v0, Lbe/i$l;->a:Lbe/i$l;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/b;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lbe/i$l;->a(LWc/b;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

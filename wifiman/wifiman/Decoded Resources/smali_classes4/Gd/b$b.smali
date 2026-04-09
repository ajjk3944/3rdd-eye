.class final LGd/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGd/b;->a(Landroid/content/Context;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LGd/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGd/b$b;

    invoke-direct {v0}, LGd/b$b;-><init>()V

    sput-object v0, LGd/b$b;->a:LGd/b$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a$b;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/teleport/TeleportConnection$a;

    invoke-virtual {p0, p1}, LGd/b$b;->a(Lcom/ui/wifiman/model/teleport/TeleportConnection$a;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

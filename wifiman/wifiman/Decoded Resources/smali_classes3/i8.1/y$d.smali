.class final Li8/y$d;
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
.field public static final a:Li8/y$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li8/y$d;

    invoke-direct {v0}, Li8/y$d;-><init>()V

    sput-object v0, Li8/y$d;->a:Li8/y$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)Li8/s;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li8/s$g;

    invoke-virtual {p1}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Li8/s$g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;

    invoke-virtual {p0, p1}, Li8/y$d;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;)Li8/s;

    move-result-object p1

    return-object p1
.end method

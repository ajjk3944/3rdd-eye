.class final LJ7/F$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/F;->e(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$b;Ljava/lang/String;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LJ7/F$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ7/F$f;

    invoke-direct {v0}, LJ7/F$f;-><init>()V

    sput-object v0, LJ7/F$f;->a:LJ7/F$f;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V
    .locals 1

    new-instance v0, LJ7/F$f$a;

    invoke-direct {v0, p1}, LJ7/F$f$a;-><init>(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V

    invoke-static {v0}, LN7/a;->b(Lmh/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;

    invoke-virtual {p0, p1}, LJ7/F$f;->a(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

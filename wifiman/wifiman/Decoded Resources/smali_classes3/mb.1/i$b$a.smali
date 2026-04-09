.class final synthetic Lmb/i$b$a;
.super Lkotlin/jvm/internal/p;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmb/i$b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lmb/i$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmb/i$b$a;

    invoke-direct {v0}, Lmb/i$b$a;-><init>()V

    sput-object v0, Lmb/i$b$a;->a:Lmb/i$b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 6

    const-string/jumbo v4, "values()[Lcom/ui/unifi/core/base/net/models/devices/ControllerState;"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Lmb/i;

    const-string/jumbo v3, "values"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a()[Lmb/i;
    .locals 1

    invoke-static {}, Lmb/i;->values()[Lmb/i;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmb/i$b$a;->a()[Lmb/i;

    move-result-object v0

    return-object v0
.end method

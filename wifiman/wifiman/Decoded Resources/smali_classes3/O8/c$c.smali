.class final LO8/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO8/c;-><init>(Lcom/ui/wifiman/model/wmw/WifimanWizard;Lhc/b;LP8/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LO8/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LO8/c$c;

    invoke-direct {v0}, LO8/c$c;-><init>()V

    sput-object v0, LO8/c$c;->a:LO8/c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LYg/s;
    .locals 1

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-static {p1, p2}, LYg/z;->a(Ljava/lang/Object;Ljava/lang/Object;)LYg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    check-cast p2, Lcom/ui/wifiman/model/wmw/WifimanWizard$a;

    invoke-virtual {p0, p1, p2}, LO8/c$c;->a(LYg/s;Lcom/ui/wifiman/model/wmw/WifimanWizard$a;)LYg/s;

    move-result-object p1

    return-object p1
.end method

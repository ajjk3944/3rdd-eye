.class final Lcom/ui/wifiman/model/wmw/j$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/wmw/j;->x(Lh9/a;Lh9/a;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/wmw/j$m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/wmw/j$m;

    invoke-direct {v0}, Lcom/ui/wifiman/model/wmw/j$m;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/wmw/j$m;->a:Lcom/ui/wifiman/model/wmw/j$m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/WMWizard$a;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/ui/wmw/WMWizard$a;->a()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/WMWizard$a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/wmw/j$m;->a(Lcom/ui/wmw/WMWizard$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.class final Lse/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse/b;-><init>(LWd/f;Lcom/ubnt/usurvey/a$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lse/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lse/b$a;

    invoke-direct {v0}, Lse/b$a;-><init>()V

    sput-object v0, Lse/b$a;->a:Lse/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/s;)Lgg/D;
    .locals 2

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LYg/s;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;

    invoke-virtual {p1}, LYg/s;->c()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "component2(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;->INTERNAL:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;->PROD:Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;

    :goto_0
    const-string v1, "WiFiMan-Wizard"

    invoke-interface {v0, p1, v1}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/a$a;Ljava/lang/String;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/s;

    invoke-virtual {p0, p1}, Lse/b$a;->a(LYg/s;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

.class final Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/firmware/b;->b(Ljava/lang/String;Ljava/lang/String;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;->a:Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;)Lgg/D;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;->a()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lgg/z;->z(Ljava/lang/Object;)Lgg/z;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;

    const-string v0, "Missing token in response"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2, v1, v2}, Lcom/ui/wifiman/model/ubiquiti/firmware/UbiquitiFirmwareClient$Error$InvalidResponse;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/firmware/b$g;->a(Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenResponse;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

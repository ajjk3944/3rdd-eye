.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c;->a(Lcom/ui/sso/api/UiAccountApi;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/sso/api/UiAccountApi;


# direct methods
.method constructor <init>(Lcom/ui/sso/api/UiAccountApi;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;->a:Lcom/ui/sso/api/UiAccountApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;)Lcom/ui/sso/api/UiAccountApi;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;->a:Lcom/ui/sso/api/UiAccountApi;

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/UUID;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$c$b;->a(Ljava/util/UUID;)Lcom/ui/sso/api/UiAccountApi;

    move-result-object p1

    return-object p1
.end method

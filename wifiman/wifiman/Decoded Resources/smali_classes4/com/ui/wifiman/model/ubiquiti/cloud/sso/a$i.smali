.class final Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a;->invalidate()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;-><init>()V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Lgg/f;
    .locals 1

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;->f()Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$i;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/sso/a$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

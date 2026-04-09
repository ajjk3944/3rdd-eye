.class public final synthetic LQd/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/security/cert/Certificate;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiConsoleConnectionError$a;->a(Ljava/security/cert/Certificate;)Ljava/security/cert/X509Certificate;

    move-result-object p1

    return-object p1
.end method

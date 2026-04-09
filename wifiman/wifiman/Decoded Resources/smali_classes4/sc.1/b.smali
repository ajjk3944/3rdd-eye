.class public final synthetic Lsc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/android/secure/a;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/android/secure/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc/b;->a:Lcom/ui/wifiman/model/android/secure/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lsc/b;->a:Lcom/ui/wifiman/model/android/secure/a;

    invoke-static {v0}, Lcom/ui/wifiman/model/android/secure/a;->b(Lcom/ui/wifiman/model/android/secure/a;)Landroidx/security/crypto/b;

    move-result-object v0

    return-object v0
.end method

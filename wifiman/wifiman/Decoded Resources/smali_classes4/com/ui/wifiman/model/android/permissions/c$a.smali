.class final Lcom/ui/wifiman/model/android/permissions/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/android/permissions/c;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/android/permissions/c;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/android/permissions/c;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c$a;->a:Lcom/ui/wifiman/model/android/permissions/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LYg/J;)Ljava/util/Set;
    .locals 0

    iget-object p1, p0, Lcom/ui/wifiman/model/android/permissions/c$a;->a:Lcom/ui/wifiman/model/android/permissions/c;

    invoke-static {p1}, Lcom/ui/wifiman/model/android/permissions/c;->g(Lcom/ui/wifiman/model/android/permissions/c;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYg/J;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/android/permissions/c$a;->a(LYg/J;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

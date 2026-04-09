.class final Lcom/ui/wifiman/model/android/secure/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/android/secure/a;->a(Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)Lgg/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/android/secure/a;

.field final synthetic b:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/android/secure/a;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/android/secure/a$c;->a:Lcom/ui/wifiman/model/android/secure/a;

    iput-object p2, p0, Lcom/ui/wifiman/model/android/secure/a$c;->b:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/SharedPreferences;)Lgg/D;
    .locals 3

    const-string v0, "pref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ui/wifiman/model/android/secure/a$c;->a:Lcom/ui/wifiman/model/android/secure/a;

    iget-object v1, p0, Lcom/ui/wifiman/model/android/secure/a$c;->b:Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;

    new-instance v2, Lcom/ui/wifiman/model/android/secure/a$c$a;

    invoke-direct {v2, v0, p1, v1}, Lcom/ui/wifiman/model/android/secure/a$c$a;-><init>(Lcom/ui/wifiman/model/android/secure/a;Landroid/content/SharedPreferences;Lcom/ui/wifiman/model/android/secure/AndroidPassphraseManager$a;)V

    invoke-static {v2}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/content/SharedPreferences;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/android/secure/a$c;->a(Landroid/content/SharedPreferences;)Lgg/D;

    move-result-object p1

    return-object p1
.end method

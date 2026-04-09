.class public LS4/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/firebase/crashlytics/internal/common/F;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/F;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS4/h;->a:Lcom/google/firebase/crashlytics/internal/common/F;

    return-void
.end method

.method private static a(I)LS4/i;
    .locals 3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    invoke-static {}, LI4/g;->f()LI4/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not determine SettingsJsonTransform for settings version "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ". Using default settings values."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LI4/g;->d(Ljava/lang/String;)V

    new-instance p0, LS4/b;

    invoke-direct {p0}, LS4/b;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, LS4/m;

    invoke-direct {p0}, LS4/m;-><init>()V

    return-object p0
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)LS4/d;
    .locals 2

    const-string/jumbo v0, "settings_version"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, LS4/h;->a(I)LS4/i;

    move-result-object v0

    iget-object v1, p0, LS4/h;->a:Lcom/google/firebase/crashlytics/internal/common/F;

    invoke-interface {v0, v1, p1}, LS4/i;->a(Lcom/google/firebase/crashlytics/internal/common/F;Lorg/json/JSONObject;)LS4/d;

    move-result-object p1

    return-object p1
.end method

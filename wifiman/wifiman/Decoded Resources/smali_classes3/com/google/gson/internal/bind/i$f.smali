.class Lcom/google/gson/internal/bind/i$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "f"
.end annotation


# static fields
.field public static final c:Lcom/google/gson/internal/bind/i$f;


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/gson/internal/bind/i$f;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/gson/internal/bind/i$f;-><init>(Ljava/util/Map;Ljava/util/List;)V

    sput-object v0, Lcom/google/gson/internal/bind/i$f;->c:Lcom/google/gson/internal/bind/i$f;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$f;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/gson/internal/bind/i$f;->b:Ljava/util/List;

    return-void
.end method

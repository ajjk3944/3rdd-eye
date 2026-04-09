.class abstract Lcom/google/gson/internal/bind/i$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/bind/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "d"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/reflect/Field;

.field final c:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/gson/internal/bind/i$d;->b:Ljava/lang/reflect/Field;

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/gson/internal/bind/i$d;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method abstract a(Lw5/a;I[Ljava/lang/Object;)V
.end method

.method abstract b(Lw5/a;Ljava/lang/Object;)V
.end method

.method abstract c(Lw5/c;Ljava/lang/Object;)V
.end method

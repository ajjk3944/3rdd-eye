.class Lt5/c$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt5/c;->b(Lcom/google/gson/reflect/a;)Lt5/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lt5/c;


# direct methods
.method constructor <init>(Lt5/c;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lt5/c$m;->b:Lt5/c;

    iput-object p2, p0, Lt5/c$m;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lcom/google/gson/JsonIOException;

    iget-object v1, p0, Lt5/c$m;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/google/gson/JsonIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

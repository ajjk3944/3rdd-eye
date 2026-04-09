.class public final LA/C$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/util/Map;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LA/C$a;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    iget v0, p0, LA/C$a;->b:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, LA/C$a;->a:I

    return v0
.end method

.method public p()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LA/C$a;->c:Ljava/util/Map;

    return-object v0
.end method

.method public q()V
    .locals 0

    return-void
.end method

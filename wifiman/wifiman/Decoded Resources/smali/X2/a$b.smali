.class LX2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX2/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX2/a;->f(I)LE1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public bridge synthetic create()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX2/a$b;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

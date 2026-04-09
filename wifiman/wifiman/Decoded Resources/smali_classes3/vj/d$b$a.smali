.class final synthetic Lvj/d$b$a;
.super Lkotlin/jvm/internal/D;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvj/d$b;->b(Lorg/kodein/di/DI$e;I)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-string/jumbo v4, "getBindFullDescription()Ljava/lang/String;"

    const/4 v5, 0x0

    const-class v2, Lorg/kodein/di/DI$e;

    const-string/jumbo v3, "bindFullDescription"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/D;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/f;->receiver:Ljava/lang/Object;

    check-cast v0, Lorg/kodein/di/DI$e;

    invoke-virtual {v0}, Lorg/kodein/di/DI$e;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

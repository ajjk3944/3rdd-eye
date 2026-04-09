.class final Ltd/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd/c;->h(Ljava/lang/Object;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ltd/c;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(Ltd/c;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, Ltd/c$c;->a:Ltd/c;

    iput-object p2, p0, Ltd/c$c;->b:Lkotlin/jvm/internal/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updating internal state - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ltd/c$c;->a:Ltd/c;

    invoke-virtual {v1}, Ltd/c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LZ7/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ltd/c$c;->b:Lkotlin/jvm/internal/N;

    iput-object p1, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    return-void
.end method

.class LDh/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDh/h$b;->a()Lpi/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/h$b;


# direct methods
.method constructor <init>(LDh/h$b;)V
    .locals 0

    iput-object p1, p0, LDh/h$b$a;->a:LDh/h$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lii/k;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope for type parameter "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LDh/h$b$a;->a:LDh/h$b;

    iget-object v1, v1, LDh/h$b;->a:LZh/f;

    invoke-virtual {v1}, LZh/f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LDh/h$b$a;->a:LDh/h$b;

    iget-object v1, v1, LDh/h$b;->b:LDh/h;

    invoke-virtual {v1}, LDh/h;->getUpperBounds()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lii/x;->m(Ljava/lang/String;Ljava/util/Collection;)Lii/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDh/h$b$a;->a()Lii/k;

    move-result-object v0

    return-object v0
.end method

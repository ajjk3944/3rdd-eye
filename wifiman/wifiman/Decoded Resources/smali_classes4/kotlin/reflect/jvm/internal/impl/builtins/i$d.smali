.class Lkotlin/reflect/jvm/internal/impl/builtins/i$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/reflect/jvm/internal/impl/builtins/i;->E0(LDh/F;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LDh/F;

.field final synthetic b:Lkotlin/reflect/jvm/internal/impl/builtins/i;


# direct methods
.method constructor <init>(Lkotlin/reflect/jvm/internal/impl/builtins/i;LDh/F;)V
    .locals 0

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->b:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->a:LDh/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->b:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c(Lkotlin/reflect/jvm/internal/impl/builtins/i;)LDh/F;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->b:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->a:LDh/F;

    invoke-static {v0, v1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->d(Lkotlin/reflect/jvm/internal/impl/builtins/i;LDh/F;)LDh/F;

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Built-ins module is already set: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->b:Lkotlin/reflect/jvm/internal/impl/builtins/i;

    invoke-static {v2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->c(Lkotlin/reflect/jvm/internal/impl/builtins/i;)LDh/F;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " (attempting to reset to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->a:LDh/F;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/builtins/i$d;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

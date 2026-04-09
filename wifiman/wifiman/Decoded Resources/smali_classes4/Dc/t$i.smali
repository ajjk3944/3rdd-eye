.class final LDc/t$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/t;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LDc/t;


# direct methods
.method constructor <init>(LDc/t;)V
    .locals 0

    iput-object p1, p0, LDc/t$i;->a:LDc/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LDc/t$i;->a:LDc/t;

    invoke-virtual {v0}, LDc/t;->i()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Error"

    invoke-static {v1, p1, v0}, LZ7/b;->c(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LDc/t$i;->a(Ljava/lang/Throwable;)V

    return-void
.end method

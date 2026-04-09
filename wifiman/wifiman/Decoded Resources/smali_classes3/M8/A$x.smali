.class final LM8/A$x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A;->D0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/A;


# direct methods
.method constructor <init>(LM8/A;)V
    .locals 0

    iput-object p1, p0, LM8/A$x;->a:LM8/A;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lle/f;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/A$x;->a:LM8/A;

    invoke-static {v0, p1}, LM8/A;->R0(LM8/A;Lle/f;)Lgg/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lle/f;

    invoke-virtual {p0, p1}, LM8/A$x;->a(Lle/f;)Lgg/f;

    move-result-object p1

    return-object p1
.end method

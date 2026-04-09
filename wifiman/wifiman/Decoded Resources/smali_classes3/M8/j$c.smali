.class final LM8/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/j;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/j;


# direct methods
.method constructor <init>(LM8/j;)V
    .locals 0

    iput-object p1, p0, LM8/j$c;->a:LM8/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lic/a;)LCi/c;
    .locals 1

    const-string/jumbo v0, "selected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/j$c;->a:LM8/j;

    invoke-static {v0, p1}, LM8/j;->q0(LM8/j;Lic/a;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lic/a;

    invoke-virtual {p0, p1}, LM8/j$c;->a(Lic/a;)LCi/c;

    move-result-object p1

    return-object p1
.end method

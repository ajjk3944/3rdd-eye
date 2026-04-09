.class final LM8/v$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/v;-><init>(Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM8/v;


# direct methods
.method constructor <init>(LM8/v;)V
    .locals 0

    iput-object p1, p0, LM8/v$c;->a:LM8/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lic/d;)LCi/c;
    .locals 1

    const-string/jumbo v0, "selected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM8/v$c;->a:LM8/v;

    invoke-static {v0, p1}, LM8/v;->q0(LM8/v;Lic/d;)LCi/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lic/d;

    invoke-virtual {p0, p1}, LM8/v$c;->a(Lic/d;)LCi/c;

    move-result-object p1

    return-object p1
.end method

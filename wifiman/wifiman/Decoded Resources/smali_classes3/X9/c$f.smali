.class final LX9/c$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/c;->i1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LX9/c;


# direct methods
.method constructor <init>(LX9/c;)V
    .locals 0

    iput-object p1, p0, LX9/c$f;->a:LX9/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lhg/c;)V
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LX9/c$f;->a:LX9/c;

    sget-object v0, LW9/e$a;->SUBMITTING:LW9/e$a;

    invoke-static {p1, v0}, LX9/c;->R0(LX9/c;LW9/e$a;)V

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lhg/c;

    invoke-virtual {p0, p1}, LX9/c$f;->a(Lhg/c;)V

    return-void
.end method

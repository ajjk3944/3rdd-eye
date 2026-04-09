.class public final synthetic Lda/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lcom/ui/core/ui/sso/SSOAccountVM;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/core/ui/sso/SSOAccountVM;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lda/i;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lda/i;->a:Lcom/ui/core/ui/sso/SSOAccountVM;

    check-cast p1, LT/L;

    invoke-static {v0, p1}, Lda/f$a$b$a$b;->a(Lcom/ui/core/ui/sso/SSOAccountVM;LT/L;)LT/K;

    move-result-object p1

    return-object p1
.end method

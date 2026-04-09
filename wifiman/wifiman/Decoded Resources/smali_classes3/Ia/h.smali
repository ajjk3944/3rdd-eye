.class public final synthetic LIa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lspeedtest/ChangedCallback;


# instance fields
.field public final synthetic a:Lspeedtest/InternetServersEvaluation;

.field public final synthetic b:LKi/t;


# direct methods
.method public synthetic constructor <init>(Lspeedtest/InternetServersEvaluation;LKi/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIa/h;->a:Lspeedtest/InternetServersEvaluation;

    iput-object p2, p0, LIa/h;->b:LKi/t;

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 2

    iget-object v0, p0, LIa/h;->a:Lspeedtest/InternetServersEvaluation;

    iget-object v1, p0, LIa/h;->b:LKi/t;

    invoke-static {v0, v1}, LIa/i$a;->n(Lspeedtest/InternetServersEvaluation;LKi/t;)V

    return-void
.end method

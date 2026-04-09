.class public final Lcom/ui/wmw/api/v1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# instance fields
.field final synthetic a:Lcom/ui/comm/v4/a$f;


# direct methods
.method public constructor <init>(Lcom/ui/comm/v4/a$f;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/api/v1/o;->a:Lcom/ui/comm/v4/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Lcom/ui/comm/v4/a$g;
    .locals 6

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le9/a;

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    instance-of v2, p1, Lcom/ui/comm/v4/a$g;

    if-eqz v2, :cond_1

    check-cast p1, Lcom/ui/comm/v4/a$g;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->g()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_0

    return-object p1

    :cond_0
    new-instance v2, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;

    iget-object v3, p0, Lcom/ui/wmw/api/v1/o;->a:Lcom/ui/comm/v4/a$f;

    invoke-virtual {p1}, Lcom/ui/comm/v4/a$g;->g()I

    move-result p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HTTP request "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " failed with status code "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1, v0, v1}, Lcom/ui/wmw/WMWizard$Error$Session$RequestFailed;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2

    :cond_1
    new-instance v2, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Type;

    iget-object v3, p0, Lcom/ui/wmw/api/v1/o;->a:Lcom/ui/comm/v4/a$f;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Http response was expected for request "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", but "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " received"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1, v0, v1}, Lcom/ui/wmw/WMWizard$Error$Session$InvalidResponse$Type;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wmw/api/v1/o;->a(Ll9/a;)Lcom/ui/comm/v4/a$g;

    move-result-object p1

    return-object p1
.end method

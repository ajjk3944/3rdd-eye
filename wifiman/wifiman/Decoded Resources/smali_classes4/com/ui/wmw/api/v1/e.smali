.class public final synthetic Lcom/ui/wmw/api/v1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/comm/v4/a$e;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/comm/v4/a$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/wmw/api/v1/e;->a:Lcom/ui/comm/v4/a$e;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/wmw/api/v1/e;->a:Lcom/ui/comm/v4/a$e;

    invoke-static {v0}, Lcom/ui/wmw/api/v1/f;->n(Lcom/ui/comm/v4/a$e;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

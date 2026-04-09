.class public final synthetic LHd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHd/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHd/a;->a:Ljava/lang/String;

    check-cast p1, Lac/a;

    invoke-static {v0, p1}, Lcom/ui/wifiman/model/teleport/session/a;->i(Ljava/lang/String;Lac/a;)Lac/a;

    move-result-object p1

    return-object p1
.end method

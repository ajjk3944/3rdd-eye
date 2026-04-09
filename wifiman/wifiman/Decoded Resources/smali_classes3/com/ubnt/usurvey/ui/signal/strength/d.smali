.class public final synthetic Lcom/ubnt/usurvey/ui/signal/strength/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lje/r;


# direct methods
.method public synthetic constructor <init>(Lje/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ubnt/usurvey/ui/signal/strength/d;->a:Lje/r;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ubnt/usurvey/ui/signal/strength/d;->a:Lje/r;

    check-cast p1, LS8/c;

    invoke-static {v0, p1}, Lcom/ubnt/usurvey/ui/signal/strength/c$q;->a(Lje/r;LS8/c;)Lje/q;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Lw8/h;
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

    iput-object p1, p0, Lw8/h;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw8/h;->a:Ljava/lang/String;

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-static {v0, p1}, Lw8/t;->l1(Ljava/lang/String;Lcom/ubnt/usurvey/a;)Lcom/ubnt/usurvey/a;

    move-result-object p1

    return-object p1
.end method
